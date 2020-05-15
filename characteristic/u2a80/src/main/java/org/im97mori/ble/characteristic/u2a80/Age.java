package org.im97mori.ble.characteristic.u2a80;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Age (Characteristics UUID: 0x2A80)
 */
public class Age implements ByteArrayInterface {

    /**
     * Age
     */
    private final int mAge;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A80
     */
    public Age(@NonNull byte[] values) {
        mAge = (values[0] & 0xff);
    }

    /**
     * Constructor from parameters
     * 
     * @param age Age
     */
    public Age(int age) {
        mAge = age;
    }

    /**
     * @return Age
     */
    public int getAge() {
        return mAge;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mAge);
        return data;
    }

}
