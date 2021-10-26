package org.im97mori.ble.characteristic.u2b38;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * BR-EDR Handover Data (Characteristics UUID: 0x2B38)
 */
// TODO
public class BrEdrHandoverData implements ByteArrayInterface {

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public BrEdrHandoverData(@NonNull byte[] values) {
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
