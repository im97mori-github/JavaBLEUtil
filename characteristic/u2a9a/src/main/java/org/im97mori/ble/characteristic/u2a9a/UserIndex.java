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
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A9A
     */
    public UserIndex(@NonNull byte[] values) {
        mUserIndex = (values[0] & 0xff);
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
