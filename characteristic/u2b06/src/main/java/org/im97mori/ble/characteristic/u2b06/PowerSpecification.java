package org.im97mori.ble.characteristic.u2b06;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Power Specification (Characteristics UUID: 0x2B06)
 */
public class PowerSpecification implements ByteArrayInterface {

    /**
     * Minimum Power Value
     */
    private final int mMinimumPowerValue;

    /**
     * Typical Power Value
     */
    private final int mTypicalPowerValue;

    /**
     * Maximum Power Value
     */
    private final int mMaximumPowerValue;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public PowerSpecification(@NonNull byte[] values) {
        mMinimumPowerValue = BLEUtils.createUInt24(values, 0);
        mTypicalPowerValue = BLEUtils.createUInt24(values, 3);
        mMaximumPowerValue = BLEUtils.createUInt24(values, 6);
    }

    /**
     * Constructor from parameters
     * 
     * @param minimumPowerValue Minimum Power Value
     * @param typicalPowerValue Typical Power Value
     * @param maximumPowerValue Maximum Power Value
     */
    public PowerSpecification(int minimumPowerValue, int typicalPowerValue, int maximumPowerValue) {
        mMinimumPowerValue = minimumPowerValue;
        mTypicalPowerValue = typicalPowerValue;
        mMaximumPowerValue = maximumPowerValue;
    }

    /**
     * @return Minimum Power Value
     */
    public int getMinimumPowerValue() {
        return mMinimumPowerValue;
    }

    /**
     * @return Typical Power Value
     */
    public int getTypicalPowerValue() {
        return mTypicalPowerValue;
    }

    /**
     * @return Maximum Power Value
     */
    public int getMaximumPowerValue() {
        return mMaximumPowerValue;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[9];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mMinimumPowerValue);
        byteBuffer.put((byte) (mMinimumPowerValue >> 8));
        byteBuffer.put((byte) (mMinimumPowerValue >> 16));
        byteBuffer.put((byte) mTypicalPowerValue);
        byteBuffer.put((byte) (mTypicalPowerValue >> 8));
        byteBuffer.put((byte) (mTypicalPowerValue >> 16));
        byteBuffer.put((byte) mMaximumPowerValue);
        byteBuffer.put((byte) (mMaximumPowerValue >> 8));
        byteBuffer.put((byte) (mMaximumPowerValue >> 16));
        return data;
    }

}
