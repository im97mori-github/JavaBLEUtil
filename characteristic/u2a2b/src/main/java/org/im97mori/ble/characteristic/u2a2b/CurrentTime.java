package org.im97mori.ble.characteristic.u2a2b;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Current Time (Characteristics UUID: 0x2A2B)
 */
public class CurrentTime implements ByteArrayInterface {

    /**
     * @see #ADJUST_REASON_NO_MANUAL_TIME_UPDATE
     * @see #ADJUST_REASON_MANUAL_TIME_UPDATE
     */
    public static final int ADJUST_REASON_MANUTAL_TIME_UPDATE_MASK = 0b00000001;

    /**
     * <p>
     * 0: No manual time update index 0
     * </p>
     */
    public static final int ADJUST_REASON_NO_MANUAL_TIME_UPDATE = 0b00000000;

    /**
     * <p>
     * 1: Manual time update index 0
     * </p>
     */
    public static final int ADJUST_REASON_MANUAL_TIME_UPDATE = 0b00000001;

    /**
     * @see #ADJUST_REASON_NO_EXTERNAL_REFEREMCE_TIME_UPDATE
     * @see #ADJUST_REASON_EXTERNAL_REFERENCE_TIME_UPDATE
     */
    public static final int ADJUST_REASON_EXTERNAL_REFERENCE_TIME_UPDATE_MASK = 0b00000010;

    /**
     * <p>
     * 0: No external reference time update index 1
     * </p>
     */
    public static final int ADJUST_REASON_NO_EXTERNAL_REFEREMCE_TIME_UPDATE = 0b00000000;

    /**
     * <p>
     * 1: External reference time update index 1
     * </p>
     */
    public static final int ADJUST_REASON_EXTERNAL_REFERENCE_TIME_UPDATE = 0b00000010;

    /**
     * @see #ADJUST_REASON_NO_CHANGE_OF_TIME_ZONE
     * @see #ADJUST_REASON_CHANGE_OF_TIME_ZONE
     */
    public static final int ADJUST_REASON_CHANGE_OF_TIME_ZONE_MASK = 0b00000100;

    /**
     * <p>
     * 0: No change of time zone index 2
     * </p>
     */
    public static final int ADJUST_REASON_NO_CHANGE_OF_TIME_ZONE = 0b00000000;

    /**
     * <p>
     * 1: Change of time zone index 2
     * </p>
     */
    public static final int ADJUST_REASON_CHANGE_OF_TIME_ZONE = 0b00000100;

    /**
     * @see #ADJUST_REASON_NO_CHANGE_OF_DST
     * @see #ADJUST_REASON_CHANGE_OF_DST
     */
    public static final int ADJUST_REASON_CHANGE_OF_DST_MASK = 0b00001000;

    /**
     * <p>
     * 0: No change of DST (daylight savings time) index 3
     * </p>
     */
    public static final int ADJUST_REASON_NO_CHANGE_OF_DST = 0b00000000;

