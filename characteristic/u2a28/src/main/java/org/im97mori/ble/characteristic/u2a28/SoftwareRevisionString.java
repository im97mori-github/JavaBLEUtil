package org.im97mori.ble.characteristic.u2a28;


import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Software Revision String (Characteristics UUID: 0x2A28)
 */
public class SoftwareRevisionString implements ByteArrayInterface {

    /**
     * Software Revision
     */
    private final String mSoftwareRevision;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public SoftwareRevisionString(@NonNull byte[] values) {
        mSoftwareRevision = new String(values);
    }

    /**
     * Constructor from parameters
     * 
     * @param softwareRevision Software Revision
     */
    public SoftwareRevisionString(@NonNull String softwareRevision) {
        mSoftwareRevision = softwareRevision;
    }

    /**
     * @return Software Revision
     */
    public String getSoftwareRevision() {
        return mSoftwareRevision;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        return mSoftwareRevision.getBytes();
    }

}
