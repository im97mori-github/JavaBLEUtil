package org.im97mori.ble.characteristic.u2b35;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.characteristic.core.EnhancedBloodPressureMeasurementUtils;
import org.im97mori.ble.characteristic.core.IEEE_11073_20601_SFLOAT;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class EnhancedIntermediateCuffPressureTest extends TestBase {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = EnhancedBloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | EnhancedBloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_FACING_TIME_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_EPOCH_START_IS_JANUARY_1_1900;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        //@formatter:on

        EnhancedIntermediateCuffPressure result1 = new EnhancedIntermediateCuffPressure(data);
        assertEquals(EnhancedBloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | EnhancedBloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_FACING_TIME_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_EPOCH_START_IS_JANUARY_1_1900, result1.getFlags());
        assertEquals(1, result1.getIntermediateCuffPressureValueMmhg().getSfloat(), 0);
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = EnhancedBloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_KPA
                | EnhancedBloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_FACING_TIME_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_EPOCH_START_IS_JANUARY_1_1900;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        //@formatter:on

        EnhancedIntermediateCuffPressure result1 = new EnhancedIntermediateCuffPressure(data);
        assertEquals(EnhancedBloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_KPA
                | EnhancedBloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_FACING_TIME_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_EPOCH_START_IS_JANUARY_1_1900, result1.getFlags());
        assertEquals(1, result1.getIntermediateCuffPressureValueKpa().getSfloat(), 0);
    }

    @Test
    public void test_constructor_00101() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = EnhancedBloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | EnhancedBloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_FACING_TIME_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_EPOCH_START_IS_JANUARY_1_1900;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        //@formatter:on

        EnhancedIntermediateCuffPressure result1 = new EnhancedIntermediateCuffPressure(data);
        assertEquals(EnhancedBloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | EnhancedBloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_FACING_TIME_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_EPOCH_START_IS_JANUARY_1_1900, result1.getFlags());
    }

    @Test
    public void test_constructor_00102() {
        //@formatter:off
        byte[] data = new byte[7];
        data[ 0] = EnhancedBloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | EnhancedBloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_FACING_TIME_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_EPOCH_START_IS_JANUARY_1_1900;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        data[ 6] = 0x05;
        //@formatter:on

        EnhancedIntermediateCuffPressure result1 = new EnhancedIntermediateCuffPressure(data);
        assertEquals(EnhancedBloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | EnhancedBloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_FACING_TIME_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_EPOCH_START_IS_JANUARY_1_1900, result1.getFlags());
        assertEquals(0x05040302, result1.getTimeStamp());
    }

    @Test
    public void test_constructor_00201() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = EnhancedBloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | EnhancedBloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_FACING_TIME_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_EPOCH_START_IS_JANUARY_1_1900;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        //@formatter:on

        EnhancedIntermediateCuffPressure result1 = new EnhancedIntermediateCuffPressure(data);
        assertEquals(EnhancedBloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | EnhancedBloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_FACING_TIME_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_EPOCH_START_IS_JANUARY_1_1900, result1.getFlags());
        assertNotNull(result1.getPulseRate());
        assertArrayEquals(new byte[2], result1.getPulseRate().getData());
    }

    @Test
    public void test_constructor_00202() {
        //@formatter:off
        byte[] data = new byte[5];
        data[ 0] = EnhancedBloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | EnhancedBloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_PULSE_RATE_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_FACING_TIME_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_EPOCH_START_IS_JANUARY_1_1900;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x04;
        data[ 4] = (byte) 0x05;
        //@formatter:on

        EnhancedIntermediateCuffPressure result1 = new EnhancedIntermediateCuffPressure(data);
        assertEquals(EnhancedBloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | EnhancedBloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_PULSE_RATE_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_FACING_TIME_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_EPOCH_START_IS_JANUARY_1_1900, result1.getFlags());
        assertNotNull(result1.getPulseRate());
        assertArrayEquals(Arrays.copyOfRange(data, 3, 5), result1.getPulseRate().getData());
    }

    @Test
    public void test_constructor_00301() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = EnhancedBloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | EnhancedBloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_FACING_TIME_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_EPOCH_START_IS_JANUARY_1_1900;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        //@formatter:on

        EnhancedIntermediateCuffPressure result1 = new EnhancedIntermediateCuffPressure(data);
        assertEquals(EnhancedBloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | EnhancedBloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_FACING_TIME_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_EPOCH_START_IS_JANUARY_1_1900, result1.getFlags());
        assertEquals(0, result1.getUserId());
    }

    @Test
    public void test_constructor_00302() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = EnhancedBloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | EnhancedBloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_ID_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_FACING_TIME_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_EPOCH_START_IS_JANUARY_1_1900;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x03;
        //@formatter:on

        EnhancedIntermediateCuffPressure result1 = new EnhancedIntermediateCuffPressure(data);
        assertEquals(EnhancedBloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | EnhancedBloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_ID_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_FACING_TIME_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_EPOCH_START_IS_JANUARY_1_1900, result1.getFlags());
        assertEquals(0x003, result1.getUserId());
    }

    @Test
    public void test_constructor_00401() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = EnhancedBloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | EnhancedBloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_FACING_TIME_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_EPOCH_START_IS_JANUARY_1_1900;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        //@formatter:on

        EnhancedIntermediateCuffPressure result1 = new EnhancedIntermediateCuffPressure(data);
        assertEquals(EnhancedBloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | EnhancedBloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_FACING_TIME_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_EPOCH_START_IS_JANUARY_1_1900, result1.getFlags());
        assertArrayEquals(new byte[0], result1.getMeasurementStatus());
    }

    @Test
    public void test_constructor_00402() {
        //@formatter:off
        byte[] data = new byte[5];
        data[ 0] = EnhancedBloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | EnhancedBloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_FACING_TIME_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_EPOCH_START_IS_JANUARY_1_1900;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x02;
        data[ 4] = (byte) 0x03;
        //@formatter:on

        EnhancedIntermediateCuffPressure result1 = new EnhancedIntermediateCuffPressure(data);
        assertEquals(EnhancedBloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | EnhancedBloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_FACING_TIME_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_EPOCH_START_IS_JANUARY_1_1900, result1.getFlags());
        assertArrayEquals(Arrays.copyOfRange(data, 3, 5), result1.getMeasurementStatus());
    }

    @Test
    public void test_constructor_00501() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = EnhancedBloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | EnhancedBloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_FACING_TIME_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_EPOCH_START_IS_JANUARY_1_1900;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        //@formatter:on

        EnhancedIntermediateCuffPressure result1 = new EnhancedIntermediateCuffPressure(data);
        assertEquals(EnhancedBloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | EnhancedBloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_FACING_TIME_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_EPOCH_START_IS_JANUARY_1_1900, result1.getFlags());
        assertEquals(0, result1.getUserFacingTime());
    }

    @Test
    public void test_constructor_00502() {
        //@formatter:off
        byte[] data = new byte[7];
        data[ 0] = EnhancedBloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | EnhancedBloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_FACING_TIME_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_EPOCH_START_IS_JANUARY_1_1900;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x02;
        data[ 4] = (byte) 0x03;
        data[ 5] = (byte) 0x04;
        data[ 6] = (byte) 0x05;
        //@formatter:on

        EnhancedIntermediateCuffPressure result1 = new EnhancedIntermediateCuffPressure(data);
        assertEquals(EnhancedBloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | EnhancedBloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_FACING_TIME_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_EPOCH_START_IS_JANUARY_1_1900, result1.getFlags());
        assertEquals(BLEUtils.createUInt32(data, 3), result1.getUserFacingTime());
    }

    @Test
    public void test_constructor_00601() {
        int flags = 1;
        IEEE_11073_20601_SFLOAT intermediateCuffPressureValueMmhg = new IEEE_11073_20601_SFLOAT(
                new byte[] { 2, 3 }, 0);
        IEEE_11073_20601_SFLOAT intermediateCuffPressureValueKpa = new IEEE_11073_20601_SFLOAT(
                new byte[] { 4, 5 }, 0);
        long timeStamp = 66;
        IEEE_11073_20601_SFLOAT pulseRate = new IEEE_11073_20601_SFLOAT(new byte[] { 7, 8 }, 0);
        int userId = 9;
        byte[] measurementStatus = new byte[] { 10 };
        long userFacingTime = 11;

        EnhancedIntermediateCuffPressure result1 = new EnhancedIntermediateCuffPressure(flags,
                intermediateCuffPressureValueMmhg, intermediateCuffPressureValueKpa, timeStamp, pulseRate, userId,
                measurementStatus, userFacingTime);
        assertEquals(flags, result1.getFlags());
        assertEquals(intermediateCuffPressureValueMmhg, result1.getIntermediateCuffPressureValueMmhg());
        assertEquals(intermediateCuffPressureValueKpa, result1.getIntermediateCuffPressureValueKpa());
        assertEquals(timeStamp, result1.getTimeStamp());
        assertEquals(pulseRate, result1.getPulseRate());
        assertEquals(userId, result1.getUserId());
        assertArrayEquals(measurementStatus, result1.getMeasurementStatus());
        assertEquals(userFacingTime, result1.getUserFacingTime());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] data = new byte[3];
        data[ 0] = EnhancedBloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | EnhancedBloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_FACING_TIME_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_EPOCH_START_IS_JANUARY_1_1900;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        //@formatter:on

        EnhancedIntermediateCuffPressure result1 = new EnhancedIntermediateCuffPressure(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00102() {
        //@formatter:off
        byte[] data = new byte[7];
        data[ 0] = EnhancedBloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | EnhancedBloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_FACING_TIME_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_EPOCH_START_IS_JANUARY_1_1900;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        data[ 6] = 0x05;
        //@formatter:on

        EnhancedIntermediateCuffPressure result1 = new EnhancedIntermediateCuffPressure(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00103() {
        //@formatter:off
        byte[] data = new byte[5];
        data[ 0] = EnhancedBloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | EnhancedBloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_PULSE_RATE_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_FACING_TIME_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_EPOCH_START_IS_JANUARY_1_1900;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x03;
        data[ 4] = (byte) 0x04;
        //@formatter:on

        EnhancedIntermediateCuffPressure result1 = new EnhancedIntermediateCuffPressure(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00104() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = EnhancedBloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | EnhancedBloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_ID_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_FACING_TIME_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_EPOCH_START_IS_JANUARY_1_1900;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x02;
        //@formatter:on

        EnhancedIntermediateCuffPressure result1 = new EnhancedIntermediateCuffPressure(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00105() {
        //@formatter:off
        byte[] data = new byte[5];
        data[ 0] = EnhancedBloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | EnhancedBloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_FACING_TIME_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_EPOCH_START_IS_JANUARY_1_1900;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x02;
        data[ 4] = (byte) 0x03;
        //@formatter:on

        EnhancedIntermediateCuffPressure result1 = new EnhancedIntermediateCuffPressure(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable_00106() {
        //@formatter:off
        byte[] data = new byte[7];
        data[ 0] = EnhancedBloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | EnhancedBloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_USER_FACING_TIME_PRESENT
                | EnhancedBloodPressureMeasurementUtils.FLAG_EPOCH_START_IS_JANUARY_1_1900;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x02;
        data[ 4] = (byte) 0x03;
        data[ 5] = (byte) 0x04;
        data[ 6] = (byte) 0x05;
        //@formatter:on

        EnhancedIntermediateCuffPressure result1 = new EnhancedIntermediateCuffPressure(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
