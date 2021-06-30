package org.im97mori.ble.characteristic.u2bbf;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Call Control Point Optional Opcodes (Characteristics UUID: 0x2BBF)
 */
// TODO
public class CallControlPointOptionalOpcodes implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2BBF
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
