package org.im97mori.ble.characteristic.u2b3d;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * General Activity Summary Data (Characteristics UUID: 0x2B3D)
 */
// TODO Physical Activity Monitor Service
public class GeneralActivitySummaryData implements ByteArrayInterface {

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public GeneralActivitySummaryData(@NonNull byte[] values) {
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
