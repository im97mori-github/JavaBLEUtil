package org.im97mori.ble.characteristic.u2acf;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;
import org.im97mori.ble.characteristic.core.StepClimberDataUtils;

import androidx.annotation.NonNull;

/**
 * Step Climber Data (Characteristics UUID: 0x2ACF)
 */
public class StepClimberData implements ByteArrayInterface {

    /**
     * Flags
     */
    private final byte[] mFlags;

    /**
     * Floors
     */
    private final int mFloors;

    /**
     * Step Count
     */
    private final int mStepCount;

    /**
     * Step Per Minute
     */
    private final int mStepPerMinute;

    /**
     * Average Step Rate
     */
    private final int mAverageStepRate;

    /**
     * Positive Elevation Gain
     */
    private final int mPositiveElevationGain;

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
     * Constructor from {@link StepClimberDataPacket} array
     *
     * @param stepClimberDataPackets 1 or more Step Climber Data packet array
     */
    public StepClimberData(@NonNull StepClimberDataPacket[] stepClimberDataPackets) {
        byte[] flags = new byte[2];
        int floors = 0;
        int stepCount = 0;
        int stepPerMinute = 0;
        int averageStepRate = 0;
        int positiveElevationGain = 0;
        int totalEnergy = 0;
        int energyPerHour = 0;
        int energyPerMinute = 0;
        int heartRate = 0;
        int metabolicEquivalent = 0;
        int elapsedTime = 0;
        int remainingTime = 0;

        // give priority to after packet
        for (StepClimberDataPacket stepClimberDataPacket : stepClimberDataPackets) {
            byte[] values = stepClimberDataPacket.getBytes();
            int index = 2;
            flags = Arrays.copyOfRange(values, 0, 2);
            if (StepClimberDataUtils.isFlagsMoreDataFalse(flags)) {
                floors = BLEUtils.createUInt16(values, index);
                index += 2;
                stepCount = BLEUtils.createUInt16(values, index);
                index += 2;
            }
            if (StepClimberDataUtils.isFlagsStepPerMinutePresent(flags)) {
                stepPerMinute = BLEUtils.createUInt16(values, index);
                index += 2;
            }
            if (StepClimberDataUtils.isFlagsAverageStepRatePresent(flags)) {
                averageStepRate = BLEUtils.createUInt16(values, index);
                index += 2;
            }
            if (StepClimberDataUtils.isFlagsPositiveElevationGainPresent(flags)) {
                positiveElevationGain = BLEUtils.createUInt16(values, index);
                index += 2;
            }
            if (StepClimberDataUtils.isFlagsExpendedEnergyPresent(flags)) {
                totalEnergy = BLEUtils.createUInt16(values, index);
                index += 2;
                energyPerHour = BLEUtils.createUInt16(values, index);
                index += 2;
                energyPerMinute = (values[index++] & 0xff);
            }
            if (StepClimberDataUtils.isFlagsHeartRatePresent(flags)) {
                heartRate = (values[index++] & 0xff);
            }
            if (StepClimberDataUtils.isFlagsMetabolicEquivalentPresent(flags)) {
                metabolicEquivalent = (values[index++] & 0xff);
            }
            if (StepClimberDataUtils.isFlagsElapsedTimePresent(flags)) {
                elapsedTime = BLEUtils.createUInt16(values, index);
                index += 2;
            }
            if (StepClimberDataUtils.isFlagsRemainingTimePresent(flags)) {
                remainingTime = BLEUtils.createUInt16(values, index);
            }
        }

        mFlags = flags;
        mFloors = floors;
        mStepCount = stepCount;
        mStepPerMinute = stepPerMinute;
        mAverageStepRate = averageStepRate;
        mPositiveElevationGain = positiveElevationGain;
        mTotalEnergy = totalEnergy;
        mEnergyPerHour = energyPerHour;
        mEnergyPerMinute = energyPerMinute;
        mHeartRate = heartRate;
        mMetabolicEquivalent = metabolicEquivalent;
        mElapsedTime = elapsedTime;
        mRemainingTime = remainingTime;
    }

    /**
     * Constructor from parameters
     * 
     * @param flags                 Flags
     * @param floors                Floors
     * @param stepCount             Step Count
     * @param stepPerMinute         Step Per Minute
     * @param averageStepRate       Average Step Rate
     * @param positiveElevationGain Positive Elevation Gain
     * @param totalEnergy           Total Energy
     * @param energyPerHour         Energy Per Hour
     * @param energyPerMinute       Energy Per Minute
     * @param heartRate             Heart Rate
     * @param metabolicEquivalent   Metabolic Equivalent
     * @param elapsedTime           Elapsed Time
     * @param remainingTime         Remaining Time
     */
    public StepClimberData(@NonNull byte[] flags, int floors, int stepCount, int stepPerMinute, int averageStepRate, int positiveElevationGain, int totalEnergy, int energyPerHour, int energyPerMinute, int heartRate, int metabolicEquivalent, int elapsedTime, int remainingTime) {
        mFlags = flags;
        mFloors = floors;
        mStepCount = stepCount;
        mStepPerMinute = stepPerMinute;
        mAverageStepRate = averageStepRate;
        mPositiveElevationGain = positiveElevationGain;
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
     * @return Floors
     */
    public int getFloors() {
        return mFloors;
    }

    /**
     * @return Step Count
     */
    public int getStepCount() {
        return mStepCount;
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
     * @return Positive Elevation Gain
     */
    public int getPositiveElevationGain() {
        return mPositiveElevationGain;
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
        int length = 2;
        byte[] data = new byte[23];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put(mFlags);
        if (StepClimberDataUtils.isFlagsMoreDataFalse(mFlags)) {
            byteBuffer.putShort((short) mFloors);
            byteBuffer.putShort((short) mStepCount);
            length += 4;
        }
        if (StepClimberDataUtils.isFlagsStepPerMinutePresent(mFlags)) {
            byteBuffer.putShort((short) mStepPerMinute);
            length += 2;
        }
        if (StepClimberDataUtils.isFlagsAverageStepRatePresent(mFlags)) {
            byteBuffer.putShort((short) mAverageStepRate);
            length += 2;
        }
        if (StepClimberDataUtils.isFlagsPositiveElevationGainPresent(mFlags)) {
            byteBuffer.putShort((short) mPositiveElevationGain);
            length += 2;
        }
        if (StepClimberDataUtils.isFlagsExpendedEnergyPresent(mFlags)) {
            byteBuffer.putShort((short) mTotalEnergy);
            byteBuffer.putShort((short) mEnergyPerHour);
            byteBuffer.put((byte) mEnergyPerMinute);
            length += 5;
        }
        if (StepClimberDataUtils.isFlagsHeartRatePresent(mFlags)) {
            byteBuffer.put((byte) mHeartRate);
            length++;
        }
        if (StepClimberDataUtils.isFlagsMetabolicEquivalentPresent(mFlags)) {
            byteBuffer.put((byte) mMetabolicEquivalent);
            length++;
        }
        if (StepClimberDataUtils.isFlagsElapsedTimePresent(mFlags)) {
            byteBuffer.putShort((short) mElapsedTime);
            length += 2;
        }
        if (StepClimberDataUtils.isFlagsRemainingTimePresent(mFlags)) {
            byteBuffer.putShort((short) mRemainingTime);
            length += 2;
        }
        return Arrays.copyOfRange(data, 0, length);
    }

}
