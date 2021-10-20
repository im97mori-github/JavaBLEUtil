package org.im97mori.ble.characteristic.u2bd8;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Sulfur Dioxide Concentration (Characteristics UUID: 0x2BD8)
 */
// TODO
public class SulfurDioxideConcentration implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2BD8
     */
    public SulfurDioxideConcentration(@NonNull byte[] values) {
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
