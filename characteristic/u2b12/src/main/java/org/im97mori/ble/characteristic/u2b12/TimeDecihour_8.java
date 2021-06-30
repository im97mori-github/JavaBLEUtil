package org.im97mori.ble.characteristic.u2b12;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Time Decihour 8 (Characteristics UUID: 0x2B12)
 */
// TODO
public class TimeDecihour_8 implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2B12
     */
    public TimeDecihour_8(@NonNull byte[] values) {
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
