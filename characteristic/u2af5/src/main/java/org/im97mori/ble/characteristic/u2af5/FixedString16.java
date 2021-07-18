package org.im97mori.ble.characteristic.u2af5;

import java.nio.charset.StandardCharsets;

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
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2AF5
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
        mFixedString = new String(fixedString.getBytes(StandardCharsets.UTF_8), 0, 16);
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
