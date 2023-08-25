package org.im97mori.ble.characteristic.u2a6a;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class LNFeatureTest extends TestBase {

    @Test
    public void test_constructor001() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getLNFeature());
        assertTrue(result1.isLNFeatureInstantaneousSpeedNotSupported());
        assertFalse(result1.isLNFeatureInstantaneousSpeedSupported());
    }

    @Test
    public void test_constructor002() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_TRUE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getLNFeature());
        assertFalse(result1.isLNFeatureInstantaneousSpeedNotSupported());
        assertTrue(result1.isLNFeatureInstantaneousSpeedSupported());
    }

    @Test
    public void test_constructor003() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getLNFeature());
        assertTrue(result1.isLNFeatureTotalDistanceNotSupported());
        assertFalse(result1.isLNFeatureTotalDistanceSupported());
    }

    @Test
    public void test_constructor004() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_TRUE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getLNFeature());
        assertFalse(result1.isLNFeatureTotalDistanceNotSupported());
        assertTrue(result1.isLNFeatureTotalDistanceSupported());
    }

    @Test
    public void test_constructor005() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getLNFeature());
        assertTrue(result1.isLNFeatureLocationNotSupported());
        assertFalse(result1.isLNFeatureLocationSupported());
    }

    @Test
    public void test_constructor006() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_TRUE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getLNFeature());
        assertFalse(result1.isLNFeatureLocationNotSupported());
        assertTrue(result1.isLNFeatureLocationSupported());
    }

    @Test
    public void test_constructor007() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getLNFeature());
        assertTrue(result1.isLNFeatureElevationNotSupported());
        assertFalse(result1.isLNFeatureElevationSupported());
    }

    @Test
    public void test_constructor008() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_TRUE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getLNFeature());
        assertFalse(result1.isLNFeatureElevationNotSupported());
        assertTrue(result1.isLNFeatureElevationSupported());
    }

    @Test
    public void test_constructor009() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getLNFeature());
        assertTrue(result1.isLNFeatureHeadingNotSupported());
        assertFalse(result1.isLNFeatureHeadingSupported());
    }

    @Test
    public void test_constructor010() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_TRUE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getLNFeature());
        assertFalse(result1.isLNFeatureHeadingNotSupported());
        assertTrue(result1.isLNFeatureHeadingSupported());
    }

    @Test
    public void test_constructor011() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getLNFeature());
        assertTrue(result1.isLNFeatureRollingTimeNotSupported());
        assertFalse(result1.isLNFeatureRollingTimeSupported());
    }

    @Test
    public void test_constructor012() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_TRUE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getLNFeature());
        assertFalse(result1.isLNFeatureRollingTimeNotSupported());
        assertTrue(result1.isLNFeatureRollingTimeSupported());
    }

    @Test
    public void test_constructor013() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getLNFeature());
        assertTrue(result1.isLNFeatureUtcTimeNotSupported());
        assertFalse(result1.isLNFeatureUtcTimeSupported());
    }

    @Test
    public void test_constructor014() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_TRUE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getLNFeature());
        assertFalse(result1.isLNFeatureUtcTimeNotSupported());
        assertTrue(result1.isLNFeatureUtcTimeSupported());
    }

    @Test
    public void test_constructor015() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getLNFeature());
        assertTrue(result1.isLNFeatureRemainingDistanceNotSupported());
        assertFalse(result1.isLNFeatureRemainingDistanceSupported());
    }

    @Test
    public void test_constructor016() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_TRUE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getLNFeature());
        assertFalse(result1.isLNFeatureRemainingDistanceNotSupported());
        assertTrue(result1.isLNFeatureRemainingDistanceSupported());
    }

    @Test
    public void test_constructor017() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getLNFeature());
        assertTrue(result1.isLNFeatureRemainingVerticalDistanceNotSupported());
        assertFalse(result1.isLNFeatureRemainingVerticalDistanceSupported());
    }

    @Test
    public void test_constructor018() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_TRUE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getLNFeature());
        assertFalse(result1.isLNFeatureRemainingVerticalDistanceNotSupported());
        assertTrue(result1.isLNFeatureRemainingVerticalDistanceSupported());
    }

    @Test
    public void test_constructor019() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getLNFeature());
        assertTrue(result1.isLNFeatureEstimatedTimeOfArrivalNotSupported());
        assertFalse(result1.isLNFeatureEstimatedTimeOfArrivalSupported());
    }

    @Test
    public void test_constructor020() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_TRUE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getLNFeature());
        assertFalse(result1.isLNFeatureEstimatedTimeOfArrivalNotSupported());
        assertTrue(result1.isLNFeatureEstimatedTimeOfArrivalSupported());
    }

    @Test
    public void test_constructor021() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getLNFeature());
        assertTrue(result1.isLNFeatureNumberOfBeaconsInSolutionNotSupported());
        assertFalse(result1.isLNFeatureNumberOfBeaconsInSolutionSupported());
    }

    @Test
    public void test_constructor022() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_TRUE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getLNFeature());
        assertFalse(result1.isLNFeatureNumberOfBeaconsInSolutionNotSupported());
        assertTrue(result1.isLNFeatureNumberOfBeaconsInSolutionSupported());
    }

    @Test
    public void test_constructor023() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getLNFeature());
        assertTrue(result1.isLNFeatureNumberOfBeaconsInViewNotSupported());
        assertFalse(result1.isLNFeatureNumberOfBeaconsInViewSupported());
    }

    @Test
    public void test_constructor024() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_TRUE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getLNFeature());
        assertFalse(result1.isLNFeatureNumberOfBeaconsInViewNotSupported());
        assertTrue(result1.isLNFeatureNumberOfBeaconsInViewSupported());
    }

    @Test
    public void test_constructor025() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getLNFeature());
        assertTrue(result1.isLNFeatureTimeToFirstFixNotSupported());
        assertFalse(result1.isLNFeatureTimeToFirstFixSupported());
    }

    @Test
    public void test_constructor026() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_TRUE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getLNFeature());
        assertFalse(result1.isLNFeatureTimeToFirstFixNotSupported());
        assertTrue(result1.isLNFeatureTimeToFirstFixSupported());
    }

    @Test
    public void test_constructor027() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getLNFeature());
        assertTrue(result1.isLNFeatureEstimatedHorizontalPositionErrorNotSupported());
        assertFalse(result1.isLNFeatureEstimatedHorizontalPositionErrorSupported());
    }

    @Test
    public void test_constructor028() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_TRUE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getLNFeature());
        assertFalse(result1.isLNFeatureEstimatedHorizontalPositionErrorNotSupported());
        assertTrue(result1.isLNFeatureEstimatedHorizontalPositionErrorSupported());
    }

    @Test
    public void test_constructor029() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getLNFeature());
        assertTrue(result1.isLNFeatureEstimatedVerticalPositionErrorNotSupported());
        assertFalse(result1.isLNFeatureEstimatedVerticalPositionErrorSupported());
    }

    @Test
    public void test_constructor030() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_TRUE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getLNFeature());
        assertFalse(result1.isLNFeatureEstimatedVerticalPositionErrorNotSupported());
        assertTrue(result1.isLNFeatureEstimatedVerticalPositionErrorSupported());
    }

    @Test
    public void test_constructor031() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getLNFeature());
        assertTrue(result1.isLNFeatureHorizontalDilutionOfPrecisionNotSupported());
        assertFalse(result1.isLNFeatureHorizontalDilutionOfPrecisionSupported());
    }

    @Test
    public void test_constructor032() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_TRUE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getLNFeature());
        assertFalse(result1.isLNFeatureHorizontalDilutionOfPrecisionNotSupported());
        assertTrue(result1.isLNFeatureHorizontalDilutionOfPrecisionSupported());
    }

    @Test
    public void test_constructor033() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getLNFeature());
        assertTrue(result1.isLNFeatureVerticalDilutionOfPrecisionNotSupported());
        assertFalse(result1.isLNFeatureVerticalDilutionOfPrecisionSupported());
    }

    @Test
    public void test_constructor034() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_TRUE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getLNFeature());
        assertFalse(result1.isLNFeatureVerticalDilutionOfPrecisionNotSupported());
        assertTrue(result1.isLNFeatureVerticalDilutionOfPrecisionSupported());
    }

    @Test
    public void test_constructor035() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getLNFeature());
        assertTrue(result1.isLNFeatureLocationAndSpeedCharacteristicContentMaskingNotSupported());
        assertFalse(result1.isLNFeatureLocationAndSpeedCharacteristicContentMaskingSupported());
    }

    @Test
    public void test_constructor036() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_TRUE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getLNFeature());
        assertFalse(result1.isLNFeatureLocationAndSpeedCharacteristicContentMaskingNotSupported());
        assertTrue(result1.isLNFeatureLocationAndSpeedCharacteristicContentMaskingSupported());
    }

    @Test
    public void test_constructor037() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getLNFeature());
        assertTrue(result1.isLNFeatureFixRateSettingNotSupported());
        assertFalse(result1.isLNFeatureFixRateSettingSupported());
    }

    @Test
    public void test_constructor038() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_TRUE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getLNFeature());
        assertFalse(result1.isLNFeatureFixRateSettingNotSupported());
        assertTrue(result1.isLNFeatureFixRateSettingSupported());
    }

    @Test
    public void test_constructor039() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getLNFeature());
        assertTrue(result1.isLNFeatureElevationSettingNotSupported());
        assertFalse(result1.isLNFeatureElevationSettingSupported());
    }

    @Test
    public void test_constructor040() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_TRUE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getLNFeature());
        assertFalse(result1.isLNFeatureElevationSettingNotSupported());
        assertTrue(result1.isLNFeatureElevationSettingSupported());
    }

    @Test
    public void test_constructor041() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getLNFeature());
        assertTrue(result1.isLNFeaturePositionStatusNotSupported());
        assertFalse(result1.isLNFeaturePositionStatusSupported());
    }

    @Test
    public void test_constructor042() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_TRUE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getLNFeature());
        assertFalse(result1.isLNFeaturePositionStatusNotSupported());
        assertTrue(result1.isLNFeaturePositionStatusSupported());
    }

    @Test
    public void test_constructor101() {
        LNFeature result1 = new LNFeature(
                true
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false);
        assertFalse(result1.isLNFeatureInstantaneousSpeedNotSupported());
        assertTrue(result1.isLNFeatureInstantaneousSpeedSupported());
    }
    
    @Test
    public void test_constructor102() {
        LNFeature result1 = new LNFeature(
                false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false);
        assertTrue(result1.isLNFeatureInstantaneousSpeedNotSupported());
        assertFalse(result1.isLNFeatureInstantaneousSpeedSupported());
    }
    
    @Test
    public void test_constructor103() {
        LNFeature result1 = new LNFeature(
                false
                ,true
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false);
        assertFalse(result1.isLNFeatureTotalDistanceNotSupported());
        assertTrue(result1.isLNFeatureTotalDistanceSupported());
    }
    
    @Test
    public void test_constructor104() {
        LNFeature result1 = new LNFeature(
                false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false);
        assertTrue(result1.isLNFeatureTotalDistanceNotSupported());
        assertFalse(result1.isLNFeatureTotalDistanceSupported());
    }
    
    @Test
    public void test_constructor105() {
        LNFeature result1 = new LNFeature(
                false
                ,false
                ,true
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false);
        assertFalse(result1.isLNFeatureLocationNotSupported());
        assertTrue(result1.isLNFeatureLocationSupported());
    }
    
    @Test
    public void test_constructor106() {
        LNFeature result1 = new LNFeature(
                false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false);
        assertTrue(result1.isLNFeatureLocationNotSupported());
        assertFalse(result1.isLNFeatureLocationSupported());
    }

    @Test
    public void test_constructor107() {
        LNFeature result1 = new LNFeature(
                false
                ,false
                ,false
                ,true
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false);
        assertFalse(result1.isLNFeatureElevationNotSupported());
        assertTrue(result1.isLNFeatureElevationSupported());
    }
    
    @Test
    public void test_constructor108() {
        LNFeature result1 = new LNFeature(
                false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false);
        assertTrue(result1.isLNFeatureElevationNotSupported());
        assertFalse(result1.isLNFeatureElevationSupported());
    }
    
    @Test
    public void test_constructor109() {
        LNFeature result1 = new LNFeature(
                false
                ,false
                ,false
                ,false
                ,true
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false);
        assertFalse(result1.isLNFeatureHeadingNotSupported());
        assertTrue(result1.isLNFeatureHeadingSupported());
    }
    
    @Test
    public void test_constructor110() {
        LNFeature result1 = new LNFeature(
                false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false);
        assertTrue(result1.isLNFeatureHeadingNotSupported());
        assertFalse(result1.isLNFeatureHeadingSupported());
    }
    
    @Test
    public void test_constructor111() {
        LNFeature result1 = new LNFeature(
                false
                ,false
                ,false
                ,false
                ,false
                ,true
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false);
        assertFalse(result1.isLNFeatureRollingTimeNotSupported());
        assertTrue(result1.isLNFeatureRollingTimeSupported());
    }
    
    @Test
    public void test_constructor112() {
        LNFeature result1 = new LNFeature(
                false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false);
        assertTrue(result1.isLNFeatureRollingTimeNotSupported());
        assertFalse(result1.isLNFeatureRollingTimeSupported());
    }
    
    @Test
    public void test_constructor113() {
        LNFeature result1 = new LNFeature(
                false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,true
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false);
        assertFalse(result1.isLNFeatureUtcTimeNotSupported());
        assertTrue(result1.isLNFeatureUtcTimeSupported());
    }
    
    @Test
    public void test_constructor114() {
        LNFeature result1 = new LNFeature(
                false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false);
        assertTrue(result1.isLNFeatureUtcTimeNotSupported());
        assertFalse(result1.isLNFeatureUtcTimeSupported());
    }
    
    @Test
    public void test_constructor115() {
        LNFeature result1 = new LNFeature(
                false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,true
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false);
        assertFalse(result1.isLNFeatureRemainingDistanceNotSupported());
        assertTrue(result1.isLNFeatureRemainingDistanceSupported());
    }
    
    @Test
    public void test_constructor116() {
        LNFeature result1 = new LNFeature(
                false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false);
        assertTrue(result1.isLNFeatureRemainingDistanceNotSupported());
        assertFalse(result1.isLNFeatureRemainingDistanceSupported());
    }
    
    @Test
    public void test_constructor117() {
        LNFeature result1 = new LNFeature(
                false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,true
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false);
        assertFalse(result1.isLNFeatureRemainingVerticalDistanceNotSupported());
        assertTrue(result1.isLNFeatureRemainingVerticalDistanceSupported());
    }
    
    @Test
    public void test_constructor118() {
        LNFeature result1 = new LNFeature(
                false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false);
        assertTrue(result1.isLNFeatureRemainingVerticalDistanceNotSupported());
        assertFalse(result1.isLNFeatureRemainingVerticalDistanceSupported());
    }
    
    @Test
    public void test_constructor119() {
        LNFeature result1 = new LNFeature(
                false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,true
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false);
        assertFalse(result1.isLNFeatureEstimatedTimeOfArrivalNotSupported());
        assertTrue(result1.isLNFeatureEstimatedTimeOfArrivalSupported());
    }
    
    @Test
    public void test_constructor120() {
        LNFeature result1 = new LNFeature(
                false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false);
        assertTrue(result1.isLNFeatureEstimatedTimeOfArrivalNotSupported());
        assertFalse(result1.isLNFeatureEstimatedTimeOfArrivalSupported());
    }
    
    @Test
    public void test_constructor121() {
        LNFeature result1 = new LNFeature(
                false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,true
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false);
        assertFalse(result1.isLNFeatureNumberOfBeaconsInSolutionNotSupported());
        assertTrue(result1.isLNFeatureNumberOfBeaconsInSolutionSupported());
    }
    
    @Test
    public void test_constructor122() {
        LNFeature result1 = new LNFeature(
                false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false);
        assertTrue(result1.isLNFeatureNumberOfBeaconsInSolutionNotSupported());
        assertFalse(result1.isLNFeatureNumberOfBeaconsInSolutionSupported());
    }
    
    @Test
    public void test_constructor123() {
        LNFeature result1 = new LNFeature(
                false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,true
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false);
        assertFalse(result1.isLNFeatureNumberOfBeaconsInViewNotSupported());
        assertTrue(result1.isLNFeatureNumberOfBeaconsInViewSupported());
    }
    
    @Test
    public void test_constructor124() {
        LNFeature result1 = new LNFeature(
                false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false);
        assertTrue(result1.isLNFeatureNumberOfBeaconsInViewNotSupported());
        assertFalse(result1.isLNFeatureNumberOfBeaconsInViewSupported());
    }
    
    @Test
    public void test_constructor125() {
        LNFeature result1 = new LNFeature(
                false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,true
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false);
        assertFalse(result1.isLNFeatureTimeToFirstFixNotSupported());
        assertTrue(result1.isLNFeatureTimeToFirstFixSupported());
    }
    
    @Test
    public void test_constructor126() {
        LNFeature result1 = new LNFeature(
                false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false);
        assertTrue(result1.isLNFeatureTimeToFirstFixNotSupported());
        assertFalse(result1.isLNFeatureTimeToFirstFixSupported());
    }
    
    @Test
    public void test_constructor127() {
        LNFeature result1 = new LNFeature(
                false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,true
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false);
        assertFalse(result1.isLNFeatureEstimatedHorizontalPositionErrorNotSupported());
        assertTrue(result1.isLNFeatureEstimatedHorizontalPositionErrorSupported());
    }
    
    @Test
    public void test_constructor128() {
        LNFeature result1 = new LNFeature(
                false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false);
        assertTrue(result1.isLNFeatureEstimatedHorizontalPositionErrorNotSupported());
        assertFalse(result1.isLNFeatureEstimatedHorizontalPositionErrorSupported());
    }
    
    @Test
    public void test_constructor129() {
        LNFeature result1 = new LNFeature(
                false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,true
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false);
        assertFalse(result1.isLNFeatureEstimatedVerticalPositionErrorNotSupported());
        assertTrue(result1.isLNFeatureEstimatedVerticalPositionErrorSupported());
    }
    
    @Test
    public void test_constructor130() {
        LNFeature result1 = new LNFeature(
                false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false);
        assertTrue(result1.isLNFeatureEstimatedVerticalPositionErrorNotSupported());
        assertFalse(result1.isLNFeatureEstimatedVerticalPositionErrorSupported());
    }
    
    @Test
    public void test_constructor131() {
        LNFeature result1 = new LNFeature(
                false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,true
                ,false
                ,false
                ,false
                ,false
                ,false);
        assertFalse(result1.isLNFeatureHorizontalDilutionOfPrecisionNotSupported());
        assertTrue(result1.isLNFeatureHorizontalDilutionOfPrecisionSupported());
    }
    
    @Test
    public void test_constructor132() {
        LNFeature result1 = new LNFeature(
                false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false);
        assertTrue(result1.isLNFeatureHorizontalDilutionOfPrecisionNotSupported());
        assertFalse(result1.isLNFeatureHorizontalDilutionOfPrecisionSupported());
    }
    
    @Test
    public void test_constructor133() {
        LNFeature result1 = new LNFeature(
                false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,true
                ,false
                ,false
                ,false
                ,false);
        assertFalse(result1.isLNFeatureVerticalDilutionOfPrecisionNotSupported());
        assertTrue(result1.isLNFeatureVerticalDilutionOfPrecisionSupported());
    }
    
    @Test
    public void test_constructor134() {
        LNFeature result1 = new LNFeature(
                false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false);
        assertTrue(result1.isLNFeatureVerticalDilutionOfPrecisionNotSupported());
        assertFalse(result1.isLNFeatureVerticalDilutionOfPrecisionSupported());
    }
    
    @Test
    public void test_constructor135() {
        LNFeature result1 = new LNFeature(
                false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,true
                ,false
                ,false
                ,false);
        assertFalse(result1.isLNFeatureLocationAndSpeedCharacteristicContentMaskingNotSupported());
        assertTrue(result1.isLNFeatureLocationAndSpeedCharacteristicContentMaskingSupported());
    }
    
    @Test
    public void test_constructor136() {
        LNFeature result1 = new LNFeature(
                false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false);
        assertTrue(result1.isLNFeatureLocationAndSpeedCharacteristicContentMaskingNotSupported());
        assertFalse(result1.isLNFeatureLocationAndSpeedCharacteristicContentMaskingSupported());
    }
    
    @Test
    public void test_constructor137() {
        LNFeature result1 = new LNFeature(
                false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,true
                ,false
                ,false);
        assertFalse(result1.isLNFeatureFixRateSettingNotSupported());
        assertTrue(result1.isLNFeatureFixRateSettingSupported());
    }
    
    @Test
    public void test_constructor138() {
        LNFeature result1 = new LNFeature(
                false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false);
        assertTrue(result1.isLNFeatureFixRateSettingNotSupported());
        assertFalse(result1.isLNFeatureFixRateSettingSupported());
    }
    
    @Test
    public void test_constructor139() {
        LNFeature result1 = new LNFeature(
                false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,true
                ,false);
        assertFalse(result1.isLNFeatureElevationSettingNotSupported());
        assertTrue(result1.isLNFeatureElevationSettingSupported());
    }
    
    @Test
    public void test_constructor140() {
        LNFeature result1 = new LNFeature(
                false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false);
        assertTrue(result1.isLNFeatureElevationSettingNotSupported());
        assertFalse(result1.isLNFeatureElevationSettingSupported());
    }
    
    @Test
    public void test_constructor141() {
        LNFeature result1 = new LNFeature(
                false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,true);
        assertFalse(result1.isLNFeaturePositionStatusNotSupported());
        assertTrue(result1.isLNFeaturePositionStatusSupported());
    }
    
    @Test
    public void test_constructor142() {
        LNFeature result1 = new LNFeature(
                false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false
                ,false);
        assertTrue(result1.isLNFeaturePositionStatusNotSupported());
        assertFalse(result1.isLNFeaturePositionStatusSupported());
    }
    
    @Test
    public void test_parcelable101() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable102() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_TRUE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable103() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable104() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_TRUE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable105() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable106() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_TRUE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable107() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable108() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_TRUE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable109() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable110() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_TRUE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable111() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable112() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_TRUE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable113() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable114() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_TRUE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable115() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable116() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_TRUE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable117() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable118() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_TRUE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable119() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable120() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_TRUE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable121() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable122() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_TRUE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable123() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable124() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable125() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_TRUE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable126() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_TRUE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable127() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable128() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_TRUE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable129() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable130() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_TRUE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable131() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable132() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_TRUE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable133() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable134() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_TRUE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable135() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable136() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_TRUE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable137() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable138() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_TRUE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable139() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable140() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_TRUE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable141() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

    @Test
    public void test_parcelable142() {
        int flags = LNFeature.LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HEADING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
                | LNFeature.LN_FEATURE_POSITION_STATUS_SUPPORTED_TRUE;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        LNFeature result1 = new LNFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
