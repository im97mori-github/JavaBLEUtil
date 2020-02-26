package org.im97mori.ble.characteristic.u2a32;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Boot Keyboard Output Report (Characteristics UUID: 0x2A32)
 */
public class BootKeyboardOutputReport implements ByteArrayInterface {

    /**
     * Boot Keyboard Output Report Value
     */
    private final byte[] mBootKeyboardOutputReportValue;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A32
     */
    public BootKeyboardOutputReport(@NonNull byte[] values) {
        mBootKeyboardOutputReportValue = values;
    }

    /**
     * @return Boot Keyboard Output Report Value
     */
    public byte[] getBootKeyboardOutputReportValue() {
        return mBootKeyboardOutputReportValue;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        return mBootKeyboardOutputReportValue;
    }

}
