package org.im97mori.ble.characteristic.u2a76;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * UV Index (Characteristics UUID: 0x2A76)
 */
public class UVIndex implements ByteArrayInterface {

    /**
     * UV Index
     */
    private final int mUVIndex;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public UVIndex(@NonNull byte[] values) {
        mUVIndex = (values[0] & 0xff);
    }

    /**
     * Constructor from parameters
     * 
     * @param UVIndex UV Index
     */
    public UVIndex(int UVIndex) {
        mUVIndex = UVIndex;
    }

    /**
     * @return UV Index
     */
    public int getUVIndex() {
        return mUVIndex;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mUVIndex);
        return data;
    }

}
