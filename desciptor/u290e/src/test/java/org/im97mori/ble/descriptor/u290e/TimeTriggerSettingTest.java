package org.im97mori.ble.descriptor.u290e;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TimeTriggerSettingTest {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] value = new byte[7];
        value[ 0] = 0x01;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        //@formatter:on

        TimeTriggerSetting result = new TimeTriggerSetting(value);
        assertEquals(0x01, result.getCondition());
        assertEquals(0x02, result.getValueNone());
        assertEquals(0x050403, result.getValueTimeInterval());
        assertEquals(0x0706, result.getValueCount());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] value = new byte[7];
        value[ 0] = (byte) TimeTriggerSetting.CONDITION_NO_TIME_BASED_TRIGGERING_USED;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        //@formatter:on

        TimeTriggerSetting result = new TimeTriggerSetting(value);
        assertTrue(result.isConditionNoTimeBasedTriggeringUsed());
        assertFalse(result.isConditionIndicatesOrNotifiedIUnconditionallyAfterASettableTime());
        assertFalse(result.isConditionNotIndicatedOrNotifiedMoreOftenThanASettableTime());
        assertFalse(result.isConditionChangedMoreOfthenThan());
    }

    @Test
    public void test_constructor003() {
        //@formatter:off
        byte[] value = new byte[7];
        value[ 0] = (byte) TimeTriggerSetting.CONDITION_INDICATES_OR_NOTIFIED_UNCONDITIONALLY_AFTER_A_SETTABLE_TIME;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        //@formatter:on

        TimeTriggerSetting result = new TimeTriggerSetting(value);
        assertFalse(result.isConditionNoTimeBasedTriggeringUsed());
        assertTrue(result.isConditionIndicatesOrNotifiedIUnconditionallyAfterASettableTime());
        assertFalse(result.isConditionNotIndicatedOrNotifiedMoreOftenThanASettableTime());
        assertFalse(result.isConditionChangedMoreOfthenThan());
    }

    @Test
    public void test_constructor004() {
        //@formatter:off
        byte[] value = new byte[7];
        value[ 0] = (byte) TimeTriggerSetting.CONDITION_NOT_INDICATED_OR_NOTIFIED_MORE_OFTEN_THAN_A_SETTABLE_TIME;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        //@formatter:on

        TimeTriggerSetting result = new TimeTriggerSetting(value);
        assertFalse(result.isConditionNoTimeBasedTriggeringUsed());
        assertFalse(result.isConditionIndicatesOrNotifiedIUnconditionallyAfterASettableTime());
        assertTrue(result.isConditionNotIndicatedOrNotifiedMoreOftenThanASettableTime());
        assertFalse(result.isConditionChangedMoreOfthenThan());
    }

    @Test
    public void test_constructor005() {
        //@formatter:off
        byte[] value = new byte[7];
        value[ 0] = (byte) TimeTriggerSetting.CONDITION_CHANGED_MORE_OFTEN_THAN;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        value[ 4] = 0x05;
        value[ 5] = 0x06;
        value[ 6] = 0x07;
        //@formatter:on

        TimeTriggerSetting result = new TimeTriggerSetting(value);
        assertFalse(result.isConditionNoTimeBasedTriggeringUsed());
        assertFalse(result.isConditionIndicatesOrNotifiedIUnconditionallyAfterASettableTime());
        assertFalse(result.isConditionNotIndicatedOrNotifiedMoreOftenThanASettableTime());
        assertTrue(result.isConditionChangedMoreOfthenThan());
    }

}
