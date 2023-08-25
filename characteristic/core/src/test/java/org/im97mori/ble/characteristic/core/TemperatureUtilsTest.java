package org.im97mori.ble.characteristic.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class TemperatureUtilsTest extends TestBase {

    @Test
    public void test_isTemperatureValueNotKnown_00001() {
        assertTrue(TemperatureUtils.isTemperatureValueNotKnown(TemperatureUtils.TEMPERATURE_VALUE_IS_NOT_KNOWN));
    }

    @Test
    public void test_isTemperatureValueNotKnown_00002() {
        assertFalse(TemperatureUtils.isTemperatureValueNotKnown(0));
    }

    @Test
    public void test_isTemperatureValueNotKnown_00003() {
        assertFalse(TemperatureUtils.isTemperatureValueNotKnown(65534));
    }

    @Test
    public void test_getTemperatureCelsius_00001() {
        int temperature = -27315;

        assertEquals(-273.15, TemperatureUtils.getTemperatureCelsius(temperature), 0);
    }

    @Test
    public void test_getTemperatureCelsius_00002() {
        int temperature = -27314;

        assertEquals(TemperatureUtils.TEMPERATURE_RESOLUTION * temperature, TemperatureUtils.getTemperatureCelsius(temperature), 0);
    }

    @Test
    public void test_getTemperatureCelsius_00003() {
        int temperature = -27316;

        assertEquals(TemperatureUtils.TEMPERATURE_VALUE_MINIMUM, TemperatureUtils.getTemperatureCelsius(temperature), 0);
    }

    @Test
    public void test_getTemperatureCelsius_00004() {
        int temperature = 32767;

        assertEquals(TemperatureUtils.TEMPERATURE_RESOLUTION * temperature, TemperatureUtils.getTemperatureCelsius(temperature), 0);
    }

    @Test
    public void test_getTemperatureCelsius_00005() {
        int temperature = 32768;

        assertEquals(TemperatureUtils.TEMPERATURE_VALUE_MAXIMUM, TemperatureUtils.getTemperatureCelsius(temperature), 0);
    }

}
