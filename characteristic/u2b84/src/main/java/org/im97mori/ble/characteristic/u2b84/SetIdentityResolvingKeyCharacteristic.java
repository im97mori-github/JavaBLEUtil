package org.im97mori.ble.characteristic.u2b84;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Set Identity Resolving Key Characteristic (Characteristics UUID: 0x2B84)
 */
// TODO
public class SetIdentityResolvingKeyCharacteristic implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2B84
     */
    public SetIdentityResolvingKeyCharacteristic(@NonNull byte[] values) {
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
