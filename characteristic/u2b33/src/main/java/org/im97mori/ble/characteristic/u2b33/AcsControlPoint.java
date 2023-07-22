package org.im97mori.ble.characteristic.u2b33;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * ACS Control Point (Characteristics UUID: 0x2B33)
 */
// TODO
public class AcsControlPoint implements ByteArrayInterface {

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public AcsControlPoint(@NonNull byte[] values) {
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
