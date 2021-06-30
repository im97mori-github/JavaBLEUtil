package org.im97mori.ble.characteristic.u2ba9;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Media Player Icon Object Type (Characteristics UUID: 0x2BA9)
 */
// TODO
public class MediaPlayerIconObjectType implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2BA9
     */
    public MediaPlayerIconObjectType(@NonNull byte[] values) {
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
