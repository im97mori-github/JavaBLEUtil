package org.im97mori.ble.characteristic.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Temperature8UtilsTest {

    @Test
    public void test_isTemperature8ValueNotKnown_00001() {
        assertTrue(Temperature8Utils.isTemperature8ValueNotKnown(Temperature8Utils.TEMPERATURE_8_VALUE_IS_NOT_KNOWN));
    }

    @Test
    public void test_isTemperature8ValueNotKnown_00002() {
        assertFalse(Temperature8Utils.isTemperature8ValueNotKnown(0));
    }

    @Test
    public void test_isTemperature8ValueNotKnown_00003() {
        assertFalse(Temperature8Utils.isTemperature8ValueNotKnown(65534));
    }

    @Test
    public void test_getTemperature8Celsius_00001() {
        int temperature8 = -128;

        assertEquals(-64.0d, Temperature8Utils.getTemperature8Celsius(temperature8), 0);
    }

    @Test
    public void test_getTemperature8Celsius_00002() {
        int temperature8 = -127;

        assertEquals(Temperature8Utils.TEMPERATURE_8_RESOLUTION * temperature8, Temperature8Utils.getTemperature8Celsius(temperature8), 0);
    }

    @Test
    public void test_getTemperature8Celsius_00003() {
        int temperature8 = -129;

        assertEquals(Temperature8Utils.TEMPERATURE_8_VALUE_MINIMUM, Temperature8Utils.getTemperature8Celsius(temperature8), 0);
    }

    @Test
    public void test_getTemperature8Celsius_00004() {
        int temperature8 = 125;

        assertEquals(Temperature8Utils.TEMPERATURE_8_RESOLUTION * temperature8, Temperature8Utils.getTemperature8Celsius(temperature8), 0);
    }

    @Test
    public void test_getTemperature8Celsius_00005() {
        int temperature8 = 126;

        assertEquals(Temperature8Utils.TEMPERATURE_8_VALUE_MAXIMUM, Temperature8Utils.getTemperature8Celsius(temperature8), 0);
    }

}
