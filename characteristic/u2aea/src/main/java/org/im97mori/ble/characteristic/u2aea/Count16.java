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
