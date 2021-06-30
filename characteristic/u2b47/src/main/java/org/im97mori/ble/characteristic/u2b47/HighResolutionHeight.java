package org.im97mori.ble.characteristic.u2b47;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * High Resolution Height (Characteristics UUID: 0x2B47)
 */
// TODO
public class HighResolutionHeight implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2B47
     */
    public HighResolutionHeight(@NonNull byte[] values) {
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