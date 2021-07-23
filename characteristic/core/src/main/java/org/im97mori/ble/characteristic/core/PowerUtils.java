package org.im97mori.ble.characteristic.core;

/**
 * Utility for Power (0x2B05) characteristic
 */
public class PowerUtils {

    /**
     * 0xFFFFFF : A raw value of 0xFFFFFF represents ‘value is not known’
     */
    public static final int POWER_VALUE_IS_NOT_KNOWN = 0xFFFFFF;

    /**
     * Unit is watt  with a resolution of 0.1
     */
    public static final double POWER_VALUE_UNIT = 0.1d;

    /**
     * Power Minimum value
     */
    public static final double POWER_VALUE_MINIMUM = 0.0d;

    /**
     * Power Maximum value
     */
    public static final double POWER_VALUE_MAXIMUM = 1677721.4d;

    /**
     * @param power Power
     * @return {@code true}:Power value is not known, {@code false}:has Power value information
     * @see #POWER_VALUE_IS_NOT_KNOWN
     */
    public static boolean isPowerValueIsNotKnown(int power) {
        return POWER_VALUE_IS_NOT_KNOWN == power;
    }

    /**
     * @param power Power
     * @return Power(watt)
     */
    public static double getPowerWatt(int power) {
        double powerWatt = power * POWER_VALUE_UNIT;
        if (powerWatt < POWER_VALUE_MINIMUM) {
            powerWatt = POWER_VALUE_MINIMUM;
        } else if (powerWatt > POWER_VALUE_MAXIMUM) {
            powerWatt = POWER_VALUE_MAXIMUM;
        }
        return powerWatt;
    }

}