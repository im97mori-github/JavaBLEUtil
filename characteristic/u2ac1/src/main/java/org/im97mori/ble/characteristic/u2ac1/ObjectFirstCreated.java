package org.im97mori.ble.characteristic.u2ac1;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * object first created (Characteristics UUID: 0x2AC1)
 */
// TODO
public class ObjectFirstCreated implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2AC1
     */
    public ObjectFirstCreated(@NonNull byte[] values) {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[0];
        return data;
    }

}
