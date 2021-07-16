package org.im97mori.ble.characteristic.core;

/**
 * Utility for Time Decihour 8 (0x2B12) characteristic
 */
public class TimeDecihour8Utils {

    /**
     * 0xFF : A value of 0xFF represents ’value is not known’
     */
    public static final int TIME_DECIHOUR_8_VALUE_IS_NOT_KNOWN = 0xFF;

    /**
     * Unit is hour with a resolution of 0.1.
     */
    public static final double TIME_DECIHOUR_8_VALUE_UNIT = 0.1d;

    /**
     * Time Decihour 8 Minimum value
     */
    public static final double TIME_DECIHOUR_8_VALUE_MINIMUM = 0.0d;

    /**
     * Time Decihour 8 Maximum value
     */
    public static final double TIME_DECIHOUR_8_VALUE_MAXIMUM = 24.0;

    /**
     * @param timeDecihour8 Time Decihour 8
     * @return {@code true}:Time Decihour 8 value is not known, {@code false}:has Time Decihour 8 value information
     * @see #TIME_DECIHOUR_8_VALUE_IS_NOT_KNOWN
     */
    public static boolean isTimeDecihour8IsNotKnown(int timeDecihour8) {
        return TIME_DECIHOUR_8_VALUE_IS_NOT_KNOWN == timeDecihour8;
    }

    /**
     * @param timeDecihour8 Time Decihour 8
     * @return Time Decihour 8(hour)
     */
    public static double getTimeDecihour8Hour(int timeDecihour8) {
        double timeDecihour8Hour = timeDecihour8 * TIME_DECIHOUR_8_VALUE_UNIT;
        if (timeDecihour8Hour < TIME_DECIHOUR_8_VALUE_MINIMUM) {
            timeDecihour8Hour = TIME_DECIHOUR_8_VALUE_MINIMUM;
        } else if (timeDecihour8Hour > TIME_DECIHOUR_8_VALUE_MAXIMUM) {
            timeDecihour8Hour = TIME_DECIHOUR_8_VALUE_MAXIMUM;
        }
        return timeDecihour8Hour;
    }

}