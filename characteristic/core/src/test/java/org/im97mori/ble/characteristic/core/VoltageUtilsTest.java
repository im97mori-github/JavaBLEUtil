package org.im97mori.ble.characteristic.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class VoltageUtilsTest extends TestBase {

    @Test
    public void test_isVoltageValueIsNotKnown_00001() {
        assertTrue(VoltageUtils.isVoltageValueIsNotKnown(VoltageUtils.VOLTAGE_VALUE_IS_NOT_KNOWN));
    }

    @Test
    public void test_isVoltageValueIsNotKnown_00002() {
        assertFalse(VoltageUtils.isVoltageValueIsNotKnown(0));
    }

    @Test
    public void test_getVoltageValueVolt_00001() {
        int voltageValue = 0;

        assertEquals(VoltageUtils.VOLTAGE_VALUE_UNIT * voltageValue, VoltageUtils.getVoltageValueVolt(voltageValue), 0);
    }

    @Test
    public void test_getVoltageValueVolt_00002() {
        int voltageValue = 1;

        assertEquals(VoltageUtils.VOLTAGE_VALUE_UNIT * voltageValue, VoltageUtils.getVoltageValueVolt(voltageValue), 0);
    }

    @Test
    public void test_getVoltageValueVolt_00003() {
        int voltageValue = 65408;

        assertEquals(VoltageUtils.VOLTAGE_VALUE_UNIT * voltageValue, VoltageUtils.getVoltageValueVolt(voltageValue), 0);
    }

    @Test
    public void test_getVoltageValueVolt_00004() {
        int voltageValue = -1;

        assertEquals(VoltageUtils.VOLTAGE_VALUE_MINIMUM, VoltageUtils.getVoltageValueVolt(voltageValue), 0);
    }

    @Test
    public void test_getVoltageValueVolt_00005() {
        int voltageValue = 65409;

        assertEquals(VoltageUtils.VOLTAGE_VALUE_MAXIMUM, VoltageUtils.getVoltageValueVolt(voltageValue), 0);
    }

}
