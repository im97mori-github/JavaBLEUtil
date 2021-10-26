package org.im97mori.ble.characteristic.u2a26;


import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Firmware Revision String (Characteristics UUID: 0x2A26)
 */
public class FirmwareRevisionString implements ByteArrayInterface {

    /**
     * Firmware Revision
     */
    private final String mFirmwareRevision;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public FirmwareRevisionString(@NonNull byte[] values) {
        mFirmwareRevision = new String(values);
    }

    /**
     * Constructor from parameters
     * 
     * @param firmwareRevision Firmware Revision
     */
    public FirmwareRevisionString(@NonNull String firmwareRevision) {
        mFirmwareRevision = firmwareRevision;
    }

    /**
     * @return Firmware Revision
     */
    public String getFirmwareRevision() {
        return mFirmwareRevision;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        return mFirmwareRevision.getBytes();
    }

}
