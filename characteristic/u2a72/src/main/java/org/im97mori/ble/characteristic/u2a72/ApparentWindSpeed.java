package org.im97mori.ble.characteristic.u2a72;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Apparent Wind Speed (Characteristics UUID: 0x2A72)
 */
public class ApparentWindSpeed implements ByteArrayInterface {

    /**
     * Apparent Wind Speed Unit 0.01 meters per second
     */
    public static final double APPARENT_WIND_SPEED_RESOLUTION = 0.01d;

    /**
     * Apparent Wind Speed
     */
    private final int mApparentWindSpeed;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public ApparentWindSpeed(@NonNull byte[] values) {
        mApparentWindSpeed = BLEUtils.createUInt16(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param apparentWindSpeed Apparent Wind Speed
     */
    public ApparentWindSpeed(int apparentWindSpeed) {
        mApparentWindSpeed = apparentWindSpeed;
    }

    /**
     * @return Apparent Wind Speed
     */
    public int getApparentWindSpeed() {
        return mApparentWindSpeed;
    }

    /**
     * @return Apparent Wind Speed(meters per second)
     */
    public double getApparentWindSpeedMetersPerSecond() {
        return APPARENT_WIND_SPEED_RESOLUTION * mApparentWindSpeed;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mApparentWindSpeed);
        return data;
    }

}
