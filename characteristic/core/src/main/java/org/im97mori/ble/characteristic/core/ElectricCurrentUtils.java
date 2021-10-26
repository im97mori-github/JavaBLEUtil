package org.im97mori.ble.characteristic.core;

/**
 * Utility for Electric Current(0x2AEE) characteristic
 */
public class ElectricCurrentUtils {

	/**
	 * 0xFFFF : Current value is not known
	 */
	public static final int CURRENT_VALUE_IS_NOT_KNOWN = 0xFFFF;

	/**
	 * Current unit 0.01 ampere
	 */
	public static final double CURRENT_RESOLUTION = 0.01d;

	/**
	 * Current Minimum value
	 */
	public static final double CURRENT_VALUE_MINIMUM = 0.0d;

	/**
	 * Current Maximum value
	 */
	public static final double CURRENT_VALUE_MAXIMUM = 655.34d;

	/**
	 * @param current Current value
	 * @return {@code true}:Current value is not known, {@code false}:has Current
	 *         value information
	 * @see #CURRENT_VALUE_IS_NOT_KNOWN
	 */
	public static boolean isCurrentValueNotKnown(int current) {
		return CURRENT_VALUE_IS_NOT_KNOWN == current;
	}

	/**
	 * @param current Current value
	 * @return Current(ampere)
	 */
	public static double getCurrentAmpere(int current) {
		double currentAmpere = CURRENT_RESOLUTION * current;
		if (currentAmpere < CURRENT_VALUE_MINIMUM) {
			currentAmpere = CURRENT_VALUE_MINIMUM;
		} else if (currentAmpere > CURRENT_VALUE_MAXIMUM) {
			currentAmpere = CURRENT_VALUE_MAXIMUM;
		}
		return currentAmpere;
	}

}