package org.im97mori.ble.characteristic.u2b15;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Time Millisecond 24 (Characteristics UUID: 0x2B15)
 */
public class TimeMillisecond24 implements ByteArrayInterface {

    /**
     * 0xFFFFFF : A value of 0xFFFFFF represents ‘value is not known’
     */
    public static final int TIME_MILLISECOND_24_VALUE_IS_NOT_KNOWN = 0xFFFFFF;

    /**
     * Unit is second with a resolution of 0.001.
     */
    public static final double TIME_MILLISECOND_24_VALUE_UNIT = 0.001d;

    /**
     * Time Millisecond 24 Minimum value
     */
    public static final double TIME_MILLISECOND_24_VALUE_MINIMUM = 0d;

    /**
     * Time Millisecond 24 Maximum value
     */
    public static final double TIME_MILLISECOND_24_VALUE_MAXIMUM = 16777.214d;

    /**
     * Time Millisecond 24
     */
    private final int mTimeMillisecond24;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2B15
     */
    public TimeMillisecond24(@NonNull byte[] values) {
        mTimeMillisecond24 = BLEUtils.createUInt24(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param timeMillisecond24 Time Millisecond 24
     */
    public TimeMillisecond24(int timeMillisecond24) {
        mTimeMillisecond24 = timeMillisecond24;
    }

    /**
     * @return Time Millisecond 24
     */
    public int getTimeMillisecond24() {
        return mTimeMillisecond24;
    }

    /**
     * @return {@code true}:Time Millisecond 24 value is not known, {@code false}:has Time Millisecond 24 value information
     * @see #TIME_MILLISECOND_24_VALUE_IS_NOT_KNOWN
     */
    public boolean isTimeMillisecond24IsNotKnown() {
        return TIME_MILLISECOND_24_VALUE_IS_NOT_KNOWN == mTimeMillisecond24;
    }

    /**
     * @return Time Decihour 8(second)
     */
    public double geTimeMillisecond24Second() {
        double timeMillisecond24Second = mTimeMillisecond24 * TIME_MILLISECOND_24_VALUE_UNIT;
        if (timeMillisecond24Second < TIME_MILLISECOND_24_VALUE_MINIMUM) {
            timeMillisecond24Second = TIME_MILLISECOND_24_VALUE_MINIMUM;
        } else if (timeMillisecond24Second > TIME_MILLISECOND_24_VALUE_MAXIMUM) {
            timeMillisecond24Second = TIME_MILLISECOND_24_VALUE_MAXIMUM;
        }
        return timeMillisecond24Second;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[3];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mTimeMillisecond24);
        byteBuffer.put((byte) (mTimeMillisecond24 >> 8));
        byteBuffer.put((byte) (mTimeMillisecond24 >> 16));
        return data;
    }

}
