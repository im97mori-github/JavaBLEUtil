package org.im97mori.ble.characteristic.u2b20;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * IDD Status Changed (Characteristics UUID: 0x2B20)
 */
// TODO Insulin Delivery
public class IddStatusChanged implements ByteArrayInterface {

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public IddStatusChanged(@NonNull byte[] values) {
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
