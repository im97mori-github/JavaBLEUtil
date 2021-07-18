package org.im97mori.ble.characteristic.u2b16;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.characteristic.core.TimeSecond16Utils;
import org.junit.Test;

public class TimeSecond16Test {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) TimeSecond16Utils.TIME_SECOND_16_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) (TimeSecond16Utils.TIME_SECOND_16_VALUE_IS_NOT_KNOWN >> 8);
        //@formatter:on

        TimeSecond16 result = new TimeSecond16(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getTimeSecond16());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) TimeSecond16Utils.TIME_SECOND_16_VALUE_MINIMUM;
        data[ 1] = (byte) (TimeSecond16Utils.TIME_SECOND_16_VALUE_MINIMUM >> 8);
        //@formatter:on

        TimeSecond16 result = new TimeSecond16(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getTimeSecond16());
    }

    @Test
    public void test_constructor_00003() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) TimeSecond16Utils.TIME_SECOND_16_VALUE_MAXIMUM;
        data[ 1] = (byte) (TimeSecond16Utils.TIME_SECOND_16_VALUE_MAXIMUM >> 8);
        //@formatter:on

        TimeSecond16 result = new TimeSecond16(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result.getTimeSecond16());
    }

    @Test
    public void test_constructor_00101() {
        int timeSecond16 = TimeSecond16Utils.TIME_SECOND_16_VALUE_IS_NOT_KNOWN;

        TimeSecond16 result = new TimeSecond16(timeSecond16);
        assertEquals(timeSecond16, result.getTimeSecond16());
    }

    @Test
    public void test_constructor_00102() {
        int timeSecond16 = TimeSecond16Utils.TIME_SECOND_16_VALUE_MINIMUM;

        TimeSecond16 result = new TimeSecond16(timeSecond16);
        assertEquals(timeSecond16, result.getTimeSecond16());
    }

    @Test
    public void test_constructor_00103() {
        int timeSecond16 = TimeSecond16Utils.TIME_SECOND_16_VALUE_MAXIMUM;

        TimeSecond16 result = new TimeSecond16(timeSecond16);
        assertEquals(timeSecond16, result.getTimeSecond16());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) TimeSecond16Utils.TIME_SECOND_16_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) (TimeSecond16Utils.TIME_SECOND_16_VALUE_IS_NOT_KNOWN >> 8);
        //@formatter:on

        TimeSecond16 result1 = new TimeSecond16(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00102() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) TimeSecond16Utils.TIME_SECOND_16_VALUE_MINIMUM;
        data[ 1] = (byte) (TimeSecond16Utils.TIME_SECOND_16_VALUE_MINIMUM >> 8);
        //@formatter:on

        TimeSecond16 result1 = new TimeSecond16(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00103() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) TimeSecond16Utils.TIME_SECOND_16_VALUE_MINIMUM;
        data[ 1] = (byte) (TimeSecond16Utils.TIME_SECOND_16_VALUE_MINIMUM >> 8);
        //@formatter:on

        TimeSecond16 result1 = new TimeSecond16(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
