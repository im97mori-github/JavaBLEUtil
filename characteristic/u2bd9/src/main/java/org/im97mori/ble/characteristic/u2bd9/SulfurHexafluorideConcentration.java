package org.im97mori.ble.characteristic.u2bd9;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Sulfur Hexafluoride Concentration (Characteristics UUID: 0x2BD9)
 */
// TODO
public class SulfurHexafluorideConcentration implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2BD9
     */
    public SulfurHexafluorideConcentration(@NonNull byte[] values) {
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
