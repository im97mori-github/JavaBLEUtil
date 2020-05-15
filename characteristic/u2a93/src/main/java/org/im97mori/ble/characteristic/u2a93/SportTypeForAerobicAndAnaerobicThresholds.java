package org.im97mori.ble.characteristic.u2a93;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Sport Type for Aerobic and Anaerobic Thresholds (Characteristics UUID: 0x2A93)
 */
public class SportTypeForAerobicAndAnaerobicThresholds implements ByteArrayInterface {

    /**
     * 0: Unspecified
     */
    public static final int SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_UNSPECIFIED = 0;

    /**
     * 1: Running (Treadmill)
     */
    public static final int SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_RUNNING = 1;

    /**
     * 2: Cycling (Ergometer)
     */
    public static final int SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_CYCLING = 2;

    /**
     * 3: Rowing (Ergometer)
     */
    public static final int SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_ROWING = 3;

    /**
     * 4: Cross Training (Elliptical)
     */
    public static final int SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_CROSS_TRAINING = 4;

    /**
     * 5: Climbing
     */
    public static final int SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_CLIMBING = 5;

    /**
     * 6: Skiing
     */
    public static final int SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_SKIING = 6;

    /**
     * 7: Skating
     */
    public static final int SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_SKATING = 7;

    /**
     * 8: Arm exercising
     */
    public static final int SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_ARM_EXERCISING = 8;

    /**
     * 9: Lower body exercising
     */
    public static final int SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_LOWER_BODY_EXERCISING = 9;

    /**
     * 10: Upper body exercising
     */
    public static final int SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_UPPER_BODY_EXERCISING = 10;

    /**
     * 11: Whole body exercising
     */
    public static final int SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_WHOLE_BODY_EXERCISING = 11;

    /**
     * Sport Type for Aerobic and Anaerobic Thresholds
     */
    private final int mSportTypeForAerobicAndAnaerobicThresholds;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A93
     */
    public SportTypeForAerobicAndAnaerobicThresholds(@NonNull byte[] values) {
        mSportTypeForAerobicAndAnaerobicThresholds = (values[0] & 0xff);
    }

    /**
     * Constructor from parameters
     * 
     * @param sportTypeForAerobicAndAnaerobicThresholds Sport Type for Aerobic and Anaerobic Thresholds
     */
    public SportTypeForAerobicAndAnaerobicThresholds(int sportTypeForAerobicAndAnaerobicThresholds) {
        mSportTypeForAerobicAndAnaerobicThresholds = sportTypeForAerobicAndAnaerobicThresholds;
    }

    /**
     * @return Sport Type for Aerobic and Anaerobic Thresholds
     */
    public int getSportTypeForAerobicAndAnaerobicThresholds() {
        return mSportTypeForAerobicAndAnaerobicThresholds;
    }

    /**
     * @return {@code true}:Unspecified, {@code false}:not Unspecified
     */
    public boolean isSportTypeForAerobicAndAnaerobicThresholdsUnspecified() {
        return SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_UNSPECIFIED == mSportTypeForAerobicAndAnaerobicThresholds;
    }

    /**
     * @return {@code true}:Running, {@code false}:not Running
     */
    public boolean isSportTypeForAerobicAndAnaerobicThresholdsRunning() {
        return SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_RUNNING == mSportTypeForAerobicAndAnaerobicThresholds;
    }

    /**
     * @return {@code true}:Cycling, {@code false}:not Cycling
     */
    public boolean isSportTypeForAerobicAndAnaerobicThresholdsCycling() {
        return SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_CYCLING == mSportTypeForAerobicAndAnaerobicThresholds;
    }

    /**
     * @return {@code true}:Rowing, {@code false}:not Rowing
     */
    public boolean isSportTypeForAerobicAndAnaerobicThresholdsRowing() {
        return SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_ROWING == mSportTypeForAerobicAndAnaerobicThresholds;
    }

    /**
     * @return {@code true}:Cross Training, {@code false}:not Cross Training
     */
    public boolean isSportTypeForAerobicAndAnaerobicThresholdsCrossTraining() {
        return SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_CROSS_TRAINING == mSportTypeForAerobicAndAnaerobicThresholds;
    }

    /**
     * @return {@code true}:Climbing, {@code false}:not Climbing
     */
    public boolean isSportTypeForAerobicAndAnaerobicThresholdsClimbing() {
        return SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_CLIMBING == mSportTypeForAerobicAndAnaerobicThresholds;
    }

    /**
     * @return {@code true}:Skiing, {@code false}:not Skiing
     */
    public boolean isSportTypeForAerobicAndAnaerobicThresholdsSkiing() {
        return SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_SKIING == mSportTypeForAerobicAndAnaerobicThresholds;
    }

    /**
     * @return {@code true}:Skating, {@code false}:not Skating
     */
    public boolean isSportTypeForAerobicAndAnaerobicThresholdsSkating() {
        return SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_SKATING == mSportTypeForAerobicAndAnaerobicThresholds;
    }

    /**
     * @return {@code true}:Arm exercising, {@code false}:not Arm exercising
     */
    public boolean isSportTypeForAerobicAndAnaerobicThresholdsArmExercising() {
        return SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_ARM_EXERCISING == mSportTypeForAerobicAndAnaerobicThresholds;
    }

    /**
     * @return {@code true}:Lower body exercising, {@code false}:not Lower body exercising
     */
    public boolean isSportTypeForAerobicAndAnaerobicThresholdsLowerBodyExercising() {
        return SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_LOWER_BODY_EXERCISING == mSportTypeForAerobicAndAnaerobicThresholds;
    }

    /**
     * @return {@code true}:Upper body exercising, {@code false}:not Upper body exercising
     */
    public boolean isSportTypeForAerobicAndAnaerobicThresholdsUpperBodyExercising() {
        return SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_UPPER_BODY_EXERCISING == mSportTypeForAerobicAndAnaerobicThresholds;
    }

    /**
     * @return {@code true}:Whole body exercising, {@code false}:not Whole body exercising
     */
    public boolean isSportTypeForAerobicAndAnaerobicThresholdsWholeBodyExercising() {
        return SPORT_TYPE_FOR_AEROBIC_AND_ANAEROBIC_THRESHOLDS_WHOLE_BODY_EXERCISING == mSportTypeForAerobicAndAnaerobicThresholds;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mSportTypeForAerobicAndAnaerobicThresholds);
        return data;
    }

}
