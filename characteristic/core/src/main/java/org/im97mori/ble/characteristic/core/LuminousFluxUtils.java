package org.im97mori.ble.characteristic.core;

/**
 * Utility for Luminous Flux (0x2AFF) characteristic
 */
public class LuminousFluxUtils {

    /**
     * 0xFFFF : A value of 0xFFFF represents ‘value is not known’
     */
    public static final int LUMINOUS_FLUX_VALUE_IS_NOT_KNOWN = 0xFFFF;

    /**
     * Luminous Flux Minimum value
     */
    public static final int LUMINOUS_FLUX_VALUE_MINIMUM = 0;

    /**
     * Luminous Flux Maximum value
     */
    public static final int LUMINOUS_FLUX_VALUE_MAXIMUM = 65534;

    /**
     * @param luminousFlux Luminous Flux
     * @return {@code true}:Luminous Flux value is not known, {@code false}:has Luminous Flux value information
     * @see #ENERGY_VALUE_IS_NOT_KNOWN
     */
    public static boolean isLuminousFluxValueIsNotKnown(int luminousFlux) {
        return LUMINOUS_FLUX_VALUE_IS_NOT_KNOWN == luminousFlux;
    }

}