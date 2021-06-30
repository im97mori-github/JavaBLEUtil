package org.im97mori.ble.characteristic.u2adb;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Mesh Provisioning Data In (Characteristics UUID: 0x2ADB)
 */
// TODO
public class MeshProvisioningDataIn implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2ADB
     */
    public MeshProvisioningDataIn(@NonNull byte[] values) {
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
