package org.im97mori.ble.characteristic.u2a0d;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * DST Offset (Characteristics UUID: 0x2A0D)
 */
public class DstOffset implements ByteArrayInterface {

    /**
     * DST Offset
     */
    private final int mDstOffset;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A0D
     */
    public DstOffset(@NonNull byte[] values) {
        mDstOffset = BLEUtils.createUInt8(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param dstOffset DST Offset
     */
    public DstOffset(int dstOffset) {
        mDstOffset = dstOffset;
    }

    /**
     * @return DST Offset
     */
    public int getDstOffset() {
        return mDstOffset;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mDstOffset);
        return data;
    }

}
