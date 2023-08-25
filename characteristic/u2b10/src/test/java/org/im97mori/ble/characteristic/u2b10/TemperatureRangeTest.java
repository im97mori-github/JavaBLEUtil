package org.im97mori.ble.characteristic.u2b10;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.characteristic.core.TemperatureUtils;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class TemperatureRangeTest extends TestBase {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) TemperatureUtils.TEMPERATURE_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) (TemperatureUtils.TEMPERATURE_VALUE_IS_NOT_KNOWN >> 8);
        data[ 2] = (byte) TemperatureUtils.TEMPERATURE_VALUE_IS_NOT_KNOWN;
        data[ 3] = (byte) (TemperatureUtils.TEMPERATURE_VALUE_IS_NOT_KNOWN >> 8);
        //@formatter:on

        TemperatureRange result = new TemperatureRange(data);
        assertEquals(BLEUtils.createSInt16(data, 0), result.getMinimumTemperature());
        assertEquals(BLEUtils.createSInt16(data, 2), result.getMaximumTemperature());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) -27315;
        data[ 1] = (byte) (-27315 >> 8);
        data[ 2] = (byte) -27315;
        data[ 3] = (byte) (-27315 >> 8);
        //@formatter:on

        TemperatureRange result = new TemperatureRange(data);
        assertEquals(BLEUtils.createSInt16(data, 0), result.getMinimumTemperature());
        assertEquals(BLEUtils.createSInt16(data, 2), result.getMaximumTemperature());
    }

    @Test
    public void test_constructor_00003() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) 32767;
        data[ 1] = (byte) (32767 >> 8);
        data[ 2] = (byte) 32767;
        data[ 3] = (byte) (32767 >> 8);
        //@formatter:on

        TemperatureRange result = new TemperatureRange(data);
        assertEquals(BLEUtils.createSInt16(data, 0), result.getMinimumTemperature());
        assertEquals(BLEUtils.createSInt16(data, 2), result.getMaximumTemperature());
    }

    @Test
    public void test_constructor_00004() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        //@formatter:on

        TemperatureRange result = new TemperatureRange(data);
        assertEquals(BLEUtils.createSInt16(data, 0), result.getMinimumTemperature());
        assertEquals(BLEUtils.createSInt16(data, 2), result.getMaximumTemperature());
    }

    @Test
    public void test_constructor_00101() {
        int minimumTemperature = TemperatureUtils.TEMPERATURE_VALUE_IS_NOT_KNOWN;
        int maximumTemperature = TemperatureUtils.TEMPERATURE_VALUE_IS_NOT_KNOWN;

        TemperatureRange result = new TemperatureRange(minimumTemperature, maximumTemperature);
        assertEquals(minimumTemperature, result.getMinimumTemperature());
        assertEquals(maximumTemperature, result.getMaximumTemperature());
    }

    @Test
    public void test_constructor_00102() {
        int minimumTemperature = -27315;
        int maximumTemperature = -27315;

        TemperatureRange result = new TemperatureRange(minimumTemperature, maximumTemperature);
        assertEquals(minimumTemperature, result.getMinimumTemperature());
        assertEquals(maximumTemperature, result.getMaximumTemperature());
    }

    @Test
    public void test_constructor_00103() {
        int minimumTemperature = 32767;
        int maximumTemperature = 32767;

        TemperatureRange result = new TemperatureRange(minimumTemperature, maximumTemperature);
        assertEquals(minimumTemperature, result.getMinimumTemperature());
        assertEquals(maximumTemperature, result.getMaximumTemperature());
    }

    @Test
    public void test_constructor_00104() {
        int minimumTemperature = 1;
        int maximumTemperature = 2;

        TemperatureRange result = new TemperatureRange(minimumTemperature, maximumTemperature);
        assertEquals(minimumTemperature, result.getMinimumTemperature());
        assertEquals(maximumTemperature, result.getMaximumTemperature());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) TemperatureUtils.TEMPERATURE_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) (TemperatureUtils.TEMPERATURE_VALUE_IS_NOT_KNOWN >> 8);
        data[ 2] = (byte) TemperatureUtils.TEMPERATURE_VALUE_IS_NOT_KNOWN;
        data[ 3] = (byte) (TemperatureUtils.TEMPERATURE_VALUE_IS_NOT_KNOWN >> 8);
        //@formatter:on

        TemperatureRange result1 = new TemperatureRange(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00102() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) -27315;
        data[ 1] = (byte) (-27315 >> 8);
        data[ 2] = (byte) -27315;
        data[ 3] = (byte) (-27315 >> 8);
        //@formatter:on

        TemperatureRange result1 = new TemperatureRange(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00103() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) 32767;
        data[ 1] = (byte) (32767 >> 8);
        data[ 2] = (byte) 32767;
        data[ 3] = (byte) (32767 >> 8);
        //@formatter:on

        TemperatureRange result1 = new TemperatureRange(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00104() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        //@formatter:on

        TemperatureRange result1 = new TemperatureRange(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
