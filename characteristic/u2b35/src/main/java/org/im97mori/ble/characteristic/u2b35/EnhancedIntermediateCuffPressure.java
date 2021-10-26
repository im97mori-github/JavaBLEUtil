package org.im97mori.ble.characteristic.u2b35;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;
import org.im97mori.ble.characteristic.core.EnhancedBloodPressureMeasurementUtils;
import org.im97mori.ble.characteristic.core.IEEE_11073_20601_SFLOAT;

import androidx.annotation.NonNull;

/**
 * Enhanced Intermediate Cuff Pressure (Characteristics UUID: 0x2B35)
 */
public class EnhancedIntermediateCuffPressure implements ByteArrayInterface {

    /**
     * Flags
     */
    private final int mFlags;

    /**
     * Intermediate Cuff Pressure Value (mmHg)
     */
    private final IEEE_11073_20601_SFLOAT mIntermediateCuffPressureValueMmhg;

    /**
     * Intermediate Cuff Pressure Value (kPa)
     */
    private final IEEE_11073_20601_SFLOAT mIntermediateCuffPressureValueKpa;

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
    public EnhancedIntermediateCuffPressure(@NonNull byte[] values) {
        int index = 0;
        mFlags = values[index++];
        if (EnhancedBloodPressureMeasurementUtils.isFlagsBloodPressureUnitsMmhg(mFlags)) {
            mIntermediateCuffPressureValueMmhg = new IEEE_11073_20601_SFLOAT(values, index);

            mIntermediateCuffPressureValueKpa = new IEEE_11073_20601_SFLOAT(new byte[2], 0);
        } else {
            mIntermediateCuffPressureValueMmhg = new IEEE_11073_20601_SFLOAT(new byte[2], 0);

            mIntermediateCuffPressureValueKpa = new IEEE_11073_20601_SFLOAT(values, index);
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
     * @param flags                             Flags
     * @param intermediateCuffPressureValueMmhg Intermediate Cuff Pressure Value
     *                                          (mmHg)
     * @param intermediateCuffPressureValueKpa  Intermediate Cuff Pressure Value
     *                                          (kPa) Value - Systolic (kPa)
     * @param timeStamp                         Time Stamp
     * @param pulseRate                         Pulse Rate
     * @param userId                            User ID
     * @param measurementStatus                 Measurement Status
     * @param userFacingTime                    User Facing
     */
    public EnhancedIntermediateCuffPressure(int flags,
            @NonNull IEEE_11073_20601_SFLOAT intermediateCuffPressureValueMmhg,
            @NonNull IEEE_11073_20601_SFLOAT intermediateCuffPressureValueKpa, long timeStamp,
            @NonNull IEEE_11073_20601_SFLOAT pulseRate, int userId, @NonNull byte[] measurementStatus,
            long userFacingTime) {
        mFlags = flags;
        mIntermediateCuffPressureValueMmhg = intermediateCuffPressureValueMmhg;
        mIntermediateCuffPressureValueKpa = intermediateCuffPressureValueKpa;
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
     * @return Intermediate Cuff Pressure Value (mmHg)
     */
    public IEEE_11073_20601_SFLOAT getIntermediateCuffPressureValueMmhg() {
        return mIntermediateCuffPressureValueMmhg;
    }

    /**
     * @return Intermediate Cuff Pressure Value (kPa)
     */
    public IEEE_11073_20601_SFLOAT getIntermediateCuffPressureValueKpa() {
        return mIntermediateCuffPressureValueKpa;
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
        byte[] data = new byte[16];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mFlags);
        length++;
        if (EnhancedBloodPressureMeasurementUtils.isFlagsBloodPressureUnitsMmhg(mFlags)) {
            byteBuffer.put(mIntermediateCuffPressureValueMmhg.getData());
        } else {
            byteBuffer.put(mIntermediateCuffPressureValueKpa.getData());
        }
        length += 2;
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
