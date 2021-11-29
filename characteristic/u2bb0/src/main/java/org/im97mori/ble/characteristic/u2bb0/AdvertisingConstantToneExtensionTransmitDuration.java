package org.im97mori.ble.characteristic.u2bb0;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Advertising Constant Tone Extension Transmit Duration (Characteristics UUID: 0x2BB0)
 */
// TODO Constant Tone Extension Service
public class AdvertisingConstantToneExtensionTransmitDuration implements ByteArrayInterface {

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public AdvertisingConstantToneExtensionTransmitDuration(@NonNull byte[] values) {
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
