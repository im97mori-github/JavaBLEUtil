package org.im97mori.ble.characteristic.u2a4d;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Report (Characteristics UUID: 0x2A4D)
 */
public class Report implements ByteArrayInterface {

    /**
     * Report Value
     */
    private final byte[] mReportValue;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public Report(@NonNull byte[] values) {
        mReportValue = values;
    }

    /**
     * @return Report Value
     */
    public byte[] getReportValue() {
        return mReportValue;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        return mReportValue;
    }

}
