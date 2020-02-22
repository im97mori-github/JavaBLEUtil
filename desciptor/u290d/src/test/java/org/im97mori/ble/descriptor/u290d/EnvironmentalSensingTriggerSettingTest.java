package org.im97mori.ble.descriptor.u290d;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EnvironmentalSensingTriggerSettingTest {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] value = new byte[1];
        value[ 0] = 0x01;
        //@formatter:on


        EnvironmentalSensingTriggerSetting result = new EnvironmentalSensingTriggerSetting(value);
        assertEquals(0x01, result.getConditions());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] value = new byte[1];
        value[ 0] = (byte) EnvironmentalSensingTriggerSetting.CONDITIONS_TRIGGER_INACTIVE;
        //@formatter:on

        EnvironmentalSensingTriggerSetting result = new EnvironmentalSensingTriggerSetting(value);
        assertTrue(result.isConditionsTriggerInactive());
        assertFalse(result.isConditionsTriggerUsedAFixedTimeIntervalBetweenTransmissions());
        assertFalse(result.isConditionsTriggerNoLessThanTheSpecifiedTimeBetweenTransmissions());
        assertFalse(result.isConditionsTriggerWhenValueChangesComparedToPreviousValue());
        assertFalse(result.isConditionsTriggerWhileLessThanTheSpecifiedValue());
        assertFalse(result.isConditionsTriggerWhileLessThanOrEqualToTheSpecifiedValue());
        assertFalse(result.isConditionsTriggerWhileGreaterThanTheSpecifiedValue());
        assertFalse(result.isConditionsTriggerWhileGreaterThanOrEqualToTheSpecifiedValue());
        assertFalse(result.isConditionsTriggerWhileEqualToTheSpecifiedValue());
        assertFalse(result.isConditionsTriggerWhileNotEqualToTheSpecifiedValue());
    }

    @Test
    public void test_constructor003() {
        //@formatter:off
        byte[] value = new byte[1];
        value[ 0] = (byte) EnvironmentalSensingTriggerSetting.CONDITIONS_TRIGGER_USE_A_FIXED_TIME_INTERVAL_BETWEEN_TRANSMISSIONS;
        //@formatter:on

        EnvironmentalSensingTriggerSetting result = new EnvironmentalSensingTriggerSetting(value);
        assertFalse(result.isConditionsTriggerInactive());
        assertTrue(result.isConditionsTriggerUsedAFixedTimeIntervalBetweenTransmissions());
        assertFalse(result.isConditionsTriggerNoLessThanTheSpecifiedTimeBetweenTransmissions());
        assertFalse(result.isConditionsTriggerWhenValueChangesComparedToPreviousValue());
        assertFalse(result.isConditionsTriggerWhileLessThanTheSpecifiedValue());
        assertFalse(result.isConditionsTriggerWhileLessThanOrEqualToTheSpecifiedValue());
        assertFalse(result.isConditionsTriggerWhileGreaterThanTheSpecifiedValue());
        assertFalse(result.isConditionsTriggerWhileGreaterThanOrEqualToTheSpecifiedValue());
        assertFalse(result.isConditionsTriggerWhileEqualToTheSpecifiedValue());
        assertFalse(result.isConditionsTriggerWhileNotEqualToTheSpecifiedValue());
    }

    @Test
    public void test_constructor004() {
        //@formatter:off
        byte[] value = new byte[1];
        value[ 0] = (byte) EnvironmentalSensingTriggerSetting.CONDITIONS_TRIGGER_NO_LESS_THAN_THE_SPECIFIED_TIME_BETWEEN_TRANSMISSIONS;
        //@formatter:on

        EnvironmentalSensingTriggerSetting result = new EnvironmentalSensingTriggerSetting(value);
        assertFalse(result.isConditionsTriggerInactive());
        assertFalse(result.isConditionsTriggerUsedAFixedTimeIntervalBetweenTransmissions());
        assertTrue(result.isConditionsTriggerNoLessThanTheSpecifiedTimeBetweenTransmissions());
        assertFalse(result.isConditionsTriggerWhenValueChangesComparedToPreviousValue());
        assertFalse(result.isConditionsTriggerWhileLessThanTheSpecifiedValue());
        assertFalse(result.isConditionsTriggerWhileLessThanOrEqualToTheSpecifiedValue());
        assertFalse(result.isConditionsTriggerWhileGreaterThanTheSpecifiedValue());
        assertFalse(result.isConditionsTriggerWhileGreaterThanOrEqualToTheSpecifiedValue());
        assertFalse(result.isConditionsTriggerWhileEqualToTheSpecifiedValue());
        assertFalse(result.isConditionsTriggerWhileNotEqualToTheSpecifiedValue());
    }

    @Test
    public void test_constructor005() {
        //@formatter:off
        byte[] value = new byte[1];
        value[ 0] = (byte) EnvironmentalSensingTriggerSetting.CONDITIONS_TRIGGER_WHEN_VALUE_CHANGES_COMPARED_TO_PREVIOUS_VALUE;
        //@formatter:on

        EnvironmentalSensingTriggerSetting result = new EnvironmentalSensingTriggerSetting(value);
        assertFalse(result.isConditionsTriggerInactive());
        assertFalse(result.isConditionsTriggerUsedAFixedTimeIntervalBetweenTransmissions());
        assertFalse(result.isConditionsTriggerNoLessThanTheSpecifiedTimeBetweenTransmissions());
        assertTrue(result.isConditionsTriggerWhenValueChangesComparedToPreviousValue());
        assertFalse(result.isConditionsTriggerWhileLessThanTheSpecifiedValue());
        assertFalse(result.isConditionsTriggerWhileLessThanOrEqualToTheSpecifiedValue());
        assertFalse(result.isConditionsTriggerWhileGreaterThanTheSpecifiedValue());
        assertFalse(result.isConditionsTriggerWhileGreaterThanOrEqualToTheSpecifiedValue());
        assertFalse(result.isConditionsTriggerWhileEqualToTheSpecifiedValue());
        assertFalse(result.isConditionsTriggerWhileNotEqualToTheSpecifiedValue());
    }

    @Test
    public void test_constructor006() {
        //@formatter:off
        byte[] value = new byte[1];
        value[ 0] = (byte) EnvironmentalSensingTriggerSetting.CONDITIONS_TRIGGER_WHILE_LESS_THAN_THE_SPECIFIED_VALUE;
        //@formatter:on

        EnvironmentalSensingTriggerSetting result = new EnvironmentalSensingTriggerSetting(value);
        assertFalse(result.isConditionsTriggerInactive());
        assertFalse(result.isConditionsTriggerUsedAFixedTimeIntervalBetweenTransmissions());
        assertFalse(result.isConditionsTriggerNoLessThanTheSpecifiedTimeBetweenTransmissions());
        assertFalse(result.isConditionsTriggerWhenValueChangesComparedToPreviousValue());
        assertTrue(result.isConditionsTriggerWhileLessThanTheSpecifiedValue());
        assertFalse(result.isConditionsTriggerWhileLessThanOrEqualToTheSpecifiedValue());
        assertFalse(result.isConditionsTriggerWhileGreaterThanTheSpecifiedValue());
        assertFalse(result.isConditionsTriggerWhileGreaterThanOrEqualToTheSpecifiedValue());
        assertFalse(result.isConditionsTriggerWhileEqualToTheSpecifiedValue());
        assertFalse(result.isConditionsTriggerWhileNotEqualToTheSpecifiedValue());
    }

    @Test
    public void test_constructor007() {
        //@formatter:off
        byte[] value = new byte[1];
        value[ 0] = (byte) EnvironmentalSensingTriggerSetting.CONDITIONS_TRIGGER_WHILE_LESS_THAN_OR_EQUAL_TO_THE_SPECIFIED_VALUE;
        //@formatter:on

        EnvironmentalSensingTriggerSetting result = new EnvironmentalSensingTriggerSetting(value);
        assertFalse(result.isConditionsTriggerInactive());
        assertFalse(result.isConditionsTriggerUsedAFixedTimeIntervalBetweenTransmissions());
        assertFalse(result.isConditionsTriggerNoLessThanTheSpecifiedTimeBetweenTransmissions());
        assertFalse(result.isConditionsTriggerWhenValueChangesComparedToPreviousValue());
        assertFalse(result.isConditionsTriggerWhileLessThanTheSpecifiedValue());
        assertTrue(result.isConditionsTriggerWhileLessThanOrEqualToTheSpecifiedValue());
        assertFalse(result.isConditionsTriggerWhileGreaterThanTheSpecifiedValue());
        assertFalse(result.isConditionsTriggerWhileGreaterThanOrEqualToTheSpecifiedValue());
        assertFalse(result.isConditionsTriggerWhileEqualToTheSpecifiedValue());
        assertFalse(result.isConditionsTriggerWhileNotEqualToTheSpecifiedValue());
    }

    @Test
    public void test_constructor008() {
        //@formatter:off
        byte[] value = new byte[1];
        value[ 0] = (byte) EnvironmentalSensingTriggerSetting.CONDITIONS_TRIGGER_WHILE_GREATER_THAN_THE_SPECIFIED_VALUE;
        //@formatter:on

        EnvironmentalSensingTriggerSetting result = new EnvironmentalSensingTriggerSetting(value);
        assertFalse(result.isConditionsTriggerInactive());
        assertFalse(result.isConditionsTriggerUsedAFixedTimeIntervalBetweenTransmissions());
        assertFalse(result.isConditionsTriggerNoLessThanTheSpecifiedTimeBetweenTransmissions());
        assertFalse(result.isConditionsTriggerWhenValueChangesComparedToPreviousValue());
        assertFalse(result.isConditionsTriggerWhileLessThanTheSpecifiedValue());
        assertFalse(result.isConditionsTriggerWhileLessThanOrEqualToTheSpecifiedValue());
        assertTrue(result.isConditionsTriggerWhileGreaterThanTheSpecifiedValue());
        assertFalse(result.isConditionsTriggerWhileGreaterThanOrEqualToTheSpecifiedValue());
        assertFalse(result.isConditionsTriggerWhileEqualToTheSpecifiedValue());
        assertFalse(result.isConditionsTriggerWhileNotEqualToTheSpecifiedValue());
    }

    @Test
    public void test_constructor009() {
        //@formatter:off
        byte[] value = new byte[1];
        value[ 0] = (byte) EnvironmentalSensingTriggerSetting.CONDITIONS_TRIGGER_WHILE_GREATER_THAN_OR_EQUAL_TO_THE_SPECIFIED_VALUE;
        //@formatter:on

        EnvironmentalSensingTriggerSetting result = new EnvironmentalSensingTriggerSetting(value);
        assertFalse(result.isConditionsTriggerInactive());
        assertFalse(result.isConditionsTriggerUsedAFixedTimeIntervalBetweenTransmissions());
        assertFalse(result.isConditionsTriggerNoLessThanTheSpecifiedTimeBetweenTransmissions());
        assertFalse(result.isConditionsTriggerWhenValueChangesComparedToPreviousValue());
        assertFalse(result.isConditionsTriggerWhileLessThanTheSpecifiedValue());
        assertFalse(result.isConditionsTriggerWhileLessThanOrEqualToTheSpecifiedValue());
        assertFalse(result.isConditionsTriggerWhileGreaterThanTheSpecifiedValue());
        assertTrue(result.isConditionsTriggerWhileGreaterThanOrEqualToTheSpecifiedValue());
        assertFalse(result.isConditionsTriggerWhileEqualToTheSpecifiedValue());
        assertFalse(result.isConditionsTriggerWhileNotEqualToTheSpecifiedValue());
    }

    @Test
    public void test_constructor010() {
        //@formatter:off
        byte[] value = new byte[1];
        value[ 0] = (byte) EnvironmentalSensingTriggerSetting.CONDITIONS_TRIGGER_WHILE_EQUAL_TO_THE_SPECIFIED_VALUE;
        //@formatter:on

        EnvironmentalSensingTriggerSetting result = new EnvironmentalSensingTriggerSetting(value);
        assertFalse(result.isConditionsTriggerInactive());
        assertFalse(result.isConditionsTriggerUsedAFixedTimeIntervalBetweenTransmissions());
        assertFalse(result.isConditionsTriggerNoLessThanTheSpecifiedTimeBetweenTransmissions());
        assertFalse(result.isConditionsTriggerWhenValueChangesComparedToPreviousValue());
        assertFalse(result.isConditionsTriggerWhileLessThanTheSpecifiedValue());
        assertFalse(result.isConditionsTriggerWhileLessThanOrEqualToTheSpecifiedValue());
        assertFalse(result.isConditionsTriggerWhileGreaterThanTheSpecifiedValue());
        assertFalse(result.isConditionsTriggerWhileGreaterThanOrEqualToTheSpecifiedValue());
        assertTrue(result.isConditionsTriggerWhileEqualToTheSpecifiedValue());
        assertFalse(result.isConditionsTriggerWhileNotEqualToTheSpecifiedValue());
    }

    @Test
    public void test_constructor011() {
        //@formatter:off
        byte[] value = new byte[1];
        value[ 0] = (byte) EnvironmentalSensingTriggerSetting.CONDITIONS_TRIGGER_WHILE_NOT_EQUAL_TO_THE_SPECIFIED_VALUE;
        //@formatter:on

        EnvironmentalSensingTriggerSetting result = new EnvironmentalSensingTriggerSetting(value);
        assertFalse(result.isConditionsTriggerInactive());
        assertFalse(result.isConditionsTriggerUsedAFixedTimeIntervalBetweenTransmissions());
        assertFalse(result.isConditionsTriggerNoLessThanTheSpecifiedTimeBetweenTransmissions());
        assertFalse(result.isConditionsTriggerWhenValueChangesComparedToPreviousValue());
        assertFalse(result.isConditionsTriggerWhileLessThanTheSpecifiedValue());
        assertFalse(result.isConditionsTriggerWhileLessThanOrEqualToTheSpecifiedValue());
        assertFalse(result.isConditionsTriggerWhileGreaterThanTheSpecifiedValue());
        assertFalse(result.isConditionsTriggerWhileGreaterThanOrEqualToTheSpecifiedValue());
        assertFalse(result.isConditionsTriggerWhileEqualToTheSpecifiedValue());
        assertTrue(result.isConditionsTriggerWhileNotEqualToTheSpecifiedValue());
    }

}
