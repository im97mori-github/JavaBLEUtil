package org.im97mori.ble.characteristic.u2a34;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Glucose Measurement Context (Characteristics UUID: 0x2A34)
 */
// TODO
public class GlucoseMeasurementContext implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A34
     */
    public GlucoseMeasurementContext(@NonNull byte[] values) {
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
