package org.im97mori.ble.characteristic.u2a2b;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.characteristic.core.DateTimeUtils;
import org.im97mori.ble.characteristic.core.DayOfWeekUtils;
import org.im97mori.ble.characteristic.core.ExactTime256Utils;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class CurrentTimeTest extends TestBase {

    @Test
    public void test_constructor001() {
        //@formatter:off
        byte[] data = new byte[10];
        data[ 0] = (byte) DateTimeUtils.YEAR_IS_NOT_KNOWN;
        data[ 1] = (byte) (DateTimeUtils.YEAR_IS_NOT_KNOWN >> 8);
        data[ 2] = DateTimeUtils.MONTH_IS_NOT_KNOWN;
        data[ 3] = DateTimeUtils.DAY_OF_MONTH_IS_NOT_KNOWN;
        data[ 4] = 0;
        data[ 5] = 0;
        data[ 6] = 0;
        data[ 7] = DayOfWeekUtils.DAY_OF_WEEK_IS_NOT_KNOWN;
        data[ 8] = ExactTime256Utils.FRACTIONS_256_NOT_SUPPORTED;
        data[ 9] = CurrentTime.ADJUST_REASON_NO_MANUAL_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_NO_EXTERNAL_REFEREMCE_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_NO_CHANGE_OF_TIME_ZONE
                | CurrentTime.ADJUST_REASON_NO_CHANGE_OF_DST;
        //@formatter:on

        CurrentTime result1 = new CurrentTime(data);
        assertEquals(DateTimeUtils.YEAR_IS_NOT_KNOWN, result1.getYear());
        assertEquals(DateTimeUtils.MONTH_IS_NOT_KNOWN, result1.getMonth());
        assertEquals(DateTimeUtils.DAY_OF_MONTH_IS_NOT_KNOWN, result1.getDay());
        assertEquals(0x00, result1.getHours());
        assertEquals(0x00, result1.getMinutes());
        assertEquals(0x00, result1.getSeconds());
        assertEquals(DayOfWeekUtils.DAY_OF_WEEK_IS_NOT_KNOWN, result1.getDayOfWeek());
        assertEquals(ExactTime256Utils.FRACTIONS_256_NOT_SUPPORTED, result1.getFractions256());
        assertEquals(CurrentTime.ADJUST_REASON_NO_MANUAL_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_NO_EXTERNAL_REFEREMCE_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_NO_CHANGE_OF_TIME_ZONE
                | CurrentTime.ADJUST_REASON_NO_CHANGE_OF_DST, result1.getAdjustReason());
        assertTrue(result1.isAdjustReasonNoManualTimeUpdate());
        assertFalse(result1.isAdjustReasonManualTimeUpdate());
        assertTrue(result1.isAdjustReasonNoExternalReferenceTimeUpdate());
        assertFalse(result1.isAdjustReasonExternalReferenceTimeUpdate());
        assertTrue(result1.isAdjustReasonNoChangeOfTimeZone());
        assertFalse(result1.isAdjustReasonChangeOfTimeZone());
        assertTrue(result1.isAdjustReasonNoChangeOfDst());
        assertFalse(result1.isAdjustReasonChangeOfDst());
    }

    @Test
    public void test_constructor002() {
        //@formatter:off
        byte[] data = new byte[10];
        data[ 0] = (byte) 1582;
        data[ 1] = (byte) (1582 >> 8);
        data[ 2] = DateTimeUtils.MONTH_JANUARY;
        data[ 3] = 1;
        data[ 4] = 23;
        data[ 5] = 59;
        data[ 6] = 59;
        data[ 7] = DayOfWeekUtils.DAY_OF_WEEK_MONDAY;
        data[ 8] = (byte) 255;
        data[ 9] = CurrentTime.ADJUST_REASON_MANUAL_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_NO_EXTERNAL_REFEREMCE_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_NO_CHANGE_OF_TIME_ZONE
                | CurrentTime.ADJUST_REASON_NO_CHANGE_OF_DST;
        //@formatter:on

        CurrentTime result1 = new CurrentTime(data);
        assertEquals(1582, result1.getYear());
        assertEquals(DateTimeUtils.MONTH_JANUARY, result1.getMonth());
        assertEquals(1, result1.getDay());
        assertEquals(23, result1.getHours());
        assertEquals(59, result1.getMinutes());
        assertEquals(59, result1.getSeconds());
        assertEquals(DayOfWeekUtils.DAY_OF_WEEK_MONDAY, result1.getDayOfWeek());
        assertEquals(255, result1.getFractions256());
        assertEquals(CurrentTime.ADJUST_REASON_MANUAL_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_NO_EXTERNAL_REFEREMCE_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_NO_CHANGE_OF_TIME_ZONE
                | CurrentTime.ADJUST_REASON_NO_CHANGE_OF_DST, result1.getAdjustReason());
        assertFalse(result1.isAdjustReasonNoManualTimeUpdate());
        assertTrue(result1.isAdjustReasonManualTimeUpdate());
        assertTrue(result1.isAdjustReasonNoExternalReferenceTimeUpdate());
        assertFalse(result1.isAdjustReasonExternalReferenceTimeUpdate());
        assertTrue(result1.isAdjustReasonNoChangeOfTimeZone());
        assertFalse(result1.isAdjustReasonChangeOfTimeZone());
        assertTrue(result1.isAdjustReasonNoChangeOfDst());
        assertFalse(result1.isAdjustReasonChangeOfDst());
    }

    @Test
    public void test_constructor003() {
        //@formatter:off
        byte[] data = new byte[10];
        data[ 0] = (byte) 9999;
        data[ 1] = (byte) (9999 >> 8);
        data[ 2] = DateTimeUtils.MONTH_FEBRUARY;
        data[ 3] = 31;
        data[ 4] = 23;
        data[ 5] = 59;
        data[ 6] = 59;
        data[ 7] = DayOfWeekUtils.DAY_OF_WEEK_TUESDAY;
        data[ 8] = (byte) 255;
        data[ 9] = CurrentTime.ADJUST_REASON_NO_MANUAL_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_EXTERNAL_REFERENCE_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_NO_CHANGE_OF_TIME_ZONE
                | CurrentTime.ADJUST_REASON_NO_CHANGE_OF_DST;
        //@formatter:on

        CurrentTime result1 = new CurrentTime(data);
        assertEquals(9999, result1.getYear());
        assertEquals(DateTimeUtils.MONTH_FEBRUARY, result1.getMonth());
        assertEquals(31, result1.getDay());
        assertEquals(23, result1.getHours());
        assertEquals(59, result1.getMinutes());
        assertEquals(59, result1.getSeconds());
        assertEquals(DayOfWeekUtils.DAY_OF_WEEK_TUESDAY, result1.getDayOfWeek());
        assertEquals(255, result1.getFractions256());
        assertEquals(CurrentTime.ADJUST_REASON_NO_MANUAL_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_EXTERNAL_REFERENCE_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_NO_CHANGE_OF_TIME_ZONE
                | CurrentTime.ADJUST_REASON_NO_CHANGE_OF_DST, result1.getAdjustReason());
        assertTrue(result1.isAdjustReasonNoManualTimeUpdate());
        assertFalse(result1.isAdjustReasonManualTimeUpdate());
        assertFalse(result1.isAdjustReasonNoExternalReferenceTimeUpdate());
        assertTrue(result1.isAdjustReasonExternalReferenceTimeUpdate());
        assertTrue(result1.isAdjustReasonNoChangeOfTimeZone());
        assertFalse(result1.isAdjustReasonChangeOfTimeZone());
        assertTrue(result1.isAdjustReasonNoChangeOfDst());
        assertFalse(result1.isAdjustReasonChangeOfDst());
    }

    @Test
    public void test_constructor004() {
        //@formatter:off
        byte[] data = new byte[10];
        data[ 0] = (byte) 9999;
        data[ 1] = (byte) (9999 >> 8);
        data[ 2] = DateTimeUtils.MONTH_MARCH;
        data[ 3] = 31;
        data[ 4] = 23;
        data[ 5] = 59;
        data[ 6] = 59;
        data[ 7] = DayOfWeekUtils.DAY_OF_WEEK_WEDNESDAY;
        data[ 8] = (byte) 255;
        data[ 9] = CurrentTime.ADJUST_REASON_MANUAL_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_EXTERNAL_REFERENCE_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_NO_CHANGE_OF_TIME_ZONE
                | CurrentTime.ADJUST_REASON_NO_CHANGE_OF_DST;
        //@formatter:on

        CurrentTime result1 = new CurrentTime(data);
        assertEquals(9999, result1.getYear());
        assertEquals(DateTimeUtils.MONTH_MARCH, result1.getMonth());
        assertEquals(31, result1.getDay());
        assertEquals(23, result1.getHours());
        assertEquals(59, result1.getMinutes());
        assertEquals(59, result1.getSeconds());
        assertEquals(DayOfWeekUtils.DAY_OF_WEEK_WEDNESDAY, result1.getDayOfWeek());
        assertEquals(255, result1.getFractions256());
        assertEquals(CurrentTime.ADJUST_REASON_MANUAL_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_EXTERNAL_REFERENCE_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_NO_CHANGE_OF_TIME_ZONE
                | CurrentTime.ADJUST_REASON_NO_CHANGE_OF_DST, result1.getAdjustReason());
        assertFalse(result1.isAdjustReasonNoManualTimeUpdate());
        assertTrue(result1.isAdjustReasonManualTimeUpdate());
        assertFalse(result1.isAdjustReasonNoExternalReferenceTimeUpdate());
        assertTrue(result1.isAdjustReasonExternalReferenceTimeUpdate());
        assertTrue(result1.isAdjustReasonNoChangeOfTimeZone());
        assertFalse(result1.isAdjustReasonChangeOfTimeZone());
        assertTrue(result1.isAdjustReasonNoChangeOfDst());
        assertFalse(result1.isAdjustReasonChangeOfDst());
    }

    @Test
    public void test_constructor005() {
        //@formatter:off
        byte[] data = new byte[10];
        data[ 0] = (byte) 9999;
        data[ 1] = (byte) (9999 >> 8);
        data[ 2] = DateTimeUtils.MONTH_APRIL;
        data[ 3] = 31;
        data[ 4] = 23;
        data[ 5] = 59;
        data[ 6] = 59;
        data[ 7] = DayOfWeekUtils.DAY_OF_WEEK_THURSDAY;
        data[ 8] = (byte) 255;
        data[ 9] = CurrentTime.ADJUST_REASON_NO_MANUAL_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_NO_EXTERNAL_REFEREMCE_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_CHANGE_OF_TIME_ZONE
                | CurrentTime.ADJUST_REASON_NO_CHANGE_OF_DST;
        //@formatter:on

        CurrentTime result1 = new CurrentTime(data);
        assertEquals(9999, result1.getYear());
        assertEquals(DateTimeUtils.MONTH_APRIL, result1.getMonth());
        assertEquals(31, result1.getDay());
        assertEquals(23, result1.getHours());
        assertEquals(59, result1.getMinutes());
        assertEquals(59, result1.getSeconds());
        assertEquals(DayOfWeekUtils.DAY_OF_WEEK_THURSDAY, result1.getDayOfWeek());
        assertEquals(255, result1.getFractions256());
        assertEquals(CurrentTime.ADJUST_REASON_NO_MANUAL_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_NO_CHANGE_OF_TIME_ZONE
                | CurrentTime.ADJUST_REASON_CHANGE_OF_TIME_ZONE
                | CurrentTime.ADJUST_REASON_NO_CHANGE_OF_DST, result1.getAdjustReason());
        assertTrue(result1.isAdjustReasonNoManualTimeUpdate());
        assertFalse(result1.isAdjustReasonManualTimeUpdate());
        assertTrue(result1.isAdjustReasonNoExternalReferenceTimeUpdate());
        assertFalse(result1.isAdjustReasonExternalReferenceTimeUpdate());
        assertFalse(result1.isAdjustReasonNoChangeOfTimeZone());
        assertTrue(result1.isAdjustReasonChangeOfTimeZone());
        assertTrue(result1.isAdjustReasonNoChangeOfDst());
        assertFalse(result1.isAdjustReasonChangeOfDst());
    }

    @Test
    public void test_constructor006() {
        //@formatter:off
        byte[] data = new byte[10];
        data[ 0] = (byte) 9999;
        data[ 1] = (byte) (9999 >> 8);
        data[ 2] = DateTimeUtils.MONTH_MAY;
        data[ 3] = 31;
        data[ 4] = 23;
        data[ 5] = 59;
        data[ 6] = 59;
        data[ 7] = DayOfWeekUtils.DAY_OF_WEEK_FRIDAY;
        data[ 8] = (byte) 255;
        data[ 9] = CurrentTime.ADJUST_REASON_MANUAL_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_NO_EXTERNAL_REFEREMCE_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_CHANGE_OF_TIME_ZONE
                | CurrentTime.ADJUST_REASON_NO_CHANGE_OF_DST;
        //@formatter:on

        CurrentTime result1 = new CurrentTime(data);
        assertEquals(9999, result1.getYear());
        assertEquals(DateTimeUtils.MONTH_MAY, result1.getMonth());
        assertEquals(31, result1.getDay());
        assertEquals(23, result1.getHours());
        assertEquals(59, result1.getMinutes());
        assertEquals(59, result1.getSeconds());
        assertEquals(DayOfWeekUtils.DAY_OF_WEEK_FRIDAY, result1.getDayOfWeek());
        assertEquals(255, result1.getFractions256());
        assertEquals(CurrentTime.ADJUST_REASON_MANUAL_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_NO_CHANGE_OF_TIME_ZONE
                | CurrentTime.ADJUST_REASON_CHANGE_OF_TIME_ZONE
                | CurrentTime.ADJUST_REASON_NO_CHANGE_OF_DST, result1.getAdjustReason());
        assertFalse(result1.isAdjustReasonNoManualTimeUpdate());
        assertTrue(result1.isAdjustReasonManualTimeUpdate());
        assertTrue(result1.isAdjustReasonNoExternalReferenceTimeUpdate());
        assertFalse(result1.isAdjustReasonExternalReferenceTimeUpdate());
        assertFalse(result1.isAdjustReasonNoChangeOfTimeZone());
        assertTrue(result1.isAdjustReasonChangeOfTimeZone());
        assertTrue(result1.isAdjustReasonNoChangeOfDst());
        assertFalse(result1.isAdjustReasonChangeOfDst());
    }

    @Test
    public void test_constructor007() {
        //@formatter:off
        byte[] data = new byte[10];
        data[ 0] = (byte) 9999;
        data[ 1] = (byte) (9999 >> 8);
        data[ 2] = DateTimeUtils.MONTH_JUNE;
        data[ 3] = 31;
        data[ 4] = 23;
        data[ 5] = 59;
        data[ 6] = 59;
        data[ 7] = DayOfWeekUtils.DAY_OF_WEEK_SATURDAY;
        data[ 8] = (byte) 255;
        data[ 9] = CurrentTime.ADJUST_REASON_NO_MANUAL_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_EXTERNAL_REFERENCE_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_CHANGE_OF_TIME_ZONE
                | CurrentTime.ADJUST_REASON_NO_CHANGE_OF_DST;
        //@formatter:on

        CurrentTime result1 = new CurrentTime(data);
        assertEquals(9999, result1.getYear());
        assertEquals(DateTimeUtils.MONTH_JUNE, result1.getMonth());
        assertEquals(31, result1.getDay());
        assertEquals(23, result1.getHours());
        assertEquals(59, result1.getMinutes());
        assertEquals(59, result1.getSeconds());
        assertEquals(DayOfWeekUtils.DAY_OF_WEEK_SATURDAY, result1.getDayOfWeek());
        assertEquals(255, result1.getFractions256());
        assertEquals(CurrentTime.ADJUST_REASON_NO_MANUAL_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_EXTERNAL_REFERENCE_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_CHANGE_OF_TIME_ZONE
                | CurrentTime.ADJUST_REASON_NO_CHANGE_OF_DST, result1.getAdjustReason());
        assertTrue(result1.isAdjustReasonNoManualTimeUpdate());
        assertFalse(result1.isAdjustReasonManualTimeUpdate());
        assertFalse(result1.isAdjustReasonNoExternalReferenceTimeUpdate());
        assertTrue(result1.isAdjustReasonExternalReferenceTimeUpdate());
        assertFalse(result1.isAdjustReasonNoChangeOfTimeZone());
        assertTrue(result1.isAdjustReasonChangeOfTimeZone());
        assertTrue(result1.isAdjustReasonNoChangeOfDst());
        assertFalse(result1.isAdjustReasonChangeOfDst());
    }

    @Test
    public void test_constructor008() {
        //@formatter:off
        byte[] data = new byte[10];
        data[ 0] = (byte) 9999;
        data[ 1] = (byte) (9999 >> 8);
        data[ 2] = DateTimeUtils.MONTH_JULY;
        data[ 3] = 31;
        data[ 4] = 23;
        data[ 5] = 59;
        data[ 6] = 59;
        data[ 7] = DayOfWeekUtils.DAY_OF_WEEK_SUNDAY;
        data[ 8] = (byte) 255;
        data[ 9] = CurrentTime.ADJUST_REASON_MANUAL_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_EXTERNAL_REFERENCE_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_CHANGE_OF_TIME_ZONE
                | CurrentTime.ADJUST_REASON_NO_CHANGE_OF_DST;
        //@formatter:on

        CurrentTime result1 = new CurrentTime(data);
        assertEquals(9999, result1.getYear());
        assertEquals(DateTimeUtils.MONTH_JULY, result1.getMonth());
        assertEquals(31, result1.getDay());
        assertEquals(23, result1.getHours());
        assertEquals(59, result1.getMinutes());
        assertEquals(59, result1.getSeconds());
        assertEquals(DayOfWeekUtils.DAY_OF_WEEK_SUNDAY, result1.getDayOfWeek());
        assertEquals(255, result1.getFractions256());
        assertEquals(CurrentTime.ADJUST_REASON_MANUAL_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_EXTERNAL_REFERENCE_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_CHANGE_OF_TIME_ZONE
                | CurrentTime.ADJUST_REASON_NO_CHANGE_OF_DST, result1.getAdjustReason());
        assertFalse(result1.isAdjustReasonNoManualTimeUpdate());
        assertTrue(result1.isAdjustReasonManualTimeUpdate());
        assertFalse(result1.isAdjustReasonNoExternalReferenceTimeUpdate());
        assertTrue(result1.isAdjustReasonExternalReferenceTimeUpdate());
        assertFalse(result1.isAdjustReasonNoChangeOfTimeZone());
        assertTrue(result1.isAdjustReasonChangeOfTimeZone());
        assertTrue(result1.isAdjustReasonNoChangeOfDst());
        assertFalse(result1.isAdjustReasonChangeOfDst());
    }

    @Test
    public void test_constructor009() {
        //@formatter:off
        byte[] data = new byte[10];
        data[ 0] = (byte) 9999;
        data[ 1] = (byte) (9999 >> 8);
        data[ 2] = DateTimeUtils.MONTH_AUGUST;
        data[ 3] = 31;
        data[ 4] = 23;
        data[ 5] = 59;
        data[ 6] = 59;
        data[ 7] = DayOfWeekUtils.DAY_OF_WEEK_SUNDAY;
        data[ 8] = (byte) 255;
        data[ 9] = CurrentTime.ADJUST_REASON_NO_MANUAL_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_NO_EXTERNAL_REFEREMCE_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_NO_CHANGE_OF_TIME_ZONE
                | CurrentTime.ADJUST_REASON_CHANGE_OF_DST;
        //@formatter:on

        CurrentTime result1 = new CurrentTime(data);
        assertEquals(9999, result1.getYear());
        assertEquals(DateTimeUtils.MONTH_AUGUST, result1.getMonth());
        assertEquals(31, result1.getDay());
        assertEquals(23, result1.getHours());
        assertEquals(59, result1.getMinutes());
        assertEquals(59, result1.getSeconds());
        assertEquals(DayOfWeekUtils.DAY_OF_WEEK_SUNDAY, result1.getDayOfWeek());
        assertEquals(255, result1.getFractions256());
        assertEquals(CurrentTime.ADJUST_REASON_NO_MANUAL_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_NO_EXTERNAL_REFEREMCE_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_NO_CHANGE_OF_TIME_ZONE
                | CurrentTime.ADJUST_REASON_CHANGE_OF_DST, result1.getAdjustReason());
        assertTrue(result1.isAdjustReasonNoManualTimeUpdate());
        assertFalse(result1.isAdjustReasonManualTimeUpdate());
        assertTrue(result1.isAdjustReasonNoExternalReferenceTimeUpdate());
        assertFalse(result1.isAdjustReasonExternalReferenceTimeUpdate());
        assertTrue(result1.isAdjustReasonNoChangeOfTimeZone());
        assertFalse(result1.isAdjustReasonChangeOfTimeZone());
        assertFalse(result1.isAdjustReasonNoChangeOfDst());
        assertTrue(result1.isAdjustReasonChangeOfDst());
    }

    @Test
    public void test_constructor010() {
        //@formatter:off
        byte[] data = new byte[10];
        data[ 0] = (byte) 9999;
        data[ 1] = (byte) (9999 >> 8);
        data[ 2] = DateTimeUtils.MONTH_SEPTEMBER;
        data[ 3] = 31;
        data[ 4] = 23;
        data[ 5] = 59;
        data[ 6] = 59;
        data[ 7] = DayOfWeekUtils.DAY_OF_WEEK_SUNDAY;
        data[ 8] = (byte) 255;
        data[ 9] = CurrentTime.ADJUST_REASON_MANUAL_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_NO_EXTERNAL_REFEREMCE_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_NO_CHANGE_OF_TIME_ZONE
                | CurrentTime.ADJUST_REASON_CHANGE_OF_DST;
        //@formatter:on

        CurrentTime result1 = new CurrentTime(data);
        assertEquals(9999, result1.getYear());
        assertEquals(DateTimeUtils.MONTH_SEPTEMBER, result1.getMonth());
        assertEquals(31, result1.getDay());
        assertEquals(23, result1.getHours());
        assertEquals(59, result1.getMinutes());
        assertEquals(59, result1.getSeconds());
        assertEquals(DayOfWeekUtils.DAY_OF_WEEK_SUNDAY, result1.getDayOfWeek());
        assertEquals(255, result1.getFractions256());
        assertEquals(CurrentTime.ADJUST_REASON_MANUAL_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_NO_EXTERNAL_REFEREMCE_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_NO_CHANGE_OF_TIME_ZONE
                | CurrentTime.ADJUST_REASON_CHANGE_OF_DST, result1.getAdjustReason());
        assertFalse(result1.isAdjustReasonNoManualTimeUpdate());
        assertTrue(result1.isAdjustReasonManualTimeUpdate());
        assertTrue(result1.isAdjustReasonNoExternalReferenceTimeUpdate());
        assertFalse(result1.isAdjustReasonExternalReferenceTimeUpdate());
        assertTrue(result1.isAdjustReasonNoChangeOfTimeZone());
        assertFalse(result1.isAdjustReasonChangeOfTimeZone());
        assertFalse(result1.isAdjustReasonNoChangeOfDst());
        assertTrue(result1.isAdjustReasonChangeOfDst());
    }

    @Test
    public void test_constructor011() {
        //@formatter:off
        byte[] data = new byte[10];
        data[ 0] = (byte) 9999;
        data[ 1] = (byte) (9999 >> 8);
        data[ 2] = DateTimeUtils.MONTH_OCTOBER;
        data[ 3] = 31;
        data[ 4] = 23;
        data[ 5] = 59;
        data[ 6] = 59;
        data[ 7] = DayOfWeekUtils.DAY_OF_WEEK_SUNDAY;
        data[ 8] = (byte) 255;
        data[ 9] = CurrentTime.ADJUST_REASON_NO_MANUAL_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_EXTERNAL_REFERENCE_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_NO_CHANGE_OF_TIME_ZONE
                | CurrentTime.ADJUST_REASON_CHANGE_OF_DST;
        //@formatter:on

        CurrentTime result1 = new CurrentTime(data);
        assertEquals(9999, result1.getYear());
        assertEquals(DateTimeUtils.MONTH_OCTOBER, result1.getMonth());
        assertEquals(31, result1.getDay());
        assertEquals(23, result1.getHours());
        assertEquals(59, result1.getMinutes());
        assertEquals(59, result1.getSeconds());
        assertEquals(DayOfWeekUtils.DAY_OF_WEEK_SUNDAY, result1.getDayOfWeek());
        assertEquals(255, result1.getFractions256());
        assertEquals(CurrentTime.ADJUST_REASON_NO_MANUAL_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_EXTERNAL_REFERENCE_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_NO_CHANGE_OF_TIME_ZONE
                | CurrentTime.ADJUST_REASON_CHANGE_OF_DST, result1.getAdjustReason());
        assertTrue(result1.isAdjustReasonNoManualTimeUpdate());
        assertFalse(result1.isAdjustReasonManualTimeUpdate());
        assertFalse(result1.isAdjustReasonNoExternalReferenceTimeUpdate());
        assertTrue(result1.isAdjustReasonExternalReferenceTimeUpdate());
        assertTrue(result1.isAdjustReasonNoChangeOfTimeZone());
        assertFalse(result1.isAdjustReasonChangeOfTimeZone());
        assertFalse(result1.isAdjustReasonNoChangeOfDst());
        assertTrue(result1.isAdjustReasonChangeOfDst());
    }

    @Test
    public void test_constructor012() {
        //@formatter:off
        byte[] data = new byte[10];
        data[ 0] = (byte) 9999;
        data[ 1] = (byte) (9999 >> 8);
        data[ 2] = DateTimeUtils.MONTH_NOVEMBER;
        data[ 3] = 31;
        data[ 4] = 23;
        data[ 5] = 59;
        data[ 6] = 59;
        data[ 7] = DayOfWeekUtils.DAY_OF_WEEK_SUNDAY;
        data[ 8] = (byte) 255;
        data[ 9] = CurrentTime.ADJUST_REASON_MANUAL_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_EXTERNAL_REFERENCE_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_NO_CHANGE_OF_TIME_ZONE
                | CurrentTime.ADJUST_REASON_CHANGE_OF_DST;
        //@formatter:on

        CurrentTime result1 = new CurrentTime(data);
        assertEquals(9999, result1.getYear());
        assertEquals(DateTimeUtils.MONTH_NOVEMBER, result1.getMonth());
        assertEquals(31, result1.getDay());
        assertEquals(23, result1.getHours());
        assertEquals(59, result1.getMinutes());
        assertEquals(59, result1.getSeconds());
        assertEquals(DayOfWeekUtils.DAY_OF_WEEK_SUNDAY, result1.getDayOfWeek());
        assertEquals(255, result1.getFractions256());
        assertEquals(CurrentTime.ADJUST_REASON_MANUAL_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_EXTERNAL_REFERENCE_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_NO_CHANGE_OF_TIME_ZONE
                | CurrentTime.ADJUST_REASON_CHANGE_OF_DST, result1.getAdjustReason());
        assertFalse(result1.isAdjustReasonNoManualTimeUpdate());
        assertTrue(result1.isAdjustReasonManualTimeUpdate());
        assertFalse(result1.isAdjustReasonNoExternalReferenceTimeUpdate());
        assertTrue(result1.isAdjustReasonExternalReferenceTimeUpdate());
        assertTrue(result1.isAdjustReasonNoChangeOfTimeZone());
        assertFalse(result1.isAdjustReasonChangeOfTimeZone());
        assertFalse(result1.isAdjustReasonNoChangeOfDst());
        assertTrue(result1.isAdjustReasonChangeOfDst());
    }

    @Test
    public void test_constructor013() {
        //@formatter:off
        byte[] data = new byte[10];
        data[ 0] = (byte) 9999;
        data[ 1] = (byte) (9999 >> 8);
        data[ 2] = DateTimeUtils.MONTH_DECEMBER;
        data[ 3] = 31;
        data[ 4] = 23;
        data[ 5] = 59;
        data[ 6] = 59;
        data[ 7] = DayOfWeekUtils.DAY_OF_WEEK_SUNDAY;
        data[ 8] = (byte) 255;
        data[ 9] = CurrentTime.ADJUST_REASON_NO_MANUAL_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_NO_EXTERNAL_REFEREMCE_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_CHANGE_OF_TIME_ZONE
                | CurrentTime.ADJUST_REASON_CHANGE_OF_DST;
        //@formatter:on

        CurrentTime result1 = new CurrentTime(data);
        assertEquals(9999, result1.getYear());
        assertEquals(DateTimeUtils.MONTH_DECEMBER, result1.getMonth());
        assertEquals(31, result1.getDay());
        assertEquals(23, result1.getHours());
        assertEquals(59, result1.getMinutes());
        assertEquals(59, result1.getSeconds());
        assertEquals(DayOfWeekUtils.DAY_OF_WEEK_SUNDAY, result1.getDayOfWeek());
        assertEquals(255, result1.getFractions256());
        assertEquals(CurrentTime.ADJUST_REASON_NO_MANUAL_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_NO_EXTERNAL_REFEREMCE_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_CHANGE_OF_TIME_ZONE
                | CurrentTime.ADJUST_REASON_CHANGE_OF_DST, result1.getAdjustReason());
        assertTrue(result1.isAdjustReasonNoManualTimeUpdate());
        assertFalse(result1.isAdjustReasonManualTimeUpdate());
        assertTrue(result1.isAdjustReasonNoExternalReferenceTimeUpdate());
        assertFalse(result1.isAdjustReasonExternalReferenceTimeUpdate());
        assertFalse(result1.isAdjustReasonNoChangeOfTimeZone());
        assertTrue(result1.isAdjustReasonChangeOfTimeZone());
        assertFalse(result1.isAdjustReasonNoChangeOfDst());
        assertTrue(result1.isAdjustReasonChangeOfDst());
    }

    @Test
    public void test_constructor014() {
        //@formatter:off
        byte[] data = new byte[10];
        data[ 0] = (byte) 9999;
        data[ 1] = (byte) (9999 >> 8);
        data[ 2] = DateTimeUtils.MONTH_DECEMBER;
        data[ 3] = 31;
        data[ 4] = 23;
        data[ 5] = 59;
        data[ 6] = 59;
        data[ 7] = DayOfWeekUtils.DAY_OF_WEEK_SUNDAY;
        data[ 8] = (byte) 255;
        data[ 9] = CurrentTime.ADJUST_REASON_MANUAL_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_NO_EXTERNAL_REFEREMCE_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_CHANGE_OF_TIME_ZONE
                | CurrentTime.ADJUST_REASON_CHANGE_OF_DST;
        //@formatter:on

        CurrentTime result1 = new CurrentTime(data);
        assertEquals(9999, result1.getYear());
        assertEquals(DateTimeUtils.MONTH_DECEMBER, result1.getMonth());
        assertEquals(31, result1.getDay());
        assertEquals(23, result1.getHours());
        assertEquals(59, result1.getMinutes());
        assertEquals(59, result1.getSeconds());
        assertEquals(DayOfWeekUtils.DAY_OF_WEEK_SUNDAY, result1.getDayOfWeek());
        assertEquals(255, result1.getFractions256());
        assertEquals(CurrentTime.ADJUST_REASON_MANUAL_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_NO_EXTERNAL_REFEREMCE_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_CHANGE_OF_TIME_ZONE
                | CurrentTime.ADJUST_REASON_CHANGE_OF_DST, result1.getAdjustReason());
        assertFalse(result1.isAdjustReasonNoManualTimeUpdate());
        assertTrue(result1.isAdjustReasonManualTimeUpdate());
        assertTrue(result1.isAdjustReasonNoExternalReferenceTimeUpdate());
        assertFalse(result1.isAdjustReasonExternalReferenceTimeUpdate());
        assertFalse(result1.isAdjustReasonNoChangeOfTimeZone());
        assertTrue(result1.isAdjustReasonChangeOfTimeZone());
        assertFalse(result1.isAdjustReasonNoChangeOfDst());
        assertTrue(result1.isAdjustReasonChangeOfDst());
    }

    @Test
    public void test_constructor015() {
        //@formatter:off
        byte[] data = new byte[10];
        data[ 0] = (byte) 9999;
        data[ 1] = (byte) (9999 >> 8);
        data[ 2] = DateTimeUtils.MONTH_DECEMBER;
        data[ 3] = 31;
        data[ 4] = 23;
        data[ 5] = 59;
        data[ 6] = 59;
        data[ 7] = DayOfWeekUtils.DAY_OF_WEEK_SUNDAY;
        data[ 8] = (byte) 255;
        data[ 9] = CurrentTime.ADJUST_REASON_NO_MANUAL_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_EXTERNAL_REFERENCE_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_CHANGE_OF_TIME_ZONE
                | CurrentTime.ADJUST_REASON_CHANGE_OF_DST;
        //@formatter:on

        CurrentTime result1 = new CurrentTime(data);
        assertEquals(9999, result1.getYear());
        assertEquals(DateTimeUtils.MONTH_DECEMBER, result1.getMonth());
        assertEquals(31, result1.getDay());
        assertEquals(23, result1.getHours());
        assertEquals(59, result1.getMinutes());
        assertEquals(59, result1.getSeconds());
        assertEquals(DayOfWeekUtils.DAY_OF_WEEK_SUNDAY, result1.getDayOfWeek());
        assertEquals(255, result1.getFractions256());
        assertEquals(CurrentTime.ADJUST_REASON_NO_MANUAL_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_EXTERNAL_REFERENCE_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_CHANGE_OF_TIME_ZONE
                | CurrentTime.ADJUST_REASON_CHANGE_OF_DST, result1.getAdjustReason());
        assertTrue(result1.isAdjustReasonNoManualTimeUpdate());
        assertFalse(result1.isAdjustReasonManualTimeUpdate());
        assertFalse(result1.isAdjustReasonNoExternalReferenceTimeUpdate());
        assertTrue(result1.isAdjustReasonExternalReferenceTimeUpdate());
        assertFalse(result1.isAdjustReasonNoChangeOfTimeZone());
        assertTrue(result1.isAdjustReasonChangeOfTimeZone());
        assertFalse(result1.isAdjustReasonNoChangeOfDst());
        assertTrue(result1.isAdjustReasonChangeOfDst());
    }

    @Test
    public void test_constructor016() {
        //@formatter:off
        byte[] data = new byte[10];
        data[ 0] = (byte) 9999;
        data[ 1] = (byte) (9999 >> 8);
        data[ 2] = DateTimeUtils.MONTH_DECEMBER;
        data[ 3] = 31;
        data[ 4] = 23;
        data[ 5] = 59;
        data[ 6] = 59;
        data[ 7] = DayOfWeekUtils.DAY_OF_WEEK_SUNDAY;
        data[ 8] = (byte) 255;
        data[ 9] = CurrentTime.ADJUST_REASON_MANUAL_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_EXTERNAL_REFERENCE_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_CHANGE_OF_TIME_ZONE
                | CurrentTime.ADJUST_REASON_CHANGE_OF_DST;
        //@formatter:on

        CurrentTime result1 = new CurrentTime(data);
        assertEquals(9999, result1.getYear());
        assertEquals(DateTimeUtils.MONTH_DECEMBER, result1.getMonth());
        assertEquals(31, result1.getDay());
        assertEquals(23, result1.getHours());
        assertEquals(59, result1.getMinutes());
        assertEquals(59, result1.getSeconds());
        assertEquals(DayOfWeekUtils.DAY_OF_WEEK_SUNDAY, result1.getDayOfWeek());
        assertEquals(255, result1.getFractions256());
        assertEquals(CurrentTime.ADJUST_REASON_MANUAL_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_EXTERNAL_REFERENCE_TIME_UPDATE
                | CurrentTime.ADJUST_REASON_CHANGE_OF_TIME_ZONE
                | CurrentTime.ADJUST_REASON_CHANGE_OF_DST, result1.getAdjustReason());
        assertFalse(result1.isAdjustReasonNoManualTimeUpdate());
        assertTrue(result1.isAdjustReasonManualTimeUpdate());
        assertFalse(result1.isAdjustReasonNoExternalReferenceTimeUpdate());
        assertTrue(result1.isAdjustReasonExternalReferenceTimeUpdate());
        assertFalse(result1.isAdjustReasonNoChangeOfTimeZone());
        assertTrue(result1.isAdjustReasonChangeOfTimeZone());
        assertFalse(result1.isAdjustReasonNoChangeOfDst());
        assertTrue(result1.isAdjustReasonChangeOfDst());
    }

    @Test
    public void test_constructor017() {
        int year = 1;
        int month = 2;
        int day = 3;
        int hours = 4;
        int minutes = 5;
        int seconds = 6;
        int dayOfWeek = 7;
        int fractions256 = 8;
        int adjustReason = 9;

        CurrentTime result1 = new CurrentTime(year, month, day, hours, minutes, seconds, dayOfWeek, fractions256, adjustReason);
        assertEquals(year, result1.getYear());
        assertEquals(month, result1.getMonth());
        assertEquals(day, result1.getDay());
        assertEquals(hours, result1.getHours());
        assertEquals(minutes, result1.getMinutes());
        assertEquals(seconds, result1.getSeconds());
        assertEquals(dayOfWeek, result1.getDayOfWeek());
        assertEquals(fractions256, result1.getFractions256());
        assertEquals(adjustReason, result1.getAdjustReason());
    }

    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] data = new byte[10];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        data[ 4] = 0x05;
        data[ 5] = 0x06;
        data[ 6] = 0x07;
        data[ 7] = 0x08;
        data[ 8] = 0x09;
        data[ 9] = 0x0a;
        //@formatter:on

        CurrentTime result1 = new CurrentTime(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
