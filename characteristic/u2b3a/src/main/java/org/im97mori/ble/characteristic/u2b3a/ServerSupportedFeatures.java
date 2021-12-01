package org.im97mori.ble.characteristic.u2b3a;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Server Supported Features (Characteristics UUID: 0x2B3A)
 */
// TODO BLUETOOTH CORE SPECIFICATION Version 5.3 | Vol 3, Part G 7.4
public class ServerSupportedFeatures implements ByteArrayInterface {

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public ServerSupportedFeatures(@NonNull byte[] values) {
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
