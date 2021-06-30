package org.im97mori.ble.characteristic.u2b38;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * BR-EDR Handover Data (Characteristics UUID: 0x2B38)
 */
// TODO
public class BrEdrHandoverData implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2B38
     */
    public BrEdrHandoverData(@NonNull byte[] values) {
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
