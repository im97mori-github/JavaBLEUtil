package org.im97mori.ble.characteristic.u2af3;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Energy In A Period Of Day (Characteristics UUID: 0x2AF3)
 */
// TODO
public class EnergyInAPeriodOfDay implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2AF3
     */
    public EnergyInAPeriodOfDay(@NonNull byte[] values) {
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
