package org.im97mori.ble.characteristic.u2b4e;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Activity Goal (Characteristics UUID: 0x2B4E)
 */
public class ActivityGoal implements ByteArrayInterface {

    /**
     * @see #PRESENCE_FLAGS_TOTAL_ENERGY_EXPENDITURE_PRESENT_FALSE
     * @see #PRESENCE_FLAGS_TOTAL_ENERGY_EXPENDITURE_PRESENT_TRUE
     */
    public static final int PRESENCE_FLAGS_TOTAL_ENERGY_EXPENDITURE_PRESENT_MASK = 0b00000001;

    /**
     * 0: Total Energy Expenditure Present False
     */
    public static final int PRESENCE_FLAGS_TOTAL_ENERGY_EXPENDITURE_PRESENT_FALSE = 0b00000000;

    /**
     * 1: Total Energy Expenditure Present True
     */
    public static final int PRESENCE_FLAGS_TOTAL_ENERGY_EXPENDITURE_PRESENT_TRUE = 0b00000001;

    /**
     * @see #PRESENCE_FLAGS_NORMAL_WALKING_STEPS_PRESENT_FALSE
     * @see #PRESENCE_FLAGS_NORMAL_WALKING_STEPS_PRESENT_TRUE
     */
    public static final int PRESENCE_FLAGS_NORMAL_WALKING_STEPS_PRESENT_MASK = 0b00000010;

    /**
     * 0: Normal Walking Steps Present False
     */
    public static final int PRESENCE_FLAGS_NORMAL_WALKING_STEPS_PRESENT_FALSE = 0b00000000;

    /**
     * 1: Normal Walking Steps Present True
     */
    public static final int PRESENCE_FLAGS_NORMAL_WALKING_STEPS_PRESENT_TRUE = 0b00000010;

    /**
     * @see #PRESENCE_FLAGS_INTENSITY_STEPS_PRESENT_FALSE
     * @see #PRESENCE_FLAGS_INTENSITY_STEPS_PRESENT_TRUE
     */
    public static final int PRESENCE_FLAGS_INTENSITY_STEPS_PRESENT_MASK = 0b00000100;

    /**
     * 0: Intensity Steps Present False
     */
    public static final int PRESENCE_FLAGS_INTENSITY_STEPS_PRESENT_FALSE = 0b00000000;

    /**
     * 1: Intensity Steps Present True
     */
    public static final int PRESENCE_FLAGS_INTENSITY_STEPS_PRESENT_TRUE = 0b00000100;

    /**
     * @see #PRESENCE_FLAGS_FLOOR_STEPS_PRESENT_FALSE
     * @see #PRESENCE_FLAGS_FLOOR_STEPS_PRESENT_TRUE
     */
    public static final int PRESENCE_FLAGS_FLOOR_STEPS_PRESENT_MASK = 0b00001000;

    /**
     * 0: Floor Steps Present False
     */
    public static final int PRESENCE_FLAGS_FLOOR_STEPS_PRESENT_FALSE = 0b00000000;

    /**
     * 1: Floor Steps Present True
     */
    public static final int PRESENCE_FLAGS_FLOOR_STEPS_PRESENT_TRUE = 0b00001000;

    /**
     * @see #PRESENCE_FLAGS_DISTANCE_PRESENT_FALSE
     * @see #PRESENCE_FLAGS_DISTANCE_PRESENT_TRUE
     */
    public static final int PRESENCE_FLAGS_DISTANCE_PRESENT_MASK = 0b00010000;

    /**
     * 0: Distance Present False
     */
    public static final int PRESENCE_FLAGS_DISTANCE_PRESENT_FALSE = 0b00000000;

    /**
     * 1: Distance Present True
     */
    public static final int PRESENCE_FLAGS_DISTANCE_PRESENT_TRUE = 0b00010000;

    /**
     * @see #PRESENCE_FLAGS_DURATION_OF_NORMAL_WALKING_PRESENT_FALSE
     * @see #PRESENCE_FLAGS_DURATION_OF_NORMAL_WALKING_PRESENT_TRUE
     */
    public static final int PRESENCE_FLAGS_DURATION_OF_NORMAL_WALKING_PRESENT_MASK = 0b00100000;

    /**
     * 0: Duration of Normal Walking Present False
     */
    public static final int PRESENCE_FLAGS_DURATION_OF_NORMAL_WALKING_PRESENT_FALSE = 0b00000000;

    /**
     * 1: Duration of Normal Walking Present True
     */
    public static final int PRESENCE_FLAGS_DURATION_OF_NORMAL_WALKING_PRESENT_TRUE = 0b00100000;

