package org.im97mori.ble.characteristic.u2a6a;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * LN Feature (Characteristics UUID: 0x2A6A)
 */
public class LNFeature implements ByteArrayInterface {

    /**
     * @see #LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE
     * @see #LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_TRUE
     */
    public static final int LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_MASK = 0b00000000_00000000_00000001;

    /**
     * 0: Instantaneous Speed Supported False
     */
    public static final int LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE = 0b00000000_00000000_00000000;

    /**
     * 1: Instantaneous Speed Supported True
     */
    public static final int LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_TRUE = 0b00000000_00000000_00000001;

    /**
     * @see #LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE
     * @see #LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_TRUE
     */
    public static final int LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_MASK = 0b00000000_00000000_00000010;

    /**
     * 0: Total Distance Supported False
     */
    public static final int LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE = 0b00000000_00000000_00000000;

    /**
     * 1: Total Distance Supported True
     */
    public static final int LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_TRUE = 0b00000000_00000000_00000010;

    /**
     * @see #LN_FEATURE_LOCATION_SUPPORTED_FALSE
     * @see #LN_FEATURE_LOCATION_SUPPORTED_TRUE
     */
    public static final int LN_FEATURE_LOCATION_SUPPORTED_MASK = 0b00000000_00000000_00000100;

    /**
     * 0: Location Supported False
     */
    public static final int LN_FEATURE_LOCATION_SUPPORTED_FALSE = 0b00000000_00000000_00000000;

    /**
     * 1: Location Supported True
     */
    public static final int LN_FEATURE_LOCATION_SUPPORTED_TRUE = 0b00000000_00000000_00000100;

    /**
     * @see #LN_FEATURE_ELEVATION_SUPPORTED_FALSE
     * @see #LN_FEATURE_ELEVATION_SUPPORTED_TRUE
     */
    public static final int LN_FEATURE_ELEVATION_SUPPORTED_MASK = 0b00000000_00000000_00001000;

    /**
     * 0: Elevation Supported False
     */
    public static final int LN_FEATURE_ELEVATION_SUPPORTED_FALSE = 0b00000000_00000000_00000000;

    /**
     * 1: Elevation Supported True
     */
    public static final int LN_FEATURE_ELEVATION_SUPPORTED_TRUE = 0b00000000_00000000_00001000;

    /**
     * @see #LN_FEATURE_HEADING_SUPPORTED_FALSE
     * @see #LN_FEATURE_HEADING_SUPPORTED_TRUE
     */
    public static final int LN_FEATURE_HEADING_SUPPORTED_MASK = 0b00000000_00000000_00010000;

    /**
     * 0: Heading Supported False
     */
    public static final int LN_FEATURE_HEADING_SUPPORTED_FALSE = 0b00000000_00000000_00000000;

    /**
     * 1: Heading Supported True
     */
    public static final int LN_FEATURE_HEADING_SUPPORTED_TRUE = 0b00000000_00000000_00010000;

    /**
     * @see #LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE
     * @see #LN_FEATURE_ROLLING_TIME_SUPPORTED_TRUE
     */
    public static final int LN_FEATURE_ROLLING_TIME_SUPPORTED_MASK = 0b00000000_00000000_00100000;

    /**
     * 0: Rolling Time Supported False
     */
    public static final int LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE = 0b00000000_00000000_00000000;

    /**
     * 1: Rolling Time Supported True
     */
    public static final int LN_FEATURE_ROLLING_TIME_SUPPORTED_TRUE = 0b00000000_00000000_00100000;

    /**
     * @see #LN_FEATURE_UTC_TIME_SUPPORTED_FALSE
     * @see #LN_FEATURE_UTC_TIME_SUPPORTED_TRUE
     */
    public static final int LN_FEATURE_UTC_TIME_SUPPORTED_MASK = 0b00000000_00000000_01000000;

    /**
     * 0: UTC Time Supported False
     */
    public static final int LN_FEATURE_UTC_TIME_SUPPORTED_FALSE = 0b00000000_00000000_00000000;

    /**
     * 1: UTC Time Supported True
     */
    public static final int LN_FEATURE_UTC_TIME_SUPPORTED_TRUE = 0b00000000_00000000_01000000;

