package org.im97mori.ble.characteristic.u2abf;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Object Type (Characteristics UUID: 0x2ABF)
 */
public class ObjectType implements ByteArrayInterface {

    /**
     * Object Type
     */
    private final byte[] mObjectType;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2ABF
     */
    public ObjectType(@NonNull byte[] values) {
        mObjectType = values;
    }

    /**
     * Constructor from parameters
     * 
     * @param uuid      16bit uuid
     */
    public ObjectType(int uuid) {
        mObjectType = new byte[2];
        mObjectType[0] = (byte) uuid;
        mObjectType[1] = (byte) (uuid >> 8);
    }

    /**
     * Constructor from parameters
     * 
     * @param uuid      16bit uuid
     */
    public ObjectType(@NonNull UUID uuid) {
        mObjectType = new byte[16];
        long lsb = uuid.getLeastSignificantBits();
        long msb = uuid.getMostSignificantBits();
        mObjectType[0] = (byte) lsb;
        mObjectType[1] = (byte) (lsb >> 8);
        mObjectType[2] = (byte) (lsb >> 16);
        mObjectType[3] = (byte) (lsb >> 24);
        mObjectType[4] = (byte) (lsb >> 32);
        mObjectType[5] = (byte) (lsb >> 40);
        mObjectType[6] = (byte) (lsb >> 48);
        mObjectType[7] = (byte) (lsb >> 56);
        mObjectType[8] = (byte) msb;
        mObjectType[9] = (byte) (msb >> 8);
        mObjectType[10] = (byte) (msb >> 16);
        mObjectType[11] = (byte) (msb >> 24);
        mObjectType[12] = (byte) (msb >> 32);
        mObjectType[13] = (byte) (msb >> 40);
        mObjectType[14] = (byte) (msb >> 48);
        mObjectType[15] = (byte) (msb >> 56);
    }

    /**
     * @return Object Type
     */
    public byte[] getObjectType() {
        return mObjectType;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[mObjectType.length];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put(mObjectType);
        return data;
    }

}
