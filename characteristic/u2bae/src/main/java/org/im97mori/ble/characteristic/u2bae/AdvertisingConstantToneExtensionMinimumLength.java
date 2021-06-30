package org.im97mori.ble.characteristic.u2bae;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Advertising Constant Tone Extension Minimum Length (Characteristics UUID: 0x2BAE)
 */
// TODO
public class AdvertisingConstantToneExtensionMinimumLength implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2BAE
     */
    public AdvertisingConstantToneExtensionMinimumLength(@NonNull byte[] values) {
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
