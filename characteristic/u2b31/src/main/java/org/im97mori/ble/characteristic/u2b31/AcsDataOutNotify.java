package org.im97mori.ble.characteristic.u2b31;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * ACS Data Out Notify (Characteristics UUID: 0x2B31)
 */
// TODO
public class AcsDataOutNotify implements ByteArrayInterface {

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public AcsDataOutNotify(@NonNull byte[] values) {
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
