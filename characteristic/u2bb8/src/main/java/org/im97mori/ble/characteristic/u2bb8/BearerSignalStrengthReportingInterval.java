package org.im97mori.ble.characteristic.u2bb8;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Bearer Signal Strength Reporting Interval (Characteristics UUID: 0x2BB8)
 */
// TODO
public class BearerSignalStrengthReportingInterval implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2BB8
     */
    public BearerSignalStrengthReportingInterval(@NonNull byte[] values) {
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
