package org.im97mori.ble.characteristic.u2bd7;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Particulate Matter - PM10 Concentration (Characteristics UUID: 0x2BD7)
 */
// TODO
public class ParticulateMatterPm10Concentration implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2BD7
     */
    public ParticulateMatterPm10Concentration(@NonNull byte[] values) {
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
