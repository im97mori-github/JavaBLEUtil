package org.im97mori.ble.characteristic.u2b0d;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.characteristic.core.Temperature8Utils;
import org.junit.Test;

public class Temperature8Test {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) Temperature8Utils.TEMPERATURE_8_VALUE_IS_NOT_KNOWN;
        //@formatter:on

        Temperature8 result = new Temperature8(data);
        assertEquals(BLEUtils.createSInt8(data, 0), result.getTemperature8());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = -128;
        //@formatter:on

        Temperature8 result = new Temperature8(data);
        assertEquals(BLEUtils.createSInt8(data, 0), result.getTemperature8());
    }

    @Test
    public void test_constructor_00003() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = 126;
        //@formatter:on

        Temperature8 result = new Temperature8(data);
        assertEquals(BLEUtils.createSInt8(data, 0), result.getTemperature8());
    }

    @Test
    public void test_constructor_00101() {
        int temperature8 = Temperature8Utils.TEMPERATURE_8_VALUE_IS_NOT_KNOWN;

        Temperature8 result = new Temperature8(temperature8);
        assertEquals(temperature8, result.getTemperature8());
    }

    @Test
    public void test_constructor_00102() {
        int temperature8 = -128;

        Temperature8 result = new Temperature8(temperature8);
        assertEquals(temperature8, result.getTemperature8());
    }

    @Test
    public void test_constructor_00103() {
        int temperature8 = 126;

        Temperature8 result = new Temperature8(temperature8);
        assertEquals(temperature8, result.getTemperature8());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = (byte) Temperature8Utils.TEMPERATURE_8_VALUE_IS_NOT_KNOWN;
        //@formatter:on

        Temperature8 result1 = new Temperature8(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00102() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = -128;
        //@formatter:on

        Temperature8 result1 = new Temperature8(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00103() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = 126;
        //@formatter:on

        Temperature8 result1 = new Temperature8(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
