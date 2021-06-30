package org.im97mori.ble.characteristic.u2b08;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Relative Runtime In A Generic Level Range (Characteristics UUID: 0x2B08)
 */
// TODO
public class RelativeRuntimeInAGenericLevelRange implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2B08
     */
    public RelativeRuntimeInAGenericLevelRange(@NonNull byte[] values) {
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
