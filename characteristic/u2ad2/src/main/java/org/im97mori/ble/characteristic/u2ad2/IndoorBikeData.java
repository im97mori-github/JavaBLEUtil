package org.im97mori.ble.characteristic.u2ad2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;
import org.im97mori.ble.characteristic.core.IndoorBikeDataUtils;

import androidx.annotation.NonNull;

/**
 * Indoor Bike Data (Characteristics UUID: 0x2AD2)
 */
public class IndoorBikeData implements ByteArrayInterface {

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
     * Instantaneous Cadence
     */
    private final int mInstantaneousCadence;

    /**
     * Average Cadence
     */
    private final int mAverageCadence;

    /**
     * Total Distance
     */
    private final int mTotalDistance;

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
     * Constructor from {@link IndoorBikeDataPacket} array
     *
     * @param indoorBikeDataPackets 1 or more Indoor Bike Data packet array
     */
    public IndoorBikeData(@NonNull IndoorBikeDataPacket... indoorBikeDataPackets) {
        byte[] flags = new byte[2];
        int instantaneousSpeed = 0;
        int averageSpeed = 0;
        int instantaneousCadence = 0;
        int averageCadence = 0;
        int totalDistance = 0;
        int resistanceLevel = 0;
        int instantaneousPower = 0;
        int averagePower = 0;
        int totalEnergy = 0;
        int energyPerHour = 0;
        int energyPerMinute = 0;
        int heartRate = 0;
        int metabolicEquivalent = 0;
        int elapsedTime = 0;
        int remainingTime = 0;

        // give priority to after packet
        for (IndoorBikeDataPacket indoorBikeDataPacket : indoorBikeDataPackets) {
            byte[] values = indoorBikeDataPacket.getBytes();
            int index = 2;
            flags = Arrays.copyOfRange(values, 0, 2);
            if (IndoorBikeDataUtils.isFlagsMoreDataFalse(flags)) {
                instantaneousSpeed = BLEUtils.createUInt16(values, index);
                index += 2;
            }
            if (IndoorBikeDataUtils.isFlagsAverageSpeedPresent(flags)) {
                averageSpeed = BLEUtils.createUInt16(values, index);
                index += 2;
            }
            if (IndoorBikeDataUtils.isFlagsInstantaneousCadencePresent(flags)) {
                instantaneousCadence = BLEUtils.createUInt16(values, index);
                index += 2;
            }
            if (IndoorBikeDataUtils.isFlagsAverageCandencePresent(flags)) {
                averageCadence = BLEUtils.createUInt16(values, index);
                index += 2;
            }
            if (IndoorBikeDataUtils.isFlagsTotalDistancePresent(flags)) {
                totalDistance = BLEUtils.createUInt24(values, index);
                index += 3;
            }
            if (IndoorBikeDataUtils.isFlagsResistanceLevelPresent(flags)) {
                resistanceLevel = BLEUtils.createSInt16(values, index);
                index += 2;
            }
            if (IndoorBikeDataUtils.isFlagsInstantaneousPowerPresent(flags)) {
                instantaneousPower = BLEUtils.createSInt16(values, index);
                index += 2;
            }
            if (IndoorBikeDataUtils.isFlagsAveragePowerPresent(flags)) {
                averagePower = BLEUtils.createSInt16(values, index);
                index += 2;
            }
            if (IndoorBikeDataUtils.isFlagsExpendedEnergyPresent(flags)) {
                totalEnergy = BLEUtils.createUInt16(values, index);
                index += 2;
                energyPerHour = BLEUtils.createUInt16(values, index);
                index += 2;
                energyPerMinute = (values[index++] & 0xff);
            }
            if (IndoorBikeDataUtils.isFlagsHeartRatePresent(flags)) {
                heartRate = (values[index++] & 0xff);
            }
            if (IndoorBikeDataUtils.isFlagsMetabolicEquivalentPresent(flags)) {
                metabolicEquivalent = (values[index++] & 0xff);
            }
            if (IndoorBikeDataUtils.isFlagsElapsedTimePresent(flags)) {
                elapsedTime = BLEUtils.createUInt16(values, index);
                index += 2;
            }
            if (IndoorBikeDataUtils.isFlagsRemainingTimePresent(flags)) {
                remainingTime = BLEUtils.createUInt16(values, index);
            }
        }

        mFlags = flags;
        mInstantaneousSpeed = instantaneousSpeed;
        mAverageSpeed = averageSpeed;
        mInstantaneousCadence = instantaneousCadence;
        mAverageCadence = averageCadence;
        mTotalDistance = totalDistance;
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
     * Constructor from parameters
     * 
     * @param flags                Flags
     * @param instantaneousSpeed   Instantaneous Speed
     * @param averageSpeed         Average Speed
     * @param instantaneousCadence Instantaneous Cadence
     * @param averageCadence       Average Cadence
     * @param totalDistance        Total Distance
     * @param resistanceLevel      Resistance Level
     * @param instantaneousPower   Instantaneous Power
     * @param averagePower         Average Power
     * @param totalEnergy          Total Energy
     * @param energyPerHour        Energy Per Hour
     * @param energyPerMinute      Energy Per Minute
     * @param heartRate            Heart Rate
     * @param metabolicEquivalent  Metabolic Equivalent
     * @param elapsedTime          Elapsed Time
     * @param remainingTime        Remaining Time
     */
    public IndoorBikeData(@NonNull byte[] flags, int instantaneousSpeed, int averageSpeed, int instantaneousCadence, int averageCadence, int totalDistance, int resistanceLevel, int instantaneousPower, int averagePower, int totalEnergy, int energyPerHour, int energyPerMinute, int heartRate, int metabolicEquivalent, int elapsedTime, int remainingTime) {
        mFlags = flags;
        mInstantaneousSpeed = instantaneousSpeed;
        mAverageSpeed = averageSpeed;
        mInstantaneousCadence = instantaneousCadence;
        mAverageCadence = averageCadence;
        mTotalDistance = totalDistance;
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
     * @return Instantaneous Cadence
     */
    public int getInstantaneousCadence() {
        return mInstantaneousCadence;
    }

    /**
     * @return Average Cadence
     */
    public int getAverageCadence() {
        return mAverageCadence;
    }

    /**
     * @return Total Distance
     */
    public int getTotalDistance() {
        return mTotalDistance;
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
        byte[] data = new byte[30];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put(mFlags);
        length += 2;
        if (IndoorBikeDataUtils.isFlagsMoreDataFalse(mFlags)) {
            byteBuffer.putShort((short) mInstantaneousSpeed);
            length += 2;
        }
        if (IndoorBikeDataUtils.isFlagsAverageSpeedPresent(mFlags)) {
            byteBuffer.putShort((short) mAverageSpeed);
            length += 2;
        }
        if (IndoorBikeDataUtils.isFlagsInstantaneousCadencePresent(mFlags)) {
            byteBuffer.putShort((short) mInstantaneousCadence);
            length += 2;
        }
        if (IndoorBikeDataUtils.isFlagsAverageCandencePresent(mFlags)) {
            byteBuffer.putShort((short) mAverageCadence);
            length += 2;
        }
        if (IndoorBikeDataUtils.isFlagsTotalDistancePresent(mFlags)) {
            byteBuffer.put((byte) mTotalDistance);
            byteBuffer.put((byte) (mTotalDistance >> 8));
            byteBuffer.put((byte) (mTotalDistance >> 16));
            length += 3;
        }
        if (IndoorBikeDataUtils.isFlagsResistanceLevelPresent(mFlags)) {
            byteBuffer.putShort((short) mResistanceLevel);
            length += 2;
        }
        if (IndoorBikeDataUtils.isFlagsInstantaneousPowerPresent(mFlags)) {
            byteBuffer.putShort((short) mInstantaneousPower);
            length += 2;
        }
        if (IndoorBikeDataUtils.isFlagsAveragePowerPresent(mFlags)) {
            byteBuffer.putShort((short) mAveragePower);
            length += 2;
        }
        if (IndoorBikeDataUtils.isFlagsExpendedEnergyPresent(mFlags)) {
            byteBuffer.putShort((short) mTotalEnergy);
            byteBuffer.putShort((short) mEnergyPerHour);
            byteBuffer.put((byte) mEnergyPerMinute);
            length += 5;
        }
        if (IndoorBikeDataUtils.isFlagsHeartRatePresent(mFlags)) {
            byteBuffer.put((byte) mHeartRate);
            length++;
        }
        if (IndoorBikeDataUtils.isFlagsMetabolicEquivalentPresent(mFlags)) {
            byteBuffer.put((byte) mMetabolicEquivalent);
            length++;
        }
        if (IndoorBikeDataUtils.isFlagsElapsedTimePresent(mFlags)) {
            byteBuffer.putShort((short) mElapsedTime);
            length += 2;
        }
        if (IndoorBikeDataUtils.isFlagsRemainingTimePresent(mFlags)) {
            byteBuffer.putShort((short) mRemainingTime);
            length += 2;
        }
        return Arrays.copyOfRange(data, 0, length);
    }

}
