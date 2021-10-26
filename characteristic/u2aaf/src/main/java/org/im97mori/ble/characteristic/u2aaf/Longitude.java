package org.im97mori.ble.characteristic.u2aaf;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Longitude (Characteristics UUID: 0x2AAF)
 */
public class Longitude implements ByteArrayInterface {

    /**
     * Longitude
     */
    private final int mLongitude;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public Longitude(@NonNull byte[] values) {
        mLongitude = BLEUtils.createSInt32(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param longitude Longitude
     */
    public Longitude(int longitude) {
        mLongitude = longitude;
    }

    /**
     * @return Longitude
     */
    public int getLongitude() {
        return mLongitude;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[4];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putInt(mLongitude);
        return data;
    }

}
