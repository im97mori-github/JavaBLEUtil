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
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
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
     * @param uuid      128bit uuid
     */
    public ObjectType(@NonNull UUID uuid) {
        mObjectType = new byte[16];

        ByteBuffer byteBuffer = ByteBuffer.wrap(mObjectType, 0, 16).order(ByteOrder.LITTLE_ENDIAN);

        long msb = uuid.getMostSignificantBits();
        byteBuffer.putInt((int) (msb >> 32));
        byteBuffer.putShort((short) (msb >> 16));
        byteBuffer.putShort((short) msb);

        long lsb = uuid.getLeastSignificantBits();
        byteBuffer.put((byte) (lsb >> 56));
        byteBuffer.put((byte) (lsb >> 48));
        byteBuffer.putInt((int) lsb);
        byteBuffer.putShort((short) (lsb >> 32));
    }

    /**
     * @return Object Type
     */
    @NonNull
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
