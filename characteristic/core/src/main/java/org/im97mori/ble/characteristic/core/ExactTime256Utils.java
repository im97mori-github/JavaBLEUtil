package org.im97mori.ble.characteristic.core;

/**
 * Utility for org.bluetooth.characteristic.exact_time_256(0x2A0C) characteristic
 */
public class ExactTime256Utils {

    /**
     * 0: device does not support the 1/256th of seconds
     */
    public static final int FRACTIONS_256_NOT_SUPPORTED = 0;

    /**
     * 1/256th of a second
     */
    public static final double FRACTIONS_256_UNIT = 1 / 256d;

    /**
     * @param fractions256 Fractions256
     * @return {@code true}:device does not support the 1/256th of seconds, {@code false}:device supports the 1/256th of seconds
     * @see #FRACTIONS_256_NOT_SUPPORTED
     */
    public static boolean isFractions256Supported(int fractions256) {
        return FRACTIONS_256_NOT_SUPPORTED == fractions256;
    }

    /**
     * @param fractions256 Fractions256
     * @return Fractions256 with Unit
     * @see #FRACTIONS_256_UNIT
     */
    public static double getFractions256WithUnit(int fractions256) {
        return FRACTIONS_256_UNIT * fractions256;
    }

    /**
     * @param fractions256 Fractions256
     * @return Fraction256(millis)
     */
    public static long getFractions256Millis(int fractions256) {
        return (long) (getFractions256WithUnit(fractions256) * 1000L);
    }

}