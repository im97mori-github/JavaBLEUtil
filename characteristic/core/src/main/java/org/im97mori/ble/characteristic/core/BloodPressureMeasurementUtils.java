package org.im97mori.ble.characteristic.core;

import org.im97mori.ble.BLEUtils;

/**
 * Utility for org.bluetooth.service.blood_pressure(0x1810) service
 */
public class BloodPressureMeasurementUtils {

    /**
     * @see #FLAG_BLOOD_PRESSURE_UNITS_MMHG
     * @see #FLAG_BLOOD_PRESSURE_UNITS_KPA
     */
    public static final int FLAG_BLOOD_PRESSURE_UNITS_MASK = 0b00000001;

    /**
     * 0: Blood pressure for Systolic, Diastolic and MAP in units of mmHg
     */
    public static final int FLAG_BLOOD_PRESSURE_UNITS_MMHG = 0b00000000;

    /**
     * 1: Blood pressure for Systolic, Diastolic and MAP in units of kPa
     */
    public static final int FLAG_BLOOD_PRESSURE_UNITS_KPA = 0b00000001;

    /**
     * @see #FLAG_TIME_STAMP_NOT_PRESENT
     * @see #FLAG_TIME_STAMP_PRESENT
     */
    public static final int FLAG_TIME_STAMP_MASK = 0b00000010;

    /**
     * 0: Time Stamp not present
     */
    public static final int FLAG_TIME_STAMP_NOT_PRESENT = 0b00000000;

    /**
     * 1: Time Stamp present
     */
    public static final int FLAG_TIME_STAMP_PRESENT = 0b00000010;

    /**
     * @see #FLAG_PULSE_RATE_NOT_PRESENT
     * @see #FLAG_PULSE_RATE_PRESENT
     */
    public static final int FLAG_PULSE_RATE_MASK = 0b00000100;

    /**
     * 0: Pulse Rate not present
     */
    public static final int FLAG_PULSE_RATE_NOT_PRESENT = 0b00000000;

    /**
     * 1: Pulse Rate present
     */
    public static final int FLAG_PULSE_RATE_PRESENT = 0b00000100;

    /**
     * @see #FLAG_USER_ID_NOT_PRESENT
     * @see #FLAG_USER_ID_PRESENT
     */
    public static final int FLAG_USER_ID_MASK = 0b00001000;

    /**
     * 0: User ID not present
     */
    public static final int FLAG_USER_ID_NOT_PRESENT = 0b00000000;

    /**
     * 1: User ID present
     */
    public static final int FLAG_USER_ID_PRESENT = 0b00001000;

    /**
     * @see #FLAG_MEASUREMENT_STATUS_NOT_PRESENT
     * @see #FLAG_MEASUREMENT_STATUS_PRESENT
     */
    public static final int FLAG_MEASUREMENT_STATUS_MASK = 0b00010000;

    /**
     * 0: Measurement Status not present
     */
    public static final int FLAG_MEASUREMENT_STATUS_NOT_PRESENT = 0b00000000;

    /**
     * 1: Measurement Status present
     */
    public static final int FLAG_MEASUREMENT_STATUS_PRESENT = 0b00010000;

    /**
     * @see #MEASUREMENT_STATUS_BODY_MOVEMENT_DETECTION_NO_BODY_MOVEMENT
     * @see #MEASUREMENT_STATUS_BODY_MOVEMENT_DETECTION_BODY_MOVEMENT_DURING_MEASUREMENT
     */
    public static final int MEASUREMENT_STATUS_BODY_MOVEMENT_DETECTION_MASK = 0b00000001;

    /**
     * 0: No body movement
     */
    public static final int MEASUREMENT_STATUS_BODY_MOVEMENT_DETECTION_NO_BODY_MOVEMENT = 0b00000000;

    /**
     * 1: Body movement during measurement
     */
    public static final int MEASUREMENT_STATUS_BODY_MOVEMENT_DETECTION_BODY_MOVEMENT_DURING_MEASUREMENT = 0b00000001;

    /**
     * @see #MEASUREMENT_STATUS_CUFF_FIT_DETECTION_CUFF_FITS_PROPERLY
     * @see #MEASUREMENT_STATUS_CUFF_FIT_DETECTION_CUFF_TOO_LOOSE
     */
    public static final int MEASUREMENT_STATUS_CUFF_FIT_DETECTION_MASK = 0b00000010;

