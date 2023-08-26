package org.im97mori.ble.characteristic.u2a37;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class HeartRateMeasurementTest extends TestBase {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = HeartRateMeasurement.FLAGS_HEART_RATE_VALUE_FORMAT_UINT8
                | HeartRateMeasurement.FLAGS_SENSOR_CONTACT_STATUS_NOT_SUPPORTED_0
                | HeartRateMeasurement.FLAGS_ENERGY_EXPENDED_STATUS_NOT_PRESENT
                | HeartRateMeasurement.FLAGS_RR_INTERVAL_NOT_PRESENT;
        data[ 1] = 0x01;
        //@formatter:on

        HeartRateMeasurement result1 = new HeartRateMeasurement(data);
        assertEquals(HeartRateMeasurement.FLAGS_HEART_RATE_VALUE_FORMAT_UINT8
                | HeartRateMeasurement.FLAGS_SENSOR_CONTACT_STATUS_NOT_SUPPORTED_0
                | HeartRateMeasurement.FLAGS_ENERGY_EXPENDED_STATUS_NOT_PRESENT
                | HeartRateMeasurement.FLAGS_RR_INTERVAL_NOT_PRESENT, result1.getFlags());
        assertTrue(result1.isFlagsHeartRateValueFormatUint8());
        assertFalse(result1.isFlagsHeartRateValueFormatUint16());
        assertEquals(0x01, result1.getHeartRateMeasurementValueUint8());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = HeartRateMeasurement.FLAGS_HEART_RATE_VALUE_FORMAT_UINT16
                | HeartRateMeasurement.FLAGS_SENSOR_CONTACT_STATUS_NOT_SUPPORTED_0
                | HeartRateMeasurement.FLAGS_ENERGY_EXPENDED_STATUS_NOT_PRESENT
                | HeartRateMeasurement.FLAGS_RR_INTERVAL_NOT_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        //@formatter:on

        HeartRateMeasurement result1 = new HeartRateMeasurement(data);
        assertEquals(HeartRateMeasurement.FLAGS_HEART_RATE_VALUE_FORMAT_UINT16
                | HeartRateMeasurement.FLAGS_SENSOR_CONTACT_STATUS_NOT_SUPPORTED_0
                | HeartRateMeasurement.FLAGS_ENERGY_EXPENDED_STATUS_NOT_PRESENT
                | HeartRateMeasurement.FLAGS_RR_INTERVAL_NOT_PRESENT, result1.getFlags());
        assertFalse(result1.isFlagsHeartRateValueFormatUint8());
        assertTrue(result1.isFlagsHeartRateValueFormatUint16());
        assertEquals(0x0201, result1.getHeartRateMeasurementValueUint16());
    }

    @Test
    public void test_constructor101() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = HeartRateMeasurement.FLAGS_HEART_RATE_VALUE_FORMAT_UINT8
                | HeartRateMeasurement.FLAGS_SENSOR_CONTACT_STATUS_NOT_SUPPORTED_0
                | HeartRateMeasurement.FLAGS_ENERGY_EXPENDED_STATUS_NOT_PRESENT
                | HeartRateMeasurement.FLAGS_RR_INTERVAL_NOT_PRESENT;
        data[ 1] = 0x01;
        //@formatter:on

        HeartRateMeasurement result1 = new HeartRateMeasurement(data);
        assertEquals(HeartRateMeasurement.FLAGS_HEART_RATE_VALUE_FORMAT_UINT8
                | HeartRateMeasurement.FLAGS_SENSOR_CONTACT_STATUS_NOT_SUPPORTED_0
                | HeartRateMeasurement.FLAGS_ENERGY_EXPENDED_STATUS_NOT_PRESENT
                | HeartRateMeasurement.FLAGS_RR_INTERVAL_NOT_PRESENT, result1.getFlags());
        assertTrue(result1.isFlagsSensorContactStatusNotSupported());
        assertFalse(result1.isFlagsSensorContactStatusSupportedButNotDetected());
        assertFalse(result1.isFlagsSensorContactStatusSupportedAndDetected());
    }

    @Test
    public void test_constructor102() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = HeartRateMeasurement.FLAGS_HEART_RATE_VALUE_FORMAT_UINT8
                | HeartRateMeasurement.FLAGS_SENSOR_CONTACT_STATUS_NOT_SUPPORTED_1
                | HeartRateMeasurement.FLAGS_ENERGY_EXPENDED_STATUS_NOT_PRESENT
                | HeartRateMeasurement.FLAGS_RR_INTERVAL_NOT_PRESENT;
        data[ 1] = 0x01;
        //@formatter:on

        HeartRateMeasurement result1 = new HeartRateMeasurement(data);
        assertEquals(HeartRateMeasurement.FLAGS_HEART_RATE_VALUE_FORMAT_UINT8
                | HeartRateMeasurement.FLAGS_SENSOR_CONTACT_STATUS_NOT_SUPPORTED_1
                | HeartRateMeasurement.FLAGS_ENERGY_EXPENDED_STATUS_NOT_PRESENT
                | HeartRateMeasurement.FLAGS_RR_INTERVAL_NOT_PRESENT, result1.getFlags());
        assertTrue(result1.isFlagsSensorContactStatusNotSupported());
        assertFalse(result1.isFlagsSensorContactStatusSupportedButNotDetected());
        assertFalse(result1.isFlagsSensorContactStatusSupportedAndDetected());
    }

    @Test
    public void test_constructor103() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = HeartRateMeasurement.FLAGS_HEART_RATE_VALUE_FORMAT_UINT8
                | HeartRateMeasurement.FLAGS_SENSOR_CONTACT_STATUS_SUPPORTED_BUT_NOT_DETECTED
                | HeartRateMeasurement.FLAGS_ENERGY_EXPENDED_STATUS_NOT_PRESENT
                | HeartRateMeasurement.FLAGS_RR_INTERVAL_NOT_PRESENT;
        data[ 1] = 0x01;
        //@formatter:on

        HeartRateMeasurement result1 = new HeartRateMeasurement(data);
        assertEquals(HeartRateMeasurement.FLAGS_HEART_RATE_VALUE_FORMAT_UINT8
                | HeartRateMeasurement.FLAGS_SENSOR_CONTACT_STATUS_SUPPORTED_BUT_NOT_DETECTED
                | HeartRateMeasurement.FLAGS_ENERGY_EXPENDED_STATUS_NOT_PRESENT
                | HeartRateMeasurement.FLAGS_RR_INTERVAL_NOT_PRESENT, result1.getFlags());
        assertFalse(result1.isFlagsSensorContactStatusNotSupported());
        assertTrue(result1.isFlagsSensorContactStatusSupportedButNotDetected());
        assertFalse(result1.isFlagsSensorContactStatusSupportedAndDetected());
    }

    @Test
    public void test_constructor104() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = HeartRateMeasurement.FLAGS_HEART_RATE_VALUE_FORMAT_UINT8
                | HeartRateMeasurement.FLAGS_SENSOR_CONTACT_STATUS_SUPPORTED_AND_DETECTED
                | HeartRateMeasurement.FLAGS_ENERGY_EXPENDED_STATUS_NOT_PRESENT
                | HeartRateMeasurement.FLAGS_RR_INTERVAL_NOT_PRESENT;
        data[ 1] = 0x01;
        //@formatter:on

        HeartRateMeasurement result1 = new HeartRateMeasurement(data);
        assertEquals(HeartRateMeasurement.FLAGS_HEART_RATE_VALUE_FORMAT_UINT8
                | HeartRateMeasurement.FLAGS_SENSOR_CONTACT_STATUS_SUPPORTED_AND_DETECTED
                | HeartRateMeasurement.FLAGS_ENERGY_EXPENDED_STATUS_NOT_PRESENT
                | HeartRateMeasurement.FLAGS_RR_INTERVAL_NOT_PRESENT, result1.getFlags());
        assertFalse(result1.isFlagsSensorContactStatusNotSupported());
        assertFalse(result1.isFlagsSensorContactStatusSupportedButNotDetected());
        assertTrue(result1.isFlagsSensorContactStatusSupportedAndDetected());
    }

    @Test
    public void test_constructor201() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = HeartRateMeasurement.FLAGS_HEART_RATE_VALUE_FORMAT_UINT8
                | HeartRateMeasurement.FLAGS_SENSOR_CONTACT_STATUS_NOT_SUPPORTED_0
                | HeartRateMeasurement.FLAGS_ENERGY_EXPENDED_STATUS_NOT_PRESENT
                | HeartRateMeasurement.FLAGS_RR_INTERVAL_NOT_PRESENT;
        data[ 1] = 0x01;
        //@formatter:on

        HeartRateMeasurement result1 = new HeartRateMeasurement(data);
        assertEquals(HeartRateMeasurement.FLAGS_HEART_RATE_VALUE_FORMAT_UINT8
                | HeartRateMeasurement.FLAGS_SENSOR_CONTACT_STATUS_NOT_SUPPORTED_0
                | HeartRateMeasurement.FLAGS_ENERGY_EXPENDED_STATUS_NOT_PRESENT
                | HeartRateMeasurement.FLAGS_RR_INTERVAL_NOT_PRESENT, result1.getFlags());
        assertTrue(result1.isFlagsEnergyExpendedStatusNotPresent());
        assertFalse(result1.isFlagsEnergyExpendedStatusPresent());
    }

    @Test
    public void test_constructor202() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = HeartRateMeasurement.FLAGS_HEART_RATE_VALUE_FORMAT_UINT8
                | HeartRateMeasurement.FLAGS_SENSOR_CONTACT_STATUS_NOT_SUPPORTED_0
                | HeartRateMeasurement.FLAGS_ENERGY_EXPENDED_STATUS_PRESENT
                | HeartRateMeasurement.FLAGS_RR_INTERVAL_NOT_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        //@formatter:on

        HeartRateMeasurement result1 = new HeartRateMeasurement(data);
        assertEquals(HeartRateMeasurement.FLAGS_HEART_RATE_VALUE_FORMAT_UINT8
                | HeartRateMeasurement.FLAGS_SENSOR_CONTACT_STATUS_NOT_SUPPORTED_0
                | HeartRateMeasurement.FLAGS_ENERGY_EXPENDED_STATUS_PRESENT
                | HeartRateMeasurement.FLAGS_RR_INTERVAL_NOT_PRESENT, result1.getFlags());
        assertFalse(result1.isFlagsEnergyExpendedStatusNotPresent());
        assertTrue(result1.isFlagsEnergyExpendedStatusPresent());
        assertEquals(0x0302, result1.getEnergyExpended());
    }

    @Test
    public void test_constructor203() {
        //@formatter:off
        byte[] data = new byte[5];
        data[ 0] = HeartRateMeasurement.FLAGS_HEART_RATE_VALUE_FORMAT_UINT16
                | HeartRateMeasurement.FLAGS_SENSOR_CONTACT_STATUS_NOT_SUPPORTED_0
                | HeartRateMeasurement.FLAGS_ENERGY_EXPENDED_STATUS_PRESENT
                | HeartRateMeasurement.FLAGS_RR_INTERVAL_NOT_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        //@formatter:on

        HeartRateMeasurement result1 = new HeartRateMeasurement(data);
        assertEquals(HeartRateMeasurement.FLAGS_HEART_RATE_VALUE_FORMAT_UINT16
                | HeartRateMeasurement.FLAGS_SENSOR_CONTACT_STATUS_NOT_SUPPORTED_0
                | HeartRateMeasurement.FLAGS_ENERGY_EXPENDED_STATUS_PRESENT
                | HeartRateMeasurement.FLAGS_RR_INTERVAL_NOT_PRESENT, result1.getFlags());
        assertFalse(result1.isFlagsEnergyExpendedStatusNotPresent());
        assertTrue(result1.isFlagsEnergyExpendedStatusPresent());
        assertEquals(0x0403, result1.getEnergyExpended());
    }

    @Test
    public void test_constructor301() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = HeartRateMeasurement.FLAGS_HEART_RATE_VALUE_FORMAT_UINT8
                | HeartRateMeasurement.FLAGS_SENSOR_CONTACT_STATUS_NOT_SUPPORTED_0
                | HeartRateMeasurement.FLAGS_ENERGY_EXPENDED_STATUS_NOT_PRESENT
                | HeartRateMeasurement.FLAGS_RR_INTERVAL_NOT_PRESENT;
        data[ 1] = 0x01;
        //@formatter:on

        HeartRateMeasurement result1 = new HeartRateMeasurement(data);
        assertEquals(HeartRateMeasurement.FLAGS_HEART_RATE_VALUE_FORMAT_UINT8
                | HeartRateMeasurement.FLAGS_SENSOR_CONTACT_STATUS_NOT_SUPPORTED_0
                | HeartRateMeasurement.FLAGS_ENERGY_EXPENDED_STATUS_NOT_PRESENT
                | HeartRateMeasurement.FLAGS_RR_INTERVAL_NOT_PRESENT, result1.getFlags());
        assertTrue(result1.isFlagsRrIntervalNotPresent());
        assertFalse(result1.isFlagsRrIntervalPresent());
    }

    @Test
    public void test_constructor302() {
        //@formatter:off
        byte[] data = new byte[20];
        data[ 0] = HeartRateMeasurement.FLAGS_HEART_RATE_VALUE_FORMAT_UINT8
                | HeartRateMeasurement.FLAGS_SENSOR_CONTACT_STATUS_NOT_SUPPORTED_0
                | HeartRateMeasurement.FLAGS_ENERGY_EXPENDED_STATUS_NOT_PRESENT
                | HeartRateMeasurement.FLAGS_RR_INTERVAL_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = 0x05;
        data[ 6] = 0x06;
        data[ 7] = 0x07;
        data[ 8] = 0x08;
        data[ 9] = 0x09;
        data[10] = 0x0a;
        data[11] = 0x0b;
        data[12] = 0x0c;
        data[13] = 0x0d;
        data[14] = 0x0e;
        data[15] = 0x0f;
        data[16] = 0x10;
        data[17] = 0x11;
        data[18] = 0x12;
        data[19] = 0x13;
        //@formatter:on

        HeartRateMeasurement result1 = new HeartRateMeasurement(data);
        assertEquals(HeartRateMeasurement.FLAGS_HEART_RATE_VALUE_FORMAT_UINT8
                | HeartRateMeasurement.FLAGS_SENSOR_CONTACT_STATUS_NOT_SUPPORTED_0
                | HeartRateMeasurement.FLAGS_ENERGY_EXPENDED_STATUS_NOT_PRESENT
                | HeartRateMeasurement.FLAGS_RR_INTERVAL_PRESENT, result1.getFlags());
        assertFalse(result1.isFlagsRrIntervalNotPresent());
        assertTrue(result1.isFlagsRrIntervalPresent());
        byte[] original = Arrays.copyOfRange(data, 2, 20);
        int[] rrInterval = result1.getRrInterval();
        assertEquals(9, rrInterval.length);
        for (int i = 0; i < rrInterval.length; i++) {
            assertEquals(BLEUtils.createSInt16(original, i * 2), rrInterval[i]);
        }
    }

    @Test
    public void test_constructor303() {
        //@formatter:off
        byte[] data = new byte[19];
        data[ 0] = HeartRateMeasurement.FLAGS_HEART_RATE_VALUE_FORMAT_UINT16
                | HeartRateMeasurement.FLAGS_SENSOR_CONTACT_STATUS_NOT_SUPPORTED_0
                | HeartRateMeasurement.FLAGS_ENERGY_EXPENDED_STATUS_NOT_PRESENT
                | HeartRateMeasurement.FLAGS_RR_INTERVAL_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = 0x05;
        data[ 6] = 0x06;
        data[ 7] = 0x07;
        data[ 8] = 0x08;
        data[ 9] = 0x09;
        data[10] = 0x0a;
        data[11] = 0x0b;
        data[12] = 0x0c;
        data[13] = 0x0d;
        data[14] = 0x0e;
        data[15] = 0x0f;
        data[16] = 0x10;
        data[17] = 0x11;
        data[18] = 0x12;
        //@formatter:on

        HeartRateMeasurement result1 = new HeartRateMeasurement(data);
        assertEquals(HeartRateMeasurement.FLAGS_HEART_RATE_VALUE_FORMAT_UINT16
                | HeartRateMeasurement.FLAGS_SENSOR_CONTACT_STATUS_NOT_SUPPORTED_0
                | HeartRateMeasurement.FLAGS_ENERGY_EXPENDED_STATUS_NOT_PRESENT
                | HeartRateMeasurement.FLAGS_RR_INTERVAL_PRESENT, result1.getFlags());
        assertFalse(result1.isFlagsRrIntervalNotPresent());
        assertTrue(result1.isFlagsRrIntervalPresent());
        byte[] original = Arrays.copyOfRange(data, 3, 19);
        int[] rrInterval = result1.getRrInterval();
        assertEquals(8, rrInterval.length);
        for (int i = 0; i < rrInterval.length; i++) {
            assertEquals(BLEUtils.createSInt16(original, i * 2), rrInterval[i]);
        }
    }

    @Test
    public void test_constructor304() {
        //@formatter:off
        byte[] data = new byte[20];
        data[ 0] = HeartRateMeasurement.FLAGS_HEART_RATE_VALUE_FORMAT_UINT8
                | HeartRateMeasurement.FLAGS_SENSOR_CONTACT_STATUS_NOT_SUPPORTED_0
                | HeartRateMeasurement.FLAGS_ENERGY_EXPENDED_STATUS_PRESENT
                | HeartRateMeasurement.FLAGS_RR_INTERVAL_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = 0x05;
        data[ 6] = 0x06;
        data[ 7] = 0x07;
        data[ 8] = 0x08;
        data[ 9] = 0x09;
        data[10] = 0x0a;
        data[11] = 0x0b;
        data[12] = 0x0c;
        data[13] = 0x0d;
        data[14] = 0x0e;
        data[15] = 0x0f;
        data[16] = 0x10;
        data[17] = 0x11;
        data[18] = 0x12;
        data[19] = 0x13;
        //@formatter:on

        HeartRateMeasurement result1 = new HeartRateMeasurement(data);
        assertEquals(HeartRateMeasurement.FLAGS_HEART_RATE_VALUE_FORMAT_UINT8
                | HeartRateMeasurement.FLAGS_SENSOR_CONTACT_STATUS_NOT_SUPPORTED_0
                | HeartRateMeasurement.FLAGS_ENERGY_EXPENDED_STATUS_PRESENT
                | HeartRateMeasurement.FLAGS_RR_INTERVAL_PRESENT, result1.getFlags());
        assertFalse(result1.isFlagsRrIntervalNotPresent());
        assertTrue(result1.isFlagsRrIntervalPresent());
        byte[] original = Arrays.copyOfRange(data, 4, 20);
        int[] rrInterval = result1.getRrInterval();
        assertEquals(8, rrInterval.length);
        for (int i = 0; i < rrInterval.length; i++) {
            assertEquals(BLEUtils.createSInt16(original, i * 2), rrInterval[i]);
        }
    }

    @Test
    public void test_constructor305() {
        //@formatter:off
        byte[] data = new byte[19];
        data[ 0] = HeartRateMeasurement.FLAGS_HEART_RATE_VALUE_FORMAT_UINT16
                | HeartRateMeasurement.FLAGS_SENSOR_CONTACT_STATUS_NOT_SUPPORTED_0
                | HeartRateMeasurement.FLAGS_ENERGY_EXPENDED_STATUS_PRESENT
                | HeartRateMeasurement.FLAGS_RR_INTERVAL_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = 0x05;
        data[ 6] = 0x06;
        data[ 7] = 0x07;
        data[ 8] = 0x08;
        data[ 9] = 0x09;
        data[10] = 0x0a;
        data[11] = 0x0b;
        data[12] = 0x0c;
        data[13] = 0x0d;
        data[14] = 0x0e;
        data[15] = 0x0f;
        data[16] = 0x10;
        data[17] = 0x11;
        data[18] = 0x12;
        //@formatter:on

        HeartRateMeasurement result1 = new HeartRateMeasurement(data);
        assertEquals(HeartRateMeasurement.FLAGS_HEART_RATE_VALUE_FORMAT_UINT16
                | HeartRateMeasurement.FLAGS_SENSOR_CONTACT_STATUS_NOT_SUPPORTED_0
                | HeartRateMeasurement.FLAGS_ENERGY_EXPENDED_STATUS_PRESENT
                | HeartRateMeasurement.FLAGS_RR_INTERVAL_PRESENT, result1.getFlags());
        assertFalse(result1.isFlagsRrIntervalNotPresent());
        assertTrue(result1.isFlagsRrIntervalPresent());
        byte[] original = Arrays.copyOfRange(data, 5, 19);
        int[] rrInterval = result1.getRrInterval();
        assertEquals(7, rrInterval.length);
        for (int i = 0; i < rrInterval.length; i++) {
            assertEquals(BLEUtils.createSInt16(original, i * 2), rrInterval[i]);
        }
    }

    @Test
    public void test_constructor306() {
        int flags = 1;
        int heartRateMeasurementValueUint8 = 2;
        int heartRateMeasurementValueUint16 = 3;
        int energyExpended = 4;
        int[] rrInterval = new int[] { 5 };

        HeartRateMeasurement result1 = new HeartRateMeasurement(flags, heartRateMeasurementValueUint8, heartRateMeasurementValueUint16, energyExpended, rrInterval);
        assertEquals(flags, result1.getFlags());
        assertEquals(heartRateMeasurementValueUint8, result1.getHeartRateMeasurementValueUint8());
        assertEquals(heartRateMeasurementValueUint16, result1.getHeartRateMeasurementValueUint16());
        assertEquals(energyExpended, result1.getEnergyExpended());
        assertArrayEquals(rrInterval, result1.getRrInterval());
    }

    @Test
    public void test_parcelable101() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = HeartRateMeasurement.FLAGS_HEART_RATE_VALUE_FORMAT_UINT8
                | HeartRateMeasurement.FLAGS_SENSOR_CONTACT_STATUS_NOT_SUPPORTED_0
                | HeartRateMeasurement.FLAGS_ENERGY_EXPENDED_STATUS_NOT_PRESENT
                | HeartRateMeasurement.FLAGS_RR_INTERVAL_NOT_PRESENT;
        data[ 1] = 0x01;
        //@formatter:on

        HeartRateMeasurement result1 = new HeartRateMeasurement(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable102() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = HeartRateMeasurement.FLAGS_HEART_RATE_VALUE_FORMAT_UINT16
                | HeartRateMeasurement.FLAGS_SENSOR_CONTACT_STATUS_NOT_SUPPORTED_0
                | HeartRateMeasurement.FLAGS_ENERGY_EXPENDED_STATUS_NOT_PRESENT
                | HeartRateMeasurement.FLAGS_RR_INTERVAL_NOT_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        //@formatter:on

        HeartRateMeasurement result1 = new HeartRateMeasurement(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable103() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = HeartRateMeasurement.FLAGS_HEART_RATE_VALUE_FORMAT_UINT8
                | HeartRateMeasurement.FLAGS_SENSOR_CONTACT_STATUS_NOT_SUPPORTED_0
                | HeartRateMeasurement.FLAGS_ENERGY_EXPENDED_STATUS_NOT_PRESENT
                | HeartRateMeasurement.FLAGS_RR_INTERVAL_NOT_PRESENT;
        data[ 1] = 0x01;
        //@formatter:on

        HeartRateMeasurement result1 = new HeartRateMeasurement(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable104() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = HeartRateMeasurement.FLAGS_HEART_RATE_VALUE_FORMAT_UINT8
                | HeartRateMeasurement.FLAGS_SENSOR_CONTACT_STATUS_NOT_SUPPORTED_1
                | HeartRateMeasurement.FLAGS_ENERGY_EXPENDED_STATUS_NOT_PRESENT
                | HeartRateMeasurement.FLAGS_RR_INTERVAL_NOT_PRESENT;
        data[ 1] = 0x01;
        //@formatter:on

        HeartRateMeasurement result1 = new HeartRateMeasurement(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable105() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = HeartRateMeasurement.FLAGS_HEART_RATE_VALUE_FORMAT_UINT8
                | HeartRateMeasurement.FLAGS_SENSOR_CONTACT_STATUS_SUPPORTED_BUT_NOT_DETECTED
                | HeartRateMeasurement.FLAGS_ENERGY_EXPENDED_STATUS_NOT_PRESENT
                | HeartRateMeasurement.FLAGS_RR_INTERVAL_NOT_PRESENT;
        data[ 1] = 0x01;
        //@formatter:on

        HeartRateMeasurement result1 = new HeartRateMeasurement(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable106() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = HeartRateMeasurement.FLAGS_HEART_RATE_VALUE_FORMAT_UINT8
                | HeartRateMeasurement.FLAGS_SENSOR_CONTACT_STATUS_SUPPORTED_AND_DETECTED
                | HeartRateMeasurement.FLAGS_ENERGY_EXPENDED_STATUS_NOT_PRESENT
                | HeartRateMeasurement.FLAGS_RR_INTERVAL_NOT_PRESENT;
        data[ 1] = 0x01;
        //@formatter:on

        HeartRateMeasurement result1 = new HeartRateMeasurement(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable107() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = HeartRateMeasurement.FLAGS_HEART_RATE_VALUE_FORMAT_UINT8
                | HeartRateMeasurement.FLAGS_SENSOR_CONTACT_STATUS_NOT_SUPPORTED_0
                | HeartRateMeasurement.FLAGS_ENERGY_EXPENDED_STATUS_NOT_PRESENT
                | HeartRateMeasurement.FLAGS_RR_INTERVAL_NOT_PRESENT;
        data[ 1] = 0x01;
        //@formatter:on

        HeartRateMeasurement result1 = new HeartRateMeasurement(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable108() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = HeartRateMeasurement.FLAGS_HEART_RATE_VALUE_FORMAT_UINT8
                | HeartRateMeasurement.FLAGS_SENSOR_CONTACT_STATUS_NOT_SUPPORTED_0
                | HeartRateMeasurement.FLAGS_ENERGY_EXPENDED_STATUS_PRESENT
                | HeartRateMeasurement.FLAGS_RR_INTERVAL_NOT_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        //@formatter:on

        HeartRateMeasurement result1 = new HeartRateMeasurement(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable109() {
        //@formatter:off
        byte[] data = new byte[5];
        data[ 0] = HeartRateMeasurement.FLAGS_HEART_RATE_VALUE_FORMAT_UINT16
                | HeartRateMeasurement.FLAGS_SENSOR_CONTACT_STATUS_NOT_SUPPORTED_0
                | HeartRateMeasurement.FLAGS_ENERGY_EXPENDED_STATUS_PRESENT
                | HeartRateMeasurement.FLAGS_RR_INTERVAL_NOT_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        //@formatter:on

        HeartRateMeasurement result1 = new HeartRateMeasurement(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable110() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = HeartRateMeasurement.FLAGS_HEART_RATE_VALUE_FORMAT_UINT8
                | HeartRateMeasurement.FLAGS_SENSOR_CONTACT_STATUS_NOT_SUPPORTED_0
                | HeartRateMeasurement.FLAGS_ENERGY_EXPENDED_STATUS_NOT_PRESENT
                | HeartRateMeasurement.FLAGS_RR_INTERVAL_NOT_PRESENT;
        data[ 1] = 0x01;
        //@formatter:on

        HeartRateMeasurement result1 = new HeartRateMeasurement(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable111() {
        //@formatter:off
        byte[] data = new byte[20];
        data[ 0] = HeartRateMeasurement.FLAGS_HEART_RATE_VALUE_FORMAT_UINT8
                | HeartRateMeasurement.FLAGS_SENSOR_CONTACT_STATUS_NOT_SUPPORTED_0
                | HeartRateMeasurement.FLAGS_ENERGY_EXPENDED_STATUS_NOT_PRESENT
                | HeartRateMeasurement.FLAGS_RR_INTERVAL_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = 0x05;
        data[ 6] = 0x06;
        data[ 7] = 0x07;
        data[ 8] = 0x08;
        data[ 9] = 0x09;
        data[10] = 0x0a;
        data[11] = 0x0b;
        data[12] = 0x0c;
        data[13] = 0x0d;
        data[14] = 0x0e;
        data[15] = 0x0f;
        data[16] = 0x10;
        data[17] = 0x11;
        data[18] = 0x12;
        data[19] = 0x13;
        //@formatter:on

        HeartRateMeasurement result1 = new HeartRateMeasurement(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable112() {
        //@formatter:off
        byte[] data = new byte[19];
        data[ 0] = HeartRateMeasurement.FLAGS_HEART_RATE_VALUE_FORMAT_UINT16
                | HeartRateMeasurement.FLAGS_SENSOR_CONTACT_STATUS_NOT_SUPPORTED_0
                | HeartRateMeasurement.FLAGS_ENERGY_EXPENDED_STATUS_NOT_PRESENT
                | HeartRateMeasurement.FLAGS_RR_INTERVAL_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = 0x05;
        data[ 6] = 0x06;
        data[ 7] = 0x07;
        data[ 8] = 0x08;
        data[ 9] = 0x09;
        data[10] = 0x0a;
        data[11] = 0x0b;
        data[12] = 0x0c;
        data[13] = 0x0d;
        data[14] = 0x0e;
        data[15] = 0x0f;
        data[16] = 0x10;
        data[17] = 0x11;
        data[18] = 0x12;
        //@formatter:on

        HeartRateMeasurement result1 = new HeartRateMeasurement(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable113() {
        //@formatter:off
        byte[] data = new byte[20];
        data[ 0] = HeartRateMeasurement.FLAGS_HEART_RATE_VALUE_FORMAT_UINT8
                | HeartRateMeasurement.FLAGS_SENSOR_CONTACT_STATUS_NOT_SUPPORTED_0
                | HeartRateMeasurement.FLAGS_ENERGY_EXPENDED_STATUS_PRESENT
                | HeartRateMeasurement.FLAGS_RR_INTERVAL_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = 0x05;
        data[ 6] = 0x06;
        data[ 7] = 0x07;
        data[ 8] = 0x08;
        data[ 9] = 0x09;
        data[10] = 0x0a;
        data[11] = 0x0b;
        data[12] = 0x0c;
        data[13] = 0x0d;
        data[14] = 0x0e;
        data[15] = 0x0f;
        data[16] = 0x10;
        data[17] = 0x11;
        data[18] = 0x12;
        data[19] = 0x13;
        //@formatter:on

        HeartRateMeasurement result1 = new HeartRateMeasurement(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable114() {
        //@formatter:off
        byte[] data = new byte[19];
        data[ 0] = HeartRateMeasurement.FLAGS_HEART_RATE_VALUE_FORMAT_UINT16
                | HeartRateMeasurement.FLAGS_SENSOR_CONTACT_STATUS_NOT_SUPPORTED_0
                | HeartRateMeasurement.FLAGS_ENERGY_EXPENDED_STATUS_PRESENT
                | HeartRateMeasurement.FLAGS_RR_INTERVAL_PRESENT;
        data[ 1] = 0x01;
        data[ 2] = 0x02;
        data[ 3] = 0x03;
        data[ 4] = 0x04;
        data[ 5] = 0x05;
        data[ 6] = 0x06;
        data[ 7] = 0x07;
        data[ 8] = 0x08;
        data[ 9] = 0x09;
        data[10] = 0x0a;
        data[11] = 0x0b;
        data[12] = 0x0c;
        data[13] = 0x0d;
        data[14] = 0x0e;
        data[15] = 0x0f;
        data[16] = 0x10;
        data[17] = 0x11;
        data[18] = 0x12;
        //@formatter:on

        HeartRateMeasurement result1 = new HeartRateMeasurement(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
