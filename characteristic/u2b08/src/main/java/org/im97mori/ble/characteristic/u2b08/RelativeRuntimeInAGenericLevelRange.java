package org.im97mori.ble.characteristic.u2b08;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Relative Runtime In A Generic Level Range (Characteristics UUID: 0x2B08)
 */
public class RelativeRuntimeInAGenericLevelRange implements ByteArrayInterface {

    /**
     * Relative Value
     */
    private final int mRelativeValue;

    /**
     * Minimum Generic Level
     */
    private final int mMinimumGenericLevel;

    /**
     * Maximum Generic Level
     */
    private final int mMaximumGenericLevel;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public RelativeRuntimeInAGenericLevelRange(@NonNull byte[] values) {
        mRelativeValue = BLEUtils.createUInt8(values, 0);
        mMinimumGenericLevel = BLEUtils.createUInt16(values, 1);
        mMaximumGenericLevel = BLEUtils.createUInt16(values, 3);
    }

    /**
     * Constructor from parameters
     * 
     * @param relativeValue Relative Value
     * @param minimumGenericLevel Minimum Generic Level
     * @param maximumGenericLevel Maximum Generic Level
     */
    public RelativeRuntimeInAGenericLevelRange(int relativeValue, int minimumGenericLevel, int maximumGenericLevel) {
        mRelativeValue = relativeValue;
        mMinimumGenericLevel = minimumGenericLevel;
        mMaximumGenericLevel = maximumGenericLevel;
    }

    /**
     * @return Relative Value
     */
    public int getRelativeValue() {
        return mRelativeValue;
    }

    /**
     * @return Minimum Generic Level
     */
    public int getMinimumGenericLevel() {
        return mMinimumGenericLevel;
    }

    /**
     * @return Maximum Generic Level
     */
    public int getMaximumGenericLevel() {
        return mMaximumGenericLevel;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[5];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mRelativeValue);
        byteBuffer.put((byte) mMinimumGenericLevel);
        byteBuffer.put((byte) (mMinimumGenericLevel >> 8));
        byteBuffer.put((byte) mMaximumGenericLevel);
        byteBuffer.put((byte) (mMaximumGenericLevel >> 8));
        return data;
    }

}
