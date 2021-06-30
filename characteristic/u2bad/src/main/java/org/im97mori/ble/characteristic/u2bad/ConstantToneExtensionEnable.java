package org.im97mori.ble.characteristic.u2bad;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Constant Tone Extension Enable (Characteristics UUID: 0x2BAD)
 */
// TODO
public class ConstantToneExtensionEnable implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2BAD
     */
    public ConstantToneExtensionEnable(@NonNull byte[] values) {
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
