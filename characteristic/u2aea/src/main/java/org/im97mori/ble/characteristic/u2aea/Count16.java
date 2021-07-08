package org.im97mori.ble.characteristic.u2aea;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Count 16 (Characteristics UUID: 0x2AEA)
 */
public class Count16 implements ByteArrayInterface {

    /**
     * 0xFFFF : A raw value of 0xFF represents ‘value is not known’
     */
    public static final int COUNT_IS_NOT_KNOWN = 0xFFFF;

    /**
     * Count Minimum value
     */
    public static final int COUNT_VALUE_MINIMUM = 0;

    /**
     * Count Maximum value
     */
    public static final int COUNT_VALUE_MAXIMUM = 65534;

    /**
     * Count
     */
    private final int mCount;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2AEA
     */
    public Count16(@NonNull byte[] values) {
        mCount = BLEUtils.createUInt16(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param count Count
     */
    public Count16(int count) {
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
        byte[] data = new byte[2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mCount);
        return data;
    }

}
