package org.im97mori.ble.characteristic.core;

/**
 * Utility for Enhanced Blood Pressure Measurement (0x2B34) characteristic
 */
public class EnhancedBloodPressureMeasurementUtils extends BloodPressureMeasurementUtils {

    /**
     * @see #FLAG_USER_FACING_TIME_NOT_PRESENT
     * @see #FLAG_USER_FACING_TIME_PRESENT
     */
    public static final int FLAG_USER_FACING_TIME_MASK = 0b00100000;

    /**
     * 0: User Facing Time not present
     */
    public static final int FLAG_USER_FACING_TIME_NOT_PRESENT = 0b00000000;

    /**
     * 1: User Facing Time present
     */
    public static final int FLAG_USER_FACING_TIME_PRESENT = 0b00100000;

    /**
     * @see #FLAG_EPOCH_START_IS_JANUARY_1_1900
     * @see #FLAG_EPOCH_START_IS_JANUARY_1_2000
     */
    public static final int FLAG_EPOCH_START_2000_MASK = 0b01000000;

    /**
     * 0: Epoch start is January 1, 1900 (00:00:00)
     */
    public static final int FLAG_EPOCH_START_IS_JANUARY_1_1900 = 0b00000000;

    /**
     * 1: Epoch start is January 1, 2000 (00:00:00)
     */
    public static final int FLAG_EPOCH_START_IS_JANUARY_1_2000 = 0b01000000;

    /**
     * @param flags Flags
     * @return {@code true}:User Facing Time Flag not present, {@code false}:User
     *         Facing Time Flag present
     */
    public static boolean isFlagsUserFacingTimeNotPresent(int flags) {
        return isFlagsMatched(FLAG_USER_FACING_TIME_MASK, FLAG_USER_FACING_TIME_NOT_PRESENT, flags);
    }

    /**
     * @param flags Flags
     * @return {@code true}User Facing Time Flag present, {@code false}:User Facing
     *         Time Flag not present
     */
    public static boolean isFlagsUserFacingTimePresent(int flags) {
        return isFlagsMatched(FLAG_USER_FACING_TIME_MASK, FLAG_USER_FACING_TIME_PRESENT, flags);
    }

    /**
     * @param flags Flags
     * @return {@code true}:Epoch start is January 1, 1900 (00:00:00),
     *         {@code false}:Epoch start is January 1, 2000 (00:00:00)
     */
    public static boolean isFlagsEpochStart1900(int flags) {
        return isFlagsMatched(FLAG_USER_FACING_TIME_MASK, FLAG_EPOCH_START_IS_JANUARY_1_1900, flags);
    }

    /**
     * @param flags Flags
     * @return {@code true}:Epoch start is January 1, 2000 (00:00:00) ,
     *         {@code false}:Epoch start is January 1, 1900 (00:00:00)
     */
    public static boolean isFlagsEpochStart2000(int flags) {
        return isFlagsMatched(FLAG_EPOCH_START_2000_MASK, FLAG_EPOCH_START_IS_JANUARY_1_2000, flags);
    }

}
