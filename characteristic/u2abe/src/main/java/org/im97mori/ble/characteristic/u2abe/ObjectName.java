package org.im97mori.ble.characteristic.u2abe;


import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Object Name (Characteristics UUID: 0x2ABE)
 */
public class ObjectName implements ByteArrayInterface {

    /**
     * Object Name
     */
    private final String mObjectName;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public ObjectName(@NonNull byte[] values) {
        mObjectName = new String(values);
    }

    /**
     * Constructor from parameters
     * 
     * @param objectName Object Name
     */
    public ObjectName(@NonNull String objectName) {
        mObjectName = objectName;
    }

    /**
     * @return Object Name
     */
    public String getObjectName() {
        return mObjectName;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        return mObjectName.getBytes();
    }

}
