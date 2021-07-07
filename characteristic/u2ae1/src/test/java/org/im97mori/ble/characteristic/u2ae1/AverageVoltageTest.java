package org.im97mori.ble.characteristic.u2ae1;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.characteristic.core.TimeExponential8Utils;
import org.im97mori.ble.characteristic.core.VoltageUtils;
import org.junit.Test;

public class AverageVoltageTest {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = (byte) VoltageUtils.VOLTAGE_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) (VoltageUtils.VOLTAGE_VALUE_IS_NOT_KNOWN >> 8);
        data[ 2] = TimeExponential8Utils.TIME_EXPONENTIAL_8_ZERO_SECONDS;
        //@formatter:on

        AverageVoltage result1 = new AverageVoltage(data);
        assertEquals(VoltageUtils.VOLTAGE_VALUE_IS_NOT_KNOWN, result1.getVoltageValue());
        assertEquals(TimeExponential8Utils.TIME_EXPONENTIAL_8_ZERO_SECONDS, result1.getSensingDuration());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = (byte) TimeExponential8Utils.TIME_EXPONENTIAL_8_TOTAL_LIFE_OF_THE_DEVICE;
        //@formatter:on

        AverageVoltage result1 = new AverageVoltage(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result1.getVoltageValue());
        assertEquals(TimeExponential8Utils.TIME_EXPONENTIAL_8_TOTAL_LIFE_OF_THE_DEVICE, result1.getSensingDuration());
    }

    @Test
    public void test_constructor_00003() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = (byte) TimeExponential8Utils.TIME_EXPONENTIAL_8_VALUE_IS_NOT_KNOWN;
        //@formatter:on

        AverageVoltage result1 = new AverageVoltage(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result1.getVoltageValue());
        assertEquals(TimeExponential8Utils.TIME_EXPONENTIAL_8_VALUE_IS_NOT_KNOWN, result1.getSensingDuration());
    }

    @Test
    public void test_constructor_00004() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        //@formatter:on

        AverageVoltage result1 = new AverageVoltage(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result1.getVoltageValue());
        assertEquals(0x03, result1.getSensingDuration());
    }

    @Test
    public void test_constructor_00101() {
        int voltageValue = VoltageUtils.VOLTAGE_VALUE_IS_NOT_KNOWN;
        int timeExponential8 = TimeExponential8Utils.TIME_EXPONENTIAL_8_ZERO_SECONDS;

        AverageVoltage result1 = new AverageVoltage(voltageValue, timeExponential8);
        assertEquals(voltageValue, result1.getVoltageValue());
        assertEquals(timeExponential8, result1.getSensingDuration());
    }

    @Test
    public void test_constructor_00102() {
        int voltageValue = 0x0201;
        int timeExponential8 = TimeExponential8Utils.TIME_EXPONENTIAL_8_TOTAL_LIFE_OF_THE_DEVICE;

        AverageVoltage result1 = new AverageVoltage(voltageValue, timeExponential8);
        assertEquals(voltageValue, result1.getVoltageValue());
        assertEquals(timeExponential8, result1.getSensingDuration());
    }

    @Test
    public void test_constructor_00103() {
        int voltageValue = 0x0201;
        int timeExponential8 = TimeExponential8Utils.TIME_EXPONENTIAL_8_VALUE_IS_NOT_KNOWN;

        AverageVoltage result1 = new AverageVoltage(voltageValue, timeExponential8);
        assertEquals(voltageValue, result1.getVoltageValue());
        assertEquals(timeExponential8, result1.getSensingDuration());
    }

    @Test
    public void test_constructor_00104() {
        int voltageValue = 0x0201;
        int timeExponential8 = 0x03;

        AverageVoltage result1 = new AverageVoltage(voltageValue, timeExponential8);
        assertEquals(voltageValue, result1.getVoltageValue());
        assertEquals(timeExponential8, result1.getSensingDuration());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        //@formatter:on

        AverageVoltage result1 = new AverageVoltage(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
