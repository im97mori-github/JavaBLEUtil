package org.im97mori.ble.characteristic.u2b28;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * IDD History Data (Characteristics UUID: 0x2B28)
 */
// TODO
public class IddHistoryData implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2B28
     */
    public IddHistoryData(@NonNull byte[] values) {
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
