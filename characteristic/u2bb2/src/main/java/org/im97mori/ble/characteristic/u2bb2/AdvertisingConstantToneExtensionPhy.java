package org.im97mori.ble.characteristic.u2bb2;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Advertising Constant Tone Extension PHY (Characteristics UUID: 0x2BB2)
 */
// TODO
public class AdvertisingConstantToneExtensionPhy implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2BB2
     */
    public AdvertisingConstantToneExtensionPhy(@NonNull byte[] values) {
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
