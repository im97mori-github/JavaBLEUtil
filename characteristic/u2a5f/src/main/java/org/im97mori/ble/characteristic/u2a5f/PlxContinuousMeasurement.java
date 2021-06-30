package org.im97mori.ble.characteristic.u2a5f;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * PLX Continuous Measurement (Characteristics UUID: 0x2A5F)
 */
// TODO
public class PlxContinuousMeasurement implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A5F
     */
    public PlxContinuousMeasurement(@NonNull byte[] values) {
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
