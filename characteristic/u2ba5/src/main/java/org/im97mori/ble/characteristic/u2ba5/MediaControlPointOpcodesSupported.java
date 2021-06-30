package org.im97mori.ble.characteristic.u2ba5;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Media Control Point Opcodes Supported (Characteristics UUID: 0x2BA5)
 */
// TODO
public class MediaControlPointOpcodesSupported implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2BA5
     */
    public MediaControlPointOpcodesSupported(@NonNull byte[] values) {
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
