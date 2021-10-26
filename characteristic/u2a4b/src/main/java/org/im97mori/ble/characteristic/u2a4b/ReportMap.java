package org.im97mori.ble.characteristic.u2a4b;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Report Map (Characteristics UUID: 0x2A4B)
 */
public class ReportMap implements ByteArrayInterface {

    /**
     * Report Map Value
     */
    private final byte[] mReportMapValue;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public ReportMap(@NonNull byte[] values) {
        mReportMapValue = values;
    }

    /**
     * @return Report Map Value
     */
    public byte[] getReportMapValue() {
        return mReportMapValue;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        return mReportMapValue;
    }

}
