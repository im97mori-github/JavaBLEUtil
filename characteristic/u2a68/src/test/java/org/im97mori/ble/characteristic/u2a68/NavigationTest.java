package org.im97mori.ble.characteristic.u2a68;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.im97mori.ble.characteristic.core.DateTimeUtils;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class NavigationTest extends TestBase {

    @Test
    public void test_constructor001() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_FALSE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(result1.isFlagsRemainigDistanceNotPresent());
        assertFalse(result1.isFlagsRemainigDistancePresent());
        assertEquals(0x0201, result1.getBearing());
        assertEquals(Navigation.BEARING_RESOLUTION * 0x0201, result1.getBearingDegrees(), 0);
        assertEquals(0x0403, result1.getHeading());
        assertEquals(Navigation.HEADING_RESOLUTION * 0x0403, result1.getHeadingDegrees(), 0);
    }

    @Test
    public void test_constructor002() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_TRUE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_FALSE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[9];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        data[ 6] = 0x05;
        data[ 7] = 0x06;
        data[ 8] = 0x07;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(result1.isFlagsRemainigDistanceNotPresent());
        assertTrue(result1.isFlagsRemainigDistancePresent());
        assertEquals(0x0201, result1.getBearing());
        assertEquals(Navigation.BEARING_RESOLUTION * 0x0201, result1.getBearingDegrees(), 0);
        assertEquals(0x0403, result1.getHeading());
        assertEquals(Navigation.HEADING_RESOLUTION * 0x0403, result1.getHeadingDegrees(), 0);
        assertEquals(0x070605, result1.getRemainingDistance());
        assertEquals(Navigation.REMAINING_DISTANCE_RESOLUTION * 0x070605, result1.getRemainingDistanceMeters(), 0);
    }

    @Test
    public void test_constructor003() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_FALSE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(result1.isFlagsRemainigVerticalDistanceNotPresent());
        assertFalse(result1.isFlagsRemainigVerticalDistancePresent());
        assertEquals(0x0201, result1.getBearing());
        assertEquals(Navigation.BEARING_RESOLUTION * 0x0201, result1.getBearingDegrees(), 0);
        assertEquals(0x0403, result1.getHeading());
        assertEquals(Navigation.HEADING_RESOLUTION * 0x0403, result1.getHeadingDegrees(), 0);
    }

    @Test
    public void test_constructor004() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_TRUE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_FALSE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[9];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        data[ 6] = 0x05;
        data[ 7] = 0x06;
        data[ 8] = 0x07;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(result1.isFlagsRemainigVerticalDistanceNotPresent());
        assertTrue(result1.isFlagsRemainigVerticalDistancePresent());
        assertEquals(0x0201, result1.getBearing());
        assertEquals(Navigation.BEARING_RESOLUTION * 0x0201, result1.getBearingDegrees(), 0);
        assertEquals(0x0403, result1.getHeading());
        assertEquals(Navigation.HEADING_RESOLUTION * 0x0403, result1.getHeadingDegrees(), 0);
        assertEquals(0x070605, result1.getRemainingVerticalDistance());
        assertEquals(Navigation.REMAINING_VERTICAL_DISTANCE_RESOLUTION * 0x070605, result1.getRemainingVerticalDistanceMeters(), 0);
    }

    @Test
    public void test_constructor005() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_FALSE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(result1.isFlagsEstimatedTimeOfArrivalNotPresent());
        assertFalse(result1.isFlagsEstimatedTimeOfArrivalPresent());
        assertEquals(0x0201, result1.getBearing());
        assertEquals(Navigation.BEARING_RESOLUTION * 0x0201, result1.getBearingDegrees(), 0);
        assertEquals(0x0403, result1.getHeading());
        assertEquals(Navigation.HEADING_RESOLUTION * 0x0403, result1.getHeadingDegrees(), 0);
    }

    @Test
    public void test_constructor006() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_TRUE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[13];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        data[ 6] = (byte) 1582;
        data[ 7] = (byte) (1582 >> 8);
        data[ 8] = DateTimeUtils.MONTH_IS_NOT_KNOWN;
        data[ 9] = DateTimeUtils.DAY_OF_MONTH_IS_NOT_KNOWN;
        data[10] = 0;
        data[11] = 0;
        data[12] = 0;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(result1.isFlagsEstimatedTimeOfArrivalNotPresent());
        assertTrue(result1.isFlagsEstimatedTimeOfArrivalPresent());
        assertEquals(0x0201, result1.getBearing());
        assertEquals(Navigation.BEARING_RESOLUTION * 0x0201, result1.getBearingDegrees(), 0);
        assertEquals(0x0403, result1.getHeading());
        assertEquals(Navigation.HEADING_RESOLUTION * 0x0403, result1.getHeadingDegrees(), 0);
        assertEquals(1582, result1.getYear());
        assertEquals(DateTimeUtils.DAY_OF_MONTH_IS_NOT_KNOWN, result1.getMonth());
        assertEquals(0, result1.getDay());
        assertEquals(0, result1.getHours());
        assertEquals(0, result1.getMinutes());
        assertEquals(0, result1.getSeconds());
    }

    @Test
    public void test_constructor007() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_TRUE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[13];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        data[ 6] = (byte) 9999;
        data[ 7] = (byte) (9999 >> 8);
        data[ 8] = DateTimeUtils.MONTH_JANUARY;
        data[ 9] = 1;
        data[10] = 23;
        data[11] = 59;
        data[12] = 59;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(result1.isFlagsEstimatedTimeOfArrivalNotPresent());
        assertTrue(result1.isFlagsEstimatedTimeOfArrivalPresent());
        assertEquals(0x0201, result1.getBearing());
        assertEquals(Navigation.BEARING_RESOLUTION * 0x0201, result1.getBearingDegrees(), 0);
        assertEquals(0x0403, result1.getHeading());
        assertEquals(Navigation.HEADING_RESOLUTION * 0x0403, result1.getHeadingDegrees(), 0);
        assertEquals(9999, result1.getYear());
        assertEquals(DateTimeUtils.MONTH_JANUARY, result1.getMonth());
        assertEquals(1, result1.getDay());
        assertEquals(23, result1.getHours());
        assertEquals(59, result1.getMinutes());
        assertEquals(59, result1.getSeconds());
    }

    @Test
    public void test_constructor008() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_TRUE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[13];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        data[ 6] = (byte) 9999;
        data[ 7] = (byte) (9999 >> 8);
        data[ 8] = DateTimeUtils.MONTH_FEBRUARY;
        data[ 9] = 31;
        data[10] = 0;
        data[11] = 0;
        data[12] = 0;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(result1.isFlagsEstimatedTimeOfArrivalNotPresent());
        assertTrue(result1.isFlagsEstimatedTimeOfArrivalPresent());
        assertEquals(0x0201, result1.getBearing());
        assertEquals(Navigation.BEARING_RESOLUTION * 0x0201, result1.getBearingDegrees(), 0);
        assertEquals(0x0403, result1.getHeading());
        assertEquals(Navigation.HEADING_RESOLUTION * 0x0403, result1.getHeadingDegrees(), 0);
        assertEquals(9999, result1.getYear());
        assertEquals(DateTimeUtils.MONTH_FEBRUARY, result1.getMonth());
        assertEquals(31, result1.getDay());
        assertEquals(0, result1.getHours());
        assertEquals(0, result1.getMinutes());
        assertEquals(0, result1.getSeconds());
    }

    @Test
    public void test_constructor009() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_TRUE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[13];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        data[ 6] = (byte) 9999;
        data[ 7] = (byte) (9999 >> 8);
        data[ 8] = DateTimeUtils.MONTH_MARCH;
        data[ 9] = 31;
        data[10] = 0;
        data[11] = 0;
        data[12] = 0;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(result1.isFlagsEstimatedTimeOfArrivalNotPresent());
        assertTrue(result1.isFlagsEstimatedTimeOfArrivalPresent());
        assertEquals(0x0201, result1.getBearing());
        assertEquals(Navigation.BEARING_RESOLUTION * 0x0201, result1.getBearingDegrees(), 0);
        assertEquals(0x0403, result1.getHeading());
        assertEquals(Navigation.HEADING_RESOLUTION * 0x0403, result1.getHeadingDegrees(), 0);
        assertEquals(9999, result1.getYear());
        assertEquals(DateTimeUtils.MONTH_MARCH, result1.getMonth());
        assertEquals(31, result1.getDay());
        assertEquals(0, result1.getHours());
        assertEquals(0, result1.getMinutes());
        assertEquals(0, result1.getSeconds());
    }

    @Test
    public void test_constructor010() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_TRUE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[13];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        data[ 6] = (byte) 9999;
        data[ 7] = (byte) (9999 >> 8);
        data[ 8] = DateTimeUtils.MONTH_APRIL;
        data[ 9] = 31;
        data[10] = 0;
        data[11] = 0;
        data[12] = 0;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(result1.isFlagsEstimatedTimeOfArrivalNotPresent());
        assertTrue(result1.isFlagsEstimatedTimeOfArrivalPresent());
        assertEquals(0x0201, result1.getBearing());
        assertEquals(Navigation.BEARING_RESOLUTION * 0x0201, result1.getBearingDegrees(), 0);
        assertEquals(0x0403, result1.getHeading());
        assertEquals(Navigation.HEADING_RESOLUTION * 0x0403, result1.getHeadingDegrees(), 0);
        assertEquals(9999, result1.getYear());
        assertEquals(DateTimeUtils.MONTH_APRIL, result1.getMonth());
        assertEquals(31, result1.getDay());
        assertEquals(0, result1.getHours());
        assertEquals(0, result1.getMinutes());
        assertEquals(0, result1.getSeconds());
    }

    @Test
    public void test_constructor011() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_TRUE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[13];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        data[ 6] = (byte) 9999;
        data[ 7] = (byte) (9999 >> 8);
        data[ 8] = DateTimeUtils.MONTH_MAY;
        data[ 9] = 31;
        data[10] = 0;
        data[11] = 0;
        data[12] = 0;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(result1.isFlagsEstimatedTimeOfArrivalNotPresent());
        assertTrue(result1.isFlagsEstimatedTimeOfArrivalPresent());
        assertEquals(0x0201, result1.getBearing());
        assertEquals(Navigation.BEARING_RESOLUTION * 0x0201, result1.getBearingDegrees(), 0);
        assertEquals(0x0403, result1.getHeading());
        assertEquals(Navigation.HEADING_RESOLUTION * 0x0403, result1.getHeadingDegrees(), 0);
        assertEquals(9999, result1.getYear());
        assertEquals(DateTimeUtils.MONTH_MAY, result1.getMonth());
        assertEquals(31, result1.getDay());
        assertEquals(0, result1.getHours());
        assertEquals(0, result1.getMinutes());
        assertEquals(0, result1.getSeconds());
    }

    @Test
    public void test_constructor012() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_TRUE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[13];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        data[ 6] = (byte) 9999;
        data[ 7] = (byte) (9999 >> 8);
        data[ 8] = DateTimeUtils.MONTH_JUNE;
        data[ 9] = 31;
        data[10] = 0;
        data[11] = 0;
        data[12] = 0;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(result1.isFlagsEstimatedTimeOfArrivalNotPresent());
        assertTrue(result1.isFlagsEstimatedTimeOfArrivalPresent());
        assertEquals(0x0201, result1.getBearing());
        assertEquals(Navigation.BEARING_RESOLUTION * 0x0201, result1.getBearingDegrees(), 0);
        assertEquals(0x0403, result1.getHeading());
        assertEquals(Navigation.HEADING_RESOLUTION * 0x0403, result1.getHeadingDegrees(), 0);
        assertEquals(9999, result1.getYear());
        assertEquals(DateTimeUtils.MONTH_JUNE, result1.getMonth());
        assertEquals(31, result1.getDay());
        assertEquals(0, result1.getHours());
        assertEquals(0, result1.getMinutes());
        assertEquals(0, result1.getSeconds());
    }

    @Test
    public void test_constructor013() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_TRUE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[13];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        data[ 6] = (byte) 9999;
        data[ 7] = (byte) (9999 >> 8);
        data[ 8] = DateTimeUtils.MONTH_JULY;
        data[ 9] = 31;
        data[10] = 0;
        data[11] = 0;
        data[12] = 0;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(result1.isFlagsEstimatedTimeOfArrivalNotPresent());
        assertTrue(result1.isFlagsEstimatedTimeOfArrivalPresent());
        assertEquals(0x0201, result1.getBearing());
        assertEquals(Navigation.BEARING_RESOLUTION * 0x0201, result1.getBearingDegrees(), 0);
        assertEquals(0x0403, result1.getHeading());
        assertEquals(Navigation.HEADING_RESOLUTION * 0x0403, result1.getHeadingDegrees(), 0);
        assertEquals(9999, result1.getYear());
        assertEquals(DateTimeUtils.MONTH_JULY, result1.getMonth());
        assertEquals(31, result1.getDay());
        assertEquals(0, result1.getHours());
        assertEquals(0, result1.getMinutes());
        assertEquals(0, result1.getSeconds());
    }

    @Test
    public void test_constructor014() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_TRUE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[13];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        data[ 6] = (byte) 9999;
        data[ 7] = (byte) (9999 >> 8);
        data[ 8] = DateTimeUtils.MONTH_AUGUST;
        data[ 9] = 31;
        data[10] = 0;
        data[11] = 0;
        data[12] = 0;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(result1.isFlagsEstimatedTimeOfArrivalNotPresent());
        assertTrue(result1.isFlagsEstimatedTimeOfArrivalPresent());
        assertEquals(0x0201, result1.getBearing());
        assertEquals(Navigation.BEARING_RESOLUTION * 0x0201, result1.getBearingDegrees(), 0);
        assertEquals(0x0403, result1.getHeading());
        assertEquals(Navigation.HEADING_RESOLUTION * 0x0403, result1.getHeadingDegrees(), 0);
        assertEquals(9999, result1.getYear());
        assertEquals(DateTimeUtils.MONTH_AUGUST, result1.getMonth());
        assertEquals(31, result1.getDay());
        assertEquals(0, result1.getHours());
        assertEquals(0, result1.getMinutes());
        assertEquals(0, result1.getSeconds());
    }

    @Test
    public void test_constructor015() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_TRUE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[13];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        data[ 6] = (byte) 9999;
        data[ 7] = (byte) (9999 >> 8);
        data[ 8] = DateTimeUtils.MONTH_SEPTEMBER;
        data[ 9] = 31;
        data[10] = 0;
        data[11] = 0;
        data[12] = 0;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(result1.isFlagsEstimatedTimeOfArrivalNotPresent());
        assertTrue(result1.isFlagsEstimatedTimeOfArrivalPresent());
        assertEquals(0x0201, result1.getBearing());
        assertEquals(Navigation.BEARING_RESOLUTION * 0x0201, result1.getBearingDegrees(), 0);
        assertEquals(0x0403, result1.getHeading());
        assertEquals(Navigation.HEADING_RESOLUTION * 0x0403, result1.getHeadingDegrees(), 0);
        assertEquals(9999, result1.getYear());
        assertEquals(DateTimeUtils.MONTH_SEPTEMBER, result1.getMonth());
        assertEquals(31, result1.getDay());
        assertEquals(0, result1.getHours());
        assertEquals(0, result1.getMinutes());
        assertEquals(0, result1.getSeconds());
    }

    @Test
    public void test_constructor016() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_TRUE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[13];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        data[ 6] = (byte) 9999;
        data[ 7] = (byte) (9999 >> 8);
        data[ 8] = DateTimeUtils.MONTH_OCTOBER;
        data[ 9] = 31;
        data[10] = 0;
        data[11] = 0;
        data[12] = 0;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(result1.isFlagsEstimatedTimeOfArrivalNotPresent());
        assertTrue(result1.isFlagsEstimatedTimeOfArrivalPresent());
        assertEquals(0x0201, result1.getBearing());
        assertEquals(Navigation.BEARING_RESOLUTION * 0x0201, result1.getBearingDegrees(), 0);
        assertEquals(0x0403, result1.getHeading());
        assertEquals(Navigation.HEADING_RESOLUTION * 0x0403, result1.getHeadingDegrees(), 0);
        assertEquals(9999, result1.getYear());
        assertEquals(DateTimeUtils.MONTH_OCTOBER, result1.getMonth());
        assertEquals(31, result1.getDay());
        assertEquals(0, result1.getHours());
        assertEquals(0, result1.getMinutes());
        assertEquals(0, result1.getSeconds());
    }

    @Test
    public void test_constructor017() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_TRUE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[13];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        data[ 6] = (byte) 9999;
        data[ 7] = (byte) (9999 >> 8);
        data[ 8] = DateTimeUtils.MONTH_NOVEMBER;
        data[ 9] = 31;
        data[10] = 0;
        data[11] = 0;
        data[12] = 0;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(result1.isFlagsEstimatedTimeOfArrivalNotPresent());
        assertTrue(result1.isFlagsEstimatedTimeOfArrivalPresent());
        assertEquals(0x0201, result1.getBearing());
        assertEquals(Navigation.BEARING_RESOLUTION * 0x0201, result1.getBearingDegrees(), 0);
        assertEquals(0x0403, result1.getHeading());
        assertEquals(Navigation.HEADING_RESOLUTION * 0x0403, result1.getHeadingDegrees(), 0);
        assertEquals(9999, result1.getYear());
        assertEquals(DateTimeUtils.MONTH_NOVEMBER, result1.getMonth());
        assertEquals(31, result1.getDay());
        assertEquals(0, result1.getHours());
        assertEquals(0, result1.getMinutes());
        assertEquals(0, result1.getSeconds());
    }

    @Test
    public void test_constructor018() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_TRUE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[13];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        data[ 6] = (byte) 9999;
        data[ 7] = (byte) (9999 >> 8);
        data[ 8] = DateTimeUtils.MONTH_DECEMBER;
        data[ 9] = 31;
        data[10] = 0;
        data[11] = 0;
        data[12] = 0;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(result1.isFlagsEstimatedTimeOfArrivalNotPresent());
        assertTrue(result1.isFlagsEstimatedTimeOfArrivalPresent());
        assertEquals(0x0201, result1.getBearing());
        assertEquals(Navigation.BEARING_RESOLUTION * 0x0201, result1.getBearingDegrees(), 0);
        assertEquals(0x0403, result1.getHeading());
        assertEquals(Navigation.HEADING_RESOLUTION * 0x0403, result1.getHeadingDegrees(), 0);
        assertEquals(9999, result1.getYear());
        assertEquals(DateTimeUtils.MONTH_DECEMBER, result1.getMonth());
        assertEquals(31, result1.getDay());
        assertEquals(0, result1.getHours());
        assertEquals(0, result1.getMinutes());
        assertEquals(0, result1.getSeconds());
    }

    @Test
    public void test_constructor019() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_FALSE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(result1.isFlagsPositionStatusNoPosition());
        assertFalse(result1.isFlagsPositionStatusPositionOk());
        assertFalse(result1.isFlagsPositionStatusEstimatedPosition());
        assertFalse(result1.isFlagsPositionStatusLastKnownPosition());
        assertEquals(0x0201, result1.getBearing());
        assertEquals(Navigation.BEARING_RESOLUTION * 0x0201, result1.getBearingDegrees(), 0);
        assertEquals(0x0403, result1.getHeading());
        assertEquals(Navigation.HEADING_RESOLUTION * 0x0403, result1.getHeadingDegrees(), 0);
    }

    @Test
    public void test_constructor020() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_FALSE
                | Navigation.FLAGS_POSITION_STATUS_POSITION_OK
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(result1.isFlagsPositionStatusNoPosition());
        assertTrue(result1.isFlagsPositionStatusPositionOk());
        assertFalse(result1.isFlagsPositionStatusEstimatedPosition());
        assertFalse(result1.isFlagsPositionStatusLastKnownPosition());
        assertEquals(0x0201, result1.getBearing());
        assertEquals(Navigation.BEARING_RESOLUTION * 0x0201, result1.getBearingDegrees(), 0);
        assertEquals(0x0403, result1.getHeading());
        assertEquals(Navigation.HEADING_RESOLUTION * 0x0403, result1.getHeadingDegrees(), 0);
    }

    @Test
    public void test_constructor021() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_FALSE
                | Navigation.FLAGS_POSITION_STATUS_ESTIMATED_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MAGNETIC_COMPASS
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(result1.isFlagsPositionStatusNoPosition());
        assertFalse(result1.isFlagsPositionStatusPositionOk());
        assertTrue(result1.isFlagsPositionStatusEstimatedPosition());
        assertFalse(result1.isFlagsPositionStatusLastKnownPosition());
        assertEquals(0x0201, result1.getBearing());
        assertEquals(Navigation.BEARING_RESOLUTION * 0x0201, result1.getBearingDegrees(), 0);
        assertEquals(0x0403, result1.getHeading());
        assertEquals(Navigation.HEADING_RESOLUTION * 0x0403, result1.getHeadingDegrees(), 0);
    }

    @Test
    public void test_constructor022() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_FALSE
                | Navigation.FLAGS_POSITION_STATUS_LAST_KNOWN_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(result1.isFlagsPositionStatusNoPosition());
        assertFalse(result1.isFlagsPositionStatusPositionOk());
        assertFalse(result1.isFlagsPositionStatusEstimatedPosition());
        assertTrue(result1.isFlagsPositionStatusLastKnownPosition());
        assertEquals(0x0201, result1.getBearing());
        assertEquals(Navigation.BEARING_RESOLUTION * 0x0201, result1.getBearingDegrees(), 0);
        assertEquals(0x0403, result1.getHeading());
        assertEquals(Navigation.HEADING_RESOLUTION * 0x0403, result1.getHeadingDegrees(), 0);
    }

    @Test
    public void test_constructor023() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_FALSE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(result1.isFlagsHeadingSourceBasedOnMovement());
        assertFalse(result1.isFlagsHeadingSourceBasedOnMagneticCompass());
        assertEquals(0x0201, result1.getBearing());
        assertEquals(Navigation.BEARING_RESOLUTION * 0x0201, result1.getBearingDegrees(), 0);
        assertEquals(0x0403, result1.getHeading());
        assertEquals(Navigation.HEADING_RESOLUTION * 0x0403, result1.getHeadingDegrees(), 0);
    }

    @Test
    public void test_constructor024() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_FALSE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MAGNETIC_COMPASS
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(result1.isFlagsHeadingSourceBasedOnMovement());
        assertTrue(result1.isFlagsHeadingSourceBasedOnMagneticCompass());
        assertEquals(0x0201, result1.getBearing());
        assertEquals(Navigation.BEARING_RESOLUTION * 0x0201, result1.getBearingDegrees(), 0);
        assertEquals(0x0403, result1.getHeading());
        assertEquals(Navigation.HEADING_RESOLUTION * 0x0403, result1.getHeadingDegrees(), 0);
    }

    @Test
    public void test_constructor025() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_FALSE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(result1.isFlagsNavigationIndicatorTypeToWaypoint());
        assertFalse(result1.isFlagsNavigationIndicatorTypeToDestination());
        assertEquals(0x0201, result1.getBearing());
        assertEquals(Navigation.BEARING_RESOLUTION * 0x0201, result1.getBearingDegrees(), 0);
        assertEquals(0x0403, result1.getHeading());
        assertEquals(Navigation.HEADING_RESOLUTION * 0x0403, result1.getHeadingDegrees(), 0);
    }

    @Test
    public void test_constructor026() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_FALSE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MAGNETIC_COMPASS
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_DESTINATION
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(result1.isFlagsNavigationIndicatorTypeToWaypoint());
        assertTrue(result1.isFlagsNavigationIndicatorTypeToDestination());
        assertEquals(0x0201, result1.getBearing());
        assertEquals(Navigation.BEARING_RESOLUTION * 0x0201, result1.getBearingDegrees(), 0);
        assertEquals(0x0403, result1.getHeading());
        assertEquals(Navigation.HEADING_RESOLUTION * 0x0403, result1.getHeadingDegrees(), 0);
    }

    @Test
    public void test_constructor027() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_FALSE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(result1.isFlagsWaypointNotReached());
        assertFalse(result1.isFlagsWaypointReached());
        assertEquals(0x0201, result1.getBearing());
        assertEquals(Navigation.BEARING_RESOLUTION * 0x0201, result1.getBearingDegrees(), 0);
        assertEquals(0x0403, result1.getHeading());
        assertEquals(Navigation.HEADING_RESOLUTION * 0x0403, result1.getHeadingDegrees(), 0);
    }

    @Test
    public void test_constructor028() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_FALSE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_DESTINATION
                | Navigation.FLAGS_WAYPOINT_REACHED_TRUE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(result1.isFlagsWaypointNotReached());
        assertTrue(result1.isFlagsWaypointReached());
        assertEquals(0x0201, result1.getBearing());
        assertEquals(Navigation.BEARING_RESOLUTION * 0x0201, result1.getBearingDegrees(), 0);
        assertEquals(0x0403, result1.getHeading());
        assertEquals(Navigation.HEADING_RESOLUTION * 0x0403, result1.getHeadingDegrees(), 0);
    }

    @Test
    public void test_constructor029() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_FALSE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertTrue(result1.isFlagsDestinationNotReached());
        assertFalse(result1.isFlagsDestinationReached());
        assertEquals(0x0201, result1.getBearing());
        assertEquals(Navigation.BEARING_RESOLUTION * 0x0201, result1.getBearingDegrees(), 0);
        assertEquals(0x0403, result1.getHeading());
        assertEquals(Navigation.HEADING_RESOLUTION * 0x0403, result1.getHeadingDegrees(), 0);
    }

    @Test
    public void test_constructor030() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_FALSE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_DESTINATION
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_TRUE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(Arrays.copyOfRange(data, 0, 2), result1.getFlags());
        assertFalse(result1.isFlagsDestinationNotReached());
        assertTrue(result1.isFlagsDestinationReached());
        assertEquals(0x0201, result1.getBearing());
        assertEquals(Navigation.BEARING_RESOLUTION * 0x0201, result1.getBearingDegrees(), 0);
        assertEquals(0x0403, result1.getHeading());
        assertEquals(Navigation.HEADING_RESOLUTION * 0x0403, result1.getHeadingDegrees(), 0);
    }

    @Test
    public void test_constructor031() {
        byte[] flags = new byte[] { 1 };
        int bearing = 2;
        int heading = 3;
        int remainingDistance = 4;
        int remainingVerticalDistance = 5;
        int year = 6;
        int month = 7;
        int day = 8;
        int hours = 9;
        int minutes = 10;
        int seconds = 11;

        Navigation result1 = new Navigation(flags, bearing, heading, remainingDistance, remainingVerticalDistance, year, month, day, hours, minutes, seconds);
        assertArrayEquals(flags, result1.getFlags());
        assertEquals(bearing, result1.getBearing());
        assertEquals(heading, result1.getHeading());
        assertEquals(remainingDistance, result1.getRemainingDistance());
        assertEquals(remainingVerticalDistance, result1.getRemainingVerticalDistance());
        assertEquals(year, result1.getYear());
        assertEquals(month, result1.getMonth());
        assertEquals(day, result1.getDay());
        assertEquals(hours, result1.getHours());
        assertEquals(minutes, result1.getMinutes());
        assertEquals(seconds, result1.getSeconds());
    }

    @Test
    public void test_parcelable101() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_FALSE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable102() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_TRUE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_FALSE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[9];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        data[ 6] = 0x05;
        data[ 7] = 0x06;
        data[ 8] = 0x07;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable103() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_FALSE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable104() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_TRUE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_FALSE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[9];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        data[ 6] = 0x05;
        data[ 7] = 0x06;
        data[ 8] = 0x07;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable105() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_FALSE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable106() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_TRUE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[13];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        data[ 6] = (byte) 1582;
        data[ 7] = (byte) (1582 >> 8);
        data[ 8] = DateTimeUtils.MONTH_IS_NOT_KNOWN;
        data[ 9] = DateTimeUtils.DAY_OF_MONTH_IS_NOT_KNOWN;
        data[10] = 0;
        data[11] = 0;
        data[12] = 0;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable107() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_TRUE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[13];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        data[ 6] = (byte) 9999;
        data[ 7] = (byte) (9999 >> 8);
        data[ 8] = DateTimeUtils.MONTH_JANUARY;
        data[ 9] = 1;
        data[10] = 23;
        data[11] = 59;
        data[12] = 59;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable108() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_TRUE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[13];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        data[ 6] = (byte) 9999;
        data[ 7] = (byte) (9999 >> 8);
        data[ 8] = DateTimeUtils.MONTH_FEBRUARY;
        data[ 9] = 31;
        data[10] = 0;
        data[11] = 0;
        data[12] = 0;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable109() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_FALSE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable110() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_TRUE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[13];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        data[ 6] = (byte) 9999;
        data[ 7] = (byte) (9999 >> 8);
        data[ 8] = DateTimeUtils.MONTH_MARCH;
        data[ 9] = 31;
        data[10] = 0;
        data[11] = 0;
        data[12] = 0;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable111() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_TRUE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[13];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        data[ 6] = (byte) 9999;
        data[ 7] = (byte) (9999 >> 8);
        data[ 8] = DateTimeUtils.MONTH_MAY;
        data[ 9] = 31;
        data[10] = 0;
        data[11] = 0;
        data[12] = 0;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable112() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_TRUE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[13];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        data[ 6] = (byte) 9999;
        data[ 7] = (byte) (9999 >> 8);
        data[ 8] = DateTimeUtils.MONTH_JUNE;
        data[ 9] = 31;
        data[10] = 0;
        data[11] = 0;
        data[12] = 0;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable113() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_TRUE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[13];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        data[ 6] = (byte) 9999;
        data[ 7] = (byte) (9999 >> 8);
        data[ 8] = DateTimeUtils.MONTH_JULY;
        data[ 9] = 31;
        data[10] = 0;
        data[11] = 0;
        data[12] = 0;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable114() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_TRUE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[13];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        data[ 6] = (byte) 9999;
        data[ 7] = (byte) (9999 >> 8);
        data[ 8] = DateTimeUtils.MONTH_AUGUST;
        data[ 9] = 31;
        data[10] = 0;
        data[11] = 0;
        data[12] = 0;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable115() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_TRUE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[13];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        data[ 6] = (byte) 9999;
        data[ 7] = (byte) (9999 >> 8);
        data[ 8] = DateTimeUtils.MONTH_SEPTEMBER;
        data[ 9] = 31;
        data[10] = 0;
        data[11] = 0;
        data[12] = 0;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable116() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_TRUE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[13];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        data[ 6] = (byte) 9999;
        data[ 7] = (byte) (9999 >> 8);
        data[ 8] = DateTimeUtils.MONTH_OCTOBER;
        data[ 9] = 31;
        data[10] = 0;
        data[11] = 0;
        data[12] = 0;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable117() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_TRUE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[13];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        data[ 6] = (byte) 9999;
        data[ 7] = (byte) (9999 >> 8);
        data[ 8] = DateTimeUtils.MONTH_NOVEMBER;
        data[ 9] = 31;
        data[10] = 0;
        data[11] = 0;
        data[12] = 0;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable118() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_TRUE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[13];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        data[ 6] = (byte) 9999;
        data[ 7] = (byte) (9999 >> 8);
        data[ 8] = DateTimeUtils.MONTH_DECEMBER;
        data[ 9] = 31;
        data[10] = 0;
        data[11] = 0;
        data[12] = 0;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable119() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_FALSE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable120() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_FALSE
                | Navigation.FLAGS_POSITION_STATUS_POSITION_OK
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable121() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_FALSE
                | Navigation.FLAGS_POSITION_STATUS_ESTIMATED_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MAGNETIC_COMPASS
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable122() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_FALSE
                | Navigation.FLAGS_POSITION_STATUS_LAST_KNOWN_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable123() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_FALSE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable124() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_FALSE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MAGNETIC_COMPASS
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable125() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_FALSE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable126() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_FALSE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MAGNETIC_COMPASS
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_DESTINATION
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable127() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_FALSE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable128() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_FALSE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_DESTINATION
                | Navigation.FLAGS_WAYPOINT_REACHED_TRUE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable129() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_FALSE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_WAYPOINT
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_FALSE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable130() {
        int flags = Navigation.FLAGS_REMAINING_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_REMAINING_VERTICAL_DISTANCE_PRESENT_FALSE
                | Navigation.FLAGS_ESTIMATED_TIME_OF_ARRIVAL_PRESENT_FALSE
                | Navigation.FLAGS_POSITION_STATUS_NO_POSITION
                | Navigation.FLAGS_HEADING_SOURCE_HEADING_BASED_ON_MOVEMENT
                | Navigation.FLAGS_NAVIGATION_INDICATOR_TYPE_TO_DESTINATION
                | Navigation.FLAGS_WAYPOINT_REACHED_FALSE
                | Navigation.FLAGS_DESTINATION_REACHED_TRUE;
        //@formatter:off
        byte[] data = new byte[6];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = 0x01;
        data[ 3] = 0x02;
        data[ 4] = 0x03;
        data[ 5] = 0x04;
        //@formatter:on

        Navigation result1 = new Navigation(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
