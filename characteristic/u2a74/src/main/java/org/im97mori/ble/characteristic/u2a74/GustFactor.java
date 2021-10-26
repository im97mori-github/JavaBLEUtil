package org.im97mori.ble.characteristic.u2a74;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Gust Factor (Characteristics UUID: 0x2A74)
 */
public class GustFactor implements ByteArrayInterface {

    /**
     * Gust Facter Unit 0.1
     */
    public static final double GUST_FACTOR_RESOLUTION = 0.1d;

    /**
     * Gust Factor
     */
    private final int mGustFactor;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public GustFactor(@NonNull byte[] values) {
        mGustFactor = (values[0] & 0xff);
    }

    /**
     * Constructor from parameters
     * 
     * @param gustFactor Gust Factor
     */
    public GustFactor(int gustFactor) {
        mGustFactor = gustFactor;
    }

    /**
     * @return Gust Factor
     */
    public int getGustFactor() {
        return mGustFactor;
    }

    /**
     * @return Gust Factor with Unit
     */
    public double getGustFactorWithUnit() {
        return GUST_FACTOR_RESOLUTION * mGustFactor;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mGustFactor);
        return data;
    }

}