    /**
     * 0: Cuff fits properly
     */
    public static final int MEASUREMENT_STATUS_CUFF_FIT_DETECTION_CUFF_FITS_PROPERLY = 0b00000000;

    /**
     * 1: Cuff too loose
     */
    public static final int MEASUREMENT_STATUS_CUFF_FIT_DETECTION_CUFF_TOO_LOOSE = 0b00000010;

    /**
     * @see #MEASUREMENT_STATUS_IRREGULAR_PULSE_DETECTION_NO_IRREGULAR_PULSE_DETECTED
     * @see #MEASUREMENT_STATUS_IRREGULAR_PULSE_DETECTION_IRREGULAR_PULSE_DETECTED
     */
    public static final int MEASUREMENT_STATUS_IRREGULAR_PULSE_DETECTION_MASK = 0b00000100;

    /**
     * 0: No irregular pulse detected
     */
    public static final int MEASUREMENT_STATUS_IRREGULAR_PULSE_DETECTION_NO_IRREGULAR_PULSE_DETECTED = 0b00000000;

    /**
     * 1: Irregular pulse detected
     */
    public static final int MEASUREMENT_STATUS_IRREGULAR_PULSE_DETECTION_IRREGULAR_PULSE_DETECTED = 0b00000100;

    /**
     * @see #MEASUREMENT_STATUS_PULSE_RATE_RANGE_DETECTION_PULSE_RATE_IS_WITHIN_THE_RANGE
     * @see #MEASUREMENT_STATUS_PULSE_RATE_RANGE_DETECTION_PULSE_RATE_EXCEEDS_UPPER_LIMIT
     * @see #MEASUREMENT_STATUS_PULSE_RATE_RANGE_DETECTION_PULSE_RATE_IS_LESS_THAN_LOWER_LIMIT
     */
    public static final int MEASUREMENT_STATUS_PULSE_RATE_RANGE_DETECTION_MASK = 0b00011000;

    /**
     * 0: Pulse rate is within the range
     */
    public static final int MEASUREMENT_STATUS_PULSE_RATE_RANGE_DETECTION_PULSE_RATE_IS_WITHIN_THE_RANGE = 0b00000000;

    /**
     * 1: Pulse rate exceeds upper limit
     */
    public static final int MEASUREMENT_STATUS_PULSE_RATE_RANGE_DETECTION_PULSE_RATE_EXCEEDS_UPPER_LIMIT = 0b00001000;

    /**
     * 2: Pulse rate is less than lower limit
     */
    public static final int MEASUREMENT_STATUS_PULSE_RATE_RANGE_DETECTION_PULSE_RATE_IS_LESS_THAN_LOWER_LIMIT = 0b00010000;

    /**
     * @see #MEASUREMENT_STATUS_MEASUREMENT_POSITION_DETECTION_PROPER_MEASUREMENT_POSITION
     * @see #MEASUREMENT_STATUS_MEASUREMENT_POSITION_DETECTION_IMPROPER_MEASUREMENT_POSITION
     */
    public static final int MEASUREMENT_STATUS_MEASUREMENT_POSITION_DETECTION_MASK = 0b00100000;

    /**
     * 0: Proper measurement position
     */
    public static final int MEASUREMENT_STATUS_MEASUREMENT_POSITION_DETECTION_PROPER_MEASUREMENT_POSITION = 0b00000000;

    /**
     * 1: Improper measurement position
     */
    public static final int MEASUREMENT_STATUS_MEASUREMENT_POSITION_DETECTION_IMPROPER_MEASUREMENT_POSITION = 0b00100000;

    /**
     * @param flags Flags
     * @return {@code true}:Blood pressure for Systolic, Diastolic and MAP in units of mmHg, {@code false}:Blood pressure for Systolic, Diastolic and MAP in units of kPa
     */
    public static boolean isFlagsBloodPressureUnitsMmhg(int flags) {
        return isFlagsMatched(FLAG_BLOOD_PRESSURE_UNITS_MASK, FLAG_BLOOD_PRESSURE_UNITS_MMHG, flags);
    }

