package org.im97mori.ble.characteristic.u2bb6;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Bearer URI Schemes Supported List (Characteristics UUID: 0x2BB6)
 */
// TODO
public class BearerUriSchemesSupportedList implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2BB6
     */
    public BearerUriSchemesSupportedList(@NonNull byte[] values) {
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
