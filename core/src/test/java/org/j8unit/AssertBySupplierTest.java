package org.j8unit;

import org.junit.Test;

@SuppressWarnings("deprecation")
public class AssertBySupplierTest {

    private String someExpensiveMessageCreation() {
        // do some very expensive message creation ...
        final String msg = "Damn, test failed!";
        // ... and return the result
        return msg;
    }

    @Test
    public void test_assertArrayEquals_boolean_success()
    throws Exception {
        final boolean[] array = new boolean[] { true, false };
        Assert.assertArrayEquals(() -> someExpensiveMessageCreation(), array, array);
    }

    @Test(expected = AssertionError.class)
    public void test_assertArrayEquals_boolean_failure()
    throws Exception {
        final boolean[] array = new boolean[] { true, false };
        Assert.assertArrayEquals(() -> someExpensiveMessageCreation(), array, new boolean[] {});
    }

    @Test
    public void test_assertArrayEquals_byte_success()
    throws Exception {
        final byte[] array = new byte[] { 0, 1 };
        Assert.assertArrayEquals(() -> someExpensiveMessageCreation(), array, array);
    }

    @Test(expected = AssertionError.class)
    public void test_assertArrayEquals_byte_failure()
    throws Exception {
        final byte[] array = new byte[] { 0, 1 };
        Assert.assertArrayEquals(() -> someExpensiveMessageCreation(), array, new byte[] {});
    }

    @Test
    public void test_assertArrayEquals_char_success()
    throws Exception {
        final char[] array = new char[] { 0, 1 };
        Assert.assertArrayEquals(() -> someExpensiveMessageCreation(), array, array);
    }

    @Test(expected = AssertionError.class)
    public void test_assertArrayEquals_char_failure()
    throws Exception {
        final char[] array = new char[] { 0, 1 };
        Assert.assertArrayEquals(() -> someExpensiveMessageCreation(), array, new char[] {});
    }

    @Test
    public void test_assertArrayEquals_double_success()
    throws Exception {
        final double[] array = new double[] { 0.0d, 1.0d };
        Assert.assertArrayEquals(() -> someExpensiveMessageCreation(), array, array, 0.0d);
    }

    @Test(expected = AssertionError.class)
    public void test_assertArrayEquals_double_failure()
    throws Exception {
        final double[] array = new double[] { 0.0d, 1.0d };
        Assert.assertArrayEquals(() -> someExpensiveMessageCreation(), array, new double[] {}, 0.0d);
    }

    @Test
    public void test_assertArrayEquals_float_success()
    throws Exception {
        final float[] array = new float[] { 0.0f, 1.0f };
        Assert.assertArrayEquals(() -> someExpensiveMessageCreation(), array, array, 0.0f);
    }

    @Test(expected = AssertionError.class)
    public void test_assertArrayEquals_float_failure()
    throws Exception {
        final float[] array = new float[] { 0.0f, 1.0f };
        Assert.assertArrayEquals(() -> someExpensiveMessageCreation(), array, new float[] {}, 0.0f);
    }

    @Test
    public void test_assertArrayEquals_int_success()
    throws Exception {
        final int[] array = new int[] { 0, 1 };
        Assert.assertArrayEquals(() -> someExpensiveMessageCreation(), array, array);
    }

    @Test(expected = AssertionError.class)
    public void test_assertArrayEquals_int_failure()
    throws Exception {
        final int[] array = new int[] { 0, 1 };
        Assert.assertArrayEquals(() -> someExpensiveMessageCreation(), array, new int[] {});
    }

    @Test
    public void test_assertArrayEquals_long_success()
    throws Exception {
        final long[] array = new long[] { 0l, 1l };
        Assert.assertArrayEquals(() -> someExpensiveMessageCreation(), array, array);
    }

    @Test(expected = AssertionError.class)
    public void test_assertArrayEquals_long_failure()
    throws Exception {
        final long[] array = new long[] { 0l, 1l };
        Assert.assertArrayEquals(() -> someExpensiveMessageCreation(), array, new long[] {});
    }

