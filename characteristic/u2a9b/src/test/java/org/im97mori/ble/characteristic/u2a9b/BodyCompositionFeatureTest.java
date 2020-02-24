package org.im97mori.ble.characteristic.u2a9b;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BodyCompositionFeatureTest {

    @Test
    public void test_constructor001() {
        int flags = BodyCompositionFeature.TIME_STAMP_SUPPORTED_FALSE
                | BodyCompositionFeature.MULTIPLE_USERS_SUPPORTED_FALSE
                | BodyCompositionFeature.BASAL_METABOLISM_SUPPORTED_FALSE
                | BodyCompositionFeature.MUSCLE_PERCENTAGE_SUPPORTED_FALSE
                | BodyCompositionFeature.MUSCLE_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.FAT_FREE_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.SOTT_LEAN_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.BODY_WATER_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.IMPEDANCE_SUPPORTED_FALSE
                | BodyCompositionFeature.WEIGHT_SUPPORTED_FALSE
                | BodyCompositionFeature.HEIGHT_SUPPORTED_FALSE
                | BodyCompositionFeature.MASS_MEASUREMENT_RESOLUTION_NOT_SPECIFIED
                | BodyCompositionFeature.HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        BodyCompositionFeature result1 = new BodyCompositionFeature(data);
        assertArrayEquals(data, result1.getBodyCompositionFeature());
        assertFalse(result1.isTimeStampSupported());
        assertTrue(result1.isTimeStampNotSupported());
        assertFalse(result1.isMultipleUsersSupported());
        assertTrue(result1.isMultipleUsersNotSupported());
        assertFalse(result1.isBasalMetabolismSupported());
        assertTrue(result1.isBasalMetabolismNotSupported());
        assertFalse(result1.isMusclePercentageSupported());
        assertTrue(result1.isMusclePercentageNotSupported());
        assertFalse(result1.isMuscleMassSupported());
        assertTrue(result1.isMuscleMassNotSupported());
        assertFalse(result1.isFatFreeMassSupported());
        assertTrue(result1.isFatFreeMassNotSupported());
        assertFalse(result1.isSoftLeanMassSupported());
        assertTrue(result1.isSoftLeanMassNotSupported());
        assertFalse(result1.isBodyWaterMassSupported());
        assertTrue(result1.isBodyWaterMassNotSupported());
        assertFalse(result1.isImpedanceMassSupported());
        assertTrue(result1.isImpedanceNotSupported());
        assertFalse(result1.isWeightMassSupported());
        assertTrue(result1.isWeightNotSupported());
        assertFalse(result1.isHeightMassSupported());
        assertTrue(result1.isHeightNotSupported());
        assertTrue(result1.isMassScaleMeasurementResolutionNotSpecified());
        assertFalse(result1.isMassScaleMeasurementResolution1());
        assertFalse(result1.isMassScaleMeasurementResolution2());
        assertFalse(result1.isMassScaleMeasurementResolution3());
        assertFalse(result1.isMassScaleMeasurementResolution4());
        assertFalse(result1.isMassScaleMeasurementResolution5());
        assertFalse(result1.isMassScaleMeasurementResolution6());
        assertFalse(result1.isMassScaleMeasurementResolution7());
        assertTrue(result1.isHeightMeasurementResolutionNotSpecified());
        assertFalse(result1.isHeightMeasurementResolution1());
        assertFalse(result1.isHeightMeasurementResolution2());
        assertFalse(result1.isHeightMeasurementResolution3());
    }

    @Test
    public void test_constructor002() {
        int flags = BodyCompositionFeature.TIME_STAMP_SUPPORTED_TRUE
                | BodyCompositionFeature.MULTIPLE_USERS_SUPPORTED_FALSE
                | BodyCompositionFeature.BASAL_METABOLISM_SUPPORTED_FALSE
                | BodyCompositionFeature.MUSCLE_PERCENTAGE_SUPPORTED_FALSE
                | BodyCompositionFeature.MUSCLE_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.FAT_FREE_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.SOTT_LEAN_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.BODY_WATER_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.IMPEDANCE_SUPPORTED_FALSE
                | BodyCompositionFeature.WEIGHT_SUPPORTED_FALSE
                | BodyCompositionFeature.HEIGHT_SUPPORTED_FALSE
                | BodyCompositionFeature.MASS_MEASUREMENT_RESOLUTION_NOT_SPECIFIED
                | BodyCompositionFeature.HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        BodyCompositionFeature result1 = new BodyCompositionFeature(data);
        assertArrayEquals(data, result1.getBodyCompositionFeature());
        assertTrue(result1.isTimeStampSupported());
        assertFalse(result1.isTimeStampNotSupported());
        assertFalse(result1.isMultipleUsersSupported());
        assertTrue(result1.isMultipleUsersNotSupported());
        assertFalse(result1.isBasalMetabolismSupported());
        assertTrue(result1.isBasalMetabolismNotSupported());
        assertFalse(result1.isMusclePercentageSupported());
        assertTrue(result1.isMusclePercentageNotSupported());
        assertFalse(result1.isMuscleMassSupported());
        assertTrue(result1.isMuscleMassNotSupported());
        assertFalse(result1.isFatFreeMassSupported());
        assertTrue(result1.isFatFreeMassNotSupported());
        assertFalse(result1.isSoftLeanMassSupported());
        assertTrue(result1.isSoftLeanMassNotSupported());
        assertFalse(result1.isBodyWaterMassSupported());
        assertTrue(result1.isBodyWaterMassNotSupported());
        assertFalse(result1.isImpedanceMassSupported());
        assertTrue(result1.isImpedanceNotSupported());
        assertFalse(result1.isWeightMassSupported());
        assertTrue(result1.isWeightNotSupported());
        assertFalse(result1.isHeightMassSupported());
        assertTrue(result1.isHeightNotSupported());
        assertTrue(result1.isMassScaleMeasurementResolutionNotSpecified());
        assertFalse(result1.isMassScaleMeasurementResolution1());
        assertFalse(result1.isMassScaleMeasurementResolution2());
        assertFalse(result1.isMassScaleMeasurementResolution3());
        assertFalse(result1.isMassScaleMeasurementResolution4());
        assertFalse(result1.isMassScaleMeasurementResolution5());
        assertFalse(result1.isMassScaleMeasurementResolution6());
        assertFalse(result1.isMassScaleMeasurementResolution7());
        assertTrue(result1.isHeightMeasurementResolutionNotSpecified());
        assertFalse(result1.isHeightMeasurementResolution1());
        assertFalse(result1.isHeightMeasurementResolution2());
        assertFalse(result1.isHeightMeasurementResolution3());
    }

    @Test
    public void test_constructor003() {
        int flags = BodyCompositionFeature.TIME_STAMP_SUPPORTED_FALSE
                | BodyCompositionFeature.MULTIPLE_USERS_SUPPORTED_TRUE
                | BodyCompositionFeature.BASAL_METABOLISM_SUPPORTED_FALSE
                | BodyCompositionFeature.MUSCLE_PERCENTAGE_SUPPORTED_FALSE
                | BodyCompositionFeature.MUSCLE_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.FAT_FREE_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.SOTT_LEAN_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.BODY_WATER_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.IMPEDANCE_SUPPORTED_FALSE
                | BodyCompositionFeature.WEIGHT_SUPPORTED_FALSE
                | BodyCompositionFeature.HEIGHT_SUPPORTED_FALSE
                | BodyCompositionFeature.MASS_MEASUREMENT_RESOLUTION_NOT_SPECIFIED
                | BodyCompositionFeature.HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        BodyCompositionFeature result1 = new BodyCompositionFeature(data);
        assertArrayEquals(data, result1.getBodyCompositionFeature());
        assertFalse(result1.isTimeStampSupported());
        assertTrue(result1.isTimeStampNotSupported());
        assertTrue(result1.isMultipleUsersSupported());
        assertFalse(result1.isMultipleUsersNotSupported());
        assertFalse(result1.isBasalMetabolismSupported());
        assertTrue(result1.isBasalMetabolismNotSupported());
        assertFalse(result1.isMusclePercentageSupported());
        assertTrue(result1.isMusclePercentageNotSupported());
        assertFalse(result1.isMuscleMassSupported());
        assertTrue(result1.isMuscleMassNotSupported());
        assertFalse(result1.isFatFreeMassSupported());
        assertTrue(result1.isFatFreeMassNotSupported());
        assertFalse(result1.isSoftLeanMassSupported());
        assertTrue(result1.isSoftLeanMassNotSupported());
        assertFalse(result1.isBodyWaterMassSupported());
        assertTrue(result1.isBodyWaterMassNotSupported());
        assertFalse(result1.isImpedanceMassSupported());
        assertTrue(result1.isImpedanceNotSupported());
        assertFalse(result1.isWeightMassSupported());
        assertTrue(result1.isWeightNotSupported());
        assertFalse(result1.isHeightMassSupported());
        assertTrue(result1.isHeightNotSupported());
        assertTrue(result1.isMassScaleMeasurementResolutionNotSpecified());
        assertFalse(result1.isMassScaleMeasurementResolution1());
        assertFalse(result1.isMassScaleMeasurementResolution2());
        assertFalse(result1.isMassScaleMeasurementResolution3());
        assertFalse(result1.isMassScaleMeasurementResolution4());
        assertFalse(result1.isMassScaleMeasurementResolution5());
        assertFalse(result1.isMassScaleMeasurementResolution6());
        assertFalse(result1.isMassScaleMeasurementResolution7());
        assertTrue(result1.isHeightMeasurementResolutionNotSpecified());
        assertFalse(result1.isHeightMeasurementResolution1());
        assertFalse(result1.isHeightMeasurementResolution2());
        assertFalse(result1.isHeightMeasurementResolution3());
    }

    @Test
    public void test_constructor004() {
        int flags = BodyCompositionFeature.TIME_STAMP_SUPPORTED_FALSE
                | BodyCompositionFeature.MULTIPLE_USERS_SUPPORTED_FALSE
                | BodyCompositionFeature.BASAL_METABOLISM_SUPPORTED_TRUE
                | BodyCompositionFeature.MUSCLE_PERCENTAGE_SUPPORTED_FALSE
                | BodyCompositionFeature.MUSCLE_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.FAT_FREE_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.SOTT_LEAN_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.BODY_WATER_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.IMPEDANCE_SUPPORTED_FALSE
                | BodyCompositionFeature.WEIGHT_SUPPORTED_FALSE
                | BodyCompositionFeature.HEIGHT_SUPPORTED_FALSE
                | BodyCompositionFeature.MASS_MEASUREMENT_RESOLUTION_NOT_SPECIFIED
                | BodyCompositionFeature.HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        BodyCompositionFeature result1 = new BodyCompositionFeature(data);
        assertArrayEquals(data, result1.getBodyCompositionFeature());
        assertFalse(result1.isTimeStampSupported());
        assertTrue(result1.isTimeStampNotSupported());
        assertFalse(result1.isMultipleUsersSupported());
        assertTrue(result1.isMultipleUsersNotSupported());
        assertTrue(result1.isBasalMetabolismSupported());
        assertFalse(result1.isBasalMetabolismNotSupported());
        assertFalse(result1.isMusclePercentageSupported());
        assertTrue(result1.isMusclePercentageNotSupported());
        assertFalse(result1.isMuscleMassSupported());
        assertTrue(result1.isMuscleMassNotSupported());
        assertFalse(result1.isFatFreeMassSupported());
        assertTrue(result1.isFatFreeMassNotSupported());
        assertFalse(result1.isSoftLeanMassSupported());
        assertTrue(result1.isSoftLeanMassNotSupported());
        assertFalse(result1.isBodyWaterMassSupported());
        assertTrue(result1.isBodyWaterMassNotSupported());
        assertFalse(result1.isImpedanceMassSupported());
        assertTrue(result1.isImpedanceNotSupported());
        assertFalse(result1.isWeightMassSupported());
        assertTrue(result1.isWeightNotSupported());
        assertFalse(result1.isHeightMassSupported());
        assertTrue(result1.isHeightNotSupported());
        assertTrue(result1.isMassScaleMeasurementResolutionNotSpecified());
        assertFalse(result1.isMassScaleMeasurementResolution1());
        assertFalse(result1.isMassScaleMeasurementResolution2());
        assertFalse(result1.isMassScaleMeasurementResolution3());
        assertFalse(result1.isMassScaleMeasurementResolution4());
        assertFalse(result1.isMassScaleMeasurementResolution5());
        assertFalse(result1.isMassScaleMeasurementResolution6());
        assertFalse(result1.isMassScaleMeasurementResolution7());
        assertTrue(result1.isHeightMeasurementResolutionNotSpecified());
        assertFalse(result1.isHeightMeasurementResolution1());
        assertFalse(result1.isHeightMeasurementResolution2());
        assertFalse(result1.isHeightMeasurementResolution3());
    }

    @Test
    public void test_constructor005() {
        int flags = BodyCompositionFeature.TIME_STAMP_SUPPORTED_FALSE
                | BodyCompositionFeature.MULTIPLE_USERS_SUPPORTED_FALSE
                | BodyCompositionFeature.BASAL_METABOLISM_SUPPORTED_FALSE
                | BodyCompositionFeature.MUSCLE_PERCENTAGE_SUPPORTED_TRUE
                | BodyCompositionFeature.MUSCLE_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.FAT_FREE_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.SOTT_LEAN_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.BODY_WATER_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.IMPEDANCE_SUPPORTED_FALSE
                | BodyCompositionFeature.WEIGHT_SUPPORTED_FALSE
                | BodyCompositionFeature.HEIGHT_SUPPORTED_FALSE
                | BodyCompositionFeature.MASS_MEASUREMENT_RESOLUTION_NOT_SPECIFIED
                | BodyCompositionFeature.HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on


        BodyCompositionFeature result1 = new BodyCompositionFeature(data);
        assertArrayEquals(data, result1.getBodyCompositionFeature());
        assertFalse(result1.isTimeStampSupported());
        assertTrue(result1.isTimeStampNotSupported());
        assertFalse(result1.isMultipleUsersSupported());
        assertTrue(result1.isMultipleUsersNotSupported());
        assertFalse(result1.isBasalMetabolismSupported());
        assertTrue(result1.isBasalMetabolismNotSupported());
        assertTrue(result1.isMusclePercentageSupported());
        assertFalse(result1.isMusclePercentageNotSupported());
        assertFalse(result1.isMuscleMassSupported());
        assertTrue(result1.isMuscleMassNotSupported());
        assertFalse(result1.isFatFreeMassSupported());
        assertTrue(result1.isFatFreeMassNotSupported());
        assertFalse(result1.isSoftLeanMassSupported());
        assertTrue(result1.isSoftLeanMassNotSupported());
        assertFalse(result1.isBodyWaterMassSupported());
        assertTrue(result1.isBodyWaterMassNotSupported());
        assertFalse(result1.isImpedanceMassSupported());
        assertTrue(result1.isImpedanceNotSupported());
        assertFalse(result1.isWeightMassSupported());
        assertTrue(result1.isWeightNotSupported());
        assertFalse(result1.isHeightMassSupported());
        assertTrue(result1.isHeightNotSupported());
        assertTrue(result1.isMassScaleMeasurementResolutionNotSpecified());
        assertFalse(result1.isMassScaleMeasurementResolution1());
        assertFalse(result1.isMassScaleMeasurementResolution2());
        assertFalse(result1.isMassScaleMeasurementResolution3());
        assertFalse(result1.isMassScaleMeasurementResolution4());
        assertFalse(result1.isMassScaleMeasurementResolution5());
        assertFalse(result1.isMassScaleMeasurementResolution6());
        assertFalse(result1.isMassScaleMeasurementResolution7());
        assertTrue(result1.isHeightMeasurementResolutionNotSpecified());
        assertFalse(result1.isHeightMeasurementResolution1());
        assertFalse(result1.isHeightMeasurementResolution2());
        assertFalse(result1.isHeightMeasurementResolution3());
    }

    @Test
    public void test_constructor006() {
        int flags = BodyCompositionFeature.TIME_STAMP_SUPPORTED_FALSE
                | BodyCompositionFeature.MULTIPLE_USERS_SUPPORTED_FALSE
                | BodyCompositionFeature.BASAL_METABOLISM_SUPPORTED_FALSE
                | BodyCompositionFeature.MUSCLE_PERCENTAGE_SUPPORTED_FALSE
                | BodyCompositionFeature.MUSCLE_MASS_SUPPORTED_TRUE
                | BodyCompositionFeature.FAT_FREE_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.SOTT_LEAN_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.BODY_WATER_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.IMPEDANCE_SUPPORTED_FALSE
                | BodyCompositionFeature.WEIGHT_SUPPORTED_FALSE
                | BodyCompositionFeature.HEIGHT_SUPPORTED_FALSE
                | BodyCompositionFeature.MASS_MEASUREMENT_RESOLUTION_NOT_SPECIFIED
                | BodyCompositionFeature.HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        BodyCompositionFeature result1 = new BodyCompositionFeature(data);
        assertArrayEquals(data, result1.getBodyCompositionFeature());
        assertFalse(result1.isTimeStampSupported());
        assertTrue(result1.isTimeStampNotSupported());
        assertFalse(result1.isMultipleUsersSupported());
        assertTrue(result1.isMultipleUsersNotSupported());
        assertFalse(result1.isBasalMetabolismSupported());
        assertTrue(result1.isBasalMetabolismNotSupported());
        assertFalse(result1.isMusclePercentageSupported());
        assertTrue(result1.isMusclePercentageNotSupported());
        assertTrue(result1.isMuscleMassSupported());
        assertFalse(result1.isMuscleMassNotSupported());
        assertFalse(result1.isFatFreeMassSupported());
        assertTrue(result1.isFatFreeMassNotSupported());
        assertFalse(result1.isSoftLeanMassSupported());
        assertTrue(result1.isSoftLeanMassNotSupported());
        assertFalse(result1.isBodyWaterMassSupported());
        assertTrue(result1.isBodyWaterMassNotSupported());
        assertFalse(result1.isImpedanceMassSupported());
        assertTrue(result1.isImpedanceNotSupported());
        assertFalse(result1.isWeightMassSupported());
        assertTrue(result1.isWeightNotSupported());
        assertFalse(result1.isHeightMassSupported());
        assertTrue(result1.isHeightNotSupported());
        assertTrue(result1.isMassScaleMeasurementResolutionNotSpecified());
        assertFalse(result1.isMassScaleMeasurementResolution1());
        assertFalse(result1.isMassScaleMeasurementResolution2());
        assertFalse(result1.isMassScaleMeasurementResolution3());
        assertFalse(result1.isMassScaleMeasurementResolution4());
        assertFalse(result1.isMassScaleMeasurementResolution5());
        assertFalse(result1.isMassScaleMeasurementResolution6());
        assertFalse(result1.isMassScaleMeasurementResolution7());
        assertTrue(result1.isHeightMeasurementResolutionNotSpecified());
        assertFalse(result1.isHeightMeasurementResolution1());
        assertFalse(result1.isHeightMeasurementResolution2());
        assertFalse(result1.isHeightMeasurementResolution3());
    }

    @Test
    public void test_constructor007() {
        int flags = BodyCompositionFeature.TIME_STAMP_SUPPORTED_FALSE
                | BodyCompositionFeature.MULTIPLE_USERS_SUPPORTED_FALSE
                | BodyCompositionFeature.BASAL_METABOLISM_SUPPORTED_FALSE
                | BodyCompositionFeature.MUSCLE_PERCENTAGE_SUPPORTED_FALSE
                | BodyCompositionFeature.MUSCLE_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.FAT_FREE_MASS_SUPPORTED_TRUE
                | BodyCompositionFeature.SOTT_LEAN_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.BODY_WATER_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.IMPEDANCE_SUPPORTED_FALSE
                | BodyCompositionFeature.WEIGHT_SUPPORTED_FALSE
                | BodyCompositionFeature.HEIGHT_SUPPORTED_FALSE
                | BodyCompositionFeature.MASS_MEASUREMENT_RESOLUTION_NOT_SPECIFIED
                | BodyCompositionFeature.HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        BodyCompositionFeature result1 = new BodyCompositionFeature(data);
        assertArrayEquals(data, result1.getBodyCompositionFeature());
        assertFalse(result1.isTimeStampSupported());
        assertTrue(result1.isTimeStampNotSupported());
        assertFalse(result1.isMultipleUsersSupported());
        assertTrue(result1.isMultipleUsersNotSupported());
        assertFalse(result1.isBasalMetabolismSupported());
        assertTrue(result1.isBasalMetabolismNotSupported());
        assertFalse(result1.isMusclePercentageSupported());
        assertTrue(result1.isMusclePercentageNotSupported());
        assertFalse(result1.isMuscleMassSupported());
        assertTrue(result1.isMuscleMassNotSupported());
        assertTrue(result1.isFatFreeMassSupported());
        assertFalse(result1.isFatFreeMassNotSupported());
        assertFalse(result1.isSoftLeanMassSupported());
        assertTrue(result1.isSoftLeanMassNotSupported());
        assertFalse(result1.isBodyWaterMassSupported());
        assertTrue(result1.isBodyWaterMassNotSupported());
        assertFalse(result1.isImpedanceMassSupported());
        assertTrue(result1.isImpedanceNotSupported());
        assertFalse(result1.isWeightMassSupported());
        assertTrue(result1.isWeightNotSupported());
        assertFalse(result1.isHeightMassSupported());
        assertTrue(result1.isHeightNotSupported());
        assertTrue(result1.isMassScaleMeasurementResolutionNotSpecified());
        assertFalse(result1.isMassScaleMeasurementResolution1());
        assertFalse(result1.isMassScaleMeasurementResolution2());
        assertFalse(result1.isMassScaleMeasurementResolution3());
        assertFalse(result1.isMassScaleMeasurementResolution4());
        assertFalse(result1.isMassScaleMeasurementResolution5());
        assertFalse(result1.isMassScaleMeasurementResolution6());
        assertFalse(result1.isMassScaleMeasurementResolution7());
        assertTrue(result1.isHeightMeasurementResolutionNotSpecified());
        assertFalse(result1.isHeightMeasurementResolution1());
        assertFalse(result1.isHeightMeasurementResolution2());
        assertFalse(result1.isHeightMeasurementResolution3());
    }

    @Test
    public void test_constructor008() {
        int flags = BodyCompositionFeature.TIME_STAMP_SUPPORTED_FALSE
                | BodyCompositionFeature.MULTIPLE_USERS_SUPPORTED_FALSE
                | BodyCompositionFeature.BASAL_METABOLISM_SUPPORTED_FALSE
                | BodyCompositionFeature.MUSCLE_PERCENTAGE_SUPPORTED_FALSE
                | BodyCompositionFeature.MUSCLE_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.FAT_FREE_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.SOTT_LEAN_MASS_SUPPORTED_TRUE
                | BodyCompositionFeature.BODY_WATER_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.IMPEDANCE_SUPPORTED_FALSE
                | BodyCompositionFeature.WEIGHT_SUPPORTED_FALSE
                | BodyCompositionFeature.HEIGHT_SUPPORTED_FALSE
                | BodyCompositionFeature.MASS_MEASUREMENT_RESOLUTION_NOT_SPECIFIED
                | BodyCompositionFeature.HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        BodyCompositionFeature result1 = new BodyCompositionFeature(data);
        assertArrayEquals(data, result1.getBodyCompositionFeature());
        assertFalse(result1.isTimeStampSupported());
        assertTrue(result1.isTimeStampNotSupported());
        assertFalse(result1.isMultipleUsersSupported());
        assertTrue(result1.isMultipleUsersNotSupported());
        assertFalse(result1.isBasalMetabolismSupported());
        assertTrue(result1.isBasalMetabolismNotSupported());
        assertFalse(result1.isMusclePercentageSupported());
        assertTrue(result1.isMusclePercentageNotSupported());
        assertFalse(result1.isMuscleMassSupported());
        assertTrue(result1.isMuscleMassNotSupported());
        assertFalse(result1.isFatFreeMassSupported());
        assertTrue(result1.isFatFreeMassNotSupported());
        assertTrue(result1.isSoftLeanMassSupported());
        assertFalse(result1.isSoftLeanMassNotSupported());
        assertFalse(result1.isBodyWaterMassSupported());
        assertTrue(result1.isBodyWaterMassNotSupported());
        assertFalse(result1.isImpedanceMassSupported());
        assertTrue(result1.isImpedanceNotSupported());
        assertFalse(result1.isWeightMassSupported());
        assertTrue(result1.isWeightNotSupported());
        assertFalse(result1.isHeightMassSupported());
        assertTrue(result1.isHeightNotSupported());
        assertTrue(result1.isMassScaleMeasurementResolutionNotSpecified());
        assertFalse(result1.isMassScaleMeasurementResolution1());
        assertFalse(result1.isMassScaleMeasurementResolution2());
        assertFalse(result1.isMassScaleMeasurementResolution3());
        assertFalse(result1.isMassScaleMeasurementResolution4());
        assertFalse(result1.isMassScaleMeasurementResolution5());
        assertFalse(result1.isMassScaleMeasurementResolution6());
        assertFalse(result1.isMassScaleMeasurementResolution7());
        assertTrue(result1.isHeightMeasurementResolutionNotSpecified());
        assertFalse(result1.isHeightMeasurementResolution1());
        assertFalse(result1.isHeightMeasurementResolution2());
        assertFalse(result1.isHeightMeasurementResolution3());
    }

    @Test
    public void test_constructor009() {
        int flags = BodyCompositionFeature.TIME_STAMP_SUPPORTED_FALSE
                | BodyCompositionFeature.MULTIPLE_USERS_SUPPORTED_FALSE
                | BodyCompositionFeature.BASAL_METABOLISM_SUPPORTED_FALSE
                | BodyCompositionFeature.MUSCLE_PERCENTAGE_SUPPORTED_FALSE
                | BodyCompositionFeature.MUSCLE_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.FAT_FREE_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.SOTT_LEAN_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.BODY_WATER_MASS_SUPPORTED_TRUE
                | BodyCompositionFeature.IMPEDANCE_SUPPORTED_FALSE
                | BodyCompositionFeature.WEIGHT_SUPPORTED_FALSE
                | BodyCompositionFeature.HEIGHT_SUPPORTED_FALSE
                | BodyCompositionFeature.MASS_MEASUREMENT_RESOLUTION_NOT_SPECIFIED
                | BodyCompositionFeature.HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        BodyCompositionFeature result1 = new BodyCompositionFeature(data);
        assertArrayEquals(data, result1.getBodyCompositionFeature());
        assertFalse(result1.isTimeStampSupported());
        assertTrue(result1.isTimeStampNotSupported());
        assertFalse(result1.isMultipleUsersSupported());
        assertTrue(result1.isMultipleUsersNotSupported());
        assertFalse(result1.isBasalMetabolismSupported());
        assertTrue(result1.isBasalMetabolismNotSupported());
        assertFalse(result1.isMusclePercentageSupported());
        assertTrue(result1.isMusclePercentageNotSupported());
        assertFalse(result1.isMuscleMassSupported());
        assertTrue(result1.isMuscleMassNotSupported());
        assertFalse(result1.isFatFreeMassSupported());
        assertTrue(result1.isFatFreeMassNotSupported());
        assertFalse(result1.isSoftLeanMassSupported());
        assertTrue(result1.isSoftLeanMassNotSupported());
        assertTrue(result1.isBodyWaterMassSupported());
        assertFalse(result1.isBodyWaterMassNotSupported());
        assertFalse(result1.isImpedanceMassSupported());
        assertTrue(result1.isImpedanceNotSupported());
        assertFalse(result1.isWeightMassSupported());
        assertTrue(result1.isWeightNotSupported());
        assertFalse(result1.isHeightMassSupported());
        assertTrue(result1.isHeightNotSupported());
        assertTrue(result1.isMassScaleMeasurementResolutionNotSpecified());
        assertFalse(result1.isMassScaleMeasurementResolution1());
        assertFalse(result1.isMassScaleMeasurementResolution2());
        assertFalse(result1.isMassScaleMeasurementResolution3());
        assertFalse(result1.isMassScaleMeasurementResolution4());
        assertFalse(result1.isMassScaleMeasurementResolution5());
        assertFalse(result1.isMassScaleMeasurementResolution6());
        assertFalse(result1.isMassScaleMeasurementResolution7());
        assertTrue(result1.isHeightMeasurementResolutionNotSpecified());
        assertFalse(result1.isHeightMeasurementResolution1());
        assertFalse(result1.isHeightMeasurementResolution2());
        assertFalse(result1.isHeightMeasurementResolution3());
    }

    @Test
    public void test_constructor010() {
        int flags = BodyCompositionFeature.TIME_STAMP_SUPPORTED_FALSE
                | BodyCompositionFeature.MULTIPLE_USERS_SUPPORTED_FALSE
                | BodyCompositionFeature.BASAL_METABOLISM_SUPPORTED_FALSE
                | BodyCompositionFeature.MUSCLE_PERCENTAGE_SUPPORTED_FALSE
                | BodyCompositionFeature.MUSCLE_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.FAT_FREE_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.SOTT_LEAN_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.BODY_WATER_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.IMPEDANCE_SUPPORTED_TRUE
                | BodyCompositionFeature.WEIGHT_SUPPORTED_FALSE
                | BodyCompositionFeature.HEIGHT_SUPPORTED_FALSE
                | BodyCompositionFeature.MASS_MEASUREMENT_RESOLUTION_NOT_SPECIFIED
                | BodyCompositionFeature.HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        BodyCompositionFeature result1 = new BodyCompositionFeature(data);
        assertArrayEquals(data, result1.getBodyCompositionFeature());
        assertFalse(result1.isTimeStampSupported());
        assertTrue(result1.isTimeStampNotSupported());
        assertFalse(result1.isMultipleUsersSupported());
        assertTrue(result1.isMultipleUsersNotSupported());
        assertFalse(result1.isBasalMetabolismSupported());
        assertTrue(result1.isBasalMetabolismNotSupported());
        assertFalse(result1.isMusclePercentageSupported());
        assertTrue(result1.isMusclePercentageNotSupported());
        assertFalse(result1.isMuscleMassSupported());
        assertTrue(result1.isMuscleMassNotSupported());
        assertFalse(result1.isFatFreeMassSupported());
        assertTrue(result1.isFatFreeMassNotSupported());
        assertFalse(result1.isSoftLeanMassSupported());
        assertTrue(result1.isSoftLeanMassNotSupported());
        assertFalse(result1.isBodyWaterMassSupported());
        assertTrue(result1.isBodyWaterMassNotSupported());
        assertTrue(result1.isImpedanceMassSupported());
        assertFalse(result1.isImpedanceNotSupported());
        assertFalse(result1.isWeightMassSupported());
        assertTrue(result1.isWeightNotSupported());
        assertFalse(result1.isHeightMassSupported());
        assertTrue(result1.isHeightNotSupported());
        assertTrue(result1.isMassScaleMeasurementResolutionNotSpecified());
        assertFalse(result1.isMassScaleMeasurementResolution1());
        assertFalse(result1.isMassScaleMeasurementResolution2());
        assertFalse(result1.isMassScaleMeasurementResolution3());
        assertFalse(result1.isMassScaleMeasurementResolution4());
        assertFalse(result1.isMassScaleMeasurementResolution5());
        assertFalse(result1.isMassScaleMeasurementResolution6());
        assertFalse(result1.isMassScaleMeasurementResolution7());
        assertTrue(result1.isHeightMeasurementResolutionNotSpecified());
        assertFalse(result1.isHeightMeasurementResolution1());
        assertFalse(result1.isHeightMeasurementResolution2());
        assertFalse(result1.isHeightMeasurementResolution3());
    }

    @Test
    public void test_constructor011() {
        int flags = BodyCompositionFeature.TIME_STAMP_SUPPORTED_FALSE
                | BodyCompositionFeature.MULTIPLE_USERS_SUPPORTED_FALSE
                | BodyCompositionFeature.BASAL_METABOLISM_SUPPORTED_FALSE
                | BodyCompositionFeature.MUSCLE_PERCENTAGE_SUPPORTED_FALSE
                | BodyCompositionFeature.MUSCLE_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.FAT_FREE_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.SOTT_LEAN_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.BODY_WATER_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.IMPEDANCE_SUPPORTED_FALSE
                | BodyCompositionFeature.WEIGHT_SUPPORTED_TRUE
                | BodyCompositionFeature.HEIGHT_SUPPORTED_FALSE
                | BodyCompositionFeature.MASS_MEASUREMENT_RESOLUTION_NOT_SPECIFIED
                | BodyCompositionFeature.HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        BodyCompositionFeature result1 = new BodyCompositionFeature(data);
        assertArrayEquals(data, result1.getBodyCompositionFeature());
        assertFalse(result1.isTimeStampSupported());
        assertTrue(result1.isTimeStampNotSupported());
        assertFalse(result1.isMultipleUsersSupported());
        assertTrue(result1.isMultipleUsersNotSupported());
        assertFalse(result1.isBasalMetabolismSupported());
        assertTrue(result1.isBasalMetabolismNotSupported());
        assertFalse(result1.isMusclePercentageSupported());
        assertTrue(result1.isMusclePercentageNotSupported());
        assertFalse(result1.isMuscleMassSupported());
        assertTrue(result1.isMuscleMassNotSupported());
        assertFalse(result1.isFatFreeMassSupported());
        assertTrue(result1.isFatFreeMassNotSupported());
        assertFalse(result1.isSoftLeanMassSupported());
        assertTrue(result1.isSoftLeanMassNotSupported());
        assertFalse(result1.isBodyWaterMassSupported());
        assertTrue(result1.isBodyWaterMassNotSupported());
        assertFalse(result1.isImpedanceMassSupported());
        assertTrue(result1.isImpedanceNotSupported());
        assertTrue(result1.isWeightMassSupported());
        assertFalse(result1.isWeightNotSupported());
        assertFalse(result1.isHeightMassSupported());
        assertTrue(result1.isHeightNotSupported());
        assertTrue(result1.isMassScaleMeasurementResolutionNotSpecified());
        assertFalse(result1.isMassScaleMeasurementResolution1());
        assertFalse(result1.isMassScaleMeasurementResolution2());
        assertFalse(result1.isMassScaleMeasurementResolution3());
        assertFalse(result1.isMassScaleMeasurementResolution4());
        assertFalse(result1.isMassScaleMeasurementResolution5());
        assertFalse(result1.isMassScaleMeasurementResolution6());
        assertFalse(result1.isMassScaleMeasurementResolution7());
        assertTrue(result1.isHeightMeasurementResolutionNotSpecified());
        assertFalse(result1.isHeightMeasurementResolution1());
        assertFalse(result1.isHeightMeasurementResolution2());
        assertFalse(result1.isHeightMeasurementResolution3());
    }

    @Test
    public void test_constructor012() {
        int flags = BodyCompositionFeature.TIME_STAMP_SUPPORTED_FALSE
                | BodyCompositionFeature.MULTIPLE_USERS_SUPPORTED_FALSE
                | BodyCompositionFeature.BASAL_METABOLISM_SUPPORTED_FALSE
                | BodyCompositionFeature.MUSCLE_PERCENTAGE_SUPPORTED_FALSE
                | BodyCompositionFeature.MUSCLE_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.FAT_FREE_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.SOTT_LEAN_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.BODY_WATER_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.IMPEDANCE_SUPPORTED_FALSE
                | BodyCompositionFeature.WEIGHT_SUPPORTED_FALSE
                | BodyCompositionFeature.HEIGHT_SUPPORTED_TRUE
                | BodyCompositionFeature.MASS_MEASUREMENT_RESOLUTION_NOT_SPECIFIED
                | BodyCompositionFeature.HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        BodyCompositionFeature result1 = new BodyCompositionFeature(data);
        assertArrayEquals(data, result1.getBodyCompositionFeature());
        assertFalse(result1.isTimeStampSupported());
        assertTrue(result1.isTimeStampNotSupported());
        assertFalse(result1.isMultipleUsersSupported());
        assertTrue(result1.isMultipleUsersNotSupported());
        assertFalse(result1.isBasalMetabolismSupported());
        assertTrue(result1.isBasalMetabolismNotSupported());
        assertFalse(result1.isMusclePercentageSupported());
        assertTrue(result1.isMusclePercentageNotSupported());
        assertFalse(result1.isMuscleMassSupported());
        assertTrue(result1.isMuscleMassNotSupported());
        assertFalse(result1.isFatFreeMassSupported());
        assertTrue(result1.isFatFreeMassNotSupported());
        assertFalse(result1.isSoftLeanMassSupported());
        assertTrue(result1.isSoftLeanMassNotSupported());
        assertFalse(result1.isBodyWaterMassSupported());
        assertTrue(result1.isBodyWaterMassNotSupported());
        assertFalse(result1.isImpedanceMassSupported());
        assertTrue(result1.isImpedanceNotSupported());
        assertFalse(result1.isWeightMassSupported());
        assertTrue(result1.isWeightNotSupported());
        assertTrue(result1.isHeightMassSupported());
        assertFalse(result1.isHeightNotSupported());
        assertTrue(result1.isMassScaleMeasurementResolutionNotSpecified());
        assertFalse(result1.isMassScaleMeasurementResolution1());
        assertFalse(result1.isMassScaleMeasurementResolution2());
        assertFalse(result1.isMassScaleMeasurementResolution3());
        assertFalse(result1.isMassScaleMeasurementResolution4());
        assertFalse(result1.isMassScaleMeasurementResolution5());
        assertFalse(result1.isMassScaleMeasurementResolution6());
        assertFalse(result1.isMassScaleMeasurementResolution7());
        assertTrue(result1.isHeightMeasurementResolutionNotSpecified());
        assertFalse(result1.isHeightMeasurementResolution1());
        assertFalse(result1.isHeightMeasurementResolution2());
        assertFalse(result1.isHeightMeasurementResolution3());
    }

    @Test
    public void test_constructor013() {
        int flags = BodyCompositionFeature.TIME_STAMP_SUPPORTED_FALSE
                | BodyCompositionFeature.MULTIPLE_USERS_SUPPORTED_FALSE
                | BodyCompositionFeature.BASAL_METABOLISM_SUPPORTED_FALSE
                | BodyCompositionFeature.MUSCLE_PERCENTAGE_SUPPORTED_FALSE
                | BodyCompositionFeature.MUSCLE_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.FAT_FREE_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.SOTT_LEAN_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.BODY_WATER_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.IMPEDANCE_SUPPORTED_FALSE
                | BodyCompositionFeature.WEIGHT_SUPPORTED_FALSE
                | BodyCompositionFeature.HEIGHT_SUPPORTED_FALSE
                | BodyCompositionFeature.MASS_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_5KG_OR_1LB
                | BodyCompositionFeature.HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        BodyCompositionFeature result1 = new BodyCompositionFeature(data);
        assertArrayEquals(data, result1.getBodyCompositionFeature());
        assertFalse(result1.isTimeStampSupported());
        assertTrue(result1.isTimeStampNotSupported());
        assertFalse(result1.isMultipleUsersSupported());
        assertTrue(result1.isMultipleUsersNotSupported());
        assertFalse(result1.isBasalMetabolismSupported());
        assertTrue(result1.isBasalMetabolismNotSupported());
        assertFalse(result1.isMusclePercentageSupported());
        assertTrue(result1.isMusclePercentageNotSupported());
        assertFalse(result1.isMuscleMassSupported());
        assertTrue(result1.isMuscleMassNotSupported());
        assertFalse(result1.isFatFreeMassSupported());
        assertTrue(result1.isFatFreeMassNotSupported());
        assertFalse(result1.isSoftLeanMassSupported());
        assertTrue(result1.isSoftLeanMassNotSupported());
        assertFalse(result1.isBodyWaterMassSupported());
        assertTrue(result1.isBodyWaterMassNotSupported());
        assertFalse(result1.isImpedanceMassSupported());
        assertTrue(result1.isImpedanceNotSupported());
        assertFalse(result1.isWeightMassSupported());
        assertTrue(result1.isWeightNotSupported());
        assertFalse(result1.isHeightMassSupported());
        assertTrue(result1.isHeightNotSupported());
        assertFalse(result1.isMassScaleMeasurementResolutionNotSpecified());
        assertTrue(result1.isMassScaleMeasurementResolution1());
        assertFalse(result1.isMassScaleMeasurementResolution2());
        assertFalse(result1.isMassScaleMeasurementResolution3());
        assertFalse(result1.isMassScaleMeasurementResolution4());
        assertFalse(result1.isMassScaleMeasurementResolution5());
        assertFalse(result1.isMassScaleMeasurementResolution6());
        assertFalse(result1.isMassScaleMeasurementResolution7());
        assertTrue(result1.isHeightMeasurementResolutionNotSpecified());
        assertFalse(result1.isHeightMeasurementResolution1());
        assertFalse(result1.isHeightMeasurementResolution2());
        assertFalse(result1.isHeightMeasurementResolution3());
    }

    @Test
    public void test_constructor014() {
        int flags = BodyCompositionFeature.TIME_STAMP_SUPPORTED_FALSE
                | BodyCompositionFeature.MULTIPLE_USERS_SUPPORTED_FALSE
                | BodyCompositionFeature.BASAL_METABOLISM_SUPPORTED_FALSE
                | BodyCompositionFeature.MUSCLE_PERCENTAGE_SUPPORTED_FALSE
                | BodyCompositionFeature.MUSCLE_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.FAT_FREE_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.SOTT_LEAN_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.BODY_WATER_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.IMPEDANCE_SUPPORTED_FALSE
                | BodyCompositionFeature.WEIGHT_SUPPORTED_FALSE
                | BodyCompositionFeature.HEIGHT_SUPPORTED_FALSE
                | BodyCompositionFeature.MASS_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_2KG_OR_0_5LB
                | BodyCompositionFeature.HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        BodyCompositionFeature result1 = new BodyCompositionFeature(data);
        assertArrayEquals(data, result1.getBodyCompositionFeature());
        assertFalse(result1.isTimeStampSupported());
        assertTrue(result1.isTimeStampNotSupported());
        assertFalse(result1.isMultipleUsersSupported());
        assertTrue(result1.isMultipleUsersNotSupported());
        assertFalse(result1.isBasalMetabolismSupported());
        assertTrue(result1.isBasalMetabolismNotSupported());
        assertFalse(result1.isMusclePercentageSupported());
        assertTrue(result1.isMusclePercentageNotSupported());
        assertFalse(result1.isMuscleMassSupported());
        assertTrue(result1.isMuscleMassNotSupported());
        assertFalse(result1.isFatFreeMassSupported());
        assertTrue(result1.isFatFreeMassNotSupported());
        assertFalse(result1.isSoftLeanMassSupported());
        assertTrue(result1.isSoftLeanMassNotSupported());
        assertFalse(result1.isBodyWaterMassSupported());
        assertTrue(result1.isBodyWaterMassNotSupported());
        assertFalse(result1.isImpedanceMassSupported());
        assertTrue(result1.isImpedanceNotSupported());
        assertFalse(result1.isWeightMassSupported());
        assertTrue(result1.isWeightNotSupported());
        assertFalse(result1.isHeightMassSupported());
        assertTrue(result1.isHeightNotSupported());
        assertFalse(result1.isMassScaleMeasurementResolutionNotSpecified());
        assertFalse(result1.isMassScaleMeasurementResolution1());
        assertTrue(result1.isMassScaleMeasurementResolution2());
        assertFalse(result1.isMassScaleMeasurementResolution3());
        assertFalse(result1.isMassScaleMeasurementResolution4());
        assertFalse(result1.isMassScaleMeasurementResolution5());
        assertFalse(result1.isMassScaleMeasurementResolution6());
        assertFalse(result1.isMassScaleMeasurementResolution7());
        assertTrue(result1.isHeightMeasurementResolutionNotSpecified());
        assertFalse(result1.isHeightMeasurementResolution1());
        assertFalse(result1.isHeightMeasurementResolution2());
        assertFalse(result1.isHeightMeasurementResolution3());
    }

    @Test
    public void test_constructor015() {
        int flags = BodyCompositionFeature.TIME_STAMP_SUPPORTED_FALSE
                | BodyCompositionFeature.MULTIPLE_USERS_SUPPORTED_FALSE
                | BodyCompositionFeature.BASAL_METABOLISM_SUPPORTED_FALSE
                | BodyCompositionFeature.MUSCLE_PERCENTAGE_SUPPORTED_FALSE
                | BodyCompositionFeature.MUSCLE_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.FAT_FREE_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.SOTT_LEAN_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.BODY_WATER_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.IMPEDANCE_SUPPORTED_FALSE
                | BodyCompositionFeature.WEIGHT_SUPPORTED_FALSE
                | BodyCompositionFeature.HEIGHT_SUPPORTED_FALSE
                | BodyCompositionFeature.MASS_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_1KG_OR_0_2LB
                | BodyCompositionFeature.HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        BodyCompositionFeature result1 = new BodyCompositionFeature(data);
        assertArrayEquals(data, result1.getBodyCompositionFeature());
        assertFalse(result1.isTimeStampSupported());
        assertTrue(result1.isTimeStampNotSupported());
        assertFalse(result1.isMultipleUsersSupported());
        assertTrue(result1.isMultipleUsersNotSupported());
        assertFalse(result1.isBasalMetabolismSupported());
        assertTrue(result1.isBasalMetabolismNotSupported());
        assertFalse(result1.isMusclePercentageSupported());
        assertTrue(result1.isMusclePercentageNotSupported());
        assertFalse(result1.isMuscleMassSupported());
        assertTrue(result1.isMuscleMassNotSupported());
        assertFalse(result1.isFatFreeMassSupported());
        assertTrue(result1.isFatFreeMassNotSupported());
        assertFalse(result1.isSoftLeanMassSupported());
        assertTrue(result1.isSoftLeanMassNotSupported());
        assertFalse(result1.isBodyWaterMassSupported());
        assertTrue(result1.isBodyWaterMassNotSupported());
        assertFalse(result1.isImpedanceMassSupported());
        assertTrue(result1.isImpedanceNotSupported());
        assertFalse(result1.isWeightMassSupported());
        assertTrue(result1.isWeightNotSupported());
        assertFalse(result1.isHeightMassSupported());
        assertTrue(result1.isHeightNotSupported());
        assertFalse(result1.isMassScaleMeasurementResolutionNotSpecified());
        assertFalse(result1.isMassScaleMeasurementResolution1());
        assertFalse(result1.isMassScaleMeasurementResolution2());
        assertTrue(result1.isMassScaleMeasurementResolution3());
        assertFalse(result1.isMassScaleMeasurementResolution4());
        assertFalse(result1.isMassScaleMeasurementResolution5());
        assertFalse(result1.isMassScaleMeasurementResolution6());
        assertFalse(result1.isMassScaleMeasurementResolution7());
        assertTrue(result1.isHeightMeasurementResolutionNotSpecified());
        assertFalse(result1.isHeightMeasurementResolution1());
        assertFalse(result1.isHeightMeasurementResolution2());
        assertFalse(result1.isHeightMeasurementResolution3());
    }

    @Test
    public void test_constructor016() {
        int flags = BodyCompositionFeature.TIME_STAMP_SUPPORTED_FALSE
                | BodyCompositionFeature.MULTIPLE_USERS_SUPPORTED_FALSE
                | BodyCompositionFeature.BASAL_METABOLISM_SUPPORTED_FALSE
                | BodyCompositionFeature.MUSCLE_PERCENTAGE_SUPPORTED_FALSE
                | BodyCompositionFeature.MUSCLE_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.FAT_FREE_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.SOTT_LEAN_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.BODY_WATER_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.IMPEDANCE_SUPPORTED_FALSE
                | BodyCompositionFeature.WEIGHT_SUPPORTED_FALSE
                | BodyCompositionFeature.HEIGHT_SUPPORTED_FALSE
                | BodyCompositionFeature.MASS_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_05KG_OR_0_1B
                | BodyCompositionFeature.HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        BodyCompositionFeature result1 = new BodyCompositionFeature(data);
        assertArrayEquals(data, result1.getBodyCompositionFeature());
        assertFalse(result1.isTimeStampSupported());
        assertTrue(result1.isTimeStampNotSupported());
        assertFalse(result1.isMultipleUsersSupported());
        assertTrue(result1.isMultipleUsersNotSupported());
        assertFalse(result1.isBasalMetabolismSupported());
        assertTrue(result1.isBasalMetabolismNotSupported());
        assertFalse(result1.isMusclePercentageSupported());
        assertTrue(result1.isMusclePercentageNotSupported());
        assertFalse(result1.isMuscleMassSupported());
        assertTrue(result1.isMuscleMassNotSupported());
        assertFalse(result1.isFatFreeMassSupported());
        assertTrue(result1.isFatFreeMassNotSupported());
        assertFalse(result1.isSoftLeanMassSupported());
        assertTrue(result1.isSoftLeanMassNotSupported());
        assertFalse(result1.isBodyWaterMassSupported());
        assertTrue(result1.isBodyWaterMassNotSupported());
        assertFalse(result1.isImpedanceMassSupported());
        assertTrue(result1.isImpedanceNotSupported());
        assertFalse(result1.isWeightMassSupported());
        assertTrue(result1.isWeightNotSupported());
        assertFalse(result1.isHeightMassSupported());
        assertTrue(result1.isHeightNotSupported());
        assertFalse(result1.isMassScaleMeasurementResolutionNotSpecified());
        assertFalse(result1.isMassScaleMeasurementResolution1());
        assertFalse(result1.isMassScaleMeasurementResolution2());
        assertFalse(result1.isMassScaleMeasurementResolution3());
        assertTrue(result1.isMassScaleMeasurementResolution4());
        assertFalse(result1.isMassScaleMeasurementResolution5());
        assertFalse(result1.isMassScaleMeasurementResolution6());
        assertFalse(result1.isMassScaleMeasurementResolution7());
        assertTrue(result1.isHeightMeasurementResolutionNotSpecified());
        assertFalse(result1.isHeightMeasurementResolution1());
        assertFalse(result1.isHeightMeasurementResolution2());
        assertFalse(result1.isHeightMeasurementResolution3());
    }

    @Test
    public void test_constructor017() {
        int flags = BodyCompositionFeature.TIME_STAMP_SUPPORTED_FALSE
                | BodyCompositionFeature.MULTIPLE_USERS_SUPPORTED_FALSE
                | BodyCompositionFeature.BASAL_METABOLISM_SUPPORTED_FALSE
                | BodyCompositionFeature.MUSCLE_PERCENTAGE_SUPPORTED_FALSE
                | BodyCompositionFeature.MUSCLE_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.FAT_FREE_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.SOTT_LEAN_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.BODY_WATER_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.IMPEDANCE_SUPPORTED_FALSE
                | BodyCompositionFeature.WEIGHT_SUPPORTED_FALSE
                | BodyCompositionFeature.HEIGHT_SUPPORTED_FALSE
                | BodyCompositionFeature.MASS_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_02KG_OR_0_05B
                | BodyCompositionFeature.HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        BodyCompositionFeature result1 = new BodyCompositionFeature(data);
        assertArrayEquals(data, result1.getBodyCompositionFeature());
        assertFalse(result1.isTimeStampSupported());
        assertTrue(result1.isTimeStampNotSupported());
        assertFalse(result1.isMultipleUsersSupported());
        assertTrue(result1.isMultipleUsersNotSupported());
        assertFalse(result1.isBasalMetabolismSupported());
        assertTrue(result1.isBasalMetabolismNotSupported());
        assertFalse(result1.isMusclePercentageSupported());
        assertTrue(result1.isMusclePercentageNotSupported());
        assertFalse(result1.isMuscleMassSupported());
        assertTrue(result1.isMuscleMassNotSupported());
        assertFalse(result1.isFatFreeMassSupported());
        assertTrue(result1.isFatFreeMassNotSupported());
        assertFalse(result1.isSoftLeanMassSupported());
        assertTrue(result1.isSoftLeanMassNotSupported());
        assertFalse(result1.isBodyWaterMassSupported());
        assertTrue(result1.isBodyWaterMassNotSupported());
        assertFalse(result1.isImpedanceMassSupported());
        assertTrue(result1.isImpedanceNotSupported());
        assertFalse(result1.isWeightMassSupported());
        assertTrue(result1.isWeightNotSupported());
        assertFalse(result1.isHeightMassSupported());
        assertTrue(result1.isHeightNotSupported());
        assertFalse(result1.isMassScaleMeasurementResolutionNotSpecified());
        assertFalse(result1.isMassScaleMeasurementResolution1());
        assertFalse(result1.isMassScaleMeasurementResolution2());
        assertFalse(result1.isMassScaleMeasurementResolution3());
        assertFalse(result1.isMassScaleMeasurementResolution4());
        assertTrue(result1.isMassScaleMeasurementResolution5());
        assertFalse(result1.isMassScaleMeasurementResolution6());
        assertFalse(result1.isMassScaleMeasurementResolution7());
        assertTrue(result1.isHeightMeasurementResolutionNotSpecified());
        assertFalse(result1.isHeightMeasurementResolution1());
        assertFalse(result1.isHeightMeasurementResolution2());
        assertFalse(result1.isHeightMeasurementResolution3());
    }

    @Test
    public void test_constructor018() {
        int flags = BodyCompositionFeature.TIME_STAMP_SUPPORTED_FALSE
                | BodyCompositionFeature.MULTIPLE_USERS_SUPPORTED_FALSE
                | BodyCompositionFeature.BASAL_METABOLISM_SUPPORTED_FALSE
                | BodyCompositionFeature.MUSCLE_PERCENTAGE_SUPPORTED_FALSE
                | BodyCompositionFeature.MUSCLE_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.FAT_FREE_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.SOTT_LEAN_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.BODY_WATER_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.IMPEDANCE_SUPPORTED_FALSE
                | BodyCompositionFeature.WEIGHT_SUPPORTED_FALSE
                | BodyCompositionFeature.HEIGHT_SUPPORTED_FALSE
                | BodyCompositionFeature.MASS_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_01KG_OR_0_02B
                | BodyCompositionFeature.HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        BodyCompositionFeature result1 = new BodyCompositionFeature(data);
        assertArrayEquals(data, result1.getBodyCompositionFeature());
        assertFalse(result1.isTimeStampSupported());
        assertTrue(result1.isTimeStampNotSupported());
        assertFalse(result1.isMultipleUsersSupported());
        assertTrue(result1.isMultipleUsersNotSupported());
        assertFalse(result1.isBasalMetabolismSupported());
        assertTrue(result1.isBasalMetabolismNotSupported());
        assertFalse(result1.isMusclePercentageSupported());
        assertTrue(result1.isMusclePercentageNotSupported());
        assertFalse(result1.isMuscleMassSupported());
        assertTrue(result1.isMuscleMassNotSupported());
        assertFalse(result1.isFatFreeMassSupported());
        assertTrue(result1.isFatFreeMassNotSupported());
        assertFalse(result1.isSoftLeanMassSupported());
        assertTrue(result1.isSoftLeanMassNotSupported());
        assertFalse(result1.isBodyWaterMassSupported());
        assertTrue(result1.isBodyWaterMassNotSupported());
        assertFalse(result1.isImpedanceMassSupported());
        assertTrue(result1.isImpedanceNotSupported());
        assertFalse(result1.isWeightMassSupported());
        assertTrue(result1.isWeightNotSupported());
        assertFalse(result1.isHeightMassSupported());
        assertTrue(result1.isHeightNotSupported());
        assertFalse(result1.isMassScaleMeasurementResolutionNotSpecified());
        assertFalse(result1.isMassScaleMeasurementResolution1());
        assertFalse(result1.isMassScaleMeasurementResolution2());
        assertFalse(result1.isMassScaleMeasurementResolution3());
        assertFalse(result1.isMassScaleMeasurementResolution4());
        assertFalse(result1.isMassScaleMeasurementResolution5());
        assertTrue(result1.isMassScaleMeasurementResolution6());
        assertFalse(result1.isMassScaleMeasurementResolution7());
        assertTrue(result1.isHeightMeasurementResolutionNotSpecified());
        assertFalse(result1.isHeightMeasurementResolution1());
        assertFalse(result1.isHeightMeasurementResolution2());
        assertFalse(result1.isHeightMeasurementResolution3());
    }

    @Test
    public void test_constructor019() {
        int flags = BodyCompositionFeature.TIME_STAMP_SUPPORTED_FALSE
                | BodyCompositionFeature.MULTIPLE_USERS_SUPPORTED_FALSE
                | BodyCompositionFeature.BASAL_METABOLISM_SUPPORTED_FALSE
                | BodyCompositionFeature.MUSCLE_PERCENTAGE_SUPPORTED_FALSE
                | BodyCompositionFeature.MUSCLE_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.FAT_FREE_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.SOTT_LEAN_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.BODY_WATER_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.IMPEDANCE_SUPPORTED_FALSE
                | BodyCompositionFeature.WEIGHT_SUPPORTED_FALSE
                | BodyCompositionFeature.HEIGHT_SUPPORTED_FALSE
                | BodyCompositionFeature.MASS_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_005KG_OR_0_01B
                | BodyCompositionFeature.HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        BodyCompositionFeature result1 = new BodyCompositionFeature(data);
        assertArrayEquals(data, result1.getBodyCompositionFeature());
        assertFalse(result1.isTimeStampSupported());
        assertTrue(result1.isTimeStampNotSupported());
        assertFalse(result1.isMultipleUsersSupported());
        assertTrue(result1.isMultipleUsersNotSupported());
        assertFalse(result1.isBasalMetabolismSupported());
        assertTrue(result1.isBasalMetabolismNotSupported());
        assertFalse(result1.isMusclePercentageSupported());
        assertTrue(result1.isMusclePercentageNotSupported());
        assertFalse(result1.isMuscleMassSupported());
        assertTrue(result1.isMuscleMassNotSupported());
        assertFalse(result1.isFatFreeMassSupported());
        assertTrue(result1.isFatFreeMassNotSupported());
        assertFalse(result1.isSoftLeanMassSupported());
        assertTrue(result1.isSoftLeanMassNotSupported());
        assertFalse(result1.isBodyWaterMassSupported());
        assertTrue(result1.isBodyWaterMassNotSupported());
        assertFalse(result1.isImpedanceMassSupported());
        assertTrue(result1.isImpedanceNotSupported());
        assertFalse(result1.isWeightMassSupported());
        assertTrue(result1.isWeightNotSupported());
        assertFalse(result1.isHeightMassSupported());
        assertTrue(result1.isHeightNotSupported());
        assertFalse(result1.isMassScaleMeasurementResolutionNotSpecified());
        assertFalse(result1.isMassScaleMeasurementResolution1());
        assertFalse(result1.isMassScaleMeasurementResolution2());
        assertFalse(result1.isMassScaleMeasurementResolution3());
        assertFalse(result1.isMassScaleMeasurementResolution4());
        assertFalse(result1.isMassScaleMeasurementResolution5());
        assertFalse(result1.isMassScaleMeasurementResolution6());
        assertTrue(result1.isMassScaleMeasurementResolution7());
        assertTrue(result1.isHeightMeasurementResolutionNotSpecified());
        assertFalse(result1.isHeightMeasurementResolution1());
        assertFalse(result1.isHeightMeasurementResolution2());
        assertFalse(result1.isHeightMeasurementResolution3());
    }

    @Test
    public void test_constructor020() {
        int flags = BodyCompositionFeature.TIME_STAMP_SUPPORTED_FALSE
                | BodyCompositionFeature.MULTIPLE_USERS_SUPPORTED_FALSE
                | BodyCompositionFeature.BASAL_METABOLISM_SUPPORTED_FALSE
                | BodyCompositionFeature.MUSCLE_PERCENTAGE_SUPPORTED_FALSE
                | BodyCompositionFeature.MUSCLE_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.FAT_FREE_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.SOTT_LEAN_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.BODY_WATER_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.IMPEDANCE_SUPPORTED_FALSE
                | BodyCompositionFeature.WEIGHT_SUPPORTED_FALSE
                | BodyCompositionFeature.HEIGHT_SUPPORTED_FALSE
                | BodyCompositionFeature.MASS_MEASUREMENT_RESOLUTION_NOT_SPECIFIED
                | BodyCompositionFeature.HEIGHT_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_01_METER_OR_1INCH;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        BodyCompositionFeature result1 = new BodyCompositionFeature(data);
        assertArrayEquals(data, result1.getBodyCompositionFeature());
        assertFalse(result1.isTimeStampSupported());
        assertTrue(result1.isTimeStampNotSupported());
        assertFalse(result1.isMultipleUsersSupported());
        assertTrue(result1.isMultipleUsersNotSupported());
        assertFalse(result1.isBasalMetabolismSupported());
        assertTrue(result1.isBasalMetabolismNotSupported());
        assertFalse(result1.isMusclePercentageSupported());
        assertTrue(result1.isMusclePercentageNotSupported());
        assertFalse(result1.isMuscleMassSupported());
        assertTrue(result1.isMuscleMassNotSupported());
        assertFalse(result1.isFatFreeMassSupported());
        assertTrue(result1.isFatFreeMassNotSupported());
        assertFalse(result1.isSoftLeanMassSupported());
        assertTrue(result1.isSoftLeanMassNotSupported());
        assertFalse(result1.isBodyWaterMassSupported());
        assertTrue(result1.isBodyWaterMassNotSupported());
        assertFalse(result1.isImpedanceMassSupported());
        assertTrue(result1.isImpedanceNotSupported());
        assertFalse(result1.isWeightMassSupported());
        assertTrue(result1.isWeightNotSupported());
        assertFalse(result1.isHeightMassSupported());
        assertTrue(result1.isHeightNotSupported());
        assertTrue(result1.isMassScaleMeasurementResolutionNotSpecified());
        assertFalse(result1.isMassScaleMeasurementResolution1());
        assertFalse(result1.isMassScaleMeasurementResolution2());
        assertFalse(result1.isMassScaleMeasurementResolution3());
        assertFalse(result1.isMassScaleMeasurementResolution4());
        assertFalse(result1.isMassScaleMeasurementResolution5());
        assertFalse(result1.isMassScaleMeasurementResolution6());
        assertFalse(result1.isMassScaleMeasurementResolution7());
        assertFalse(result1.isHeightMeasurementResolutionNotSpecified());
        assertTrue(result1.isHeightMeasurementResolution1());
        assertFalse(result1.isHeightMeasurementResolution2());
        assertFalse(result1.isHeightMeasurementResolution3());
    }

    @Test
    public void test_constructor021() {
        int flags = BodyCompositionFeature.TIME_STAMP_SUPPORTED_FALSE
                | BodyCompositionFeature.MULTIPLE_USERS_SUPPORTED_FALSE
                | BodyCompositionFeature.BASAL_METABOLISM_SUPPORTED_FALSE
                | BodyCompositionFeature.MUSCLE_PERCENTAGE_SUPPORTED_FALSE
                | BodyCompositionFeature.MUSCLE_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.FAT_FREE_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.SOTT_LEAN_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.BODY_WATER_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.IMPEDANCE_SUPPORTED_FALSE
                | BodyCompositionFeature.WEIGHT_SUPPORTED_FALSE
                | BodyCompositionFeature.HEIGHT_SUPPORTED_FALSE
                | BodyCompositionFeature.MASS_MEASUREMENT_RESOLUTION_NOT_SPECIFIED
                | BodyCompositionFeature.HEIGHT_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_005METER_OR_0_5INCH;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        BodyCompositionFeature result1 = new BodyCompositionFeature(data);
        assertArrayEquals(data, result1.getBodyCompositionFeature());
        assertFalse(result1.isTimeStampSupported());
        assertTrue(result1.isTimeStampNotSupported());
        assertFalse(result1.isMultipleUsersSupported());
        assertTrue(result1.isMultipleUsersNotSupported());
        assertFalse(result1.isBasalMetabolismSupported());
        assertTrue(result1.isBasalMetabolismNotSupported());
        assertFalse(result1.isMusclePercentageSupported());
        assertTrue(result1.isMusclePercentageNotSupported());
        assertFalse(result1.isMuscleMassSupported());
        assertTrue(result1.isMuscleMassNotSupported());
        assertFalse(result1.isFatFreeMassSupported());
        assertTrue(result1.isFatFreeMassNotSupported());
        assertFalse(result1.isSoftLeanMassSupported());
        assertTrue(result1.isSoftLeanMassNotSupported());
        assertFalse(result1.isBodyWaterMassSupported());
        assertTrue(result1.isBodyWaterMassNotSupported());
        assertFalse(result1.isImpedanceMassSupported());
        assertTrue(result1.isImpedanceNotSupported());
        assertFalse(result1.isWeightMassSupported());
        assertTrue(result1.isWeightNotSupported());
        assertFalse(result1.isHeightMassSupported());
        assertTrue(result1.isHeightNotSupported());
        assertTrue(result1.isMassScaleMeasurementResolutionNotSpecified());
        assertFalse(result1.isMassScaleMeasurementResolution1());
        assertFalse(result1.isMassScaleMeasurementResolution2());
        assertFalse(result1.isMassScaleMeasurementResolution3());
        assertFalse(result1.isMassScaleMeasurementResolution4());
        assertFalse(result1.isMassScaleMeasurementResolution5());
        assertFalse(result1.isMassScaleMeasurementResolution6());
        assertFalse(result1.isMassScaleMeasurementResolution7());
        assertFalse(result1.isHeightMeasurementResolutionNotSpecified());
        assertFalse(result1.isHeightMeasurementResolution1());
        assertTrue(result1.isHeightMeasurementResolution2());
        assertFalse(result1.isHeightMeasurementResolution3());
    }

    @Test
    public void test_constructor022() {
        int flags = BodyCompositionFeature.TIME_STAMP_SUPPORTED_FALSE
                | BodyCompositionFeature.MULTIPLE_USERS_SUPPORTED_FALSE
                | BodyCompositionFeature.BASAL_METABOLISM_SUPPORTED_FALSE
                | BodyCompositionFeature.MUSCLE_PERCENTAGE_SUPPORTED_FALSE
                | BodyCompositionFeature.MUSCLE_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.FAT_FREE_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.SOTT_LEAN_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.BODY_WATER_MASS_SUPPORTED_FALSE
                | BodyCompositionFeature.IMPEDANCE_SUPPORTED_FALSE
                | BodyCompositionFeature.WEIGHT_SUPPORTED_FALSE
                | BodyCompositionFeature.HEIGHT_SUPPORTED_FALSE
                | BodyCompositionFeature.MASS_MEASUREMENT_RESOLUTION_NOT_SPECIFIED
                | BodyCompositionFeature.HEIGHT_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_001METER_OR_0_1INCH;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        BodyCompositionFeature result1 = new BodyCompositionFeature(data);
        assertArrayEquals(data, result1.getBodyCompositionFeature());
        assertFalse(result1.isTimeStampSupported());
        assertTrue(result1.isTimeStampNotSupported());
        assertFalse(result1.isMultipleUsersSupported());
        assertTrue(result1.isMultipleUsersNotSupported());
        assertFalse(result1.isBasalMetabolismSupported());
        assertTrue(result1.isBasalMetabolismNotSupported());
        assertFalse(result1.isMusclePercentageSupported());
        assertTrue(result1.isMusclePercentageNotSupported());
        assertFalse(result1.isMuscleMassSupported());
        assertTrue(result1.isMuscleMassNotSupported());
        assertFalse(result1.isFatFreeMassSupported());
        assertTrue(result1.isFatFreeMassNotSupported());
        assertFalse(result1.isSoftLeanMassSupported());
        assertTrue(result1.isSoftLeanMassNotSupported());
        assertFalse(result1.isBodyWaterMassSupported());
        assertTrue(result1.isBodyWaterMassNotSupported());
        assertFalse(result1.isImpedanceMassSupported());
        assertTrue(result1.isImpedanceNotSupported());
        assertFalse(result1.isWeightMassSupported());
        assertTrue(result1.isWeightNotSupported());
        assertFalse(result1.isHeightMassSupported());
        assertTrue(result1.isHeightNotSupported());
        assertTrue(result1.isMassScaleMeasurementResolutionNotSpecified());
        assertFalse(result1.isMassScaleMeasurementResolution1());
        assertFalse(result1.isMassScaleMeasurementResolution2());
        assertFalse(result1.isMassScaleMeasurementResolution3());
        assertFalse(result1.isMassScaleMeasurementResolution4());
        assertFalse(result1.isMassScaleMeasurementResolution5());
        assertFalse(result1.isMassScaleMeasurementResolution6());
        assertFalse(result1.isMassScaleMeasurementResolution7());
        assertFalse(result1.isHeightMeasurementResolutionNotSpecified());
        assertFalse(result1.isHeightMeasurementResolution1());
        assertFalse(result1.isHeightMeasurementResolution2());
        assertTrue(result1.isHeightMeasurementResolution3());
    }
    
    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data[ 2] = 0x03;
        data[ 3] = 0x04;
        //@formatter:on

        BodyCompositionFeature result1 = new BodyCompositionFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
