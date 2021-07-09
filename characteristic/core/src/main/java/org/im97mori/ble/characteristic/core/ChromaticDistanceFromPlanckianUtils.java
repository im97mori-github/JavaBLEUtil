package org.im97mori.ble.characteristic.core;

/**
 * Utility for Chromatic Distance From Planckian (0x2AE3) characteristic
 */
public class ChromaticDistanceFromPlanckianUtils {

    /**
     * 0xFFFF : A raw value of 0xFFFF represents ‘value is not known’
     */
    public static final int DISTANCE_FROM_PLANCKIAN_VALUE_IS_NOT_KNOWN = 0xFFFF;

    /**
     * 0xFFFE : A raw value of 0xFFFE represents ‘value is not valid
     */
    public static final int DISTANCE_FROM_PLANCKIAN_VALUE_IS_NOT_VALID = 0xFFFE;

    /**
     * Unit is unitless with a resolution of 0.00001
     */
    public static final double DISTANCE_FROM_PLANCKIAN_VALUE_UNIT = 0.00001d;

    /**
     * Distance From Planckian Minimum value
     */
    public static final double DISTANCE_FROM_PLANCKIAN_VALUE_MINIMUM = -0.05d;

    /**
     * Distance From Planckian Maximum value
     */
    public static final double DISTANCE_FROM_PLANCKIAN_VALUE_MAXIMUM = 0.05;

    /**
     * @param distanceFromPlanckian Distance From Planckian
     * @return {@code true}:Distance From Planckian is not known, {@code false}:has Distance From Planckian information
     * @see #DISTANCE_FROM_PLANCKIAN_VALUE_IS_NOT_KNOWN
     */
    public static boolean isdistanceFromPlanckianIsNotKnown(int distanceFromPlanckian) {
        return DISTANCE_FROM_PLANCKIAN_VALUE_IS_NOT_KNOWN == distanceFromPlanckian;
    }

    /**
     * @param distanceFromPlanckian Distance From Planckian
     * @return {@code true}:Distance From Planckian is not known, {@code false}:has Distance From Planckian information
     * @see #DISTANCE_FROM_PLANCKIAN_VALUE_IS_NOT_VALID
     */
    public static boolean isdistanceFromPlanckianIsNotValid(int distanceFromPlanckian) {
        return DISTANCE_FROM_PLANCKIAN_VALUE_IS_NOT_VALID == distanceFromPlanckian;
    }

    /**
     * @param distanceFromPlanckian Distance From Planckian
     * @return Distance From Planckian(volt)
     */
    public static double getVoltageValueWithUnit(int distanceFromPlanckian) {
        double distanceFromPlanckianWithUnit = distanceFromPlanckian * DISTANCE_FROM_PLANCKIAN_VALUE_UNIT;
        if (distanceFromPlanckianWithUnit < DISTANCE_FROM_PLANCKIAN_VALUE_MINIMUM) {
            distanceFromPlanckianWithUnit = DISTANCE_FROM_PLANCKIAN_VALUE_MINIMUM;
        } else if (distanceFromPlanckianWithUnit > DISTANCE_FROM_PLANCKIAN_VALUE_MAXIMUM) {
            distanceFromPlanckianWithUnit = DISTANCE_FROM_PLANCKIAN_VALUE_MAXIMUM;
        }
        return distanceFromPlanckianWithUnit;
    }

}