    /**
     * @see #LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE
     * @see #LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_TRUE
     */
    public static final int LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_MASK = 0b00000000_00000000_10000000;

    /**
     * 0: Remaining Distance Supported False
     */
    public static final int LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE = 0b00000000_00000000_00000000;

    /**
     * 1: Remaining Distance Supported True
     */
    public static final int LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_TRUE = 0b00000000_00000000_10000000;

    /**
     * @see #LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE
     * @see #LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_TRUE
     */
    public static final int LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_MASK = 0b00000000_00000001_00000000;

    /**
     * 0: Remaining Vertical Distance Supported False
     */
    public static final int LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE = 0b00000000_00000000_00000000;

    /**
     * 1: Remaining Vertical Distance Supported True
     */
    public static final int LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_TRUE = 0b00000000_00000001_00000000;

    /**
     * @see #LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE
     * @see #LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_TRUE
     */
    public static final int LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_MASK = 0b00000000_00000010_00000000;

    /**
     * 0: Estimated Time of Arrival Supported False
     */
    public static final int LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE = 0b00000000_00000000_00000000;

    /**
     * 1: Estimated Time of Arrival Supported True
     */
    public static final int LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_TRUE = 0b00000000_00000010_00000000;

    /**
     * @see #LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE
     * @see #LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_TRUE
     */
    public static final int LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_MASK = 0b00000000_00000100_00000000;

    /**
     * 0: Number of Beacons in Solution Supported False
     */
    public static final int LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE = 0b00000000_00000000_00000000;

    /**
     * 1: Number of Beacons in Solution Supported True
     */
    public static final int LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_TRUE = 0b00000000_00000100_00000000;

    /**
     * @see #LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE
     * @see #LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_TRUE
     */
    public static final int LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_MASK = 0b00000000_00001000_00000000;

    /**
     * 0: Number of Beacons in View Supported False
     */
    public static final int LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE = 0b00000000_00000000_00000000;

    /**
     * 1: Number of Beacons in View Supported True
     */
    public static final int LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_TRUE = 0b00000000_00001000_00000000;

    /**
     * @see #LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE
     * @see #LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_TRUE
     */
    public static final int LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_MASK = 0b00000000_00010000_00000000;

    /**
     * 0: Time to First Fix Supported False
     */
    public static final int LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE = 0b00000000_00000000_00000000;

    /**
     * 1: Time to First Fix Supported True
     */
    public static final int LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_TRUE = 0b00000000_00010000_00000000;

    /**
     * @see #LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE
     * @see #LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_TRUE
     */
    public static final int LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_MASK = 0b00000000_00100000_00000000;

    /**
     * 0: Estimated Horizontal Position Error Supported False
     */
    public static final int LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE = 0b00000000_00000000_00000000;

    /**
     * 1: Estimated Horizontal Position Error Supported True
     */
    public static final int LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_TRUE = 0b00000000_00100000_00000000;

    /**
     * @see #LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE
     * @see #LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_TRUE
     */
    public static final int LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_MASK = 0b00000000_01000000_00000000;

    /**
     * 0: Estimated Vertical Position Error Supported False
     */
    public static final int LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE = 0b00000000_00000000_00000000;

    /**
     * 1: Estimated Vertical Position Error Supported True
     */
    public static final int LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_TRUE = 0b00000000_01000000_00000000;

    /**
     * @see #LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
     * @see #LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_TRUE
     */
    public static final int LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_MASK = 0b00000000_10000000_00000000;

    /**
     * 0: Horizontal Dilution of Precision Supported False
     */
    public static final int LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE = 0b00000000_00000000_00000000;

    /**
     * 1: Horizontal Dilution of Precision Supported True
     */
    public static final int LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_TRUE = 0b00000000_10000000_00000000;

    /**
     * @see #LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE
     * @see #LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_TRUE
     */
    public static final int LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_MASK = 0b00000001_00000000_00000000;

    /**
     * 0: Vertical Dilution of Precision Supported False
     */
    public static final int LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE = 0b00000000_00000000_00000000;

    /**
     * 1: Vertical Dilution of Precision Supported True
     */
    public static final int LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_TRUE = 0b00000001_00000000_00000000;

    /**
     * @see #LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE
     * @see #LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_TRUE
     */
    public static final int LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_MASK = 0b00000010_00000000_00000000;

