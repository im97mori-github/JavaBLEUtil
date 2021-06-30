package org.im97mori.ble.characteristic.u2b0b;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Relative Value In A Period Of Day (Characteristics UUID: 0x2B0B)
 */
// TODO
public class RelativeValueInAPeriodOfDay implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2B0B
     */
    public RelativeValueInAPeriodOfDay(@NonNull byte[] values) {
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
