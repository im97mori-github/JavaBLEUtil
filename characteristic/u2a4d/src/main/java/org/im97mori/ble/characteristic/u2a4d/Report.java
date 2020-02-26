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
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A4D
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
