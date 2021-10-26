package org.im97mori.ble.characteristic.u2a29;


import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Manufacturer Name String (Characteristics UUID: 0x2A29)
 */
public class ManufacturerNameString implements ByteArrayInterface {

    /**
     * Manufacturer Name
     */
    private final String mManufacturerName;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public ManufacturerNameString(@NonNull byte[] values) {
        mManufacturerName = new String(values);
    }

    /**
     * Constructor from parameters
     * 
     * @param manufacturerName Manufacturer Name
     */
    public ManufacturerNameString(@NonNull String manufacturerName) {
        mManufacturerName = manufacturerName;
    }

    /**
     * @return Manufacturer Name
     */
    public String getManufacturerName() {
        return mManufacturerName;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        return mManufacturerName.getBytes();
    }

}
