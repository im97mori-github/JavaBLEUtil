package org.im97mori.ble.characteristic.u2ad4;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Supported Speed Range (Characteristics UUID: 0x2AD4)
 */
public class SupportedSpeedRange implements ByteArrayInterface {

    /**
     * Minimum Speed Unit 0.01 Kilometer per hour
     */
    public static final double MINIMUM_SPEED_RESOLUTION = 0.01d;

    /**
     * Maximum Speed Unit 0.01 Kilometer per hour
     */
    public static final double MAXIMUM_SPEED_RESOLUTION = 0.01d;

    /**
     * Minimum Increment Unit 0.01 Meters per second
     */
    public static final double MINIMUM_INCREMENT_RESOLUTION = 0.01d;

    /**
     * Minimum Speed
     */
    private final int mMinimumSpeed;

    /**
     * Maximum Speed
     */
    private final int mMaximumSpeed;

    /**
     * Minimum Increment
     */
    private final int mMinimumIncrement;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2AD4
     */
    public SupportedSpeedRange(@NonNull byte[] values) {
        mMinimumSpeed = BLEUtils.createUInt16(values, 0);
        mMaximumSpeed = BLEUtils.createUInt16(values, 2);
        mMinimumIncrement = BLEUtils.createUInt16(values, 4);
    }

    /**
     * @return Minimum Speed
     */
    public int getMinimumSpeed() {
        return mMinimumSpeed;
    }

    /**
     * @return Minimum Speed(Kilometer per hour)
     */
    public double getMinimumSpeedKilometerPerHour() {
        return MINIMUM_SPEED_RESOLUTION * mMinimumSpeed;
    }

    /**
     * @return Maximum Speed
     */
    public int getMaximumSpeed() {
        return mMaximumSpeed;
    }

    /**
     * @return Maximum Speed(Kilometer per hour)
     */
    public double getMaximumSpeedKilometerPerHour() {
        return MAXIMUM_SPEED_RESOLUTION * mMaximumSpeed;
    }

    /**
     * @return Minimum Increment
     */
    public int getMinimumIncrement() {
        return mMinimumIncrement;
    }

    /**
     * @return Minimum Increment(Meters per second)
     */
    public double getMinimumIncrementMetersPerSecond() {
        return MINIMUM_INCREMENT_RESOLUTION * mMinimumIncrement;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[6];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mMinimumSpeed);
        byteBuffer.putShort((short) mMaximumSpeed);
        byteBuffer.putShort((short) mMinimumIncrement);
        return data;
    }

}
