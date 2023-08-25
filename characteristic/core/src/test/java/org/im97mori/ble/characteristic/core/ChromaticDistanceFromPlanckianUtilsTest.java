package org.im97mori.ble.characteristic.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class ChromaticDistanceFromPlanckianUtilsTest extends TestBase {

    @Test
    public void test_isDistanceFromPlanckianIsNotKnown_00001() {
        assertTrue(ChromaticDistanceFromPlanckianUtils.isDistanceFromPlanckianIsNotKnown(ChromaticDistanceFromPlanckianUtils.DISTANCE_FROM_PLANCKIAN_VALUE_IS_NOT_KNOWN));
    }

    @Test
    public void test_isDistanceFromPlanckianIsNotKnown_00002() {
        assertFalse(ChromaticDistanceFromPlanckianUtils.isDistanceFromPlanckianIsNotKnown(0));
    }

    @Test
    public void test_isDistanceFromPlanckianIsNotValid_00001() {
        assertTrue(ChromaticDistanceFromPlanckianUtils.isDistanceFromPlanckianIsNotValid(ChromaticDistanceFromPlanckianUtils.DISTANCE_FROM_PLANCKIAN_VALUE_IS_NOT_VALID));
    }

    @Test
    public void test_isDistanceFromPlanckianIsNotValid_00002() {
        assertFalse(ChromaticDistanceFromPlanckianUtils.isDistanceFromPlanckianIsNotValid(0));
    }

    @Test
    public void test_getVoltageValueWithUnit_00001() {
        int distanceFromPlanckian = -5001;

        assertEquals(ChromaticDistanceFromPlanckianUtils.DISTANCE_FROM_PLANCKIAN_VALUE_MINIMUM, ChromaticDistanceFromPlanckianUtils.getDistanceFromPlanckianWithUnit(distanceFromPlanckian), 0);
    }

    @Test
    public void test_getVoltageValueWithUnit_00002() {
        int distanceFromPlanckian = -5000;

        assertEquals(ChromaticDistanceFromPlanckianUtils.DISTANCE_FROM_PLANCKIAN_VALUE_UNIT * distanceFromPlanckian, ChromaticDistanceFromPlanckianUtils.getDistanceFromPlanckianWithUnit(distanceFromPlanckian), 0);
    }

    @Test
    public void test_getVoltageValueWithUnit_00003() {
        int distanceFromPlanckian = 5001;

        assertEquals(ChromaticDistanceFromPlanckianUtils.DISTANCE_FROM_PLANCKIAN_VALUE_MAXIMUM, ChromaticDistanceFromPlanckianUtils.getDistanceFromPlanckianWithUnit(distanceFromPlanckian), 0);
    }

    @Test
    public void test_getVoltageValueWithUnit_00004() {
        int distanceFromPlanckian = 5000;

        assertEquals(ChromaticDistanceFromPlanckianUtils.DISTANCE_FROM_PLANCKIAN_VALUE_UNIT * distanceFromPlanckian, ChromaticDistanceFromPlanckianUtils.getDistanceFromPlanckianWithUnit(distanceFromPlanckian), 0);
    }

}
