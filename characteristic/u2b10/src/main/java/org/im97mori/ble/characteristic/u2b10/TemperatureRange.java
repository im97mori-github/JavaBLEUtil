package org.im97mori.ble.characteristic.u2b10;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Temperature Range (Characteristics UUID: 0x2B10)
 */
// TODO
public class TemperatureRange implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2B10
     */
    public TemperatureRange(@NonNull byte[] values) {
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
