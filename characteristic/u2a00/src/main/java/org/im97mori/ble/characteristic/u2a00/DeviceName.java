package org.im97mori.ble.characteristic.u2a00;


import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Device Name (Characteristics UUID: 0x2A00)
 */
public class DeviceName implements ByteArrayInterface {

    /**
     * Name
     */
    private final String mName;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public DeviceName(@NonNull byte[] values) {
        mName = new String(values);
    }

    /**
     * Constructor from parameters
     * 
     * @param name Name
     */
    public DeviceName(@NonNull String name) {
        mName = name;
    }

    /**
     * @return Name
     */
    public String getName() {
        return mName;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        return mName.getBytes();
    }

}
