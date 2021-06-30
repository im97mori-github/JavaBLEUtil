package org.im97mori.ble.characteristic.u2baf;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Advertising Constant Tone Extension Minimum Transmit Count (Characteristics UUID: 0x2BAF)
 */
// TODO
public class AdvertisingConstantToneExtensionMinimumTransmitCount implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2BAF
     */
    public AdvertisingConstantToneExtensionMinimumTransmitCount(@NonNull byte[] values) {
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
