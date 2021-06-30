package org.im97mori.ble.characteristic.u2b0e;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Temperature 8 In A Period Of Day (Characteristics UUID: 0x2B0E)
 */
// TODO
public class Temperature_8InAPeriodOfDay implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2B0E
     */
    public Temperature_8InAPeriodOfDay(@NonNull byte[] values) {
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
