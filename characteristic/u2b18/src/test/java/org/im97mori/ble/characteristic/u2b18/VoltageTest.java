package org.im97mori.ble.characteristic.u2b18;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.characteristic.core.VoltageUtils;
import org.junit.Test;

public class VoltageTest {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) VoltageUtils.VOLTAGE_VALUE_IS_NOT_KNOWN;
        data[ 1] = (byte) (VoltageUtils.VOLTAGE_VALUE_IS_NOT_KNOWN >> 8);
        //@formatter:on

        Voltage result1 = new Voltage(data);
        assertEquals(VoltageUtils.VOLTAGE_VALUE_IS_NOT_KNOWN, result1.getVoltageValue());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        //@formatter:on

        Voltage result1 = new Voltage(data);
        assertEquals(BLEUtils.createUInt16(data, 0), result1.getVoltageValue());
    }

    @Test
    public void test_constructor_00101() {
        int voltageValue = VoltageUtils.VOLTAGE_VALUE_IS_NOT_KNOWN;

        Voltage result1 = new Voltage(voltageValue);
        assertEquals(voltageValue, result1.getVoltageValue());
    }

    @Test
    public void test_constructor_00102() {
        int voltageValue = 0x0201;

        Voltage result1 = new Voltage(voltageValue);
        assertEquals(voltageValue, result1.getVoltageValue());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        //@formatter:on

        Voltage result1 = new Voltage(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
