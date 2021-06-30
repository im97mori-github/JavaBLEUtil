package org.im97mori.ble.characteristic.u2b3f;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * CardioRespiratory Activity Summary Data (Characteristics UUID: 0x2B3F)
 */
// TODO
public class CardioRespiratoryActivitySummaryData implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2B3F
     */
    public CardioRespiratoryActivitySummaryData(@NonNull byte[] values) {
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
