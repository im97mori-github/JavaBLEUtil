package org.im97mori.ble.characteristic.u2b0c;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Relative Value In A Temperature Range (Characteristics UUID: 0x2B0C)
 */
// TODO
public class RelativeValueInATemperatureRange implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2B0C
     */
    public RelativeValueInATemperatureRange(@NonNull byte[] values) {
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