    @Test
    public void test_assertArrayEquals_Object_success()
    throws Exception {
        final Object[] array = new Object[] { "hello", "world" };
        Assert.assertArrayEquals(() -> someExpensiveMessageCreation(), array, array);
    }

    @Test(expected = AssertionError.class)
    public void test_assertArrayEquals_Object_failure()
    throws Exception {
        final Object[] array = new Object[] { "hello", "world" };
        Assert.assertArrayEquals(() -> someExpensiveMessageCreation(), array, new Object[] {});
    }

    @Test
    public void test_assertArrayEquals_short_success()
    throws Exception {
        final short[] array = new short[] { 0, 1 };
        Assert.assertArrayEquals(() -> someExpensiveMessageCreation(), array, array);
    }

    @Test(expected = AssertionError.class)
    public void test_assertArrayEquals_short_failure()
    throws Exception {
        final short[] array = new short[] { 0, 1 };
        Assert.assertArrayEquals(() -> someExpensiveMessageCreation(), array, new short[] {});
    }

    @Test(expected = AssertionError.class)
    public void test_assertEquals_double()
    throws Exception {
        Assert.assertEquals(() -> someExpensiveMessageCreation(), 0.0d, 0.0d);
    }

    @Test
    public void test_assertEquals_double_success()
    throws Exception {
        Assert.assertEquals(() -> someExpensiveMessageCreation(), 0.0d, 0.0d, 0.0d);
    }

    @Test(expected = AssertionError.class)
    public void test_assertEquals_double_failure()
    throws Exception {
        Assert.assertEquals(() -> someExpensiveMessageCreation(), 0.0d, 1.0d, 0.0d);
    }

    @Test(expected = AssertionError.class)
    public void test_assertEquals_float()
    throws Exception {
        Assert.assertEquals(() -> someExpensiveMessageCreation(), 0.0f, 0.0f);
    }

    @Test
    public void test_assertEquals_float_success()
    throws Exception {
        Assert.assertEquals(() -> someExpensiveMessageCreation(), 0.0f, 0.0f, 0.0f);
    }

    @Test(expected = AssertionError.class)
    public void test_assertEquals_float_failure()
    throws Exception {
        Assert.assertEquals(() -> someExpensiveMessageCreation(), 0.0f, 1.0f, 0.0f);
    }

    @Test
    public void test_assertEquals_long_success()
    throws Exception {
        Assert.assertEquals(() -> someExpensiveMessageCreation(), 0l, 0l);
    }

    @Test(expected = AssertionError.class)
    public void test_assertEquals_long_failure()
    throws Exception {
        Assert.assertEquals(() -> someExpensiveMessageCreation(), 0l, 1l);
    }

    @Test
    public void test_assertEquals_Object_success()
    throws Exception {
        Assert.assertEquals(() -> someExpensiveMessageCreation(), "hello", "hello");
    }

    @Test(expected = AssertionError.class)
    public void test_assertEquals_Object_failure()
    throws Exception {
        Assert.assertEquals(() -> someExpensiveMessageCreation(), "hello", "world");
    }

    @Test
    public void test_assertEquals_ObjectArray_success()
    throws Exception {
        final Object[] array = new Object[] { "hello", "world" };
        Assert.assertEquals(() -> someExpensiveMessageCreation(), array, array);
    }

    @Test(expected = AssertionError.class)
    public void test_assertEquals_ObjectArray_failure()
    throws Exception {
        final Object[] array = new Object[] { "hello", "world" };
        Assert.assertEquals(() -> someExpensiveMessageCreation(), array, new Object[] {});
    }

    @Test
    public void test_assertFalse_success()
    throws Exception {
        Assert.assertFalse(() -> someExpensiveMessageCreation(), false);
    }

    @Test(expected = AssertionError.class)
    public void test_assertFalse_failure()
    throws Exception {
        Assert.assertFalse(() -> someExpensiveMessageCreation(), true);
    }

