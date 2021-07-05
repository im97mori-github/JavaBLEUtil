package org.im97mori.ble.characteristic.u2a43;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Alert Category ID (Characteristics UUID: 0x2A43)
 */
public class AlertCategoryId implements ByteArrayInterface {

    /**
     * Category ID
     */
    private final int mCategoryId;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A43
     */
    public AlertCategoryId(@NonNull byte[] values) {
        mCategoryId = BLEUtils.createUInt8(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param categoryId Category ID
     */
    public AlertCategoryId(int categoryId) {
        mCategoryId = categoryId;
    }

    /**
     * @return Category ID
     */
    public int getCategoryId() {
        return mCategoryId;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mCategoryId);
        return data;
    }

}
