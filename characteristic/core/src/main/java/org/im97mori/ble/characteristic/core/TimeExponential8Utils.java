package org.im97mori.ble.characteristic.core;

/**
 * Utility for Time Exponential 8 (0x2B13) characteristic
 */
public class TimeExponential8Utils {

    /**
     * 0x00 : A raw value of 0x00 represents 0 seconds
     */
    public static final int TIME_EXPONENTIAL_8_ZERO_SECONDS = 0x00;

    /**
     * 0xFE : A raw value of 0xFE represents the total life of the device
     */
    public static final int TIME_EXPONENTIAL_8_TOTAL_LIFE_OF_THE_DEVICE = 0xFE;

    /**
     * 0xFF : A raw value of 0xFF represents ‘value is not known’
     */
    public static final int TIME_EXPONENTIAL_8_VALUE_IS_NOT_KNOWN = 0xFF;

    /**
     * The time duration is given by the value 1.1 ^ (N–64) in seconds
     */
    public static final double TIME_EXPONENTIAL_8_MANTISSA = 1.1d;

    /**
     * The time duration is given by the value 1.1 ^ (N–64) in seconds
     */
    public static final int TIME_EXPONENTIAL_8_EXPONENT_OFFSET = -64;

    /**
     * @param timeExponential8 Time Exponential 8
     * @return {@code true}:Time Exponential 8 is 0 seconds, {@code false}:Time Exponential 8 is not 0 seconds
     * @see #TIME_EXPONENTIAL_8_ZERO_SECONDS
     */
    public static boolean isTimeExponential8ZeroSeconds(int timeExponential8) {
        return TIME_EXPONENTIAL_8_ZERO_SECONDS == timeExponential8;
    }

    /**
     * @param timeExponential8 Time Exponential 8
     * @return {@code true}:Time Exponential 8 is total life of the device, {@code false}:Time Exponential 8 is not total life of the device
     * @see #TIME_EXPONENTIAL_8_TOTAL_LIFE_OF_THE_DEVICE
     */
    public static boolean isTimeExponential8TotalLifeOfTheDevice(int timeExponential8) {
        return TIME_EXPONENTIAL_8_TOTAL_LIFE_OF_THE_DEVICE == timeExponential8;
    }

    /**
     * @param timeExponential8 Time Exponential 8
     * @return {@code true}:Time Exponential 8 value is not known, {@code false}:has Time Exponential 8 value information
     * @see #TIME_EXPONENTIAL_8_VALUE_IS_NOT_KNOWN
     */
    public static boolean isTimeExponential8ValueIsNotKnown(int timeExponential8) {
        return TIME_EXPONENTIAL_8_VALUE_IS_NOT_KNOWN == timeExponential8;
    }

    /**
     * @param timeExponential8 Time Exponential 8
     * @return Time Exponential 8(second)
     */
    public static int getTimeExponential8Second(int timeExponential8) {
        return (int) Math.floor(Math.pow(TIME_EXPONENTIAL_8_MANTISSA, timeExponential8 + TIME_EXPONENTIAL_8_EXPONENT_OFFSET));
    }

}