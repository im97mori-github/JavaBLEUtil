package org.im97mori.ble.characteristic.u2a2a;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

// TODO GATT Specification Supplement v5 3.115

/**
 * IEEE 11073-20601 Regulatory Certification Data List (Characteristics UUID: 0x2A2A)
 */
public class IEEE_11073_20601_RegulatoryCertificationDataList implements ByteArrayInterface {

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
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
