package org.im97mori.ble.characteristic.u2ad7;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Supported Heart Rate Range (Characteristics UUID: 0x2AD7)
 */
public class SupportedHeartRateRange implements ByteArrayInterface {

    /**
     * Minimum Heart Rate
     */
    private final int mMinimumHeartRate;

    /**
     * Maximum Heart Rate
     */
    private final int mMaximumHeartRate;

    /**
     * Minimum Increment
     */
    private final int mMinimumIncrement;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2AD7
     */
    public SupportedHeartRateRange(@NonNull byte[] values) {
        mMinimumHeartRate = (values[0] & 0xff);
        mMaximumHeartRate = (values[1] & 0xff);
        mMinimumIncrement = (values[2] & 0xff);
    }

    /**
     * Constructor from parameters
     * 
     * @param minimumHeartRate Minimum Heart Rate
     * @param maximumHeartRate Maximum Heart Rate
     * @param minimumIncrement Minimum Increment
     */
    public SupportedHeartRateRange(int minimumHeartRate, int maximumHeartRate, int minimumIncrement) {
        mMinimumHeartRate = minimumHeartRate;
        mMaximumHeartRate = maximumHeartRate;
        mMinimumIncrement = minimumIncrement;
    }

    /**
     * @return Minimum Heart Rate
     */
    public int getMinimumHeartRate() {
        return mMinimumHeartRate;
    }

    /**
     * @return Maximum Heart Rate
     */
    public int getMaximumHeartRate() {
        return mMaximumHeartRate;
    }

    /**
     * @return Minimum Increment
     */
    public int getMinimumIncrement() {
        return mMinimumIncrement;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[3];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mMinimumHeartRate);
        byteBuffer.put((byte) mMaximumHeartRate);
        byteBuffer.put((byte) mMinimumIncrement);
        return data;
    }

}
