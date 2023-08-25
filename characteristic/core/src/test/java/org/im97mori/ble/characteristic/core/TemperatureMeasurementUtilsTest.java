package org.im97mori.ble.characteristic.core;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class TemperatureMeasurementUtilsTest extends TestBase {

    @Test
    public void test_isFlagsTemperatureUnitsCelsius_001() {
        assertTrue(TemperatureMeasurementUtils.isFlagsTemperatureUnitsCelsius(TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS));
        assertFalse(TemperatureMeasurementUtils.isFlagsTemperatureUnitsCelsius(TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_FAHRENHEIT));
    }

    @Test
    public void test_isFlagsTemperatureUnitsFahrenheit_001() {
        assertFalse(TemperatureMeasurementUtils.isFlagsTemperatureUnitsFahrenheit(TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS));
        assertTrue(TemperatureMeasurementUtils.isFlagsTemperatureUnitsFahrenheit(TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_FAHRENHEIT));
    }

    @Test
    public void test_isFlagsTimeStampNotPresent_001() {
        assertTrue(TemperatureMeasurementUtils.isFlagsTimeStampNotPresent(TemperatureMeasurementUtils.FLAGS_TIME_STAMP_NOT_PRESENT));
        assertFalse(TemperatureMeasurementUtils.isFlagsTimeStampNotPresent(TemperatureMeasurementUtils.FLAGS_TIME_STAMP_PRESENT));
    }

    @Test
    public void test_isFlagsTimeStampPresent_001() {
        assertFalse(TemperatureMeasurementUtils.isFlagsTimeStampPresent(TemperatureMeasurementUtils.FLAGS_TIME_STAMP_NOT_PRESENT));
        assertTrue(TemperatureMeasurementUtils.isFlagsTimeStampPresent(TemperatureMeasurementUtils.FLAGS_TIME_STAMP_PRESENT));
    }

    @Test
    public void test_isFlagsTemperatureTypeNotPresent_001() {
        assertTrue(TemperatureMeasurementUtils.isFlagsTemperatureTypeNotPresent(TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT));
        assertFalse(TemperatureMeasurementUtils.isFlagsTemperatureTypeNotPresent(TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_PRESENT));
    }

    @Test
    public void test_isFlagsTemperatureTypePresent_001() {
        assertFalse(TemperatureMeasurementUtils.isFlagsTemperatureTypePresent(TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT));
        assertTrue(TemperatureMeasurementUtils.isFlagsTemperatureTypePresent(TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_PRESENT));
    }

}
