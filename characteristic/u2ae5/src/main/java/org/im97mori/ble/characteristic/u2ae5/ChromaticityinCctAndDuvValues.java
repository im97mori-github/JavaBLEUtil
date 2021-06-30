package org.im97mori.ble.characteristic.u2ae5;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Chromaticity in CCT And Duv Values (Characteristics UUID: 0x2AE5)
 */
// TODO
public class ChromaticityinCctAndDuvValues implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2AE5
     */
    public ChromaticityinCctAndDuvValues(@NonNull byte[] values) {
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
