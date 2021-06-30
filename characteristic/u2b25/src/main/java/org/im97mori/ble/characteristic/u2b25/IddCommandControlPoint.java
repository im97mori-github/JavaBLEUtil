package org.im97mori.ble.characteristic.u2b25;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * IDD Command Control Point (Characteristics UUID: 0x2B25)
 */
// TODO
public class IddCommandControlPoint implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2B25
     */
    public IddCommandControlPoint(@NonNull byte[] values) {
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
