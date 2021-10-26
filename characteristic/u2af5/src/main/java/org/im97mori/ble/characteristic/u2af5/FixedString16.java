package org.im97mori.ble.characteristic.u2af5;


import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Fixed String 16 (Characteristics UUID: 0x2AF5)
 */
public class FixedString16 implements ByteArrayInterface {

    /**
     * Fixed String
     */
    private final String mFixedString;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public FixedString16(@NonNull byte[] values) {
        mFixedString = new String(values, 0, 16);
    }

    /**
     * Constructor from parameters
     * 
     * @param fixedString Fixed String
     */
    public FixedString16(@NonNull String fixedString) {
        mFixedString = new String(fixedString.getBytes(), 0, 16);
    }

    /**
     * @return Fixed String
     */
    public String getFixedString() {
        return mFixedString;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        return mFixedString.getBytes();
    }

}
