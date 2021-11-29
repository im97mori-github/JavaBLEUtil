package org.im97mori.ble.characteristic.u2b41;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Sleep Activity Instantaneous Data (Characteristics UUID: 0x2B41)
 */
// TODO Physical Activity Monitor Service
public class SleepActivityInstantaneousData implements ByteArrayInterface {

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public SleepActivityInstantaneousData(@NonNull byte[] values) {
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
