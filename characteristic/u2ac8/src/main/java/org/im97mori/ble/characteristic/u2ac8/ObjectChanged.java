package org.im97mori.ble.characteristic.u2ac8;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * object changed (Characteristics UUID: 0x2AC8)
 */
// TODO
public class ObjectChanged implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2AC8
     */
    public ObjectChanged(@NonNull byte[] values) {
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
