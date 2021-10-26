package org.im97mori.ble.characteristic.core;

/**
 * Utility for org.bluetooth.characteristic.time_zone(0x2A0E) characteristic
 */
public class TimeZoneUtils {

	/**
	 * 255(0xff): Time Zone offset is not known
	 */
	public static final int TIME_ZONE_IS_NOT_KNOWN = -128;

	/**
	 * Time Zone unit(min)
	 */
	public static final int TIME_ZONE_UNIT = 15;

	/**
	 * @param timeZone Time Zone value
	 * @return {@code true}:time zone offset is not known, {@code false}:has time
	 *         zone offset information
	 * @see #TIME_ZONE_IS_NOT_KNOWN
	 */
	public static boolean isTimeZoneNotKnown(int timeZone) {
		return TIME_ZONE_IS_NOT_KNOWN == timeZone;
	}

	/**
	 * @param timeZone Time Zone value
	 * @return Time Zone offset(mins)
	 */
	public static int getTimeZoneOffsetMin(int timeZone) {
		return TIME_ZONE_UNIT * timeZone;
	}

}