package org.im97mori.ble.characteristic.u2b43;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Physical Activity Monitor Control Point (Characteristics UUID: 0x2B43)
 */
// TODO
public class PhysicalActivityMonitorControlPoint implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2B43
     */
    public PhysicalActivityMonitorControlPoint(@NonNull byte[] values) {
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
