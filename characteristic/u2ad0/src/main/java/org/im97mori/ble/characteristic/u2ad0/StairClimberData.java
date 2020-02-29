package org.im97mori.ble.characteristic.u2ad0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;
import org.im97mori.ble.characteristic.core.StairClimberDataUtils;

import androidx.annotation.NonNull;

/**
 * Stair Climber Data (Characteristics UUID: 0x2AD0)
 */
public class StairClimberData implements ByteArrayInterface {

    /**
     * Flags
     */
    private final byte[] mFlags;

    /**
     * Floors
     */
    private final int mFloors;

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
     * Stride Count
     */
    private final int mStrideCount;

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
     * Constructor from {@link StairClimberDataPacket} array
     *
     * @param stairClimberDataPackets 1 or more Stair Climber Data packet array
     */
    public StairClimberData(@NonNull StairClimberDataPacket[] stairClimberDataPackets) {
        byte[] flags = new byte[2];
        int floors = 0;
        int stepPerMinute = 0;
        int averageStepRate = 0;
        int positiveElevationGain = 0;
        int strideCount = 0;
        int totalEnergy = 0;
        int energyPerHour = 0;
        int energyPerMinute = 0;
        int heartRate = 0;
        int metabolicEquivalent = 0;
        int elapsedTime = 0;
        int remainingTime = 0;

        // give priority to after packet
        for (StairClimberDataPacket stairClimberDataPacket : stairClimberDataPackets) {
            byte[] values = stairClimberDataPacket.getBytes();
            int index = 2;
            flags = Arrays.copyOfRange(values, 0, 2);
            if (StairClimberDataUtils.isFlagsMoreDataFalse(flags)) {
                floors = BLEUtils.createUInt16(values, index);
                index += 2;
            }
            if (StairClimberDataUtils.isFlagsStepPerMinutePresent(flags)) {
                stepPerMinute = BLEUtils.createUInt16(values, index);
                index += 2;
            }
            if (StairClimberDataUtils.isFlagsAverageStepRatePresent(flags)) {
                averageStepRate = BLEUtils.createUInt16(values, index);
                index += 2;
            }
            if (StairClimberDataUtils.isFlagsPositiveElevationGainPresent(flags)) {
                positiveElevationGain = BLEUtils.createUInt16(values, index);
                index += 2;
            }
            if (StairClimberDataUtils.isFlagsStrideCountPresent(flags)) {
                strideCount = BLEUtils.createUInt16(values, index);
                index += 2;
            }
            if (StairClimberDataUtils.isFlagsExpendedEnergyPresent(flags)) {
                totalEnergy = BLEUtils.createUInt16(values, index);
                index += 2;
                energyPerHour = BLEUtils.createUInt16(values, index);
                index += 2;
                energyPerMinute = (values[index++] & 0xff);
            }
            if (StairClimberDataUtils.isFlagsHeartRatePresent(flags)) {
                heartRate = (values[index++] & 0xff);
            }
            if (StairClimberDataUtils.isFlagsMetabolicEquivalentPresent(flags)) {
                metabolicEquivalent = (values[index++] & 0xff);
            }
            if (StairClimberDataUtils.isFlagsElapsedTimePresent(flags)) {
                elapsedTime = BLEUtils.createUInt16(values, index);
                index += 2;
            }
            if (StairClimberDataUtils.isFlagsRemainingTimePresent(flags)) {
                remainingTime = BLEUtils.createUInt16(values, index);
            }
        }

        mFlags = flags;
        mFloors = floors;
        mStepPerMinute = stepPerMinute;
        mAverageStepRate = averageStepRate;
        mPositiveElevationGain = positiveElevationGain;
        mStrideCount = strideCount;
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
     * @return Stride Count
     */
    public int getStrideCount() {
        return mStrideCount;
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
        byte[] data = new byte[23];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put(mFlags);
        length += 2;
        if (StairClimberDataUtils.isFlagsMoreDataFalse(mFlags)) {
            byteBuffer.putShort((short) mFloors);
            length += 2;
        }
        if (StairClimberDataUtils.isFlagsStepPerMinutePresent(mFlags)) {
            byteBuffer.putShort((short) mStepPerMinute);
            length += 2;
        }
        if (StairClimberDataUtils.isFlagsAverageStepRatePresent(mFlags)) {
            byteBuffer.putShort((short) mAverageStepRate);
            length += 2;
        }
        if (StairClimberDataUtils.isFlagsPositiveElevationGainPresent(mFlags)) {
            byteBuffer.putShort((short) mPositiveElevationGain);
            length += 2;
        }
        if (StairClimberDataUtils.isFlagsStrideCountPresent(mFlags)) {
            byteBuffer.putShort((short) mStrideCount);
            length += 2;
        }
        if (StairClimberDataUtils.isFlagsExpendedEnergyPresent(mFlags)) {
            byteBuffer.putShort((short) mTotalEnergy);
            byteBuffer.putShort((short) mEnergyPerHour);
            byteBuffer.put((byte) mEnergyPerMinute);
            length += 5;
        }
        if (StairClimberDataUtils.isFlagsHeartRatePresent(mFlags)) {
            byteBuffer.put((byte) mHeartRate);
            length++;
        }
        if (StairClimberDataUtils.isFlagsMetabolicEquivalentPresent(mFlags)) {
            byteBuffer.put((byte) mMetabolicEquivalent);
            length++;
        }
        if (StairClimberDataUtils.isFlagsElapsedTimePresent(mFlags)) {
            byteBuffer.putShort((short) mElapsedTime);
            length += 2;
        }
        if (StairClimberDataUtils.isFlagsRemainingTimePresent(mFlags)) {
            byteBuffer.putShort((short) mRemainingTime);
            length += 2;
        }
        return Arrays.copyOfRange(data, 0, length);
    }

}
