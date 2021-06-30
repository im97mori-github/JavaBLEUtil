package org.im97mori.ble.characteristic.u2a0d;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * DST Offset (Characteristics UUID: 0x2A0D)
 */
// TODO
public class DstOffset implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A0D
     */
    public DstOffset(@NonNull byte[] values) {
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
