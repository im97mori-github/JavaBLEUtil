package org.im97mori.ble.characteristic.u2ace;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;
import org.im97mori.ble.characteristic.core.CrossTrainerDataUtils;

import androidx.annotation.NonNull;

/**
 * Cross Trainer Data packet (Characteristics UUID: 0x2ACE)
 */
public class CrossTrainerDataPacket implements ByteArrayInterface {

    /**
     * Flags
     */
    private final byte[] mFlags;

    /**
     * Instantaneous Speed
     */
    private final int mInstantaneousSpeed;

    /**
     * Average Speed
     */
    private final int mAverageSpeed;

    /**
     * Total Distance
     */
    private final int mTotalDistance;

    /**
     * Step Per Minute
     */
    private final int mStepPerMinute;

    /**
     * Average Step Rate
     */
    private final int mAverageStepRate;

    /**
     * Stride Count
     */
    private final int mStrideCount;

    /**
     * Positive Elevation Gain
     */
    private final int mPositiveElevationGain;

    /**
     * Negative Elevation Gain
     */
    private final int mNegativeElevationGain;

    /**
     * Inclination
     */
    private final int mInclination;

    /**
     * Ramp Angle Setting
     */
    private final int mRampAngleSetting;

    /**
     * Resistance Level
     */
    private final int mResistanceLevel;

    /**
     * Instantaneous Power
     */
    private final int mInstantaneousPower;

    /**
     * Average Power
     */
    private final int mAveragePower;

    /**
     * Total Energy
     */
    private final int mTotalEnergy;

    /**
     * Energy Per Hour
     */
    private final int mEnergyPerHour;

    /**
     * Energy Per Minute
     */
    private final int mEnergyPerMinute;

    /**
     * Heart Rate
     */
    private final int mHeartRate;

    /**
     * Metabolic Equivalent
     */
    private final int mMetabolicEquivalent;

    /**
     * Elapsed Time
     */
    private final int mElapsedTime;

    /**
     * Remaining Time
     */
    private final int mRemainingTime;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public CrossTrainerDataPacket(@NonNull byte[] values) {
        int index = 3;
        mFlags = Arrays.copyOfRange(values, 0, 3);
        if (CrossTrainerDataUtils.isFlagsMoreDataFalse(mFlags)) {
            mInstantaneousSpeed = BLEUtils.createUInt16(values, index);
            index += 2;
        } else {
            mInstantaneousSpeed = 0;
        }
        if (CrossTrainerDataUtils.isFlagsAverageSpeedPresent(mFlags)) {
            mAverageSpeed = BLEUtils.createUInt16(values, index);
            index += 2;
        } else {
            mAverageSpeed = 0;
        }
        if (CrossTrainerDataUtils.isFlagsTotalDistancePresent(mFlags)) {
            mTotalDistance = BLEUtils.createUInt24(values, index);
            index += 3;
        } else {
            mTotalDistance = 0;
        }
        if (CrossTrainerDataUtils.isFlagsStepCountPresent(mFlags)) {
            mStepPerMinute = BLEUtils.createUInt16(values, index);
            index += 2;
            mAverageStepRate = BLEUtils.createUInt16(values, index);
            index += 2;
        } else {
            mStepPerMinute = 0;
            mAverageStepRate = 0;
        }
        if (CrossTrainerDataUtils.isFlagsStrideCountPresent(mFlags)) {
            mStrideCount = BLEUtils.createUInt16(values, index);
            index += 2;
        } else {
            mStrideCount = 0;
        }
        if (CrossTrainerDataUtils.isFlagsElevationGainPresent(mFlags)) {
            mPositiveElevationGain = BLEUtils.createUInt16(values, index);
            index += 2;
            mNegativeElevationGain = BLEUtils.createUInt16(values, index);
            index += 2;
        } else {
            mPositiveElevationGain = 0;
            mNegativeElevationGain = 0;
        }
        if (CrossTrainerDataUtils.isFlagsInclinationAndRampAngleSettingPresent(mFlags)) {
            mInclination = BLEUtils.createSInt16(values, index);
            index += 2;
            mRampAngleSetting = BLEUtils.createSInt16(values, index);
            index += 2;
        } else {
            mInclination = 0;
            mRampAngleSetting = 0;
        }
        if (CrossTrainerDataUtils.isFlagsResistanceLevelPresent(mFlags)) {
            mResistanceLevel = BLEUtils.createSInt16(values, index);
            index += 2;
        } else {
            mResistanceLevel = 0;
        }
        if (CrossTrainerDataUtils.isFlagsInstantaneousPowerPresent(mFlags)) {
            mInstantaneousPower = BLEUtils.createSInt16(values, index);
            index += 2;
        } else {
            mInstantaneousPower = 0;
        }
        if (CrossTrainerDataUtils.isFlagsAveragePowerPresent(mFlags)) {
            mAveragePower = BLEUtils.createSInt16(values, index);
            index += 2;
        } else {
            mAveragePower = 0;
        }
        if (CrossTrainerDataUtils.isFlagsExpendedEnergyPresent(mFlags)) {
            mTotalEnergy = BLEUtils.createUInt16(values, index);
            index += 2;
            mEnergyPerHour = BLEUtils.createUInt16(values, index);
            index += 2;
            mEnergyPerMinute = (values[index++] & 0xff);
        } else {
            mTotalEnergy = 0;
            mEnergyPerHour = 0;
            mEnergyPerMinute = 0;
        }
        if (CrossTrainerDataUtils.isFlagsHeartRatePresent(mFlags)) {
            mHeartRate = (values[index++] & 0xff);
        } else {
            mHeartRate = 0;
        }
        if (CrossTrainerDataUtils.isFlagsMetabolicEquivalentPresent(mFlags)) {
            mMetabolicEquivalent = (values[index++] & 0xff);
        } else {
            mMetabolicEquivalent = 0;
        }
        if (CrossTrainerDataUtils.isFlagsElapsedTimePresent(mFlags)) {
            mElapsedTime = BLEUtils.createUInt16(values, index);
            index += 2;
        } else {
            mElapsedTime = 0;
        }
        if (CrossTrainerDataUtils.isFlagsRemainingTimePresent(mFlags)) {
            mRemainingTime = BLEUtils.createUInt16(values, index);
        } else {
            mRemainingTime = 0;
        }
    }

