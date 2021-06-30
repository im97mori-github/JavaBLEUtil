package org.im97mori.ble.characteristic.u2a5e;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * PLX Spot-Check Measurement (Characteristics UUID: 0x2A5E)
 */
// TODO
public class PlxSpotCheckMeasurement implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A5E
     */
    public PlxSpotCheckMeasurement(@NonNull byte[] values) {
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
