package org.im97mori.ble.characteristic.u2baf;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Advertising Constant Tone Extension Minimum Transmit Count (Characteristics UUID: 0x2BAF)
 */
// TODO Constant Tone Extension Service
public class AdvertisingConstantToneExtensionMinimumTransmitCount implements ByteArrayInterface {

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
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
