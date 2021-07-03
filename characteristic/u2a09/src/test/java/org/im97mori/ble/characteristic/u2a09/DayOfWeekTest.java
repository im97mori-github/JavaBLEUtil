package org.im97mori.ble.characteristic.u2a09;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.characteristic.core.DayOfWeekUtils;
import org.junit.Test;

public class DayOfWeekTest {

    @Test
    public void test_constructor_00001() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = DayOfWeekUtils.DAY_OF_WEEK_IS_NOT_KNOWN;
        //@formatter:on

        DayOfWeek result1 = new DayOfWeek(data);
        assertEquals(DayOfWeekUtils.DAY_OF_WEEK_IS_NOT_KNOWN, result1.getDayOfWeek());
        assertTrue(result1.isDayOfWeekNotKnown());
        assertFalse(result1.isDayOfWeekMonday());
        assertFalse(result1.isDayOfWeekTuesday());
        assertFalse(result1.isDayOfWeekWednesday());
        assertFalse(result1.isDayOfWeekThursday());
        assertFalse(result1.isDayOfWeekFriday());
        assertFalse(result1.isDayOfWeekSaturday());
        assertFalse(result1.isDayOfWeekSunday());
    }
    
    @Test
    public void test_constructor_00002() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = DayOfWeekUtils.DAY_OF_WEEK_MONDAY;
        //@formatter:on

        DayOfWeek result1 = new DayOfWeek(data);
        assertEquals(DayOfWeekUtils.DAY_OF_WEEK_MONDAY, result1.getDayOfWeek());
        assertFalse(result1.isDayOfWeekNotKnown());
        assertTrue(result1.isDayOfWeekMonday());
        assertFalse(result1.isDayOfWeekTuesday());
        assertFalse(result1.isDayOfWeekWednesday());
        assertFalse(result1.isDayOfWeekThursday());
        assertFalse(result1.isDayOfWeekFriday());
        assertFalse(result1.isDayOfWeekSaturday());
        assertFalse(result1.isDayOfWeekSunday());
    }
    
    @Test
    public void test_constructor_00003() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = DayOfWeekUtils.DAY_OF_WEEK_TUESDAY;
        //@formatter:on

        DayOfWeek result1 = new DayOfWeek(data);
        assertEquals(DayOfWeekUtils.DAY_OF_WEEK_TUESDAY, result1.getDayOfWeek());
        assertFalse(result1.isDayOfWeekNotKnown());
        assertFalse(result1.isDayOfWeekMonday());
        assertTrue(result1.isDayOfWeekTuesday());
        assertFalse(result1.isDayOfWeekWednesday());
        assertFalse(result1.isDayOfWeekThursday());
        assertFalse(result1.isDayOfWeekFriday());
        assertFalse(result1.isDayOfWeekSaturday());
        assertFalse(result1.isDayOfWeekSunday());
    }
    
    @Test
    public void test_constructor_00004() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = DayOfWeekUtils.DAY_OF_WEEK_WEDNESDAY;
        //@formatter:on

        DayOfWeek result1 = new DayOfWeek(data);
        assertEquals(DayOfWeekUtils.DAY_OF_WEEK_WEDNESDAY, result1.getDayOfWeek());
        assertFalse(result1.isDayOfWeekNotKnown());
        assertFalse(result1.isDayOfWeekMonday());
        assertFalse(result1.isDayOfWeekTuesday());
        assertTrue(result1.isDayOfWeekWednesday());
        assertFalse(result1.isDayOfWeekThursday());
        assertFalse(result1.isDayOfWeekFriday());
        assertFalse(result1.isDayOfWeekSaturday());
        assertFalse(result1.isDayOfWeekSunday());
    }
    
    @Test
    public void test_constructor_00005() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = DayOfWeekUtils.DAY_OF_WEEK_THURSDAY;
        //@formatter:on

        DayOfWeek result1 = new DayOfWeek(data);
        assertEquals(DayOfWeekUtils.DAY_OF_WEEK_THURSDAY, result1.getDayOfWeek());
        assertFalse(result1.isDayOfWeekNotKnown());
        assertFalse(result1.isDayOfWeekMonday());
        assertFalse(result1.isDayOfWeekTuesday());
        assertFalse(result1.isDayOfWeekWednesday());
        assertTrue(result1.isDayOfWeekThursday());
        assertFalse(result1.isDayOfWeekFriday());
        assertFalse(result1.isDayOfWeekSaturday());
        assertFalse(result1.isDayOfWeekSunday());
    }
    
    @Test
    public void test_constructor_00006() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = DayOfWeekUtils.DAY_OF_WEEK_FRIDAY;
        //@formatter:on

        DayOfWeek result1 = new DayOfWeek(data);
        assertEquals(DayOfWeekUtils.DAY_OF_WEEK_FRIDAY, result1.getDayOfWeek());
        assertFalse(result1.isDayOfWeekNotKnown());
        assertFalse(result1.isDayOfWeekMonday());
        assertFalse(result1.isDayOfWeekTuesday());
        assertFalse(result1.isDayOfWeekWednesday());
        assertFalse(result1.isDayOfWeekThursday());
        assertTrue(result1.isDayOfWeekFriday());
        assertFalse(result1.isDayOfWeekSaturday());
        assertFalse(result1.isDayOfWeekSunday());
    }
    
    @Test
    public void test_constructor_00007() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = DayOfWeekUtils.DAY_OF_WEEK_SATURDAY;
        //@formatter:on

        DayOfWeek result1 = new DayOfWeek(data);
        assertEquals(DayOfWeekUtils.DAY_OF_WEEK_SATURDAY, result1.getDayOfWeek());
        assertFalse(result1.isDayOfWeekNotKnown());
        assertFalse(result1.isDayOfWeekMonday());
        assertFalse(result1.isDayOfWeekTuesday());
        assertFalse(result1.isDayOfWeekWednesday());
        assertFalse(result1.isDayOfWeekThursday());
        assertFalse(result1.isDayOfWeekFriday());
        assertTrue(result1.isDayOfWeekSaturday());
        assertFalse(result1.isDayOfWeekSunday());
    }
    
    @Test
    public void test_constructor_00008() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = DayOfWeekUtils.DAY_OF_WEEK_SUNDAY;
        //@formatter:on

        DayOfWeek result1 = new DayOfWeek(data);
        assertEquals(DayOfWeekUtils.DAY_OF_WEEK_SUNDAY, result1.getDayOfWeek());
        assertFalse(result1.isDayOfWeekNotKnown());
        assertFalse(result1.isDayOfWeekMonday());
        assertFalse(result1.isDayOfWeekTuesday());
        assertFalse(result1.isDayOfWeekWednesday());
        assertFalse(result1.isDayOfWeekThursday());
        assertFalse(result1.isDayOfWeekFriday());
        assertFalse(result1.isDayOfWeekSaturday());
        assertTrue(result1.isDayOfWeekSunday());
    }

    @Test
    public void test_parcelable_00100() {
        //@formatter:off
        byte[] data = new byte[1];
        data[ 0] = 0x01;
        //@formatter:on

        DayOfWeek result1 = new DayOfWeek(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
