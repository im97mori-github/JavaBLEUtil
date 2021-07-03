package org.im97mori.ble.characteristic.u2a0a;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;
import org.im97mori.ble.characteristic.core.DayOfWeekUtils;

import androidx.annotation.NonNull;

/**
 * Day Date Time (Characteristics UUID: 0x2A0A)
 */
public class DayDateTime implements ByteArrayInterface {

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
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A0A
     */
    public DayDateTime(@NonNull byte[] values) {
        mYear = BLEUtils.createUInt16(values, 0);
        mMonth = (values[2] & 0xff);
        mDay = (values[3] & 0xff);
        mHours = (values[4] & 0xff);
        mMinutes = (values[5] & 0xff);
        mSeconds = (values[6] & 0xff);
        mDayOfWeek = (values[7] & 0xff);
    }

    /**
     * Constructor from parameters
     * 
     * @param year      Year
     * @param month     Month
     * @param day       Day
     * @param hours     Hours
     * @param minutes   Minutes
     * @param seconds   Seconds
     * @param dayOfWeek   Day of Week
     */
    public DayDateTime(int year, int month, int day, int hours, int minutes, int seconds, int dayOfWeek) {
        mYear = year;
        mMonth = month;
        mDay = day;
        mHours = hours;
        mMinutes = minutes;
        mSeconds = seconds;
        mDayOfWeek = dayOfWeek;
    }

    /**
     * @return Year
     */
    public int getYear() {
        return mYear;
    }

    /**
     * @return Month
     */
    public int getMonth() {
        return mMonth;
    }

    /**
     * @return Day
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
     * @see org.im97mori.ble.characteristic.core.DayOfWeekUtils
     */
    public int getDayOfWeek() {
        return mDayOfWeek;
    }

    /**
     * @return {@code true}:Day of week is not known, {@code false}:has day of week information
     * @see #DAY_OF_WEEK_IS_NOT_KNOWN
     */
    public boolean isDayOfWeekNotKnown() {
        return DayOfWeekUtils.isDayOfWeekNotKnown(mDayOfWeek);
    }

    /**
     * @return {@code true}:Monday, {@code false}:not Monday
     * @see #DAY_OF_WEEK_MONDAY
     */
    public boolean isDayOfWeekMonday() {
        return DayOfWeekUtils.isDayOfWeekMonday(mDayOfWeek);
    }

    /**
     * @return {@code true}:Tuesday, {@code false}:not Tuesday
     * @see #DAY_OF_WEEK_TUESDAY
     */
    public boolean isDayOfWeekTuesday() {
        return DayOfWeekUtils.isDayOfWeekTuesday(mDayOfWeek);
    }

    /**
     * @return {@code true}:Wednesday, {@code false}:not Wednesday
     * @see #DAY_OF_WEEK_WEDNESDAY
     */
    public boolean isDayOfWeekWednesday() {
        return DayOfWeekUtils.isDayOfWeekWednesday(mDayOfWeek);
    }

    /**
     * @return {@code true}:Thursday, {@code false}:not Thursday
     * @see #DAY_OF_WEEK_THURSDAY
     */
    public boolean isDayOfWeekThursday() {
        return DayOfWeekUtils.isDayOfWeekThursday(mDayOfWeek);
    }

    /**
     * @return {@code true}:Friday, {@code false}:not Friday
     * @see #DAY_OF_WEEK_FRIDAY
     */
    public boolean isDayOfWeekFriday() {
        return DayOfWeekUtils.isDayOfWeekFriday(mDayOfWeek);
    }

    /**
     * @return {@code true}:Saturday, {@code false}:not Saturday
     * @see #DAY_OF_WEEK_SATURDAY
     */
    public boolean isDayOfWeekSaturday() {
        return DayOfWeekUtils.isDayOfWeekSaturday(mDayOfWeek);
    }

    /**
     * @return {@code true}:Sunday, {@code false}:not Sunday
     * @see #DAY_OF_WEEK_SUNDAY
     */
    public boolean isDayOfWeekSunday() {
        return DayOfWeekUtils.isDayOfWeekSunday(mDayOfWeek);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[8];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mYear);
        byteBuffer.put((byte) mMonth);
        byteBuffer.put((byte) mDay);
        byteBuffer.put((byte) mHours);
        byteBuffer.put((byte) mMinutes);
        byteBuffer.put((byte) mSeconds);
        byteBuffer.put((byte) mDayOfWeek);
        return data;
    }

}
