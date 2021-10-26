package org.im97mori.ble.characteristic.u2b07;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Relative Runtime In A Current Range (Characteristics UUID: 0x2B07)
 */
public class RelativeRuntimeInACurrentRange implements ByteArrayInterface {

    /**
     * Relative Runtime Value
     */
    private final int mRelativeRuntimeValue;

    /**
     * Minimum Current
     */
    private final int mMinimumCurrent;

    /**
     * Maximum Current
     */
    private final int mMaximumCurrent;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public RelativeRuntimeInACurrentRange(@NonNull byte[] values) {
        mRelativeRuntimeValue = BLEUtils.createUInt8(values, 0);
        mMinimumCurrent = BLEUtils.createUInt16(values, 1);
        mMaximumCurrent = BLEUtils.createUInt16(values, 3);
    }

    /**
     * Constructor from parameters
     * 
     * @param relativeRuntimeValue Relative Runtime Value
     * @param minimumCurrent Minimum Current
     * @param maximumCurrent Maximum Current
     */
    public RelativeRuntimeInACurrentRange(int relativeRuntimeValue, int minimumCurrent, int maximumCurrent) {
        mRelativeRuntimeValue = relativeRuntimeValue;
        mMinimumCurrent = minimumCurrent;
        mMaximumCurrent = maximumCurrent;
    }

    /**
     * @return Relative Runtime Value
     */
    public int getRelativeRuntimeValue() {
        return mRelativeRuntimeValue;
    }

    /**
     * @return Minimum Current
     */
    public int getMinimumCurrent() {
        return mMinimumCurrent;
    }

    /**
     * @return Maximum Current
     */
    public int getMaximumCurrent() {
        return mMaximumCurrent;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[5];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mRelativeRuntimeValue);
        byteBuffer.put((byte) mMinimumCurrent);
        byteBuffer.put((byte) (mMinimumCurrent >> 8));
        byteBuffer.put((byte) mMaximumCurrent);
        byteBuffer.put((byte) (mMaximumCurrent >> 8));
        return data;
    }

}
