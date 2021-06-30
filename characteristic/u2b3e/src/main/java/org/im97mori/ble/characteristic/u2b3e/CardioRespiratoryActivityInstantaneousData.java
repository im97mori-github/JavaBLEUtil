package org.im97mori.ble.characteristic.u2b3e;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * CardioRespiratory Activity Instantaneous Data (Characteristics UUID: 0x2B3E)
 */
// TODO
public class CardioRespiratoryActivityInstantaneousData implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2B3E
     */
    public CardioRespiratoryActivityInstantaneousData(@NonNull byte[] values) {
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
