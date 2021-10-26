package org.im97mori.ble.characteristic.u2a8e;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Height (Characteristics UUID: 0x2A8E)
 */
public class Height implements ByteArrayInterface {

    /**
     * Height Unit 0.01 meters
     */
    public static final double HEIGHT_RESOLUTION = 0.01d;

    /**
     * Height
     */
    private final int mHeight;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public Height(@NonNull byte[] values) {
        mHeight = BLEUtils.createUInt16(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param height Height
     */
    public Height(int height) {
        mHeight = height;
    }

    /**
     * @return Height
     */
    public int getHeight() {
        return mHeight;
    }

    /**
     * @return Height(meters)
     */
    public double getHeightMeters() {
        return HEIGHT_RESOLUTION * mHeight;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mHeight);
        return data;
    }

}
