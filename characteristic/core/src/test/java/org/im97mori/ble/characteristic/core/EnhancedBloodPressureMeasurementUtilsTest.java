package org.im97mori.ble.characteristic.core;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EnhancedBloodPressureMeasurementUtilsTest {

    @Test
    public void test_isFlagsUserFacingTimeNotPresent_00001() {
        assertTrue(EnhancedBloodPressureMeasurementUtils.isFlagsUserFacingTimeNotPresent(EnhancedBloodPressureMeasurementUtils.FLAG_USER_FACING_TIME_NOT_PRESENT));
        assertFalse(EnhancedBloodPressureMeasurementUtils.isFlagsUserFacingTimeNotPresent(EnhancedBloodPressureMeasurementUtils.FLAG_USER_FACING_TIME_PRESENT));
    }

    @Test
    public void test_isFlagsUserFacingTimePresent_00001() {
        assertFalse(EnhancedBloodPressureMeasurementUtils.isFlagsUserFacingTimePresent(EnhancedBloodPressureMeasurementUtils.FLAG_USER_FACING_TIME_NOT_PRESENT));
        assertTrue(EnhancedBloodPressureMeasurementUtils.isFlagsUserFacingTimePresent(EnhancedBloodPressureMeasurementUtils.FLAG_USER_FACING_TIME_PRESENT));
    }

}
