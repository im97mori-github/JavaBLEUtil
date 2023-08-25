package org.im97mori.ble.characteristic.u2b0c;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.characteristic.core.Percentage8Utils;
import org.im97mori.ble.characteristic.core.TemperatureUtils;
import org.im97mori.ble.characteristic.core.TimeDecihour8Utils;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class RelativeValueInATemperatureRangeTest extends TestBase {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) Percentage8Utils.PERCENTAGE_8_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) TemperatureUtils.TEMPERATURE_VALUE_IS_NOT_KNOWN;
        data[ 2] = (byte) TemperatureUtils.TEMPERATURE_VALUE_IS_NOT_KNOWN;
        //@formatter:on

        RelativeValueInATemperatureRange result = new RelativeValueInATemperatureRange(data);
        assertEquals(BLEUtils.createUInt8(data, 0), result.getRelativeValue());
        assertEquals(BLEUtils.createUInt8(data, 1), result.getMinimumTemperatureValue());
        assertEquals(BLEUtils.createUInt8(data, 2), result.getMaximumTemperatureValue());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = 0x00;
        data[ 1] = (byte) -27315;
        data[ 2] = (byte) (-27315 >> 8);
        //@formatter:on

        RelativeValueInATemperatureRange result = new RelativeValueInATemperatureRange(data);
        assertEquals(BLEUtils.createUInt8(data, 0), result.getRelativeValue());
        assertEquals(BLEUtils.createUInt8(data, 1), result.getMinimumTemperatureValue());
        assertEquals(BLEUtils.createUInt8(data, 2), result.getMaximumTemperatureValue());
    }

    @Test
    public void test_constructor_00003() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) 200;
        data[ 1] = (byte) 32767;
        data[ 2] = (byte) (32767 >> 8);
        //@formatter:on

        RelativeValueInATemperatureRange result = new RelativeValueInATemperatureRange(data);
        assertEquals(BLEUtils.createUInt8(data, 0), result.getRelativeValue());
        assertEquals(BLEUtils.createUInt8(data, 1), result.getMinimumTemperatureValue());
        assertEquals(BLEUtils.createUInt8(data, 2), result.getMaximumTemperatureValue());
    }

    @Test
    public void test_constructor_00004() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        //@formatter:on

        RelativeValueInATemperatureRange result = new RelativeValueInATemperatureRange(data);
        assertEquals(BLEUtils.createUInt8(data, 0), result.getRelativeValue());
        assertEquals(BLEUtils.createUInt8(data, 1), result.getMinimumTemperatureValue());
        assertEquals(BLEUtils.createUInt8(data, 2), result.getMaximumTemperatureValue());
    }

    @Test
    public void test_constructor_00101() {
        int relativeValue = Percentage8Utils.PERCENTAGE_8_VALUE_IS_NOT_KNOWN;
        int minimumTemperatureValue = TimeDecihour8Utils.TIME_DECIHOUR_8_VALUE_IS_NOT_KNOWN;
        int maximumTemperatureValue = TimeDecihour8Utils.TIME_DECIHOUR_8_VALUE_IS_NOT_KNOWN;

        RelativeValueInATemperatureRange result = new RelativeValueInATemperatureRange(relativeValue, minimumTemperatureValue, maximumTemperatureValue);
        assertEquals(relativeValue, result.getRelativeValue());
        assertEquals(minimumTemperatureValue, result.getMinimumTemperatureValue());
        assertEquals(maximumTemperatureValue, result.getMaximumTemperatureValue());
    }

    @Test
    public void test_constructor_00102() {
        int relativeValue = 0;
        int minimumTemperatureValue = -27315;
        int maximumTemperatureValue = -27315;

        RelativeValueInATemperatureRange result = new RelativeValueInATemperatureRange(relativeValue, minimumTemperatureValue, maximumTemperatureValue);
        assertEquals(relativeValue, result.getRelativeValue());
        assertEquals(minimumTemperatureValue, result.getMinimumTemperatureValue());
        assertEquals(maximumTemperatureValue, result.getMaximumTemperatureValue());
    }

    @Test
    public void test_constructor_00103() {
        int relativeValue = 200;
        int minimumTemperatureValue = 32767;
        int maximumTemperatureValue = 32767;

        RelativeValueInATemperatureRange result = new RelativeValueInATemperatureRange(relativeValue, minimumTemperatureValue, maximumTemperatureValue);
        assertEquals(relativeValue, result.getRelativeValue());
        assertEquals(minimumTemperatureValue, result.getMinimumTemperatureValue());
        assertEquals(maximumTemperatureValue, result.getMaximumTemperatureValue());
    }

    @Test
    public void test_constructor_00104() {
        int relativeValue = 1;
        int minimumTemperatureValue = 2;
        int maximumTemperatureValue = 3;

        RelativeValueInATemperatureRange result = new RelativeValueInATemperatureRange(relativeValue, minimumTemperatureValue, maximumTemperatureValue);
        assertEquals(relativeValue, result.getRelativeValue());
        assertEquals(minimumTemperatureValue, result.getMinimumTemperatureValue());
        assertEquals(maximumTemperatureValue, result.getMaximumTemperatureValue());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) Percentage8Utils.PERCENTAGE_8_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) TemperatureUtils.TEMPERATURE_VALUE_IS_NOT_KNOWN;
        data[ 2] = (byte) TemperatureUtils.TEMPERATURE_VALUE_IS_NOT_KNOWN;
        //@formatter:on

        RelativeValueInATemperatureRange result1 = new RelativeValueInATemperatureRange(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00102() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = 0x00;
        data[ 1] = (byte) -27315;
        data[ 2] = (byte) (-27315 >> 8);
        //@formatter:on

        RelativeValueInATemperatureRange result1 = new RelativeValueInATemperatureRange(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00103() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) 200;
        data[ 1] = (byte) 32767;
        data[ 2] = (byte) (32767 >> 8);
        //@formatter:on

        RelativeValueInATemperatureRange result1 = new RelativeValueInATemperatureRange(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00104() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        //@formatter:on

        RelativeValueInATemperatureRange result1 = new RelativeValueInATemperatureRange(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
