package org.im97mori.ble.characteristic.u2b3b;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Physical Activity Monitor Features (Characteristics UUID: 0x2B3B)
 */
// TODO
public class PhysicalActivityMonitorFeatures implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2B3B
     */
    public PhysicalActivityMonitorFeatures(@NonNull byte[] values) {
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
