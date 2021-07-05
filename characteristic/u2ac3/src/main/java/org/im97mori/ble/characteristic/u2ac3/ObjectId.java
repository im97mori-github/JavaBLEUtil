package org.im97mori.ble.characteristic.u2ac3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Object ID (Characteristics UUID: 0x2AC3)
 */
public class ObjectId implements ByteArrayInterface {

    /**
     * Object ID:Directory Listing Object
     */
    public static final long OBJECT_ID_DIRECTORY_LISTING_OBJECT = 0x000000000000L;

    /**
     * Object ID
     */
    private final long mObjectId;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2AC3
     */
    public ObjectId(@NonNull byte[] values) {
        mObjectId = BLEUtils.createUInt48(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param objectId Object ID
     */
    public ObjectId(long objectId) {
        mObjectId = objectId;
    }

    /**
     * @return Object ID
     */
    public long getObjectId() {
        return mObjectId;
    }

    /**
     * @return {@code true}:Directory Listing Object, {@code false}:not Directory Listing Object
     */
    public boolean isObjectIdDirectoryListingObject() {
        return OBJECT_ID_DIRECTORY_LISTING_OBJECT == mObjectId;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[6];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mObjectId);
        byteBuffer.put((byte) (mObjectId >> 8));
        byteBuffer.put((byte) (mObjectId >> 16));
        byteBuffer.put((byte) (mObjectId >> 24));
        byteBuffer.put((byte) (mObjectId >> 32));
        byteBuffer.put((byte) (mObjectId >> 40));
        return data;
    }

}
