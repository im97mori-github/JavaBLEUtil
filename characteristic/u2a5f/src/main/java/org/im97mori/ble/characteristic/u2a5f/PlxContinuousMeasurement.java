package org.im97mori.ble.characteristic.u2a5f;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * PLX Continuous Measurement (Characteristics UUID: 0x2A5F)
 */
// TODO Pulse Oximeter Service
public class PlxContinuousMeasurement implements ByteArrayInterface {

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public PlxContinuousMeasurement(@NonNull byte[] values) {
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
