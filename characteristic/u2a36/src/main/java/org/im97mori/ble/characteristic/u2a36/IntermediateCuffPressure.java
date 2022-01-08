package org.im97mori.ble.characteristic.u2a36;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;
import org.im97mori.ble.characteristic.core.BloodPressureMeasurementUtils;
import org.im97mori.ble.characteristic.core.IEEE_11073_20601_SFLOAT;

import androidx.annotation.NonNull;

/**
 * Intermediate Cuff Pressure (Characteristics UUID: 0x2A36)
 */
public class IntermediateCuffPressure implements ByteArrayInterface {

	/**
	 * Flags
	 */
	private final int mFlags;

	/**
	 * Intermediate Cuff Pressure Compound Value - Current Cuff Pressure (mmHg)
	 */
	private final IEEE_11073_20601_SFLOAT mIntermediateCuffPressureCompoundValueCurrentCuffPressureMmhg;

	/**
	 * Intermediate Cuff Pressure Compound Value - Current Cuff Pressure (kPa)
	 */
	private final IEEE_11073_20601_SFLOAT mIntermediateCuffPressureCompoundValueCurrentCuffPressureKpa;

	/**
	 * Intermediate Cuff Pressure Compound Value - Diastolic (unused)
	 */
	private final IEEE_11073_20601_SFLOAT mIntermediateCuffPressureCompoundValueDiastolicUnused;

	/**
	 * Intermediate Cuff Pressure Compound Value - Mean Arterial Pressure (unused)
	 */
	private final IEEE_11073_20601_SFLOAT mIntermediateCuffPressureCompoundValueMeanArterialPressureUnused;

	/**
	 * Year
	 */
	private final int mYear;

	/**
	 * Month
	 */
	private final int mMonth;

	/**
	 * Day
	 */
	private final int mDay;

	/**
	 * Hours
	 */
	private final int mHours;

	/**
	 * Minutes
	 */
	private final int mMinutes;

	/**
	 * Seconds
	 */
	private final int mSeconds;

	/**
	 * Pulse Rate
	 */
	private final IEEE_11073_20601_SFLOAT mPulseRate;

	/**
	 * User ID
	 */
	private final int mUserId;

	/**
	 * Measurement Status
	 */
	private final byte[] mMeasurementStatus;

	/**
	 * Constructor from byte array
	 *
	 * @param values byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 */
	public IntermediateCuffPressure(@NonNull byte[] values) {
		int index = 0;
		mFlags = values[index++];
		if (BloodPressureMeasurementUtils.isFlagsBloodPressureUnitsMmhg(mFlags)) {
			mIntermediateCuffPressureCompoundValueCurrentCuffPressureMmhg = new IEEE_11073_20601_SFLOAT(values, index);
			mIntermediateCuffPressureCompoundValueCurrentCuffPressureKpa = new IEEE_11073_20601_SFLOAT(new byte[2], 0);
		} else {
			mIntermediateCuffPressureCompoundValueCurrentCuffPressureMmhg = new IEEE_11073_20601_SFLOAT(new byte[2], 0);
			mIntermediateCuffPressureCompoundValueCurrentCuffPressureKpa = new IEEE_11073_20601_SFLOAT(values, index);
		}
		index += 2;
		mIntermediateCuffPressureCompoundValueDiastolicUnused = new IEEE_11073_20601_SFLOAT(values, index);
		index += 2;
		mIntermediateCuffPressureCompoundValueMeanArterialPressureUnused = new IEEE_11073_20601_SFLOAT(values, index);
		index += 2;
		if (BloodPressureMeasurementUtils.isFlagsTimeStampPresent(mFlags)) {
			mYear = BLEUtils.createUInt16(values, index);
			index += 2;
			mMonth = (values[index++] & 0xff);
			mDay = (values[index++] & 0xff);
			mHours = (values[index++] & 0xff);
			mMinutes = (values[index++] & 0xff);
			mSeconds = (values[index++] & 0xff);
		} else {
			mYear = 0;
			mMonth = 0;
			mDay = 0;
			mHours = 0;
			mMinutes = 0;
			mSeconds = 0;
		}
		if (BloodPressureMeasurementUtils.isFlagsPulseRatePresent(mFlags)) {
			mPulseRate = new IEEE_11073_20601_SFLOAT(values, index);
			index += 2;
		} else {
			mPulseRate = new IEEE_11073_20601_SFLOAT(new byte[2], 0);
		}
		if (BloodPressureMeasurementUtils.isFlagsUserIdPresent(mFlags)) {
			mUserId = (values[index++] & 0xff);
		} else {
			mUserId = 0;
		}
		if (BloodPressureMeasurementUtils.isFlagsMeasurementStatusPresent(mFlags)) {
			mMeasurementStatus = Arrays.copyOfRange(values, index, index + 2);
		} else {
			mMeasurementStatus = new byte[0];
		}
	}

