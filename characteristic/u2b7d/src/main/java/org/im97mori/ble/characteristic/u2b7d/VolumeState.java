package org.im97mori.ble.characteristic.u2b7d;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Volume State (Characteristics UUID: 0x2B7D)
 */
// TODO Volume Control Service
public class VolumeState implements ByteArrayInterface {

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public VolumeState(@NonNull byte[] values) {
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
