package org.im97mori.ble.characteristic.u2b40;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Step Counter Activity Summary Data (Characteristics UUID: 0x2B40)
 */
// TODO
public class StepCounterActivitySummaryData implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2B40
     */
    public StepCounterActivitySummaryData(@NonNull byte[] values) {
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
