package org.im97mori.ble.characteristic.u2ac4;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * object properties (Characteristics UUID: 0x2AC4)
 */
// TODO
public class ObjectProperties implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2AC4
     */
    public ObjectProperties(@NonNull byte[] values) {
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
