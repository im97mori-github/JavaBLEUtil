package org.im97mori.ble.characteristic.u2ae4;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Chromaticity Coordinates (Characteristics UUID: 0x2AE4)
 */
// TODO
public class ChromaticityCoordinates implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2AE4
     */
    public ChromaticityCoordinates(@NonNull byte[] values) {
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
