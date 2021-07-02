package org.im97mori.ble.descriptor.u290f;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Complete BR-EDR Transport Block Data (Descriptor UUID: 0x290F)
 */
public class CompleteBrEdrTransportBlockData implements ByteArrayInterface {

    /**
     * Transport Data
     */
    private final byte[] mTransportData;

    /**
     * Constructor from {@link BluetoothGattDescriptor}
     *
     * @param bluetoothGattDescriptor Characteristics UUID: 0x0x290F
     */
    public CompleteBrEdrTransportBlockData(@NonNull byte[] values) {
        mTransportData = values;
    }

    /**
     * @return Transport Data
     */
    public byte[] getTransportData() {
        return mTransportData;
    }

    /**
     * {@inheritDoc}
     */
    @NonNull
    @Override
    public byte[] getBytes() {
        return mTransportData;
    }

}