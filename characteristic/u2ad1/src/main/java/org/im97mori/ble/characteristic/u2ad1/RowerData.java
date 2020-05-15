package org.im97mori.ble.characteristic.u2ad1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;
import org.im97mori.ble.characteristic.core.RowerDataUtils;

import androidx.annotation.NonNull;

/**
 * Rower Data (Characteristics UUID: 0x2AD1)
 */
public class RowerData implements ByteArrayInterface {

    /**
     * Flags
     */
    private final byte[] mFlags;

    /**
     * Stroke Rate
     */
    private final int mStrokeRate;

    /**
     * Stroke Count
     */
    private final int mStrokeCount;

    /**
     * Average Stroke Rate
     */
    private final int mAverageStrokeRate;

    /**
     * Total Distance
     */
    private final int mTotalDistance;

    /**
     * Instantaneous Pace
     */
    private final int mInstantaneousPace;

    /**
     * Average Pace
     */
    private final int mAveragePace;

    /**
     * Instantaneous Power
     */
    private final int mInstantaneousPower;

    /**
     * Average Power
     */
    private final int mAveragePower;

    /**
     * Resistance Level
     */
    private final int mResistanceLevel;

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
     * Constructor from {@link RowerDataPacket} array
     *
     * @param rowerDataPackets 1 or more Rower Data packet array
     */
    public RowerData(@NonNull RowerDataPacket[] rowerDataPackets) {
        byte[] flags = new byte[2];
        int strokeRate = 0;
        int strokeCount = 0;
        int averageStrokeRate = 0;
        int totalDistance = 0;
        int instantaneousPace = 0;
        int averagePace = 0;
        int instantaneousPower = 0;
        int averagePower = 0;
        int resistanceLevel = 0;
        int totalEnergy = 0;
        int energyPerHour = 0;
        int energyPerMinute = 0;
        int heartRate = 0;
        int metabolicEquivalent = 0;
        int elapsedTime = 0;
        int remainingTime = 0;

        // give priority to after packet
        for (RowerDataPacket rowerDataPacket : rowerDataPackets) {
            byte[] values = rowerDataPacket.getBytes();
            int index = 2;
            flags = Arrays.copyOfRange(values, 0, 2);
            if (RowerDataUtils.isFlagsMoreDataFalse(flags)) {
                strokeRate = (values[index++] & 0xff);
                strokeCount = BLEUtils.createUInt16(values, index);
                index += 2;
            }
            if (RowerDataUtils.isFlagsAverageStrokePresent(flags)) {
                averageStrokeRate = (values[index++] & 0xff);
            }
            if (RowerDataUtils.isFlagsTotalDistancePresente(flags)) {
                totalDistance = BLEUtils.createUInt24(values, index);
                index += 3;
            }
            if (RowerDataUtils.isFlagsInstantaneousPacePresent(flags)) {
                instantaneousPace = BLEUtils.createUInt16(values, index);
                index += 2;
            }
            if (RowerDataUtils.isFlagsAveragePacePresent(flags)) {
                averagePace = BLEUtils.createUInt16(values, index);
                index += 2;
            }
            if (RowerDataUtils.isFlagsInstantaneousPowerPresent(flags)) {
                instantaneousPower = BLEUtils.createSInt16(values, index);
                index += 2;
            }
            if (RowerDataUtils.isFlagsAveragePowerPresent(flags)) {
                averagePower = BLEUtils.createSInt16(values, index);
                index += 2;
            }
            if (RowerDataUtils.isFlagsResistanceLevelPresent(flags)) {
                resistanceLevel = BLEUtils.createSInt16(values, index);
                index += 2;
            }
            if (RowerDataUtils.isFlagsExpendedEnergyPresent(flags)) {
                totalEnergy = BLEUtils.createUInt16(values, index);
                index += 2;
                energyPerHour = BLEUtils.createUInt16(values, index);
                index += 2;
                energyPerMinute = (values[index++] & 0xff);
            }
            if (RowerDataUtils.isFlagsHeartRatePresent(flags)) {
                heartRate = (values[index++] & 0xff);
            }
            if (RowerDataUtils.isFlagsMetabolicEquivalentPresent(flags)) {
                metabolicEquivalent = (values[index++] & 0xff);
            }
            if (RowerDataUtils.isFlagsElapsedTimePresent(flags)) {
                elapsedTime = BLEUtils.createUInt16(values, index);
                index += 2;
            }
            if (RowerDataUtils.isFlagsRemainingTimePresent(flags)) {
                remainingTime = BLEUtils.createUInt16(values, index);
            }
        }

        mFlags = flags;
        mStrokeRate = strokeRate;
        mStrokeCount = strokeCount;
        mAverageStrokeRate = averageStrokeRate;
        mTotalDistance = totalDistance;
        mInstantaneousPace = instantaneousPace;
        mAveragePace = averagePace;
        mInstantaneousPower = instantaneousPower;
        mAveragePower = averagePower;
        mResistanceLevel = resistanceLevel;
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
     * @param flags               Flags
     * @param strokeRate          Stroke Rate
     * @param strokeCount         Stroke Count
     * @param averageStrokeRate   Average Stroke Rate
     * @param totalDistance       Total Distance
     * @param instantaneousPace   Instantaneous Pace
     * @param averagePace         Average Pace
     * @param instantaneousPower  Instantaneous Power
     * @param averagePower        Average Power
     * @param resistanceLevel     Resistance Level
     * @param totalEnergy         Total Energy
     * @param energyPerHour       Energy Per Hour
     * @param energyPerMinute     Energy Per Minute
     * @param heartRate           Heart Rate
     * @param metabolicEquivalent Metabolic Equivalent
     * @param elapsedTime         Elapsed Time
     * @param remainingTime       Remaining Time
     */
    public RowerData(@NonNull byte[] flags, int strokeRate, int strokeCount, int averageStrokeRate, int totalDistance, int instantaneousPace, int averagePace, int instantaneousPower, int averagePower, int resistanceLevel, int totalEnergy, int energyPerHour, int energyPerMinute, int heartRate, int metabolicEquivalent, int elapsedTime, int remainingTime) {
        mFlags = flags;
        mStrokeRate = strokeRate;
        mStrokeCount = strokeCount;
        mAverageStrokeRate = averageStrokeRate;
        mTotalDistance = totalDistance;
        mInstantaneousPace = instantaneousPace;
        mAveragePace = averagePace;
        mInstantaneousPower = instantaneousPower;
        mAveragePower = averagePower;
        mResistanceLevel = resistanceLevel;
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
     * @return Stroke Rate
     */
    public int getStrokeRate() {
        return mStrokeRate;
    }

    /**
     * @return Stroke Count
     */
    public int getStrokeCount() {
        return mStrokeCount;
    }

    /**
     * @return Average Stroke Rate
     */
    public int getAverageStrokeRate() {
        return mAverageStrokeRate;
    }

    /**
     * @return Total Distance
     */
    public int getTotalDistance() {
        return mTotalDistance;
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
     * @return Resistance Level
     */
    public int getResistanceLevel() {
        return mResistanceLevel;
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
        byte[] data = new byte[30];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put(mFlags);
        length += 2;
        if (RowerDataUtils.isFlagsMoreDataFalse(mFlags)) {
            byteBuffer.put((byte) mStrokeRate);
            byteBuffer.putShort((short) mStrokeCount);
            length += 3;
        }
        if (RowerDataUtils.isFlagsAverageStrokePresent(mFlags)) {
            byteBuffer.put((byte) mAverageStrokeRate);
            length++;
        }
        if (RowerDataUtils.isFlagsTotalDistancePresente(mFlags)) {
            byteBuffer.put((byte) mTotalDistance);
            byteBuffer.put((byte) (mTotalDistance >> 8));
            byteBuffer.put((byte) (mTotalDistance >> 16));
            length += 3;
        }
        if (RowerDataUtils.isFlagsInstantaneousPacePresent(mFlags)) {
            byteBuffer.putShort((short) mInstantaneousPace);
            length += 2;
        }
        if (RowerDataUtils.isFlagsAveragePacePresent(mFlags)) {
            byteBuffer.putShort((short) mAveragePace);
            length += 2;
        }
        if (RowerDataUtils.isFlagsInstantaneousPowerPresent(mFlags)) {
            byteBuffer.putShort((short) mInstantaneousPower);
            length += 2;
        }
        if (RowerDataUtils.isFlagsAveragePowerPresent(mFlags)) {
            byteBuffer.putShort((short) mAveragePower);
            length += 2;
        }
        if (RowerDataUtils.isFlagsResistanceLevelPresent(mFlags)) {
            byteBuffer.putShort((short) mResistanceLevel);
            length += 2;
        }
        if (RowerDataUtils.isFlagsExpendedEnergyPresent(mFlags)) {
            byteBuffer.putShort((short) mTotalEnergy);
            byteBuffer.putShort((short) mEnergyPerHour);
            byteBuffer.put((byte) mEnergyPerMinute);
            length += 5;
        }
        if (RowerDataUtils.isFlagsHeartRatePresent(mFlags)) {
            byteBuffer.put((byte) mHeartRate);
            length++;
        }
        if (RowerDataUtils.isFlagsMetabolicEquivalentPresent(mFlags)) {
            byteBuffer.put((byte) mMetabolicEquivalent);
            length++;
        }
        if (RowerDataUtils.isFlagsElapsedTimePresent(mFlags)) {
            byteBuffer.putShort((short) mElapsedTime);
            length += 2;
        }
        if (RowerDataUtils.isFlagsRemainingTimePresent(mFlags)) {
            byteBuffer.putShort((short) mRemainingTime);
            length += 2;
        }
        return Arrays.copyOfRange(data, 0, length);
    }

}
