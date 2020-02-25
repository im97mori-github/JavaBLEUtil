package org.im97mori.ble.characteristic.u2a2a;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

// TODO

/**
 * IEEE 11073-20601 Regulatory Certification Data List (Characteristics UUID: 0x2A2A)
 */
public class IEEE_11073_20601_RegulatoryCertificationDataList implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A2A
     */
    public IEEE_11073_20601_RegulatoryCertificationDataList(@NonNull byte[] values) {

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
