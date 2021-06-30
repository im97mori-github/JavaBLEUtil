package org.im97mori.ble.characteristic.u2a60;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * PLX Features (Characteristics UUID: 0x2A60)
 */
// TODO
public class PlxFeatures implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A60
     */
    public PlxFeatures(@NonNull byte[] values) {
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
