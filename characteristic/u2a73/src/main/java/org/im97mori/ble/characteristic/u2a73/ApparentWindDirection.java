package org.im97mori.ble.characteristic.u2a73;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Apparent Wind Direction (Characteristics UUID: 0x2A73)
 */
public class ApparentWindDirection implements ByteArrayInterface {

    /**
     * Apparent Wind Direction Unit 0.01 degrees
     */
    public static final double APPARENT_WIND_DIRECTION_RESOLUTION = 0.01d;

    /**
     * Apparent Wind Direction
     */
    private final int mApparentWindDirection;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public ApparentWindDirection(@NonNull byte[] values) {
        mApparentWindDirection = BLEUtils.createUInt16(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param apparentWindDirection Apparent Wind Direction
     */
    public ApparentWindDirection(int apparentWindDirection) {
        mApparentWindDirection = apparentWindDirection;
    }

    /**
     * @return Apparent Wind Direction
     */
    public int getApparentWindDirection() {
        return mApparentWindDirection;
    }

    /**
     * @return Apparent Wind Direction(degrees)
     */
    public double getApparentWindDirectionDegrees() {
        return APPARENT_WIND_DIRECTION_RESOLUTION * mApparentWindDirection;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mApparentWindDirection);
        return data;
    }

}
