package org.im97mori.ble.characteristic.u2b0a;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Relative Value In An Illuminance Range (Characteristics UUID: 0x2B0A)
 */
// TODO
public class RelativeValueInAnIlluminanceRange implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2B0A
     */
    public RelativeValueInAnIlluminanceRange(@NonNull byte[] values) {
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
