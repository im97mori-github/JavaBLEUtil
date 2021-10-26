package org.im97mori.ble.characteristic.u2b34;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;
import org.im97mori.ble.characteristic.core.EnhancedBloodPressureMeasurementUtils;
import org.im97mori.ble.characteristic.core.IEEE_11073_20601_SFLOAT;

import androidx.annotation.NonNull;

/**
 * Enhanced Blood Pressure Measurement (Characteristics UUID: 0x2B34)
 */
public class EnhancedBloodPressureMeasurement implements ByteArrayInterface {

    /**
     * Flags
     */
    private final int mFlags;

    /**
     * Blood Pressure Measurement Compound Value - Systolic (mmHg)
     */
    private final IEEE_11073_20601_SFLOAT mBloodPressureMeasurementCompoundValueSystolicMmhg;

    /**
     * Blood Pressure Measurement Compound Value - Diastolic (mmHg)
     */
    private final IEEE_11073_20601_SFLOAT mBloodPressureMeasurementCompoundValueDiastolicMmhg;

    /**
     * Blood Pressure Measurement Compound Value - Mean Arterial Pressure (mmHg)
     */
    private final IEEE_11073_20601_SFLOAT mBloodPressureMeasurementCompoundValueMeanArterialPressureMmhg;

    /**
     * Blood Pressure Measurement Compound Value - Systolic (kPa)
     */
    private final IEEE_11073_20601_SFLOAT mBloodPressureMeasurementCompoundValueSystolicKpa;

    /**
     * Blood Pressure Measurement Compound Value - Diastolic (kPa)
     */
    private final IEEE_11073_20601_SFLOAT mBloodPressureMeasurementCompoundValueDiastolicKpa;

    /**
     * Blood Pressure Measurement Compound Value - Mean Arterial Pressure (kPa)
     */
    private final IEEE_11073_20601_SFLOAT mBloodPressureMeasurementCompoundValueMeanArterialPressureKpa;

    /**
     * Time Stamp
     */
    private final long mTimeStamp;

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
     * User Facing Time
     */
    private final long mUserFacingTime;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public EnhancedBloodPressureMeasurement(@NonNull byte[] values) {
        int index = 0;
        mFlags = values[index++];
        if (EnhancedBloodPressureMeasurementUtils.isFlagsBloodPressureUnitsMmhg(mFlags)) {
            mBloodPressureMeasurementCompoundValueSystolicMmhg = new IEEE_11073_20601_SFLOAT(values, index);
            index += 2;
            mBloodPressureMeasurementCompoundValueDiastolicMmhg = new IEEE_11073_20601_SFLOAT(values, index);
            index += 2;
            mBloodPressureMeasurementCompoundValueMeanArterialPressureMmhg = new IEEE_11073_20601_SFLOAT(values, index);

            mBloodPressureMeasurementCompoundValueSystolicKpa = new IEEE_11073_20601_SFLOAT(new byte[2], 0);
            mBloodPressureMeasurementCompoundValueDiastolicKpa = new IEEE_11073_20601_SFLOAT(new byte[2], 0);
            mBloodPressureMeasurementCompoundValueMeanArterialPressureKpa = new IEEE_11073_20601_SFLOAT(new byte[2], 0);
        } else {
            mBloodPressureMeasurementCompoundValueSystolicMmhg = new IEEE_11073_20601_SFLOAT(new byte[2], 0);
            mBloodPressureMeasurementCompoundValueDiastolicMmhg = new IEEE_11073_20601_SFLOAT(new byte[2], 0);
            mBloodPressureMeasurementCompoundValueMeanArterialPressureMmhg = new IEEE_11073_20601_SFLOAT(new byte[2],
                    0);

            mBloodPressureMeasurementCompoundValueSystolicKpa = new IEEE_11073_20601_SFLOAT(values, index);
            index += 2;
            mBloodPressureMeasurementCompoundValueDiastolicKpa = new IEEE_11073_20601_SFLOAT(values, index);
            index += 2;
            mBloodPressureMeasurementCompoundValueMeanArterialPressureKpa = new IEEE_11073_20601_SFLOAT(values, index);
        }
        index += 2;
        if (EnhancedBloodPressureMeasurementUtils.isFlagsTimeStampPresent(mFlags)) {
            mTimeStamp = BLEUtils.createUInt32(values, index);
            index += 4;
        } else {
            mTimeStamp = 0;
        }
        if (EnhancedBloodPressureMeasurementUtils.isFlagsPulseRatePresent(mFlags)) {
            mPulseRate = new IEEE_11073_20601_SFLOAT(values, index);
            index += 2;
        } else {
            mPulseRate = new IEEE_11073_20601_SFLOAT(new byte[2], 0);
        }
        if (EnhancedBloodPressureMeasurementUtils.isFlagsUserIdPresent(mFlags)) {
            mUserId = (values[index++] & 0xff);
            index++;
        } else {
            mUserId = 0;
        }
        if (EnhancedBloodPressureMeasurementUtils.isFlagsMeasurementStatusPresent(mFlags)) {
            mMeasurementStatus = Arrays.copyOfRange(values, index, index + 2);
            index += 2;
        } else {
            mMeasurementStatus = new byte[0];
        }
        if (EnhancedBloodPressureMeasurementUtils.isFlagsUserFacingTimePresent(mFlags)) {
            mUserFacingTime = BLEUtils.createUInt32(values, index);
        } else {
            mUserFacingTime = 0;
        }
    }

