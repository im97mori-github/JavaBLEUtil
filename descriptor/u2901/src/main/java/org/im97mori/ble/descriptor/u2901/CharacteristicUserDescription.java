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
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
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