    /**
     * Constructor from parameters
     * 
     * @param flags                 Flags
     * @param instantaneousSpeed    Instantaneous Speed
     * @param averageSpeed          Average Speed
     * @param totalDistance         Total Distance
     * @param stepPerMinute         Step Per Minute
     * @param averageStepRate       Average Step Rate
     * @param strideCount           Stride Count
     * @param positiveElevationGain Positive Elevation Gain
     * @param negativeElevationGain Negative Elevation Gain
     * @param inclination           Inclination
     * @param rampAngleSetting      Ramp Angle Setting
     * @param resistanceLevel       Resistance Level
     * @param instantaneousPower    Instantaneous Power
     * @param averagePower          Average Power
     * @param totalEnergy           Total Energy
     * @param energyPerHour         Energy Per Hour
     * @param energyPerMinute       Energy Per Minute
     * @param heartRate             Heart Rate
     * @param metabolicEquivalent   Metabolic Equivalent
     * @param elapsedTime           Elapsed Time
     * @param remainingTime         Remaining Time
     */
    public CrossTrainerDataPacket(@NonNull byte[] flags, int instantaneousSpeed, int averageSpeed, int totalDistance, int stepPerMinute, int averageStepRate, int strideCount, int positiveElevationGain, int negativeElevationGain, int inclination, int rampAngleSetting, int resistanceLevel, int instantaneousPower, int averagePower, int totalEnergy, int energyPerHour, int energyPerMinute, int heartRate, int metabolicEquivalent, int elapsedTime, int remainingTime) {
        mFlags = flags;
        mInstantaneousSpeed = instantaneousSpeed;
        mAverageSpeed = averageSpeed;
        mTotalDistance = totalDistance;
        mStepPerMinute = stepPerMinute;
        mAverageStepRate = averageStepRate;
        mStrideCount = strideCount;
        mPositiveElevationGain = positiveElevationGain;
        mNegativeElevationGain = negativeElevationGain;
        mInclination = inclination;
        mRampAngleSetting = rampAngleSetting;
        mResistanceLevel = resistanceLevel;
        mInstantaneousPower = instantaneousPower;
        mAveragePower = averagePower;
        mTotalEnergy = totalEnergy;
        mEnergyPerHour = energyPerHour;
        mEnergyPerMinute = energyPerMinute;
        mHeartRate = heartRate;
        mMetabolicEquivalent = metabolicEquivalent;
        mElapsedTime = elapsedTime;
        mRemainingTime = remainingTime;
    }

    /**
     * @return Flags
     */
    public byte[] getFlags() {
        return mFlags;
    }

    /**
     * @return Instantaneous Speed
     */
    public int getInstantaneousSpeed() {
        return mInstantaneousSpeed;
    }

    /**
     * @return Average Speed
     */
    public int getAverageSpeed() {
        return mAverageSpeed;
    }

    /**
     * @return Total Distance
     */
    public int getTotalDistance() {
        return mTotalDistance;
    }

    /**
     * @return Step Per Minute
     */
    public int getStepPerMinute() {
        return mStepPerMinute;
    }

    /**
     * @return Average Step Rate
     */
    public int getAverageStepRate() {
        return mAverageStepRate;
    }

    /**
     * @return Stride Count
     */
    public int getStrideCount() {
        return mStrideCount;
    }

    /**
     * @return Positive Elevation Gain
     */
    public int getPositiveElevationGain() {
        return mPositiveElevationGain;
    }

