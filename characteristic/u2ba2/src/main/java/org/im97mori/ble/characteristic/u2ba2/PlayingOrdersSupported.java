package org.im97mori.ble.characteristic.u2ba2;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Playing Orders Supported (Characteristics UUID: 0x2BA2)
 */
// TODO
public class PlayingOrdersSupported implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2BA2
     */
    public PlayingOrdersSupported(@NonNull byte[] values) {
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
