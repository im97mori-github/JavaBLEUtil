package org.im97mori.ble.characteristic.u2b1c;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Chromaticity Coordinate (Characteristics UUID: 0x2B1C)
 */
// TODO
public class ChromaticityCoordinate implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2B1C
     */
    public ChromaticityCoordinate(@NonNull byte[] values) {
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
