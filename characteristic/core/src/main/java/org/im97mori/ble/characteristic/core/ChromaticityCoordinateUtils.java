package org.im97mori.ble.characteristic.core;

/**
 * Utility for Chromaticity Coordinate (0x2B1C) characteristic
 */
public class ChromaticityCoordinateUtils {

    /**
     * Unit is unitless with a resolution of 1/65535
     */
    public static final double CHROMATICITY_COORDINATE_VALUE_UNIT = 1d / 65535d;

    /**
     * Chromaticity Coordinate Minimum value
     */
    public static final double CHROMATICITY_COORDINATE_VALUE_MINIMUM = 0.0d;

    /**
     * Chromaticity Coordinate Maximum value
     */
    public static final double CHROMATICITY_COORDINATE_VALUE_MAXIMUM = 1.0d;

    /**
     * @param ChromaticityCoordinate Chromaticity Coordinate
     * @return Chromaticity Coordinate with Unit
     */
    public static double getChromaticityCoordinateWithUnit(int chromaticityCoordinate) {
        double chromaticityCoordinateWithUnit = chromaticityCoordinate * CHROMATICITY_COORDINATE_VALUE_UNIT;
        if (chromaticityCoordinateWithUnit < CHROMATICITY_COORDINATE_VALUE_MINIMUM) {
            chromaticityCoordinateWithUnit = CHROMATICITY_COORDINATE_VALUE_MINIMUM;
        } else if (chromaticityCoordinateWithUnit > CHROMATICITY_COORDINATE_VALUE_MAXIMUM) {
            chromaticityCoordinateWithUnit = CHROMATICITY_COORDINATE_VALUE_MAXIMUM;
        }
        return chromaticityCoordinateWithUnit;
    }

}