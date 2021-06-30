package org.im97mori.ble.characteristic.u2afa;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Global Trade Item Number (Characteristics UUID: 0x2AFA)
 */
// TODO
public class GlobalTradeItemNumber implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2AFA
     */
    public GlobalTradeItemNumber(@NonNull byte[] values) {
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
