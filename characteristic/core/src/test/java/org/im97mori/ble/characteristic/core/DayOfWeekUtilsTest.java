package org.im97mori.ble.characteristic.core;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DayOfWeekUtilsTest {

    @Test
    public void test_isDayOfWeekNotKnown_00001() {
        assertTrue(DayOfWeekUtils.isDayOfWeekNotKnown(DayOfWeekUtils.DAY_OF_WEEK_IS_NOT_KNOWN));
    }

    @Test
    public void test_isDayOfWeekNotKnown_00002() {
        assertFalse(DayOfWeekUtils.isDayOfWeekNotKnown(DayOfWeekUtils.DAY_OF_WEEK_MONDAY));
    }

    @Test
    public void test_isDayOfWeekNotKnown_00003() {
        assertFalse(DayOfWeekUtils.isDayOfWeekNotKnown(DayOfWeekUtils.DAY_OF_WEEK_TUESDAY));
    }

    @Test
    public void test_isDayOfWeekNotKnown_00004() {
        assertFalse(DayOfWeekUtils.isDayOfWeekNotKnown(DayOfWeekUtils.DAY_OF_WEEK_WEDNESDAY));
    }

    @Test
    public void test_isDayOfWeekNotKnown_00005() {
        assertFalse(DayOfWeekUtils.isDayOfWeekNotKnown(DayOfWeekUtils.DAY_OF_WEEK_THURSDAY));
    }

    @Test
    public void test_isDayOfWeekNotKnown_00006() {
        assertFalse(DayOfWeekUtils.isDayOfWeekNotKnown(DayOfWeekUtils.DAY_OF_WEEK_FRIDAY));
    }

    @Test
    public void test_isDayOfWeekNotKnown_00007() {
        assertFalse(DayOfWeekUtils.isDayOfWeekNotKnown(DayOfWeekUtils.DAY_OF_WEEK_SATURDAY));
    }

    @Test
    public void test_isDayOfWeekNotKnown_00008() {
        assertFalse(DayOfWeekUtils.isDayOfWeekNotKnown(DayOfWeekUtils.DAY_OF_WEEK_SUNDAY));
    }

    @Test
    public void test_isDayOfWeekMonday_00001() {
        assertFalse(DayOfWeekUtils.isDayOfWeekMonday(DayOfWeekUtils.DAY_OF_WEEK_IS_NOT_KNOWN));
    }

    @Test
    public void test_isDayOfWeekMonday_00002() {
        assertTrue(DayOfWeekUtils.isDayOfWeekMonday(DayOfWeekUtils.DAY_OF_WEEK_MONDAY));
    }

    @Test
    public void test_isDayOfWeekMonday_00003() {
        assertFalse(DayOfWeekUtils.isDayOfWeekMonday(DayOfWeekUtils.DAY_OF_WEEK_TUESDAY));
    }

    @Test
    public void test_isDayOfWeekMonday_00004() {
        assertFalse(DayOfWeekUtils.isDayOfWeekMonday(DayOfWeekUtils.DAY_OF_WEEK_WEDNESDAY));
    }

    @Test
    public void test_isDayOfWeekMonday_00005() {
        assertFalse(DayOfWeekUtils.isDayOfWeekMonday(DayOfWeekUtils.DAY_OF_WEEK_THURSDAY));
    }

    @Test
    public void test_isDayOfWeekMonday_00006() {
        assertFalse(DayOfWeekUtils.isDayOfWeekMonday(DayOfWeekUtils.DAY_OF_WEEK_FRIDAY));
    }

    @Test
    public void test_isDayOfWeekMonday_00007() {
        assertFalse(DayOfWeekUtils.isDayOfWeekMonday(DayOfWeekUtils.DAY_OF_WEEK_SATURDAY));
    }

    @Test
    public void test_isDayOfWeekMonday_00008() {
        assertFalse(DayOfWeekUtils.isDayOfWeekMonday(DayOfWeekUtils.DAY_OF_WEEK_SUNDAY));
    }

    @Test
    public void test_isDayOfWeekTuesday_00001() {
        assertFalse(DayOfWeekUtils.isDayOfWeekTuesday(DayOfWeekUtils.DAY_OF_WEEK_IS_NOT_KNOWN));
    }

    @Test
    public void test_isDayOfWeekTuesday_00002() {
        assertFalse(DayOfWeekUtils.isDayOfWeekTuesday(DayOfWeekUtils.DAY_OF_WEEK_MONDAY));
    }

    @Test
    public void test_isDayOfWeekTuesday_00003() {
        assertTrue(DayOfWeekUtils.isDayOfWeekTuesday(DayOfWeekUtils.DAY_OF_WEEK_TUESDAY));
    }

    @Test
    public void test_isDayOfWeekTuesday_00004() {
        assertFalse(DayOfWeekUtils.isDayOfWeekTuesday(DayOfWeekUtils.DAY_OF_WEEK_WEDNESDAY));
    }

    @Test
    public void test_isDayOfWeekTuesday_00005() {
        assertFalse(DayOfWeekUtils.isDayOfWeekTuesday(DayOfWeekUtils.DAY_OF_WEEK_THURSDAY));
    }

    @Test
    public void test_isDayOfWeekTuesday_00006() {
        assertFalse(DayOfWeekUtils.isDayOfWeekTuesday(DayOfWeekUtils.DAY_OF_WEEK_FRIDAY));
    }

    @Test
    public void test_isDayOfWeekTuesday_00007() {
        assertFalse(DayOfWeekUtils.isDayOfWeekTuesday(DayOfWeekUtils.DAY_OF_WEEK_SATURDAY));
    }

    @Test
    public void test_isDayOfWeekTuesday_00008() {
        assertFalse(DayOfWeekUtils.isDayOfWeekTuesday(DayOfWeekUtils.DAY_OF_WEEK_SUNDAY));
    }

    @Test
    public void test_isDayOfWeekWednesday_00001() {
        assertFalse(DayOfWeekUtils.isDayOfWeekWednesday(DayOfWeekUtils.DAY_OF_WEEK_IS_NOT_KNOWN));
    }

    @Test
    public void test_isDayOfWeekWednesday_00002() {
        assertFalse(DayOfWeekUtils.isDayOfWeekWednesday(DayOfWeekUtils.DAY_OF_WEEK_MONDAY));
    }

    @Test
    public void test_isDayOfWeekWednesday_00003() {
        assertFalse(DayOfWeekUtils.isDayOfWeekWednesday(DayOfWeekUtils.DAY_OF_WEEK_TUESDAY));
    }

    @Test
    public void test_isDayOfWeekWednesday_00004() {
        assertTrue(DayOfWeekUtils.isDayOfWeekWednesday(DayOfWeekUtils.DAY_OF_WEEK_WEDNESDAY));
    }

    @Test
    public void test_isDayOfWeekWednesday_00005() {
        assertFalse(DayOfWeekUtils.isDayOfWeekWednesday(DayOfWeekUtils.DAY_OF_WEEK_THURSDAY));
    }

    @Test
    public void test_isDayOfWeekWednesday_00006() {
        assertFalse(DayOfWeekUtils.isDayOfWeekWednesday(DayOfWeekUtils.DAY_OF_WEEK_FRIDAY));
    }

    @Test
    public void test_isDayOfWeekWednesday_00007() {
        assertFalse(DayOfWeekUtils.isDayOfWeekWednesday(DayOfWeekUtils.DAY_OF_WEEK_SATURDAY));
    }

    @Test
    public void test_isDayOfWeekWednesday_00008() {
        assertFalse(DayOfWeekUtils.isDayOfWeekWednesday(DayOfWeekUtils.DAY_OF_WEEK_SUNDAY));
    }

    @Test
    public void test_isDayOfWeekThursday_00001() {
        assertFalse(DayOfWeekUtils.isDayOfWeekThursday(DayOfWeekUtils.DAY_OF_WEEK_IS_NOT_KNOWN));
    }

    @Test
    public void test_isDayOfWeekThursday_00002() {
        assertFalse(DayOfWeekUtils.isDayOfWeekThursday(DayOfWeekUtils.DAY_OF_WEEK_MONDAY));
    }

    @Test
    public void test_isDayOfWeekThursday_00003() {
        assertFalse(DayOfWeekUtils.isDayOfWeekThursday(DayOfWeekUtils.DAY_OF_WEEK_TUESDAY));
    }

    @Test
    public void test_isDayOfWeekThursday_00004() {
        assertFalse(DayOfWeekUtils.isDayOfWeekThursday(DayOfWeekUtils.DAY_OF_WEEK_WEDNESDAY));
    }

    @Test
    public void test_isDayOfWeekThursday_00005() {
        assertTrue(DayOfWeekUtils.isDayOfWeekThursday(DayOfWeekUtils.DAY_OF_WEEK_THURSDAY));
    }

    @Test
    public void test_isDayOfWeekThursday_00006() {
        assertFalse(DayOfWeekUtils.isDayOfWeekThursday(DayOfWeekUtils.DAY_OF_WEEK_FRIDAY));
    }

    @Test
    public void test_isDayOfWeekThursday_00007() {
        assertFalse(DayOfWeekUtils.isDayOfWeekThursday(DayOfWeekUtils.DAY_OF_WEEK_SATURDAY));
    }

    @Test
    public void test_isDayOfWeekThursday_00008() {
        assertFalse(DayOfWeekUtils.isDayOfWeekThursday(DayOfWeekUtils.DAY_OF_WEEK_SUNDAY));
    }

    @Test
    public void test_isDayOfWeekFriday_00001() {
        assertFalse(DayOfWeekUtils.isDayOfWeekFriday(DayOfWeekUtils.DAY_OF_WEEK_IS_NOT_KNOWN));
    }

    @Test
    public void test_isDayOfWeekFriday_00002() {
        assertFalse(DayOfWeekUtils.isDayOfWeekFriday(DayOfWeekUtils.DAY_OF_WEEK_MONDAY));
    }

    @Test
    public void test_isDayOfWeekFriday_00003() {
        assertFalse(DayOfWeekUtils.isDayOfWeekFriday(DayOfWeekUtils.DAY_OF_WEEK_TUESDAY));
    }

    @Test
    public void test_isDayOfWeekFriday_00004() {
        assertFalse(DayOfWeekUtils.isDayOfWeekFriday(DayOfWeekUtils.DAY_OF_WEEK_WEDNESDAY));
    }

    @Test
    public void test_isDayOfWeekFriday_00005() {
        assertFalse(DayOfWeekUtils.isDayOfWeekFriday(DayOfWeekUtils.DAY_OF_WEEK_THURSDAY));
    }

    @Test
    public void test_isDayOfWeekFriday_00006() {
        assertTrue(DayOfWeekUtils.isDayOfWeekFriday(DayOfWeekUtils.DAY_OF_WEEK_FRIDAY));
    }

    @Test
    public void test_isDayOfWeekFriday_00007() {
        assertFalse(DayOfWeekUtils.isDayOfWeekFriday(DayOfWeekUtils.DAY_OF_WEEK_SATURDAY));
    }

    @Test
    public void test_isDayOfWeekFriday_00008() {
        assertFalse(DayOfWeekUtils.isDayOfWeekFriday(DayOfWeekUtils.DAY_OF_WEEK_SUNDAY));
    }

    @Test
    public void test_isDayOfWeekSaturday_00001() {
        assertFalse(DayOfWeekUtils.isDayOfWeekSaturday(DayOfWeekUtils.DAY_OF_WEEK_IS_NOT_KNOWN));
    }

    @Test
    public void test_isDayOfWeekSaturday_00002() {
        assertFalse(DayOfWeekUtils.isDayOfWeekSaturday(DayOfWeekUtils.DAY_OF_WEEK_MONDAY));
    }

    @Test
    public void test_isDayOfWeekSaturday_00003() {
        assertFalse(DayOfWeekUtils.isDayOfWeekSaturday(DayOfWeekUtils.DAY_OF_WEEK_TUESDAY));
    }

    @Test
    public void test_isDayOfWeekSaturday_00004() {
        assertFalse(DayOfWeekUtils.isDayOfWeekSaturday(DayOfWeekUtils.DAY_OF_WEEK_WEDNESDAY));
    }

    @Test
    public void test_isDayOfWeekSaturday_00005() {
        assertFalse(DayOfWeekUtils.isDayOfWeekSaturday(DayOfWeekUtils.DAY_OF_WEEK_THURSDAY));
    }

    @Test
    public void test_isDayOfWeekSaturday_00006() {
        assertFalse(DayOfWeekUtils.isDayOfWeekSaturday(DayOfWeekUtils.DAY_OF_WEEK_FRIDAY));
    }

    @Test
    public void test_isDayOfWeekSaturday_00007() {
        assertTrue(DayOfWeekUtils.isDayOfWeekSaturday(DayOfWeekUtils.DAY_OF_WEEK_SATURDAY));
    }

    @Test
    public void test_isDayOfWeekSaturday_00008() {
        assertFalse(DayOfWeekUtils.isDayOfWeekSaturday(DayOfWeekUtils.DAY_OF_WEEK_SUNDAY));
    }

    @Test
    public void test_isDayOfWeekSunday_00001() {
        assertFalse(DayOfWeekUtils.isDayOfWeekSunday(DayOfWeekUtils.DAY_OF_WEEK_IS_NOT_KNOWN));
    }

    @Test
    public void test_isDayOfWeekSunday_00002() {
        assertFalse(DayOfWeekUtils.isDayOfWeekSunday(DayOfWeekUtils.DAY_OF_WEEK_MONDAY));
    }

    @Test
    public void test_isDayOfWeekSunday_00003() {
        assertFalse(DayOfWeekUtils.isDayOfWeekSunday(DayOfWeekUtils.DAY_OF_WEEK_TUESDAY));
    }

    @Test
    public void test_isDayOfWeekSunday_00004() {
        assertFalse(DayOfWeekUtils.isDayOfWeekSunday(DayOfWeekUtils.DAY_OF_WEEK_WEDNESDAY));
    }

    @Test
    public void test_isDayOfWeekSunday_00005() {
        assertFalse(DayOfWeekUtils.isDayOfWeekSunday(DayOfWeekUtils.DAY_OF_WEEK_THURSDAY));
    }

    @Test
    public void test_isDayOfWeekSunday_00006() {
        assertFalse(DayOfWeekUtils.isDayOfWeekSunday(DayOfWeekUtils.DAY_OF_WEEK_FRIDAY));
    }

    @Test
    public void test_isDayOfWeekSunday_00007() {
        assertFalse(DayOfWeekUtils.isDayOfWeekSunday(DayOfWeekUtils.DAY_OF_WEEK_SATURDAY));
    }

    @Test
    public void test_isDayOfWeekSunday_00008() {
        assertTrue(DayOfWeekUtils.isDayOfWeekSunday(DayOfWeekUtils.DAY_OF_WEEK_SUNDAY));
    }
}