    /**
     * @param flags Flags
     * @return {@code true}:Blood pressure for Systolic, Diastolic and MAP in units of kPa, {@code false}:Blood pressure for Systolic, Diastolic and MAP in units of mmHg
     */
    public static boolean isFlagsBloodPressureUnitsKpa(int flags) {
        return isFlagsMatched(FLAG_BLOOD_PRESSURE_UNITS_MASK, FLAG_BLOOD_PRESSURE_UNITS_KPA, flags);
    }

    /**
     * @param flags Flags
     * @return {@code true}:Time Stamp not present, {@code false}:Time Stamp present
     */
    public static boolean isFlagsTimeStampNotPresent(int flags) {
        return isFlagsMatched(FLAG_TIME_STAMP_MASK, FLAG_TIME_STAMP_NOT_PRESENT, flags);
    }

    /**
     * @param flags Flags
     * @return {@code true}:Time Stamp present, {@code false}:Time Stamp not present
     */
    public static boolean isFlagsTimeStampPresent(int flags) {
        return isFlagsMatched(FLAG_TIME_STAMP_MASK, FLAG_TIME_STAMP_PRESENT, flags);
    }

    /**
     * @param flags Flags
     * @return {@code true}:Pulse Rate not present, {@code false}:Pulse Rate present
     */
    public static boolean isFlagsPulseRateNotPresent(int flags) {
        return isFlagsMatched(FLAG_PULSE_RATE_MASK, FLAG_PULSE_RATE_NOT_PRESENT, flags);
    }

    /**
     * @param flags Flags
     * @return {@code true}:Pulse Rate present, {@code false}:Pulse Rate not present
     */
    public static boolean isFlagsPulseRatePresent(int flags) {
        return isFlagsMatched(FLAG_PULSE_RATE_MASK, FLAG_PULSE_RATE_PRESENT, flags);
    }

    /**
     * @param flags Flags
     * @return {@code true}:User ID not present, {@code false}:User ID present
     */
    public static boolean isFlagsUserIdNotPresent(int flags) {
        return isFlagsMatched(FLAG_USER_ID_MASK, FLAG_USER_ID_NOT_PRESENT, flags);
    }

    /**
     * @param flags Flags
     * @return {@code true}:User ID present, {@code false}:User ID not present
     */
    public static boolean isFlagsUserIdPresent(int flags) {
        return isFlagsMatched(FLAG_USER_ID_MASK, FLAG_USER_ID_PRESENT, flags);
    }

    /**
     * @param flags Flags
     * @return {@code true}:Measurement Status not present, {@code false}:Measurement Status present
     */
    public static boolean isFlagsMeasurementStatusNotPresent(int flags) {
        return isFlagsMatched(FLAG_MEASUREMENT_STATUS_MASK, FLAG_MEASUREMENT_STATUS_NOT_PRESENT, flags);
    }

    /**
     * @param flags Flags
     * @return {@code true}:Measurement Status present, {@code false}:Measurement Status not present
     */
    public static boolean isFlagsMeasurementStatusPresent(int flags) {
        return isFlagsMatched(FLAG_MEASUREMENT_STATUS_MASK, FLAG_MEASUREMENT_STATUS_PRESENT, flags);
    }

    /**
     * @param measurementStatus Measurement Status
     * @return {@code true}:No body movement, {@code false}:Body movement during measurement
     */
    public static boolean isMeasurementStatusBodyMoveDetectionNoBodyMovement(byte[] measurementStatus) {
        return isMeasurementStatusMatched(MEASUREMENT_STATUS_BODY_MOVEMENT_DETECTION_MASK, MEASUREMENT_STATUS_BODY_MOVEMENT_DETECTION_NO_BODY_MOVEMENT, measurementStatus);
    }

    /**
     * @param measurementStatus Measurement Status
     * @return {@code true}:Body movement during measurement, {@code false}:No body movement
     */
    public static boolean isMeasurementStatusBodyMoveDetectionBodyMovementDuringMeasurement(byte[] measurementStatus) {
        return isMeasurementStatusMatched(MEASUREMENT_STATUS_BODY_MOVEMENT_DETECTION_MASK, MEASUREMENT_STATUS_BODY_MOVEMENT_DETECTION_BODY_MOVEMENT_DURING_MEASUREMENT, measurementStatus);
    }

