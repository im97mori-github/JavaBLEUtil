package org.im97mori.ble.characteristic.u2bb8;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Bearer Signal Strength Reporting Interval (Characteristics UUID: 0x2BB8)
 */
// TODO Telephone Bearer Service
public class BearerSignalStrengthReportingInterval implements ByteArrayInterface {

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
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
