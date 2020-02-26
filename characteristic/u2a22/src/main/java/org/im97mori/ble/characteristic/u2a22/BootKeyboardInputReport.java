package org.im97mori.ble.characteristic.u2a22;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Boot Keyboard Input Report (Characteristics UUID: 0x2A22)
 */
public class BootKeyboardInputReport implements ByteArrayInterface {

    /**
     * Boot Keyboard Input Report Value
     */
    private final byte[] mBootKeyboardInputReportValue;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A22
     */
    public BootKeyboardInputReport(@NonNull byte[] values) {
        mBootKeyboardInputReportValue = values;
    }

    /**
     * @return Boot Keyboard Input Report Value
     */
    public byte[] getBootKeyboardInputReportValue() {
        return mBootKeyboardInputReportValue;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        return mBootKeyboardInputReportValue;
    }

}
