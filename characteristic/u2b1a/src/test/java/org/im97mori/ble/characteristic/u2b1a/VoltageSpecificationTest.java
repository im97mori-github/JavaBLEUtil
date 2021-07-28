package org.im97mori.ble.characteristic.u2b1a;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.characteristic.core.TimeExponential8Utils;
import org.im97mori.ble.characteristic.core.VoltageUtils;
import org.junit.Test;

public class VoltageSpecificationTest {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[9];
        data[ 0] = (byte) VoltageUtils.VOLTAGE_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) (VoltageUtils.VOLTAGE_VALUE_IS_NOT_KNOWN >> 8);
        data[ 2] = (byte) VoltageUtils.VOLTAGE_VALUE_IS_NOT_KNOWN;
        data[ 3] = (byte) (VoltageUtils.VOLTAGE_VALUE_IS_NOT_KNOWN >> 8);
        data[ 4] = (byte) VoltageUtils.VOLTAGE_VALUE_IS_NOT_KNOWN;
        data[ 5] = (byte) (VoltageUtils.VOLTAGE_VALUE_IS_NOT_KNOWN >> 8);
        data[ 6] = (byte) VoltageUtils.VOLTAGE_VALUE_IS_NOT_KNOWN;
        data[ 7] = (byte) (VoltageUtils.VOLTAGE_VALUE_IS_NOT_KNOWN >> 8);
        data[ 8] = (byte) TimeExponential8Utils.TIME_EXPONENTIAL_8_VALUE_IS_NOT_KNOWN;
        //@formatter:on

        VoltageStatistics result1 = new VoltageStatistics(data);
        assertEquals(VoltageUtils.VOLTAGE_VALUE_IS_NOT_KNOWN, result1.getAverageVoltageValue());
        assertEquals(VoltageUtils.VOLTAGE_VALUE_IS_NOT_KNOWN, result1.getStandardDeviationVoltageValue());
        assertEquals(VoltageUtils.VOLTAGE_VALUE_IS_NOT_KNOWN, result1.getMinimumVoltageValue());
        assertEquals(VoltageUtils.VOLTAGE_VALUE_IS_NOT_KNOWN, result1.getMaximumVoltageValue());
        assertEquals(TimeExponential8Utils.TIME_EXPONENTIAL_8_VALUE_IS_NOT_KNOWN, result1.getSensingDuration());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[9];
        data[ 0] = 0;
        data[ 1] = 0;
        data[ 2] = 0;
        data[ 3] = 0;
        data[ 4] = 0;
        data[ 5] = 0;
        data[ 6] = 0;
        data[ 7] = 0;
        data[ 8] = (byte) TimeExponential8Utils.TIME_EXPONENTIAL_8_TOTAL_LIFE_OF_THE_DEVICE;
        //@formatter:on

        VoltageStatistics result1 = new VoltageStatistics(data);
        assertEquals(0, result1.getAverageVoltageValue());
        assertEquals(0, result1.getStandardDeviationVoltageValue());
        assertEquals(0, result1.getMinimumVoltageValue());
        assertEquals(0, result1.getMaximumVoltageValue());
        assertEquals(TimeExponential8Utils.TIME_EXPONENTIAL_8_TOTAL_LIFE_OF_THE_DEVICE, result1.getSensingDuration());
    }

    @Test
    public void test_constructor_00003() {
        //@formatter:off
        byte[] data = new byte[9];
        data[ 0] = (byte) 65408;
        data[ 1] = (byte) (65408 >> 8);
        data[ 2] = (byte) 65408;
        data[ 3] = (byte) (65408 >> 8);
        data[ 4] = (byte) 65408;
        data[ 5] = (byte) (65408 >> 8);
        data[ 6] = (byte) 65408;
        data[ 7] = (byte) (65408 >> 8);
        data[ 8] = TimeExponential8Utils.TIME_EXPONENTIAL_8_ZERO_SECONDS;
        //@formatter:on

        VoltageStatistics result1 = new VoltageStatistics(data);
        assertEquals(65408, result1.getAverageVoltageValue());
        assertEquals(65408, result1.getStandardDeviationVoltageValue());
        assertEquals(65408, result1.getMinimumVoltageValue());
        assertEquals(65408, result1.getMaximumVoltageValue());
        assertEquals(TimeExponential8Utils.TIME_EXPONENTIAL_8_ZERO_SECONDS, result1.getSensingDuration());
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
        data[ 6] = (byte) 253;
        //@formatter:on

        VoltageStatistics result1 = new VoltageStatistics(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result1.getAverageVoltageValue());
        assertEquals(BLEUtils.createUInt16(data, 2), result1.getStandardDeviationVoltageValue());
        assertEquals(BLEUtils.createUInt16(data, 4), result1.getMinimumVoltageValue());
        assertEquals(BLEUtils.createUInt16(data, 6), result1.getMaximumVoltageValue());
        assertEquals(BLEUtils.createUInt8(data, 8), result1.getSensingDuration());
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
        data[ 6] = 0x09;
        //@formatter:on

        VoltageStatistics result1 = new VoltageStatistics(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result1.getAverageVoltageValue());
        assertEquals(BLEUtils.createUInt16(data, 2), result1.getStandardDeviationVoltageValue());
        assertEquals(BLEUtils.createUInt16(data, 4), result1.getMinimumVoltageValue());
        assertEquals(BLEUtils.createUInt16(data, 6), result1.getMaximumVoltageValue());
        assertEquals(BLEUtils.createUInt8(data, 8), result1.getSensingDuration());
    }

    @Test
    public void test_constructor_00101() {
        int averageVoltageValue = VoltageUtils.VOLTAGE_VALUE_IS_NOT_KNOWN;
        int standardDeviationVoltageValue = VoltageUtils.VOLTAGE_VALUE_IS_NOT_KNOWN;
        int minimumVoltageValue = VoltageUtils.VOLTAGE_VALUE_IS_NOT_KNOWN;
        int maximumVoltageValue = VoltageUtils.VOLTAGE_VALUE_IS_NOT_KNOWN;
        int sensingDuration = VoltageUtils.VOLTAGE_VALUE_IS_NOT_KNOWN;

        VoltageStatistics result1 = new VoltageStatistics(averageVoltageValue, standardDeviationVoltageValue, minimumVoltageValue, maximumVoltageValue, sensingDuration);
        assertEquals(averageVoltageValue, result1.getAverageVoltageValue());
        assertEquals(standardDeviationVoltageValue, result1.getStandardDeviationVoltageValue());
        assertEquals(minimumVoltageValue, result1.getMinimumVoltageValue());
        assertEquals(maximumVoltageValue, result1.getMaximumVoltageValue());
        assertEquals(sensingDuration, result1.getSensingDuration());
    }

    @Test
    public void test_constructor_00102() {
        int averageVoltageValue = 0;
        int standardDeviationVoltageValue = 0;
        int minimumVoltageValue = 0;
        int maximumVoltageValue = 0;
        int sensingDuration = TimeExponential8Utils.TIME_EXPONENTIAL_8_TOTAL_LIFE_OF_THE_DEVICE;

        VoltageStatistics result1 = new VoltageStatistics(averageVoltageValue, standardDeviationVoltageValue, minimumVoltageValue, maximumVoltageValue, sensingDuration);
        assertEquals(averageVoltageValue, result1.getAverageVoltageValue());
        assertEquals(standardDeviationVoltageValue, result1.getStandardDeviationVoltageValue());
        assertEquals(minimumVoltageValue, result1.getMinimumVoltageValue());
        assertEquals(maximumVoltageValue, result1.getMaximumVoltageValue());
        assertEquals(sensingDuration, result1.getSensingDuration());
    }

    @Test
    public void test_constructor_00103() {
        int averageVoltageValue = 65408;
        int standardDeviationVoltageValue = 65408;
        int minimumVoltageValue = 65408;
        int maximumVoltageValue = 65408;
        int sensingDuration = TimeExponential8Utils.TIME_EXPONENTIAL_8_ZERO_SECONDS;

        VoltageStatistics result1 = new VoltageStatistics(averageVoltageValue, standardDeviationVoltageValue, minimumVoltageValue, maximumVoltageValue, sensingDuration);
        assertEquals(averageVoltageValue, result1.getAverageVoltageValue());
        assertEquals(standardDeviationVoltageValue, result1.getStandardDeviationVoltageValue());
        assertEquals(minimumVoltageValue, result1.getMinimumVoltageValue());
        assertEquals(maximumVoltageValue, result1.getMaximumVoltageValue());
        assertEquals(sensingDuration, result1.getSensingDuration());
    }

    @Test
    public void test_constructor_00104() {
        int averageVoltageValue = 1;
        int standardDeviationVoltageValue = 2;
        int minimumVoltageValue = 3;
        int maximumVoltageValue = 4;
        int sensingDuration = 253;

        VoltageStatistics result1 = new VoltageStatistics(averageVoltageValue, standardDeviationVoltageValue, minimumVoltageValue, maximumVoltageValue, sensingDuration);
        assertEquals(averageVoltageValue, result1.getAverageVoltageValue());
        assertEquals(standardDeviationVoltageValue, result1.getStandardDeviationVoltageValue());
        assertEquals(minimumVoltageValue, result1.getMinimumVoltageValue());
        assertEquals(maximumVoltageValue, result1.getMaximumVoltageValue());
        assertEquals(sensingDuration, result1.getSensingDuration());
    }

    @Test
    public void test_constructor_00105() {
        int averageVoltageValue = 1;
        int standardDeviationVoltageValue = 2;
        int minimumVoltageValue = 3;
        int maximumVoltageValue = 4;
        int sensingDuration = 5;

        VoltageStatistics result1 = new VoltageStatistics(averageVoltageValue, standardDeviationVoltageValue, minimumVoltageValue, maximumVoltageValue, sensingDuration);
        assertEquals(averageVoltageValue, result1.getAverageVoltageValue());
        assertEquals(standardDeviationVoltageValue, result1.getStandardDeviationVoltageValue());
        assertEquals(minimumVoltageValue, result1.getMinimumVoltageValue());
        assertEquals(maximumVoltageValue, result1.getMaximumVoltageValue());
        assertEquals(sensingDuration, result1.getSensingDuration());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[9];
        data[ 0] = (byte) VoltageUtils.VOLTAGE_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) (VoltageUtils.VOLTAGE_VALUE_IS_NOT_KNOWN >> 8);
        data[ 2] = (byte) VoltageUtils.VOLTAGE_VALUE_IS_NOT_KNOWN;
        data[ 3] = (byte) (VoltageUtils.VOLTAGE_VALUE_IS_NOT_KNOWN >> 8);
        data[ 4] = (byte) VoltageUtils.VOLTAGE_VALUE_IS_NOT_KNOWN;
        data[ 5] = (byte) (VoltageUtils.VOLTAGE_VALUE_IS_NOT_KNOWN >> 8);
        data[ 6] = (byte) VoltageUtils.VOLTAGE_VALUE_IS_NOT_KNOWN;
        data[ 7] = (byte) (VoltageUtils.VOLTAGE_VALUE_IS_NOT_KNOWN >> 8);
        data[ 8] = (byte) TimeExponential8Utils.TIME_EXPONENTIAL_8_VALUE_IS_NOT_KNOWN;
        //@formatter:on

        VoltageStatistics result1 = new VoltageStatistics(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00102() {
        //@formatter:off
        byte[] data = new byte[9];
        data[ 0] = 0;
        data[ 1] = 0;
        data[ 2] = 0;
        data[ 3] = 0;
        data[ 4] = 0;
        data[ 5] = 0;
        data[ 6] = 0;
        data[ 7] = 0;
        data[ 8] = (byte) TimeExponential8Utils.TIME_EXPONENTIAL_8_TOTAL_LIFE_OF_THE_DEVICE;
        //@formatter:on

        VoltageStatistics result1 = new VoltageStatistics(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00103() {
        //@formatter:off
        byte[] data = new byte[9];
        data[ 0] = (byte) 65408;
        data[ 1] = (byte) (65408 >> 8);
        data[ 2] = (byte) 65408;
        data[ 3] = (byte) (65408 >> 8);
        data[ 4] = (byte) 65408;
        data[ 5] = (byte) (65408 >> 8);
        data[ 6] = (byte) 65408;
        data[ 7] = (byte) (65408 >> 8);
        data[ 6] = TimeExponential8Utils.TIME_EXPONENTIAL_8_ZERO_SECONDS;
        //@formatter:on

        VoltageStatistics result1 = new VoltageStatistics(data);
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
        data[ 6] = (byte) 253;
        //@formatter:on

        VoltageStatistics result1 = new VoltageStatistics(data);
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
        data[ 6] = 0x09;
        //@formatter:on

        VoltageStatistics result1 = new VoltageStatistics(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
