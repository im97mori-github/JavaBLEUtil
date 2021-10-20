package org.im97mori.ble.characteristic.u2bd3;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Non-Methane Volatile Organic Compounds Concentration (Characteristics UUID: 0x2BD3)
 */
// TODO
public class NonMethaneVolatileOrganicCompoundsConcentration implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2BD3
     */
    public NonMethaneVolatileOrganicCompoundsConcentration(@NonNull byte[] values) {
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
