package org.im97mori.ble.characteristic.core;

/**
 * Utility for Time Second 16 (0x2B16) characteristic
 */
public class TimeSecond16Utils {

    /**
     * 0xFFFF : A value of 0xFFFF represents ‘value is not known’
     */
    public static final int TIME_SECOND_16_VALUE_IS_NOT_KNOWN = 0xFFFF;

    /**
     * Time Second 16 Minimum value
     */
    public static final int TIME_SECOND_16_VALUE_MINIMUM = 0;

    /**
     * Time Second 16 Maximum value
     */
    public static final int TIME_SECOND_16_VALUE_MAXIMUM = 65534;

    /**
     * @param timeSecond16 Time Second 16
     * @return {@code true}:Time Second 16 value is not known, {@code false}:has Time Second 16 value information
     * @see #TIME_SECOND_16_VALUE_IS_NOT_KNOWN
     */
    public static boolean isTimeSecond16ValueIsNotKnown(int timeSecond16) {
        return TIME_SECOND_16_VALUE_IS_NOT_KNOWN == timeSecond16;
    }

}