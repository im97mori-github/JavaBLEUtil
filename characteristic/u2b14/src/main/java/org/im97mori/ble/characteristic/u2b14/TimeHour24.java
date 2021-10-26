package org.im97mori.ble.characteristic.u2b14;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Time Hour 24 (Characteristics UUID: 0x2B14)
 */
public class TimeHour24 implements ByteArrayInterface {

    /**
     * 0xFFFFFF : A value of 0xFFFFFF represents ‘value is not known’
     */
    public static final int TIME_HOUR_24_VALUE_IS_NOT_KNOWN = 0xFFFFFF;

    /**
     * Time Hour 24 Minimum value
     */
    public static final int TIME_HOUR_24_VALUE_MINIMUM = 0;

    /**
     * Time Hour 24 Maximum value
     */
    public static final int TIME_HOUR_24_VALUE_MAXIMUM = 16777214;

    /**
     * Time Hour 24
     */
    private final int mTimeHour24;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public TimeHour24(@NonNull byte[] values) {
        mTimeHour24 = BLEUtils.createUInt24(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param timeHour24 Time Hour 24
     */
    public TimeHour24(int timeHour24) {
        mTimeHour24 = timeHour24;
    }

    /**
     * @return Time Hour 24
     */
    public int getTimeHour24() {
        return mTimeHour24;
    }

    /**
     * @return {@code true}:Time Hour 24 value is not known, {@code false}:has Time Hour 24 value information
     * @see #TIME_HOUR_24_VALUE_IS_NOT_KNOWN
     */
    public boolean isTimeHour24ValueIsNotKnown() {
        return TIME_HOUR_24_VALUE_IS_NOT_KNOWN == mTimeHour24;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[3];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mTimeHour24);
        byteBuffer.put((byte) (mTimeHour24 >> 8));
        byteBuffer.put((byte) (mTimeHour24 >> 16));
        return data;
    }

}
