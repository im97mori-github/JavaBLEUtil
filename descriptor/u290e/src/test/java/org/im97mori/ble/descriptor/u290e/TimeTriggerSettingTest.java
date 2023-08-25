package org.im97mori.ble.descriptor.u290e;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class TimeTriggerSettingTest extends TestBase {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] value = new byte[2];
        value[ 0] = (byte) TimeTriggerSetting.CONDITION_NO_TIME_BASED_TRIGGERING_USED;
        value[ 1] = 0x02;
        //@formatter:on

        TimeTriggerSetting result = new TimeTriggerSetting(value);
        assertTrue(result.isConditionNoTimeBasedTriggeringUsed());
        assertFalse(result.isConditionIndicatesOrNotifiedIUnconditionallyAfterASettableTime());
        assertFalse(result.isConditionNotIndicatedOrNotifiedMoreOftenThanASettableTime());
        assertFalse(result.isConditionChangedMoreOfthenThan());
        assertEquals(0x02, result.getValueNone());
    }

    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] value = new byte[4];
        value[ 0] = (byte) TimeTriggerSetting.CONDITION_INDICATES_OR_NOTIFIED_UNCONDITIONALLY_AFTER_A_SETTABLE_TIME;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        //@formatter:on

        TimeTriggerSetting result = new TimeTriggerSetting(value);
        assertFalse(result.isConditionNoTimeBasedTriggeringUsed());
        assertTrue(result.isConditionIndicatesOrNotifiedIUnconditionallyAfterASettableTime());
        assertFalse(result.isConditionNotIndicatedOrNotifiedMoreOftenThanASettableTime());
        assertFalse(result.isConditionChangedMoreOfthenThan());
        assertEquals(0x040302, result.getValueTimeInterval());
    }

    @Test
    public void test_constructor_00003() {
        //@formatter:off
        byte[] value = new byte[4];
        value[ 0] = (byte) TimeTriggerSetting.CONDITION_NOT_INDICATED_OR_NOTIFIED_MORE_OFTEN_THAN_A_SETTABLE_TIME;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        //@formatter:on

        TimeTriggerSetting result = new TimeTriggerSetting(value);
        assertFalse(result.isConditionNoTimeBasedTriggeringUsed());
        assertFalse(result.isConditionIndicatesOrNotifiedIUnconditionallyAfterASettableTime());
        assertTrue(result.isConditionNotIndicatedOrNotifiedMoreOftenThanASettableTime());
        assertFalse(result.isConditionChangedMoreOfthenThan());
        assertEquals(0x040302, result.getValueTimeInterval());
    }

    @Test
    public void test_constructor_00004() {
        //@formatter:off
        byte[] value = new byte[3];
        value[ 0] = (byte) TimeTriggerSetting.CONDITION_CHANGED_MORE_OFTEN_THAN;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        //@formatter:on

        TimeTriggerSetting result = new TimeTriggerSetting(value);
        assertFalse(result.isConditionNoTimeBasedTriggeringUsed());
        assertFalse(result.isConditionIndicatesOrNotifiedIUnconditionallyAfterASettableTime());
        assertFalse(result.isConditionNotIndicatedOrNotifiedMoreOftenThanASettableTime());
        assertTrue(result.isConditionChangedMoreOfthenThan());
        assertEquals(0x0302, result.getValueCount());
    }

    @Test
    public void test_constructor_00005() {
        TimeTriggerSetting result = new TimeTriggerSetting(TimeTriggerSetting.CONDITION_NO_TIME_BASED_TRIGGERING_USED, 0x02, 0x050403, 0x0706);
        assertTrue(result.isConditionNoTimeBasedTriggeringUsed());
        assertFalse(result.isConditionIndicatesOrNotifiedIUnconditionallyAfterASettableTime());
        assertFalse(result.isConditionNotIndicatedOrNotifiedMoreOftenThanASettableTime());
        assertFalse(result.isConditionChangedMoreOfthenThan());
        assertEquals(0x02, result.getValueNone());
    }

    @Test
    public void test_constructor_00006() {
        TimeTriggerSetting result = new TimeTriggerSetting(TimeTriggerSetting.CONDITION_INDICATES_OR_NOTIFIED_UNCONDITIONALLY_AFTER_A_SETTABLE_TIME, 0x02, 0x050403, 0x0706);
        assertFalse(result.isConditionNoTimeBasedTriggeringUsed());
        assertTrue(result.isConditionIndicatesOrNotifiedIUnconditionallyAfterASettableTime());
        assertFalse(result.isConditionNotIndicatedOrNotifiedMoreOftenThanASettableTime());
        assertFalse(result.isConditionChangedMoreOfthenThan());
        assertEquals(0x050403, result.getValueTimeInterval());
    }

    @Test
    public void test_constructor_00007() {
        TimeTriggerSetting result = new TimeTriggerSetting(TimeTriggerSetting.CONDITION_NOT_INDICATED_OR_NOTIFIED_MORE_OFTEN_THAN_A_SETTABLE_TIME, 0x02, 0x050403, 0x0706);
        assertFalse(result.isConditionNoTimeBasedTriggeringUsed());
        assertFalse(result.isConditionIndicatesOrNotifiedIUnconditionallyAfterASettableTime());
        assertTrue(result.isConditionNotIndicatedOrNotifiedMoreOftenThanASettableTime());
        assertFalse(result.isConditionChangedMoreOfthenThan());
        assertEquals(0x050403, result.getValueTimeInterval());
    }

    @Test
    public void test_constructor_00008() {
        TimeTriggerSetting result = new TimeTriggerSetting(TimeTriggerSetting.CONDITION_CHANGED_MORE_OFTEN_THAN, 0x02, 0x050403, 0x0706);
        assertFalse(result.isConditionNoTimeBasedTriggeringUsed());
        assertFalse(result.isConditionIndicatesOrNotifiedIUnconditionallyAfterASettableTime());
        assertFalse(result.isConditionNotIndicatedOrNotifiedMoreOftenThanASettableTime());
        assertTrue(result.isConditionChangedMoreOfthenThan());
        assertEquals(0x0706, result.getValueCount());
    }

    @Test
    public void test_parcelable_00101() {
        //@formatter:off
        byte[] value = new byte[2];
        value[ 0] = (byte) TimeTriggerSetting.CONDITION_NO_TIME_BASED_TRIGGERING_USED;
        value[ 1] = 0x02;
        //@formatter:on

        TimeTriggerSetting result1 = new TimeTriggerSetting(value);
        assertArrayEquals(value, result1.getBytes());
    }

    @Test
    public void test_parcelable_00102() {
        //@formatter:off
        byte[] value = new byte[4];
        value[ 0] = (byte) TimeTriggerSetting.CONDITION_INDICATES_OR_NOTIFIED_UNCONDITIONALLY_AFTER_A_SETTABLE_TIME;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        //@formatter:on

        TimeTriggerSetting result1 = new TimeTriggerSetting(value);
        assertArrayEquals(value, result1.getBytes());
    }

    @Test
    public void test_parcelable_00103() {
        //@formatter:off
        byte[] value = new byte[4];
        value[ 0] = (byte) TimeTriggerSetting.CONDITION_NOT_INDICATED_OR_NOTIFIED_MORE_OFTEN_THAN_A_SETTABLE_TIME;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        value[ 3] = 0x04;
        //@formatter:on

        TimeTriggerSetting result1 = new TimeTriggerSetting(value);
        assertArrayEquals(value, result1.getBytes());
    }

    @Test
    public void test_parcelable_00104() {
        //@formatter:off
        byte[] value = new byte[3];
        value[ 0] = (byte) TimeTriggerSetting.CONDITION_CHANGED_MORE_OFTEN_THAN;
        value[ 1] = 0x02;
        value[ 2] = 0x03;
        //@formatter:on

        TimeTriggerSetting result1 = new TimeTriggerSetting(value);
        assertArrayEquals(value, result1.getBytes());
    }

    @Test
    public void test_parcelable_00105() {
        //@formatter:off
        byte[] value = new byte[2];
        value[ 0] = (byte) TimeTriggerSetting.CONDITION_NO_TIME_BASED_TRIGGERING_USED;
        value[ 1] = 0x02;
        //@formatter:on

        TimeTriggerSetting result1 = new TimeTriggerSetting(TimeTriggerSetting.CONDITION_NO_TIME_BASED_TRIGGERING_USED, 0x02, 0x03, 0x04);
        assertArrayEquals(value, result1.getBytes());
    }

    @Test
    public void test_parcelable_00106() {
        //@formatter:off
        byte[] value = new byte[4];
        value[ 0] = (byte) TimeTriggerSetting.CONDITION_INDICATES_OR_NOTIFIED_UNCONDITIONALLY_AFTER_A_SETTABLE_TIME;
        value[ 1] = 0x03;
        value[ 2] = 0x04;
        value[ 3] = 0x05;
        //@formatter:on

        TimeTriggerSetting result1 = new TimeTriggerSetting(TimeTriggerSetting.CONDITION_INDICATES_OR_NOTIFIED_UNCONDITIONALLY_AFTER_A_SETTABLE_TIME, 0x02, 0x050403, 0x0706);
        assertArrayEquals(value, result1.getBytes());
    }

    @Test
    public void test_parcelable_00107() {
        //@formatter:off
        byte[] value = new byte[4];
        value[ 0] = (byte) TimeTriggerSetting.CONDITION_NOT_INDICATED_OR_NOTIFIED_MORE_OFTEN_THAN_A_SETTABLE_TIME;
        value[ 1] = 0x03;
        value[ 2] = 0x04;
        value[ 3] = 0x05;
        //@formatter:on

        TimeTriggerSetting result1 = new TimeTriggerSetting(TimeTriggerSetting.CONDITION_NOT_INDICATED_OR_NOTIFIED_MORE_OFTEN_THAN_A_SETTABLE_TIME, 0x02, 0x050403, 0x0706);
        assertArrayEquals(value, result1.getBytes());
    }

    @Test
    public void test_parcelable_00108() {
        //@formatter:off
        byte[] value = new byte[3];
        value[ 0] = (byte) TimeTriggerSetting.CONDITION_CHANGED_MORE_OFTEN_THAN;
        value[ 1] = 0x06;
        value[ 2] = 0x07;
        //@formatter:on

        TimeTriggerSetting result1 = new TimeTriggerSetting(TimeTriggerSetting.CONDITION_CHANGED_MORE_OFTEN_THAN, 0x02, 0x050403, 0x0706);
        assertArrayEquals(value, result1.getBytes());
    }

}
