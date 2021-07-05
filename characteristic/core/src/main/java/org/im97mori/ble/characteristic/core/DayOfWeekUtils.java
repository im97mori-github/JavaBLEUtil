package org.im97mori.ble.characteristic.core;

/**
 * Utility for org.bluetooth.characteristic.day_of_week(0x2A09) characteristic
 */
public class DayOfWeekUtils {

    /**
     * 0: Day of week is not known
     */
    public static final int DAY_OF_WEEK_IS_NOT_KNOWN = 0;

    /**
     * 1: Monday
     */
    public static final int DAY_OF_WEEK_MONDAY = 1;

    /**
     * 2: Tuesday
     */
    public static final int DAY_OF_WEEK_TUESDAY = 2;

    /**
     * 3: Wednesday
     */
    public static final int DAY_OF_WEEK_WEDNESDAY = 3;

    /**
     * 4: Thursday
     */
    public static final int DAY_OF_WEEK_THURSDAY = 4;

    /**
     * 5: Friday
     */
    public static final int DAY_OF_WEEK_FRIDAY = 5;

    /**
     * 6: Saturday
     */
    public static final int DAY_OF_WEEK_SATURDAY = 6;

    /**
     * 7: Sunday
     */
    public static final int DAY_OF_WEEK_SUNDAY = 7;

    /**
     * @param dayOfWeek org.bluetooth.unit.time.day
     * @return {@code true}:Day of week is not known, {@code false}:has day of week information
     * @see #DAY_OF_WEEK_IS_NOT_KNOWN
     */
    public static boolean isDayOfWeekNotKnown(int dayOfWeek) {
        return DAY_OF_WEEK_IS_NOT_KNOWN == dayOfWeek;
    }

    /**
     * @param dayOfWeek org.bluetooth.unit.time.day
     * @return {@code true}:Monday, {@code false}:not Monday
     * @see #DAY_OF_WEEK_MONDAY
     */
    public static boolean isDayOfWeekMonday(int dayOfWeek) {
        return DAY_OF_WEEK_MONDAY == dayOfWeek;
    }

    /**
     * @param dayOfWeek org.bluetooth.unit.time.day
     * @return {@code true}:Tuesday, {@code false}:not Tuesday
     * @see #DAY_OF_WEEK_TUESDAY
     */
    public static boolean isDayOfWeekTuesday(int dayOfWeek) {
        return DAY_OF_WEEK_TUESDAY == dayOfWeek;
    }

    /**
     * @param dayOfWeek org.bluetooth.unit.time.day
     * @return {@code true}:Wednesday, {@code false}:not Wednesday
     * @see #DAY_OF_WEEK_WEDNESDAY
     */
    public static boolean isDayOfWeekWednesday(int dayOfWeek) {
        return DAY_OF_WEEK_WEDNESDAY == dayOfWeek;
    }

    /**
     * @param dayOfWeek org.bluetooth.unit.time.day
     * @return {@code true}:Thursday, {@code false}:not Thursday
     * @see #DAY_OF_WEEK_THURSDAY
     */
    public static boolean isDayOfWeekThursday(int dayOfWeek) {
        return DAY_OF_WEEK_THURSDAY == dayOfWeek;
    }

    /**
     * @param dayOfWeek org.bluetooth.unit.time.day
     * @return {@code true}:Friday, {@code false}:not Friday
     * @see #DAY_OF_WEEK_FRIDAY
     */
    public static boolean isDayOfWeekFriday(int dayOfWeek) {
        return DAY_OF_WEEK_FRIDAY == dayOfWeek;
    }

    /**
     * @param dayOfWeek org.bluetooth.unit.time.day
     * @return {@code true}:Saturday, {@code false}:not Saturday
     * @see #DAY_OF_WEEK_SATURDAY
     */
    public static boolean isDayOfWeekSaturday(int dayOfWeek) {
        return DAY_OF_WEEK_SATURDAY == dayOfWeek;
    }

    /**
     * @param dayOfWeek org.bluetooth.unit.time.day
     * @return {@code true}:Sunday, {@code false}:not Sunday
     * @see #DAY_OF_WEEK_SUNDAY
     */
    public static boolean isDayOfWeekSunday(int dayOfWeek) {
        return DAY_OF_WEEK_SUNDAY == dayOfWeek;
    }

}