	/**
	 * Constructor from parameters
	 * 
	 * @param flags                                                           Flags
	 * @param intermediateCuffPressureCompoundValueCurrentCuffPressureMmhg    Intermediate
	 *                                                                        Cuff
	 *                                                                        Pressure
	 *                                                                        Compound
	 *                                                                        Value
	 *                                                                        -
	 *                                                                        Current
	 *                                                                        Cuff
	 *                                                                        Pressure
	 *                                                                        (mmHg)
	 * @param intermediateCuffPressureCompoundValueCurrentCuffPressureKpa     Intermediate
	 *                                                                        Cuff
	 *                                                                        Pressure
	 *                                                                        Compound
	 *                                                                        Value
	 *                                                                        -
	 *                                                                        Current
	 *                                                                        Cuff
	 *                                                                        Pressure
	 *                                                                        (kPa)
	 * @param intermediateCuffPressureCompoundValueDiastolicUnused            Intermediate
	 *                                                                        Cuff
	 *                                                                        Pressure
	 *                                                                        Compound
	 *                                                                        Value
	 *                                                                        -
	 *                                                                        Diastolic
	 *                                                                        (unused)
	 * @param intermediateCuffPressureCompoundValueMeanArterialPressureUnused Intermediate
	 *                                                                        Cuff
	 *                                                                        Pressure
	 *                                                                        Compound
	 *                                                                        Value
	 *                                                                        - Mean
	 *                                                                        Arterial
	 *                                                                        Pressure
	 *                                                                        (unused)
	 * @param year                                                            Year
	 * @param month                                                           Month
	 * @param day                                                             Day
	 * @param hours                                                           Hours
	 * @param minutes                                                         Minutes
	 * @param seconds                                                         Seconds
	 * @param pulseRate                                                       Pulse
	 *                                                                        Rate
	 * @param userId                                                          User
	 *                                                                        ID
	 * @param measurementStatus                                               Measurement
	 *                                                                        Status
	 */
	public IntermediateCuffPressure(int flags,
			@NonNull IEEE_11073_20601_SFLOAT intermediateCuffPressureCompoundValueCurrentCuffPressureMmhg,
			@NonNull IEEE_11073_20601_SFLOAT intermediateCuffPressureCompoundValueCurrentCuffPressureKpa,
			@NonNull IEEE_11073_20601_SFLOAT intermediateCuffPressureCompoundValueDiastolicUnused,
			@NonNull IEEE_11073_20601_SFLOAT intermediateCuffPressureCompoundValueMeanArterialPressureUnused, int year,
			int month, int day, int hours, int minutes, int seconds, IEEE_11073_20601_SFLOAT pulseRate, int userId,
			byte[] measurementStatus) {
		mFlags = flags;
		mIntermediateCuffPressureCompoundValueCurrentCuffPressureMmhg = intermediateCuffPressureCompoundValueCurrentCuffPressureMmhg;
		mIntermediateCuffPressureCompoundValueCurrentCuffPressureKpa = intermediateCuffPressureCompoundValueCurrentCuffPressureKpa;
		mIntermediateCuffPressureCompoundValueDiastolicUnused = intermediateCuffPressureCompoundValueDiastolicUnused;
		mIntermediateCuffPressureCompoundValueMeanArterialPressureUnused = intermediateCuffPressureCompoundValueMeanArterialPressureUnused;
		mYear = year;
		mMonth = month;
		mDay = day;
		mHours = hours;
		mMinutes = minutes;
		mSeconds = seconds;
		mPulseRate = pulseRate;
		mUserId = userId;
		mMeasurementStatus = measurementStatus;
	}