    /**
     * 0: Location and Speed Characteristic Content Masking Supported False
     */
    public static final int LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE = 0b00000000_00000000_00000000;

    /**
     * 1: Location and Speed Characteristic Content Masking Supported True
     */
    public static final int LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_TRUE = 0b00000010_00000000_00000000;

    /**
     * @see #LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE
     * @see #LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_TRUE
     */
    public static final int LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_MASK = 0b00000100_00000000_00000000;

    /**
     * 0: Fix Rate Setting Supported False
     */
    public static final int LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE = 0b00000000_00000000_00000000;

    /**
     * 1: Fix Rate Setting Supported True
     */
    public static final int LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_TRUE = 0b00000100_00000000_00000000;

    /**
     * @see #LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE
     * @see #LN_FEATURE_ELEVATION_SETTING_SUPPORTED_TRUE
     */
    public static final int LN_FEATURE_ELEVATION_SETTING_SUPPORTED_MASK = 0b00001000_00000000_00000000;

    /**
     * 0: Elevation Setting Supported False
     */
    public static final int LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE = 0b00000000_00000000_00000000;

    /**
     * 1: Elevation Setting Supported True
     */
    public static final int LN_FEATURE_ELEVATION_SETTING_SUPPORTED_TRUE = 0b00001000_00000000_00000000;

    /**
     * @see #LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE
     * @see #LN_FEATURE_POSITION_STATUS_SUPPORTED_TRUE
     */
    public static final int LN_FEATURE_POSITION_STATUS_SUPPORTED_MASK = 0b00010000_00000000_00000000;

    /**
     * 0: Position Status Supported False
     */
    public static final int LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE = 0b00000000_00000000_00000000;

    /**
     * 1: Position Status Supported True
     */
    public static final int LN_FEATURE_POSITION_STATUS_SUPPORTED_TRUE = 0b00010000_00000000_00000000;

    /**
     * LN Feature
     */
    private final byte[] mLNFeature;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public LNFeature(@NonNull byte[] values) {
        mLNFeature = Arrays.copyOfRange(values, 0, 4);
    }

