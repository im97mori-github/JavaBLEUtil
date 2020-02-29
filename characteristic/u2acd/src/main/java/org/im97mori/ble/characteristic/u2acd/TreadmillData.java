package org.im97mori.ble.characteristic.u2acd;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;
import org.im97mori.ble.characteristic.core.TreadmillDataUtils;

import androidx.annotation.NonNull;

/**
 * Treadmill Data (Characteristics UUID: 0x2ACD)
 */
public class TreadmillData implements ByteArrayInterface {

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
     * Inclination
     */
    private final int mInclination;

    /**
     * Ramp Angle Setting
     */
    private final int mRampAngleSetting;

    /**
     * Positive Elevation Gain
     */
    private final int mPositiveElevationGain;

    /**
     * Negative Elevation Gain
     */
    private final int mNegativeElevationGain;

    /**
     * Instantaneous Pace
     */
    private final int mInstantaneousPace;

    /**
     * Average Pace
     */
    private final int mAveragePace;

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
     * Force on Belt
     */
    private final int mForceOnBelt;

    /**
     * Power Output
     */
    private final int mPowerOutput;

    /**
     * Constructor from {@link TreadmillDataPacket} array
     *
     * @param treadmillDataPackets 1 or more Treadmill Data packet array
     */
    public TreadmillData(@NonNull TreadmillDataPacket[] treadmillDataPackets) {
        byte[] flags = new byte[2];
        int instantaneousSpeed = 0;
        int averageSpeed = 0;
        int totalDistance = 0;
        int inclination = 0;
        int rampAngleSetting = 0;
        int positiveElevationGain = 0;
        int negativeElevationGain = 0;
        int instantaneousPace = 0;
        int averagePace = 0;
        int totalEnergy = 0;
        int energyPerHour = 0;
        int energyPerMinute = 0;
        int heartRate = 0;
        int metabolicEquivalent = 0;
        int elapsedTime = 0;
        int remainingTime = 0;
        int forceOnBelt = 0;
        int powerOutput = 0;

        // give priority to after packet
        for (TreadmillDataPacket treadmillDataPacket : treadmillDataPackets) {
            byte[] values = treadmillDataPacket.getBytes();
            int index = 2;
            flags = Arrays.copyOfRange(values, 0, 2);

            if (TreadmillDataUtils.isFlagsMoreDataFalse(flags)) {
                instantaneousSpeed = BLEUtils.createUInt16(values, index);
                index += 2;
            }
            if (TreadmillDataUtils.isFlagsAverageSpeedPresent(flags)) {
                averageSpeed = BLEUtils.createUInt16(values, index);
                index += 2;
            }
            if (TreadmillDataUtils.isFlagsTotalDistancePresent(flags)) {
                totalDistance = BLEUtils.createUInt24(values, index);
                index += 3;
            }
            if (TreadmillDataUtils.isFlagsInclinationAndRampAngleSettingPresent(flags)) {
                inclination = BLEUtils.createSInt16(values, index);
                index += 2;
                rampAngleSetting = BLEUtils.createSInt16(values, index);
                index += 2;
            }
            if (TreadmillDataUtils.isFlagsElevationGainPresent(flags)) {
                positiveElevationGain = BLEUtils.createUInt16(values, index);
                index += 2;
                negativeElevationGain = BLEUtils.createUInt16(values, index);
                index += 2;
            }
            if (TreadmillDataUtils.isFlagsInstantaneousPacePresent(flags)) {
                instantaneousPace = (values[index++] & 0xff);
            }
            if (TreadmillDataUtils.isFlagsAveragePacePresent(flags)) {
                averagePace = (values[index++] & 0xff);
            }
            if (TreadmillDataUtils.isFlagsExpendedEnergyPresent(flags)) {
                totalEnergy = BLEUtils.createUInt16(values, index);
                index += 2;
                energyPerHour = BLEUtils.createUInt16(values, index);
                index += 2;
                energyPerMinute = (values[index++] & 0xff);
            }
            if (TreadmillDataUtils.isFlagsHeartRatePresent(flags)) {
                heartRate = (values[index++] & 0xff);
            }
            if (TreadmillDataUtils.isFlagsMetabolicEquivalentPresent(flags)) {
                metabolicEquivalent = (values[index++] & 0xff);
            }
            if (TreadmillDataUtils.isFlagsElapsedTimePresent(flags)) {
                elapsedTime = BLEUtils.createUInt16(values, index);
                index += 2;
            }
            if (TreadmillDataUtils.isFlagsRemainingTimePresent(flags)) {
                remainingTime = BLEUtils.createUInt16(values, index);
                index += 2;
            }
            if (TreadmillDataUtils.isFlagsForceOnBeltAndPowerOutputPresent(flags)) {
                forceOnBelt = BLEUtils.createSInt16(values, index);
                index += 2;
                powerOutput = BLEUtils.createSInt16(values, index);
            }
        }

        mFlags = flags;
        mInstantaneousSpeed = instantaneousSpeed;
        mAverageSpeed = averageSpeed;
        mTotalDistance = totalDistance;
        mInclination = inclination;
        mRampAngleSetting = rampAngleSetting;
        mPositiveElevationGain = positiveElevationGain;
        mNegativeElevationGain = negativeElevationGain;
        mInstantaneousPace = instantaneousPace;
        mAveragePace = averagePace;
        mTotalEnergy = totalEnergy;
        mEnergyPerHour = energyPerHour;
        mEnergyPerMinute = energyPerMinute;
        mHeartRate = heartRate;
        mMetabolicEquivalent = metabolicEquivalent;
        mElapsedTime = elapsedTime;
        mRemainingTime = remainingTime;
        mForceOnBelt = forceOnBelt;
        mPowerOutput = powerOutput;
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
     * @return Instantaneous Pace
     */
    public int getInstantaneousPace() {
        return mInstantaneousPace;
    }

    /**
     * @return Average Pace
     */
    public int getAveragePace() {
        return mAveragePace;
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
     * @return Force on Belt
     */
    public int getForceOnBelt() {
        return mForceOnBelt;
    }

    /**
     * @return Power Output
     */
    public int getPowerOutput() {
        return mPowerOutput;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        int length = 0;
        byte[] data = new byte[34];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put(mFlags);
        length += 2;
        if (TreadmillDataUtils.isFlagsMoreDataFalse(mFlags)) {
            byteBuffer.putShort((short) mInstantaneousSpeed);
            length += 2;
        }
        if (TreadmillDataUtils.isFlagsAverageSpeedPresent(mFlags)) {
            byteBuffer.putShort((short) mAverageSpeed);
            length += 2;
        }
        if (TreadmillDataUtils.isFlagsTotalDistancePresent(mFlags)) {
            byteBuffer.put((byte) mTotalDistance);
            byteBuffer.put((byte) (mTotalDistance >> 8));
            byteBuffer.put((byte) (mTotalDistance >> 16));
            length += 3;
        }
        if (TreadmillDataUtils.isFlagsInclinationAndRampAngleSettingPresent(mFlags)) {
            byteBuffer.putShort((short) mInclination);
            byteBuffer.putShort((short) mRampAngleSetting);
            length += 4;
        }
        if (TreadmillDataUtils.isFlagsElevationGainPresent(mFlags)) {
            byteBuffer.putShort((short) mPositiveElevationGain);
            byteBuffer.putShort((short) mNegativeElevationGain);
            length += 4;
        }
        if (TreadmillDataUtils.isFlagsInstantaneousPacePresent(mFlags)) {
            byteBuffer.put((byte) mInstantaneousPace);
            length++;
        }
        if (TreadmillDataUtils.isFlagsAveragePacePresent(mFlags)) {
            byteBuffer.put((byte) mAveragePace);
            length++;
        }
        if (TreadmillDataUtils.isFlagsExpendedEnergyPresent(mFlags)) {
            byteBuffer.putShort((short) mTotalEnergy);
            byteBuffer.putShort((short) mEnergyPerHour);
            byteBuffer.put((byte) mEnergyPerMinute);
            length += 5;
        }
        if (TreadmillDataUtils.isFlagsHeartRatePresent(mFlags)) {
            byteBuffer.put((byte) mHeartRate);
            length++;
        }
        if (TreadmillDataUtils.isFlagsMetabolicEquivalentPresent(mFlags)) {
            byteBuffer.put((byte) mMetabolicEquivalent);
            length++;
        }
        if (TreadmillDataUtils.isFlagsElapsedTimePresent(mFlags)) {
            byteBuffer.putShort((short) mElapsedTime);
            length += 2;
        }
        if (TreadmillDataUtils.isFlagsRemainingTimePresent(mFlags)) {
            byteBuffer.putShort((short) mRemainingTime);
            length += 2;
        }
        if (TreadmillDataUtils.isFlagsForceOnBeltAndPowerOutputPresent(mFlags)) {
            byteBuffer.putShort((short) mForceOnBelt);
            byteBuffer.putShort((short) mPowerOutput);
            length += 4;
        }
        return Arrays.copyOfRange(data, 0, length);
    }

}
