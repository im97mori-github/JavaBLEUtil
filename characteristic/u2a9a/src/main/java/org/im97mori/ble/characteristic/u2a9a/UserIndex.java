package org.im97mori.ble.characteristic.u2a9a;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * User Index (Characteristics UUID: 0x2A9A)
 */
public class UserIndex implements ByteArrayInterface {

    /**
     * User Index
     */
    private final int mUserIndex;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public UserIndex(@NonNull byte[] values) {
        mUserIndex = (values[0] & 0xff);
    }

    /**
     * Constructor from parameters
     * 
     * @param userIndex User Index
     */
    public UserIndex(int userIndex) {
        mUserIndex = userIndex;
    }

    /**
     * @return User Index
     */
    public int getUserIndex() {
        return mUserIndex;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mUserIndex);
        return data;
    }

}
