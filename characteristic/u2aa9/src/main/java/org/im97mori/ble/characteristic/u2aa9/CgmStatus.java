package org.im97mori.ble.characteristic.u2aa9;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * CGM Status (Characteristics UUID: 0x2AA9)
 */
// TODO
public class CgmStatus implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2AA9
     */
    public CgmStatus(@NonNull byte[] values) {
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
