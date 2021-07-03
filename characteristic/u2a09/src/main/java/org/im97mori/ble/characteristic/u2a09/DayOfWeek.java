package org.im97mori.ble.characteristic.u2a09;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;
import org.im97mori.ble.characteristic.core.DayOfWeekUtils;

import androidx.annotation.NonNull;

/**
 * Day of Week (Characteristics UUID: 0x2A09)
 */
public class DayOfWeek implements ByteArrayInterface {

    /**
     * Day of Week
     */
    private final int mDayOfWeek;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A09
     */
    public DayOfWeek(@NonNull byte[] values) {
        mDayOfWeek = BLEUtils.createUInt8(values, 0);
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
        byte[] data = new byte[1];
        data[0] = (byte) mDayOfWeek;
        return data;
    }

}
