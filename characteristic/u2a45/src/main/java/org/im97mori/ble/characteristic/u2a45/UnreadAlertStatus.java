package org.im97mori.ble.characteristic.u2a45;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Unread Alert Status (Characteristics UUID: 0x2A45)
 */
public class UnreadAlertStatus implements ByteArrayInterface {

    /**
     * Category ID
     */
    private final int mCategoryId;

    /**
     * Unread count
     */
    private final int mUnreadCount;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A45
     */
    public UnreadAlertStatus(@NonNull byte[] values) {
        mCategoryId = (values[0] & 0xff);
        mUnreadCount = (values[1] & 0xff);
    }

    /**
     * Constructor from parameters
     * 
     * @param categoryId  Category ID
     * @param unreadCount Unread count
     */
    public UnreadAlertStatus(int categoryId, int unreadCount) {
        mCategoryId = categoryId;
        mUnreadCount = unreadCount;
    }

    /**
     * @return Category ID
     */
    public int getCategoryId() {
        return mCategoryId;
    }

    /**
     * @return Unread count
     */
    public int getUnreadCount() {
        return mUnreadCount;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mCategoryId);
        byteBuffer.put((byte) mUnreadCount);
        return data;
    }

}
