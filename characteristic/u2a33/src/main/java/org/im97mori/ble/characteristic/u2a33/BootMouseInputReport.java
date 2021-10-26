package org.im97mori.ble.characteristic.u2a33;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Boot Mouse Input Report (Characteristics UUID: 0x2A33)
 */
public class BootMouseInputReport implements ByteArrayInterface {

    /**
     * Boot Mouse Input Report Value
     */
    private final byte[] mBootMouseInputReportValue;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public BootMouseInputReport(@NonNull byte[] values) {
        mBootMouseInputReportValue = values;
    }

    /**
     * @return Boot Mouse Input Report Value
     */
    public byte[] getBootMouseInputReportValue() {
        return mBootMouseInputReportValue;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        return mBootMouseInputReportValue;
    }

}