	/**
	 * @return Flags
	 */
	public int getFlags() {
		return mFlags;
	}

	/**
	 * @return Intermediate Cuff Pressure Compound Value - Current Cuff Pressure
	 *         (mmHg)
	 */
	public IEEE_11073_20601_SFLOAT getIntermediateCuffPressureCompoundValueCurrentCuffPressureMmhg() {
		return mIntermediateCuffPressureCompoundValueCurrentCuffPressureMmhg;
	}

	/**
	 * @return Intermediate Cuff Pressure Compound Value - Current Cuff Pressure
	 *         (kPa)
	 */
	public IEEE_11073_20601_SFLOAT getIntermediateCuffPressureCompoundValueCurrentCuffPressureKpa() {
		return mIntermediateCuffPressureCompoundValueCurrentCuffPressureKpa;
	}

	/**
	 * @return Intermediate Cuff Pressure Compound Value - Diastolic (unused)
	 */
	public IEEE_11073_20601_SFLOAT getIntermediateCuffPressureCompoundValueDiastolicUnused() {
		return mIntermediateCuffPressureCompoundValueDiastolicUnused;
	}

	/**
	 * @return Intermediate Cuff Pressure Compound Value - Mean Arterial Pressure
	 *         (unused)
	 */
	public IEEE_11073_20601_SFLOAT getIntermediateCuffPressureCompoundValueMeanArterialPressureUnused() {
		return mIntermediateCuffPressureCompoundValueMeanArterialPressureUnused;
	}

	/**
	 * @return Year
	 */
	public int getYear() {
		return mYear;
	}

	/**
	 * @return Month
	 */
	public int getMonth() {
		return mMonth;
	}

	/**
	 * @return Day
	 */
	public int getDay() {
		return mDay;
	}

	/**
	 * @return Hours
	 */
	public int getHours() {
		return mHours;
	}

	/**
	 * @return Minutes
	 */
	public int getMinutes() {
		return mMinutes;
	}

	/**
	 * @return Seconds
	 */
	public int getSeconds() {
		return mSeconds;
	}

	/**
	 * @return Pulse Rate
	 */
	public IEEE_11073_20601_SFLOAT getPulseRate() {
		return mPulseRate;
	}

	/**
	 * @return User ID
	 */
	public int getUserId() {
		return mUserId;
	}

	/**
	 * @return Measurement Status
	 */
	public byte[] getMeasurementStatus() {
		return mMeasurementStatus;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@NonNull
	public byte[] getBytes() {
		int length = 0;
		byte[] data = new byte[19];
		ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
		byteBuffer.put((byte) mFlags);
		length++;
		if (BloodPressureMeasurementUtils.isFlagsBloodPressureUnitsMmhg(mFlags)) {
			byteBuffer.put(mIntermediateCuffPressureCompoundValueCurrentCuffPressureMmhg.getData());
		} else {
			byteBuffer.put(mIntermediateCuffPressureCompoundValueCurrentCuffPressureKpa.getData());
		}
		byteBuffer.put(mIntermediateCuffPressureCompoundValueDiastolicUnused.getData());
		byteBuffer.put(mIntermediateCuffPressureCompoundValueMeanArterialPressureUnused.getData());
		length += 6;
		if (BloodPressureMeasurementUtils.isFlagsTimeStampPresent(mFlags)) {
			byteBuffer.putShort((short) mYear);
			byteBuffer.put((byte) mMonth);
			byteBuffer.put((byte) mDay);
			byteBuffer.put((byte) mHours);
			byteBuffer.put((byte) mMinutes);
			byteBuffer.put((byte) mSeconds);
			length += 7;
		}
		if (BloodPressureMeasurementUtils.isFlagsPulseRatePresent(mFlags)) {
			byteBuffer.put(mPulseRate.getData());
			length += 2;
		}
		if (BloodPressureMeasurementUtils.isFlagsUserIdPresent(mFlags)) {
			byteBuffer.put((byte) mUserId);
			length++;
		}
		if (BloodPressureMeasurementUtils.isFlagsMeasurementStatusPresent(mFlags)) {
			byteBuffer.put(mMeasurementStatus);
			length += 2;
		}
		return Arrays.copyOfRange(data, 0, length);
	}

}