    /**
     * Constructor from flags
     * 
     * @param isLNFeatureInstantaneousSpeedSupported                           Instantaneous Speed Supported flag
     * @param isLNFeatureTotalDistanceSupported                                Total Distance Supported flag
     * @param isLNFeatureLocationSupported                                     Location not Supported flag
     * @param isLNFeatureElevationSupported                                    Elevation not Supported flag
     * @param isLNFeatureHeadingSupported                                      Heading Supported flag
     * @param isLNFeatureRollingTimeSupported                                  Rolling Time Supported flag
     * @param isLNFeatureUtcTimeSupported                                      UTC Time Supported flag
     * @param isLNFeatureRemainingDistanceSupported                            Remaining Distance Supported flag
     * @param isLNFeatureRemainingVerticalDistanceSupported                    Remaining Vertical Distance Supported flag
     * @param isLNFeatureEstimatedTimeOfArrivalSupported                       Estimated Time of Arrival Supported flag
     * @param isLNFeatureNumberOfBeaconsInSolutionSupported                    Number of Beacons in Solution Supported flag
     * @param isLNFeatureNumberOfBeaconsInViewSupported                        Number of Beacons in View Supported flag
     * @param isLNFeatureTimeToFirstFixSupported                               Time to First Fix Supported flag
     * @param isLNFeatureEstimatedHorizontalPositionErrorSupported             Estimated Horizontal Position Error Supported flag
     * @param isLNFeatureEstimatedVerticalPositionErrorSupported               Estimated Vertical Position Error Supported flag
     * @param isLNFeatureHorizontalDilutionOfPrecisionSupported                Horizontal Dilution of Precision Supported flag
     * @param isLNFeatureVerticalDilutionOfPrecisionSupported                  Vertical Dilution of Precision Supported flag
     * @param isLNFeatureLocationAndSpeedCharacteristicContentMaskingSupported Location and Speed Characteristic Content Masking Supported flag
     * @param isLNFeatureFixRateSettingSupported                               Fix Rate Setting not Supported flag
     * @param isLNFeatureElevationSettingSupported                             Elevation Setting Supported flag
     * @param isLNFeaturePositionStatusSupported                               Position Status Supported flag
     */
    public LNFeature(boolean isLNFeatureInstantaneousSpeedSupported
            , boolean isLNFeatureTotalDistanceSupported
            , boolean isLNFeatureLocationSupported
            , boolean isLNFeatureElevationSupported
            , boolean isLNFeatureHeadingSupported
            , boolean isLNFeatureRollingTimeSupported
            , boolean isLNFeatureUtcTimeSupported
            , boolean isLNFeatureRemainingDistanceSupported
            , boolean isLNFeatureRemainingVerticalDistanceSupported
            , boolean isLNFeatureEstimatedTimeOfArrivalSupported
            , boolean isLNFeatureNumberOfBeaconsInSolutionSupported
            , boolean isLNFeatureNumberOfBeaconsInViewSupported
            , boolean isLNFeatureTimeToFirstFixSupported
            , boolean isLNFeatureEstimatedHorizontalPositionErrorSupported
            , boolean isLNFeatureEstimatedVerticalPositionErrorSupported
            , boolean isLNFeatureHorizontalDilutionOfPrecisionSupported
            , boolean isLNFeatureVerticalDilutionOfPrecisionSupported
            , boolean isLNFeatureLocationAndSpeedCharacteristicContentMaskingSupported
            , boolean isLNFeatureFixRateSettingSupported
            , boolean isLNFeatureElevationSettingSupported
            , boolean isLNFeaturePositionStatusSupported) {

        mLNFeature = new byte[4];

        if (isLNFeatureInstantaneousSpeedSupported) {
            mLNFeature[0] |= LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_TRUE;
        }
        if (isLNFeatureTotalDistanceSupported) {
            mLNFeature[0] |= LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_TRUE;
        }
        if (isLNFeatureLocationSupported) {
            mLNFeature[0] |= LN_FEATURE_LOCATION_SUPPORTED_TRUE;
        }
        if (isLNFeatureElevationSupported) {
            mLNFeature[0] |= LN_FEATURE_ELEVATION_SUPPORTED_TRUE;
        }
        if (isLNFeatureHeadingSupported) {
            mLNFeature[0] |= LN_FEATURE_HEADING_SUPPORTED_TRUE;
        }
        if (isLNFeatureRollingTimeSupported) {
            mLNFeature[0] |= LN_FEATURE_ROLLING_TIME_SUPPORTED_TRUE;
        }
        if (isLNFeatureUtcTimeSupported) {
            mLNFeature[0] |= LN_FEATURE_UTC_TIME_SUPPORTED_TRUE;
        }
        if (isLNFeatureRemainingDistanceSupported) {
            mLNFeature[0] |= LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_TRUE;
        }

        if (isLNFeatureRemainingVerticalDistanceSupported) {
            mLNFeature[1] |= LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_TRUE >> 8;
        }
        if (isLNFeatureEstimatedTimeOfArrivalSupported) {
            mLNFeature[1] |= LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_TRUE >> 8;
        }
        if (isLNFeatureNumberOfBeaconsInSolutionSupported) {
            mLNFeature[1] |= LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_TRUE >> 8;
        }
        if (isLNFeatureNumberOfBeaconsInViewSupported) {
            mLNFeature[1] |= LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_TRUE >> 8;
        }
        if (isLNFeatureTimeToFirstFixSupported) {
            mLNFeature[1] |= LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_TRUE >> 8;
        }
        if (isLNFeatureEstimatedHorizontalPositionErrorSupported) {
            mLNFeature[1] |= LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_TRUE >> 8;
        }
        if (isLNFeatureEstimatedVerticalPositionErrorSupported) {
            mLNFeature[1] |= LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_TRUE >> 8;
        }
        if (isLNFeatureHorizontalDilutionOfPrecisionSupported) {
            mLNFeature[1] |= LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_TRUE >> 8;
        }

        if (isLNFeatureVerticalDilutionOfPrecisionSupported) {
            mLNFeature[2] |= LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_TRUE >> 16;
        }
        if (isLNFeatureLocationAndSpeedCharacteristicContentMaskingSupported) {
            mLNFeature[2] |= LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_TRUE >> 16;
        }
        if (isLNFeatureFixRateSettingSupported) {
            mLNFeature[2] |= LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_TRUE >> 16;
        }
        if (isLNFeatureElevationSettingSupported) {
            mLNFeature[2] |= LN_FEATURE_ELEVATION_SETTING_SUPPORTED_TRUE >> 16;
        }
        if (isLNFeaturePositionStatusSupported) {
            mLNFeature[2] |= LN_FEATURE_POSITION_STATUS_SUPPORTED_TRUE >> 16;
        }
    }

