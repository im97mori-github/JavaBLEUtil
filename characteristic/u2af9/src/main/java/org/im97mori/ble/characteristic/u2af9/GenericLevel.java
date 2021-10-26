package org.im97mori.ble.characteristic.u2af9;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Generic Level (Characteristics UUID: 0x2AF9)
 */
public class GenericLevel implements ByteArrayInterface {

    /**
     * Generic Level
     */
    private final int mGenericLevel;
    
    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public GenericLevel(@NonNull byte[] values) {
        mGenericLevel = BLEUtils.createUInt16(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param genericLevel Generic Level
     */
    public GenericLevel(int genericLevel) {
        mGenericLevel = genericLevel;
    }

    /**
     * @return Generic Level
     */
    public int getGenericLevel() {
        return mGenericLevel;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mGenericLevel);
        byteBuffer.put((byte) (mGenericLevel >> 8));
        return data;
    }

}
