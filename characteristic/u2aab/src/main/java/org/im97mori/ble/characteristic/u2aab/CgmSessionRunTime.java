package org.im97mori.ble.characteristic.u2aab;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * CGM Session Run Time (Characteristics UUID: 0x2AAB)
 */
// TODO
public class CgmSessionRunTime implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2AAB
     */
    public CgmSessionRunTime(@NonNull byte[] values) {
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
