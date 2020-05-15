package org.im97mori.ble.characteristic.u2aa2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Language (Characteristics UUID: 0x2AA2)
 */
public class Language implements ByteArrayInterface {

    /**
     * Language
     */
    private final String mLanguage;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2AA2
     */
    public Language(@NonNull byte[] values) {
        mLanguage = new String(values);
    }

    /**
     * Constructor from parameters
     * 
     * @param language Language
     */
    public Language(@NonNull String language) {
        mLanguage = language;
    }

    /**
     * @return Language
     */
    public String getLanguage() {
        return mLanguage;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[mLanguage.getBytes().length];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put(mLanguage.getBytes());
        return data;
    }

}