    /**
     * @see #PRESENCE_FLAGS_DURATION_OF_INTENSITY_WALKING_PRESENT_FALSE
     * @see #PRESENCE_FLAGS_DURATION_OF_INTENSITY_WALKING_PRESENT_TRUE
     */
    public static final int PRESENCE_FLAGS_DURATION_OF_INTENSITY_WALKING_PRESENT_MASK = 0b01000000;

    /**
     * 0: Duration of Intensity Walking Present False
     */
    public static final int PRESENCE_FLAGS_DURATION_OF_INTENSITY_WALKING_PRESENT_FALSE = 0b00000000;

    /**
     * 1: Duration of Intensity Walking Present True
     */
    public static final int PRESENCE_FLAGS_DURATION_OF_INTENSITY_WALKING_PRESENT_TRUE = 0b01000000;

    /**
     * Total Energy Expenditure Unit 1000 joules
     */
    public static final double TOTAL_ENERGY_EXPENDITURE_RESOLUTION = 1000d;

    /**
     * Presence Flags
     */
    private final int mPresenceFlags;

    /**
     * Total Energy Expenditure
     */
    private final int mTotalEnergyExpenditure;

    /**
     * Normal Walking Steps
     */
    private final int mNormalWalkingSteps;

    /**
     * Intensity Steps
     */
    private final int mIntensitySteps;

    /**
     * Floor Steps
     */
    private final int mFloorSteps;

    /**
     * Distance
     */
    private final int mDistance;

    /**
     * Duration of Normal Walking
     */
    private final int mDurationOfNormalWalking;

    /**
     * Duration of Intensity Walking
     */
    private final int mDurationOfIntensityWalking;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public ActivityGoal(@NonNull byte[] values) {
        mPresenceFlags = values[0];
        int index = 1;
        if (isTotalEnergyExpenditurePresent()) {
            mTotalEnergyExpenditure = BLEUtils.createUInt16(values, index);
            index += 2;
        } else {
            mTotalEnergyExpenditure = 0;
        }
        if (isNormalWalkingStepsPresent()) {
            mNormalWalkingSteps = BLEUtils.createUInt24(values, index);
            index += 3;
        } else {
            mNormalWalkingSteps = 0;
        }
        if (isIntensityStepsPresent()) {
            mIntensitySteps = BLEUtils.createUInt24(values, index);
            index += 3;
        } else {
            mIntensitySteps = 0;
        }
        if (isFloorStepsPresent()) {
            mFloorSteps = BLEUtils.createUInt24(values, index);
            index += 3;
        } else {
            mFloorSteps = 0;
        }
        if (isDistancePresent()) {
            mDistance = BLEUtils.createUInt24(values, index);
            index += 3;
        } else {
            mDistance = 0;
        }
        if (isDurationOfNormalWalkingPresent()) {
            mDurationOfNormalWalking = BLEUtils.createUInt24(values, index);
            index += 3;
        } else {
            mDurationOfNormalWalking = 0;
        }
        if (isDurationOfIntensityWalkingPresent()) {
            mDurationOfIntensityWalking = BLEUtils.createUInt24(values, index);
            index += 3;
        } else {
            mDurationOfIntensityWalking = 0;
        }
    }

    /**
     * @return Presence Flags
     */
    public int getPresenceFlags() {
        return mPresenceFlags;
    }

    /**
     * @return {@code true}:Total Energy Expenditure not present, {@code false}:Total Energy Expenditure present
     */
    public boolean isTotalEnergyExpenditureNotPresent() {
        return isPresenceFlagsMatched(PRESENCE_FLAGS_TOTAL_ENERGY_EXPENDITURE_PRESENT_MASK, PRESENCE_FLAGS_TOTAL_ENERGY_EXPENDITURE_PRESENT_FALSE);
    }

    /**
     * @return {@code true}:Total Energy Expenditure present, {@code false}:Total Energy Expenditure not present
     */
    public boolean isTotalEnergyExpenditurePresent() {
        return isPresenceFlagsMatched(PRESENCE_FLAGS_TOTAL_ENERGY_EXPENDITURE_PRESENT_MASK, PRESENCE_FLAGS_TOTAL_ENERGY_EXPENDITURE_PRESENT_TRUE);
    }

    /**
     * @return {@code true}:Normal Walking Steps not present, {@code false}:Normal Walking Steps present
     */
    public boolean isNormalWalkingStepsNotPresent() {
        return isPresenceFlagsMatched(PRESENCE_FLAGS_NORMAL_WALKING_STEPS_PRESENT_MASK, PRESENCE_FLAGS_NORMAL_WALKING_STEPS_PRESENT_FALSE);
    }

