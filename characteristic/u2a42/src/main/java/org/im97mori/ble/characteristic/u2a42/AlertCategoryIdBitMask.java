package org.im97mori.ble.characteristic.u2a42;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Alert Category ID Bit Mask (Characteristics UUID: 0x2A42)
 */
// TODO
public class AlertCategoryIdBitMask implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A42
     */
    public AlertCategoryIdBitMask(@NonNull byte[] values) {
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
