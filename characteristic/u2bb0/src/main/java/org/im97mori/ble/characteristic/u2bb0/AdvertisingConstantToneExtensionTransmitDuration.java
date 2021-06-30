package org.im97mori.ble.characteristic.u2bb0;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Advertising Constant Tone Extension Transmit Duration (Characteristics UUID: 0x2BB0)
 */
// TODO
public class AdvertisingConstantToneExtensionTransmitDuration implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2BB0
     */
    public AdvertisingConstantToneExtensionTransmitDuration(@NonNull byte[] values) {
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
