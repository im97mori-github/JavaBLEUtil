package org.im97mori.ble.characteristic.u2ae9;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Correlated Color Temperature (Characteristics UUID: 0x2AE9)
 */
// TODO
public class CorrelatedColorTemperature implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2AE9
     */
    public CorrelatedColorTemperature(@NonNull byte[] values) {
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
