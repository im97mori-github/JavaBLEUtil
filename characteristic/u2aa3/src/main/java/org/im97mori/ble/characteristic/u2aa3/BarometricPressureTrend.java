package org.im97mori.ble.characteristic.u2aa3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Barometric Pressure Trend (Characteristics UUID: 0x2AA3)
 */
public class BarometricPressureTrend implements ByteArrayInterface {

    /**
     * 0: Unknown
     */
    public static final int BAROMETRIC_PRESSURE_TREND_UNKNOWN = 0;

    /**
     * 1: Continuously falling
     */
    public static final int BAROMETRIC_PRESSURE_TREND_CONTINUOUSLY_FALLING = 1;

    /**
     * 2: Continuously rising
     */
    public static final int BAROMETRIC_PRESSURE_TREND_CONTINUOUSLY_RISING = 2;

    /**
     * 3: Falling, then steady
     */
    public static final int BAROMETRIC_PRESSURE_TREND_FALLING_THEN_STEADY = 3;

    /**
     * 4: Rising, then steady
     */
    public static final int BAROMETRIC_PRESSURE_TREND_RISING_THEN_STEADY = 4;

    /**
     * 5: Falling before a lesser rise
     */
    public static final int BAROMETRIC_PRESSURE_TREND_FALLING_BEFORE_A_LESSER_RISE = 5;

    /**
     * 6: Falling before a greater rise
     */
    public static final int BAROMETRIC_PRESSURE_TREND_FALLING_BEFORE_A_GREATER_RISE = 6;

    /**
     * 7: Rising before a greater fall
     */
    public static final int BAROMETRIC_PRESSURE_TREND_RISING_BEFORE_A_GREATER_FALL = 7;

    /**
     * 8: Rising before a lesser fall
     */
    public static final int BAROMETRIC_PRESSURE_TREND_RISING_BEFORE_A_LESSER_FALL = 8;

    /**
     * 9: Steady
     */
    public static final int BAROMETRIC_PRESSURE_TREND_STEADY = 9;

    /**
     * Barometric Pressure Trend
     */
    private final int mBarometricPressureTrend;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2AA3
     */
    public BarometricPressureTrend(@NonNull byte[] values) {
        mBarometricPressureTrend = (values[0] & 0xff);
    }

    /**
     * @return Barometric Pressure Trend
     */
    public int getBarometricPressureTrend() {
        return mBarometricPressureTrend;
    }

    /**
     * @return {@code true}:Unknown, {@code false}:not Unknown
     */
    public boolean isBarometricPressureTrendUnknown() {
        return BAROMETRIC_PRESSURE_TREND_UNKNOWN == mBarometricPressureTrend;
    }

    /**
     * @return {@code true}:Continuously falling, {@code false}:not Continuously falling
     */
    public boolean isBarometricPressureTrendContinuouslyFalling() {
        return BAROMETRIC_PRESSURE_TREND_CONTINUOUSLY_FALLING == mBarometricPressureTrend;
    }

    /**
     * @return {@code true}:Continuously rising, {@code false}:not Continuously rising
     */
    public boolean isBarometricPressureTrendContinuouslyRising() {
        return BAROMETRIC_PRESSURE_TREND_CONTINUOUSLY_RISING == mBarometricPressureTrend;
    }

    /**
     * @return {@code true}:Falling, then steady, {@code false}:not Falling, then steady
     */
    public boolean isBarometricPressureTrendFallingThenSteady() {
        return BAROMETRIC_PRESSURE_TREND_FALLING_THEN_STEADY == mBarometricPressureTrend;
    }

    /**
     * @return {@code true}:Rising, then steady, {@code false}:not Rising, then steady
     */
    public boolean isBarometricPressureTrendRisingThenSteady() {
        return BAROMETRIC_PRESSURE_TREND_RISING_THEN_STEADY == mBarometricPressureTrend;
    }

    /**
     * @return {@code true}:Falling before a lesser rise, {@code false}:not Falling before a lesser rise
     */
    public boolean isBarometricPressureTrendFallingBeforeALesserRise() {
        return BAROMETRIC_PRESSURE_TREND_FALLING_BEFORE_A_LESSER_RISE == mBarometricPressureTrend;
    }

    /**
     * @return {@code true}:Falling before a greater rise, {@code false}:not Falling before a greater rise
     */
    public boolean isBarometricPressureTrendFallingBeforeAGreaterRise() {
        return BAROMETRIC_PRESSURE_TREND_FALLING_BEFORE_A_GREATER_RISE == mBarometricPressureTrend;
    }
    /**
     * @return {@code true}:Rising before a greater fall, {@code false}:not Rising before a greater fall
     */
    public boolean isBarometricPressureTrendRisingBeforeAGreaterFall() {
        return BAROMETRIC_PRESSURE_TREND_RISING_BEFORE_A_GREATER_FALL == mBarometricPressureTrend;
    }
    /**
     * @return {@code true}:Rising before a lesser fall, {@code false}:not Rising before a lesser fall
     */
    public boolean isBarometricPressureTrendRisingBeforeALesserFall() {
        return BAROMETRIC_PRESSURE_TREND_RISING_BEFORE_A_LESSER_FALL == mBarometricPressureTrend;
    }

    /**
     * @return {@code true}:Steady, {@code false}:not Steady
     */
    public boolean isBarometricPressureTrendSteady() {
        return BAROMETRIC_PRESSURE_TREND_STEADY == mBarometricPressureTrend;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mBarometricPressureTrend);
        return data;
    }

}
