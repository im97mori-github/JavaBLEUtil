package org.im97mori.ble.characteristic.core;

/**
 * Utility for Count 16 (0x2AEA) characteristic
 */
public class Count16Utils {

    /**
     * 0xFFFF : A raw value of 0xFF represents ‘value is not known’
     */
    public static final int COUNT_IS_NOT_KNOWN = 0xFFFF;

    /**
     * Count Minimum value
     */
    public static final int COUNT_VALUE_MINIMUM = 0;

    /**
     * Count Maximum value
     */
    public static final int COUNT_VALUE_MAXIMUM = 65534;

    /**
     * @param count Count
     * @return {@code true}:Count value is not known, {@code false}:has Count value information
     * @see #COUNT_IS_NOT_KNOWN
     */
    public static boolean isCountValueIsNotKnown(int count) {
        return COUNT_IS_NOT_KNOWN == count;
    }

}