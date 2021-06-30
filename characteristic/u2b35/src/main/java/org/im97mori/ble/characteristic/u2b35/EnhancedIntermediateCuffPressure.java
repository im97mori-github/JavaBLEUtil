package org.im97mori.ble.characteristic.u2b35;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Enhanced Intermediate Cuff Pressure (Characteristics UUID: 0x2B35)
 */
// TODO
public class EnhancedIntermediateCuffPressure implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2B35
     */
    public EnhancedIntermediateCuffPressure(@NonNull byte[] values) {
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
