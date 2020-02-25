package org.im97mori.ble.characteristic.u2a25;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Serial Number String (Characteristics UUID: 0x2A25)
 */
public class SerialNumberString implements ByteArrayInterface {

    /**
     * Serial Number
     */
    private final String mSerialNumber;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A25
     */
    public SerialNumberString(@NonNull byte[] values) {
        mSerialNumber = new String(values);
    }

    /**
     * @return Serial Number
     */
    public String getSerialNumber() {
        return mSerialNumber;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        return mSerialNumber.getBytes();
    }

}