    /**
     * @return Negative Elevation Gain
     */
    public int getNegativeElevationGain() {
        return mNegativeElevationGain;
    }

    /**
     * @return Inclination
     */
    public int getInclination() {
        return mInclination;
    }

    /**
     * @return Ramp Angle Setting
     */
    public int getRampAngleSetting() {
        return mRampAngleSetting;
    }

    /**
     * @return Resistance Level
     */
    public int getResistanceLevel() {
        return mResistanceLevel;
    }

    /**
     * @return Instantaneous Power
     */
    public int getInstantaneousPower() {
        return mInstantaneousPower;
    }

    /**
     * @return Average Power
     */
    public int getAveragePower() {
        return mAveragePower;
    }

    /**
     * @return Total Energy
     */
    public int getTotalEnergy() {
        return mTotalEnergy;
    }

    /**
     * @return Energy Per Hour
     */
    public int getEnergyPerHour() {
        return mEnergyPerHour;
    }

    /**
     * @return Energy Per Minute
     */
    public int getEnergyPerMinute() {
        return mEnergyPerMinute;
    }

    /**
     * @return Heart Rate
     */
    public int getHeartRate() {
        return mHeartRate;
    }

    /**
     * @return Metabolic Equivalent
     */
    public int getMetabolicEquivalent() {
        return mMetabolicEquivalent;
    }

    /**
     * @return Elapsed Time
     */
    public int getElapsedTime() {
        return mElapsedTime;
    }

    /**
     * @return Remaining Time
     */
    public int getRemainingTime() {
        return mRemainingTime;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        int length = 0;
        byte[] data = new byte[41];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put(mFlags);
        length += 3;
        if (CrossTrainerDataUtils.isFlagsMoreDataFalse(mFlags)) {
            byteBuffer.putShort((short) mInstantaneousSpeed);
            length += 2;
        }
        if (CrossTrainerDataUtils.isFlagsAverageSpeedPresent(mFlags)) {
            byteBuffer.putShort((short) mAverageSpeed);
            length += 2;
        }
        if (CrossTrainerDataUtils.isFlagsTotalDistancePresent(mFlags)) {
            byteBuffer.put((byte) mTotalDistance);
            byteBuffer.put((byte) (mTotalDistance >> 8));
            byteBuffer.put((byte) (mTotalDistance >> 16));
            length += 3;
        }
        if (CrossTrainerDataUtils.isFlagsStepCountPresent(mFlags)) {
            byteBuffer.putShort((short) mStepPerMinute);
            byteBuffer.putShort((short) mAverageStepRate);
            length += 4;
        }
        if (CrossTrainerDataUtils.isFlagsStrideCountPresent(mFlags)) {
            byteBuffer.putShort((short) mStrideCount);
            length += 2;
        }
        if (CrossTrainerDataUtils.isFlagsElevationGainPresent(mFlags)) {
            byteBuffer.putShort((short) mPositiveElevationGain);
            byteBuffer.putShort((short) mNegativeElevationGain);
            length += 4;
        }
        if (CrossTrainerDataUtils.isFlagsInclinationAndRampAngleSettingPresent(mFlags)) {
            byteBuffer.putShort((short) mInclination);
            byteBuffer.putShort((short) mRampAngleSetting);
            length += 4;
        }
        if (CrossTrainerDataUtils.isFlagsResistanceLevelPresent(mFlags)) {
            byteBuffer.putShort((short) mResistanceLevel);
            length += 2;
        }
        if (CrossTrainerDataUtils.isFlagsInstantaneousPowerPresent(mFlags)) {
            byteBuffer.putShort((short) mInstantaneousPower);
            length += 2;
        }
        if (CrossTrainerDataUtils.isFlagsAveragePowerPresent(mFlags)) {
            byteBuffer.putShort((short) mAveragePower);
            length += 2;
        }
        if (CrossTrainerDataUtils.isFlagsExpendedEnergyPresent(mFlags)) {
            byteBuffer.putShort((short) mTotalEnergy);
            byteBuffer.putShort((short) mEnergyPerHour);
            byteBuffer.put((byte) mEnergyPerMinute);
            length += 5;
        }
        if (CrossTrainerDataUtils.isFlagsHeartRatePresent(mFlags)) {
            byteBuffer.put((byte) mHeartRate);
            length++;
        }
        if (CrossTrainerDataUtils.isFlagsMetabolicEquivalentPresent(mFlags)) {
            byteBuffer.put((byte) mMetabolicEquivalent);
            length++;
        }
        if (CrossTrainerDataUtils.isFlagsElapsedTimePresent(mFlags)) {
            byteBuffer.putShort((short) mElapsedTime);
            length += 2;
        }
        if (CrossTrainerDataUtils.isFlagsRemainingTimePresent(mFlags)) {
            byteBuffer.putShort((short) mRemainingTime);
            length += 2;
        }
        return Arrays.copyOfRange(data, 0, length);
    }

}
