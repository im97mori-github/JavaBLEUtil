package org.im97mori.ble.characteristic.u2bbc;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Incoming Call Target Bearer URI (Characteristics UUID: 0x2BBC)
 */
// TODO
public class IncomingCallTargetBearerUri implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2BBC
     */
    public IncomingCallTargetBearerUri(@NonNull byte[] values) {
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
