package org.im97mori.ble.characteristic.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class Percentage8UtilsTest extends TestBase {

    @Test
    public void test_isPercentage8IsNotKnown_00001() {
        assertTrue(Percentage8Utils.isPercentage8IsNotKnown(Percentage8Utils.PERCENTAGE_8_VALUE_IS_NOT_KNOWN));
    }

    @Test
    public void test_isPercentage8IsNotKnown_00002() {
        assertFalse(Percentage8Utils.isPercentage8IsNotKnown(0));
    }

    @Test
    public void test_getPercentage8WithUnit_00001() {
        int percentage8 = 0;

        assertEquals(Percentage8Utils.PERCENTAGE_8_VALUE_UNIT * percentage8, Percentage8Utils.getPercentage8WithUnit(percentage8), 0);
    }

    @Test
    public void test_getVoltageValueVolt_00002() {
        int percentage8 = 1;

        assertEquals(Percentage8Utils.PERCENTAGE_8_VALUE_UNIT * percentage8, Percentage8Utils.getPercentage8WithUnit(percentage8), 0);
    }

    @Test
    public void test_getVoltageValueVolt_00003() {
        int percentage8 = 200;

        assertEquals(Percentage8Utils.PERCENTAGE_8_VALUE_UNIT * percentage8, Percentage8Utils.getPercentage8WithUnit(percentage8), 0);
    }

    @Test
    public void test_getVoltageValueVolt_00004() {
        int percentage8 = -1;

        assertEquals(Percentage8Utils.PERCENTAGE_8_VALUE_MINIMUM, Percentage8Utils.getPercentage8WithUnit(percentage8), 0);
    }

    @Test
    public void test_getVoltageValueVolt_00005() {
        int percentage8 = 201;

        assertEquals(Percentage8Utils.PERCENTAGE_8_VALUE_MAXIMUM, Percentage8Utils.getPercentage8WithUnit(percentage8), 0);
    }

}
