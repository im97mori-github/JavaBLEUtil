package org.im97mori.ble.characteristic.u2aae;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Latitude (Characteristics UUID: 0x2AAE)
 */
public class Latitude implements ByteArrayInterface {

    /**
     * Latitude
     */
    private final int mLatitude;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public Latitude(@NonNull byte[] values) {
        mLatitude = BLEUtils.createSInt32(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param latitude Latitude
     */
    public Latitude(int latitude) {
        mLatitude = latitude;
    }

    /**
     * @return Latitude
     */
    public int getLatitude() {
        return mLatitude;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[4];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putInt(mLatitude);
        return data;
    }

}
