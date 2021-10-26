package org.im97mori.ble.characteristic.u2a27;


import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Hardware Revision String (Characteristics UUID: 0x2A27)
 */
public class HardwareRevisionString implements ByteArrayInterface {

    /**
     * Hardware Revision
     */
    private final String mHardwareRevision;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public HardwareRevisionString(@NonNull byte[] values) {
        mHardwareRevision = new String(values);
    }

    /**
     * Constructor from parameters
     * 
     * @param hardwareRevision Hardware Revision
     */
    public HardwareRevisionString(@NonNull String hardwareRevision) {
        mHardwareRevision = hardwareRevision;
    }

    /**
     * @return Hardware Revision
     */
    public String getHardwareRevision() {
        return mHardwareRevision;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        return mHardwareRevision.getBytes();
    }

}
