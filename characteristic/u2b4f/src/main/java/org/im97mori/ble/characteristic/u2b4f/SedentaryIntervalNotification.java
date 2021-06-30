package org.im97mori.ble.characteristic.u2b4f;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Sedentary Interval Notification (Characteristics UUID: 0x2B4F)
 */
// TODO
public class SedentaryIntervalNotification implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2B4F
     */
    public SedentaryIntervalNotification(@NonNull byte[] values) {
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
