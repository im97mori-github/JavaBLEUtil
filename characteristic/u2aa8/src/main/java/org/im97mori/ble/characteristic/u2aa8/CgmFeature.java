package org.im97mori.ble.characteristic.u2aa8;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * CGM Feature (Characteristics UUID: 0x2AA8)
 */
// TODO
public class CgmFeature implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2AA8
     */
    public CgmFeature(@NonNull byte[] values) {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[0];
        return data;
    }

}
