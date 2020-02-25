package org.im97mori.ble.characteristic.u2a24;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Model Number String (Characteristics UUID: 0x2A24)
 */
public class ModelNumberString implements ByteArrayInterface {

    /**
     * Model Number
     */
    private final String mModelNumber;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A24
     */
    public ModelNumberString(@NonNull byte[] values) {
        mModelNumber = new String(values);
    }

    /**
     * @return Model Number
     */
    public String getModelNumber() {
        return mModelNumber;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        return mModelNumber.getBytes();
    }

}
