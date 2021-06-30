package org.im97mori.ble.characteristic.u2ae7;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * CIE 13.3-1995 Color Rendering Index (Characteristics UUID: 0x2AE7)
 */
// TODO
public class Cie13_3_1995ColorRenderingIndex implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2AE7
     */
    public Cie13_3_1995ColorRenderingIndex(@NonNull byte[] values) {
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
