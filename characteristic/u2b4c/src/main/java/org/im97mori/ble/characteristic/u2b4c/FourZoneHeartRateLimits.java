package org.im97mori.ble.characteristic.u2b4c;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Four Zone Heart Rate Limits (Characteristics UUID: 0x2B4C)
 */
// TODO
public class FourZoneHeartRateLimits implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2B4C
     */
    public FourZoneHeartRateLimits(@NonNull byte[] values) {
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
