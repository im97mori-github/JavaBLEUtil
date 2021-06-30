package org.im97mori.ble.characteristic.u2b3c;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * General Activity Instantaneous Data (Characteristics UUID: 0x2B3C)
 */
// TODO
public class GeneralActivityInstantaneousData implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2B3C
     */
    public GeneralActivityInstantaneousData(@NonNull byte[] values) {
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
