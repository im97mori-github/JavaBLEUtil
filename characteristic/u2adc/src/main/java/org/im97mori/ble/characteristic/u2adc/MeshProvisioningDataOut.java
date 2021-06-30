package org.im97mori.ble.characteristic.u2adc;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Mesh Provisioning Data Out (Characteristics UUID: 0x2ADC)
 */
// TODO
public class MeshProvisioningDataOut implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2ADC
     */
    public MeshProvisioningDataOut(@NonNull byte[] values) {
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
