package org.im97mori.ble.characteristic.u2a9e;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class WeightScaleFeatureTest {

    @Test
    public void test_constructor001() {
        int flags = WeightScaleFeature.WEIGHT_SCALE_FEATURE_TIME_STAMP_SUPPORTED_FALSE
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_MULTIPLE_USERS_SUPPORTED_FALSE
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_BMI_SUPPORTED_FALSE
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_WEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        WeightScaleFeature result1 = new WeightScaleFeature(data);
        assertArrayEquals(data, result1.getWeightScaleFeature());
        assertFalse(result1.isWeightScaleFeatureTimeStampSupported());
        assertTrue(result1.isWeightScaleFeatureTimeStampNotSupported());
        assertFalse(result1.isWeightScaleFeatureMultipleUsersSupported());
        assertTrue(result1.isWeightScaleFeatureMultipleUsersNotSupported());
        assertFalse(result1.isWeightScaleFeatureBmiSupported());
        assertTrue(result1.isWeightScaleFeatureBmiNotSupported());
        assertTrue(result1.isWeightScaleFeatureWeightScaleMeasurementResolutionNotSpecified());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution1());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution2());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution3());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution4());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution5());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution6());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution7());
        assertTrue(result1.isWeightScaleFeatureHeightMeasurementResolutionNotSpecified());
        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolution1());
        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolution2());
        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolution3());
    }

    @Test
    public void test_constructor002() {
        int flags = WeightScaleFeature.WEIGHT_SCALE_FEATURE_TIME_STAMP_SUPPORTED_TRUE
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_MULTIPLE_USERS_SUPPORTED_FALSE
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_BMI_SUPPORTED_FALSE
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_WEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        WeightScaleFeature result1 = new WeightScaleFeature(data);
        assertArrayEquals(data, result1.getWeightScaleFeature());
        assertTrue(result1.isWeightScaleFeatureTimeStampSupported());
        assertFalse(result1.isWeightScaleFeatureTimeStampNotSupported());
        assertFalse(result1.isWeightScaleFeatureMultipleUsersSupported());
        assertTrue(result1.isWeightScaleFeatureMultipleUsersNotSupported());
        assertFalse(result1.isWeightScaleFeatureBmiSupported());
        assertTrue(result1.isWeightScaleFeatureBmiNotSupported());
        assertTrue(result1.isWeightScaleFeatureWeightScaleMeasurementResolutionNotSpecified());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution1());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution2());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution3());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution4());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution5());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution6());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution7());
        assertTrue(result1.isWeightScaleFeatureHeightMeasurementResolutionNotSpecified());
        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolution1());
        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolution2());
        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolution3());
    }

    @Test
    public void test_constructor003() {
        int flags = WeightScaleFeature.WEIGHT_SCALE_FEATURE_TIME_STAMP_SUPPORTED_FALSE
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_MULTIPLE_USERS_SUPPORTED_TRUE
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_BMI_SUPPORTED_FALSE
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_WEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        WeightScaleFeature result1 = new WeightScaleFeature(data);
        assertArrayEquals(data, result1.getWeightScaleFeature());
        assertFalse(result1.isWeightScaleFeatureTimeStampSupported());
        assertTrue(result1.isWeightScaleFeatureTimeStampNotSupported());
        assertTrue(result1.isWeightScaleFeatureMultipleUsersSupported());
        assertFalse(result1.isWeightScaleFeatureMultipleUsersNotSupported());
        assertFalse(result1.isWeightScaleFeatureBmiSupported());
        assertTrue(result1.isWeightScaleFeatureBmiNotSupported());
        assertTrue(result1.isWeightScaleFeatureWeightScaleMeasurementResolutionNotSpecified());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution1());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution2());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution3());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution4());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution5());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution6());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution7());
        assertTrue(result1.isWeightScaleFeatureHeightMeasurementResolutionNotSpecified());
        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolution1());
        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolution2());
        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolution3());
    }

    @Test
    public void test_constructor004() {
        int flags = WeightScaleFeature.WEIGHT_SCALE_FEATURE_TIME_STAMP_SUPPORTED_FALSE
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_MULTIPLE_USERS_SUPPORTED_FALSE
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_BMI_SUPPORTED_TRUE
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_WEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        WeightScaleFeature result1 = new WeightScaleFeature(data);
        assertArrayEquals(data, result1.getWeightScaleFeature());
        assertFalse(result1.isWeightScaleFeatureTimeStampSupported());
        assertTrue(result1.isWeightScaleFeatureTimeStampNotSupported());
        assertFalse(result1.isWeightScaleFeatureMultipleUsersSupported());
        assertTrue(result1.isWeightScaleFeatureMultipleUsersNotSupported());
        assertTrue(result1.isWeightScaleFeatureBmiSupported());
        assertFalse(result1.isWeightScaleFeatureBmiNotSupported());
        assertTrue(result1.isWeightScaleFeatureWeightScaleMeasurementResolutionNotSpecified());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution1());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution2());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution3());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution4());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution5());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution6());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution7());
        assertTrue(result1.isWeightScaleFeatureHeightMeasurementResolutionNotSpecified());
        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolution1());
        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolution2());
        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolution3());
    }

    @Test
    public void test_constructor005() {
        int flags = WeightScaleFeature.WEIGHT_SCALE_FEATURE_TIME_STAMP_SUPPORTED_FALSE
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_MULTIPLE_USERS_SUPPORTED_FALSE
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_BMI_SUPPORTED_FALSE
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_WEIGHT_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_5KG_OR_1LB
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        WeightScaleFeature result1 = new WeightScaleFeature(data);
        assertArrayEquals(data, result1.getWeightScaleFeature());
        assertFalse(result1.isWeightScaleFeatureTimeStampSupported());
        assertTrue(result1.isWeightScaleFeatureTimeStampNotSupported());
        assertFalse(result1.isWeightScaleFeatureMultipleUsersSupported());
        assertTrue(result1.isWeightScaleFeatureMultipleUsersNotSupported());
        assertFalse(result1.isWeightScaleFeatureBmiSupported());
        assertTrue(result1.isWeightScaleFeatureBmiNotSupported());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolutionNotSpecified());
        assertTrue(result1.isWeightScaleFeatureWeightScaleMeasurementResolution1());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution2());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution3());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution4());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution5());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution6());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution7());
        assertTrue(result1.isWeightScaleFeatureHeightMeasurementResolutionNotSpecified());
        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolution1());
        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolution2());
        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolution3());
    }

    @Test
    public void test_constructor006() {
        int flags = WeightScaleFeature.WEIGHT_SCALE_FEATURE_TIME_STAMP_SUPPORTED_FALSE
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_MULTIPLE_USERS_SUPPORTED_FALSE
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_BMI_SUPPORTED_FALSE
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_WEIGHT_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_2KG_OR_0_5LB
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        WeightScaleFeature result1 = new WeightScaleFeature(data);
        assertArrayEquals(data, result1.getWeightScaleFeature());
        assertFalse(result1.isWeightScaleFeatureTimeStampSupported());
        assertTrue(result1.isWeightScaleFeatureTimeStampNotSupported());
        assertFalse(result1.isWeightScaleFeatureMultipleUsersSupported());
        assertTrue(result1.isWeightScaleFeatureMultipleUsersNotSupported());
        assertFalse(result1.isWeightScaleFeatureBmiSupported());
        assertTrue(result1.isWeightScaleFeatureBmiNotSupported());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolutionNotSpecified());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution1());
        assertTrue(result1.isWeightScaleFeatureWeightScaleMeasurementResolution2());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution3());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution4());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution5());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution6());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution7());
        assertTrue(result1.isWeightScaleFeatureHeightMeasurementResolutionNotSpecified());
        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolution1());
        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolution2());
        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolution3());
    }

    @Test
    public void test_constructor007() {
        int flags = WeightScaleFeature.WEIGHT_SCALE_FEATURE_TIME_STAMP_SUPPORTED_FALSE
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_MULTIPLE_USERS_SUPPORTED_FALSE
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_BMI_SUPPORTED_FALSE
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_WEIGHT_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_1KG_OR_0_2LB
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        WeightScaleFeature result1 = new WeightScaleFeature(data);
        assertArrayEquals(data, result1.getWeightScaleFeature());
        assertFalse(result1.isWeightScaleFeatureTimeStampSupported());
        assertTrue(result1.isWeightScaleFeatureTimeStampNotSupported());
        assertFalse(result1.isWeightScaleFeatureMultipleUsersSupported());
        assertTrue(result1.isWeightScaleFeatureMultipleUsersNotSupported());
        assertFalse(result1.isWeightScaleFeatureBmiSupported());
        assertTrue(result1.isWeightScaleFeatureBmiNotSupported());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolutionNotSpecified());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution1());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution2());
        assertTrue(result1.isWeightScaleFeatureWeightScaleMeasurementResolution3());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution4());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution5());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution6());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution7());
        assertTrue(result1.isWeightScaleFeatureHeightMeasurementResolutionNotSpecified());
        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolution1());
        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolution2());
        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolution3());
    }

    @Test
    public void test_constructor008() {
        int flags = WeightScaleFeature.WEIGHT_SCALE_FEATURE_TIME_STAMP_SUPPORTED_FALSE
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_MULTIPLE_USERS_SUPPORTED_FALSE
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_BMI_SUPPORTED_FALSE
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_WEIGHT_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_05KG_OR_0_1B
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        WeightScaleFeature result1 = new WeightScaleFeature(data);
        assertArrayEquals(data, result1.getWeightScaleFeature());
        assertFalse(result1.isWeightScaleFeatureTimeStampSupported());
        assertTrue(result1.isWeightScaleFeatureTimeStampNotSupported());
        assertFalse(result1.isWeightScaleFeatureMultipleUsersSupported());
        assertTrue(result1.isWeightScaleFeatureMultipleUsersNotSupported());
        assertFalse(result1.isWeightScaleFeatureBmiSupported());
        assertTrue(result1.isWeightScaleFeatureBmiNotSupported());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolutionNotSpecified());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution1());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution2());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution3());
        assertTrue(result1.isWeightScaleFeatureWeightScaleMeasurementResolution4());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution5());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution6());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution7());
        assertTrue(result1.isWeightScaleFeatureHeightMeasurementResolutionNotSpecified());
        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolution1());
        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolution2());
        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolution3());
    }

    @Test
    public void test_constructor009() {
        int flags = WeightScaleFeature.WEIGHT_SCALE_FEATURE_TIME_STAMP_SUPPORTED_FALSE
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_MULTIPLE_USERS_SUPPORTED_FALSE
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_BMI_SUPPORTED_FALSE
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_WEIGHT_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_02KG_OR_0_05B
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        WeightScaleFeature result1 = new WeightScaleFeature(data);
        assertArrayEquals(data, result1.getWeightScaleFeature());
        assertFalse(result1.isWeightScaleFeatureTimeStampSupported());
        assertTrue(result1.isWeightScaleFeatureTimeStampNotSupported());
        assertFalse(result1.isWeightScaleFeatureMultipleUsersSupported());
        assertTrue(result1.isWeightScaleFeatureMultipleUsersNotSupported());
        assertFalse(result1.isWeightScaleFeatureBmiSupported());
        assertTrue(result1.isWeightScaleFeatureBmiNotSupported());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolutionNotSpecified());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution1());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution2());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution3());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution4());
        assertTrue(result1.isWeightScaleFeatureWeightScaleMeasurementResolution5());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution6());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution7());
        assertTrue(result1.isWeightScaleFeatureHeightMeasurementResolutionNotSpecified());
        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolution1());
        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolution2());
        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolution3());
    }

    @Test
    public void test_constructor010() {
        int flags = WeightScaleFeature.WEIGHT_SCALE_FEATURE_TIME_STAMP_SUPPORTED_FALSE
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_MULTIPLE_USERS_SUPPORTED_FALSE
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_BMI_SUPPORTED_FALSE
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_WEIGHT_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_01KG_OR_0_02B
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        WeightScaleFeature result1 = new WeightScaleFeature(data);
        assertArrayEquals(data, result1.getWeightScaleFeature());
        assertFalse(result1.isWeightScaleFeatureTimeStampSupported());
        assertTrue(result1.isWeightScaleFeatureTimeStampNotSupported());
        assertFalse(result1.isWeightScaleFeatureMultipleUsersSupported());
        assertTrue(result1.isWeightScaleFeatureMultipleUsersNotSupported());
        assertFalse(result1.isWeightScaleFeatureBmiSupported());
        assertTrue(result1.isWeightScaleFeatureBmiNotSupported());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolutionNotSpecified());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution1());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution2());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution3());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution4());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution5());
        assertTrue(result1.isWeightScaleFeatureWeightScaleMeasurementResolution6());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution7());
        assertTrue(result1.isWeightScaleFeatureHeightMeasurementResolutionNotSpecified());
        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolution1());
        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolution2());
        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolution3());
    }

    @Test
    public void test_constructor011() {
        int flags = WeightScaleFeature.WEIGHT_SCALE_FEATURE_TIME_STAMP_SUPPORTED_FALSE
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_MULTIPLE_USERS_SUPPORTED_FALSE
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_BMI_SUPPORTED_FALSE
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_WEIGHT_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_005KG_OR_0_01B
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        WeightScaleFeature result1 = new WeightScaleFeature(data);
        assertArrayEquals(data, result1.getWeightScaleFeature());
        assertFalse(result1.isWeightScaleFeatureTimeStampSupported());
        assertTrue(result1.isWeightScaleFeatureTimeStampNotSupported());
        assertFalse(result1.isWeightScaleFeatureMultipleUsersSupported());
        assertTrue(result1.isWeightScaleFeatureMultipleUsersNotSupported());
        assertFalse(result1.isWeightScaleFeatureBmiSupported());
        assertTrue(result1.isWeightScaleFeatureBmiNotSupported());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolutionNotSpecified());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution1());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution2());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution3());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution4());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution5());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution6());
        assertTrue(result1.isWeightScaleFeatureWeightScaleMeasurementResolution7());
        assertTrue(result1.isWeightScaleFeatureHeightMeasurementResolutionNotSpecified());
        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolution1());
        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolution2());
        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolution3());
    }

    @Test
    public void test_constructor012() {
        int flags = WeightScaleFeature.WEIGHT_SCALE_FEATURE_TIME_STAMP_SUPPORTED_FALSE
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_MULTIPLE_USERS_SUPPORTED_FALSE
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_BMI_SUPPORTED_FALSE
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_WEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_HEIGHT_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_01_METER_OR_1INCH;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        WeightScaleFeature result1 = new WeightScaleFeature(data);
        assertArrayEquals(data, result1.getWeightScaleFeature());
        assertFalse(result1.isWeightScaleFeatureTimeStampSupported());
        assertTrue(result1.isWeightScaleFeatureTimeStampNotSupported());
        assertFalse(result1.isWeightScaleFeatureMultipleUsersSupported());
        assertTrue(result1.isWeightScaleFeatureMultipleUsersNotSupported());
        assertFalse(result1.isWeightScaleFeatureBmiSupported());
        assertTrue(result1.isWeightScaleFeatureBmiNotSupported());
        assertTrue(result1.isWeightScaleFeatureWeightScaleMeasurementResolutionNotSpecified());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution1());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution2());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution3());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution4());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution5());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution6());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution7());
        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolutionNotSpecified());
        assertTrue(result1.isWeightScaleFeatureHeightMeasurementResolution1());
        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolution2());
        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolution3());
    }

    @Test
    public void test_constructor013() {
        int flags = WeightScaleFeature.WEIGHT_SCALE_FEATURE_TIME_STAMP_SUPPORTED_FALSE
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_MULTIPLE_USERS_SUPPORTED_FALSE
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_BMI_SUPPORTED_FALSE
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_WEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_HEIGHT_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_005METER_OR_0_5INCH;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        WeightScaleFeature result1 = new WeightScaleFeature(data);
        assertArrayEquals(data, result1.getWeightScaleFeature());
        assertFalse(result1.isWeightScaleFeatureTimeStampSupported());
        assertTrue(result1.isWeightScaleFeatureTimeStampNotSupported());
        assertFalse(result1.isWeightScaleFeatureMultipleUsersSupported());
        assertTrue(result1.isWeightScaleFeatureMultipleUsersNotSupported());
        assertFalse(result1.isWeightScaleFeatureBmiSupported());
        assertTrue(result1.isWeightScaleFeatureBmiNotSupported());
        assertTrue(result1.isWeightScaleFeatureWeightScaleMeasurementResolutionNotSpecified());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution1());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution2());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution3());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution4());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution5());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution6());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution7());
        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolutionNotSpecified());
        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolution1());
        assertTrue(result1.isWeightScaleFeatureHeightMeasurementResolution2());
        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolution3());
    }

    @Test
    public void test_constructor014() {
        int flags = WeightScaleFeature.WEIGHT_SCALE_FEATURE_TIME_STAMP_SUPPORTED_FALSE
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_MULTIPLE_USERS_SUPPORTED_FALSE
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_BMI_SUPPORTED_FALSE
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_WEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED
                | WeightScaleFeature.WEIGHT_SCALE_FEATURE_HEIGHT_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_001METER_OR_0_1INCH;
        //@formatter:off
        byte[] data = new byte[4];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        data[ 2] = (byte) (flags >> 16);
        data[ 3] = (byte) (flags >> 24);
        //@formatter:on

        WeightScaleFeature result1 = new WeightScaleFeature(data);
        assertArrayEquals(data, result1.getWeightScaleFeature());
        assertFalse(result1.isWeightScaleFeatureTimeStampSupported());
        assertTrue(result1.isWeightScaleFeatureTimeStampNotSupported());
        assertFalse(result1.isWeightScaleFeatureMultipleUsersSupported());
        assertTrue(result1.isWeightScaleFeatureMultipleUsersNotSupported());
        assertFalse(result1.isWeightScaleFeatureBmiSupported());
        assertTrue(result1.isWeightScaleFeatureBmiNotSupported());
        assertTrue(result1.isWeightScaleFeatureWeightScaleMeasurementResolutionNotSpecified());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution1());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution2());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution3());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution4());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution5());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution6());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution7());
        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolutionNotSpecified());
        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolution1());
        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolution2());
        assertTrue(result1.isWeightScaleFeatureHeightMeasurementResolution3());
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

        WeightScaleFeature result1 = new WeightScaleFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
