package org.im97mori.ble.characteristic.u2b14;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.BLEUtils;
import org.junit.Test;

public class TimeHour24Test {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) TimeHour24.TIME_HOUR_24_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) (TimeHour24.TIME_HOUR_24_VALUE_IS_NOT_KNOWN >> 8);
        data[ 2] = (byte) (TimeHour24.TIME_HOUR_24_VALUE_IS_NOT_KNOWN >> 16);
        //@formatter:on

        TimeHour24 result = new TimeHour24(data);
        assertEquals(BLEUtils.createUInt24(data, 0), result.getTimeHour24());
        assertTrue(result.isTimeHour24ValueIsNotKnown());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) TimeHour24.TIME_HOUR_24_VALUE_MINIMUM;
        data[ 1] = (byte) (TimeHour24.TIME_HOUR_24_VALUE_MINIMUM >> 8);
        data[ 2] = (byte) (TimeHour24.TIME_HOUR_24_VALUE_MINIMUM >> 16);
        //@formatter:on

        TimeHour24 result = new TimeHour24(data);
        assertEquals(BLEUtils.createUInt24(data, 0), result.getTimeHour24());
        assertFalse(result.isTimeHour24ValueIsNotKnown());
    }

    @Test
    public void test_constructor_00003() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) TimeHour24.TIME_HOUR_24_VALUE_MAXIMUM;
        data[ 1] = (byte) (TimeHour24.TIME_HOUR_24_VALUE_MAXIMUM >> 8);
        data[ 2] = (byte) (TimeHour24.TIME_HOUR_24_VALUE_MAXIMUM >> 16);
        //@formatter:on

        TimeHour24 result = new TimeHour24(data);
        assertEquals(BLEUtils.createUInt24(data, 0), result.getTimeHour24());
        assertFalse(result.isTimeHour24ValueIsNotKnown());
    }

    @Test
    public void test_constructor_00101() {
        int timeHour24 = TimeHour24.TIME_HOUR_24_VALUE_IS_NOT_KNOWN;

        TimeHour24 result = new TimeHour24(timeHour24);
        assertEquals(timeHour24, result.getTimeHour24());
        assertTrue(result.isTimeHour24ValueIsNotKnown());
    }

    @Test
    public void test_constructor_00102() {
        int timeHour24 = TimeHour24.TIME_HOUR_24_VALUE_MINIMUM;

        TimeHour24 result = new TimeHour24(timeHour24);
        assertEquals(timeHour24, result.getTimeHour24());
        assertFalse(result.isTimeHour24ValueIsNotKnown());
    }

    @Test
    public void test_constructor_00103() {
        int timeHour24 = TimeHour24.TIME_HOUR_24_VALUE_MAXIMUM;

        TimeHour24 result = new TimeHour24(timeHour24);
        assertEquals(timeHour24, result.getTimeHour24());
        assertFalse(result.isTimeHour24ValueIsNotKnown());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) TimeHour24.TIME_HOUR_24_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) (TimeHour24.TIME_HOUR_24_VALUE_IS_NOT_KNOWN >> 8);
        data[ 2] = (byte) (TimeHour24.TIME_HOUR_24_VALUE_IS_NOT_KNOWN >> 16);
        //@formatter:on

        TimeHour24 result1 = new TimeHour24(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00102() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) TimeHour24.TIME_HOUR_24_VALUE_MINIMUM;
        data[ 1] = (byte) (TimeHour24.TIME_HOUR_24_VALUE_MINIMUM >> 8);
        data[ 2] = (byte) (TimeHour24.TIME_HOUR_24_VALUE_MINIMUM >> 16);
        //@formatter:on

        TimeHour24 result1 = new TimeHour24(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00103() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) TimeHour24.TIME_HOUR_24_VALUE_MAXIMUM;
        data[ 1] = (byte) (TimeHour24.TIME_HOUR_24_VALUE_MAXIMUM >> 8);
        data[ 2] = (byte) (TimeHour24.TIME_HOUR_24_VALUE_MAXIMUM >> 16);
        //@formatter:on

        TimeHour24 result1 = new TimeHour24(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
