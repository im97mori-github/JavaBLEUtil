package org.im97mori.ble.characteristic.u2a00;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Device Name (Characteristics UUID: 0x2A00)
 */
public class DeviceName implements ByteArrayInterface {

    /**
     * Name
     */
    private final String mName;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A00
     */
    public DeviceName(@NonNull byte[] values) {
        mName = new String(values);
    }

    /**
     * @return Name
     */
    public String getName() {
        return mName;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        return mName.getBytes();
    }

}
