package org.im97mori.ble.characteristic.u2a0c;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Exact Time 256 (Characteristics UUID: 0x2A0C)
 */
public class ExactTime256 implements ByteArrayInterface {

    /**
     * Year
     */
    private final int mYear;

    /**
     * Month
     */
    private final int mMonth;

    /**
     * Day
     */
    private final int mDay;

    /**
     * Hours
     */
    private final int mHours;

    /**
     * Minutes
     */
    private final int mMinutes;

    /**
     * Seconds
     */
    private final int mSeconds;

    /**
     * Day of Week
     */
    private final int mDayOfWeek;

    /**
     * Fractions256
     */
    private final int mFractions256;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A0C
     */
    public ExactTime256(@NonNull byte[] values) {
        mYear = BLEUtils.createUInt16(values, 0);
        mMonth = (values[2] & 0xff);
        mDay = (values[3] & 0xff);
        mHours = (values[4] & 0xff);
        mMinutes = (values[5] & 0xff);
        mSeconds = (values[6] & 0xff);
        mDayOfWeek = (values[7] & 0xff);
        mFractions256 = (values[8] & 0xff);
    }

    /**
     * Constructor from parameters
     * 
     * @param year         Year
     * @param month        Month
     * @param day          Day
     * @param hours        Hours
     * @param minutes      Minutes
     * @param seconds      Seconds
     * @param dayOfWeek    Day of Week
     * @param fractions256 Fractions256
     */
    public ExactTime256(int year, int month, int day, int hours, int minutes, int seconds, int dayOfWeek, int fractions256) {
        mYear = year;
        mMonth = month;
        mDay = day;
        mHours = hours;
        mMinutes = minutes;
        mSeconds = seconds;
        mDayOfWeek = dayOfWeek;
        mFractions256 = fractions256;
    }

    /**
     * @return Year
     * @see org.im97mori.ble.characteristic.core.DateTimeUtils
     */
    public int getYear() {
        return mYear;
    }

    /**
     * @return Month
     * @see org.im97mori.ble.characteristic.core.DateTimeUtils
     */
    public int getMonth() {
        return mMonth;
    }

    /**
     * @return Day
     * @see org.im97mori.ble.characteristic.core.DateTimeUtils
     */
    public int getDay() {
        return mDay;
    }

    /**
     * @return Hours
     */
    public int getHours() {
        return mHours;
    }

    /**
     * @return Minutes
     */
    public int getMinutes() {
        return mMinutes;
    }

    /**
     * @return Seconds
     */
    public int getSeconds() {
        return mSeconds;
    }

    /**
     * @return Day of Week
     */
    public int getDayOfWeek() {
        return mDayOfWeek;
    }

    /**
     * @return Fractions256
     */
    public int getFractions256() {
        return mFractions256;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[9];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mYear);
        byteBuffer.put((byte) mMonth);
        byteBuffer.put((byte) mDay);
        byteBuffer.put((byte) mHours);
        byteBuffer.put((byte) mMinutes);
        byteBuffer.put((byte) mSeconds);
        byteBuffer.put((byte) mDayOfWeek);
        byteBuffer.put((byte) mFractions256);
        return data;
    }

}