    /**
     * <p>
     * 1: Change of DST (daylight savings time) index 3
     * </p>
     */
    public static final int ADJUST_REASON_CHANGE_OF_DST = 0b00001000;

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
     * Adjust Reason
     */
    private final int mAdjustReason;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public CurrentTime(@NonNull byte[] values) {
        mYear = BLEUtils.createUInt16(values, 0);
        mMonth = (values[2] & 0xff);
        mDay = (values[3] & 0xff);
        mHours = (values[4] & 0xff);
        mMinutes = (values[5] & 0xff);
        mSeconds = (values[6] & 0xff);
        mDayOfWeek = (values[7] & 0xff);
        mFractions256 = (values[8] & 0xff);
        mAdjustReason = values[9];
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
     * @param adjustReason Adjust Reason
     */
    public CurrentTime(int year, int month, int day, int hours, int minutes, int seconds, int dayOfWeek, int fractions256, int adjustReason) {
        mYear = year;
        mMonth = month;
        mDay = day;
        mHours = hours;
        mMinutes = minutes;
        mSeconds = seconds;
        mDayOfWeek = dayOfWeek;
        mFractions256 = fractions256;
        mAdjustReason = adjustReason;
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
     * @return Adjust Reason
     */
    public int getAdjustReason() {
        return mAdjustReason;
    }

    /**
     * @return {@code true}:No manual time update, {@code false}:Not no manual time update
     * @see #ADJUST_REASON_NO_MANUAL_TIME_UPDATE
     */
    public boolean isAdjustReasonNoManualTimeUpdate() {
        return isAdjustReasonMatched(ADJUST_REASON_MANUTAL_TIME_UPDATE_MASK, ADJUST_REASON_NO_MANUAL_TIME_UPDATE);
    }

    /**
     * @return {@code true}:Manual time update, {@code false}:Not manual time update
     * @see #ADJUST_REASON_MANUAL_TIME_UPDATE
     */
    public boolean isAdjustReasonManualTimeUpdate() {
        return isAdjustReasonMatched(ADJUST_REASON_MANUTAL_TIME_UPDATE_MASK, ADJUST_REASON_MANUAL_TIME_UPDATE);
    }

    /**
     * @return {@code true}:No external reference time update, {@code false}:Not no external reference time update
     * @see #ADJUST_REASON_NO_EXTERNAL_REFEREMCE_TIME_UPDATE
     */
    public boolean isAdjustReasonNoExternalReferenceTimeUpdate() {
        return isAdjustReasonMatched(ADJUST_REASON_EXTERNAL_REFERENCE_TIME_UPDATE_MASK, ADJUST_REASON_NO_EXTERNAL_REFEREMCE_TIME_UPDATE);
    }

    /**
     * @return {@code true}:External reference time update, {@code false}:Not external reference time update
     * @see #ADJUST_REASON_EXTERNAL_REFERENCE_TIME_UPDATE
     */
    public boolean isAdjustReasonExternalReferenceTimeUpdate() {
        return isAdjustReasonMatched(ADJUST_REASON_EXTERNAL_REFERENCE_TIME_UPDATE_MASK, ADJUST_REASON_EXTERNAL_REFERENCE_TIME_UPDATE);
    }

    /**
     * @return {@code true}:No change of time zone, {@code false}:Not no change of time zone
     * @see #ADJUST_REASON_NO_CHANGE_OF_TIME_ZONE
     */
    public boolean isAdjustReasonNoChangeOfTimeZone() {
        return isAdjustReasonMatched(ADJUST_REASON_CHANGE_OF_TIME_ZONE_MASK, ADJUST_REASON_NO_CHANGE_OF_TIME_ZONE);
    }

    /**
     * @return {@code true}:Change of time zone, {@code false}:Not change of time zone
     * @see #ADJUST_REASON_CHANGE_OF_TIME_ZONE
     */
    public boolean isAdjustReasonChangeOfTimeZone() {
        return isAdjustReasonMatched(ADJUST_REASON_CHANGE_OF_TIME_ZONE_MASK, ADJUST_REASON_CHANGE_OF_TIME_ZONE);
    }

    /**
     * @return {@code true}:No change of DST (daylight savings time), {@code false}:Not no change of DST (daylight savings time)
     * @see #ADJUST_REASON_NO_CHANGE_OF_DST
     */
    public boolean isAdjustReasonNoChangeOfDst() {
        return isAdjustReasonMatched(ADJUST_REASON_CHANGE_OF_DST_MASK, ADJUST_REASON_NO_CHANGE_OF_DST);
    }

    /**
     * @return {@code true}:Change of DST (daylight savings time), {@code false}:Not change of DST (daylight savings time)
     * @see #ADJUST_REASON_CHANGE_OF_DST
     */
    public boolean isAdjustReasonChangeOfDst() {
        return isAdjustReasonMatched(ADJUST_REASON_CHANGE_OF_DST_MASK, ADJUST_REASON_CHANGE_OF_DST);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[10];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mYear);
        byteBuffer.put((byte) mMonth);
        byteBuffer.put((byte) mDay);
        byteBuffer.put((byte) mHours);
        byteBuffer.put((byte) mMinutes);
        byteBuffer.put((byte) mSeconds);
        byteBuffer.put((byte) mDayOfWeek);
        byteBuffer.put((byte) mFractions256);
        byteBuffer.put((byte) mAdjustReason);
        return data;
    }

    /**
     * check Adjust Reason
     *
     * @param mask   bitmask for expect
     * @param expect one of {@link #ADJUST_REASON_NO_MANUAL_TIME_UPDATE} , {@link #ADJUST_REASON_MANUAL_TIME_UPDATE} , {@link #ADJUST_REASON_NO_EXTERNAL_REFEREMCE_TIME_UPDATE} , {@link #ADJUST_REASON_EXTERNAL_REFERENCE_TIME_UPDATE} , {@link #ADJUST_REASON_NO_CHANGE_OF_TIME_ZONE} , {@link #ADJUST_REASON_CHANGE_OF_TIME_ZONE} , {@link #ADJUST_REASON_NO_CHANGE_OF_DST} , {@link #ADJUST_REASON_CHANGE_OF_DST}
     * @return {@code true}:same as expect, {@code false}:not match
     */
    private boolean isAdjustReasonMatched(int mask, int expect) {
        return (mask & mAdjustReason) == expect;
    }

}
