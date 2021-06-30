package org.im97mori.ble.characteristic.u2b09;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Relative Value In A Voltage Range (Characteristics UUID: 0x2B09)
 */
// TODO
public class RelativeValueInAVoltageRange implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2B09
     */
    public RelativeValueInAVoltageRange(@NonNull byte[] values) {
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