    /**
     * Constructor from parameters
     * 
     * @param flags                                                         Flags
     * @param bloodPressureMeasurementCompoundValueSystolicMmhg             Blood
     *                                                                      Pressure
     *                                                                      Measurement
     *                                                                      Compound
     *                                                                      Value -
     *                                                                      Systolic
     *                                                                      (mmHg)
     * @param bloodPressureMeasurementCompoundValueDiastolicMmhg            Blood
     *                                                                      Pressure
     *                                                                      Measurement
     *                                                                      Compound
     *                                                                      Value -
     *                                                                      Diastolic
     *                                                                      (mmHg)
     * @param bloodPressureMeasurementCompoundValueMeanArterialPressureMmhg Blood
     *                                                                      Pressure
     *                                                                      Measurement
     *                                                                      Compound
     *                                                                      Value -
     *                                                                      Mean
     *                                                                      Arterial
     *                                                                      Pressure
     *                                                                      (mmHg)
     * @param bloodPressureMeasurementCompoundValueSystolicKpa              Blood
     *                                                                      Pressure
     *                                                                      Measurement
     *                                                                      Compound
     *                                                                      Value -
     *                                                                      Systolic
     *                                                                      (kPa)
     * @param bloodPressureMeasurementCompoundValueDiastolicKpa             Blood
     *                                                                      Pressure
     *                                                                      Measurement
     *                                                                      Compound
     *                                                                      Value -
     *                                                                      Diastolic
     *                                                                      (kPa)
     * @param bloodPressureMeasurementCompoundValueMeanArterialPressureKpa  Blood
     *                                                                      Pressure
     *                                                                      Measurement
     *                                                                      Compound
     *                                                                      Value -
     *                                                                      Mean
     *                                                                      Arterial
     *                                                                      Pressure
     *                                                                      (kPa)
     * @param timeStamp                                                     Time
     *                                                                      Stamp
     * @param pulseRate                                                     Pulse
     *                                                                      Rate
     * @param userId                                                        User ID
     * @param measurementStatus                                             Measurement
     *                                                                      Status
     * @param userFacingTime                                                User
     *                                                                      Facing
     */
    public EnhancedBloodPressureMeasurement(int flags,
            @NonNull IEEE_11073_20601_SFLOAT bloodPressureMeasurementCompoundValueSystolicMmhg,
            @NonNull IEEE_11073_20601_SFLOAT bloodPressureMeasurementCompoundValueDiastolicMmhg,
            @NonNull IEEE_11073_20601_SFLOAT bloodPressureMeasurementCompoundValueMeanArterialPressureMmhg,
            @NonNull IEEE_11073_20601_SFLOAT bloodPressureMeasurementCompoundValueSystolicKpa,
            @NonNull IEEE_11073_20601_SFLOAT bloodPressureMeasurementCompoundValueDiastolicKpa,
            @NonNull IEEE_11073_20601_SFLOAT bloodPressureMeasurementCompoundValueMeanArterialPressureKpa,
            long timeStamp, @NonNull IEEE_11073_20601_SFLOAT pulseRate, int userId, @NonNull byte[] measurementStatus,
            long userFacingTime) {
        mFlags = flags;
        mBloodPressureMeasurementCompoundValueSystolicMmhg = bloodPressureMeasurementCompoundValueSystolicMmhg;
        mBloodPressureMeasurementCompoundValueDiastolicMmhg = bloodPressureMeasurementCompoundValueDiastolicMmhg;
        mBloodPressureMeasurementCompoundValueMeanArterialPressureMmhg = bloodPressureMeasurementCompoundValueMeanArterialPressureMmhg;
        mBloodPressureMeasurementCompoundValueSystolicKpa = bloodPressureMeasurementCompoundValueSystolicKpa;
        mBloodPressureMeasurementCompoundValueDiastolicKpa = bloodPressureMeasurementCompoundValueDiastolicKpa;
        mBloodPressureMeasurementCompoundValueMeanArterialPressureKpa = bloodPressureMeasurementCompoundValueMeanArterialPressureKpa;
        mTimeStamp = timeStamp;
        mPulseRate = pulseRate;
        mUserId = userId;
        mMeasurementStatus = measurementStatus;
        mUserFacingTime = userFacingTime;
    }

