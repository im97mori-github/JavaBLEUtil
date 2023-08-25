package org.im97mori.ble.characteristic.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

public class BloodPressureMeasurementUtilsTest extends TestBase {

    @Test
    public void test_isFlagsBloodPressureUnitsMmhg001() {
        assertTrue(BloodPressureMeasurementUtils.isFlagsBloodPressureUnitsMmhg(BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG));
        assertFalse(BloodPressureMeasurementUtils.isFlagsBloodPressureUnitsMmhg(BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_KPA));
    }

    @Test
    public void test_isFlagsBloodPressureUnitsKpa001() {
        assertFalse(BloodPressureMeasurementUtils.isFlagsBloodPressureUnitsKpa(BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_MMHG));
        assertTrue(BloodPressureMeasurementUtils.isFlagsBloodPressureUnitsKpa(BloodPressureMeasurementUtils.FLAG_BLOOD_PRESSURE_UNITS_KPA));
    }

    @Test
    public void test_isFlagsTimeStampNotPresent001() {
        assertTrue(BloodPressureMeasurementUtils.isFlagsTimeStampNotPresent(BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT));
        assertFalse(BloodPressureMeasurementUtils.isFlagsTimeStampNotPresent(BloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT));
    }

    @Test
    public void test_isFlagsTimeStampPresent001() {
        assertFalse(BloodPressureMeasurementUtils.isFlagsTimeStampPresent(BloodPressureMeasurementUtils.FLAG_TIME_STAMP_NOT_PRESENT));
        assertTrue(BloodPressureMeasurementUtils.isFlagsTimeStampPresent(BloodPressureMeasurementUtils.FLAG_TIME_STAMP_PRESENT));
    }

    @Test
    public void test_isFlagsPulseRateNotPresent001() {
        assertTrue(BloodPressureMeasurementUtils.isFlagsPulseRateNotPresent(BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT));
        assertFalse(BloodPressureMeasurementUtils.isFlagsPulseRateNotPresent(BloodPressureMeasurementUtils.FLAG_PULSE_RATE_PRESENT));
    }

    @Test
    public void test_isFlagsPulseRatePresent001() {
        assertFalse(BloodPressureMeasurementUtils.isFlagsPulseRatePresent(BloodPressureMeasurementUtils.FLAG_PULSE_RATE_NOT_PRESENT));
        assertTrue(BloodPressureMeasurementUtils.isFlagsPulseRatePresent(BloodPressureMeasurementUtils.FLAG_PULSE_RATE_PRESENT));
    }

    @Test
    public void test_isFlagsUserIdNotPresent001() {
        assertTrue(BloodPressureMeasurementUtils.isFlagsUserIdNotPresent(BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT));
        assertFalse(BloodPressureMeasurementUtils.isFlagsUserIdNotPresent(BloodPressureMeasurementUtils.FLAG_USER_ID_PRESENT));
    }

    @Test
    public void test_isFlagsUserIdPresent001() {
        assertFalse(BloodPressureMeasurementUtils.isFlagsUserIdPresent(BloodPressureMeasurementUtils.FLAG_USER_ID_NOT_PRESENT));
        assertTrue(BloodPressureMeasurementUtils.isFlagsUserIdPresent(BloodPressureMeasurementUtils.FLAG_USER_ID_PRESENT));
    }

    @Test
    public void test_isFlagsMeasurementStatusNotPresent001() {
        assertTrue(BloodPressureMeasurementUtils.isFlagsMeasurementStatusNotPresent(BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT));
        assertFalse(BloodPressureMeasurementUtils.isFlagsMeasurementStatusNotPresent(BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_PRESENT));
    }

    @Test
    public void test_isFlagsMeasurementStatusPresent001() {
        assertFalse(BloodPressureMeasurementUtils.isFlagsMeasurementStatusPresent(BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_NOT_PRESENT));
        assertTrue(BloodPressureMeasurementUtils.isFlagsMeasurementStatusPresent(BloodPressureMeasurementUtils.FLAG_MEASUREMENT_STATUS_PRESENT));
    }

    @Test
    public void test_isMeasurementStatusBodyMoveDetectionNoBodyMovement001() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = BloodPressureMeasurementUtils.MEASUREMENT_STATUS_BODY_MOVEMENT_DETECTION_NO_BODY_MOVEMENT;
        data[ 1] = BloodPressureMeasurementUtils.MEASUREMENT_STATUS_BODY_MOVEMENT_DETECTION_NO_BODY_MOVEMENT >> 8;
        //@formatter:on