    /**
     * @return LN Feature
     */
    public byte[] getLNFeature() {
        return mLNFeature;
    }

    /**
     * @return {@code true}:Instantaneous Speed not Supported, {@code false}:Instantaneous Speed Supported
     */
    public boolean isLNFeatureInstantaneousSpeedNotSupported() {
        return isFeatureMatched(LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_MASK, LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE);
    }

    /**
     * @return {@code true}:Instantaneous Speed Supported, {@code false}:Instantaneous Speed not Supported
     */
    public boolean isLNFeatureInstantaneousSpeedSupported() {
        return isFeatureMatched(LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_MASK, LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_TRUE);
    }

    /**
     * @return {@code true}:Total Distance not Supported, {@code false}:Total Distance Supported
     */
    public boolean isLNFeatureTotalDistanceNotSupported() {
        return isFeatureMatched(LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_MASK, LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE);
    }

    /**
     * @return {@code true}:Total Distance Supported, {@code false}:Total Distance not Supported
     */
    public boolean isLNFeatureTotalDistanceSupported() {
        return isFeatureMatched(LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_MASK, LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_TRUE);
    }

    /**
     * @return {@code true}:Location not Supported, {@code false}:Location Supported
     */
    public boolean isLNFeatureLocationNotSupported() {
        return isFeatureMatched(LN_FEATURE_LOCATION_SUPPORTED_MASK, LN_FEATURE_LOCATION_SUPPORTED_FALSE);
    }

    /**
     * @return {@code true}:Location Supported, {@code false}:Location not Supported
     */
    public boolean isLNFeatureLocationSupported() {
        return isFeatureMatched(LN_FEATURE_LOCATION_SUPPORTED_MASK, LN_FEATURE_LOCATION_SUPPORTED_TRUE);
    }

    /**
     * @return {@code true}:Elevation not Supported, {@code false}:Elevation Supported
     */
    public boolean isLNFeatureElevationNotSupported() {
        return isFeatureMatched(LN_FEATURE_ELEVATION_SUPPORTED_MASK, LN_FEATURE_ELEVATION_SUPPORTED_FALSE);
    }

    /**
     * @return {@code true}:Elevation Supported, {@code false}:Elevation not Supported
     */
    public boolean isLNFeatureElevationSupported() {
        return isFeatureMatched(LN_FEATURE_ELEVATION_SUPPORTED_MASK, LN_FEATURE_ELEVATION_SUPPORTED_TRUE);
    }

    /**
     * @return {@code true}:Heading not Supported, {@code false}:Heading Supported
     */
    public boolean isLNFeatureHeadingNotSupported() {
        return isFeatureMatched(LN_FEATURE_HEADING_SUPPORTED_MASK, LN_FEATURE_HEADING_SUPPORTED_FALSE);
    }

    /**
     * @return {@code true}:Heading Supported, {@code false}:Heading not Supported
     */
    public boolean isLNFeatureHeadingSupported() {
        return isFeatureMatched(LN_FEATURE_HEADING_SUPPORTED_MASK, LN_FEATURE_HEADING_SUPPORTED_TRUE);
    }

    /**
     * @return {@code true}:Rolling Time not Supported, {@code false}:Rolling Time Supported
     */
    public boolean isLNFeatureRollingTimeNotSupported() {
        return isFeatureMatched(LN_FEATURE_ROLLING_TIME_SUPPORTED_MASK, LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE);
    }

    /**
     * @return {@code true}:Rolling Time Supported, {@code false}:Rolling Time not Supported
     */
    public boolean isLNFeatureRollingTimeSupported() {
        return isFeatureMatched(LN_FEATURE_ROLLING_TIME_SUPPORTED_MASK, LN_FEATURE_ROLLING_TIME_SUPPORTED_TRUE);
    }

