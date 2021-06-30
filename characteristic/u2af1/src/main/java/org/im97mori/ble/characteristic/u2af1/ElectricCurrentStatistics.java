package org.im97mori.ble.characteristic.u2af1;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Electric Current Statistics (Characteristics UUID: 0x2AF1)
 */
// TODO
public class ElectricCurrentStatistics implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2AF1
     */
    public ElectricCurrentStatistics(@NonNull byte[] values) {
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
