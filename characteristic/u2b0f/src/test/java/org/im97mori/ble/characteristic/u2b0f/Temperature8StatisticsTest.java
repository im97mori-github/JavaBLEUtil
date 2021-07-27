package org.im97mori.ble.characteristic.u2b0f;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.characteristic.core.Temperature8Utils;
import org.im97mori.ble.characteristic.core.TimeExponential8Utils;
import org.junit.Test;

public class Temperature8StatisticsTest {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[5];
        data[ 0] = (byte) Temperature8Utils.TEMPERATURE_8_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) Temperature8Utils.TEMPERATURE_8_VALUE_IS_NOT_KNOWN;
        data[ 2] = (byte) Temperature8Utils.TEMPERATURE_8_VALUE_IS_NOT_KNOWN;
        data[ 3] = (byte) Temperature8Utils.TEMPERATURE_8_VALUE_IS_NOT_KNOWN;
        data[ 4] = (byte) TimeExponential8Utils.TIME_EXPONENTIAL_8_VALUE_IS_NOT_KNOWN;
        //@formatter:on

        Temperature8Statistics result = new Temperature8Statistics(data);
        assertEquals(BLEUtils.createSInt8(data, 0), result.getAverage());
        assertEquals(BLEUtils.createSInt8(data, 1), result.getStandardDeviationValue());
        assertEquals(BLEUtils.createSInt8(data, 2), result.getMinimumValue());
        assertEquals(BLEUtils.createSInt8(data, 3), result.getMaximumValue());
        assertEquals(BLEUtils.createUInt8(data, 4), result.getSensingDuration());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[5];
        data[ 0] = -128;
        data[ 1] = -128;
        data[ 2] = -128;
        data[ 3] = -128;
        data[ 4] = (byte) TimeExponential8Utils.TIME_EXPONENTIAL_8_TOTAL_LIFE_OF_THE_DEVICE;
        //@formatter:on

        Temperature8Statistics result = new Temperature8Statistics(data);
        assertEquals(BLEUtils.createSInt8(data, 0), result.getAverage());
        assertEquals(BLEUtils.createSInt8(data, 1), result.getStandardDeviationValue());
        assertEquals(BLEUtils.createSInt8(data, 2), result.getMinimumValue());
        assertEquals(BLEUtils.createSInt8(data, 3), result.getMaximumValue());
        assertEquals(BLEUtils.createUInt8(data, 4), result.getSensingDuration());
    }

    @Test
    public void test_constructor_00003() {
        //@formatter:off
        byte[] data = new byte[5];
        data[ 0] = 126;
        data[ 1] = 126;
        data[ 2] = 126;
        data[ 3] = 126;
        data[ 4] = TimeExponential8Utils.TIME_EXPONENTIAL_8_ZERO_SECONDS;
        //@formatter:on

        Temperature8Statistics result = new Temperature8Statistics(data);
        assertEquals(BLEUtils.createSInt8(data, 0), result.getAverage());
        assertEquals(BLEUtils.createSInt8(data, 1), result.getStandardDeviationValue());
        assertEquals(BLEUtils.createSInt8(data, 2), result.getMinimumValue());
        assertEquals(BLEUtils.createSInt8(data, 3), result.getMaximumValue());
        assertEquals(BLEUtils.createUInt8(data, 4), result.getSensingDuration());
    }

    @Test
    public void test_constructor_00004() {
        //@formatter:off
        byte[] data = new byte[5];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = (byte) 253;
        //@formatter:on

        Temperature8Statistics result = new Temperature8Statistics(data);
        assertEquals(BLEUtils.createSInt8(data, 0), result.getAverage());
        assertEquals(BLEUtils.createSInt8(data, 1), result.getStandardDeviationValue());
        assertEquals(BLEUtils.createSInt8(data, 2), result.getMinimumValue());
        assertEquals(BLEUtils.createSInt8(data, 3), result.getMaximumValue());
        assertEquals(BLEUtils.createUInt8(data, 4), result.getSensingDuration());
    }

    @Test
    public void test_constructor_00005() {
        //@formatter:off
        byte[] data = new byte[5];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        //@formatter:on

        Temperature8Statistics result = new Temperature8Statistics(data);
        assertEquals(BLEUtils.createSInt8(data, 0), result.getAverage());
        assertEquals(BLEUtils.createSInt8(data, 1), result.getStandardDeviationValue());
        assertEquals(BLEUtils.createSInt8(data, 2), result.getMinimumValue());
        assertEquals(BLEUtils.createSInt8(data, 3), result.getMaximumValue());
        assertEquals(BLEUtils.createUInt8(data, 4), result.getSensingDuration());
    }

    @Test
    public void test_constructor_00101() {
        int average = Temperature8Utils.TEMPERATURE_8_VALUE_IS_NOT_KNOWN;
        int standardDeviationValue = Temperature8Utils.TEMPERATURE_8_VALUE_IS_NOT_KNOWN;
        int minimumValue = Temperature8Utils.TEMPERATURE_8_VALUE_IS_NOT_KNOWN;
        int maximumValue = Temperature8Utils.TEMPERATURE_8_VALUE_IS_NOT_KNOWN;
        int sensingDuration = TimeExponential8Utils.TIME_EXPONENTIAL_8_VALUE_IS_NOT_KNOWN;

        Temperature8Statistics result = new Temperature8Statistics(average, standardDeviationValue, minimumValue, maximumValue, sensingDuration);
        assertEquals(average, result.getAverage());
        assertEquals(standardDeviationValue, result.getStandardDeviationValue());
        assertEquals(minimumValue, result.getMinimumValue());
        assertEquals(maximumValue, result.getMaximumValue());
        assertEquals(sensingDuration, result.getSensingDuration());
    }

    @Test
    public void test_constructor_00102() {
        int average = -128;
        int standardDeviationValue = -128;
        int minimumValue = -128;
        int maximumValue = -128;
        int sensingDuration = TimeExponential8Utils.TIME_EXPONENTIAL_8_TOTAL_LIFE_OF_THE_DEVICE;

        Temperature8Statistics result = new Temperature8Statistics(average, standardDeviationValue, minimumValue, maximumValue, sensingDuration);
        assertEquals(average, result.getAverage());
        assertEquals(standardDeviationValue, result.getStandardDeviationValue());
        assertEquals(minimumValue, result.getMinimumValue());
        assertEquals(maximumValue, result.getMaximumValue());
        assertEquals(sensingDuration, result.getSensingDuration());
    }

    @Test
    public void test_constructor_00103() {
        int average = 126;
        int standardDeviationValue = 126;
        int minimumValue = 126;
        int maximumValue = 126;
        int sensingDuration = TimeExponential8Utils.TIME_EXPONENTIAL_8_ZERO_SECONDS;

        Temperature8Statistics result = new Temperature8Statistics(average, standardDeviationValue, minimumValue, maximumValue, sensingDuration);
        assertEquals(average, result.getAverage());
        assertEquals(standardDeviationValue, result.getStandardDeviationValue());
        assertEquals(minimumValue, result.getMinimumValue());
        assertEquals(maximumValue, result.getMaximumValue());
        assertEquals(sensingDuration, result.getSensingDuration());
    }

    @Test
    public void test_constructor_00104() {
        int average = 1;
        int standardDeviationValue = 2;
        int minimumValue = 3;
        int maximumValue = 4;
        int sensingDuration = 253;

        Temperature8Statistics result = new Temperature8Statistics(average, standardDeviationValue, minimumValue, maximumValue, sensingDuration);
        assertEquals(average, result.getAverage());
        assertEquals(standardDeviationValue, result.getStandardDeviationValue());
        assertEquals(minimumValue, result.getMinimumValue());
        assertEquals(maximumValue, result.getMaximumValue());
        assertEquals(sensingDuration, result.getSensingDuration());
    }

    @Test
    public void test_constructor_00105() {
        int average = 1;
        int standardDeviationValue = 2;
        int minimumValue = 3;
        int maximumValue = 4;
        int sensingDuration = 5;

        Temperature8Statistics result = new Temperature8Statistics(average, standardDeviationValue, minimumValue, maximumValue, sensingDuration);
        assertEquals(average, result.getAverage());
        assertEquals(standardDeviationValue, result.getStandardDeviationValue());
        assertEquals(minimumValue, result.getMinimumValue());
        assertEquals(maximumValue, result.getMaximumValue());
        assertEquals(sensingDuration, result.getSensingDuration());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[5];
        data[ 0] = (byte) Temperature8Utils.TEMPERATURE_8_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) Temperature8Utils.TEMPERATURE_8_VALUE_IS_NOT_KNOWN;
        data[ 2] = (byte) Temperature8Utils.TEMPERATURE_8_VALUE_IS_NOT_KNOWN;
        data[ 3] = (byte) Temperature8Utils.TEMPERATURE_8_VALUE_IS_NOT_KNOWN;
        data[ 4] = (byte) TimeExponential8Utils.TIME_EXPONENTIAL_8_VALUE_IS_NOT_KNOWN;
        //@formatter:on

        Temperature8Statistics result1 = new Temperature8Statistics(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00102() {
        //@formatter:off
        byte[] data = new byte[5];
        data[ 0] = -128;
        data[ 1] = -128;
        data[ 2] = -128;
        data[ 3] = -128;
        data[ 4] = (byte) TimeExponential8Utils.TIME_EXPONENTIAL_8_TOTAL_LIFE_OF_THE_DEVICE;
        //@formatter:on

        Temperature8Statistics result1 = new Temperature8Statistics(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00103() {
        //@formatter:off
        byte[] data = new byte[5];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = (byte) 253;
        //@formatter:on

        Temperature8Statistics result1 = new Temperature8Statistics(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00104() {
        //@formatter:off
        byte[] data = new byte[5];
        data[ 0] = (byte) Temperature8Utils.TEMPERATURE_8_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) Temperature8Utils.TEMPERATURE_8_VALUE_IS_NOT_KNOWN;
        data[ 2] = (byte) Temperature8Utils.TEMPERATURE_8_VALUE_IS_NOT_KNOWN;
        data[ 3] = (byte) Temperature8Utils.TEMPERATURE_8_VALUE_IS_NOT_KNOWN;
        data[ 4] = (byte) TimeExponential8Utils.TIME_EXPONENTIAL_8_VALUE_IS_NOT_KNOWN;
        //@formatter:on

        Temperature8Statistics result1 = new Temperature8Statistics(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00105() {
        //@formatter:off
        byte[] data = new byte[5];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        //@formatter:on

        Temperature8Statistics result1 = new Temperature8Statistics(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
