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
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A27
     */
    public HardwareRevisionString(@NonNull byte[] values) {
        mHardwareRevision = new String(values);
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
