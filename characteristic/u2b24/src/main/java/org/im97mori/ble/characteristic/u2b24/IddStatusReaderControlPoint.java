package org.im97mori.ble.characteristic.u2b24;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * IDD Status Reader Control Point (Characteristics UUID: 0x2B24)
 */
// TODO
public class IddStatusReaderControlPoint implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2B24
     */
    public IddStatusReaderControlPoint(@NonNull byte[] values) {
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