        assertTrue(BloodPressureMeasurementUtils.isMeasurementStatusBodyMoveDetectionNoBodyMovement(data));
        assertFalse(BloodPressureMeasurementUtils.isMeasurementStatusBodyMoveDetectionBodyMovementDuringMeasurement(data));

    }

    @Test
    public void test_isMeasurementStatusBodyMoveDetectionBodyMovementDuringMeasurement001() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = BloodPressureMeasurementUtils.MEASUREMENT_STATUS_BODY_MOVEMENT_DETECTION_BODY_MOVEMENT_DURING_MEASUREMENT;
        data[ 1] = BloodPressureMeasurementUtils.MEASUREMENT_STATUS_BODY_MOVEMENT_DETECTION_BODY_MOVEMENT_DURING_MEASUREMENT >> 8;
        //@formatter:on

        assertFalse(BloodPressureMeasurementUtils.isMeasurementStatusBodyMoveDetectionNoBodyMovement(data));
        assertTrue(BloodPressureMeasurementUtils.isMeasurementStatusBodyMoveDetectionBodyMovementDuringMeasurement(data));
    }

    @Test
    public void test_isMeasurementStatusCuffFitDetectionCuffFitsProperly001() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = BloodPressureMeasurementUtils.MEASUREMENT_STATUS_CUFF_FIT_DETECTION_CUFF_FITS_PROPERLY;
        data[ 1] = BloodPressureMeasurementUtils.MEASUREMENT_STATUS_CUFF_FIT_DETECTION_CUFF_FITS_PROPERLY >> 8;
        //@formatter:on

        assertTrue(BloodPressureMeasurementUtils.isMeasurementStatusCuffFitDetectionCuffFitsProperly(data));
        assertFalse(BloodPressureMeasurementUtils.isMeasurementStatusCuffFitDetectionCuffTooLoose(data));

    }

    @Test
    public void test_isMeasurementStatusCuffFitDetectionCuffTooLoose001() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = BloodPressureMeasurementUtils.MEASUREMENT_STATUS_CUFF_FIT_DETECTION_CUFF_TOO_LOOSE;
        data[ 1] = BloodPressureMeasurementUtils.MEASUREMENT_STATUS_CUFF_FIT_DETECTION_CUFF_TOO_LOOSE >> 8;
        //@formatter:on

        assertFalse(BloodPressureMeasurementUtils.isMeasurementStatusCuffFitDetectionCuffFitsProperly(data));
        assertTrue(BloodPressureMeasurementUtils.isMeasurementStatusCuffFitDetectionCuffTooLoose(data));
    }

    @Test
    public void test_isMeasurementStatusIrregularPulseDetectionNoIrregularPulseDetected001() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = BloodPressureMeasurementUtils.MEASUREMENT_STATUS_IRREGULAR_PULSE_DETECTION_NO_IRREGULAR_PULSE_DETECTED;
        data[ 1] = BloodPressureMeasurementUtils.MEASUREMENT_STATUS_IRREGULAR_PULSE_DETECTION_NO_IRREGULAR_PULSE_DETECTED >> 8;
        //@formatter:on

        assertTrue(BloodPressureMeasurementUtils.isMeasurementStatusIrregularPulseDetectionNoIrregularPulseDetected(data));
        assertFalse(BloodPressureMeasurementUtils.isMeasurementStatusIrregularPulseDetectionIrregularPulseDetected(data));

    }

    @Test
    public void test_isMeasurementStatusIrregularPulseDetectionIrregularPulseDetected001() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = BloodPressureMeasurementUtils.MEASUREMENT_STATUS_IRREGULAR_PULSE_DETECTION_IRREGULAR_PULSE_DETECTED;
        data[ 1] = BloodPressureMeasurementUtils.MEASUREMENT_STATUS_IRREGULAR_PULSE_DETECTION_IRREGULAR_PULSE_DETECTED >> 8;
        //@formatter:on

        assertFalse(BloodPressureMeasurementUtils.isMeasurementStatusIrregularPulseDetectionNoIrregularPulseDetected(data));
        assertTrue(BloodPressureMeasurementUtils.isMeasurementStatusIrregularPulseDetectionIrregularPulseDetected(data));
    }

    @Test
    public void test_isMeasurementStatusPulseRateRangeDetectionPulseRateIsWithinTheRange001() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = BloodPressureMeasurementUtils.MEASUREMENT_STATUS_PULSE_RATE_RANGE_DETECTION_PULSE_RATE_IS_WITHIN_THE_RANGE;
        data[ 1] = BloodPressureMeasurementUtils.MEASUREMENT_STATUS_PULSE_RATE_RANGE_DETECTION_PULSE_RATE_IS_WITHIN_THE_RANGE >> 8;
        //@formatter:on

        assertTrue(BloodPressureMeasurementUtils.isMeasurementStatusPulseRateRangeDetectionPulseRateIsWithinTheRange(data));
        assertFalse(BloodPressureMeasurementUtils.isMeasurementStatusPulseRateRangeDetectionPulseRateExceedssUpperLimit(data));
        assertFalse(BloodPressureMeasurementUtils.isMeasurementStatusPulseRateRangeDetectionPulseRateIsLessThanLowerLimit(data));
    }

    @Test
    public void test_isMeasurementStatusPulseRateRangeDetectionPulseRateExceedssUpperLimit001() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = BloodPressureMeasurementUtils.MEASUREMENT_STATUS_PULSE_RATE_RANGE_DETECTION_PULSE_RATE_EXCEEDS_UPPER_LIMIT;
        data[ 1] = BloodPressureMeasurementUtils.MEASUREMENT_STATUS_PULSE_RATE_RANGE_DETECTION_PULSE_RATE_EXCEEDS_UPPER_LIMIT >> 8;
        //@formatter:on

        assertFalse(BloodPressureMeasurementUtils.isMeasurementStatusPulseRateRangeDetectionPulseRateIsWithinTheRange(data));
        assertTrue(BloodPressureMeasurementUtils.isMeasurementStatusPulseRateRangeDetectionPulseRateExceedssUpperLimit(data));
        assertFalse(BloodPressureMeasurementUtils.isMeasurementStatusPulseRateRangeDetectionPulseRateIsLessThanLowerLimit(data));
    }

    @Test
    public void test_isMeasurementStatusPulseRateRangeDetectionPulseRateIsLessThanLowerLimit001() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = BloodPressureMeasurementUtils.MEASUREMENT_STATUS_PULSE_RATE_RANGE_DETECTION_PULSE_RATE_IS_LESS_THAN_LOWER_LIMIT;
        data[ 1] = BloodPressureMeasurementUtils.MEASUREMENT_STATUS_PULSE_RATE_RANGE_DETECTION_PULSE_RATE_IS_LESS_THAN_LOWER_LIMIT >> 8;
        //@formatter:on

        assertFalse(BloodPressureMeasurementUtils.isMeasurementStatusPulseRateRangeDetectionPulseRateIsWithinTheRange(data));
        assertFalse(BloodPressureMeasurementUtils.isMeasurementStatusPulseRateRangeDetectionPulseRateExceedssUpperLimit(data));
        assertTrue(BloodPressureMeasurementUtils.isMeasurementStatusPulseRateRangeDetectionPulseRateIsLessThanLowerLimit(data));
    }

    @Test
    public void test_isMeasurementStatusMeasurementPositionDetectionProperMeasurementPosition001() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = BloodPressureMeasurementUtils.MEASUREMENT_STATUS_MEASUREMENT_POSITION_DETECTION_PROPER_MEASUREMENT_POSITION;
        data[ 1] = BloodPressureMeasurementUtils.MEASUREMENT_STATUS_MEASUREMENT_POSITION_DETECTION_PROPER_MEASUREMENT_POSITION >> 8;
        //@formatter:on

        assertTrue(BloodPressureMeasurementUtils.isMeasurementStatusMeasurementPositionDetectionProperMeasurementPosition(data));
        assertFalse(BloodPressureMeasurementUtils.isMeasurementStatusMeasurementPositionDetectionImproperMeasurementPosition(data));
    }

    @Test
    public void test_isMeasurementStatusMeasurementPositionDetectionImproperMeasurementPosition001() {
        //@formatter:off
        byte[] data = new byte[2];
        data[ 0] = BloodPressureMeasurementUtils.MEASUREMENT_STATUS_MEASUREMENT_POSITION_DETECTION_IMPROPER_MEASUREMENT_POSITION;
        data[ 1] = BloodPressureMeasurementUtils.MEASUREMENT_STATUS_MEASUREMENT_POSITION_DETECTION_IMPROPER_MEASUREMENT_POSITION >> 8;
        //@formatter:on

        assertFalse(BloodPressureMeasurementUtils.isMeasurementStatusMeasurementPositionDetectionProperMeasurementPosition(data));
        assertTrue(BloodPressureMeasurementUtils.isMeasurementStatusMeasurementPositionDetectionImproperMeasurementPosition(data));
    }

    @Test
    public void test_getPascal001() {
    	double kpa = 1;
        assertEquals(kpa * BloodPressureMeasurementUtils.PASCAL_RESOLUTION, BloodPressureMeasurementUtils.getPascal(new IEEE_11073_20601_SFLOAT(kpa)), 0);
    }
}
