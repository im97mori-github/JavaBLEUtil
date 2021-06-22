package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.DATA_TYPE_SLAVE_CONNECTION_INTERVAL_RANGE;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import androidx.annotation.NonNull;

/**
 * <p>
 * Slave Connection Interval Range
 * <p>
 * https://www.bluetooth.com/specifications/assigned-numbers/generic-access-profile/
 * </p>
 */
public class SlaveConnectionIntervalRange extends AbstractAdvertisingData {

    /**
     * Core Specification Supplement v9 Part A 1.9.2 Unit of Connection Interval Range(millis)
     */
    public static final double SLAVE_CONNECTION_INTERVAL_RANGE_UNIT_MILLIS = 1.25d;

    /**
     * Core Specification Supplement v9 Part A 1.9.2 no specific minimum / maximum values
     */
    public static final int SLAVE_CONNECTION_INTERVAL_NO_SPECIFIC_VALUE = 0xffff;

    /**
     * <p>
     * Minimum connection interval
     * <p>
     * Core Specification v5.2 Vol 3 Part C 12.3
     * </p>
     */
    private final int mMinimumValue;

    /**
     * <p>
     * Maximum connection interval
     * <p>
     * Core Specification v5.2 Vol 3 Part C 12.3
     * </p>
     */
    private final int mMaximumValue;

    /**
     * Constructor for Slave Connection Interval Range
     *
     * @param data   byte array from {@link ScanRecord#getBytes()}
     * @param offset data offset
     * @param length 1st octed of Advertising Data
     */
    public SlaveConnectionIntervalRange(@NonNull byte[] data, int offset, int length) {
        super(length);

        ByteBuffer bb = ByteBuffer.wrap(data, offset + 2, length - 1).order(ByteOrder.LITTLE_ENDIAN);
        mMinimumValue = bb.getShort() & 0xffff;
        mMaximumValue = bb.getShort() & 0xffff;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getDataType() {
        return DATA_TYPE_SLAVE_CONNECTION_INTERVAL_RANGE;
    }

    /**
     * check Minimum connection interval is presented
     *
     * @return {@code true}:presented, [@code false}:not presented
     */
    public boolean hasMinimum() {
        return mMinimumValue != SLAVE_CONNECTION_INTERVAL_NO_SPECIFIC_VALUE;
    }

    /**
     * check Maximum connection interval is presented
     *
     * @return {@code true}:presented, [@code false}:not presented
     */
    public boolean hasMaximum() {
        return mMaximumValue != SLAVE_CONNECTION_INTERVAL_NO_SPECIFIC_VALUE;
    }

    /**
     * if {@link #hasMinimum()} return true, return Minimum connection interval
     *
     * @return Minimum connection interval
     */
    public int getMinimumValue() {
        return mMinimumValue;
    }

    /**
     * if {@link #hasMinimum()} return true, return Minimum connection interval
     *
     * @return Minimum connection interval(millis)
     */
    public double getMinimumValueMillis() {
        return mMinimumValue * SLAVE_CONNECTION_INTERVAL_RANGE_UNIT_MILLIS;
    }

    /**
     * if {@link #hasMaximum()} return true, return Maximum connection interval
     *
     * @return Maximum connection interval
     */
    public int getMaximumValue() {
        return mMaximumValue;
    }

    /**
     * if {@link #hasMaximum()} return true, return Maximum connection interval
     *
     * @return Maximum connection interval(millis)
     */
    public double getMaximumValueMillis() {
        return mMaximumValue * SLAVE_CONNECTION_INTERVAL_RANGE_UNIT_MILLIS;
    }

    /**
     * {@inheritDoc}
     */
    @NonNull
    @Override
    public byte[] getBytes() {
        byte[] data = new byte[1 + getLength()];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) getLength());
        byteBuffer.put((byte) getDataType());
        byteBuffer.putShort((short) mMinimumValue);
        byteBuffer.putShort((short) mMaximumValue);
        return data;
    }

}
