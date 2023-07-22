package org.im97mori.ble.characteristic.u2b51;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * TMAP Role (Characteristics UUID: 0x2B51)
 */
// TODO
public class TmapRole implements ByteArrayInterface {

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public TmapRole(@NonNull byte[] values) {
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
