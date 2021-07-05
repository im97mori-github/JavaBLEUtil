package org.im97mori.ble.characteristic.u2a42;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Alert Category ID Bit Mask (Characteristics UUID: 0x2A42)
 */
public class AlertCategoryIdBitMask implements ByteArrayInterface {

    /**
     * Category ID Bit Mask
     */
    private final byte[] mCategoryIdBitMask;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A42
     */
    public AlertCategoryIdBitMask(@NonNull byte[] values) {
        if (values.length == 1) {
            mCategoryIdBitMask = Arrays.copyOfRange(values, 0, 1);
        } else {
            mCategoryIdBitMask = Arrays.copyOfRange(values, 0, 2);
        }
    }

    /**
     * @return Category ID Bit Mask
     */
    @NonNull
    public byte[] getCategoryIdBitMask() {
        return mCategoryIdBitMask;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[mCategoryIdBitMask.length];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put(mCategoryIdBitMask);
        return data;
    }

}
