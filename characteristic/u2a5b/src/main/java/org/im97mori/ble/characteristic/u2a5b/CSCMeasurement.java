package org.im97mori.ble.characteristic.u2a5b;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * CSC Measurement (Characteristics UUID: 0x2A5B)
 */
public class CSCMeasurement implements ByteArrayInterface {

    /**
     * @see #FLAGS_WHEEL_REVOLUTION_DATA_PRESENT_FALSE
     * @see #FLAGS_WHEEL_REVOLUTION_DATA_PRESENT_TRUE
     */
    public static final int FLAGS_WHEEL_REVOLUTION_DATA_PRESENT_MASK = 0b00000001;

    /**
     * 0: Wheel Revolution Data Present False
     */
    public static final int FLAGS_WHEEL_REVOLUTION_DATA_PRESENT_FALSE = 0b00000000;

    /**
     * 1: Wheel Revolution Data Present True
     */
    public static final int FLAGS_WHEEL_REVOLUTION_DATA_PRESENT_TRUE = 0b00000001;

    /**
     * @see #FLAGS_CRANK_REVOLUTION_DATA_PRESENT_FALSE
     * @see #FLAGS_CRANK_REVOLUTION_DATA_PRESENT_TRUE
     */
    public static final int FLAGS_CRANK_REVOLUTION_DATA_PRESENT_MASK = 0b00000010;

    /**
     * 0: Crank Revolution Data Present False
     */
    public static final int FLAGS_CRANK_REVOLUTION_DATA_PRESENT_FALSE = 0b00000000;

    /**
     * 1: Crank Revolution Data Present True
     */
    public static final int FLAGS_CRANK_REVOLUTION_DATA_PRESENT_TRUE = 0b00000010;

    /**
     * Last Wheel Event Time Unit 1/1024s
     */
    public static final double LAST_WHEEL_EVENT_TIME_RESOLUTION = 1 / 1024d;

    /**
     * Last Crank Event Time Unit 1/1024s
     */
    public static final double LAST_CRANK_EVENT_TIME_RESOLUTION = 1 / 1024d;

    /**
     * Flags
     */
    private final int mFlags;

    /**
     * Cumulative Wheel Revolutions
     */
    private final long mCumulativeWheelRevolutions;

    /**
     * Last Wheel Event Time
     */
    private final int mLastWheelEventTime;

    /**
     * Cumulative Crank Revolutions
     */
    private final int mCumulativeCrankRevolutions;

    /**
     * Last Crank Event Time
     */
    private final int mLastCrankEventTime;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A5B
     */
    public CSCMeasurement(@NonNull byte[] values) {
        int index = 0;
        mFlags = values[index++];
        if (isFlagsWheelRevolutionDataPresent()) {
            mCumulativeWheelRevolutions = BLEUtils.createUInt32(values, index);
            index += 4;
            mLastWheelEventTime = BLEUtils.createUInt16(values, index);
            index += 2;
        } else {
            mCumulativeWheelRevolutions = 0;
            mLastWheelEventTime = 0;
        }
        if (isFlagsCrankRevolutionDataPresent()) {
            mCumulativeCrankRevolutions = BLEUtils.createUInt16(values, index);
            index += 2;
            mLastCrankEventTime = BLEUtils.createUInt16(values, index);
        } else {
            mCumulativeCrankRevolutions = 0;
            mLastCrankEventTime = 0;
        }
    }

    /**
     * Constructor from parameters
     * 
     * @param flags                      Flags
     * @param cumulativeWheelRevolutions Cumulative Wheel Revolutions
     * @param lastWheelEventTime         Last Wheel Event Time
     * @param cumulativeCrankRevolutions Cumulative Crank Revolutions
     * @param lastCrankEventTime         Last Crank Event Time
     */
    public CSCMeasurement(int flags, long cumulativeWheelRevolutions, int lastWheelEventTime, int cumulativeCrankRevolutions, int lastCrankEventTime) {
        mFlags = flags;
        mCumulativeWheelRevolutions = cumulativeWheelRevolutions;
        mLastWheelEventTime = lastWheelEventTime;
        mCumulativeCrankRevolutions = cumulativeCrankRevolutions;
        mLastCrankEventTime = lastCrankEventTime;
    }

