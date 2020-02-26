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
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A33
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
