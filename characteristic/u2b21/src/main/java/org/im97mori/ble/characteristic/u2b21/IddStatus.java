package org.im97mori.ble.characteristic.u2b21;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * IDD Status (Characteristics UUID: 0x2B21)
 */
// TODO
public class IddStatus implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2B21
     */
    public IddStatus(@NonNull byte[] values) {
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
