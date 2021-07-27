package org.im97mori.ble.characteristic.u2b11;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.characteristic.core.TemperatureUtils;
import org.im97mori.ble.characteristic.core.TimeExponential8Utils;
import org.junit.Test;

public class TemperatureStatisticsTest {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[9];
        data[ 0] = (byte) TemperatureUtils.TEMPERATURE_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) (TemperatureUtils.TEMPERATURE_VALUE_IS_NOT_KNOWN >> 8);
        data[ 2] = (byte) TemperatureUtils.TEMPERATURE_VALUE_IS_NOT_KNOWN;
        data[ 3] = (byte) (TemperatureUtils.TEMPERATURE_VALUE_IS_NOT_KNOWN >> 8);
        data[ 4] = (byte) TemperatureUtils.TEMPERATURE_VALUE_IS_NOT_KNOWN;
        data[ 5] = (byte) (TemperatureUtils.TEMPERATURE_VALUE_IS_NOT_KNOWN >> 8);
        data[ 6] = (byte) TemperatureUtils.TEMPERATURE_VALUE_IS_NOT_KNOWN;
        data[ 7] = (byte) (TemperatureUtils.TEMPERATURE_VALUE_IS_NOT_KNOWN >> 8);
        data[ 8] = (byte) TimeExponential8Utils.TIME_EXPONENTIAL_8_VALUE_IS_NOT_KNOWN;
        //@formatter:on

        TemperatureStatistics result = new TemperatureStatistics(data);
        assertEquals(BLEUtils.createSInt16(data, 0), result.getAverageTemperature());
        assertEquals(BLEUtils.createSInt16(data, 2), result.getStandardDeviationTemperature());
        assertEquals(BLEUtils.createSInt16(data, 4), result.getMinimumTemperature());
        assertEquals(BLEUtils.createSInt16(data, 6), result.getMaximumTemperature());
        assertEquals(BLEUtils.createUInt8(data, 8), result.getSensingDuration());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[9];
        data[ 0] = (byte) -27315;
        data[ 1] = (byte) (-27315 >> 8);
        data[ 2] = (byte) -27315;
        data[ 3] = (byte) (-27315 >> 8);
        data[ 4] = (byte) -27315;
        data[ 5] = (byte) (-27315 >> 8);
        data[ 6] = (byte) -27315;
        data[ 7] = (byte) (-27315 >> 8);
        data[ 8] = (byte) TimeExponential8Utils.TIME_EXPONENTIAL_8_TOTAL_LIFE_OF_THE_DEVICE;
        //@formatter:on

        TemperatureStatistics result = new TemperatureStatistics(data);
        assertEquals(BLEUtils.createSInt16(data, 0), result.getAverageTemperature());
        assertEquals(BLEUtils.createSInt16(data, 2), result.getStandardDeviationTemperature());
        assertEquals(BLEUtils.createSInt16(data, 4), result.getMinimumTemperature());
        assertEquals(BLEUtils.createSInt16(data, 6), result.getMaximumTemperature());
        assertEquals(BLEUtils.createUInt8(data, 8), result.getSensingDuration());
    }

    @Test
    public void test_constructor_00003() {
        //@formatter:off
        byte[] data = new byte[9];
        data[ 0] = (byte) 32767;
        data[ 1] = (byte) (32767 >> 8);
        data[ 2] = (byte) 32767;
        data[ 3] = (byte) (32767 >> 8);
        data[ 4] = (byte) 32767;
        data[ 5] = (byte) (32767 >> 8);
        data[ 6] = (byte) 32767;
        data[ 7] = (byte) (32767 >> 8);
        data[ 8] = (byte) TimeExponential8Utils.TIME_EXPONENTIAL_8_ZERO_SECONDS;
        //@formatter:on

        TemperatureStatistics result = new TemperatureStatistics(data);
        assertEquals(BLEUtils.createSInt16(data, 0), result.getAverageTemperature());
        assertEquals(BLEUtils.createSInt16(data, 2), result.getStandardDeviationTemperature());
        assertEquals(BLEUtils.createSInt16(data, 4), result.getMinimumTemperature());
        assertEquals(BLEUtils.createSInt16(data, 6), result.getMaximumTemperature());
        assertEquals(BLEUtils.createUInt8(data, 8), result.getSensingDuration());
    }

    @Test
    public void test_constructor_00004() {
        //@formatter:off
        byte[] data = new byte[9];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        data[ 5] = 0x06;
        data[ 6] = 0x07;
        data[ 7] = 0x08;
        data[ 8] = (byte) 253;
        //@formatter:on

        TemperatureStatistics result = new TemperatureStatistics(data);
        assertEquals(BLEUtils.createSInt16(data, 0), result.getAverageTemperature());
        assertEquals(BLEUtils.createSInt16(data, 2), result.getStandardDeviationTemperature());
        assertEquals(BLEUtils.createSInt16(data, 4), result.getMinimumTemperature());
        assertEquals(BLEUtils.createSInt16(data, 6), result.getMaximumTemperature());
        assertEquals(BLEUtils.createUInt8(data, 8), result.getSensingDuration());
    }

    @Test
    public void test_constructor_00005() {
        //@formatter:off
        byte[] data = new byte[9];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        data[ 5] = 0x06;
        data[ 6] = 0x07;
        data[ 7] = 0x08;
        data[ 8] = 0x09;
        //@formatter:on

        TemperatureStatistics result = new TemperatureStatistics(data);
        assertEquals(BLEUtils.createSInt16(data, 0), result.getAverageTemperature());
        assertEquals(BLEUtils.createSInt16(data, 2), result.getStandardDeviationTemperature());
        assertEquals(BLEUtils.createSInt16(data, 4), result.getMinimumTemperature());
        assertEquals(BLEUtils.createSInt16(data, 6), result.getMaximumTemperature());
        assertEquals(BLEUtils.createUInt8(data, 8), result.getSensingDuration());
    }

    @Test
    public void test_constructor_00101() {
        int averageTemperature = TemperatureUtils.TEMPERATURE_VALUE_IS_NOT_KNOWN;
        int standardDeviationTemperature = TemperatureUtils.TEMPERATURE_VALUE_IS_NOT_KNOWN;
        int minimumTemperature = TemperatureUtils.TEMPERATURE_VALUE_IS_NOT_KNOWN;
        int maximumTemperature = TemperatureUtils.TEMPERATURE_VALUE_IS_NOT_KNOWN;
        int sensingDuration = TimeExponential8Utils.TIME_EXPONENTIAL_8_VALUE_IS_NOT_KNOWN;

        TemperatureStatistics result = new TemperatureStatistics(averageTemperature, standardDeviationTemperature, minimumTemperature, maximumTemperature, sensingDuration);
        assertEquals(averageTemperature, result.getAverageTemperature());
        assertEquals(standardDeviationTemperature, result.getStandardDeviationTemperature());
        assertEquals(minimumTemperature, result.getMinimumTemperature());
        assertEquals(maximumTemperature, result.getMaximumTemperature());
        assertEquals(sensingDuration, result.getSensingDuration());
    }

    @Test
    public void test_constructor_00102() {
        int averageTemperature = -27315;
        int standardDeviationTemperature = -27315;
        int minimumTemperature = -27315;
        int maximumTemperature = -27315;
        int sensingDuration = TimeExponential8Utils.TIME_EXPONENTIAL_8_TOTAL_LIFE_OF_THE_DEVICE;

        TemperatureStatistics result = new TemperatureStatistics(averageTemperature, standardDeviationTemperature, minimumTemperature, maximumTemperature, sensingDuration);
        assertEquals(averageTemperature, result.getAverageTemperature());
        assertEquals(standardDeviationTemperature, result.getStandardDeviationTemperature());
        assertEquals(minimumTemperature, result.getMinimumTemperature());
        assertEquals(maximumTemperature, result.getMaximumTemperature());
        assertEquals(sensingDuration, result.getSensingDuration());
    }

    @Test
    public void test_constructor_00103() {
        int averageTemperature = 32767;
        int standardDeviationTemperature = 32767;
        int minimumTemperature = 32767;
        int maximumTemperature = 32767;
        int sensingDuration = TimeExponential8Utils.TIME_EXPONENTIAL_8_ZERO_SECONDS;

        TemperatureStatistics result = new TemperatureStatistics(averageTemperature, standardDeviationTemperature, minimumTemperature, maximumTemperature, sensingDuration);
        assertEquals(averageTemperature, result.getAverageTemperature());
        assertEquals(standardDeviationTemperature, result.getStandardDeviationTemperature());
        assertEquals(minimumTemperature, result.getMinimumTemperature());
        assertEquals(maximumTemperature, result.getMaximumTemperature());
        assertEquals(sensingDuration, result.getSensingDuration());
    }

    @Test
    public void test_constructor_00104() {
        int averageTemperature = 1;
        int standardDeviationTemperature = 2;
        int minimumTemperature = 3;
        int maximumTemperature = 4;
        int sensingDuration = 253;

        TemperatureStatistics result = new TemperatureStatistics(averageTemperature, standardDeviationTemperature, minimumTemperature, maximumTemperature, sensingDuration);
        assertEquals(averageTemperature, result.getAverageTemperature());
        assertEquals(standardDeviationTemperature, result.getStandardDeviationTemperature());
        assertEquals(minimumTemperature, result.getMinimumTemperature());
        assertEquals(maximumTemperature, result.getMaximumTemperature());
        assertEquals(sensingDuration, result.getSensingDuration());
    }

    @Test
    public void test_constructor_00105() {
        int averageTemperature = 1;
        int standardDeviationTemperature = 2;
        int minimumTemperature = 3;
        int maximumTemperature = 4;
        int sensingDuration = 5;

        TemperatureStatistics result = new TemperatureStatistics(averageTemperature, standardDeviationTemperature, minimumTemperature, maximumTemperature, sensingDuration);
        assertEquals(averageTemperature, result.getAverageTemperature());
        assertEquals(standardDeviationTemperature, result.getStandardDeviationTemperature());
        assertEquals(minimumTemperature, result.getMinimumTemperature());
        assertEquals(maximumTemperature, result.getMaximumTemperature());
        assertEquals(sensingDuration, result.getSensingDuration());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[9];
        data[ 0] = (byte) TemperatureUtils.TEMPERATURE_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) (TemperatureUtils.TEMPERATURE_VALUE_IS_NOT_KNOWN >> 8);
        data[ 2] = (byte) TemperatureUtils.TEMPERATURE_VALUE_IS_NOT_KNOWN;
        data[ 3] = (byte) (TemperatureUtils.TEMPERATURE_VALUE_IS_NOT_KNOWN >> 8);
        data[ 4] = (byte) TemperatureUtils.TEMPERATURE_VALUE_IS_NOT_KNOWN;
        data[ 5] = (byte) (TemperatureUtils.TEMPERATURE_VALUE_IS_NOT_KNOWN >> 8);
        data[ 6] = (byte) TemperatureUtils.TEMPERATURE_VALUE_IS_NOT_KNOWN;
        data[ 7] = (byte) (TemperatureUtils.TEMPERATURE_VALUE_IS_NOT_KNOWN >> 8);
        data[ 8] = (byte) TimeExponential8Utils.TIME_EXPONENTIAL_8_VALUE_IS_NOT_KNOWN;
        //@formatter:on

        TemperatureStatistics result1 = new TemperatureStatistics(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00102() {
        //@formatter:off
        byte[] data = new byte[9];
        data[ 0] = (byte) -27315;
        data[ 1] = (byte) (-27315 >> 8);
        data[ 2] = (byte) -27315;
        data[ 3] = (byte) (-27315 >> 8);
        data[ 4] = (byte) -27315;
        data[ 5] = (byte) (-27315 >> 8);
        data[ 6] = (byte) -27315;
        data[ 7] = (byte) (-27315 >> 8);
        data[ 8] = (byte) TimeExponential8Utils.TIME_EXPONENTIAL_8_TOTAL_LIFE_OF_THE_DEVICE;
        //@formatter:on

        TemperatureStatistics result1 = new TemperatureStatistics(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00103() {
        //@formatter:off
        byte[] data = new byte[9];
        data[ 0] = (byte) 32767;
        data[ 1] = (byte) (32767 >> 8);
        data[ 2] = (byte) 32767;
        data[ 3] = (byte) (32767 >> 8);
        data[ 4] = (byte) 32767;
        data[ 5] = (byte) (32767 >> 8);
        data[ 6] = (byte) 32767;
        data[ 7] = (byte) (32767 >> 8);
        data[ 8] = (byte) TimeExponential8Utils.TIME_EXPONENTIAL_8_ZERO_SECONDS;
        //@formatter:on

        TemperatureStatistics result1 = new TemperatureStatistics(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00104() {
        //@formatter:off
        byte[] data = new byte[9];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        data[ 5] = 0x06;
        data[ 6] = 0x07;
        data[ 7] = 0x08;
        data[ 8] = (byte) 253;
        //@formatter:on

        TemperatureStatistics result1 = new TemperatureStatistics(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00105() {
        //@formatter:off
        byte[] data = new byte[9];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        data[ 5] = 0x06;
        data[ 6] = 0x07;
        data[ 7] = 0x08;
        data[ 8] = 0x09;
        //@formatter:on

        TemperatureStatistics result1 = new TemperatureStatistics(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
