package org.im97mori.ble.characteristic.u2a9e;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class WeightScaleFeatureTest extends TestBase {

    @Test
    public void test_constructor_00001() {
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
    public void test_constructor_00002() {
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
    public void test_constructor_00003() {
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
    public void test_constructor_00004() {
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
    public void test_constructor_00005() {
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
    public void test_constructor_00006() {
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
    public void test_constructor_00007() {
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
    public void test_constructor_00008() {
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
    public void test_constructor_00009() {
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
    public void test_constructor_00010() {
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
    public void test_constructor_00011() {
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
    public void test_constructor_00012() {
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
    public void test_constructor_00013() {
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
    public void test_constructor_00014() {
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
    public void test_constructor_00101() {
        //@formatter:off
        WeightScaleFeature result1 = new WeightScaleFeature(true
                , false
                , false
                , WeightScaleFeature.WEIGHT_SCALE_FEATURE_WEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED 
                , WeightScaleFeature.WEIGHT_SCALE_FEATURE_HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED);
        //@formatter:on

        assertTrue(result1.isWeightScaleFeatureTimeStampSupported());
        assertFalse(result1.isWeightScaleFeatureTimeStampNotSupported());
    }

    @Test
    public void test_constructor_00102() {
        //@formatter:off
        WeightScaleFeature result1 = new WeightScaleFeature(false
                , false
                , false
                , WeightScaleFeature.WEIGHT_SCALE_FEATURE_WEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED 
                , WeightScaleFeature.WEIGHT_SCALE_FEATURE_HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED);
        //@formatter:on

        assertFalse(result1.isWeightScaleFeatureTimeStampSupported());
        assertTrue(result1.isWeightScaleFeatureTimeStampNotSupported());
    }

    @Test
    public void test_constructor_00103() {
        //@formatter:off
        WeightScaleFeature result1 = new WeightScaleFeature(false
                , true
                , false
                , WeightScaleFeature.WEIGHT_SCALE_FEATURE_WEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED 
                , WeightScaleFeature.WEIGHT_SCALE_FEATURE_HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED);
        //@formatter:on

        assertTrue(result1.isWeightScaleFeatureMultipleUsersSupported());
        assertFalse(result1.isWeightScaleFeatureMultipleUsersNotSupported());
    }

    @Test
    public void test_constructor_00104() {
        //@formatter:off
        WeightScaleFeature result1 = new WeightScaleFeature(false
                , false
                , false
                , WeightScaleFeature.WEIGHT_SCALE_FEATURE_WEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED 
                , WeightScaleFeature.WEIGHT_SCALE_FEATURE_HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED);
        //@formatter:on

        assertFalse(result1.isWeightScaleFeatureMultipleUsersSupported());
        assertTrue(result1.isWeightScaleFeatureMultipleUsersNotSupported());
    }

    @Test
    public void test_constructor_00105() {
        //@formatter:off
        WeightScaleFeature result1 = new WeightScaleFeature(false
                , false
                , true
                , WeightScaleFeature.WEIGHT_SCALE_FEATURE_WEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED 
                , WeightScaleFeature.WEIGHT_SCALE_FEATURE_HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED);
        //@formatter:on

        assertTrue(result1.isWeightScaleFeatureBmiSupported());
        assertFalse(result1.isWeightScaleFeatureBmiNotSupported());
    }

    @Test
    public void test_constructor_00106() {
        //@formatter:off
        WeightScaleFeature result1 = new WeightScaleFeature(false
                , false
                , false
                , WeightScaleFeature.WEIGHT_SCALE_FEATURE_WEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED 
                , WeightScaleFeature.WEIGHT_SCALE_FEATURE_HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED);
        //@formatter:on

        assertFalse(result1.isWeightScaleFeatureBmiSupported());
        assertTrue(result1.isWeightScaleFeatureBmiNotSupported());
    }

    @Test
    public void test_constructor_00107() {
        //@formatter:off
        WeightScaleFeature result1 = new WeightScaleFeature(false
                , false
                , false
                , WeightScaleFeature.WEIGHT_SCALE_FEATURE_WEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED 
                , WeightScaleFeature.WEIGHT_SCALE_FEATURE_HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED);
        //@formatter:on

        assertTrue(result1.isWeightScaleFeatureWeightScaleMeasurementResolutionNotSpecified());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution1());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution2());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution3());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution4());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution5());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution6());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution7());
    }

    @Test
    public void test_constructor_00108() {
        //@formatter:off
        WeightScaleFeature result1 = new WeightScaleFeature(false
                , false
                , false
                , WeightScaleFeature.WEIGHT_SCALE_FEATURE_WEIGHT_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_5KG_OR_1LB 
                , WeightScaleFeature.WEIGHT_SCALE_FEATURE_HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED);
        //@formatter:on

        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolutionNotSpecified());
        assertTrue(result1.isWeightScaleFeatureWeightScaleMeasurementResolution1());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution2());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution3());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution4());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution5());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution6());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution7());
    }

    @Test
    public void test_constructor_00109() {
        //@formatter:off
        WeightScaleFeature result1 = new WeightScaleFeature(false
                , false
                , false
                , WeightScaleFeature.WEIGHT_SCALE_FEATURE_WEIGHT_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_2KG_OR_0_5LB 
                , WeightScaleFeature.WEIGHT_SCALE_FEATURE_HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED);
        //@formatter:on

        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolutionNotSpecified());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution1());
        assertTrue(result1.isWeightScaleFeatureWeightScaleMeasurementResolution2());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution3());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution4());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution5());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution6());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution7());
    }

    @Test
    public void test_constructor_00110() {
        //@formatter:off
        WeightScaleFeature result1 = new WeightScaleFeature(false
                , false
                , false
                , WeightScaleFeature.WEIGHT_SCALE_FEATURE_WEIGHT_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_1KG_OR_0_2LB 
                , WeightScaleFeature.WEIGHT_SCALE_FEATURE_HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED);
        //@formatter:on

        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolutionNotSpecified());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution1());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution2());
        assertTrue(result1.isWeightScaleFeatureWeightScaleMeasurementResolution3());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution4());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution5());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution6());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution7());
    }

    @Test
    public void test_constructor_00111() {
        //@formatter:off
        WeightScaleFeature result1 = new WeightScaleFeature(false
                , false
                , false
                , WeightScaleFeature.WEIGHT_SCALE_FEATURE_WEIGHT_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_05KG_OR_0_1B 
                , WeightScaleFeature.WEIGHT_SCALE_FEATURE_HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED);
        //@formatter:on

        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolutionNotSpecified());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution1());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution2());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution3());
        assertTrue(result1.isWeightScaleFeatureWeightScaleMeasurementResolution4());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution5());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution6());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution7());
    }

    @Test
    public void test_constructor_00112() {
        //@formatter:off
        WeightScaleFeature result1 = new WeightScaleFeature(false
                , false
                , false
                , WeightScaleFeature.WEIGHT_SCALE_FEATURE_WEIGHT_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_02KG_OR_0_05B 
                , WeightScaleFeature.WEIGHT_SCALE_FEATURE_HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED);
        //@formatter:on

        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolutionNotSpecified());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution1());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution2());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution3());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution4());
        assertTrue(result1.isWeightScaleFeatureWeightScaleMeasurementResolution5());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution6());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution7());
    }

    @Test
    public void test_constructor_00113() {
        //@formatter:off
        WeightScaleFeature result1 = new WeightScaleFeature(false
                , false
                , false
                , WeightScaleFeature.WEIGHT_SCALE_FEATURE_WEIGHT_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_01KG_OR_0_02B 
                , WeightScaleFeature.WEIGHT_SCALE_FEATURE_HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED);
        //@formatter:on

        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolutionNotSpecified());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution1());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution2());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution3());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution4());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution5());
        assertTrue(result1.isWeightScaleFeatureWeightScaleMeasurementResolution6());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution7());
    }

    @Test
    public void test_constructor_00114() {
        //@formatter:off
        WeightScaleFeature result1 = new WeightScaleFeature(false
                , false
                , false
                , WeightScaleFeature.WEIGHT_SCALE_FEATURE_WEIGHT_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_005KG_OR_0_01B 
                , WeightScaleFeature.WEIGHT_SCALE_FEATURE_HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED);
        //@formatter:on

        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolutionNotSpecified());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution1());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution2());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution3());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution4());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution5());
        assertFalse(result1.isWeightScaleFeatureWeightScaleMeasurementResolution6());
        assertTrue(result1.isWeightScaleFeatureWeightScaleMeasurementResolution7());
    }

    @Test
    public void test_constructor_00115() {
        //@formatter:off
        WeightScaleFeature result1 = new WeightScaleFeature(false
                , false
                , false
                , WeightScaleFeature.WEIGHT_SCALE_FEATURE_WEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED 
                , WeightScaleFeature.WEIGHT_SCALE_FEATURE_HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED);
        //@formatter:on

        assertTrue(result1.isWeightScaleFeatureHeightMeasurementResolutionNotSpecified());
        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolution1());
        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolution2());
        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolution3());
    }

    @Test
    public void test_constructor_00116() {
        //@formatter:off
        WeightScaleFeature result1 = new WeightScaleFeature(false
                , false
                , false
                , WeightScaleFeature.WEIGHT_SCALE_FEATURE_WEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED 
                , WeightScaleFeature.WEIGHT_SCALE_FEATURE_HEIGHT_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_01_METER_OR_1INCH);
        //@formatter:on

        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolutionNotSpecified());
        assertTrue(result1.isWeightScaleFeatureHeightMeasurementResolution1());
        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolution2());
        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolution3());
    }

    @Test
    public void test_constructor_00117() {
        //@formatter:off
        WeightScaleFeature result1 = new WeightScaleFeature(false
                , false
                , false
                , WeightScaleFeature.WEIGHT_SCALE_FEATURE_WEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED 
                , WeightScaleFeature.WEIGHT_SCALE_FEATURE_HEIGHT_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_005METER_OR_0_5INCH);
        //@formatter:on

        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolutionNotSpecified());
        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolution1());
        assertTrue(result1.isWeightScaleFeatureHeightMeasurementResolution2());
        assertFalse(result1.isWeightScaleFeatureHeightMeasurementResolution3());
    }

    @Test
    public void test_constructor_00118() {
        //@formatter:off
        WeightScaleFeature result1 = new WeightScaleFeature(false
                , false
                , false
                , WeightScaleFeature.WEIGHT_SCALE_FEATURE_WEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED 
                , WeightScaleFeature.WEIGHT_SCALE_FEATURE_HEIGHT_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_001METER_OR_0_1INCH);
        //@formatter:on

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
