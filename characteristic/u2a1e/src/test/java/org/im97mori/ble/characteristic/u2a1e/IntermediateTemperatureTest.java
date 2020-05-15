package org.im97mori.ble.characteristic.u2a1e;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.characteristic.core.DateTimeUtils;
import org.im97mori.ble.characteristic.core.IEEE_11073_20601_FLOAT;
import org.im97mori.ble.characteristic.core.TemperatureMeasurementUtils;
import org.im97mori.ble.characteristic.core.TemperatureTypeUtils;
import org.junit.Test;

public class IntermediateTemperatureTest {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[5];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_NOT_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertEquals(TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_NOT_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT, result1.getFlags());
        assertEquals(0x030201 * Math.pow(10, 0x04), result1.getTemperatureMeasurementValueCelsius().getFloat(), 0);
        assertTrue(TemperatureMeasurementUtils.isFlagsTemperatureUnitsCelsius(result1.getFlags()));
        assertFalse(TemperatureMeasurementUtils.isFlagsTemperatureUnitsFahrenheit(result1.getFlags()));
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[5];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_FAHRENHEIT
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_NOT_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertEquals(TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_FAHRENHEIT
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_NOT_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT, result1.getFlags());
        assertEquals(0x030201 * Math.pow(10, 0x04), result1.getTemperatureMeasurementValueFahrenheit().getFloat(), 0);
        assertFalse(TemperatureMeasurementUtils.isFlagsTemperatureUnitsCelsius(result1.getFlags()));
        assertTrue(TemperatureMeasurementUtils.isFlagsTemperatureUnitsFahrenheit(result1.getFlags()));
    }

    @Test
    public void test_constructor101() {
        //@formatter:off
        byte[] data = new byte[5];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_NOT_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertEquals(TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_NOT_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT, result1.getFlags());
        assertTrue(TemperatureMeasurementUtils.isFlagsTimeStampNotPresent(result1.getFlags()));
        assertFalse(TemperatureMeasurementUtils.isFlagsTimeStampPresent(result1.getFlags()));
    }

    @Test
    public void test_constructor102() {
        //@formatter:off
        byte[] data = new byte[12];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = (byte) 1582;
        data[ 6] = (byte) (1582 >> 8);
        data[ 7] = DateTimeUtils.MONTH_IS_NOT_KNOWN;
        data[ 8] = DateTimeUtils.DAY_OF_MONTH_IS_NOT_KNOWN;
        data[ 9] = 0;
        data[10] = 0;
        data[11] = 0;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertEquals(TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT, result1.getFlags());
        assertFalse(TemperatureMeasurementUtils.isFlagsTimeStampNotPresent(result1.getFlags()));
        assertTrue(TemperatureMeasurementUtils.isFlagsTimeStampPresent(result1.getFlags()));
        assertEquals(1582, result1.getYear());
        assertEquals(DateTimeUtils.DAY_OF_MONTH_IS_NOT_KNOWN, result1.getMonth());
        assertEquals(0, result1.getDay());
        assertEquals(0, result1.getHours());
        assertEquals(0, result1.getMinutes());
        assertEquals(0, result1.getSeconds());
    }

    @Test
    public void test_constructor103() {
        //@formatter:off
        byte[] data = new byte[12];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = (byte) 9999;
        data[ 6] = (byte) (9999 >> 8);
        data[ 7] = DateTimeUtils.MONTH_JANUARY;
        data[ 8] = 1;
        data[ 9] = 23;
        data[10] = 59;
        data[11] = 59;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertEquals(TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT, result1.getFlags());
        assertFalse(TemperatureMeasurementUtils.isFlagsTimeStampNotPresent(result1.getFlags()));
        assertTrue(TemperatureMeasurementUtils.isFlagsTimeStampPresent(result1.getFlags()));
        assertEquals(9999, result1.getYear());
        assertEquals(DateTimeUtils.MONTH_JANUARY, result1.getMonth());
        assertEquals(1, result1.getDay());
        assertEquals(23, result1.getHours());
        assertEquals(59, result1.getMinutes());
        assertEquals(59, result1.getSeconds());
    }

    @Test
    public void test_constructor104() {
        //@formatter:off
        byte[] data = new byte[12];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = (byte) 9999;
        data[ 6] = (byte) (9999 >> 8);
        data[ 7] = DateTimeUtils.MONTH_FEBRUARY;
        data[ 8] = 31;
        data[ 9] = 0;
        data[10] = 0;
        data[11] = 0;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertEquals(TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT, result1.getFlags());
        assertFalse(TemperatureMeasurementUtils.isFlagsTimeStampNotPresent(result1.getFlags()));
        assertTrue(TemperatureMeasurementUtils.isFlagsTimeStampPresent(result1.getFlags()));
        assertEquals(9999, result1.getYear());
        assertEquals(DateTimeUtils.MONTH_FEBRUARY, result1.getMonth());
        assertEquals(31, result1.getDay());
        assertEquals(0, result1.getHours());
        assertEquals(0, result1.getMinutes());
        assertEquals(0, result1.getSeconds());
    }

    @Test
    public void test_constructor105() {
        //@formatter:off
        byte[] data = new byte[12];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = (byte) 9999;
        data[ 6] = (byte) (9999 >> 8);
        data[ 7] = DateTimeUtils.MONTH_MARCH;
        data[ 8] = 31;
        data[ 9] = 0;
        data[10] = 0;
        data[11] = 0;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertEquals(TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT, result1.getFlags());
        assertFalse(TemperatureMeasurementUtils.isFlagsTimeStampNotPresent(result1.getFlags()));
        assertTrue(TemperatureMeasurementUtils.isFlagsTimeStampPresent(result1.getFlags()));
        assertEquals(9999, result1.getYear());
        assertEquals(DateTimeUtils.MONTH_MARCH, result1.getMonth());
        assertEquals(31, result1.getDay());
        assertEquals(0, result1.getHours());
        assertEquals(0, result1.getMinutes());
        assertEquals(0, result1.getSeconds());
    }

    @Test
    public void test_constructor106() {
        //@formatter:off
        byte[] data = new byte[12];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = (byte) 9999;
        data[ 6] = (byte) (9999 >> 8);
        data[ 7] = DateTimeUtils.MONTH_APRIL;
        data[ 8] = 31;
        data[ 9] = 0;
        data[10] = 0;
        data[11] = 0;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertEquals(TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT, result1.getFlags());
        assertFalse(TemperatureMeasurementUtils.isFlagsTimeStampNotPresent(result1.getFlags()));
        assertTrue(TemperatureMeasurementUtils.isFlagsTimeStampPresent(result1.getFlags()));
        assertEquals(9999, result1.getYear());
        assertEquals(DateTimeUtils.MONTH_APRIL, result1.getMonth());
        assertEquals(31, result1.getDay());
        assertEquals(0, result1.getHours());
        assertEquals(0, result1.getMinutes());
        assertEquals(0, result1.getSeconds());
    }

    @Test
    public void test_constructor107() {
        //@formatter:off
        byte[] data = new byte[12];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = (byte) 9999;
        data[ 6] = (byte) (9999 >> 8);
        data[ 7] = DateTimeUtils.MONTH_MAY;
        data[ 8] = 31;
        data[ 9] = 0;
        data[10] = 0;
        data[11] = 0;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertEquals(TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT, result1.getFlags());
        assertFalse(TemperatureMeasurementUtils.isFlagsTimeStampNotPresent(result1.getFlags()));
        assertTrue(TemperatureMeasurementUtils.isFlagsTimeStampPresent(result1.getFlags()));
        assertEquals(9999, result1.getYear());
        assertEquals(DateTimeUtils.MONTH_MAY, result1.getMonth());
        assertEquals(31, result1.getDay());
        assertEquals(0, result1.getHours());
        assertEquals(0, result1.getMinutes());
        assertEquals(0, result1.getSeconds());
    }

    @Test
    public void test_constructor108() {
        //@formatter:off
        byte[] data = new byte[12];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = (byte) 9999;
        data[ 6] = (byte) (9999 >> 8);
        data[ 7] = DateTimeUtils.MONTH_JUNE;
        data[ 8] = 31;
        data[ 9] = 0;
        data[10] = 0;
        data[11] = 0;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertEquals(TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT, result1.getFlags());
        assertFalse(TemperatureMeasurementUtils.isFlagsTimeStampNotPresent(result1.getFlags()));
        assertTrue(TemperatureMeasurementUtils.isFlagsTimeStampPresent(result1.getFlags()));
        assertEquals(9999, result1.getYear());
        assertEquals(DateTimeUtils.MONTH_JUNE, result1.getMonth());
        assertEquals(31, result1.getDay());
        assertEquals(0, result1.getHours());
        assertEquals(0, result1.getMinutes());
        assertEquals(0, result1.getSeconds());
    }

    @Test
    public void test_constructor109() {
        //@formatter:off
        byte[] data = new byte[12];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = (byte) 9999;
        data[ 6] = (byte) (9999 >> 8);
        data[ 7] = DateTimeUtils.MONTH_JULY;
        data[ 8] = 31;
        data[ 9] = 0;
        data[10] = 0;
        data[11] = 0;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertEquals(TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT, result1.getFlags());
        assertFalse(TemperatureMeasurementUtils.isFlagsTimeStampNotPresent(result1.getFlags()));
        assertTrue(TemperatureMeasurementUtils.isFlagsTimeStampPresent(result1.getFlags()));
        assertEquals(9999, result1.getYear());
        assertEquals(DateTimeUtils.MONTH_JULY, result1.getMonth());
        assertEquals(31, result1.getDay());
        assertEquals(0, result1.getHours());
        assertEquals(0, result1.getMinutes());
        assertEquals(0, result1.getSeconds());
    }

    @Test
    public void test_constructor110() {
        //@formatter:off
        byte[] data = new byte[12];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = (byte) 9999;
        data[ 6] = (byte) (9999 >> 8);
        data[ 7] = DateTimeUtils.MONTH_AUGUST;
        data[ 8] = 31;
        data[ 9] = 0;
        data[10] = 0;
        data[11] = 0;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertEquals(TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT, result1.getFlags());
        assertFalse(TemperatureMeasurementUtils.isFlagsTimeStampNotPresent(result1.getFlags()));
        assertTrue(TemperatureMeasurementUtils.isFlagsTimeStampPresent(result1.getFlags()));
        assertEquals(9999, result1.getYear());
        assertEquals(DateTimeUtils.MONTH_AUGUST, result1.getMonth());
        assertEquals(31, result1.getDay());
        assertEquals(0, result1.getHours());
        assertEquals(0, result1.getMinutes());
        assertEquals(0, result1.getSeconds());
    }

    @Test
    public void test_constructor111() {
        //@formatter:off
        byte[] data = new byte[12];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = (byte) 9999;
        data[ 6] = (byte) (9999 >> 8);
        data[ 7] = DateTimeUtils.MONTH_SEPTEMBER;
        data[ 8] = 31;
        data[ 9] = 0;
        data[10] = 0;
        data[11] = 0;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertEquals(TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT, result1.getFlags());
        assertFalse(TemperatureMeasurementUtils.isFlagsTimeStampNotPresent(result1.getFlags()));
        assertTrue(TemperatureMeasurementUtils.isFlagsTimeStampPresent(result1.getFlags()));
        assertEquals(9999, result1.getYear());
        assertEquals(DateTimeUtils.MONTH_SEPTEMBER, result1.getMonth());
        assertEquals(31, result1.getDay());
        assertEquals(0, result1.getHours());
        assertEquals(0, result1.getMinutes());
        assertEquals(0, result1.getSeconds());
    }

    @Test
    public void test_constructor112() {
        //@formatter:off
        byte[] data = new byte[12];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = (byte) 9999;
        data[ 6] = (byte) (9999 >> 8);
        data[ 7] = DateTimeUtils.MONTH_OCTOBER;
        data[ 8] = 31;
        data[ 9] = 0;
        data[10] = 0;
        data[11] = 0;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertEquals(TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT, result1.getFlags());
        assertFalse(TemperatureMeasurementUtils.isFlagsTimeStampNotPresent(result1.getFlags()));
        assertTrue(TemperatureMeasurementUtils.isFlagsTimeStampPresent(result1.getFlags()));
        assertEquals(9999, result1.getYear());
        assertEquals(DateTimeUtils.MONTH_OCTOBER, result1.getMonth());
        assertEquals(31, result1.getDay());
        assertEquals(0, result1.getHours());
        assertEquals(0, result1.getMinutes());
        assertEquals(0, result1.getSeconds());
    }

    @Test
    public void test_constructor113() {
        //@formatter:off
        byte[] data = new byte[12];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = (byte) 9999;
        data[ 6] = (byte) (9999 >> 8);
        data[ 7] = DateTimeUtils.MONTH_NOVEMBER;
        data[ 8] = 31;
        data[ 9] = 0;
        data[10] = 0;
        data[11] = 0;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertEquals(TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT, result1.getFlags());
        assertFalse(TemperatureMeasurementUtils.isFlagsTimeStampNotPresent(result1.getFlags()));
        assertTrue(TemperatureMeasurementUtils.isFlagsTimeStampPresent(result1.getFlags()));
        assertEquals(9999, result1.getYear());
        assertEquals(DateTimeUtils.MONTH_NOVEMBER, result1.getMonth());
        assertEquals(31, result1.getDay());
        assertEquals(0, result1.getHours());
        assertEquals(0, result1.getMinutes());
        assertEquals(0, result1.getSeconds());
    }

    @Test
    public void test_constructor114() {
        //@formatter:off
        byte[] data = new byte[12];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = (byte) 9999;
        data[ 6] = (byte) (9999 >> 8);
        data[ 7] = DateTimeUtils.MONTH_DECEMBER;
        data[ 8] = 31;
        data[ 9] = 0;
        data[10] = 0;
        data[11] = 0;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertEquals(TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT, result1.getFlags());
        assertFalse(TemperatureMeasurementUtils.isFlagsTimeStampNotPresent(result1.getFlags()));
        assertTrue(TemperatureMeasurementUtils.isFlagsTimeStampPresent(result1.getFlags()));
        assertEquals(9999, result1.getYear());
        assertEquals(DateTimeUtils.MONTH_DECEMBER, result1.getMonth());
        assertEquals(31, result1.getDay());
        assertEquals(0, result1.getHours());
        assertEquals(0, result1.getMinutes());
        assertEquals(0, result1.getSeconds());
    }

    @Test
    public void test_constructor201() {
        //@formatter:off
        byte[] data = new byte[5];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_NOT_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertEquals(TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_NOT_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT, result1.getFlags());
        assertTrue(TemperatureMeasurementUtils.isFlagsTemperatureTypeNotPresent(result1.getFlags()));
        assertFalse(TemperatureMeasurementUtils.isFlagsTemperatureTypePresent(result1.getFlags()));
    }

    @Test
    public void test_constructor202() {
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_NOT_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_ARMPIT;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertEquals(TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_NOT_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_PRESENT, result1.getFlags());
        assertFalse(TemperatureMeasurementUtils.isFlagsTemperatureTypeNotPresent(result1.getFlags()));
        assertTrue(TemperatureMeasurementUtils.isFlagsTemperatureTypePresent(result1.getFlags()));
        assertEquals(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_ARMPIT, result1.getTemperatureTextDescription());
        assertTrue(TemperatureTypeUtils.isTemperatureTextDescriptionTypeArmpit(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeBodyGeneral(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeEarUsuallyEarLobe(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeFinger(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeGastroIntestinalTract(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeMouth(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeRectum(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeToe(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeTympanumEarDrum(result1.getTemperatureTextDescription()));
    }

    @Test
    public void test_constructor203() {
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_NOT_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_BODY_GENERAL;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertEquals(TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_NOT_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_PRESENT, result1.getFlags());
        assertFalse(TemperatureMeasurementUtils.isFlagsTemperatureTypeNotPresent(result1.getFlags()));
        assertTrue(TemperatureMeasurementUtils.isFlagsTemperatureTypePresent(result1.getFlags()));
        assertEquals(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_BODY_GENERAL, result1.getTemperatureTextDescription());
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeArmpit(result1.getTemperatureTextDescription()));
        assertTrue(TemperatureTypeUtils.isTemperatureTextDescriptionTypeBodyGeneral(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeEarUsuallyEarLobe(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeFinger(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeGastroIntestinalTract(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeMouth(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeRectum(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeToe(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeTympanumEarDrum(result1.getTemperatureTextDescription()));
    }

    @Test
    public void test_constructor204() {
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_NOT_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_EAR_USUALLY_EAR_LOBE;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertEquals(TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_NOT_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_PRESENT, result1.getFlags());
        assertFalse(TemperatureMeasurementUtils.isFlagsTemperatureTypeNotPresent(result1.getFlags()));
        assertTrue(TemperatureMeasurementUtils.isFlagsTemperatureTypePresent(result1.getFlags()));
        assertEquals(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_EAR_USUALLY_EAR_LOBE, result1.getTemperatureTextDescription());
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeArmpit(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeBodyGeneral(result1.getTemperatureTextDescription()));
        assertTrue(TemperatureTypeUtils.isTemperatureTextDescriptionTypeEarUsuallyEarLobe(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeFinger(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeGastroIntestinalTract(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeMouth(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeRectum(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeToe(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeTympanumEarDrum(result1.getTemperatureTextDescription()));
    }

    @Test
    public void test_constructor205() {
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_NOT_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_FINGER;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertEquals(TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_NOT_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_PRESENT, result1.getFlags());
        assertFalse(TemperatureMeasurementUtils.isFlagsTemperatureTypeNotPresent(result1.getFlags()));
        assertTrue(TemperatureMeasurementUtils.isFlagsTemperatureTypePresent(result1.getFlags()));
        assertEquals(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_FINGER, result1.getTemperatureTextDescription());
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeArmpit(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeBodyGeneral(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeEarUsuallyEarLobe(result1.getTemperatureTextDescription()));
        assertTrue(TemperatureTypeUtils.isTemperatureTextDescriptionTypeFinger(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeGastroIntestinalTract(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeMouth(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeRectum(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeToe(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeTympanumEarDrum(result1.getTemperatureTextDescription()));
    }

    @Test
    public void test_constructor206() {
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_NOT_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_GASTRO_INTESTINAL_TRACT;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertEquals(TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_NOT_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_PRESENT, result1.getFlags());
        assertFalse(TemperatureMeasurementUtils.isFlagsTemperatureTypeNotPresent(result1.getFlags()));
        assertTrue(TemperatureMeasurementUtils.isFlagsTemperatureTypePresent(result1.getFlags()));
        assertEquals(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_GASTRO_INTESTINAL_TRACT, result1.getTemperatureTextDescription());
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeArmpit(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeBodyGeneral(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeEarUsuallyEarLobe(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeFinger(result1.getTemperatureTextDescription()));
        assertTrue(TemperatureTypeUtils.isTemperatureTextDescriptionTypeGastroIntestinalTract(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeMouth(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeRectum(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeToe(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeTympanumEarDrum(result1.getTemperatureTextDescription()));
    }

    @Test
    public void test_constructor207() {
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_NOT_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_MOUTH;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertEquals(TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_NOT_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_PRESENT, result1.getFlags());
        assertFalse(TemperatureMeasurementUtils.isFlagsTemperatureTypeNotPresent(result1.getFlags()));
        assertTrue(TemperatureMeasurementUtils.isFlagsTemperatureTypePresent(result1.getFlags()));
        assertEquals(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_MOUTH, result1.getTemperatureTextDescription());
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeArmpit(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeBodyGeneral(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeEarUsuallyEarLobe(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeFinger(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeGastroIntestinalTract(result1.getTemperatureTextDescription()));
        assertTrue(TemperatureTypeUtils.isTemperatureTextDescriptionTypeMouth(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeRectum(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeToe(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeTympanumEarDrum(result1.getTemperatureTextDescription()));
    }

    @Test
    public void test_constructor208() {
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_NOT_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_RECTUM;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertEquals(TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_NOT_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_PRESENT, result1.getFlags());
        assertFalse(TemperatureMeasurementUtils.isFlagsTemperatureTypeNotPresent(result1.getFlags()));
        assertTrue(TemperatureMeasurementUtils.isFlagsTemperatureTypePresent(result1.getFlags()));
        assertEquals(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_RECTUM, result1.getTemperatureTextDescription());
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeArmpit(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeBodyGeneral(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeEarUsuallyEarLobe(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeFinger(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeGastroIntestinalTract(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeMouth(result1.getTemperatureTextDescription()));
        assertTrue(TemperatureTypeUtils.isTemperatureTextDescriptionTypeRectum(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeToe(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeTympanumEarDrum(result1.getTemperatureTextDescription()));
    }

    @Test
    public void test_constructor209() {
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_NOT_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_TOE;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertEquals(TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_NOT_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_PRESENT, result1.getFlags());
        assertFalse(TemperatureMeasurementUtils.isFlagsTemperatureTypeNotPresent(result1.getFlags()));
        assertTrue(TemperatureMeasurementUtils.isFlagsTemperatureTypePresent(result1.getFlags()));
        assertEquals(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_TOE, result1.getTemperatureTextDescription());
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeArmpit(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeBodyGeneral(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeEarUsuallyEarLobe(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeFinger(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeGastroIntestinalTract(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeMouth(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeRectum(result1.getTemperatureTextDescription()));
        assertTrue(TemperatureTypeUtils.isTemperatureTextDescriptionTypeToe(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeTympanumEarDrum(result1.getTemperatureTextDescription()));
    }

    @Test
    public void test_constructor210() {
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_NOT_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_TYMPANUM_EAR_DRUM;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertEquals(TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_NOT_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_PRESENT, result1.getFlags());
        assertFalse(TemperatureMeasurementUtils.isFlagsTemperatureTypeNotPresent(result1.getFlags()));
        assertTrue(TemperatureMeasurementUtils.isFlagsTemperatureTypePresent(result1.getFlags()));
        assertEquals(TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_TYMPANUM_EAR_DRUM, result1.getTemperatureTextDescription());
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeArmpit(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeBodyGeneral(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeEarUsuallyEarLobe(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeFinger(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeGastroIntestinalTract(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeMouth(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeRectum(result1.getTemperatureTextDescription()));
        assertFalse(TemperatureTypeUtils.isTemperatureTextDescriptionTypeToe(result1.getTemperatureTextDescription()));
        assertTrue(TemperatureTypeUtils.isTemperatureTextDescriptionTypeTympanumEarDrum(result1.getTemperatureTextDescription()));
    }

    @Test
    public void test_constructor211() {
        int flags = 1;
        IEEE_11073_20601_FLOAT temperatureMeasurementValueCelsius = new IEEE_11073_20601_FLOAT(new byte[] { 2, 3, 4, 5 }, 0);
        IEEE_11073_20601_FLOAT temperatureMeasurementValueFahrenheit = new IEEE_11073_20601_FLOAT(new byte[] { 6, 7, 8, 9 }, 0);
        int year = 10;
        int month = 11;
        int day = 12;
        int hours = 13;
        int minutes = 14;
        int seconds = 15;
        int temperatureTextDescription = 16;

        IntermediateTemperature result1 = new IntermediateTemperature(flags, temperatureMeasurementValueCelsius, temperatureMeasurementValueFahrenheit, year, month, day, hours, minutes, seconds, temperatureTextDescription);
        assertEquals(flags, result1.getFlags());
        assertEquals(temperatureMeasurementValueCelsius, result1.getTemperatureMeasurementValueCelsius());
        assertEquals(temperatureMeasurementValueFahrenheit, result1.getTemperatureMeasurementValueFahrenheit());
        assertEquals(year, result1.getYear());
        assertEquals(month, result1.getMonth());
        assertEquals(day, result1.getDay());
        assertEquals(hours, result1.getHours());
        assertEquals(minutes, result1.getMinutes());
        assertEquals(seconds, result1.getSeconds());
        assertEquals(temperatureTextDescription, result1.getTemperatureTextDescription());
    }

    @Test
    public void test_parcelable101() {
        //@formatter:off
        byte[] data = new byte[5];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_NOT_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable102() {
        //@formatter:off
        byte[] data = new byte[5];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_FAHRENHEIT
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_NOT_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable103() {
        //@formatter:off
        byte[] data = new byte[5];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_NOT_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable104() {
        //@formatter:off
        byte[] data = new byte[12];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = (byte) 1582;
        data[ 6] = (byte) (1582 >> 8);
        data[ 7] = DateTimeUtils.MONTH_IS_NOT_KNOWN;
        data[ 8] = DateTimeUtils.DAY_OF_MONTH_IS_NOT_KNOWN;
        data[ 9] = 0;
        data[10] = 0;
        data[11] = 0;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable105() {
        //@formatter:off
        byte[] data = new byte[12];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = (byte) 9999;
        data[ 6] = (byte) (9999 >> 8);
        data[ 7] = DateTimeUtils.MONTH_JANUARY;
        data[ 8] = 1;
        data[ 9] = 23;
        data[10] = 59;
        data[11] = 59;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable106() {
        //@formatter:off
        byte[] data = new byte[12];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = (byte) 9999;
        data[ 6] = (byte) (9999 >> 8);
        data[ 7] = DateTimeUtils.MONTH_FEBRUARY;
        data[ 8] = 31;
        data[ 9] = 0;
        data[10] = 0;
        data[11] = 0;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable107() {
        //@formatter:off
        byte[] data = new byte[12];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = (byte) 9999;
        data[ 6] = (byte) (9999 >> 8);
        data[ 7] = DateTimeUtils.MONTH_MARCH;
        data[ 8] = 31;
        data[ 9] = 0;
        data[10] = 0;
        data[11] = 0;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable108() {
        //@formatter:off
        byte[] data = new byte[12];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = (byte) 9999;
        data[ 6] = (byte) (9999 >> 8);
        data[ 7] = DateTimeUtils.MONTH_APRIL;
        data[ 8] = 31;
        data[ 9] = 0;
        data[10] = 0;
        data[11] = 0;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable109() {
        //@formatter:off
        byte[] data = new byte[12];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = (byte) 9999;
        data[ 6] = (byte) (9999 >> 8);
        data[ 7] = DateTimeUtils.MONTH_MAY;
        data[ 8] = 31;
        data[ 9] = 0;
        data[10] = 0;
        data[11] = 0;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable110() {
        //@formatter:off
        byte[] data = new byte[12];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = (byte) 9999;
        data[ 6] = (byte) (9999 >> 8);
        data[ 7] = DateTimeUtils.MONTH_JUNE;
        data[ 8] = 31;
        data[ 9] = 0;
        data[10] = 0;
        data[11] = 0;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable111() {
        //@formatter:off
        byte[] data = new byte[12];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = (byte) 9999;
        data[ 6] = (byte) (9999 >> 8);
        data[ 7] = DateTimeUtils.MONTH_JULY;
        data[ 8] = 31;
        data[ 9] = 0;
        data[10] = 0;
        data[11] = 0;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable112() {
        //@formatter:off
        byte[] data = new byte[12];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = (byte) 9999;
        data[ 6] = (byte) (9999 >> 8);
        data[ 7] = DateTimeUtils.MONTH_AUGUST;
        data[ 8] = 31;
        data[ 9] = 0;
        data[10] = 0;
        data[11] = 0;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable113() {
        //@formatter:off
        byte[] data = new byte[12];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = (byte) 9999;
        data[ 6] = (byte) (9999 >> 8);
        data[ 7] = DateTimeUtils.MONTH_SEPTEMBER;
        data[ 8] = 31;
        data[ 9] = 0;
        data[10] = 0;
        data[11] = 0;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable114() {
        //@formatter:off
        byte[] data = new byte[12];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = (byte) 9999;
        data[ 6] = (byte) (9999 >> 8);
        data[ 7] = DateTimeUtils.MONTH_OCTOBER;
        data[ 8] = 31;
        data[ 9] = 0;
        data[10] = 0;
        data[11] = 0;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable115() {
        //@formatter:off
        byte[] data = new byte[12];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = (byte) 9999;
        data[ 6] = (byte) (9999 >> 8);
        data[ 7] = DateTimeUtils.MONTH_NOVEMBER;
        data[ 8] = 31;
        data[ 9] = 0;
        data[10] = 0;
        data[11] = 0;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable116() {
        //@formatter:off
        byte[] data = new byte[12];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = (byte) 9999;
        data[ 6] = (byte) (9999 >> 8);
        data[ 7] = DateTimeUtils.MONTH_DECEMBER;
        data[ 8] = 31;
        data[ 9] = 0;
        data[10] = 0;
        data[11] = 0;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable117() {
        //@formatter:off
        byte[] data = new byte[5];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_NOT_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_NOT_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable118() {
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_NOT_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_ARMPIT;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable119() {
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_NOT_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_BODY_GENERAL;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable120() {
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_NOT_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_EAR_USUALLY_EAR_LOBE;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable121() {
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_NOT_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_FINGER;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable122() {
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_NOT_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_GASTRO_INTESTINAL_TRACT;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable123() {
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_NOT_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_MOUTH;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable124() {
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_NOT_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_RECTUM;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable125() {
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_NOT_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_TOE;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable126() {
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = TemperatureMeasurementUtils.FLAGS_TEMPERATURE_UNITS_CELSIUS
                | TemperatureMeasurementUtils.FLAGS_TIME_STAMP_NOT_PRESENT
                | TemperatureMeasurementUtils.FLAGS_TEMPERATURE_TYPE_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = TemperatureTypeUtils.TEMPERATURE_TEXT_DESCRIPTION_TYPE_TYMPANUM_EAR_DRUM;
        //@formatter:on

        IntermediateTemperature result1 = new IntermediateTemperature(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
