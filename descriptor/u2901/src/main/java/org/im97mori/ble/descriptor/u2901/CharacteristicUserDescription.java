package org.im97mori.ble.descriptor.u2901;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Characteristic User Description (Descriptor UUID: 0x2901)
 */
public class CharacteristicUserDescription implements ByteArrayInterface {

    /**
     * User Description
     */
    private final String mUserDescription;

    /**
     * Constructor from {@link BluetoothGattDescriptor}
     *
     * @param bluetoothGattDescriptor Characteristics UUID: 0x2901
     */
    public CharacteristicUserDescription(@NonNull byte[] values) {
        mUserDescription = new String(values);
    }

    /**
     * @return User Description
     */
    @NonNull
    public String getUserDescription() {
        return mUserDescription;
    }

    /**
     * {@inheritDoc}
     */
    @NonNull
    @Override
    public byte[] getBytes() {
        return mUserDescription.getBytes();
    }

}
