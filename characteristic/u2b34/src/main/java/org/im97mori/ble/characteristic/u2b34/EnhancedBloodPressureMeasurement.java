package org.im97mori.ble.characteristic.u2b34;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Enhanced Blood Pressure Measurement (Characteristics UUID: 0x2B34)
 */
// TODO
public class EnhancedBloodPressureMeasurement implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2B34
     */
    public EnhancedBloodPressureMeasurement(@NonNull byte[] values) {
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
