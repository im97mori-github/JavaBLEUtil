package org.im97mori.ble.characteristic.u2bd6;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Particulate Matter - PM2.5 Concentration (Characteristics UUID: 0x2BD6)
 */
// TODO
public class ParticulateMatterPm25Concentration implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2BD6
     */
    public ParticulateMatterPm25Concentration(@NonNull byte[] values) {
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
