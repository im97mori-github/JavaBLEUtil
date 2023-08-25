package org.im97mori.ble.characteristic.core;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class CorrelatedColorTemperatureUtilsTest extends TestBase {

    @Test
    public void test_isCurrentNotKnown_00001() {
        assertTrue(CorrelatedColorTemperatureUtils.isCorrelatedColorTemperatureValueNotKnown(CorrelatedColorTemperatureUtils.CORRELATED_COLOR_TEMPERATURE_VALUE_IS_NOT_KNOWN));
    }

    @Test
    public void test_isCurrentNotKnown_00002() {
        assertFalse(CorrelatedColorTemperatureUtils.isCorrelatedColorTemperatureValueNotKnown(CorrelatedColorTemperatureUtils.CORRELATED_COLOR_TEMPERATURE_VALUE_MINIMUM));
    }

    @Test
    public void test_isCurrentNotKnown_00003() {
        assertFalse(CorrelatedColorTemperatureUtils.isCorrelatedColorTemperatureValueNotKnown(CorrelatedColorTemperatureUtils.CORRELATED_COLOR_TEMPERATURE_VALUE_MAXIMUM));
    }

}
