package org.im97mori.ble.characteristic.u2baa;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Track Segments Object Type (Characteristics UUID: 0x2BAA)
 */
// TODO
public class TrackSegmentsObjectType implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2BAA
     */
    public TrackSegmentsObjectType(@NonNull byte[] values) {
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
