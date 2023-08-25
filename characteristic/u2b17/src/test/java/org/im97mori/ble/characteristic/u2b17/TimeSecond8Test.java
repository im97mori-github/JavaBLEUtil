package org.im97mori.ble.characteristic.u2b17;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class TimeSecond8Test extends TestBase {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) TimeSecond8.TIME_SECOND_8_VALUE_IS_NOT_KNOWN;
        //@formatter:on

        TimeSecond8 result = new TimeSecond8(data);
        assertEquals(BLEUtils.createUInt8(data, 0), result.getTimeSecond8());
        assertTrue(result.isTimeSecond8ValueIsNotKnown());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) TimeSecond8.TIME_SECOND_8_VALUE_MINIMUM;
        //@formatter:on

        TimeSecond8 result = new TimeSecond8(data);
        assertEquals(BLEUtils.createUInt8(data, 0), result.getTimeSecond8());
        assertFalse(result.isTimeSecond8ValueIsNotKnown());
    }

    @Test
    public void test_constructor_00003() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) TimeSecond8.TIME_SECOND_8_VALUE_MAXIMUM;
        //@formatter:on

        TimeSecond8 result = new TimeSecond8(data);
        assertEquals(BLEUtils.createUInt8(data, 0), result.getTimeSecond8());
        assertFalse(result.isTimeSecond8ValueIsNotKnown());
    }

    @Test
    public void test_constructor_00101() {
        int energy = TimeSecond8.TIME_SECOND_8_VALUE_IS_NOT_KNOWN;

        TimeSecond8 result = new TimeSecond8(energy);
        assertEquals(energy, result.getTimeSecond8());
        assertTrue(result.isTimeSecond8ValueIsNotKnown());
    }

    @Test
    public void test_constructor_00102() {
        int energy = TimeSecond8.TIME_SECOND_8_VALUE_MINIMUM;

        TimeSecond8 result = new TimeSecond8(energy);
        assertEquals(energy, result.getTimeSecond8());
        assertFalse(result.isTimeSecond8ValueIsNotKnown());
    }

    @Test
    public void test_constructor_00103() {
        int energy = TimeSecond8.TIME_SECOND_8_VALUE_MAXIMUM;

        TimeSecond8 result = new TimeSecond8(energy);
        assertEquals(energy, result.getTimeSecond8());
        assertFalse(result.isTimeSecond8ValueIsNotKnown());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) TimeSecond8.TIME_SECOND_8_VALUE_IS_NOT_KNOWN;
        //@formatter:on

        TimeSecond8 result1 = new TimeSecond8(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00102() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) TimeSecond8.TIME_SECOND_8_VALUE_MINIMUM;
        //@formatter:on

        TimeSecond8 result1 = new TimeSecond8(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00103() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) TimeSecond8.TIME_SECOND_8_VALUE_MAXIMUM;
        //@formatter:on

        TimeSecond8 result1 = new TimeSecond8(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
