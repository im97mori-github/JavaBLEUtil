package org.im97mori.ble.characteristic.u2ad5;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Supported Inclination Range (Characteristics UUID: 0x2AD5)
 */
public class SupportedInclinationRange implements ByteArrayInterface {

    /**
     * Minimum Inclination Unit 0.1 Percent
     */
    public static final double MINIMUM_INCLINATION_RESOLUTION = 0.1d;

    /**
     * Maximum Inclination Unit 0.1 Percent
     */
    public static final double MAXIMUM_INCLINATION_RESOLUTION = 0.1d;

    /**
     * Minimum Increment Unit 0.1 Percent
     */
    public static final double MINIMUM_INCREMENT_RESOLUTION = 0.1d;

    /**
     * Minimum Inclination
     */
    private final int mMinimumInclination;

    /**
     * Maximum Inclination
     */
    private final int mMaximumInclination;

    /**
     * Minimum Increment
     */
    private final int mMinimumIncrement;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2AD5
     */
    public SupportedInclinationRange(@NonNull byte[] values) {
        mMinimumInclination = BLEUtils.createSInt16(values, 0);
        mMaximumInclination = BLEUtils.createSInt16(values, 2);
        mMinimumIncrement = BLEUtils.createUInt16(values, 4);
    }

    /**
     * @return Minimum Inclination
     */
    public int getMinimumInclination() {
        return mMinimumInclination;
    }

    /**
     * @return Minimum Inclination(Percent)
     */
    public double getMinimumInclinationPercent() {
        return MINIMUM_INCLINATION_RESOLUTION * mMinimumInclination;
    }

    /**
     * @return Maximum Inclination
     */
    public int getMaximumInclination() {
        return mMaximumInclination;
    }

    /**
     * @return Maximum Inclination(Percent)
     */
    public double getMaximumInclinationPercent() {
        return MAXIMUM_INCLINATION_RESOLUTION * mMaximumInclination;
    }

    /**
     * @return Minimum Increment
     */
    public int getMinimumIncrement() {
        return mMinimumIncrement;
    }

    /**
     * @return Minimum Increment(Percent)
     */
    public double getMinimumIncrementPercent() {
        return MINIMUM_INCREMENT_RESOLUTION * mMinimumIncrement;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[6];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mMinimumInclination);
        byteBuffer.putShort((short) mMaximumInclination);
        byteBuffer.putShort((short) mMinimumIncrement);
        return data;
    }

}
