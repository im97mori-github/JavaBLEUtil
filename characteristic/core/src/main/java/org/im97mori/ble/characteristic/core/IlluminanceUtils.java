package org.im97mori.ble.characteristic.core;

/**
 * Utility for Illuminance (0x2AFB) characteristic
 */
public class IlluminanceUtils {

    /**
     * 0xFFFFFF : A raw value of 0xFFFFFF represents ‘value is not known’
     */
    public static final int ILLUMINANCE_VALUE_IS_NOT_KNOWN = 0xFFFFFF;

    /**
     * Unit is lux with a resolution of 0.01
     */
    public static final double ILLUMINANCE_VALUE_UNIT = 0.01d;

    /**
     * Illuminance Minimum value
     */
    public static final double ILLUMINANCE_VALUE_MINIMUM = 0.0d;

    /**
     * Illuminance Maximum value
     */
    public static final double ILLUMINANCE_VALUE_MAXIMUM = 167772.14d;

    /**
     * @param illuminance Illuminance
     * @return {@code true}:Illuminance value is not known, {@code false}:has Illuminance value information
     * @see #ILLUMINANCE_VALUE_IS_NOT_KNOWN
     */
    public static boolean isIlluminanceValueIsNotKnown(int illuminance) {
        return ILLUMINANCE_VALUE_IS_NOT_KNOWN == illuminance;
    }

    /**
     * @param illuminance Illuminance
     * @return Illuminance(lux)
     */
    public static double getIlluminanceLux(int illuminance) {
        double illuminanceLux = illuminance * ILLUMINANCE_VALUE_UNIT;
        if (illuminanceLux < ILLUMINANCE_VALUE_MINIMUM) {
            illuminanceLux = ILLUMINANCE_VALUE_MINIMUM;
        } else if (illuminanceLux > ILLUMINANCE_VALUE_MAXIMUM) {
            illuminanceLux = ILLUMINANCE_VALUE_MAXIMUM;
        }
        return illuminanceLux;
    }

}