    /**
     * @param measurementStatus Measurement Status
     * @return {@code true}:Cuff fits properly, {@code false}:Cuff too loose
     */
    public static boolean isMeasurementStatusCuffFitDetectionCuffFitsProperly(byte[] measurementStatus) {
        return isMeasurementStatusMatched(MEASUREMENT_STATUS_CUFF_FIT_DETECTION_MASK, MEASUREMENT_STATUS_CUFF_FIT_DETECTION_CUFF_FITS_PROPERLY, measurementStatus);
    }

    /**
     * @param measurementStatus Measurement Status
     * @return {@code true}:Cuff too loose, {@code false}:Cuff fits properly
     */
    public static boolean isMeasurementStatusCuffFitDetectionCuffTooLoose(byte[] measurementStatus) {
        return isMeasurementStatusMatched(MEASUREMENT_STATUS_CUFF_FIT_DETECTION_MASK, MEASUREMENT_STATUS_CUFF_FIT_DETECTION_CUFF_TOO_LOOSE, measurementStatus);
    }

    /**
     * @param measurementStatus Measurement Status
     * @return {@code true}:No irregular pulse detected, {@code false}:Irregular pulse detected
     */
    public static boolean isMeasurementStatusIrregularPulseDetectionNoIrregularPulseDetected(byte[] measurementStatus) {
        return isMeasurementStatusMatched(MEASUREMENT_STATUS_IRREGULAR_PULSE_DETECTION_MASK, MEASUREMENT_STATUS_IRREGULAR_PULSE_DETECTION_NO_IRREGULAR_PULSE_DETECTED, measurementStatus);
    }

    /**
     * @param measurementStatus Measurement Status
     * @return {@code true}:Irregular pulse detected, {@code false}:No irregular pulse detected
     */
    public static boolean isMeasurementStatusIrregularPulseDetectionIrregularPulseDetected(byte[] measurementStatus) {
        return isMeasurementStatusMatched(MEASUREMENT_STATUS_IRREGULAR_PULSE_DETECTION_MASK, MEASUREMENT_STATUS_IRREGULAR_PULSE_DETECTION_IRREGULAR_PULSE_DETECTED, measurementStatus);
    }

    /**
     * @param measurementStatus Measurement Status
     * @return {@code true}:Pulse rate is within the range, {@code false}:not Pulse rate is within the range
     */
    public static boolean isMeasurementStatusPulseRateRangeDetectionPulseRateIsWithinTheRange(byte[] measurementStatus) {
        return isMeasurementStatusMatched(MEASUREMENT_STATUS_PULSE_RATE_RANGE_DETECTION_MASK, MEASUREMENT_STATUS_PULSE_RATE_RANGE_DETECTION_PULSE_RATE_IS_WITHIN_THE_RANGE, measurementStatus);
    }

    /**
     * @param measurementStatus Measurement Status
     * @return {@code true}:Pulse rate exceeds upper limit, {@code false}:not Pulse rate exceeds upper limit
     */
    public static boolean isMeasurementStatusPulseRateRangeDetectionPulseRateExceedssUpperLimit(byte[] measurementStatus) {
        return isMeasurementStatusMatched(MEASUREMENT_STATUS_PULSE_RATE_RANGE_DETECTION_MASK, MEASUREMENT_STATUS_PULSE_RATE_RANGE_DETECTION_PULSE_RATE_EXCEEDS_UPPER_LIMIT, measurementStatus);
    }

    /**
     * @param measurementStatus Measurement Status
     * @return {@code true}:Pulse rate is less than lower limit, {@code false}:not Pulse rate is less than lower limit
     */
    public static boolean isMeasurementStatusPulseRateRangeDetectionPulseRateIsLessThanLowerLimit(byte[] measurementStatus) {
        return isMeasurementStatusMatched(MEASUREMENT_STATUS_PULSE_RATE_RANGE_DETECTION_MASK, MEASUREMENT_STATUS_PULSE_RATE_RANGE_DETECTION_PULSE_RATE_IS_LESS_THAN_LOWER_LIMIT, measurementStatus);
    }