    /**
     * @return Flags
     */
    public int getFlags() {
        return mFlags;
    }

    /**
     * @return {@code true}:Wheel Revolution Data not Present, {@code false}:Wheel Revolution Data Present
     */
    public boolean isFlagsWheelRevolutionDataNotPresent() {
        return isFlagsMatched(FLAGS_WHEEL_REVOLUTION_DATA_PRESENT_MASK, FLAGS_WHEEL_REVOLUTION_DATA_PRESENT_FALSE);
    }

    /**
     * @return {@code true}:Wheel Revolution Data Present, {@code false}:Wheel Revolution Data not Present
     */
    public boolean isFlagsWheelRevolutionDataPresent() {
        return isFlagsMatched(FLAGS_WHEEL_REVOLUTION_DATA_PRESENT_MASK, FLAGS_WHEEL_REVOLUTION_DATA_PRESENT_TRUE);
    }

    /**
     * @return {@code true}:Crank Revolution Data not Present, {@code false}:Crank Revolution Data Present
     */
    public boolean isFlagsCrankRevolutionDataNotPresent() {
        return isFlagsMatched(FLAGS_CRANK_REVOLUTION_DATA_PRESENT_MASK, FLAGS_CRANK_REVOLUTION_DATA_PRESENT_FALSE);
    }

    /**
     * @return {@code true}:Crank Revolution Data Present, {@code false}:Crank Revolution Data not Present
     */
    public boolean isFlagsCrankRevolutionDataPresent() {
        return isFlagsMatched(FLAGS_CRANK_REVOLUTION_DATA_PRESENT_MASK, FLAGS_CRANK_REVOLUTION_DATA_PRESENT_TRUE);
    }

    /**
     * @return Cumulative Wheel Revolutions
     */
    public long getCumulativeWheelRevolutions() {
        return mCumulativeWheelRevolutions;
    }

    /**
     * @return Last Wheel Event Time
     */
    public int getLastWheelEventTime() {
        return mLastWheelEventTime;
    }

    /**
     * @return Last Wheel Event Time(second)
     */
    public double getLastWheelEventTimeSecond() {
        return LAST_WHEEL_EVENT_TIME_RESOLUTION * mLastWheelEventTime;
    }

    /**
     * @return Cumulative Crank Revolutions
     */
    public int getCumulativeCrankRevolutions() {
        return mCumulativeCrankRevolutions;
    }

    /**
     * @return Last Crank Event Time
     */
    public int getLastCrankEventTime() {
        return mLastCrankEventTime;
    }

    /**
     * @return Last Crank Event Time(second)
     */
    public double getLastCrankEventTimeSecond() {
        return LAST_CRANK_EVENT_TIME_RESOLUTION * mLastCrankEventTime;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        int length = 1;
        byte[] data = new byte[11];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mFlags);
        if (isFlagsWheelRevolutionDataPresent()) {
            byteBuffer.putInt((int) mCumulativeWheelRevolutions);
            byteBuffer.putShort((short) mLastWheelEventTime);
            length += 6;
        }
        if (isFlagsCrankRevolutionDataPresent()) {
            byteBuffer.putShort((short) mCumulativeCrankRevolutions);
            byteBuffer.putShort((short) mLastCrankEventTime);
            length += 4;
        }
        return Arrays.copyOfRange(data, 0, length);
    }

    /**
     * check Flags
     *
     * @param mask   bitmask for expect
     * @param expect one of {@link #FLAGS_WHEEL_REVOLUTION_DATA_PRESENT_FALSE} , {@link #FLAGS_WHEEL_REVOLUTION_DATA_PRESENT_TRUE} , {@link #FLAGS_CRANK_REVOLUTION_DATA_PRESENT_FALSE} , {@link #FLAGS_CRANK_REVOLUTION_DATA_PRESENT_TRUE}
     * @return {@code true}:same as expect, {@code false}:not match
     */
    private boolean isFlagsMatched(int mask, int expect) {
        return (mask & mFlags) == expect;
    }

}
