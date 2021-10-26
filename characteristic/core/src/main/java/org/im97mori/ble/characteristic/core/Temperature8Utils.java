package org.im97mori.ble.characteristic.core;

/**
 * Utility for Temperature 8(0x2B0D) characteristic
 */
public class Temperature8Utils {

	/**
	 * 0x7F : Temperature 8 value is not known
	 */
	public static final int TEMPERATURE_8_VALUE_IS_NOT_KNOWN = 0x7F;

	/**
	 * Temperature 8 unit 0.5 degree Celsius
	 */
	public static final double TEMPERATURE_8_RESOLUTION = 0.5d;

	/**
	 * Temperature 8 Minimum value
	 */
	public static final double TEMPERATURE_8_VALUE_MINIMUM = -64.0d;

	/**
	 * Temperature 8 Maximum value
	 */
	public static final double TEMPERATURE_8_VALUE_MAXIMUM = 63.0d;

	/**
	 * @param temperature8 Temperature 8 value
	 * @return {@code true}:Temperature 8 value is not known, {@code false}:has
	 *         Temperature 8 value information
	 * @see #TEMPERATURE_8_VALUE_IS_NOT_KNOWN
	 */
	public static boolean isTemperature8ValueNotKnown(int temperature8) {
		return TEMPERATURE_8_VALUE_IS_NOT_KNOWN == temperature8;
	}

	/**
	 * @param temperature8 Temperature 8 value
	 * @return Temperature 8(celsius)
	 */
	public static double getTemperature8Celsius(int temperature8) {
		double temperature8Celsius = TEMPERATURE_8_RESOLUTION * temperature8;
		if (temperature8Celsius < TEMPERATURE_8_VALUE_MINIMUM) {
			temperature8Celsius = TEMPERATURE_8_VALUE_MINIMUM;
		} else if (temperature8Celsius > TEMPERATURE_8_VALUE_MAXIMUM) {
			temperature8Celsius = TEMPERATURE_8_VALUE_MAXIMUM;
		}
		return temperature8Celsius;
	}

}