    /**
     * @return {@code true}:UTC Time not Supported, {@code false}:UTC Time Supported
     */
    public boolean isLNFeatureUtcTimeNotSupported() {
        return isFeatureMatched(LN_FEATURE_UTC_TIME_SUPPORTED_MASK, LN_FEATURE_UTC_TIME_SUPPORTED_FALSE);
    }

    /**
     * @return {@code true}:UTC Time Supported, {@code false}:UTC Time not Supported
     */
    public boolean isLNFeatureUtcTimeSupported() {
        return isFeatureMatched(LN_FEATURE_UTC_TIME_SUPPORTED_MASK, LN_FEATURE_UTC_TIME_SUPPORTED_TRUE);
    }

    /**
     * @return {@code true}:Remaining Distance not Supported, {@code false}:Remaining Distance Supported
     */
    public boolean isLNFeatureRemainingDistanceNotSupported() {
        return isFeatureMatched(LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_MASK, LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE);
    }

    /**
     * @return {@code true}:Remaining Distance Supported, {@code false}:Remaining Distance not Supported
     */
    public boolean isLNFeatureRemainingDistanceSupported() {
        return isFeatureMatched(LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_MASK, LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_TRUE);
    }

    /**
     * @return {@code true}:Remaining Vertical Distance not Supported, {@code false}:Remaining Vertical Distance Supported
     */
    public boolean isLNFeatureRemainingVerticalDistanceNotSupported() {
        return isFeatureMatched(LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_MASK, LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE);
    }

    /**
     * @return {@code true}:Remaining Vertical Distance Supported, {@code false}:Remaining Vertical Distance not Supported
     */
    public boolean isLNFeatureRemainingVerticalDistanceSupported() {
        return isFeatureMatched(LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_MASK, LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_TRUE);
    }

    /**
     * @return {@code true}:Estimated Time of Arrival not Supported, {@code false}:Estimated Time of Arrival Supported
     */
    public boolean isLNFeatureEstimatedTimeOfArrivalNotSupported() {
        return isFeatureMatched(LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_MASK, LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE);
    }

    /**
     * @return {@code true}:Estimated Time of Arrival Supported, {@code false}:Estimated Time of Arrival not Supported
     */
    public boolean isLNFeatureEstimatedTimeOfArrivalSupported() {
        return isFeatureMatched(LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_MASK, LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_TRUE);
    }

    /**
     * @return {@code true}:Number of Beacons in Solution not Supported, {@code false}:Number of Beacons in Solution Supported
     */
    public boolean isLNFeatureNumberOfBeaconsInSolutionNotSupported() {
        return isFeatureMatched(LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_MASK, LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE);
    }

    /**
     * @return {@code true}:Number of Beacons in Solution Supported, {@code false}:Number of Beacons in Solution not Supported
     */
    public boolean isLNFeatureNumberOfBeaconsInSolutionSupported() {
        return isFeatureMatched(LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_MASK, LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_TRUE);
    }

    /**
     * @return {@code true}:Number of Beacons in View not Supported, {@code false}:Number of Beacons in View Supported
     */
    public boolean isLNFeatureNumberOfBeaconsInViewNotSupported() {
        return isFeatureMatched(LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_MASK, LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE);
    }

    /**
     * @return {@code true}:Number of Beacons in View Supported, {@code false}:Number of Beacons in View not Supported
     */
    public boolean isLNFeatureNumberOfBeaconsInViewSupported() {
        return isFeatureMatched(LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_MASK, LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_TRUE);
    }

    /**
     * @return {@code true}:Time to First Fix not Supported, {@code false}:Time to First Fix Supported
     */
    public boolean isLNFeatureTimeToFirstFixNotSupported() {
        return isFeatureMatched(LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_MASK, LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE);
    }

    /**
     * @return {@code true}:Time to First Fix Supported, {@code false}:Time to First Fix not Supported
     */
    public boolean isLNFeatureTimeToFirstFixSupported() {
        return isFeatureMatched(LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_MASK, LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_TRUE);
    }

    /**
     * @return {@code true}:Estimated Horizontal Position Error Supported, {@code false}:Estimated Horizontal Position Error not Supported
     */
    public boolean isLNFeatureEstimatedHorizontalPositionErrorNotSupported() {
        return isFeatureMatched(LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_MASK, LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE);
    }

