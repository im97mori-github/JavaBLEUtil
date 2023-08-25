package org.im97mori.ble.characteristic.u2a12;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class TimeAccuracyTest extends TestBase {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) TimeAccuracy.ACCURACY_OUT_OF_RANGE;
        //@formatter:on

        TimeAccuracy result1 = new TimeAccuracy(data);
        assertEquals(TimeAccuracy.ACCURACY_OUT_OF_RANGE, result1.getAccuracy());
        assertTrue(result1.isAccuracyOutOfRange());
        assertFalse(result1.isAccuracyUnknown());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) TimeAccuracy.ACCURACY_UNKNOWN;
        //@formatter:on

        TimeAccuracy result1 = new TimeAccuracy(data);
        assertEquals(TimeAccuracy.ACCURACY_UNKNOWN, result1.getAccuracy());
        assertFalse(result1.isAccuracyOutOfRange());
        assertTrue(result1.isAccuracyUnknown());
    }

    @Test
    public void test_constructor_00003() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = 0;
        //@formatter:on

        TimeAccuracy result1 = new TimeAccuracy(data);
        assertEquals(0, result1.getAccuracy());
        assertFalse(result1.isAccuracyOutOfRange());
        assertFalse(result1.isAccuracyUnknown());
        assertEquals(0 * TimeAccuracy.ACCURACY_UNIT, result1.getAccuracyMillis());
    }

    @Test
    public void test_constructor_00004() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) 253;
        //@formatter:on

        TimeAccuracy result1 = new TimeAccuracy(data);
        assertEquals(253, result1.getAccuracy());
        assertFalse(result1.isAccuracyOutOfRange());
        assertFalse(result1.isAccuracyUnknown());
        assertEquals(253 * TimeAccuracy.ACCURACY_UNIT, result1.getAccuracyMillis());
    }

    @Test
    public void test_constructor_00101() {
        int accuracy = 1;

        TimeAccuracy result1 = new TimeAccuracy(accuracy);
        assertEquals(accuracy, result1.getAccuracy());
    }

    @Test
    public void test_parcelable_00100() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = 0x01;
        //@formatter:on

        TimeAccuracy result1 = new TimeAccuracy(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