    /**
     * @return {@code true}:Normal Walking Steps present, {@code false}Normal Walking Steps not present
     */
    public boolean isNormalWalkingStepsPresent() {
        return isPresenceFlagsMatched(PRESENCE_FLAGS_NORMAL_WALKING_STEPS_PRESENT_MASK, PRESENCE_FLAGS_NORMAL_WALKING_STEPS_PRESENT_TRUE);
    }

    /**
     * @return {@code true}:Intensity Steps not present, {@code false}:Intensity Steps resent
     */
    public boolean isIntensityStepsNotPresent() {
        return isPresenceFlagsMatched(PRESENCE_FLAGS_INTENSITY_STEPS_PRESENT_MASK, PRESENCE_FLAGS_INTENSITY_STEPS_PRESENT_FALSE);
    }

    /**
     * @return {@code true}:Intensity Steps present, {@code false}:Intensity Steps not present
     */
    public boolean isIntensityStepsPresent() {
        return isPresenceFlagsMatched(PRESENCE_FLAGS_INTENSITY_STEPS_PRESENT_MASK, PRESENCE_FLAGS_INTENSITY_STEPS_PRESENT_TRUE);
    }

    /**
     * @return {@code true}:Floor Steps not present, {@code false}:Floor Steps present
     */
    public boolean isFloorStepsNotPresent() {
        return isPresenceFlagsMatched(PRESENCE_FLAGS_FLOOR_STEPS_PRESENT_MASK, PRESENCE_FLAGS_FLOOR_STEPS_PRESENT_FALSE);
    }

    /**
     * @return {@code true}:Floor Steps present, {@code false}:Floor Steps not present
     */
    public boolean isFloorStepsPresent() {
        return isPresenceFlagsMatched(PRESENCE_FLAGS_FLOOR_STEPS_PRESENT_MASK, PRESENCE_FLAGS_FLOOR_STEPS_PRESENT_TRUE);
    }

    /**
     * @return {@code true}:Distance not present, {@code false}:Distance  present
     */
    public boolean isDistanceNotPresent() {
        return isPresenceFlagsMatched(PRESENCE_FLAGS_DISTANCE_PRESENT_MASK, PRESENCE_FLAGS_DISTANCE_PRESENT_FALSE);
    }

    /**
     * @return {@code true}:Distance present, {@code false}:Distance not present
     */
    public boolean isDistancePresent() {
        return isPresenceFlagsMatched(PRESENCE_FLAGS_DISTANCE_PRESENT_MASK, PRESENCE_FLAGS_DISTANCE_PRESENT_TRUE);
    }

    /**
     * @return {@code true}:Duration of Normal Walking not present, {@code false}:Duration of Normal Walking present
     */
    public boolean isDurationOfNormalWalkingNotPresent() {
        return isPresenceFlagsMatched(PRESENCE_FLAGS_DURATION_OF_NORMAL_WALKING_PRESENT_MASK, PRESENCE_FLAGS_DURATION_OF_NORMAL_WALKING_PRESENT_FALSE);
    }

    /**
     * @return {@code true}:Duration of Normal Walking present, {@code false}:Duration of Normal Walking not present
     */
    public boolean isDurationOfNormalWalkingPresent() {
        return isPresenceFlagsMatched(PRESENCE_FLAGS_DURATION_OF_NORMAL_WALKING_PRESENT_MASK, PRESENCE_FLAGS_DURATION_OF_NORMAL_WALKING_PRESENT_TRUE);
    }

    /**
     * @return {@code true}:Duration of Intensity Walking not present, {@code false}:Duration of Intensity Walking present
     */
    public boolean isDurationOfIntensityWalkingNotPresent() {
        return isPresenceFlagsMatched(PRESENCE_FLAGS_DURATION_OF_INTENSITY_WALKING_PRESENT_MASK, PRESENCE_FLAGS_DURATION_OF_INTENSITY_WALKING_PRESENT_FALSE);
    }

    /**
     * @return {@code true}:Duration of Intensity Walking present, {@code false}:Duration of Intensity Walking not present
     */
    public boolean isDurationOfIntensityWalkingPresent() {
        return isPresenceFlagsMatched(PRESENCE_FLAGS_DURATION_OF_INTENSITY_WALKING_PRESENT_MASK, PRESENCE_FLAGS_DURATION_OF_INTENSITY_WALKING_PRESENT_TRUE);
    }

    /**
     * @return Total Energy Expenditure
     */
    public int getTotalEnergyExpenditure() {
        return mTotalEnergyExpenditure;
    }

    /**
     * @return Total Energy Expenditure(joule)
     */
    public double getTotalEnergyExpenditureJoule() {
        return TOTAL_ENERGY_EXPENDITURE_RESOLUTION * mTotalEnergyExpenditure;
    }

