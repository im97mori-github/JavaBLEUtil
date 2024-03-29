package org.im97mori.ble.characteristic.u2a36;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.characteristic.core.BloodPressureMeasurementUtils;
import org.im97mori.ble.characteristic.core.DateTimeUtils;
import org.im97mori.ble.characteristic.core.IEEE_11073_20601_SFLOAT;
import org.im97mori.ble.characteristic.core.UserIndexUtils;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class IntermediateCuffPressureTest extends TestBase {

	@Test
	public void test_constructor001() {
		//@formatter:off
        byte[] data = new byte[7];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertEquals(BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
				| BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT, result1.getFlags());
		assertEquals(1, result1.getIntermediateCuffPressureCompoundValueCurrentCuffPressureMmhg().getSfloat(), 0);
		assertEquals(2, result1.getIntermediateCuffPressureCompoundValueDiastolicUnused().getSfloat(), 0);
		assertEquals(3, result1.getIntermediateCuffPressureCompoundValueMeanArterialPressureUnused().getSfloat(), 0);
		assertFalse(
				BLEUtils.isSfloatNan(result1.getIntermediateCuffPressureCompoundValueDiastolicUnused().getData(), 0));
		assertFalse(BLEUtils.isSfloatNan(
				result1.getIntermediateCuffPressureCompoundValueMeanArterialPressureUnused().getData(), 0));
	}

	@Test
	public void test_constructor002() {
		//@formatter:off
        byte[] data = new byte[7];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_KPA
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertEquals(BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_KPA
				| BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT, result1.getFlags());
		assertEquals(1, result1.getIntermediateCuffPressureCompoundValueCurrentCuffPressureKpa().getSfloat(), 0);
		assertEquals(2, result1.getIntermediateCuffPressureCompoundValueDiastolicUnused().getSfloat(), 0);
		assertEquals(3, result1.getIntermediateCuffPressureCompoundValueMeanArterialPressureUnused().getSfloat(), 0);
		assertFalse(
				BLEUtils.isSfloatNan(result1.getIntermediateCuffPressureCompoundValueDiastolicUnused().getData(), 0));
		assertFalse(BLEUtils.isSfloatNan(
				result1.getIntermediateCuffPressureCompoundValueMeanArterialPressureUnused().getData(), 0));
	}

	@Test
	public void test_constructor101() {
		//@formatter:off
        byte[] data = new byte[7];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertEquals(BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
				| BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT, result1.getFlags());
		assertFalse(
				BLEUtils.isSfloatNan(result1.getIntermediateCuffPressureCompoundValueDiastolicUnused().getData(), 0));
		assertFalse(BLEUtils.isSfloatNan(
				result1.getIntermediateCuffPressureCompoundValueMeanArterialPressureUnused().getData(), 0));
	}

	@Test
	public void test_constructor102() {
		//@formatter:off
        byte[] data = new byte[14];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);
        data[ 7] = (byte) 1582;
        data[ 8] = (byte) (1582 >> 8);
        data[ 9] = DateTimeUtils.MONTH_IS_NOT_KNOWN;
        data[10] = DateTimeUtils.DAY_OF_MONTH_IS_NOT_KNOWN;
        data[11] = 0;
        data[12] = 0;
        data[13] = 0;
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertEquals(BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
				| BloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT
				| BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT, result1.getFlags());
		assertEquals(1582, result1.getYear());
		assertEquals(DateTimeUtils.DAY_OF_MONTH_IS_NOT_KNOWN, result1.getMonth());
		assertEquals(0, result1.getDay());
		assertEquals(0, result1.getHours());
		assertEquals(0, result1.getMinutes());
		assertEquals(0, result1.getSeconds());
		assertFalse(
				BLEUtils.isSfloatNan(result1.getIntermediateCuffPressureCompoundValueDiastolicUnused().getData(), 0));
		assertFalse(BLEUtils.isSfloatNan(
				result1.getIntermediateCuffPressureCompoundValueMeanArterialPressureUnused().getData(), 0));
	}

	@Test
	public void test_constructor103() {
		//@formatter:off
        byte[] data = new byte[14];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);
        data[ 7] = (byte) 9999;
        data[ 8] = (byte) (9999 >> 8);
        data[ 9] = DateTimeUtils.MONTH_JANUARY;
        data[10] = 1;
        data[11] = 23;
        data[12] = 59;
        data[13] = 59;
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertEquals(BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
				| BloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT
				| BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT, result1.getFlags());
		assertEquals(9999, result1.getYear());
		assertEquals(DateTimeUtils.MONTH_JANUARY, result1.getMonth());
		assertEquals(1, result1.getDay());
		assertEquals(23, result1.getHours());
		assertEquals(59, result1.getMinutes());
		assertEquals(59, result1.getSeconds());
		assertFalse(
				BLEUtils.isSfloatNan(result1.getIntermediateCuffPressureCompoundValueDiastolicUnused().getData(), 0));
		assertFalse(BLEUtils.isSfloatNan(
				result1.getIntermediateCuffPressureCompoundValueMeanArterialPressureUnused().getData(), 0));
	}

	@Test
	public void test_constructor104() {
		//@formatter:off
        byte[] data = new byte[14];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);
        data[ 7] = (byte) 9999;
        data[ 8] = (byte) (9999 >> 8);
        data[ 9] = DateTimeUtils.MONTH_FEBRUARY;
        data[10] = 31;
        data[11] = 0;
        data[12] = 0;
        data[13] = 0;
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertEquals(BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
				| BloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT
				| BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT, result1.getFlags());
		assertEquals(9999, result1.getYear());
		assertEquals(DateTimeUtils.MONTH_FEBRUARY, result1.getMonth());
		assertEquals(31, result1.getDay());
		assertEquals(0, result1.getHours());
		assertEquals(0, result1.getMinutes());
		assertEquals(0, result1.getSeconds());
		assertFalse(
				BLEUtils.isSfloatNan(result1.getIntermediateCuffPressureCompoundValueDiastolicUnused().getData(), 0));
		assertFalse(BLEUtils.isSfloatNan(
				result1.getIntermediateCuffPressureCompoundValueMeanArterialPressureUnused().getData(), 0));
	}

	@Test
	public void test_constructor105() {
		//@formatter:off
        byte[] data = new byte[14];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);
        data[ 7] = (byte) 9999;
        data[ 8] = (byte) (9999 >> 8);
        data[ 9] = DateTimeUtils.MONTH_MARCH;
        data[10] = 31;
        data[11] = 0;
        data[12] = 0;
        data[13] = 0;
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertEquals(BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
				| BloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT
				| BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT, result1.getFlags());
		assertEquals(9999, result1.getYear());
		assertEquals(DateTimeUtils.MONTH_MARCH, result1.getMonth());
		assertEquals(31, result1.getDay());
		assertEquals(0, result1.getHours());
		assertEquals(0, result1.getMinutes());
		assertEquals(0, result1.getSeconds());
		assertFalse(
				BLEUtils.isSfloatNan(result1.getIntermediateCuffPressureCompoundValueDiastolicUnused().getData(), 0));
		assertFalse(BLEUtils.isSfloatNan(
				result1.getIntermediateCuffPressureCompoundValueMeanArterialPressureUnused().getData(), 0));
	}

	@Test
	public void test_constructor106() {
		//@formatter:off
        byte[] data = new byte[14];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);
        data[ 7] = (byte) 9999;
        data[ 8] = (byte) (9999 >> 8);
        data[ 9] = DateTimeUtils.MONTH_APRIL;
        data[10] = 31;
        data[11] = 0;
        data[12] = 0;
        data[13] = 0;
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertEquals(BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
				| BloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT
				| BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT, result1.getFlags());
		assertEquals(9999, result1.getYear());
		assertEquals(DateTimeUtils.MONTH_APRIL, result1.getMonth());
		assertEquals(31, result1.getDay());
		assertEquals(0, result1.getHours());
		assertEquals(0, result1.getMinutes());
		assertEquals(0, result1.getSeconds());
		assertFalse(
				BLEUtils.isSfloatNan(result1.getIntermediateCuffPressureCompoundValueDiastolicUnused().getData(), 0));
		assertFalse(BLEUtils.isSfloatNan(
				result1.getIntermediateCuffPressureCompoundValueMeanArterialPressureUnused().getData(), 0));
	}

	@Test
	public void test_constructor107() {
		//@formatter:off
        byte[] data = new byte[14];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);
        data[ 7] = (byte) 9999;
        data[ 8] = (byte) (9999 >> 8);
        data[ 9] = DateTimeUtils.MONTH_MAY;
        data[10] = 31;
        data[11] = 0;
        data[12] = 0;
        data[13] = 0;
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertEquals(BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
				| BloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT
				| BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT, result1.getFlags());
		assertEquals(9999, result1.getYear());
		assertEquals(DateTimeUtils.MONTH_MAY, result1.getMonth());
		assertEquals(31, result1.getDay());
		assertEquals(0, result1.getHours());
		assertEquals(0, result1.getMinutes());
		assertEquals(0, result1.getSeconds());
		assertFalse(
				BLEUtils.isSfloatNan(result1.getIntermediateCuffPressureCompoundValueDiastolicUnused().getData(), 0));
		assertFalse(BLEUtils.isSfloatNan(
				result1.getIntermediateCuffPressureCompoundValueMeanArterialPressureUnused().getData(), 0));
	}

	@Test
	public void test_constructor108() {
		//@formatter:off
        byte[] data = new byte[14];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);
        data[ 7] = (byte) 9999;
        data[ 8] = (byte) (9999 >> 8);
        data[ 9] = DateTimeUtils.MONTH_JUNE;
        data[10] = 31;
        data[11] = 0;
        data[12] = 0;
        data[13] = 0;
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertEquals(BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
				| BloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT
				| BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT, result1.getFlags());
		assertEquals(9999, result1.getYear());
		assertEquals(DateTimeUtils.MONTH_JUNE, result1.getMonth());
		assertEquals(31, result1.getDay());
		assertEquals(0, result1.getHours());
		assertEquals(0, result1.getMinutes());
		assertEquals(0, result1.getSeconds());
		assertFalse(
				BLEUtils.isSfloatNan(result1.getIntermediateCuffPressureCompoundValueDiastolicUnused().getData(), 0));
		assertFalse(BLEUtils.isSfloatNan(
				result1.getIntermediateCuffPressureCompoundValueMeanArterialPressureUnused().getData(), 0));
	}

	@Test
	public void test_constructor109() {
		//@formatter:off
        byte[] data = new byte[14];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);
        data[ 7] = (byte) 9999;
        data[ 8] = (byte) (9999 >> 8);
        data[ 9] = DateTimeUtils.MONTH_JULY;
        data[10] = 31;
        data[11] = 0;
        data[12] = 0;
        data[13] = 0;
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertEquals(BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
				| BloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT
				| BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT, result1.getFlags());
		assertEquals(9999, result1.getYear());
		assertEquals(DateTimeUtils.MONTH_JULY, result1.getMonth());
		assertEquals(31, result1.getDay());
		assertEquals(0, result1.getHours());
		assertEquals(0, result1.getMinutes());
		assertEquals(0, result1.getSeconds());
		assertFalse(
				BLEUtils.isSfloatNan(result1.getIntermediateCuffPressureCompoundValueDiastolicUnused().getData(), 0));
		assertFalse(BLEUtils.isSfloatNan(
				result1.getIntermediateCuffPressureCompoundValueMeanArterialPressureUnused().getData(), 0));
	}

	@Test
	public void test_constructor110() {
		//@formatter:off
        byte[] data = new byte[14];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);
        data[ 7] = (byte) 9999;
        data[ 8] = (byte) (9999 >> 8);
        data[ 9] = DateTimeUtils.MONTH_AUGUST;
        data[10] = 31;
        data[11] = 0;
        data[12] = 0;
        data[13] = 0;
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertEquals(BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
				| BloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT
				| BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT, result1.getFlags());
		assertEquals(9999, result1.getYear());
		assertEquals(DateTimeUtils.MONTH_AUGUST, result1.getMonth());
		assertEquals(31, result1.getDay());
		assertEquals(0, result1.getHours());
		assertEquals(0, result1.getMinutes());
		assertEquals(0, result1.getSeconds());
		assertFalse(
				BLEUtils.isSfloatNan(result1.getIntermediateCuffPressureCompoundValueDiastolicUnused().getData(), 0));
		assertFalse(BLEUtils.isSfloatNan(
				result1.getIntermediateCuffPressureCompoundValueMeanArterialPressureUnused().getData(), 0));
	}

	@Test
	public void test_constructor111() {
		//@formatter:off
        byte[] data = new byte[14];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);
        data[ 7] = (byte) 9999;
        data[ 8] = (byte) (9999 >> 8);
        data[ 9] = DateTimeUtils.MONTH_SEPTEMBER;
        data[10] = 31;
        data[11] = 0;
        data[12] = 0;
        data[13] = 0;
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertEquals(BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
				| BloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT
				| BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT, result1.getFlags());
		assertEquals(9999, result1.getYear());
		assertEquals(DateTimeUtils.MONTH_SEPTEMBER, result1.getMonth());
		assertEquals(31, result1.getDay());
		assertEquals(0, result1.getHours());
		assertEquals(0, result1.getMinutes());
		assertEquals(0, result1.getSeconds());
		assertFalse(
				BLEUtils.isSfloatNan(result1.getIntermediateCuffPressureCompoundValueDiastolicUnused().getData(), 0));
		assertFalse(BLEUtils.isSfloatNan(
				result1.getIntermediateCuffPressureCompoundValueMeanArterialPressureUnused().getData(), 0));
	}

	@Test
	public void test_constructor112() {
		//@formatter:off
        byte[] data = new byte[14];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);
        data[ 7] = (byte) 9999;
        data[ 8] = (byte) (9999 >> 8);
        data[ 9] = DateTimeUtils.MONTH_OCTOBER;
        data[10] = 31;
        data[11] = 0;
        data[12] = 0;
        data[13] = 0;
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertEquals(BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
				| BloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT
				| BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT, result1.getFlags());
		assertEquals(9999, result1.getYear());
		assertEquals(DateTimeUtils.MONTH_OCTOBER, result1.getMonth());
		assertEquals(31, result1.getDay());
		assertEquals(0, result1.getHours());
		assertEquals(0, result1.getMinutes());
		assertEquals(0, result1.getSeconds());
		assertFalse(
				BLEUtils.isSfloatNan(result1.getIntermediateCuffPressureCompoundValueDiastolicUnused().getData(), 0));
		assertFalse(BLEUtils.isSfloatNan(
				result1.getIntermediateCuffPressureCompoundValueMeanArterialPressureUnused().getData(), 0));
	}

	@Test
	public void test_constructor113() {
		//@formatter:off
        byte[] data = new byte[14];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);
        data[ 7] = (byte) 9999;
        data[ 8] = (byte) (9999 >> 8);
        data[ 9] = DateTimeUtils.MONTH_NOVEMBER;
        data[10] = 31;
        data[11] = 0;
        data[12] = 0;
        data[13] = 0;
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertEquals(BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
				| BloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT
				| BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT, result1.getFlags());
		assertEquals(9999, result1.getYear());
		assertEquals(DateTimeUtils.MONTH_NOVEMBER, result1.getMonth());
		assertEquals(31, result1.getDay());
		assertEquals(0, result1.getHours());
		assertEquals(0, result1.getMinutes());
		assertEquals(0, result1.getSeconds());
		assertFalse(
				BLEUtils.isSfloatNan(result1.getIntermediateCuffPressureCompoundValueDiastolicUnused().getData(), 0));
		assertFalse(BLEUtils.isSfloatNan(
				result1.getIntermediateCuffPressureCompoundValueMeanArterialPressureUnused().getData(), 0));
	}

	@Test
	public void test_constructor114() {
		//@formatter:off
        byte[] data = new byte[14];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);
        data[ 7] = (byte) 9999;
        data[ 8] = (byte) (9999 >> 8);
        data[ 9] = DateTimeUtils.MONTH_DECEMBER;
        data[10] = 31;
        data[11] = 0;
        data[12] = 0;
        data[13] = 0;
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertEquals(BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
				| BloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT
				| BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT, result1.getFlags());
		assertEquals(9999, result1.getYear());
		assertEquals(DateTimeUtils.MONTH_DECEMBER, result1.getMonth());
		assertEquals(31, result1.getDay());
		assertEquals(0, result1.getHours());
		assertEquals(0, result1.getMinutes());
		assertEquals(0, result1.getSeconds());
		assertFalse(
				BLEUtils.isSfloatNan(result1.getIntermediateCuffPressureCompoundValueDiastolicUnused().getData(), 0));
		assertFalse(BLEUtils.isSfloatNan(
				result1.getIntermediateCuffPressureCompoundValueMeanArterialPressureUnused().getData(), 0));
	}

	@Test
	public void test_constructor201() {
		//@formatter:off
        byte[] data = new byte[7];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertEquals(BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
				| BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT, result1.getFlags());
		assertFalse(
				BLEUtils.isSfloatNan(result1.getIntermediateCuffPressureCompoundValueDiastolicUnused().getData(), 0));
		assertFalse(BLEUtils.isSfloatNan(
				result1.getIntermediateCuffPressureCompoundValueMeanArterialPressureUnused().getData(), 0));
	}

	@Test
	public void test_constructor202() {
		//@formatter:off
        byte[] data = new byte[9];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);
        data[ 7] = (byte) 0x0004;
        data[ 8] = (byte) (0x0004 >> 8);
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertEquals(BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
				| BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_PULSE_RATE_PRESENT
				| BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT, result1.getFlags());
		assertEquals(0x0004, result1.getPulseRate().getSfloat(), 0);
		assertFalse(
				BLEUtils.isSfloatNan(result1.getIntermediateCuffPressureCompoundValueDiastolicUnused().getData(), 0));
		assertFalse(BLEUtils.isSfloatNan(
				result1.getIntermediateCuffPressureCompoundValueMeanArterialPressureUnused().getData(), 0));
	}

	@Test
	public void test_constructor301() {
		//@formatter:off
        byte[] data = new byte[7];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertEquals(BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
				| BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT, result1.getFlags());
		assertFalse(
				BLEUtils.isSfloatNan(result1.getIntermediateCuffPressureCompoundValueDiastolicUnused().getData(), 0));
		assertFalse(BLEUtils.isSfloatNan(
				result1.getIntermediateCuffPressureCompoundValueMeanArterialPressureUnused().getData(), 0));
	}

	@Test
	public void test_constructor302() {
		//@formatter:off
        byte[] data = new byte[8];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);
        data[ 7] = (byte) UserIndexUtils.USER_ID_UNKNOWN_USER;
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertEquals(BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
				| BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_USER_ID_PRESENT
				| BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT, result1.getFlags());
		assertEquals(UserIndexUtils.USER_ID_UNKNOWN_USER, result1.getUserId());
		assertFalse(
				BLEUtils.isSfloatNan(result1.getIntermediateCuffPressureCompoundValueDiastolicUnused().getData(), 0));
		assertFalse(BLEUtils.isSfloatNan(
				result1.getIntermediateCuffPressureCompoundValueMeanArterialPressureUnused().getData(), 0));
	}

	@Test
	public void test_constructor303() {
		//@formatter:off
        byte[] data = new byte[8];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);
        data[ 7] = 0x04;
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertEquals(BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
				| BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_USER_ID_PRESENT
				| BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT, result1.getFlags());
		assertEquals(0x04, result1.getUserId());
		assertFalse(
				BLEUtils.isSfloatNan(result1.getIntermediateCuffPressureCompoundValueDiastolicUnused().getData(), 0));
		assertFalse(BLEUtils.isSfloatNan(
				result1.getIntermediateCuffPressureCompoundValueMeanArterialPressureUnused().getData(), 0));
	}

	@Test
	public void test_constructor401() {
		//@formatter:off
        byte[] data = new byte[7];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertEquals(BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
				| BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT, result1.getFlags());
		assertFalse(
				BLEUtils.isSfloatNan(result1.getIntermediateCuffPressureCompoundValueDiastolicUnused().getData(), 0));
		assertFalse(BLEUtils.isSfloatNan(
				result1.getIntermediateCuffPressureCompoundValueMeanArterialPressureUnused().getData(), 0));
	}

	@Test
	public void test_constructor402() {
		//@formatter:off
        byte[] data = new byte[9];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);

        int measurementStatusFlag = BloodPressureMeasurementUtils.MEASUREMENT_STATUS_BODY_MOVEMENT_DETECTION_NO_BODY_MOVEMENT
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_CUFF_FIT_DETECTION_CUFF_FITS_PROPERLY
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_IRREGULAR_PULSE_DETECTION_NO_IRREGULAR_PULSE_DETECTED
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_PULSE_RATE_RANGE_DETECTION_PULSE_RATE_IS_WITHIN_THE_RANGE
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_MEASUREMENT_POSITION_DETECTION_PROPER_MEASUREMENT_POSITION;
        data[ 7] = (byte) measurementStatusFlag;
        data[ 8] = (byte) (measurementStatusFlag >> 8);
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertEquals(BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
				| BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_PRESENT, result1.getFlags());
		assertArrayEquals(Arrays.copyOfRange(data, 7, 9), result1.getMeasurementStatus());
		assertFalse(
				BLEUtils.isSfloatNan(result1.getIntermediateCuffPressureCompoundValueDiastolicUnused().getData(), 0));
		assertFalse(BLEUtils.isSfloatNan(
				result1.getIntermediateCuffPressureCompoundValueMeanArterialPressureUnused().getData(), 0));
	}

	@Test
	public void test_constructor403() {
		//@formatter:off
        byte[] data = new byte[9];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);

        int measurementStatusFlag = BloodPressureMeasurementUtils.MEASUREMENT_STATUS_BODY_MOVEMENT_DETECTION_BODY_MOVEMENT_DURING_MEASUREMENT
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_CUFF_FIT_DETECTION_CUFF_FITS_PROPERLY
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_IRREGULAR_PULSE_DETECTION_NO_IRREGULAR_PULSE_DETECTED
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_PULSE_RATE_RANGE_DETECTION_PULSE_RATE_IS_WITHIN_THE_RANGE
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_MEASUREMENT_POSITION_DETECTION_PROPER_MEASUREMENT_POSITION;
        data[ 7] = (byte) measurementStatusFlag;
        data[ 8] = (byte) (measurementStatusFlag >> 8);
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertEquals(BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
				| BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_PRESENT, result1.getFlags());
		assertArrayEquals(Arrays.copyOfRange(data, 7, 9), result1.getMeasurementStatus());
		assertFalse(
				BLEUtils.isSfloatNan(result1.getIntermediateCuffPressureCompoundValueDiastolicUnused().getData(), 0));
		assertFalse(BLEUtils.isSfloatNan(
				result1.getIntermediateCuffPressureCompoundValueMeanArterialPressureUnused().getData(), 0));
	}

	@Test
	public void test_constructor404() {
		//@formatter:off
        byte[] data = new byte[9];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);

        int measurementStatusFlag = BloodPressureMeasurementUtils.MEASUREMENT_STATUS_BODY_MOVEMENT_DETECTION_NO_BODY_MOVEMENT
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_CUFF_FIT_DETECTION_CUFF_TOO_LOOSE
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_IRREGULAR_PULSE_DETECTION_NO_IRREGULAR_PULSE_DETECTED
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_PULSE_RATE_RANGE_DETECTION_PULSE_RATE_IS_WITHIN_THE_RANGE
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_MEASUREMENT_POSITION_DETECTION_PROPER_MEASUREMENT_POSITION;
        data[ 7] = (byte) measurementStatusFlag;
        data[ 8] = (byte) (measurementStatusFlag >> 8);
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertEquals(BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
				| BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_PRESENT, result1.getFlags());
		assertArrayEquals(Arrays.copyOfRange(data, 7, 9), result1.getMeasurementStatus());
		assertFalse(
				BLEUtils.isSfloatNan(result1.getIntermediateCuffPressureCompoundValueDiastolicUnused().getData(), 0));
		assertFalse(BLEUtils.isSfloatNan(
				result1.getIntermediateCuffPressureCompoundValueMeanArterialPressureUnused().getData(), 0));
	}

	@Test
	public void test_constructor405() {
		//@formatter:off
        byte[] data = new byte[9];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);

        int measurementStatusFlag = BloodPressureMeasurementUtils.MEASUREMENT_STATUS_BODY_MOVEMENT_DETECTION_NO_BODY_MOVEMENT
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_CUFF_FIT_DETECTION_CUFF_FITS_PROPERLY
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_IRREGULAR_PULSE_DETECTION_IRREGULAR_PULSE_DETECTED
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_PULSE_RATE_RANGE_DETECTION_PULSE_RATE_IS_WITHIN_THE_RANGE
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_MEASUREMENT_POSITION_DETECTION_PROPER_MEASUREMENT_POSITION;
        data[ 7] = (byte) measurementStatusFlag;
        data[ 8] = (byte) (measurementStatusFlag >> 8);
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertEquals(BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
				| BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_PRESENT, result1.getFlags());
		assertArrayEquals(Arrays.copyOfRange(data, 7, 9), result1.getMeasurementStatus());
		assertFalse(
				BLEUtils.isSfloatNan(result1.getIntermediateCuffPressureCompoundValueDiastolicUnused().getData(), 0));
		assertFalse(BLEUtils.isSfloatNan(
				result1.getIntermediateCuffPressureCompoundValueMeanArterialPressureUnused().getData(), 0));
	}

	@Test
	public void test_constructor406() {
		//@formatter:off
        byte[] data = new byte[9];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);

        int measurementStatusFlag = BloodPressureMeasurementUtils.MEASUREMENT_STATUS_BODY_MOVEMENT_DETECTION_NO_BODY_MOVEMENT
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_CUFF_FIT_DETECTION_CUFF_FITS_PROPERLY
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_IRREGULAR_PULSE_DETECTION_NO_IRREGULAR_PULSE_DETECTED
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_PULSE_RATE_RANGE_DETECTION_PULSE_RATE_EXCEEDS_UPPER_LIMIT
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_MEASUREMENT_POSITION_DETECTION_PROPER_MEASUREMENT_POSITION;
        data[ 7] = (byte) measurementStatusFlag;
        data[ 8] = (byte) (measurementStatusFlag >> 8);
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertEquals(BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
				| BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_PRESENT, result1.getFlags());
		assertArrayEquals(Arrays.copyOfRange(data, 7, 9), result1.getMeasurementStatus());
		assertFalse(
				BLEUtils.isSfloatNan(result1.getIntermediateCuffPressureCompoundValueDiastolicUnused().getData(), 0));
		assertFalse(BLEUtils.isSfloatNan(
				result1.getIntermediateCuffPressureCompoundValueMeanArterialPressureUnused().getData(), 0));
	}

	@Test
	public void test_constructor407() {
		//@formatter:off
        byte[] data = new byte[9];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);

        int measurementStatusFlag = BloodPressureMeasurementUtils.MEASUREMENT_STATUS_BODY_MOVEMENT_DETECTION_NO_BODY_MOVEMENT
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_CUFF_FIT_DETECTION_CUFF_FITS_PROPERLY
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_IRREGULAR_PULSE_DETECTION_NO_IRREGULAR_PULSE_DETECTED
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_PULSE_RATE_RANGE_DETECTION_PULSE_RATE_IS_LESS_THAN_LOWER_LIMIT
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_MEASUREMENT_POSITION_DETECTION_PROPER_MEASUREMENT_POSITION;
        data[ 7] = (byte) measurementStatusFlag;
        data[ 8] = (byte) (measurementStatusFlag >> 8);
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertEquals(BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
				| BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_PRESENT, result1.getFlags());
		assertArrayEquals(Arrays.copyOfRange(data, 7, 9), result1.getMeasurementStatus());
		assertFalse(
				BLEUtils.isSfloatNan(result1.getIntermediateCuffPressureCompoundValueDiastolicUnused().getData(), 0));
		assertFalse(BLEUtils.isSfloatNan(
				result1.getIntermediateCuffPressureCompoundValueMeanArterialPressureUnused().getData(), 0));
	}

	@Test
	public void test_constructor408() {
		//@formatter:off
        byte[] data = new byte[9];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);

        int measurementStatusFlag = BloodPressureMeasurementUtils.MEASUREMENT_STATUS_BODY_MOVEMENT_DETECTION_NO_BODY_MOVEMENT
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_CUFF_FIT_DETECTION_CUFF_FITS_PROPERLY
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_IRREGULAR_PULSE_DETECTION_NO_IRREGULAR_PULSE_DETECTED
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_PULSE_RATE_RANGE_DETECTION_PULSE_RATE_IS_WITHIN_THE_RANGE
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_MEASUREMENT_POSITION_DETECTION_IMPROPER_MEASUREMENT_POSITION;
        data[ 7] = (byte) measurementStatusFlag;
        data[ 8] = (byte) (measurementStatusFlag >> 8);
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertEquals(BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
				| BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
				| BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_PRESENT, result1.getFlags());
		assertArrayEquals(Arrays.copyOfRange(data, 7, 9), result1.getMeasurementStatus());
		assertFalse(
				BLEUtils.isSfloatNan(result1.getIntermediateCuffPressureCompoundValueDiastolicUnused().getData(), 0));
		assertFalse(BLEUtils.isSfloatNan(
				result1.getIntermediateCuffPressureCompoundValueMeanArterialPressureUnused().getData(), 0));
	}

	@Test
	public void test_constructor501() {
		//@formatter:off
        byte[] data = new byte[19];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);
        data[ 7] = (byte) 0x0004;
        data[ 8] = (byte) (0x0004 >> 8);
        data[ 9] = 0x05;
        data[10] = 0x06;
        data[11] = 0x07;
        data[12] = 0x08;
        data[13] = 0x09;
        data[14] = (byte) 0x0a;
        data[15] = (byte) (0x0a >> 8);
        data[16] = 0x0b;

        int measurementStatusFlag = BloodPressureMeasurementUtils.MEASUREMENT_STATUS_BODY_MOVEMENT_DETECTION_BODY_MOVEMENT_DURING_MEASUREMENT
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_CUFF_FIT_DETECTION_CUFF_FITS_PROPERLY
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_IRREGULAR_PULSE_DETECTION_IRREGULAR_PULSE_DETECTED
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_PULSE_RATE_RANGE_DETECTION_PULSE_RATE_IS_WITHIN_THE_RANGE
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_MEASUREMENT_POSITION_DETECTION_IMPROPER_MEASUREMENT_POSITION;
        data[17] = (byte) measurementStatusFlag;
        data[18] = (byte) (measurementStatusFlag >> 8);
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertEquals(BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
				| BloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT
				| BloodPressureMeasurementUtils.FLAG_PULSE_RATE_PRESENT
				| BloodPressureMeasurementUtils.FLAG_USER_ID_PRESENT
				| BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_PRESENT, result1.getFlags());
		assertEquals(1, result1.getIntermediateCuffPressureCompoundValueCurrentCuffPressureMmhg().getSfloat(), 0);
		assertEquals(2, result1.getIntermediateCuffPressureCompoundValueDiastolicUnused().getSfloat(), 0);
		assertEquals(3, result1.getIntermediateCuffPressureCompoundValueMeanArterialPressureUnused().getSfloat(), 0);
		assertEquals(0x0004, result1.getYear());
		assertEquals(0x05, result1.getMonth());
		assertEquals(0x06, result1.getDay());
		assertEquals(0x07, result1.getHours());
		assertEquals(0x08, result1.getMinutes());
		assertEquals(0x09, result1.getSeconds());
		assertEquals(10, result1.getPulseRate().getSfloat(), 0);
		assertEquals(0x0b, result1.getUserId());
		assertArrayEquals(Arrays.copyOfRange(data, 17, 19), result1.getMeasurementStatus());
		assertFalse(
				BLEUtils.isSfloatNan(result1.getIntermediateCuffPressureCompoundValueDiastolicUnused().getData(), 0));
		assertFalse(BLEUtils.isSfloatNan(
				result1.getIntermediateCuffPressureCompoundValueMeanArterialPressureUnused().getData(), 0));
	}

	@Test
	public void test_constructor502() {
		//@formatter:off
        byte[] data = new byte[19];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_KPA
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);
        data[ 7] = (byte) 0x0004;
        data[ 8] = (byte) (0x0004 >> 8);
        data[ 9] = 0x05;
        data[10] = 0x06;
        data[11] = 0x07;
        data[12] = 0x08;
        data[13] = 0x09;
        data[14] = (byte) 0x0a;
        data[15] = (byte) (0x0a >> 8);
        data[16] = 0x0b;

        int measurementStatusFlag = BloodPressureMeasurementUtils.MEASUREMENT_STATUS_BODY_MOVEMENT_DETECTION_BODY_MOVEMENT_DURING_MEASUREMENT
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_CUFF_FIT_DETECTION_CUFF_FITS_PROPERLY
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_IRREGULAR_PULSE_DETECTION_IRREGULAR_PULSE_DETECTED
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_PULSE_RATE_RANGE_DETECTION_PULSE_RATE_IS_WITHIN_THE_RANGE
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_MEASUREMENT_POSITION_DETECTION_IMPROPER_MEASUREMENT_POSITION;
        data[17] = (byte) measurementStatusFlag;
        data[18] = (byte) (measurementStatusFlag >> 8);
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertEquals(BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_KPA
				| BloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT
				| BloodPressureMeasurementUtils.FLAG_PULSE_RATE_PRESENT
				| BloodPressureMeasurementUtils.FLAG_USER_ID_PRESENT
				| BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_PRESENT, result1.getFlags());
		assertEquals(1, result1.getIntermediateCuffPressureCompoundValueCurrentCuffPressureKpa().getSfloat(), 0);
		assertEquals(2, result1.getIntermediateCuffPressureCompoundValueDiastolicUnused().getSfloat(), 0);
		assertEquals(3, result1.getIntermediateCuffPressureCompoundValueMeanArterialPressureUnused().getSfloat(), 0);
		assertEquals(0x0004, result1.getYear());
		assertEquals(0x05, result1.getMonth());
		assertEquals(0x06, result1.getDay());
		assertEquals(0x07, result1.getHours());
		assertEquals(0x08, result1.getMinutes());
		assertEquals(0x09, result1.getSeconds());
		assertEquals(10, result1.getPulseRate().getSfloat(), 0);
		assertEquals(0x0b, result1.getUserId());
		assertArrayEquals(Arrays.copyOfRange(data, 17, 19), result1.getMeasurementStatus());
		assertFalse(
				BLEUtils.isSfloatNan(result1.getIntermediateCuffPressureCompoundValueDiastolicUnused().getData(), 0));
		assertFalse(BLEUtils.isSfloatNan(
				result1.getIntermediateCuffPressureCompoundValueMeanArterialPressureUnused().getData(), 0));
	}

	@Test
	public void test_constructor503() {
		int flags = 1;
		IEEE_11073_20601_SFLOAT intermediateCuffPressureCompoundValueCurrentCuffPressureMmhg = new IEEE_11073_20601_SFLOAT(
				new byte[] { 2, 3 }, 0);
		IEEE_11073_20601_SFLOAT intermediateCuffPressureCompoundValueCurrentCuffPressureKpa = new IEEE_11073_20601_SFLOAT(
				new byte[] { 4, 5 }, 0);
		IEEE_11073_20601_SFLOAT bloodPressureMeasurementCompoundValueDiastolicUnused = new IEEE_11073_20601_SFLOAT(
				new byte[] { (byte) BLEUtils.SFLOAT_NAN, (byte) (BLEUtils.SFLOAT_NAN >> 8) }, 0);
		IEEE_11073_20601_SFLOAT bloodPressureMeasurementCompoundValueMeanArterialPressureUnused = new IEEE_11073_20601_SFLOAT(
				new byte[] { (byte) BLEUtils.SFLOAT_NAN, (byte) (BLEUtils.SFLOAT_NAN >> 8) }, 0);
		int year = 6;
		int month = 7;
		int day = 8;
		int hours = 9;
		int minutes = 10;
		int seconds = 11;
		IEEE_11073_20601_SFLOAT pulseRate = new IEEE_11073_20601_SFLOAT(new byte[] { 12, 13 }, 0);
		int userId = 14;
		byte[] measurementStatus = new byte[] { 15 };

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(flags,
				intermediateCuffPressureCompoundValueCurrentCuffPressureMmhg,
				intermediateCuffPressureCompoundValueCurrentCuffPressureKpa,
				bloodPressureMeasurementCompoundValueDiastolicUnused,
				bloodPressureMeasurementCompoundValueMeanArterialPressureUnused, year, month, day, hours, minutes,
				seconds, pulseRate, userId, measurementStatus);
		assertEquals(flags, result1.getFlags());
		assertEquals(intermediateCuffPressureCompoundValueCurrentCuffPressureMmhg,
				result1.getIntermediateCuffPressureCompoundValueCurrentCuffPressureMmhg());
		assertEquals(intermediateCuffPressureCompoundValueCurrentCuffPressureKpa,
				result1.getIntermediateCuffPressureCompoundValueCurrentCuffPressureKpa());
		assertEquals(bloodPressureMeasurementCompoundValueDiastolicUnused,
				result1.getIntermediateCuffPressureCompoundValueDiastolicUnused());
		assertEquals(bloodPressureMeasurementCompoundValueMeanArterialPressureUnused,
				result1.getIntermediateCuffPressureCompoundValueMeanArterialPressureUnused());
		assertTrue(
				BLEUtils.isSfloatNan(result1.getIntermediateCuffPressureCompoundValueDiastolicUnused().getData(), 0));
		assertTrue(BLEUtils.isSfloatNan(
				result1.getIntermediateCuffPressureCompoundValueMeanArterialPressureUnused().getData(), 0));
		assertEquals(year, result1.getYear());
		assertEquals(month, result1.getMonth());
		assertEquals(day, result1.getDay());
		assertEquals(hours, result1.getHours());
		assertEquals(minutes, result1.getMinutes());
		assertEquals(seconds, result1.getSeconds());
		assertEquals(pulseRate, result1.getPulseRate());
		assertEquals(userId, result1.getUserId());
		assertArrayEquals(measurementStatus, result1.getMeasurementStatus());
	}

	@Test
	public void test_parcelable101() {
		//@formatter:off
        byte[] data = new byte[7];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable102() {
		//@formatter:off
        byte[] data = new byte[7];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_KPA
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable103() {
		//@formatter:off
        byte[] data = new byte[7];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable104() {
		//@formatter:off
        byte[] data = new byte[14];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);
        data[ 7] = (byte) 1582;
        data[ 8] = (byte) (1582 >> 8);
        data[ 9] = DateTimeUtils.MONTH_IS_NOT_KNOWN;
        data[10] = DateTimeUtils.DAY_OF_MONTH_IS_NOT_KNOWN;
        data[11] = 0;
        data[12] = 0;
        data[13] = 0;
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable105() {
		//@formatter:off
        byte[] data = new byte[14];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);
        data[ 7] = (byte) 9999;
        data[ 8] = (byte) (9999 >> 8);
        data[ 9] = DateTimeUtils.MONTH_JANUARY;
        data[10] = 1;
        data[11] = 23;
        data[12] = 59;
        data[13] = 59;
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable106() {
		//@formatter:off
        byte[] data = new byte[14];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);
        data[ 7] = (byte) 9999;
        data[ 8] = (byte) (9999 >> 8);
        data[ 9] = DateTimeUtils.MONTH_FEBRUARY;
        data[10] = 31;
        data[11] = 0;
        data[12] = 0;
        data[13] = 0;
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable107() {
		//@formatter:off
        byte[] data = new byte[14];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);
        data[ 7] = (byte) 9999;
        data[ 8] = (byte) (9999 >> 8);
        data[ 9] = DateTimeUtils.MONTH_MAY;
        data[10] = 31;
        data[11] = 0;
        data[12] = 0;
        data[13] = 0;
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable108() {
		//@formatter:off
        byte[] data = new byte[14];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);
        data[ 7] = (byte) 9999;
        data[ 8] = (byte) (9999 >> 8);
        data[ 9] = DateTimeUtils.MONTH_APRIL;
        data[10] = 31;
        data[11] = 0;
        data[12] = 0;
        data[13] = 0;
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable109() {
		//@formatter:off
        byte[] data = new byte[14];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);
        data[ 7] = (byte) 9999;
        data[ 8] = (byte) (9999 >> 8);
        data[ 9] = DateTimeUtils.MONTH_MAY;
        data[10] = 31;
        data[11] = 0;
        data[12] = 0;
        data[13] = 0;
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable110() {
		//@formatter:off
        byte[] data = new byte[14];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);
        data[ 7] = (byte) 9999;
        data[ 8] = (byte) (9999 >> 8);
        data[ 9] = DateTimeUtils.MONTH_JUNE;
        data[10] = 31;
        data[11] = 0;
        data[12] = 0;
        data[13] = 0;
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable111() {
		//@formatter:off
        byte[] data = new byte[14];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);
        data[ 7] = (byte) 9999;
        data[ 8] = (byte) (9999 >> 8);
        data[ 9] = DateTimeUtils.MONTH_JULY;
        data[10] = 31;
        data[11] = 0;
        data[12] = 0;
        data[13] = 0;
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable112() {
		//@formatter:off
        byte[] data = new byte[14];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);
        data[ 7] = (byte) 9999;
        data[ 8] = (byte) (9999 >> 8);
        data[ 9] = DateTimeUtils.MONTH_AUGUST;
        data[10] = 31;
        data[11] = 0;
        data[12] = 0;
        data[13] = 0;
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable113() {
		//@formatter:off
        byte[] data = new byte[14];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);
        data[ 7] = (byte) 9999;
        data[ 8] = (byte) (9999 >> 8);
        data[ 9] = DateTimeUtils.MONTH_SEPTEMBER;
        data[10] = 31;
        data[11] = 0;
        data[12] = 0;
        data[13] = 0;
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable114() {
		//@formatter:off
        byte[] data = new byte[14];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);
        data[ 7] = (byte) 9999;
        data[ 8] = (byte) (9999 >> 8);
        data[ 9] = DateTimeUtils.MONTH_OCTOBER;
        data[10] = 31;
        data[11] = 0;
        data[12] = 0;
        data[13] = 0;
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable115() {
		//@formatter:off
        byte[] data = new byte[14];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);
        data[ 7] = (byte) 9999;
        data[ 8] = (byte) (9999 >> 8);
        data[ 9] = DateTimeUtils.MONTH_NOVEMBER;
        data[10] = 31;
        data[11] = 0;
        data[12] = 0;
        data[13] = 0;
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable116() {
		//@formatter:off
        byte[] data = new byte[14];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);
        data[ 7] = (byte) 9999;
        data[ 8] = (byte) (9999 >> 8);
        data[ 9] = DateTimeUtils.MONTH_DECEMBER;
        data[10] = 31;
        data[11] = 0;
        data[12] = 0;
        data[13] = 0;
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable117() {
		//@formatter:off
        byte[] data = new byte[7];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable118() {
		//@formatter:off
        byte[] data = new byte[9];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);
        data[ 7] = (byte) 0x0004;
        data[ 8] = (byte) (0x0004 >> 8);
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable119() {
		//@formatter:off
        byte[] data = new byte[7];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable120() {
		//@formatter:off
        byte[] data = new byte[8];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);
        data[ 7] = (byte) UserIndexUtils.USER_ID_UNKNOWN_USER;
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable121() {
		//@formatter:off
        byte[] data = new byte[8];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);
        data[ 7] = 0x04;
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable122() {
		//@formatter:off
        byte[] data = new byte[7];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable123() {
		//@formatter:off
        byte[] data = new byte[9];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);

        int measurementStatusFlag = BloodPressureMeasurementUtils.MEASUREMENT_STATUS_BODY_MOVEMENT_DETECTION_NO_BODY_MOVEMENT
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_CUFF_FIT_DETECTION_CUFF_FITS_PROPERLY
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_IRREGULAR_PULSE_DETECTION_NO_IRREGULAR_PULSE_DETECTED
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_PULSE_RATE_RANGE_DETECTION_PULSE_RATE_IS_WITHIN_THE_RANGE
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_MEASUREMENT_POSITION_DETECTION_PROPER_MEASUREMENT_POSITION;
        data[ 7] = (byte) measurementStatusFlag;
        data[ 8] = (byte) (measurementStatusFlag >> 8);
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable124() {
		//@formatter:off
        byte[] data = new byte[9];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);

        int measurementStatusFlag = BloodPressureMeasurementUtils.MEASUREMENT_STATUS_BODY_MOVEMENT_DETECTION_BODY_MOVEMENT_DURING_MEASUREMENT
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_CUFF_FIT_DETECTION_CUFF_FITS_PROPERLY
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_IRREGULAR_PULSE_DETECTION_NO_IRREGULAR_PULSE_DETECTED
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_PULSE_RATE_RANGE_DETECTION_PULSE_RATE_IS_WITHIN_THE_RANGE
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_MEASUREMENT_POSITION_DETECTION_PROPER_MEASUREMENT_POSITION;
        data[ 7] = (byte) measurementStatusFlag;
        data[ 8] = (byte) (measurementStatusFlag >> 8);
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable125() {
		//@formatter:off
        byte[] data = new byte[9];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);

        int measurementStatusFlag = BloodPressureMeasurementUtils.MEASUREMENT_STATUS_BODY_MOVEMENT_DETECTION_NO_BODY_MOVEMENT
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_CUFF_FIT_DETECTION_CUFF_TOO_LOOSE
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_IRREGULAR_PULSE_DETECTION_NO_IRREGULAR_PULSE_DETECTED
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_PULSE_RATE_RANGE_DETECTION_PULSE_RATE_IS_WITHIN_THE_RANGE
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_MEASUREMENT_POSITION_DETECTION_PROPER_MEASUREMENT_POSITION;
        data[ 7] = (byte) measurementStatusFlag;
        data[ 8] = (byte) (measurementStatusFlag >> 8);
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable126() {
		//@formatter:off
        byte[] data = new byte[9];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);

        int measurementStatusFlag = BloodPressureMeasurementUtils.MEASUREMENT_STATUS_BODY_MOVEMENT_DETECTION_NO_BODY_MOVEMENT
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_CUFF_FIT_DETECTION_CUFF_FITS_PROPERLY
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_IRREGULAR_PULSE_DETECTION_IRREGULAR_PULSE_DETECTED
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_PULSE_RATE_RANGE_DETECTION_PULSE_RATE_IS_WITHIN_THE_RANGE
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_MEASUREMENT_POSITION_DETECTION_PROPER_MEASUREMENT_POSITION;
        data[ 7] = (byte) measurementStatusFlag;
        data[ 8] = (byte) (measurementStatusFlag >> 8);
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable127() {
		//@formatter:off
        byte[] data = new byte[9];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);

        int measurementStatusFlag = BloodPressureMeasurementUtils.MEASUREMENT_STATUS_BODY_MOVEMENT_DETECTION_NO_BODY_MOVEMENT
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_CUFF_FIT_DETECTION_CUFF_FITS_PROPERLY
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_IRREGULAR_PULSE_DETECTION_NO_IRREGULAR_PULSE_DETECTED
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_PULSE_RATE_RANGE_DETECTION_PULSE_RATE_EXCEEDS_UPPER_LIMIT
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_MEASUREMENT_POSITION_DETECTION_PROPER_MEASUREMENT_POSITION;
        data[ 7] = (byte) measurementStatusFlag;
        data[ 8] = (byte) (measurementStatusFlag >> 8);
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable128() {
		//@formatter:off
        byte[] data = new byte[9];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);

        int measurementStatusFlag = BloodPressureMeasurementUtils.MEASUREMENT_STATUS_BODY_MOVEMENT_DETECTION_NO_BODY_MOVEMENT
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_CUFF_FIT_DETECTION_CUFF_FITS_PROPERLY
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_IRREGULAR_PULSE_DETECTION_NO_IRREGULAR_PULSE_DETECTED
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_PULSE_RATE_RANGE_DETECTION_PULSE_RATE_IS_LESS_THAN_LOWER_LIMIT
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_MEASUREMENT_POSITION_DETECTION_PROPER_MEASUREMENT_POSITION;
        data[ 7] = (byte) measurementStatusFlag;
        data[ 8] = (byte) (measurementStatusFlag >> 8);
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable129() {
		//@formatter:off
        byte[] data = new byte[9];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);

        int measurementStatusFlag = BloodPressureMeasurementUtils.MEASUREMENT_STATUS_BODY_MOVEMENT_DETECTION_NO_BODY_MOVEMENT
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_CUFF_FIT_DETECTION_CUFF_FITS_PROPERLY
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_IRREGULAR_PULSE_DETECTION_NO_IRREGULAR_PULSE_DETECTED
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_PULSE_RATE_RANGE_DETECTION_PULSE_RATE_IS_WITHIN_THE_RANGE
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_MEASUREMENT_POSITION_DETECTION_IMPROPER_MEASUREMENT_POSITION;
        data[ 7] = (byte) measurementStatusFlag;
        data[ 8] = (byte) (measurementStatusFlag >> 8);
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable130() {
		//@formatter:off
        byte[] data = new byte[19];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);
        data[ 7] = (byte) 0x0004;
        data[ 8] = (byte) (0x0004 >> 8);
        data[ 9] = 0x05;
        data[10] = 0x06;
        data[11] = 0x07;
        data[12] = 0x08;
        data[13] = 0x09;
        data[14] = (byte) 0x0a;
        data[15] = (byte) (0x0a >> 8);
        data[16] = 0x0b;

        int measurementStatusFlag = BloodPressureMeasurementUtils.MEASUREMENT_STATUS_BODY_MOVEMENT_DETECTION_BODY_MOVEMENT_DURING_MEASUREMENT
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_CUFF_FIT_DETECTION_CUFF_FITS_PROPERLY
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_IRREGULAR_PULSE_DETECTION_IRREGULAR_PULSE_DETECTED
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_PULSE_RATE_RANGE_DETECTION_PULSE_RATE_IS_WITHIN_THE_RANGE
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_MEASUREMENT_POSITION_DETECTION_IMPROPER_MEASUREMENT_POSITION;
        data[17] = (byte) measurementStatusFlag;
        data[18] = (byte) (measurementStatusFlag >> 8);
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable131() {
		//@formatter:off
        byte[] data = new byte[19];
        data[ 0] = BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_KPA
                | BloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT
                | BloodPressureMeasurementUtils.FLAG_PULSE_RATE_PRESENT
                | BloodPressureMeasurementUtils.FLAG_USER_ID_PRESENT
                | BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_PRESENT;
        data[ 1] = (byte) 0x0001;
        data[ 2] = (byte) (0x0001 >> 8);
        data[ 3] = (byte) 0x0002;
        data[ 4] = (byte) (0x0002 >> 8);
        data[ 5] = (byte) 0x0003;
        data[ 6] = (byte) (0x0003 >> 8);
        data[ 7] = (byte) 0x0004;
        data[ 8] = (byte) (0x0004 >> 8);
        data[ 9] = 0x05;
        data[10] = 0x06;
        data[11] = 0x07;
        data[12] = 0x08;
        data[13] = 0x09;
        data[14] = (byte) 0x0a;
        data[15] = (byte) (0x0a >> 8);
        data[16] = 0x0b;

        int measurementStatusFlag = BloodPressureMeasurementUtils.MEASUREMENT_STATUS_BODY_MOVEMENT_DETECTION_BODY_MOVEMENT_DURING_MEASUREMENT
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_CUFF_FIT_DETECTION_CUFF_FITS_PROPERLY
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_IRREGULAR_PULSE_DETECTION_IRREGULAR_PULSE_DETECTED
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_PULSE_RATE_RANGE_DETECTION_PULSE_RATE_IS_WITHIN_THE_RANGE
                | BloodPressureMeasurementUtils.MEASUREMENT_STATUS_MEASUREMENT_POSITION_DETECTION_IMPROPER_MEASUREMENT_POSITION;
        data[17] = (byte) measurementStatusFlag;
        data[18] = (byte) (measurementStatusFlag >> 8);
        //@formatter:on

		IntermediateCuffPressure result1 = new IntermediateCuffPressure(data);
		assertArrayEquals(data, result1.getBytes());
	}

}
