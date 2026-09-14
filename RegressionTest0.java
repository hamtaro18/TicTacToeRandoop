import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        model.Board board0 = new model.Board();
        java.lang.Class<?> wildcardClass1 = board0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        model.Board board0 = new model.Board();
        board0.restart();
        board0.mark((int) (short) 0, (int) '#');
        java.lang.Class<?> wildcardClass5 = board0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        model.Board board0 = new model.Board();
        board0.restart();
        java.lang.Boolean boolean2 = board0.isInProgressMode();
        java.lang.Class<?> wildcardClass3 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        model.Board board0 = new model.Board();
        board0.mark((int) (short) 10, 10);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        model.Board board0 = new model.Board();
        board0.mark((int) (byte) -1, (int) '#');
        board0.mark((int) ' ', (int) '#');
        java.lang.Boolean boolean7 = board0.isInProgressMode();
        java.lang.Boolean boolean8 = board0.isInProgressMode();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        model.Board board0 = new model.Board();
        board0.restart();
        java.lang.Boolean boolean2 = board0.isInProgressMode();
        board0.restart();
        board0.restart();
        board0.mark(0, (int) (short) -1);
        java.lang.Boolean boolean8 = board0.isInFinishedMode();
        java.lang.Boolean boolean9 = board0.isInProgressMode();
        java.lang.Class<?> wildcardClass10 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        model.Board board0 = new model.Board();
        board0.restart();
        java.lang.Boolean boolean2 = board0.isInProgressMode();
        board0.restart();
        board0.restart();
        java.lang.Boolean boolean5 = board0.isInProgressMode();
        java.lang.Boolean boolean6 = board0.isInFinishedMode();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        model.Board board0 = new model.Board();
        board0.mark((int) (byte) -1, (int) '#');
        board0.mark((int) ' ', (int) '#');
        java.lang.Boolean boolean7 = board0.isInProgressMode();
        java.lang.Class<?> wildcardClass8 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        model.Board board0 = new model.Board();
        board0.mark((int) (byte) -1, (int) '#');
        board0.mark((int) ' ', (int) '#');
        java.lang.Boolean boolean7 = board0.isInProgressMode();
        java.lang.Boolean boolean8 = board0.isInFinishedMode();
        board0.mark(10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        model.Board board0 = new model.Board();
        board0.restart();
        java.lang.Boolean boolean2 = board0.isInProgressMode();
        board0.restart();
        board0.restart();
        board0.mark(0, (int) (short) -1);
        java.lang.Boolean boolean8 = board0.isInFinishedMode();
        java.lang.Boolean boolean9 = board0.isInProgressMode();
        board0.restart();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        model.Board board0 = new model.Board();
        board0.mark((int) (byte) -1, (int) '#');
        board0.mark((int) ' ', (int) '#');
        board0.mark((int) ' ', (int) (byte) 10);
        java.lang.Boolean boolean10 = board0.isInProgressMode();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        model.Board board0 = new model.Board();
        board0.restart();
        java.lang.Boolean boolean2 = board0.isInProgressMode();
        board0.restart();
        java.lang.Boolean boolean4 = board0.isInFinishedMode();
        board0.mark((int) (byte) 10, (int) (short) 10);
        java.lang.Boolean boolean8 = board0.isInProgressMode();
        java.lang.Class<?> wildcardClass9 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        model.Board board0 = new model.Board();
        board0.mark((int) (byte) -1, (int) '#');
        java.lang.Boolean boolean4 = board0.isInProgressMode();
        board0.restart();
        java.lang.Boolean boolean6 = board0.isInFinishedMode();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        model.Board board0 = new model.Board();
        board0.mark((int) (byte) -1, (int) '#');
        board0.mark((int) (byte) -1, 10);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        model.Board board0 = new model.Board();
        board0.restart();
        java.lang.Boolean boolean2 = board0.isInProgressMode();
        board0.restart();
        board0.restart();
        board0.mark(0, (int) (short) -1);
        java.lang.Class<?> wildcardClass8 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        model.Board board0 = new model.Board();
        board0.restart();
        java.lang.Boolean boolean2 = board0.isInProgressMode();
        board0.restart();
        board0.restart();
        java.lang.Boolean boolean5 = board0.isInProgressMode();
        java.lang.Boolean boolean6 = board0.isInProgressMode();
        java.lang.Boolean boolean7 = board0.isInProgressMode();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        model.Board board0 = new model.Board();
        board0.mark((int) (byte) -1, (int) '#');
        java.lang.Boolean boolean4 = board0.isInProgressMode();
        board0.restart();
        java.lang.Class<?> wildcardClass6 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        model.Board board0 = new model.Board();
        board0.restart();
        java.lang.Boolean boolean2 = board0.isInProgressMode();
        board0.restart();
        board0.mark((int) (short) 0, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        model.Board board0 = new model.Board();
        board0.restart();
        java.lang.Boolean boolean2 = board0.isInProgressMode();
        board0.restart();
        board0.restart();
        board0.mark(0, (int) (short) -1);
        java.lang.Boolean boolean8 = board0.isInFinishedMode();
        java.lang.Class<?> wildcardClass9 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        model.Board board0 = new model.Board();
        board0.mark((int) (byte) -1, (int) '#');
        board0.mark((int) ' ', (int) '#');
        java.lang.Boolean boolean7 = board0.isInProgressMode();
        board0.restart();
        java.lang.Class<?> wildcardClass9 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        model.Board board0 = new model.Board();
        board0.restart();
        board0.mark((int) (short) 0, (int) '#');
        java.lang.Boolean boolean5 = board0.isInProgressMode();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        model.Board board0 = new model.Board();
        board0.mark((int) (byte) -1, (int) '#');
        board0.mark((int) ' ', (int) '#');
        java.lang.Boolean boolean7 = board0.isInProgressMode();
        java.lang.Boolean boolean8 = board0.isInFinishedMode();
        java.lang.Boolean boolean9 = board0.isInFinishedMode();
        board0.mark(100, 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        model.Board board0 = new model.Board();
        board0.restart();
        java.lang.Boolean boolean2 = board0.isInProgressMode();
        board0.restart();
        java.lang.Boolean boolean4 = board0.isInFinishedMode();
        board0.mark((int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        model.Board board0 = new model.Board();
        board0.restart();
        java.lang.Boolean boolean2 = board0.isInProgressMode();
        board0.restart();
        board0.restart();
        board0.restart();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        model.Board board0 = new model.Board();
        board0.mark((int) (byte) -1, (int) '#');
        java.lang.Boolean boolean4 = board0.isInFinishedMode();
        board0.restart();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        model.Board board0 = new model.Board();
        board0.restart();
        java.lang.Boolean boolean2 = board0.isInProgressMode();
        board0.restart();
        board0.restart();
        java.lang.Boolean boolean5 = board0.isInProgressMode();
        java.lang.Boolean boolean6 = board0.isInProgressMode();
        board0.mark((int) (short) 0, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        model.Board board0 = new model.Board();
        board0.mark((int) (byte) -1, (int) '#');
        board0.mark((int) ' ', (int) '#');
        java.lang.Boolean boolean7 = board0.isInFinishedMode();
        java.lang.Boolean boolean8 = board0.isInFinishedMode();
        java.lang.Boolean boolean9 = board0.isInFinishedMode();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        model.Board board0 = new model.Board();
        board0.mark((int) (byte) -1, (int) '#');
        board0.mark((int) ' ', (int) '#');
        java.lang.Boolean boolean7 = board0.isInProgressMode();
        board0.restart();
        java.lang.Boolean boolean9 = board0.isInProgressMode();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        model.Board board0 = new model.Board();
        board0.restart();
        java.lang.Boolean boolean2 = board0.isInProgressMode();
        board0.restart();
        java.lang.Boolean boolean4 = board0.isInFinishedMode();
        board0.mark((int) (byte) 10, (int) (short) 10);
        java.lang.Boolean boolean8 = board0.isInProgressMode();
        board0.mark((int) '4', (int) (byte) -1);
        board0.restart();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        model.Board board0 = new model.Board();
        board0.restart();
        java.lang.Boolean boolean2 = board0.isInProgressMode();
        board0.restart();
        board0.restart();
        java.lang.Boolean boolean5 = board0.isInFinishedMode();
        board0.restart();
        java.lang.Boolean boolean7 = board0.isInProgressMode();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        model.Board board0 = new model.Board();
        board0.mark((int) (byte) -1, (int) '#');
        board0.mark((int) ' ', (int) '#');
        board0.mark((int) ' ', (int) (byte) 10);
        board0.mark((int) (byte) -1, (int) 'a');
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        model.Board board0 = new model.Board();
        board0.mark((int) (byte) -1, (int) '#');
        board0.restart();
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        model.Board board0 = new model.Board();
        board0.mark((int) (byte) -1, (int) '#');
        board0.mark((int) ' ', (int) '#');
        java.lang.Boolean boolean7 = board0.isInProgressMode();
        board0.restart();
        board0.mark((int) (short) -1, (int) (byte) 10);
        java.lang.Boolean boolean12 = board0.isInFinishedMode();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        model.Board board0 = new model.Board();
        board0.mark((int) (byte) -1, (int) '#');
        java.lang.Boolean boolean4 = board0.isInProgressMode();
        board0.restart();
        board0.mark((int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        model.Board board0 = new model.Board();
        board0.mark((int) (byte) -1, (int) '#');
        java.lang.Boolean boolean4 = board0.isInProgressMode();
        board0.mark((int) '4', 1);
        java.lang.Boolean boolean8 = board0.isInProgressMode();
        java.lang.Class<?> wildcardClass9 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        model.Board board0 = new model.Board();
        board0.restart();
        java.lang.Boolean boolean2 = board0.isInProgressMode();
        board0.restart();
        board0.restart();
        java.lang.Boolean boolean5 = board0.isInProgressMode();
        java.lang.Class<?> wildcardClass6 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        model.Board board0 = new model.Board();
        board0.restart();
        java.lang.Boolean boolean2 = board0.isInProgressMode();
        board0.restart();
        board0.restart();
        board0.mark((int) (short) 100, (int) '#');
        java.lang.Class<?> wildcardClass8 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        model.Board board0 = new model.Board();
        board0.restart();
        java.lang.Boolean boolean2 = board0.isInProgressMode();
        java.lang.Boolean boolean3 = board0.isInFinishedMode();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        model.Board board0 = new model.Board();
        board0.mark((int) (byte) -1, (int) '#');
        board0.mark((int) ' ', (int) '#');
        java.lang.Boolean boolean7 = board0.isInProgressMode();
        java.lang.Boolean boolean8 = board0.isInFinishedMode();
        java.lang.Boolean boolean9 = board0.isInFinishedMode();
        java.lang.Class<?> wildcardClass10 = board0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        model.Board board0 = new model.Board();
        board0.restart();
        java.lang.Boolean boolean2 = board0.isInProgressMode();
        board0.restart();
        board0.restart();
        java.lang.Boolean boolean5 = board0.isInFinishedMode();
        java.lang.Boolean boolean6 = board0.isInFinishedMode();
        java.lang.Boolean boolean7 = board0.isInProgressMode();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        model.Board board0 = new model.Board();
        board0.restart();
        java.lang.Boolean boolean2 = board0.isInProgressMode();
        board0.restart();
        java.lang.Boolean boolean4 = board0.isInFinishedMode();
        java.lang.Boolean boolean5 = board0.isInProgressMode();
        board0.restart();
        board0.restart();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        model.Board board0 = new model.Board();
        board0.mark((int) (byte) -1, (int) '#');
        board0.mark((int) ' ', (int) '#');
        board0.mark((int) ' ', (int) (byte) 10);
        board0.mark((int) 'a', (int) (short) 0);
        java.lang.Boolean boolean13 = board0.isInFinishedMode();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        model.Board board0 = new model.Board();
        board0.restart();
        java.lang.Boolean boolean2 = board0.isInProgressMode();
        board0.restart();
        java.lang.Boolean boolean4 = board0.isInFinishedMode();
        board0.mark((int) (byte) 10, (int) (short) 10);
        java.lang.Boolean boolean8 = board0.isInProgressMode();
        java.lang.Boolean boolean9 = board0.isInProgressMode();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        model.Board board0 = new model.Board();
        board0.mark((int) (byte) -1, (int) '#');
        board0.mark((int) ' ', (int) '#');
        java.lang.Boolean boolean7 = board0.isInFinishedMode();
        board0.mark((int) (byte) 10, (int) (short) 1);
        board0.restart();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        model.Board board0 = new model.Board();
        board0.restart();
        java.lang.Boolean boolean2 = board0.isInProgressMode();
        board0.restart();
        board0.restart();
        board0.mark((int) (short) 100, (int) '#');
        java.lang.Boolean boolean8 = board0.isInFinishedMode();
        java.lang.Boolean boolean9 = board0.isInProgressMode();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        model.Board board0 = new model.Board();
        board0.mark((int) (byte) -1, (int) '#');
        board0.mark((int) ' ', (int) '#');
        java.lang.Boolean boolean7 = board0.isInProgressMode();
        java.lang.Boolean boolean8 = board0.isInFinishedMode();
        java.lang.Boolean boolean9 = board0.isInProgressMode();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        model.Board board0 = new model.Board();
        board0.mark((int) (byte) -1, (int) '#');
        java.lang.Boolean boolean4 = board0.isInProgressMode();
        board0.restart();
        board0.restart();
        board0.mark(0, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        model.Board board0 = new model.Board();
        board0.restart();
        java.lang.Boolean boolean2 = board0.isInProgressMode();
        board0.restart();
        board0.restart();
        board0.mark(0, (int) (short) -1);
        board0.mark((int) (short) 10, (int) 'a');
        board0.restart();
        board0.restart();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        model.Board board0 = new model.Board();
        board0.mark((int) (byte) -1, (int) '#');
        board0.mark((int) ' ', (int) '#');
        java.lang.Boolean boolean7 = board0.isInProgressMode();
        board0.mark((int) (byte) 1, (int) (short) -1);
        java.lang.Boolean boolean11 = board0.isInProgressMode();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        model.Board board0 = new model.Board();
        board0.mark((int) (byte) -1, (int) '#');
        board0.mark((int) ' ', (int) '#');
        board0.mark((int) ' ', (int) (byte) 10);
        board0.mark((int) 'a', (int) (short) 0);
        java.lang.Boolean boolean13 = board0.isInProgressMode();
        board0.mark((int) (byte) -1, (int) (byte) 1);
        java.lang.Boolean boolean17 = board0.isInFinishedMode();
        java.lang.Boolean boolean18 = board0.isInFinishedMode();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        model.Board board0 = new model.Board();
        board0.restart();
        java.lang.Boolean boolean2 = board0.isInProgressMode();
        board0.restart();
        board0.restart();
        board0.mark((int) (short) 100, (int) '#');
        java.lang.Boolean boolean8 = board0.isInFinishedMode();
        board0.restart();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        model.Board board0 = new model.Board();
        board0.mark((int) (byte) -1, (int) '#');
        board0.mark((int) ' ', (int) '#');
        java.lang.Boolean boolean7 = board0.isInProgressMode();
        board0.restart();
        java.lang.Boolean boolean9 = board0.isInFinishedMode();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        model.Board board0 = new model.Board();
        board0.restart();
        java.lang.Boolean boolean2 = board0.isInProgressMode();
        board0.restart();
        board0.restart();
        java.lang.Boolean boolean5 = board0.isInFinishedMode();
        java.lang.Boolean boolean6 = board0.isInFinishedMode();
        java.lang.Boolean boolean7 = board0.isInFinishedMode();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }
}