    /**
     * @return {@code true}:Estimated Horizontal Position Error not Supported, {@code false}:Estimated Horizontal Position Error Supported
     */
    public boolean isLNFeatureEstimatedHorizontalPositionErrorSupported() {
        return isFeatureMatched(LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_MASK, LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_TRUE);
    }

    /**
     * @return {@code true}:Estimated Vertical Position Error not Supported, {@code false}:Estimated Vertical Position Error Supported
     */
    public boolean isLNFeatureEstimatedVerticalPositionErrorNotSupported() {
        return isFeatureMatched(LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_MASK, LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE);
    }

    /**
     * @return {@code true}:Estimated Vertical Position Error Supported, {@code false}:Estimated Vertical Position Error not Supported
     */
    public boolean isLNFeatureEstimatedVerticalPositionErrorSupported() {
        return isFeatureMatched(LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_MASK, LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_TRUE);
    }

    /**
     * @return {@code true}:Horizontal Dilution of Precision not Supported, {@code false}:Horizontal Dilution of Precision Supported
     */
    public boolean isLNFeatureHorizontalDilutionOfPrecisionNotSupported() {
        return isFeatureMatched(LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_MASK, LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE);
    }

    /**
     * @return {@code true}:Horizontal Dilution of Precision Supported, {@code false}:Horizontal Dilution of Precision not Supported
     */
    public boolean isLNFeatureHorizontalDilutionOfPrecisionSupported() {
        return isFeatureMatched(LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_MASK, LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_TRUE);
    }

    /**
     * @return {@code true}:Vertical Dilution of Precision not Supported, {@code false}:Vertical Dilution of Precision Supported
     */
    public boolean isLNFeatureVerticalDilutionOfPrecisionNotSupported() {
        return isFeatureMatched(LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_MASK, LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE);
    }

    /**
     * @return {@code true}:Vertical Dilution of Precision Supported, {@code false}:Vertical Dilution of Precision not Supported
     */
    public boolean isLNFeatureVerticalDilutionOfPrecisionSupported() {
        return isFeatureMatched(LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_MASK, LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_TRUE);
    }

    /**
     * @return {@code true}:Location and Speed Characteristic Content Masking not Supported, {@code false}:Location and Speed Characteristic Content Masking Supported
     */
    public boolean isLNFeatureLocationAndSpeedCharacteristicContentMaskingNotSupported() {
        return isFeatureMatched(LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_MASK, LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE);
    }

    /**
     * @return {@code true}:Location and Speed Characteristic Content Masking Supported, {@code false}:Location and Speed Characteristic Content Masking not Supported
     */
    public boolean isLNFeatureLocationAndSpeedCharacteristicContentMaskingSupported() {
        return isFeatureMatched(LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_MASK, LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_TRUE);
    }

    /**
     * @return {@code true}:Fix Rate Setting not Supported, {@code false}:Fix Rate Setting Supported
     */
    public boolean isLNFeatureFixRateSettingNotSupported() {
        return isFeatureMatched(LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_MASK, LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE);
    }

    /**
     * @return {@code true}:Fix Rate Setting Supported, {@code false}:Fix Rate Setting not Supported
     */
    public boolean isLNFeatureFixRateSettingSupported() {
        return isFeatureMatched(LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_MASK, LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_TRUE);
    }

    /**
     * @return {@code true}:Elevation Setting not Supported, {@code false}:Elevation Setting Supported
     */
    public boolean isLNFeatureElevationSettingNotSupported() {
        return isFeatureMatched(LN_FEATURE_ELEVATION_SETTING_SUPPORTED_MASK, LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE);
    }

    /**
     * @return {@code true}:Elevation Setting Supported, {@code false}:Elevation Setting not Supported
     */
    public boolean isLNFeatureElevationSettingSupported() {
        return isFeatureMatched(LN_FEATURE_ELEVATION_SETTING_SUPPORTED_MASK, LN_FEATURE_ELEVATION_SETTING_SUPPORTED_TRUE);
    }

    /**
     * @return {@code true}:Position Status not Supported, {@code false}:Position Status Supported
     */
    public boolean isLNFeaturePositionStatusNotSupported() {
        return isFeatureMatched(LN_FEATURE_POSITION_STATUS_SUPPORTED_MASK, LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE);
    }

