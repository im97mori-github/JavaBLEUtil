package org.im97mori.ble.characteristic.u2a25;


import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Serial Number String (Characteristics UUID: 0x2A25)
 */
public class SerialNumberString implements ByteArrayInterface {

    /**
     * Serial Number
     */
    private final String mSerialNumber;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public SerialNumberString(@NonNull byte[] values) {
        mSerialNumber = new String(values);
    }

    /**
     * Constructor from parameters
     * 
     * @param serialNumber Serial Number
     */
    public SerialNumberString(@NonNull String serialNumber) {
        mSerialNumber = serialNumber;
    }

    /**
     * @return Serial Number
     */
    public String getSerialNumber() {
        return mSerialNumber;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        return mSerialNumber.getBytes();
    }

}
