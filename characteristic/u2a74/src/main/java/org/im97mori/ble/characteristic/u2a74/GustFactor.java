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
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A74
     */
    public GustFactor(@NonNull byte[] values) {
        mGustFactor = (values[0] & 0xff);
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
