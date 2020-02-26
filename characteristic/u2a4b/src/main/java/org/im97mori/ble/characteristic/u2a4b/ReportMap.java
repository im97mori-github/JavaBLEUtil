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
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A4B
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
