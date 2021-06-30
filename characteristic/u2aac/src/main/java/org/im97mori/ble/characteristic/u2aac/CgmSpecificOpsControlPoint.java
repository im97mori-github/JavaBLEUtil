package org.im97mori.ble.characteristic.u2aac;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * CGM Specific Ops Control Point (Characteristics UUID: 0x2AAC)
 */
// TODO
public class CgmSpecificOpsControlPoint implements ByteArrayInterface {

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2AAC
     */
    public CgmSpecificOpsControlPoint(@NonNull byte[] values) {
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
