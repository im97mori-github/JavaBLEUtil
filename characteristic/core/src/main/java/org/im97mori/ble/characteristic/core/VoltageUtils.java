package org.im97mori.ble.characteristic.core;

/**
 * Utility for Voltage (0x2B18) characteristic
 */
public class VoltageUtils {

    /**
     * 0xFF : A raw value of 0xFF represents ‘value is not known’
     */
    public static final int VOLTAGE_VALUE_IS_NOT_KNOWN = 0xFFFF;

    /**
     * Unit is volt with a resolution of 1/64V
     */
    public static final double VOLTAGE_VALUE_UNIT = 1d / 64d;

    /**
     * Voltage Minimum value
     */
    public static final double VOLTAGE_VALUE_MINIMUM = 0.0d;

    /**
     * Voltage Maximum value
     */
    public static final double VOLTAGE_VALUE_MAXIMUM = 1022.0d;

    /**
     * @param voltageValue Voltage Value
     * @return {@code true}Voltage value is not known, {@code false}:hasVoltage value information
     * @see #VOLTAGE_VALUE_IS_NOT_KNOWN
     */
    public static boolean isVoltageValueIsNotKnown(int voltageValue) {
        return VOLTAGE_VALUE_IS_NOT_KNOWN == voltageValue;
    }

    /**
     * @param voltageValue Voltage Value
     * @return Voltage Value(volt)
     */
    public static double getVoltageValueVolt(int voltageValue) {
        double voltageValueVolt = voltageValue * VOLTAGE_VALUE_UNIT;
        if (voltageValueVolt < VOLTAGE_VALUE_MINIMUM) {
            voltageValueVolt = VOLTAGE_VALUE_MINIMUM;
        } else if (voltageValueVolt > VOLTAGE_VALUE_MAXIMUM) {
            voltageValueVolt = VOLTAGE_VALUE_MAXIMUM;
        }
        return voltageValueVolt;
    }

}