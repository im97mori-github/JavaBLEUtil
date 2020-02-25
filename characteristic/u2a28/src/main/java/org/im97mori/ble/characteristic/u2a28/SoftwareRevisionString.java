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
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A28
     */
    public SoftwareRevisionString(@NonNull byte[] values) {
        mSoftwareRevision = new String(values);
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
