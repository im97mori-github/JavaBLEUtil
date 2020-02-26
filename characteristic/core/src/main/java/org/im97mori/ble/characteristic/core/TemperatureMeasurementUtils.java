package org.im97mori.ble.characteristic.core;

public class TemperatureMeasurementUtils {

    /**
     * @see #FLAGS_TEMPERATURE_UNITS_CELSIUS
     * @see #FLAGS_TEMPERATURE_UNITS_FAHRENHEIT
     */
    public static final int FLAGS_TEMPERATURE_UNITS_MASK = 0b00000001;

    /**
     * 0: Temperature Measurement Value in units of Celsius
     */
    public static final int FLAGS_TEMPERATURE_UNITS_CELSIUS = 0b00000000;

    /**
     * 1: Temperature Measurement Value in units of Fahrenheit
     */
    public static final int FLAGS_TEMPERATURE_UNITS_FAHRENHEIT = 0b00000001;

    /**
     * @see #FLAGS_TIME_STAMP_NOT_PRESENT
     * @see #FLAGS_TIME_STAMP_PRESENT
     */
    public static final int FLAGS_TIME_STAMP_MASK = 0b00000010;

    /**
     * 0: Time Stamp field not present
     */
    public static final int FLAGS_TIME_STAMP_NOT_PRESENT = 0b00000000;

    /**
     * 1: Time Stamp field present
     */
    public static final int FLAGS_TIME_STAMP_PRESENT = 0b00000010;

    /**
     * @see #FLAGS_TEMPERATURE_TYPE_NOT_PRESENT
     * @see #FLAGS_TEMPERATURE_TYPE_PRESENT
     */
    public static final int FLAGS_TEMPERATURE_TYPE_MASK = 0b00000100;

    /**
     * 0: Temperature Type field not present
     */
    public static final int FLAGS_TEMPERATURE_TYPE_NOT_PRESENT = 0b00000000;

    /**
     * 1: Temperature Type field present
     */
    public static final int FLAGS_TEMPERATURE_TYPE_PRESENT = 0b00000100;

    /**
     * @param flags Flags
     * @return {@code true}:Temperature Measurement Value in units of Celsius, {@code false}:Temperature Measurement Value in units of Fahrenheit
     */
    public static boolean isFlagsTemperatureUnitsCelsius(int flags) {
        return isFlagsMatched(FLAGS_TEMPERATURE_UNITS_MASK, FLAGS_TEMPERATURE_UNITS_CELSIUS, flags);
    }

    /**
     * @param flags Flags
     * @return {@code true}:Temperature Measurement Value in units of Fahrenheit, {@code false}:Temperature Measurement Value in units of Celsius
     */
    public static boolean isFlagsTemperatureUnitsFahrenheit(int flags) {
        return isFlagsMatched(FLAGS_TEMPERATURE_UNITS_MASK, FLAGS_TEMPERATURE_UNITS_FAHRENHEIT, flags);
    }

    /**
     * @param flags Flags
     * @return {@code true}:Time Stamp field not present, {@code false}:Time Stamp field present
     */
    public static boolean isFlagsTimeStampNotPresent(int flags) {
        return isFlagsMatched(FLAGS_TIME_STAMP_MASK, FLAGS_TIME_STAMP_NOT_PRESENT, flags);
    }

    /**
     * @param flags Flags
     * @return {@code true}:Time Stamp field present, {@code false}:Time Stamp field not present
     */
    public static boolean isFlagsTimeStampPresent(int flags) {
        return isFlagsMatched(FLAGS_TIME_STAMP_MASK, FLAGS_TIME_STAMP_PRESENT, flags);
    }

    /**
     * @param flags Flags
     * @return {@code true}:Temperature Type field not present, {@code false}:Temperature Type field present
     */
    public static boolean isFlagsTemperatureTypeNotPresent(int flags) {
        return isFlagsMatched(FLAGS_TEMPERATURE_TYPE_MASK, FLAGS_TEMPERATURE_TYPE_NOT_PRESENT, flags);
    }

    /**
     * @param flags Flags
     * @return {@code true}:Temperature Type field present, {@code false}:Temperature Type field not present
     */
    public static boolean isFlagsTemperatureTypePresent(int flags) {
        return isFlagsMatched(FLAGS_TEMPERATURE_TYPE_MASK, FLAGS_TEMPERATURE_TYPE_PRESENT, flags);
    }

    /**
     * check Flags
     *
     * @param mask   bitmask for expect
     * @param expect one of {@link #FLAGS_TEMPERATURE_UNITS_CELSIUS} , {@link #FLAGS_TEMPERATURE_UNITS_FAHRENHEIT} , {@link #FLAGS_TIME_STAMP_NOT_PRESENT} , {@link #FLAGS_TIME_STAMP_PRESENT} , {@link #FLAGS_TEMPERATURE_TYPE_NOT_PRESENT} , {@link #FLAGS_TEMPERATURE_TYPE_PRESENT}
     * @param flags  Flags
     * @return {@code true}:same as expect, {@code false}:not match
     */
    private static boolean isFlagsMatched(int mask, int expect, int flags) {
        return (mask & flags) == expect;
    }

}
