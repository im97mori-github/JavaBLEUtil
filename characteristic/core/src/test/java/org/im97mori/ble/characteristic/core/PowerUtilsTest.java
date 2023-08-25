package org.im97mori.ble.characteristic.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class PowerUtilsTest extends TestBase {

    @Test
    public void test_isPowerValueIsNotKnown_00001() {
        assertTrue(PowerUtils.isPowerValueIsNotKnown(PowerUtils.POWER_VALUE_IS_NOT_KNOWN));
    }

    @Test
    public void test_isPowerValueIsNotKnown_00002() {
        assertFalse(PowerUtils.isPowerValueIsNotKnown(0));
    }

    @Test
    public void test_getPowerWatt_00001() {
        int power = 0;

        assertEquals(PowerUtils.POWER_VALUE_MINIMUM, PowerUtils.getPowerWatt(power), 0);
    }

    @Test
    public void test_getPowerWatt_00002() {
        int power = 1;

        assertEquals(PowerUtils.POWER_VALUE_UNIT * power, PowerUtils.getPowerWatt(power), 0);
    }

    @Test
    public void test_getPowerWatt_00003() {
        int power = 16777213;

        assertEquals(PowerUtils.POWER_VALUE_UNIT * power, PowerUtils.getPowerWatt(power), 0);
    }

    @Test
    public void test_getPowerWatt_00005() {
        int power = 16777215;

        assertEquals(PowerUtils.POWER_VALUE_MAXIMUM, PowerUtils.getPowerWatt(power), 0);
    }

}