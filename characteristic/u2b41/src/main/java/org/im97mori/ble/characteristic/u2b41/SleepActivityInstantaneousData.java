package org.im97mori.ble.characteristic.u2b41;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Sleep Activity Instantaneous Data (Characteristics UUID: 0x2B41)
 */
// TODO
public class SleepActivityInstantaneousData implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2B41
     */
    public SleepActivityInstantaneousData(@NonNull byte[] values) {
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
