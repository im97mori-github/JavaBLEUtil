package org.im97mori.ble.characteristic.u2b13;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.characteristic.core.TimeExponential8Utils;
import org.junit.Test;

public class TimeExponential8Test {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = TimeExponential8Utils.TIME_EXPONENTIAL_8_ZERO_SECONDS;
        //@formatter:on

        TimeExponential8 result1 = new TimeExponential8(data);
        assertEquals(TimeExponential8Utils.TIME_EXPONENTIAL_8_ZERO_SECONDS, result1.getTimeExponential8());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) TimeExponential8Utils.TIME_EXPONENTIAL_8_TOTAL_LIFE_OF_THE_DEVICE;
        //@formatter:on

        TimeExponential8 result1 = new TimeExponential8(data);
        assertEquals(TimeExponential8Utils.TIME_EXPONENTIAL_8_TOTAL_LIFE_OF_THE_DEVICE, result1.getTimeExponential8());
    }

    @Test
    public void test_constructor_00003() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) TimeExponential8Utils.TIME_EXPONENTIAL_8_VALUE_IS_NOT_KNOWN;
        //@formatter:on

        TimeExponential8 result1 = new TimeExponential8(data);
        assertEquals(TimeExponential8Utils.TIME_EXPONENTIAL_8_VALUE_IS_NOT_KNOWN, result1.getTimeExponential8());
    }

    @Test
    public void test_constructor_00101() {
        int timeExponential8 = TimeExponential8Utils.TIME_EXPONENTIAL_8_ZERO_SECONDS;

        TimeExponential8 result1 = new TimeExponential8(timeExponential8);
        assertEquals(timeExponential8, result1.getTimeExponential8());
    }

    @Test
    public void test_constructor_00102() {
        int timeExponential8 = TimeExponential8Utils.TIME_EXPONENTIAL_8_TOTAL_LIFE_OF_THE_DEVICE;

        TimeExponential8 result1 = new TimeExponential8(timeExponential8);
        assertEquals(timeExponential8, result1.getTimeExponential8());
    }

    @Test
    public void test_constructor_00103() {
        int timeExponential8 = TimeExponential8Utils.TIME_EXPONENTIAL_8_VALUE_IS_NOT_KNOWN;

        TimeExponential8 result1 = new TimeExponential8(timeExponential8);
        assertEquals(timeExponential8, result1.getTimeExponential8());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = 0x01;
        //@formatter:on

        TimeExponential8 result1 = new TimeExponential8(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
