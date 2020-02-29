package org.im97mori.ble.characteristic.u2ad6;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Supported Resistance Level Range (Characteristics UUID: 0x2AD6)
 */
public class SupportedResistanceLevelRange implements ByteArrayInterface {

    /**
     * Minimum Resistance Level Unit 0.1
     */
    public static final double MINIMUM_RESISTANCE_LEVEL_RESOLUTION = 0.1d;

    /**
     * Maximum Resistance Level Unit 0.1
     */
    public static final double MAXIMUM_RESISTANCE_LEVEL_RESOLUTION = 0.1d;

    /**
     * Minimum Increment Unit 0.1
     */
    public static final double MINIMUM_INCREMENT_RESOLUTION = 0.1d;

    /**
     * Minimum Resistance Level
     */
    private final int mMinimumResistanceLevel;

    /**
     * Maximum Resistance Level
     */
    private final int mMaximumResistanceLevel;

    /**
     * Minimum Increment
     */
    private final int mMinimumIncrement;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2AD6
     */
    public SupportedResistanceLevelRange(@NonNull byte[] values) {
        mMinimumResistanceLevel = BLEUtils.createSInt16(values, 0);
        mMaximumResistanceLevel = BLEUtils.createSInt16(values, 2);
        mMinimumIncrement = BLEUtils.createUInt16(values, 4);
    }

    /**
     * @return Minimum Resistance Level
     */
    public int getMinimumResistanceLevel() {
        return mMinimumResistanceLevel;
    }

    /**
     * @return Minimum Resistance Level with Unit
     */
    public double getMinimumResistanceLevelWithUnit() {
        return MINIMUM_RESISTANCE_LEVEL_RESOLUTION * mMinimumResistanceLevel;
    }

    /**
     * @return Maximum Resistance Level
     */
    public int getMaximumResistanceLevel() {
        return mMaximumResistanceLevel;
    }

    /**
     * @return Maximum Resistance Level with Unit
     */
    public double getMaximumResistanceLevelWithUnit() {
        return MAXIMUM_RESISTANCE_LEVEL_RESOLUTION * mMaximumResistanceLevel;
    }

    /**
     * @return Minimum Increment
     */
    public int getMinimumIncrement() {
        return mMinimumIncrement;
    }

    /**
     * @return Minimum Increment with Unit
     */
    public double getMinimumIncrementWithUnit() {
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
        byteBuffer.putShort((short) mMinimumResistanceLevel);
        byteBuffer.putShort((short) mMaximumResistanceLevel);
        byteBuffer.putShort((short) mMinimumIncrement);
        return data;
    }

}
