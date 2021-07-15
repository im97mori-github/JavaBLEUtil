package org.im97mori.ble.characteristic.core;

/**
 * Utility for Energy (0x2AF2) characteristic
 */
public class EnergyUtils {

    /**
     * 0xFFFFFF : A value of 0xFFFFFF represents ‘value is not known’
     */
    public static final int ENERGY_VALUE_IS_NOT_KNOWN = 0xFFFFFF;

    /**
     * Energy Minimum value
     */
    public static final int ENERGY_VALUE_MINIMUM = 0;

    /**
     * Energy Maximum value
     */
    public static final int ENERGY_VALUE_MAXIMUM = 16777214;

    /**
     * @param energy Energy
     * @return {@code true}:Energy value is not known, {@code false}:has Energy value information
     * @see #ENERGY_VALUE_IS_NOT_KNOWN
     */
    public static boolean isEnergyValueIsNotKnown(int energy) {
        return ENERGY_VALUE_IS_NOT_KNOWN == energy;
    }

}