    /**
     * @return Flags
     */
    public int getFlags() {
        return mFlags;
    }

    /**
     * @return Blood Pressure Measurement Compound Value - Systolic (mmHg)
     */
    public IEEE_11073_20601_SFLOAT getBloodPressureMeasurementCompoundValueSystolicMmhg() {
        return mBloodPressureMeasurementCompoundValueSystolicMmhg;
    }

    /**
     * @return Blood Pressure Measurement Compound Value - Diastolic (mmHg)
     */
    public IEEE_11073_20601_SFLOAT getBloodPressureMeasurementCompoundValueDiastolicMmhg() {
        return mBloodPressureMeasurementCompoundValueDiastolicMmhg;
    }

    /**
     * @return Blood Pressure Measurement Compound Value - Mean Arterial Pressure
     *         (mmHg)
     */
    public IEEE_11073_20601_SFLOAT getBloodPressureMeasurementCompoundValueMeanArterialPressureMmhg() {
        return mBloodPressureMeasurementCompoundValueMeanArterialPressureMmhg;
    }

    /**
     * @return Blood Pressure Measurement Compound Value - Systolic (kPa)
     */
    public IEEE_11073_20601_SFLOAT getBloodPressureMeasurementCompoundValueSystolicKpa() {
        return mBloodPressureMeasurementCompoundValueSystolicKpa;
    }

    /**
     * @return Blood Pressure Measurement Compound Value - Diastolic (kPa)
     */
    public IEEE_11073_20601_SFLOAT getBloodPressureMeasurementCompoundValueDiastolicKpa() {
        return mBloodPressureMeasurementCompoundValueDiastolicKpa;
    }

    /**
     * @return Blood Pressure Measurement Compound Value - Mean Arterial Pressure
     *         (kPa)
     */
    public IEEE_11073_20601_SFLOAT getBloodPressureMeasurementCompoundValueMeanArterialPressureKpa() {
        return mBloodPressureMeasurementCompoundValueMeanArterialPressureKpa;
    }

    /**
     * @return Time Stamp
     */
    public long getTimeStamp() {
        return mTimeStamp;
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
     * @return User Facing Time
     */
    public long getUserFacingTime() {
        return mUserFacingTime;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        int length = 0;
        byte[] data = new byte[20];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mFlags);
        length++;
        if (EnhancedBloodPressureMeasurementUtils.isFlagsBloodPressureUnitsMmhg(mFlags)) {
            byteBuffer.put(mBloodPressureMeasurementCompoundValueSystolicMmhg.getData());
            byteBuffer.put(mBloodPressureMeasurementCompoundValueDiastolicMmhg.getData());
            byteBuffer.put(mBloodPressureMeasurementCompoundValueMeanArterialPressureMmhg.getData());
        } else {
            byteBuffer.put(mBloodPressureMeasurementCompoundValueSystolicKpa.getData());
            byteBuffer.put(mBloodPressureMeasurementCompoundValueDiastolicKpa.getData());
            byteBuffer.put(mBloodPressureMeasurementCompoundValueMeanArterialPressureKpa.getData());
        }
        length += 6;
        if (EnhancedBloodPressureMeasurementUtils.isFlagsTimeStampPresent(mFlags)) {
            byteBuffer.putLong(mTimeStamp);
            length += 4;
        }
        if (EnhancedBloodPressureMeasurementUtils.isFlagsPulseRatePresent(mFlags)) {
            byteBuffer.put(mPulseRate.getData());
            length += 2;
        }
        if (EnhancedBloodPressureMeasurementUtils.isFlagsUserIdPresent(mFlags)) {
            byteBuffer.put((byte) mUserId);
            length++;
        }
        if (EnhancedBloodPressureMeasurementUtils.isFlagsMeasurementStatusPresent(mFlags)) {
            byteBuffer.put(mMeasurementStatus);
            length += 2;
        }
        if (EnhancedBloodPressureMeasurementUtils.isFlagsUserFacingTimePresent(mFlags)) {
            byteBuffer.putLong(mUserFacingTime);
            length += 4;
        }
        return Arrays.copyOfRange(data, 0, length);
    }

}
