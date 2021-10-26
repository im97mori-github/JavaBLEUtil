package org.im97mori.ble.characteristic.core;

/**
 * Utility for org.bluetooth.unit.thermodynamic_temperature(0x2AE9)
 * characteristic
 */
public class CorrelatedColorTemperatureUtils {

	/**
	 * 0xFFFF : Correlated Color Temperature value is not known
	 */
	public static final int CORRELATED_COLOR_TEMPERATURE_VALUE_IS_NOT_KNOWN = 0xFFFF;

	/**
	 * Correlated Color Temperature Minimum value
	 */
	public static final int CORRELATED_COLOR_TEMPERATURE_VALUE_MINIMUM = 800;

	/**
	 * Correlated Color Temperature Maximum value
	 */
	public static final int CORRELATED_COLOR_TEMPERATURE_VALUE_MAXIMUM = 65534;

	/**
	 * @param correlatedColorTemperature Correlated Color Temperature value
	 * @return {@code true}:Correlated Color Temperature value is not known,
	 *         {@code false}:has Correlated Color Temperature value information
	 * @see #CORRELATED_COLOR_TEMPERATURE_VALUE_IS_NOT_KNOWN
	 */
	public static boolean isCorrelatedColorTemperatureValueNotKnown(int correlatedColorTemperature) {
		return CORRELATED_COLOR_TEMPERATURE_VALUE_IS_NOT_KNOWN == correlatedColorTemperature;
	}

}