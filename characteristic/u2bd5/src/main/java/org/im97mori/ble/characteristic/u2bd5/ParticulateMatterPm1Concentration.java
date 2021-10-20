package org.im97mori.ble.characteristic.u2bd5;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Particulate Matter - PM1 Concentration (Characteristics UUID: 0x2BD5)
 */
// TODO
public class ParticulateMatterPm1Concentration implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2BD5
     */
    public ParticulateMatterPm1Concentration(@NonNull byte[] values) {
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
