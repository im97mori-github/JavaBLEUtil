package org.im97mori.ble.characteristic.u2abd;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * OTS Feature (Characteristics UUID: 0x2ABD)
 */
// TODO
public class OtsFeature implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2ABD
     */
    public OtsFeature(@NonNull byte[] values) {
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
