package org.im97mori.ble.characteristic.u2a6c;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Elevation (Characteristics UUID: 0x2A6C)
 */
public class Elevation implements ByteArrayInterface {

    /**
     * Elevation Unit 0.01 meters
     */
    public static final double ELEVATION_RESOLUTION = 0.01d;

    /**
     * Elevation
     */
    private final int mElevation;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public Elevation(@NonNull byte[] values) {
        mElevation = BLEUtils.createSInt24(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param elevation Elevation
     */
    public Elevation(int elevation) {
        mElevation = elevation;
    }

    /**
     * @return Elevation
     */
    public int getElevation() {
        return mElevation;
    }

    /**
     * @return Elevation(meters)
     */
    public double getElevationMeters() {
        return ELEVATION_RESOLUTION * mElevation;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[3];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mElevation);
        byteBuffer.put((byte) (mElevation >> 8));
        byteBuffer.put((byte) (mElevation >> 16));
        return data;
    }

}
