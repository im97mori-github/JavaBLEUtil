package org.im97mori.ble.characteristic.u2b07;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Relative Runtime In A Current Range (Characteristics UUID: 0x2B07)
 */
// TODO
public class RelativeRuntimeInACurrentRange implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2B07
     */
    public RelativeRuntimeInACurrentRange(@NonNull byte[] values) {
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
