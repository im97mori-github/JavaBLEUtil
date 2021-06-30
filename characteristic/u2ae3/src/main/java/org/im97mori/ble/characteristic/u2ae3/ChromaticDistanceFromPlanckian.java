package org.im97mori.ble.characteristic.u2ae3;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Chromatic Distance From Planckian (Characteristics UUID: 0x2AE3)
 */
// TODO
public class ChromaticDistanceFromPlanckian implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2AE3
     */
    public ChromaticDistanceFromPlanckian(@NonNull byte[] values) {
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
