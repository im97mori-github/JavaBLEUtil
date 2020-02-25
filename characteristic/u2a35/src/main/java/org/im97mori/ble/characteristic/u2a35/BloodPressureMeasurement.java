package org.im97mori.ble.characteristic.u2a35;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;
import org.im97mori.ble.characteristic.core.BloodPressureMeasurementUtils;
import org.im97mori.ble.characteristic.core.IEEE_11073_20601_SFLOAT;

import androidx.annotation.NonNull;

/**
 * Blood Pressure Measurement (Characteristics UUID: 0x2A35)
 */
public class BloodPressureMeasurement implements ByteArrayInterface {

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
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A35
     */
    public BloodPressureMeasurement(@NonNull byte[] values) {
        int index = 0;
        mFlags = values[index++];
        if (BloodPressureMeasurementUtils.isFlagsBloodPressureUnitsMmhg(mFlags)) {
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
            mBloodPressureMeasurementCompoundValueMeanArterialPressureMmhg = new IEEE_11073_20601_SFLOAT(new byte[2], 0);

            mBloodPressureMeasurementCompoundValueSystolicKpa = new IEEE_11073_20601_SFLOAT(values, index);
            index += 2;
            mBloodPressureMeasurementCompoundValueDiastolicKpa = new IEEE_11073_20601_SFLOAT(values, index);
            index += 2;
            mBloodPressureMeasurementCompoundValueMeanArterialPressureKpa = new IEEE_11073_20601_SFLOAT(values, index);
        }
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
     * @return Blood Pressure Measurement Compound Value - Mean Arterial Pressure (mmHg)
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
     * @return Blood Pressure Measurement Compound Value - Mean Arterial Pressure (kPa)
     */
    public IEEE_11073_20601_SFLOAT getBloodPressureMeasurementCompoundValueMeanArterialPressureKpa() {
        return mBloodPressureMeasurementCompoundValueMeanArterialPressureKpa;
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
            byteBuffer.put(mBloodPressureMeasurementCompoundValueSystolicMmhg.getData());
            byteBuffer.put(mBloodPressureMeasurementCompoundValueDiastolicMmhg.getData());
            byteBuffer.put(mBloodPressureMeasurementCompoundValueMeanArterialPressureMmhg.getData());
        } else {
            byteBuffer.put(mBloodPressureMeasurementCompoundValueSystolicKpa.getData());
            byteBuffer.put(mBloodPressureMeasurementCompoundValueDiastolicKpa.getData());
            byteBuffer.put(mBloodPressureMeasurementCompoundValueMeanArterialPressureKpa.getData());
        }
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
