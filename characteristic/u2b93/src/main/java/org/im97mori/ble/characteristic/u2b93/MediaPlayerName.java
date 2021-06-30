package org.im97mori.ble.characteristic.u2b93;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Media Player Name (Characteristics UUID: 0x2B93)
 */
// TODO
public class MediaPlayerName implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2B93
     */
    public MediaPlayerName(@NonNull byte[] values) {
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
