package org.im97mori.ble.characteristic.u2a24;


import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Model Number String (Characteristics UUID: 0x2A24)
 */
public class ModelNumberString implements ByteArrayInterface {

    /**
     * Model Number
     */
    private final String mModelNumber;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public ModelNumberString(@NonNull byte[] values) {
        mModelNumber = new String(values);
    }

    /**
     * Constructor from parameters
     * 
     * @param modelNumber Model Number
     */
    public ModelNumberString(@NonNull String modelNumber) {
        mModelNumber = modelNumber;
    }

    /**
     * @return Model Number
     */
    public String getModelNumber() {
        return mModelNumber;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        return mModelNumber.getBytes();
    }

}
