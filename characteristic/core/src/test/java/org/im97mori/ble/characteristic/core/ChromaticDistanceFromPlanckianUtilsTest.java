package org.im97mori.ble.characteristic.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ChromaticDistanceFromPlanckianUtilsTest {

    @Test
    public void test_isdistanceFromPlanckianIsNotKnown_00001() {
        assertTrue(ChromaticDistanceFromPlanckianUtils.isdistanceFromPlanckianIsNotKnown(ChromaticDistanceFromPlanckianUtils.DISTANCE_FROM_PLANCKIAN_VALUE_IS_NOT_KNOWN));
    }

    @Test
    public void test_isdistanceFromPlanckianIsNotKnown_00002() {
        assertFalse(ChromaticDistanceFromPlanckianUtils.isdistanceFromPlanckianIsNotKnown(0));
    }

    @Test
    public void test_isdistanceFromPlanckianIsNotValid_00001() {
        assertTrue(ChromaticDistanceFromPlanckianUtils.isdistanceFromPlanckianIsNotValid(ChromaticDistanceFromPlanckianUtils.DISTANCE_FROM_PLANCKIAN_VALUE_IS_NOT_VALID));
    }

    @Test
    public void test_isdistanceFromPlanckianIsNotValid_00002() {
        assertFalse(ChromaticDistanceFromPlanckianUtils.isdistanceFromPlanckianIsNotValid(0));
    }

    @Test
    public void test_getVoltageValueWithUnit_00001() {
        int distanceFromPlanckian = -5001;

        assertEquals(ChromaticDistanceFromPlanckianUtils.DISTANCE_FROM_PLANCKIAN_VALUE_MINIMUM, ChromaticDistanceFromPlanckianUtils.getVoltageValueWithUnit(distanceFromPlanckian), 0);
    }

    @Test
    public void test_getVoltageValueWithUnit_00002() {
        int distanceFromPlanckian = -5000;

        assertEquals(ChromaticDistanceFromPlanckianUtils.DISTANCE_FROM_PLANCKIAN_VALUE_UNIT * distanceFromPlanckian, ChromaticDistanceFromPlanckianUtils.getVoltageValueWithUnit(distanceFromPlanckian), 0);
    }

    @Test
    public void test_getVoltageValueWithUnit_00003() {
        int distanceFromPlanckian = 5001;

        assertEquals(ChromaticDistanceFromPlanckianUtils.DISTANCE_FROM_PLANCKIAN_VALUE_MAXIMUM, ChromaticDistanceFromPlanckianUtils.getVoltageValueWithUnit(distanceFromPlanckian), 0);
    }

    @Test
    public void test_getVoltageValueWithUnit_00004() {
        int distanceFromPlanckian = 5000;

        assertEquals(ChromaticDistanceFromPlanckianUtils.DISTANCE_FROM_PLANCKIAN_VALUE_UNIT * distanceFromPlanckian, ChromaticDistanceFromPlanckianUtils.getVoltageValueWithUnit(distanceFromPlanckian), 0);
    }

}