    /**
     * @return Normal Walking Steps
     */
    public int getNormalWalkingSteps() {
        return mNormalWalkingSteps;
    }

    /**
     * @return Intensity Steps
     */
    public int getIntensitySteps() {
        return mIntensitySteps;
    }

    /**
     * @return Floor Steps
     */
    public int getFloorSteps() {
        return mFloorSteps;
    }

    /**
     * @return Distance
     */
    public int getDistance() {
        return mDistance;
    }

    /**
     * @return Duration of Normal Walking
     */
    public int getDurationOfNormalWalking() {
        return mDurationOfNormalWalking;
    }

    /**
     * @return Duration of Intensity Walking
     */
    public int getDurationOfIntensityWalking() {
        return mDurationOfIntensityWalking;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        int length = 1;
        byte[] data = new byte[21];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mPresenceFlags);
        if (isTotalEnergyExpenditurePresent()) {
            byteBuffer.putShort((short) mTotalEnergyExpenditure);
            length += 2;
        }
        if (isNormalWalkingStepsPresent()) {
            byteBuffer.put((byte) mNormalWalkingSteps);
            byteBuffer.put((byte) (mNormalWalkingSteps >> 8));
            byteBuffer.put((byte) (mNormalWalkingSteps >> 16));
            length += 3;
        }
        if (isIntensityStepsPresent()) {
            byteBuffer.put((byte) mIntensitySteps);
            byteBuffer.put((byte) (mIntensitySteps >> 8));
            byteBuffer.put((byte) (mIntensitySteps >> 16));
            length += 3;
        }
        if (isFloorStepsPresent()) {
            byteBuffer.put((byte) mFloorSteps);
            byteBuffer.put((byte) (mFloorSteps >> 8));
            byteBuffer.put((byte) (mFloorSteps >> 16));
            length += 3;
        }
        if (isDistancePresent()) {
            byteBuffer.put((byte) mDistance);
            byteBuffer.put((byte) (mDistance >> 8));
            byteBuffer.put((byte) (mDistance >> 16));
            length += 3;
        }
        if (isDurationOfNormalWalkingPresent()) {
            byteBuffer.put((byte) mDurationOfNormalWalking);
            byteBuffer.put((byte) (mDurationOfNormalWalking >> 8));
            byteBuffer.put((byte) (mDurationOfNormalWalking >> 16));
            length += 3;
        }
        if (isDurationOfIntensityWalkingPresent()) {
            byteBuffer.put((byte) mDurationOfIntensityWalking);
            byteBuffer.put((byte) (mDurationOfIntensityWalking >> 8));
            byteBuffer.put((byte) (mDurationOfIntensityWalking >> 16));
            length += 3;
        }
        return Arrays.copyOfRange(data, 0, length);
    }

    /**
     * check Presence Flags
     *
     * @param mask   bitmask for expect
     * @param expect one of {@link #PRESENCE_FLAGS_TOTAL_ENERGY_EXPENDITURE_PRESENT_FALSE}
     *               , {@link #PRESENCE_FLAGS_TOTAL_ENERGY_EXPENDITURE_PRESENT_TRUE}
     *               , {@link #PRESENCE_FLAGS_NORMAL_WALKING_STEPS_PRESENT_FALSE}
     *               , {@link #PRESENCE_FLAGS_NORMAL_WALKING_STEPS_PRESENT_TRUE}
     *               , {@link #PRESENCE_FLAGS_INTENSITY_STEPS_PRESENT_FALSE}
     *               , {@link #PRESENCE_FLAGS_INTENSITY_STEPS_PRESENT_TRUE}
     *               , {@link #PRESENCE_FLAGS_FLOOR_STEPS_PRESENT_FALSE}
     *               , {@link #PRESENCE_FLAGS_FLOOR_STEPS_PRESENT_TRUE}
     *               , {@link #PRESENCE_FLAGS_DISTANCE_PRESENT_FALSE}
     *               , {@link #PRESENCE_FLAGS_DISTANCE_PRESENT_TRUE}
     *               , {@link #PRESENCE_FLAGS_DURATION_OF_NORMAL_WALKING_PRESENT_FALSE}
     *               , {@link #PRESENCE_FLAGS_DURATION_OF_NORMAL_WALKING_PRESENT_TRUE}
     *               , {@link #PRESENCE_FLAGS_DURATION_OF_INTENSITY_WALKING_PRESENT_FALSE}
     *               , {@link #PRESENCE_FLAGS_DURATION_OF_INTENSITY_WALKING_PRESENT_TRUE}
     * @return {@code true}:same as expect, {@code false}:not match
     */
    private boolean isPresenceFlagsMatched(int mask, int expect) {
        return (mask & mPresenceFlags) == expect;
    }
}
