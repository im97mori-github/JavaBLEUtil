package org.im97mori.ble.characteristic.u2b2b;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * BSS Control Point (Characteristics UUID: 0x2B2B)
 */
// TODO
public class BssControlPoint implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2B2B
     */
    public BssControlPoint(@NonNull byte[] values) {
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
