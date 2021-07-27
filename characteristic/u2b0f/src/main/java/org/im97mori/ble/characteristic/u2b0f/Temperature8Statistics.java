package org.im97mori.ble.characteristic.u2b0f;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Temperature 8 Statistics (Characteristics UUID: 0x2B0F)
 */
public class Temperature8Statistics implements ByteArrayInterface {

    /**
     * Average
     */
    private final int mAverage;

    /**
     * Standard Deviation Value
     */
    private final int mStandardDeviationValue;

    /**
     * Minimum Value
     */
    private final int mMinimumValue;

    /**
     * Maximum Value
     */
    private final int mMaximumValue;

    /**
     * Sensing Duration
     */
    private final int mSensingDuration;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2B0F
     */
    public Temperature8Statistics(@NonNull byte[] values) {
        mAverage = BLEUtils.createSInt8(values, 0);
        mStandardDeviationValue = BLEUtils.createSInt8(values, 1);
        mMinimumValue = BLEUtils.createSInt8(values, 2);
        mMaximumValue = BLEUtils.createSInt8(values, 3);
        mSensingDuration = BLEUtils.createUInt8(values, 4);
    }

    /**
     * Constructor from parameters
     * 
     * @param average Average
     * @param standardDeviationValue Standard Deviation Value
     * @param minimumValue Minimum Value
     * @param maximumValue Maximum Value
     * @param sensingDuration Sensing Duration
     */
    public Temperature8Statistics(int average, int standardDeviationValue, int minimumValue, int maximumValue, int sensingDuration) {
        mAverage = average;
        mStandardDeviationValue = standardDeviationValue;
        mMinimumValue = minimumValue;
        mMaximumValue = maximumValue;
        mSensingDuration = sensingDuration;
    }

    /**
     * @return Average
     */
    public int getAverage() {
        return mAverage;
    }

    /**
     * @return Standard Deviation Value
     */
    public int getStandardDeviationValue() {
        return mStandardDeviationValue;
    }

    /**
     * @return Minimum Value
     */
    public int getMinimumValue() {
        return mMinimumValue;
    }

    /**
     * @return Maximum Value
     */
    public int getMaximumValue() {
        return mMaximumValue;
    }

    /**
     * @return Sensing Duration
     */
    public int getSensingDuration() {
        return mSensingDuration;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[5];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mAverage);
        byteBuffer.put((byte) mStandardDeviationValue);
        byteBuffer.put((byte) mMinimumValue);
        byteBuffer.put((byte) mMaximumValue);
        byteBuffer.put((byte) mSensingDuration);
        return data;
    }

}
