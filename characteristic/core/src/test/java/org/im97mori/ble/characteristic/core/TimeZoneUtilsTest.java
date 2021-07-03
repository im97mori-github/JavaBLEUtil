package org.im97mori.ble.characteristic.core;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TimeZoneUtilsTest {

    @Test
    public void test_isTimeZoneNotKnown_00001() {
        assertTrue(TimeZoneUtils.isTimeZoneNotKnown(TimeZoneUtils.TIME_ZONE_IS_NOT_KNOWN));
    }

    @Test
    public void test_isTimeZoneNotKnown_00002() {
        assertFalse(TimeZoneUtils.isTimeZoneNotKnown(-48));
    }

    @Test
    public void test_isTimeZoneNotKnown_00003() {
        assertFalse(TimeZoneUtils.isTimeZoneNotKnown(56));
    }

    @Test
    public void test_getTimeZoneOffsetMin_00001() {
        int timeZone = -48;

        assertEquals(TimeZoneUtils.TIME_ZONE_UNIT * timeZone, TimeZoneUtils.getTimeZoneOffsetMin(timeZone));
    }

    @Test
    public void test_getTimeZoneOffsetMin_00002() {
        int timeZone = 56;

        assertEquals(TimeZoneUtils.TIME_ZONE_UNIT * timeZone, TimeZoneUtils.getTimeZoneOffsetMin(timeZone));
    }

}
