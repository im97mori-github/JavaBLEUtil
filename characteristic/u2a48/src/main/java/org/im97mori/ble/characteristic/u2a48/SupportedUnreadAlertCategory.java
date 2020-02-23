package org.im97mori.ble.characteristic.u2a48;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Supported Unread Alert Category (Characteristics UUID: 0x2A48)
 */
public class SupportedUnreadAlertCategory implements ByteArrayInterface {
    /**
     * Category ID Bit Mask 0
     */
    private final int mCategoryIdBitMask0;

    /**
     * 0: no Category ID Bit Mask 1, 1: has Category ID Bit Mask 1
     */
    private final int mHasCategoryIdBitMask1;

    /**
     * Category ID Bit Mask 1
     */
    private final int mCategoryIdBitMask1;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A48
     */
    public SupportedUnreadAlertCategory(@NonNull byte[] values) {
        mCategoryIdBitMask0 = (values[0] & 0xff);
        if (values.length > 1) {
            mHasCategoryIdBitMask1 = 1;
            mCategoryIdBitMask1 = (values[1] & 0xff);
        } else {
            mHasCategoryIdBitMask1 = 0;
            mCategoryIdBitMask1 = 0;
        }
    }

    /**
     * @return Category ID Bit Mask 0
     */
    public int getCategoryIdBitMask0() {
        return mCategoryIdBitMask0;
    }

    /**
     * @return Category ID Bit Mask 1
     */
    public int getCategoryIdBitMask1() {
        return mCategoryIdBitMask1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1 + mHasCategoryIdBitMask1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mCategoryIdBitMask0);
        if (mHasCategoryIdBitMask1 == 1) {
            byteBuffer.put((byte) mCategoryIdBitMask1);
        }
        return data;
    }

}
