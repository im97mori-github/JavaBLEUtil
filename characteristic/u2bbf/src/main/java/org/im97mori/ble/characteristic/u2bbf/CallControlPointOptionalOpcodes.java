package org.im97mori.ble.characteristic.u2bbf;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Call Control Point Optional Opcodes (Characteristics UUID: 0x2BBF)
 */
// TODO Telephone Bearer Service
public class CallControlPointOptionalOpcodes implements ByteArrayInterface {

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public CallControlPointOptionalOpcodes(@NonNull byte[] values) {
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
