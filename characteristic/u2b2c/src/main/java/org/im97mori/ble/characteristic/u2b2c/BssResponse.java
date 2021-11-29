package org.im97mori.ble.characteristic.u2b2c;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * BSS Response (Characteristics UUID: 0x2B2C)
 */
// TODO Binary Sensor Service 
public class BssResponse implements ByteArrayInterface {

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public BssResponse(@NonNull byte[] values) {
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
