package org.im97mori.ble.characteristic.u2a60;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * PLX Features (Characteristics UUID: 0x2A60)
 */
// TODO Pulse Oximeter Service
public class PlxFeatures implements ByteArrayInterface {

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
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
