package org.im97mori.ble.descriptor.u290f;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Complete BR-EDR Transport Block Data (Descriptor UUID: 0x290F)
 */
// TODO
public class CompleteBrEdrTransportBlockData implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattDescriptor}
     *
     * @param bluetoothGattDescriptor Characteristics UUID: 0x0x290F
     */
    public CompleteBrEdrTransportBlockData(@NonNull byte[] values) {
    }

    /**
     * {@inheritDoc}
     */
    @NonNull
    @Override
    public byte[] getBytes() {
        byte[] data = new byte[0];
        return data;
    }

}