package org.im97mori.ble.characteristic.core;

/**
 * Utility for Temperature(0x2A6E) characteristic
 */
public class TemperatureUtils {

    /**
     * 0x8000 : Temperature value is not known
     */
    public static final int TEMPERATURE_VALUE_IS_NOT_KNOWN = 0x8000;

    /**
<<<<<<< HEAD
     * Temperature unit 0.01 degrees Celsius
=======
     * Temperature unit 0.01 ampere
>>>>>>> branch 'master' of git@github.com:im97mori-github/JavaBLEUtil.git
     */
    public static final double TEMPERATURE_RESOLUTION = 0.01d;

    /**
     * Temperature Minimum value
     */
    public static final double TEMPERATURE_VALUE_MINIMUM =  -273.15d;

    /**
     * Temperature Maximum value
     */
    public static final double TEMPERATURE_VALUE_MAXIMUM = 327.67d;

    /**
     * @return {@code true}:Temperature value is not known, {@code false}:has Temperature value information
     * @see #TEMPERATURE_VALUE_IS_NOT_KNOWN
     */
    public static boolean isTemperatureValueNotKnown(int temperature) {
        return TEMPERATURE_VALUE_IS_NOT_KNOWN == temperature;
    }

    /**
     * @return Temperature(celsius)
     */
    public static double getTemperatureCelsius(int temperature) {
        double temperatureCelsius = TEMPERATURE_RESOLUTION * temperature;
        if (temperatureCelsius < TEMPERATURE_VALUE_MINIMUM) {
            temperatureCelsius = TEMPERATURE_VALUE_MINIMUM;
        } else if (temperatureCelsius > TEMPERATURE_VALUE_MAXIMUM) {
            temperatureCelsius = TEMPERATURE_VALUE_MAXIMUM;
        }
        return temperatureCelsius;
    }

}