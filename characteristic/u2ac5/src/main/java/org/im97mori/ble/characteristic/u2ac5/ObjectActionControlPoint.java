package org.im97mori.ble.characteristic.u2ac5;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * object actioncontrol point (Characteristics UUID: 0x2AC5)
 */
// TODO
public class ObjectActionControlPoint implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2AC5
     */
    public ObjectActionControlPoint(@NonNull byte[] values) {
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
