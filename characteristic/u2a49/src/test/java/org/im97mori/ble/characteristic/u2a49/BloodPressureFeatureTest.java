package org.im97mori.ble.characteristic.u2a49;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BloodPressureFeatureTest {

    @Test
    public void test_constructor001() {
        int flags = BloodPressureFeature.BODY_MOVEMENT_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.CUFF_FIT_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.IRREGULAR_PULSE_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.PULSE_RATE_RANGE_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.MEASUREMENT_POSITION_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.MULTIPLE_BOND_SUPPORT_FALSE;
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        //@formatter:on

        BloodPressureFeature result1 = new BloodPressureFeature(data);
        assertArrayEquals(data, result1.getBloodPressureFeature());
        assertFalse(result1.isBodyMovementDetectionSupported());
        assertTrue(result1.isBodyMovementDetectionNotSupported());
        assertFalse(result1.isCuffFitDetectionSupported());
        assertTrue(result1.isCuffFitDetectionNotSupported());
        assertFalse(result1.isIrregularPulseDetectionSupported());
        assertTrue(result1.isIrregularPulsetDetectionNotSupported());
        assertFalse(result1.isPulseRateRangeDetectionSupported());
        assertTrue(result1.isPulseRateRangeDetectionNotSupported());
        assertFalse(result1.isMeasurementPositionDetectionSupported());
        assertTrue(result1.isMeasurementPositionDetectionNotSupported());
        assertFalse(result1.isMultipleBondDetectionSupported());
        assertTrue(result1.isMultipleBondDetectionNotSupported());
    }

    @Test
    public void test_constructor002() {
        int flags = BloodPressureFeature.BODY_MOVEMENT_DETECTION_SUPPORT_TRUE
                | BloodPressureFeature.CUFF_FIT_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.IRREGULAR_PULSE_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.PULSE_RATE_RANGE_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.MEASUREMENT_POSITION_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.MULTIPLE_BOND_SUPPORT_FALSE;
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        //@formatter:on

        BloodPressureFeature result1 = new BloodPressureFeature(data);
        assertArrayEquals(data, result1.getBloodPressureFeature());
        assertTrue(result1.isBodyMovementDetectionSupported());
        assertFalse(result1.isBodyMovementDetectionNotSupported());
        assertFalse(result1.isCuffFitDetectionSupported());
        assertTrue(result1.isCuffFitDetectionNotSupported());
        assertFalse(result1.isIrregularPulseDetectionSupported());
        assertTrue(result1.isIrregularPulsetDetectionNotSupported());
        assertFalse(result1.isPulseRateRangeDetectionSupported());
        assertTrue(result1.isPulseRateRangeDetectionNotSupported());
        assertFalse(result1.isMeasurementPositionDetectionSupported());
        assertTrue(result1.isMeasurementPositionDetectionNotSupported());
        assertFalse(result1.isMultipleBondDetectionSupported());
        assertTrue(result1.isMultipleBondDetectionNotSupported());
    }

    @Test
    public void test_constructor003() {
        int flags = BloodPressureFeature.BODY_MOVEMENT_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.CUFF_FIT_DETECTION_SUPPORT_TRUE
                | BloodPressureFeature.IRREGULAR_PULSE_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.PULSE_RATE_RANGE_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.MEASUREMENT_POSITION_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.MULTIPLE_BOND_SUPPORT_FALSE;
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        //@formatter:on

        BloodPressureFeature result1 = new BloodPressureFeature(data);
        assertArrayEquals(data, result1.getBloodPressureFeature());
        assertFalse(result1.isBodyMovementDetectionSupported());
        assertTrue(result1.isBodyMovementDetectionNotSupported());
        assertTrue(result1.isCuffFitDetectionSupported());
        assertFalse(result1.isCuffFitDetectionNotSupported());
        assertFalse(result1.isIrregularPulseDetectionSupported());
        assertTrue(result1.isIrregularPulsetDetectionNotSupported());
        assertFalse(result1.isPulseRateRangeDetectionSupported());
        assertTrue(result1.isPulseRateRangeDetectionNotSupported());
        assertFalse(result1.isMeasurementPositionDetectionSupported());
        assertTrue(result1.isMeasurementPositionDetectionNotSupported());
        assertFalse(result1.isMultipleBondDetectionSupported());
        assertTrue(result1.isMultipleBondDetectionNotSupported());
    }

    @Test
    public void test_constructor004() {
        int flags = BloodPressureFeature.BODY_MOVEMENT_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.CUFF_FIT_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.IRREGULAR_PULSE_DETECTION_SUPPORT_TRUE
                | BloodPressureFeature.PULSE_RATE_RANGE_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.MEASUREMENT_POSITION_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.MULTIPLE_BOND_SUPPORT_FALSE;
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        //@formatter:on

        BloodPressureFeature result1 = new BloodPressureFeature(data);
        assertArrayEquals(data, result1.getBloodPressureFeature());
        assertFalse(result1.isBodyMovementDetectionSupported());
        assertTrue(result1.isBodyMovementDetectionNotSupported());
        assertFalse(result1.isCuffFitDetectionSupported());
        assertTrue(result1.isCuffFitDetectionNotSupported());
        assertTrue(result1.isIrregularPulseDetectionSupported());
        assertFalse(result1.isIrregularPulsetDetectionNotSupported());
        assertFalse(result1.isPulseRateRangeDetectionSupported());
        assertTrue(result1.isPulseRateRangeDetectionNotSupported());
        assertFalse(result1.isMeasurementPositionDetectionSupported());
        assertTrue(result1.isMeasurementPositionDetectionNotSupported());
        assertFalse(result1.isMultipleBondDetectionSupported());
        assertTrue(result1.isMultipleBondDetectionNotSupported());
    }

    @Test
    public void test_constructor005() {
        int flags = BloodPressureFeature.BODY_MOVEMENT_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.CUFF_FIT_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.IRREGULAR_PULSE_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.PULSE_RATE_RANGE_DETECTION_SUPPORT_TRUE
                | BloodPressureFeature.MEASUREMENT_POSITION_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.MULTIPLE_BOND_SUPPORT_FALSE;
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        //@formatter:on

        BloodPressureFeature result1 = new BloodPressureFeature(data);
        assertArrayEquals(data, result1.getBloodPressureFeature());
        assertFalse(result1.isBodyMovementDetectionSupported());
        assertTrue(result1.isBodyMovementDetectionNotSupported());
        assertFalse(result1.isCuffFitDetectionSupported());
        assertTrue(result1.isCuffFitDetectionNotSupported());
        assertFalse(result1.isIrregularPulseDetectionSupported());
        assertTrue(result1.isIrregularPulsetDetectionNotSupported());
        assertTrue(result1.isPulseRateRangeDetectionSupported());
        assertFalse(result1.isPulseRateRangeDetectionNotSupported());
        assertFalse(result1.isMeasurementPositionDetectionSupported());
        assertTrue(result1.isMeasurementPositionDetectionNotSupported());
        assertFalse(result1.isMultipleBondDetectionSupported());
        assertTrue(result1.isMultipleBondDetectionNotSupported());
    }

    @Test
    public void test_constructor006() {
        int flags = BloodPressureFeature.BODY_MOVEMENT_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.CUFF_FIT_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.IRREGULAR_PULSE_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.PULSE_RATE_RANGE_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.MEASUREMENT_POSITION_DETECTION_SUPPORT_TRUE
                | BloodPressureFeature.MULTIPLE_BOND_SUPPORT_FALSE;
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        //@formatter:on

        BloodPressureFeature result1 = new BloodPressureFeature(data);
        assertArrayEquals(data, result1.getBloodPressureFeature());
        assertFalse(result1.isBodyMovementDetectionSupported());
        assertTrue(result1.isBodyMovementDetectionNotSupported());
        assertFalse(result1.isCuffFitDetectionSupported());
        assertTrue(result1.isCuffFitDetectionNotSupported());
        assertFalse(result1.isIrregularPulseDetectionSupported());
        assertTrue(result1.isIrregularPulsetDetectionNotSupported());
        assertFalse(result1.isPulseRateRangeDetectionSupported());
        assertTrue(result1.isPulseRateRangeDetectionNotSupported());
        assertTrue(result1.isMeasurementPositionDetectionSupported());
        assertFalse(result1.isMeasurementPositionDetectionNotSupported());
        assertFalse(result1.isMultipleBondDetectionSupported());
        assertTrue(result1.isMultipleBondDetectionNotSupported());
    }

    @Test
    public void test_constructor007() {
        int flags = BloodPressureFeature.BODY_MOVEMENT_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.CUFF_FIT_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.IRREGULAR_PULSE_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.PULSE_RATE_RANGE_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.MEASUREMENT_POSITION_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.MULTIPLE_BOND_SUPPORT_TRUE;
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        //@formatter:on

        BloodPressureFeature result1 = new BloodPressureFeature(data);
        assertArrayEquals(data, result1.getBloodPressureFeature());
        assertFalse(result1.isBodyMovementDetectionSupported());
        assertTrue(result1.isBodyMovementDetectionNotSupported());
        assertFalse(result1.isCuffFitDetectionSupported());
        assertTrue(result1.isCuffFitDetectionNotSupported());
        assertFalse(result1.isIrregularPulseDetectionSupported());
        assertTrue(result1.isIrregularPulsetDetectionNotSupported());
        assertFalse(result1.isPulseRateRangeDetectionSupported());
        assertTrue(result1.isPulseRateRangeDetectionNotSupported());
        assertFalse(result1.isMeasurementPositionDetectionSupported());
        assertTrue(result1.isMeasurementPositionDetectionNotSupported());
        assertTrue(result1.isMultipleBondDetectionSupported());
        assertFalse(result1.isMultipleBondDetectionNotSupported());
    }

    @Test
    public void test_constructor101() {
        int flags = BloodPressureFeature.BODY_MOVEMENT_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.CUFF_FIT_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.IRREGULAR_PULSE_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.PULSE_RATE_RANGE_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.MEASUREMENT_POSITION_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.MULTIPLE_BOND_SUPPORT_FALSE;
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        //@formatter:on

        BloodPressureFeature result1 = new BloodPressureFeature(false, false, false, false, false, false);
        assertArrayEquals(data, result1.getBloodPressureFeature());
        assertFalse(result1.isBodyMovementDetectionSupported());
        assertTrue(result1.isBodyMovementDetectionNotSupported());
        assertFalse(result1.isCuffFitDetectionSupported());
        assertTrue(result1.isCuffFitDetectionNotSupported());
        assertFalse(result1.isIrregularPulseDetectionSupported());
        assertTrue(result1.isIrregularPulsetDetectionNotSupported());
        assertFalse(result1.isPulseRateRangeDetectionSupported());
        assertTrue(result1.isPulseRateRangeDetectionNotSupported());
        assertFalse(result1.isMeasurementPositionDetectionSupported());
        assertTrue(result1.isMeasurementPositionDetectionNotSupported());
        assertFalse(result1.isMultipleBondDetectionSupported());
        assertTrue(result1.isMultipleBondDetectionNotSupported());
    }

    @Test
    public void test_constructor102() {
        int flags = BloodPressureFeature.BODY_MOVEMENT_DETECTION_SUPPORT_TRUE
                | BloodPressureFeature.CUFF_FIT_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.IRREGULAR_PULSE_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.PULSE_RATE_RANGE_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.MEASUREMENT_POSITION_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.MULTIPLE_BOND_SUPPORT_FALSE;
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        //@formatter:on

        BloodPressureFeature result1 = new BloodPressureFeature(true, false, false, false, false, false);
        assertArrayEquals(data, result1.getBloodPressureFeature());
        assertTrue(result1.isBodyMovementDetectionSupported());
        assertFalse(result1.isBodyMovementDetectionNotSupported());
        assertFalse(result1.isCuffFitDetectionSupported());
        assertTrue(result1.isCuffFitDetectionNotSupported());
        assertFalse(result1.isIrregularPulseDetectionSupported());
        assertTrue(result1.isIrregularPulsetDetectionNotSupported());
        assertFalse(result1.isPulseRateRangeDetectionSupported());
        assertTrue(result1.isPulseRateRangeDetectionNotSupported());
        assertFalse(result1.isMeasurementPositionDetectionSupported());
        assertTrue(result1.isMeasurementPositionDetectionNotSupported());
        assertFalse(result1.isMultipleBondDetectionSupported());
        assertTrue(result1.isMultipleBondDetectionNotSupported());
    }

    @Test
    public void test_constructor103() {
        int flags = BloodPressureFeature.BODY_MOVEMENT_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.CUFF_FIT_DETECTION_SUPPORT_TRUE
                | BloodPressureFeature.IRREGULAR_PULSE_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.PULSE_RATE_RANGE_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.MEASUREMENT_POSITION_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.MULTIPLE_BOND_SUPPORT_FALSE;
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        //@formatter:on

        BloodPressureFeature result1 = new BloodPressureFeature(false, true, false, false, false, false);
        assertArrayEquals(data, result1.getBloodPressureFeature());
        assertFalse(result1.isBodyMovementDetectionSupported());
        assertTrue(result1.isBodyMovementDetectionNotSupported());
        assertTrue(result1.isCuffFitDetectionSupported());
        assertFalse(result1.isCuffFitDetectionNotSupported());
        assertFalse(result1.isIrregularPulseDetectionSupported());
        assertTrue(result1.isIrregularPulsetDetectionNotSupported());
        assertFalse(result1.isPulseRateRangeDetectionSupported());
        assertTrue(result1.isPulseRateRangeDetectionNotSupported());
        assertFalse(result1.isMeasurementPositionDetectionSupported());
        assertTrue(result1.isMeasurementPositionDetectionNotSupported());
        assertFalse(result1.isMultipleBondDetectionSupported());
        assertTrue(result1.isMultipleBondDetectionNotSupported());
    }

    @Test
    public void test_constructor104() {
        int flags = BloodPressureFeature.BODY_MOVEMENT_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.CUFF_FIT_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.IRREGULAR_PULSE_DETECTION_SUPPORT_TRUE
                | BloodPressureFeature.PULSE_RATE_RANGE_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.MEASUREMENT_POSITION_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.MULTIPLE_BOND_SUPPORT_FALSE;
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        //@formatter:on

        BloodPressureFeature result1 = new BloodPressureFeature(false, false, true, false, false, false);
        assertArrayEquals(data, result1.getBloodPressureFeature());
        assertFalse(result1.isBodyMovementDetectionSupported());
        assertTrue(result1.isBodyMovementDetectionNotSupported());
        assertFalse(result1.isCuffFitDetectionSupported());
        assertTrue(result1.isCuffFitDetectionNotSupported());
        assertTrue(result1.isIrregularPulseDetectionSupported());
        assertFalse(result1.isIrregularPulsetDetectionNotSupported());
        assertFalse(result1.isPulseRateRangeDetectionSupported());
        assertTrue(result1.isPulseRateRangeDetectionNotSupported());
        assertFalse(result1.isMeasurementPositionDetectionSupported());
        assertTrue(result1.isMeasurementPositionDetectionNotSupported());
        assertFalse(result1.isMultipleBondDetectionSupported());
        assertTrue(result1.isMultipleBondDetectionNotSupported());
    }

    @Test
    public void test_constructor105() {
        int flags = BloodPressureFeature.BODY_MOVEMENT_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.CUFF_FIT_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.IRREGULAR_PULSE_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.PULSE_RATE_RANGE_DETECTION_SUPPORT_TRUE
                | BloodPressureFeature.MEASUREMENT_POSITION_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.MULTIPLE_BOND_SUPPORT_FALSE;
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        //@formatter:on

        BloodPressureFeature result1 = new BloodPressureFeature(false, false, false, true, false, false);
        assertArrayEquals(data, result1.getBloodPressureFeature());
        assertFalse(result1.isBodyMovementDetectionSupported());
        assertTrue(result1.isBodyMovementDetectionNotSupported());
        assertFalse(result1.isCuffFitDetectionSupported());
        assertTrue(result1.isCuffFitDetectionNotSupported());
        assertFalse(result1.isIrregularPulseDetectionSupported());
        assertTrue(result1.isIrregularPulsetDetectionNotSupported());
        assertTrue(result1.isPulseRateRangeDetectionSupported());
        assertFalse(result1.isPulseRateRangeDetectionNotSupported());
        assertFalse(result1.isMeasurementPositionDetectionSupported());
        assertTrue(result1.isMeasurementPositionDetectionNotSupported());
        assertFalse(result1.isMultipleBondDetectionSupported());
        assertTrue(result1.isMultipleBondDetectionNotSupported());
    }

    @Test
    public void test_constructor106() {
        int flags = BloodPressureFeature.BODY_MOVEMENT_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.CUFF_FIT_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.IRREGULAR_PULSE_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.PULSE_RATE_RANGE_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.MEASUREMENT_POSITION_DETECTION_SUPPORT_TRUE
                | BloodPressureFeature.MULTIPLE_BOND_SUPPORT_FALSE;
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        //@formatter:on

        BloodPressureFeature result1 = new BloodPressureFeature(false, false, false, false, true, false);
        assertArrayEquals(data, result1.getBloodPressureFeature());
        assertFalse(result1.isBodyMovementDetectionSupported());
        assertTrue(result1.isBodyMovementDetectionNotSupported());
        assertFalse(result1.isCuffFitDetectionSupported());
        assertTrue(result1.isCuffFitDetectionNotSupported());
        assertFalse(result1.isIrregularPulseDetectionSupported());
        assertTrue(result1.isIrregularPulsetDetectionNotSupported());
        assertFalse(result1.isPulseRateRangeDetectionSupported());
        assertTrue(result1.isPulseRateRangeDetectionNotSupported());
        assertTrue(result1.isMeasurementPositionDetectionSupported());
        assertFalse(result1.isMeasurementPositionDetectionNotSupported());
        assertFalse(result1.isMultipleBondDetectionSupported());
        assertTrue(result1.isMultipleBondDetectionNotSupported());
    }

    @Test
    public void test_constructor107() {
        int flags = BloodPressureFeature.BODY_MOVEMENT_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.CUFF_FIT_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.IRREGULAR_PULSE_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.PULSE_RATE_RANGE_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.MEASUREMENT_POSITION_DETECTION_SUPPORT_FALSE
                | BloodPressureFeature.MULTIPLE_BOND_SUPPORT_TRUE;
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = (byte) flags;
        data[ 1] = (byte) (flags >> 8);
        //@formatter:on

        BloodPressureFeature result1 = new BloodPressureFeature(false, false, false, false, false, true);
        assertArrayEquals(data, result1.getBloodPressureFeature());
        assertFalse(result1.isBodyMovementDetectionSupported());
        assertTrue(result1.isBodyMovementDetectionNotSupported());
        assertFalse(result1.isCuffFitDetectionSupported());
        assertTrue(result1.isCuffFitDetectionNotSupported());
        assertFalse(result1.isIrregularPulseDetectionSupported());
        assertTrue(result1.isIrregularPulsetDetectionNotSupported());
        assertFalse(result1.isPulseRateRangeDetectionSupported());
        assertTrue(result1.isPulseRateRangeDetectionNotSupported());
        assertFalse(result1.isMeasurementPositionDetectionSupported());
        assertTrue(result1.isMeasurementPositionDetectionNotSupported());
        assertTrue(result1.isMultipleBondDetectionSupported());
        assertFalse(result1.isMultipleBondDetectionNotSupported());
    }

    @Test
    public void test_parcelable002() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        //@formatter:on

        BloodPressureFeature result1 = new BloodPressureFeature(data);
        assertArrayEquals(data, result1.getBytes());
    }

}