    /**
     * @param measurementStatus Measurement Status
     * @return {@code true}:Proper measurement position, {@code false}:Improper measurement position
     */
    public static boolean isMeasurementStatusMeasurementPositionDetectionProperMeasurementPosition(byte[] measurementStatus) {
        return isMeasurementStatusMatched(MEASUREMENT_STATUS_MEASUREMENT_POSITION_DETECTION_MASK, MEASUREMENT_STATUS_MEASUREMENT_POSITION_DETECTION_PROPER_MEASUREMENT_POSITION, measurementStatus);
    }

    /**
     * @param measurementStatus Measurement Status
     * @return {@code true}:Improper measurement position, {@code false}:Proper measurement position
     */
    public static boolean isMeasurementStatusMeasurementPositionDetectionImproperMeasurementPosition(byte[] measurementStatus) {
        return isMeasurementStatusMatched(MEASUREMENT_STATUS_MEASUREMENT_POSITION_DETECTION_MASK, MEASUREMENT_STATUS_MEASUREMENT_POSITION_DETECTION_IMPROPER_MEASUREMENT_POSITION, measurementStatus);
    }

    /**
     * check Flags
     *
     * @param mask   bitmask for expect
     * @param expect one of {@link #FLAG_BLOOD_PRESSURE_UNITS_MMHG} , {@link #FLAG_BLOOD_PRESSURE_UNITS_KPA} , {@link #FLAG_TIME_STAMP_NOT_PRESENT} , {@link #FLAG_TIME_STAMP_PRESENT} , {@link #FLAG_PULSE_RATE_NOT_PRESENT} , {@link #FLAG_PULSE_RATE_PRESENT} , {@link #FLAG_USER_ID_NOT_PRESENT} , {@link #FLAG_USER_ID_PRESENT} , {@link #FLAG_MEASUREMENT_STATUS_NOT_PRESENT} , {@link #FLAG_MEASUREMENT_STATUS_PRESENT}
     * @param flags  Flags
     * @return {@code true}:same as expect, {@code false}:not match
     */
    private static boolean isFlagsMatched(int mask, int expect, int flags) {
        return (mask & flags) == expect;
    }

    /**
     * check Measurement Status
     *
     * @param mask              bitmask for expect
     * @param expect            one of {@link #MEASUREMENT_STATUS_BODY_MOVEMENT_DETECTION_NO_BODY_MOVEMENT} , {@link #MEASUREMENT_STATUS_BODY_MOVEMENT_DETECTION_BODY_MOVEMENT_DURING_MEASUREMENT} , {@link #MEASUREMENT_STATUS_CUFF_FIT_DETECTION_CUFF_FITS_PROPERLY} , {@link #MEASUREMENT_STATUS_CUFF_FIT_DETECTION_CUFF_TOO_LOOSE} , {@link #MEASUREMENT_STATUS_IRREGULAR_PULSE_DETECTION_NO_IRREGULAR_PULSE_DETECTED} , {@link #MEASUREMENT_STATUS_IRREGULAR_PULSE_DETECTION_IRREGULAR_PULSE_DETECTED} , {@link #MEASUREMENT_STATUS_PULSE_RATE_RANGE_DETECTION_PULSE_RATE_IS_WITHIN_THE_RANGE} , {@link #MEASUREMENT_STATUS_PULSE_RATE_RANGE_DETECTION_PULSE_RATE_EXCEEDS_UPPER_LIMIT} , {@link #MEASUREMENT_STATUS_PULSE_RATE_RANGE_DETECTION_PULSE_RATE_IS_LESS_THAN_LOWER_LIMIT} , {@link #MEASUREMENT_STATUS_MEASUREMENT_POSITION_DETECTION_PROPER_MEASUREMENT_POSITION} , {@link #MEASUREMENT_STATUS_MEASUREMENT_POSITION_DETECTION_IMPROPER_MEASUREMENT_POSITION}
     * @param measurementStatus Measurement Status
     * @return {@code true}:same as expect, {@code false}:not match
     */
    private static boolean isMeasurementStatusMatched(int mask, int expect, byte[] measurementStatus) {
        return (mask & BLEUtils.createSInt16(measurementStatus, 0)) == expect;
    }
}