    /**
     * @return {@code true}:Position Status Supported, {@code false}:Position Status not Supported
     */
    public boolean isLNFeaturePositionStatusSupported() {
        return isFeatureMatched(LN_FEATURE_POSITION_STATUS_SUPPORTED_MASK, LN_FEATURE_POSITION_STATUS_SUPPORTED_TRUE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[4];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put(mLNFeature);
        return data;
    }

    /**
     * check LN Feature
     *
     * @param mask   bitmask for expect
     * @param expect one of {@link #LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_FALSE} , {@link #LN_FEATURE_INSTANTANEOUS_SPEED_SUPPORTED_TRUE} , {@link #LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_FALSE} , {@link #LN_FEATURE_TOTAL_DISTANCE_SUPPORTED_TRUE} , {@link #LN_FEATURE_LOCATION_SUPPORTED_FALSE} , {@link #LN_FEATURE_LOCATION_SUPPORTED_TRUE} , {@link #LN_FEATURE_ELEVATION_SUPPORTED_FALSE} , {@link #LN_FEATURE_ELEVATION_SUPPORTED_TRUE} , {@link #LN_FEATURE_HEADING_SUPPORTED_FALSE} , {@link #LN_FEATURE_HEADING_SUPPORTED_TRUE} , {@link #LN_FEATURE_ROLLING_TIME_SUPPORTED_FALSE} , {@link #LN_FEATURE_ROLLING_TIME_SUPPORTED_TRUE} , {@link #LN_FEATURE_UTC_TIME_SUPPORTED_FALSE} , {@link #LN_FEATURE_UTC_TIME_SUPPORTED_TRUE} , {@link #LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_FALSE} , {@link #LN_FEATURE_REMAINING_DISTANCE_SUPPORTED_TRUE} , {@link #LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_FALSE} , {@link #LN_FEATURE_REMAINING_VERTICAL_DISTANCE_SUPPORTED_TRUE} , {@link #LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_FALSE} , {@link #LN_FEATURE_ESTIMATED_TIME_OF_ARRIVAL_SUPPORTED_TRUE} , {@link #LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_FALSE} , {@link #LN_FEATURE_NUMBER_OF_BEACONS_IN_SOLUTION_SUPPORTED_TRUE} , {@link #LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_FALSE} , {@link #LN_FEATURE_NUMBER_OF_BEACONS_IN_VIEW_SUPPORTED_TRUE} , {@link #LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_FALSE} , {@link #LN_FEATURE_TIME_TO_FIRST_FIX_SUPPORTED_TRUE} , {@link #LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_FALSE} , {@link #LN_FEATURE_ESTIMATED_HORIZONTAL_POSITION_ERROR_SUPPORTED_TRUE} , {@link #LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_FALSE} , {@link #LN_FEATURE_ESTIMATED_VERTICAL_POSITION_ERROR_SUPPORTED_TRUE} , {@link #LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE} , {@link #LN_FEATURE_HORIZONTAL_DILUTION_OF_PRECISION_SUPPORTED_TRUE} , {@link #LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_FALSE} , {@link #LN_FEATURE_VERTICAL_DILUTION_OF_PRECISION_SUPPORTED_TRUE} , {@link #LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_FALSE} , {@link #LN_FEATURE_LOCATION_AND_SPEED_CHARACTERISTIC_CONTENT_MASKING_SUPPORTED_TRUE} , {@link #LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_FALSE} , {@link #LN_FEATURE_FIX_RATE_SETTING_SUPPORTED_TRUE} , {@link #LN_FEATURE_ELEVATION_SETTING_SUPPORTED_FALSE} , {@link #LN_FEATURE_ELEVATION_SETTING_SUPPORTED_TRUE} , {@link #LN_FEATURE_POSITION_STATUS_SUPPORTED_FALSE} , {@link #LN_FEATURE_POSITION_STATUS_SUPPORTED_TRUE}
     * @return {@code true}:same as expect, {@code false}:not match
     */
    private boolean isFeatureMatched(int mask, int expect) {
        return (mask & BLEUtils.createSInt32(mLNFeature, 0)) == expect;
    }
}
