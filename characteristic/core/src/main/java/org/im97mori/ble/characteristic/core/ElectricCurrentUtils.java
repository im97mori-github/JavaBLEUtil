package org.im97mori.ble.characteristic.core;

/**
 * Utility for Electric Current(0x2AEE) characteristic
 */
public class ElectricCurrentUtils {

    /**
     * 0xffff : Current value is not known
     */
    public static final int CURRENT_VALUE_IS_NOT_KNOWN = 0xffff;

    /**
     * Current unit 0.01 ampere
     */
    public static final double CURRENT_RESOLUTION = 0.01d;

    /**
     * @return {@code true}:Current value is not known, {@code false}:has Current value information
     * @see #CURRENT_VALUE_IS_NOT_KNOWN
     */
    public static boolean isCurrentValueNotKnown(int current) {
        return CURRENT_VALUE_IS_NOT_KNOWN == current;
    }

    /**
     * @return Current(ampere)
     */
    public static double getCurrentAmpere(int current) {
        return CURRENT_RESOLUTION * current;
    }

}