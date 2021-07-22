package org.im97mori.ble.characteristic.core;

/**
 * Utility for Percentage 8 (0x2B04) characteristic
 */
public class Percentage8Utils {

    /**
     * 0xFF : A raw value of 0xFF represents ‘value is not known’
     */
    public static final int PERCENTAGE_8_VALUE_IS_NOT_KNOWN = 0xFF;

    /**
     * Unit is volt with a resolution of 1/64V
     */
    public static final double PERCENTAGE_8_VALUE_UNIT = 0.5d;

    /**
     * Voltage Minimum value
     */
    public static final double PERCENTAGE_8_VALUE_MINIMUM = 0d;

    /**
     * Voltage Maximum value
     */
    public static final double PERCENTAGE_8_VALUE_MAXIMUM = 100d;

    /**
     * @param percentage8 Percentage 8
     * @return {@code true}:Percentage 8 value is not known, {@code false}:has Percentage 8 value information
     * @see #PERCENTAGE_8_VALUE_IS_NOT_KNOWN
     */
    public static boolean isPercentage8IsNotKnown(int percentage8) {
        return PERCENTAGE_8_VALUE_IS_NOT_KNOWN == percentage8;
    }

    /**
     * @param percentage8 Percentage 8
     * @return Percentage 8 with unit
     */
    public static double getPercentage8WithUnit(int percentage8) {
        double percentage8WithUnit = percentage8 * PERCENTAGE_8_VALUE_UNIT;
        if (percentage8WithUnit < PERCENTAGE_8_VALUE_MINIMUM) {
            percentage8WithUnit = PERCENTAGE_8_VALUE_MINIMUM;
        } else if (percentage8WithUnit > PERCENTAGE_8_VALUE_MAXIMUM) {
            percentage8WithUnit = PERCENTAGE_8_VALUE_MAXIMUM;
        }
        return percentage8WithUnit;
    }

}