    @Test(expected = AssertionError.class)
    public void test_assertNotEquals_double()
    throws Exception {
        Assert.assertNotEquals(() -> someExpensiveMessageCreation(), 0.0d, 0.0d);
    }

    @Test
    public void test_assertNotEquals_double_success()
    throws Exception {
        Assert.assertNotEquals(() -> someExpensiveMessageCreation(), 0.0d, 1.0d, 0.0d);
    }

    @Test(expected = AssertionError.class)
    public void test_assertNotEquals_double_failure()
    throws Exception {
        Assert.assertNotEquals(() -> someExpensiveMessageCreation(), 0.0d, 0.0d, 0.0d);
    }

    @Test(expected = AssertionError.class)
    public void test_assertNotEquals_float()
    throws Exception {
        Assert.assertNotEquals(() -> someExpensiveMessageCreation(), 0.0f, 0.0f);
    }

    @Test
    public void test_assertNotEquals_float_success()
    throws Exception {
        Assert.assertNotEquals(() -> someExpensiveMessageCreation(), 0.0f, 1.0f, 0.0f);
    }

    @Test(expected = AssertionError.class)
    public void test_assertNotEquals_float_failure()
    throws Exception {
        Assert.assertNotEquals(() -> someExpensiveMessageCreation(), 0.0f, 0.0f, 0.0f);
    }

    @Test
    public void test_assertNotEquals_long_success()
    throws Exception {
        Assert.assertNotEquals(() -> someExpensiveMessageCreation(), 0l, 1l);
    }

    @Test(expected = AssertionError.class)
    public void test_assertNotEquals_long_failure()
    throws Exception {
        Assert.assertNotEquals(() -> someExpensiveMessageCreation(), 0l, 0l);
    }

    @Test
    public void test_assertNotEquals_Object_success()
    throws Exception {
        Assert.assertNotEquals(() -> someExpensiveMessageCreation(), "hello", "world");
    }

    @Test(expected = AssertionError.class)
    public void test_assertNotEquals_Object_failure()
    throws Exception {
        Assert.assertNotEquals(() -> someExpensiveMessageCreation(), "hello", "hello");
    }

    @Test
    public void test_assertNotNull_success()
    throws Exception {
        Assert.assertNotNull(() -> someExpensiveMessageCreation(), "hello");
    }

    @Test(expected = AssertionError.class)
    public void test_assertNotNull_failure()
    throws Exception {
        Assert.assertNotNull(() -> someExpensiveMessageCreation(), null);
    }

    @Test
    public void test_assertNotSame_success()
    throws Exception {
        Assert.assertNotSame(() -> someExpensiveMessageCreation(), "hello", "world");
    }

    @Test(expected = AssertionError.class)
    public void test_assertNotSame_failure()
    throws Exception {
        Assert.assertNotSame(() -> someExpensiveMessageCreation(), "hello", "hello");
    }

    @Test
    public void test_assertNull_success()
    throws Exception {
        Assert.assertNull(() -> someExpensiveMessageCreation(), null);
    }

    @Test(expected = AssertionError.class)
    public void test_assertNull_failure()
    throws Exception {
        Assert.assertNull(() -> someExpensiveMessageCreation(), "hello");
    }

    @Test
    public void test_assertSame_success()
    throws Exception {
        Assert.assertSame(() -> someExpensiveMessageCreation(), "hello", "hello");
    }

    @Test(expected = AssertionError.class)
    public void test_assertSame_failure()
    throws Exception {
        Assert.assertSame(() -> someExpensiveMessageCreation(), "hello", "world");
    }

    @Test
    public void test_assertTrue_success()
    throws Exception {
        Assert.assertTrue(() -> someExpensiveMessageCreation(), true);
    }

    @Test(expected = AssertionError.class)
    public void test_assertTrue_failure()
    throws Exception {
        Assert.assertTrue(() -> someExpensiveMessageCreation(), false);
    }

}