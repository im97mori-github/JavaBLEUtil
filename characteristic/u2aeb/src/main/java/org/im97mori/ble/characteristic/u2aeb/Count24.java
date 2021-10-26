package org.im97mori.ble.characteristic.u2aeb;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Count 24 (Characteristics UUID: 0x2AEB)
 */
public class Count24 implements ByteArrayInterface {

    /**
     * 0xFFFFFF  : A raw value of 0xFF represents ‘value is not known’
     */
    public static final int COUNT_IS_NOT_KNOWN = 0xFFFFFF;

    /**
     * Count Minimum value
     */
    public static final int COUNT_VALUE_MINIMUM = 0;

    /**
     * Count Maximum value
     */
    public static final int COUNT_VALUE_MAXIMUM = 16777214;

    /**
     * Count
     */
    private final int mCount;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public Count24(@NonNull byte[] values) {
        mCount = BLEUtils.createUInt24(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param count Count
     */
    public Count24(int count) {
        mCount = count;
    }

    /**
     * @return Count
     */
    public int getCount() {
        return mCount;
    }

    /**
     * @return {@code true}:Count value is not known, {@code false}:has Count value information
     * @see #COUNT_IS_NOT_KNOWN
     */
    public boolean isCountValueIsNotKnown() {
        return COUNT_IS_NOT_KNOWN == mCount;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[3];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mCount);
        byteBuffer.put((byte) (mCount >> 8));
        byteBuffer.put((byte) (mCount >> 16));
        return data;
    }

}
