package org.im97mori.ble.characteristic.u2a29;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Manufacturer Name String (Characteristics UUID: 0x2A29)
 */
public class ManufacturerNameString implements ByteArrayInterface {

    /**
     * Manufacturer Name
     */
    private final String mManufacturerName;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A29
     */
    public ManufacturerNameString(@NonNull byte[] values) {
        mManufacturerName = new String(values);
    }

    /**
     * @return Manufacturer Name
     */
    public String getManufacturerName() {
        return mManufacturerName;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        return mManufacturerName.getBytes();
    }

}
