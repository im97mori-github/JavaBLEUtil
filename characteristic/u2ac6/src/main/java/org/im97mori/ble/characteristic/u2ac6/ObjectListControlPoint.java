package org.im97mori.ble.characteristic.u2ac6;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * object list control point (Characteristics UUID: 0x2AC6)
 */
// TODO
public class ObjectListControlPoint implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2AC6
     */
    public ObjectListControlPoint(@NonNull byte[] values) {
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
