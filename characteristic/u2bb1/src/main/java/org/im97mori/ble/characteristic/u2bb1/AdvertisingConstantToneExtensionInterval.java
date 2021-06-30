package org.im97mori.ble.characteristic.u2bb1;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Advertising Constant Tone Extension Interval (Characteristics UUID: 0x2BB1)
 */
// TODO
public class AdvertisingConstantToneExtensionInterval implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2BB1
     */
    public AdvertisingConstantToneExtensionInterval(@NonNull byte[] values) {
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
