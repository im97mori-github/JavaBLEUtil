package org.im97mori.ble.characteristic.u2b4d;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * High Intensity Exercise Threshold (Characteristics UUID: 0x2B4D)
 */
// TODO
public class HighIntensityExerciseThreshold implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2B4D
     */
    public HighIntensityExerciseThreshold(@NonNull byte[] values) {
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
