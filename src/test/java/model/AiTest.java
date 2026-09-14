package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * AI-generated unit tests for {@link Board}.
 *
 * Notes on package placement:
 * - Player is package-private, and Board's getState()/GameState type is a private
 *   nested enum, so this class MUST live in package "model" and must rely on the
 *   public boolean helpers (isInProgressMode() / isInFinishedMode()) rather than
 *   referencing Board.GameState directly (that type is not accessible outside Board).
 */
class BoardAITest {

    private Board board;

    @BeforeEach
    void setUp() {
        board = new Board();
    }

    // ---------- Initial state ----------

    @Test
    void newBoard_startsInProgress() {
        assertTrue(board.isInProgressMode());
        assertFalse(board.isInFinishedMode());
    }

    @Test
    void newBoard_currentTurnIsX() {
        assertEquals(Player.X, board.getCurrentTurn());
    }

    @Test
    void newBoard_hasNoWinner() {
        assertNull(board.getWinner());
    }

    // ---------- Basic marking / turn alternation ----------

    @Test
    void mark_setsCellAndFlipsTurnWhenNoWin() {
        board.mark(0, 0); // X plays, no win yet
        assertEquals(Player.O, board.getCurrentTurn());
        assertTrue(board.isInProgressMode());
        assertNull(board.getWinner());
    }

    @Test
    void mark_alternatesTurnsAcrossMultipleMoves() {
        board.mark(0, 0); // X -> O
        assertEquals(Player.O, board.getCurrentTurn());
        board.mark(1, 1); // O -> X
        assertEquals(Player.X, board.getCurrentTurn());
        board.mark(0, 1); // X -> O
        assertEquals(Player.O, board.getCurrentTurn());
    }

    // ---------- Invalid moves / no-ops ----------

    @Test
    void mark_outOfBoundsNegativeRow_isNoOp() {
        board.mark(-1, 0);
        assertEquals(Player.X, board.getCurrentTurn());
        assertTrue(board.isInProgressMode());
        assertNull(board.getWinner());
    }

    @Test
    void mark_outOfBoundsNegativeCol_isNoOp() {
        board.mark(0, -1);
        assertEquals(Player.X, board.getCurrentTurn());
    }

    @Test
    void mark_outOfBoundsRowTooLarge_isNoOp() {
        board.mark(3, 0);
        assertEquals(Player.X, board.getCurrentTurn());
    }

    @Test
    void mark_outOfBoundsColTooLarge_isNoOp() {
        board.mark(0, 3);
        assertEquals(Player.X, board.getCurrentTurn());
    }

    @Test
    void mark_onAlreadyOccupiedCell_isNoOp() {
        board.mark(0, 0); // X takes (0,0), turn -> O
        board.mark(0, 0); // O attempts same cell, should be ignored
        assertEquals(Player.O, board.getCurrentTurn(), "Turn should not flip on a rejected move");
    }

    @Test
    void mark_afterGameFinished_isNoOp() {
        // X wins top row: (0,0) X, (1,0) O, (0,1) X, (1,1) O, (0,2) X -> X wins
        board.mark(0, 0);
        board.mark(1, 0);
        board.mark(0, 1);
        board.mark(1, 1);
        board.mark(0, 2);

        assertTrue(board.isInFinishedMode());
        assertEquals(Player.X, board.getWinner());

        // Further moves should be no-ops
        board.mark(2, 2);
        assertTrue(board.isInFinishedMode());
        assertEquals(Player.X, board.getWinner());
        assertEquals(Player.X, board.getCurrentTurn(), "currentTurn is untouched once game is finished");
    }

    // ---------- Winning conditions ----------

    @Test
    void mark_winByRow() {
        board.mark(0, 0); // X
        board.mark(1, 0); // O
        board.mark(0, 1); // X
        board.mark(1, 1); // O
        board.mark(0, 2); // X wins row 0

        assertTrue(board.isInFinishedMode());
        assertEquals(Player.X, board.getWinner());
    }

    @Test
    void mark_winByColumn() {
        board.mark(0, 0); // X
        board.mark(0, 1); // O
        board.mark(1, 0); // X
        board.mark(1, 1); // O
        board.mark(2, 0); // X wins column 0

        assertTrue(board.isInFinishedMode());
        assertEquals(Player.X, board.getWinner());
    }

    @Test
    void mark_winByMainDiagonal() {
        board.mark(0, 0); // X
        board.mark(0, 1); // O
        board.mark(1, 1); // X
        board.mark(0, 2); // O
        board.mark(2, 2); // X wins main diagonal

        assertTrue(board.isInFinishedMode());
        assertEquals(Player.X, board.getWinner());
    }

    @Test
    void mark_winByAntiDiagonal() {
        board.mark(0, 2); // X
        board.mark(0, 0); // O
        board.mark(1, 1); // X
        board.mark(0, 1); // O
        board.mark(2, 0); // X wins anti-diagonal

        assertTrue(board.isInFinishedMode());
        assertEquals(Player.X, board.getWinner());
    }

    @Test
    void mark_winForPlayerO() {
        board.mark(0, 0); // X
        board.mark(1, 0); // O
        board.mark(0, 1); // X
        board.mark(1, 1); // O
        board.mark(2, 2); // X (no win)
        board.mark(1, 2); // O wins row 1

        assertTrue(board.isInFinishedMode());
        assertEquals(Player.O, board.getWinner());
    }

    // ---------- Draw scenario (documents current behavior: no draw detection) ----------

    @Test
    void mark_fullBoardWithNoWinner_staysInProgress() {
        // Final layout (verified no 3-in-a-row at any intermediate step either):
        // X O X
        // X O O
        // O X X
        board.mark(0, 0); // X
        board.mark(0, 1); // O
        board.mark(0, 2); // X
        board.mark(1, 1); // O
        board.mark(1, 0); // X
        board.mark(1, 2); // O
        board.mark(2, 1); // X
        board.mark(2, 0); // O
        board.mark(2, 2); // X

        assertNull(board.getWinner());
        // Board never explicitly detects a draw, so it remains "in progress".
        assertTrue(board.isInProgressMode());
    }

    // ---------- restart() ----------

    @Test
    void restart_resetsBoardAfterMoves() {
        board.mark(0, 0);
        board.mark(1, 1);
        board.restart();

        assertTrue(board.isInProgressMode());
        assertEquals(Player.X, board.getCurrentTurn());
        assertNull(board.getWinner());

        // Cells should be cleared: (0,0) should be markable again
        board.mark(0, 0);
        assertEquals(Player.O, board.getCurrentTurn());
    }

    @Test
    void restart_resetsBoardAfterWin() {
        board.mark(0, 0); // X
        board.mark(1, 0); // O
        board.mark(0, 1); // X
        board.mark(1, 1); // O
        board.mark(0, 2); // X wins

        assertTrue(board.isInFinishedMode());

        board.restart();

        assertTrue(board.isInProgressMode());
        assertFalse(board.isInFinishedMode());
        assertNull(board.getWinner());
        assertEquals(Player.X, board.getCurrentTurn());
    }

    // ---------- getCurrentTurn() / setCurrentTurn() ----------

    @Test
    void setCurrentTurn_overridesWhoPlaysNext() {
        board.setCurrentTurn(Player.O);
        assertEquals(Player.O, board.getCurrentTurn());

        board.mark(0, 0); // O plays this move
        assertEquals(Player.X, board.getCurrentTurn());
    }
}