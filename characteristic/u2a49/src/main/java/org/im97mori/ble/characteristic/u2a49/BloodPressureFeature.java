package org.im97mori.ble.characteristic.u2a49;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Blood Pressure Feature (Characteristics UUID: 0x2A49)
 */
public class BloodPressureFeature implements ByteArrayInterface {

    /**
     * @see #BODY_MOVEMENT_DETECTION_SUPPORT_FALSE
     * @see #BODY_MOVEMENT_DETECTION_SUPPORT_TRUE
     */
    public static final int BODY_MOVEMENT_DETECTION_SUPPORT_MASK = 0b00000000_00000001;

    /**
     * 0: Body Movement Detection feature not supported
     */
    public static final int BODY_MOVEMENT_DETECTION_SUPPORT_FALSE = 0b00000000_00000000;

    /**
     * 1: Body Movement Detection feature supported
     */
    public static final int BODY_MOVEMENT_DETECTION_SUPPORT_TRUE = 0b00000000_00000001;

    /**
     * @see #CUFF_FIT_DETECTION_SUPPORT_FALSE
     * @see #CUFF_FIT_DETECTION_SUPPORT_TRUE
     */
    public static final int CUFF_FIT_DETECTION_SUPPORT_MASK = 0b00000000_00000010;

    /**
     * 0: Cuff Fit Detection feature not supported
     */
    public static final int CUFF_FIT_DETECTION_SUPPORT_FALSE = 0b00000000_00000000;

    /**
     * 1: Cuff Fit Detection feature supported
     */
    public static final int CUFF_FIT_DETECTION_SUPPORT_TRUE = 0b00000000_00000010;

    /**
     * @see #IRREGULAR_PULSE_DETECTION_SUPPORT_FALSE
     * @see #IRREGULAR_PULSE_DETECTION_SUPPORT_TRUE
     */
    public static final int IRREGULAR_PULSE_DETECTION_SUPPORT_MASK = 0b00000000_00000100;

    /**
     * 0: Irregular Pulse Detection feature not supported
     */
    public static final int IRREGULAR_PULSE_DETECTION_SUPPORT_FALSE = 0b00000000_00000000;

    /**
     * 1: Irregular Pulse Detection feature supported
     */
    public static final int IRREGULAR_PULSE_DETECTION_SUPPORT_TRUE = 0b00000000_00000100;

    /**
     * @see #PULSE_RATE_RANGE_DETECTION_SUPPORT_FALSE
     * @see #PULSE_RATE_RANGE_DETECTION_SUPPORT_TRUE
     */
    public static final int PULSE_RATE_RANGE_DETECTION_SUPPORT_MASK = 0b00000000_00001000;

    /**
     * 0: Pulse Rate Range Detection feature not supported
     */
    public static final int PULSE_RATE_RANGE_DETECTION_SUPPORT_FALSE = 0b00000000_00000000;

    /**
     * 1: Pulse Rate Range Detection feature supported
     */
    public static final int PULSE_RATE_RANGE_DETECTION_SUPPORT_TRUE = 0b00000000_00001000;

    /**
     * @see #MEASUREMENT_POSITION_DETECTION_SUPPORT_FALSE
     * @see #MEASUREMENT_POSITION_DETECTION_SUPPORT_TRUE
     */
    public static final int MEASUREMENT_POSITION_DETECTION_SUPPORT_MASK = 0b00000000_00010000;

    /**
     * 0: Measurement Position Detection feature not supported
     */
    public static final int MEASUREMENT_POSITION_DETECTION_SUPPORT_FALSE = 0b00000000_00000000;

    /**
     * 1: Measurement Position Detection feature supported
     */
    public static final int MEASUREMENT_POSITION_DETECTION_SUPPORT_TRUE = 0b00000000_00010000;

    /**
     * @see #MULTIPLE_BOND_SUPPORT_FALSE
     * @see #MULTIPLE_BOND_SUPPORT_TRUE
     */
    public static final int MULTIPLE_BOND_SUPPORT_MASK = 0b00000000_00100000;

    /**
     * 0: Multiple Bonds not supported
     */
    public static final int MULTIPLE_BOND_SUPPORT_FALSE = 0b00000000_00000000;

    /**
     * 1: Multiple Bonds supported
     */
    public static final int MULTIPLE_BOND_SUPPORT_TRUE = 0b00000000_00100000;

    /**
     * @see #E2E_CRC_SUPPORT_FALSE
     * @see #E2E_CRC_SUPPORT_TRUE
     */
    public static final int E2E_CRC_SUPPORT_MASK = 0b00000000_01000000;

    /**
     * 0: E2E-CRC not supported
     */
    public static final int E2E_CRC_SUPPORT_FALSE = 0b00000000_00000000;

    /**
     * 1: E2E-CRC supported
     */
    public static final int E2E_CRC_SUPPORT_TRUE = 0b00000000_01000000;

    /**
     * @see #USER_DATA_SERVICE_SUPPORT_FALSE
     * @see #USER_DATA_SERVICE_SUPPORT_TRUE
     */
    public static final int USER_DATA_SERVICE_SUPPORT_MASK = 0b00000000_10000000;

    /**
     * 0: User Data Service not supported
     */
    public static final int USER_DATA_SERVICE_SUPPORT_FALSE = 0b00000000_00000000;

    /**
     * 1: User Data Service supported
     */
    public static final int USER_DATA_SERVICE_SUPPORT_TRUE = 0b00000000_10000000;

    /**
     * @see #USER_FACING_TIME_SUPPORT_FALSE
     * @see #USER_FACING_TIME_SUPPORT_TRUE
     */
    public static final int USER_FACING_TIME_SUPPORT_MASK = 0b00000001_00000000;

    /**
     * 0: User Facing Time not supported
     */
    public static final int USER_FACING_TIME_SUPPORT_FALSE = 0b00000000_00000000;

    /**
     * 1: User Facing Time supported
     */
    public static final int USER_FACING_TIME_SUPPORT_TRUE = 0b00000001_00000000;

    /**
     * Blood Pressure Feature
     */
    private final byte[] mBloodPressureFeature;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public BloodPressureFeature(@NonNull byte[] values) {
        mBloodPressureFeature = Arrays.copyOfRange(values, 0, 2);
    }

	/**
	 * Constructor from flags
	 * 
	 * @param isBodyMovementDetectionFeatureSupported {@code true}:{@link #BODY_MOVEMENT_DETECTION_SUPPORT_TRUE},
	 *                                                {@code false}:{@link #BODY_MOVEMENT_DETECTION_SUPPORT_FALSE}
	 * @param isCuffFitDetectionSupported             {@code true}:{@link #CUFF_FIT_DETECTION_SUPPORT_TRUE},
	 *                                                {@code false}:{@link #CUFF_FIT_DETECTION_SUPPORT_FALSE}
	 * @param isIrregularPulseDetectionSupported      {@code true}:{@link #IRREGULAR_PULSE_DETECTION_SUPPORT_TRUE},
	 *                                                {@code false}:{@link #IRREGULAR_PULSE_DETECTION_SUPPORT_FALSE}
	 * @param isPulseRateRangeDetectionSupported      {@code true}:{@link #PULSE_RATE_RANGE_DETECTION_SUPPORT_TRUE},
	 *                                                {@code false}:{@link #PULSE_RATE_RANGE_DETECTION_SUPPORT_FALSE}
	 * @param isMeasurementPositionDetectionSupported {@code true}:{@link #MEASUREMENT_POSITION_DETECTION_SUPPORT_TRUE},
	 *                                                {@code false}:{@link #MEASUREMENT_POSITION_DETECTION_SUPPORT_TRUE}
	 * @param isMultipleBondSupported                 {@code true}:{@link #MULTIPLE_BOND_SUPPORT_TRUE},
	 *                                                {@code false}:{@link #MULTIPLE_BOND_SUPPORT_FALSE}
	 * @param isE2eCrcSupported                       {@code true}:{@link #E2E_CRC_SUPPORT_TRUE},
	 *                                                {@code false}:{@link #E2E_CRC_SUPPORT_FALSE}
	 * @param isUserDataServiceSupported              {@code true}:{@link #USER_DATA_SERVICE_SUPPORT_TRUE},
	 *                                                {@code false}:{@link #USER_DATA_SERVICE_SUPPORT_FALSE}
	 * @param isUserFacingTimeSupported               {@code true}:{@link #USER_FACING_TIME_SUPPORT_TRUE},
	 *                                                {@code false}:{@link #USER_FACING_TIME_SUPPORT_FALSE}
	 */
    public BloodPressureFeature(boolean isBodyMovementDetectionFeatureSupported
    		, boolean isCuffFitDetectionSupported
    		, boolean isIrregularPulseDetectionSupported
    		, boolean isPulseRateRangeDetectionSupported
    		, boolean isMeasurementPositionDetectionSupported
    		, boolean isMultipleBondSupported
    		, boolean isE2eCrcSupported
    		, boolean isUserDataServiceSupported
    		, boolean isUserFacingTimeSupported) {
        // @formatter:off
        int flags = (isBodyMovementDetectionFeatureSupported ? BODY_MOVEMENT_DETECTION_SUPPORT_TRUE : BODY_MOVEMENT_DETECTION_SUPPORT_FALSE)
                | (isCuffFitDetectionSupported ? CUFF_FIT_DETECTION_SUPPORT_TRUE : CUFF_FIT_DETECTION_SUPPORT_FALSE)
                | (isIrregularPulseDetectionSupported ? IRREGULAR_PULSE_DETECTION_SUPPORT_TRUE : IRREGULAR_PULSE_DETECTION_SUPPORT_FALSE)
                | (isPulseRateRangeDetectionSupported ? PULSE_RATE_RANGE_DETECTION_SUPPORT_TRUE : PULSE_RATE_RANGE_DETECTION_SUPPORT_FALSE)
                | (isMeasurementPositionDetectionSupported ? MEASUREMENT_POSITION_DETECTION_SUPPORT_TRUE : MEASUREMENT_POSITION_DETECTION_SUPPORT_FALSE)
                | (isMultipleBondSupported ? MULTIPLE_BOND_SUPPORT_TRUE : MULTIPLE_BOND_SUPPORT_FALSE)
        		| (isE2eCrcSupported ? E2E_CRC_SUPPORT_TRUE : E2E_CRC_SUPPORT_FALSE)
				| (isUserDataServiceSupported ? USER_DATA_SERVICE_SUPPORT_TRUE : USER_DATA_SERVICE_SUPPORT_FALSE)
				| (isUserFacingTimeSupported ? USER_FACING_TIME_SUPPORT_TRUE : USER_FACING_TIME_SUPPORT_FALSE);
        // @formatter:on
        mBloodPressureFeature = new byte[] { (byte) flags, (byte) (flags >> 8) };
    }

    /**
     * @return Blood Pressure Feature
     */
    public byte[] getBloodPressureFeature() {
        return mBloodPressureFeature;
    }

    /**
     * @return {@code true}:Body Movement Detection feature not supported, {@code false}:Body Movement Detection feature supported
     */
    public boolean isBodyMovementDetectionNotSupported() {
        return isFeatureMatched(BODY_MOVEMENT_DETECTION_SUPPORT_MASK, BODY_MOVEMENT_DETECTION_SUPPORT_FALSE);
    }

    /**
     * @return {@code true}:Body Movement Detection feature supported, {@code false}:Body Movement Detection feature not supported
     */
    public boolean isBodyMovementDetectionSupported() {
        return isFeatureMatched(BODY_MOVEMENT_DETECTION_SUPPORT_MASK, BODY_MOVEMENT_DETECTION_SUPPORT_TRUE);
    }

    /**
     * @return {@code true}:Cuff Fit Detection feature not supported, {@code false}:Cuff Fit Detection feature supported
     */
    public boolean isCuffFitDetectionNotSupported() {
        return isFeatureMatched(CUFF_FIT_DETECTION_SUPPORT_MASK, CUFF_FIT_DETECTION_SUPPORT_FALSE);
    }

    /**
     * @return {@code true}:Cuff Fit Detection feature supported, {@code false}:Cuff Fit Detection feature not supported
     */
    public boolean isCuffFitDetectionSupported() {
        return isFeatureMatched(CUFF_FIT_DETECTION_SUPPORT_MASK, CUFF_FIT_DETECTION_SUPPORT_TRUE);
    }

    /**
     * @return {@code true}:Irregular Pulse Detection feature not supported, {@code false}:Irregular Pulse Detection feature supported
     */
    public boolean isIrregularPulsetDetectionNotSupported() {
        return isFeatureMatched(IRREGULAR_PULSE_DETECTION_SUPPORT_MASK, IRREGULAR_PULSE_DETECTION_SUPPORT_FALSE);
    }

    /**
     * @return {@code true}:Irregular Pulse Detection feature supported, {@code false}:Irregular Pulse Detection feature not supported
     */
    public boolean isIrregularPulseDetectionSupported() {
        return isFeatureMatched(IRREGULAR_PULSE_DETECTION_SUPPORT_MASK, IRREGULAR_PULSE_DETECTION_SUPPORT_TRUE);
    }

    /**
     * @return {@code true}:Pulse Rate Range Detection feature not supported, {@code false}:Pulse Rate Range Detection feature supported
     */
    public boolean isPulseRateRangeDetectionNotSupported() {
        return isFeatureMatched(PULSE_RATE_RANGE_DETECTION_SUPPORT_MASK, PULSE_RATE_RANGE_DETECTION_SUPPORT_FALSE);
    }

    /**
     * @return {@code true}:Pulse Rate Range Detection feature supported, {@code false}:Pulse Rate Range Detection feature not supported
     */
    public boolean isPulseRateRangeDetectionSupported() {
        return isFeatureMatched(PULSE_RATE_RANGE_DETECTION_SUPPORT_MASK, PULSE_RATE_RANGE_DETECTION_SUPPORT_TRUE);
    }

    /**
     * @return {@code true}:Measurement Position Detection feature not supported, {@code false}:Measurement Position Detection feature supported
     */
    public boolean isMeasurementPositionDetectionNotSupported() {
        return isFeatureMatched(MEASUREMENT_POSITION_DETECTION_SUPPORT_MASK, MEASUREMENT_POSITION_DETECTION_SUPPORT_FALSE);
    }

    /**
     * @return {@code true}:Measurement Position Detection feature supported, {@code false}:Measurement Position Detection feature not supported
     */
    public boolean isMeasurementPositionDetectionSupported() {
        return isFeatureMatched(MEASUREMENT_POSITION_DETECTION_SUPPORT_MASK, MEASUREMENT_POSITION_DETECTION_SUPPORT_TRUE);
    }

    /**
     * @return {@code true}:Multiple Bonds not supported, {@code false}:Multiple Bonds supported
     */
    public boolean isMultipleBondNotSupported() {
        return isFeatureMatched(MULTIPLE_BOND_SUPPORT_MASK, MULTIPLE_BOND_SUPPORT_FALSE);
    }

    /**
     * @return {@code true}:Multiple Bonds supported, {@code false}:Multiple Bonds not supported
     */
    public boolean isMultipleBondSupported() {
        return isFeatureMatched(MULTIPLE_BOND_SUPPORT_MASK, MULTIPLE_BOND_SUPPORT_TRUE);
    }

    /**
     * @return {@code true}:E2E-CRC not supported, {@code false}:E2E-CRC supported
     */
    public boolean isE2eCrcNotSupported() {
        return isFeatureMatched(E2E_CRC_SUPPORT_MASK, E2E_CRC_SUPPORT_FALSE);
    }

    /**
     * @return {@code true}:E2E-CRC supported, {@code false}:E2E-CRC not supported
     */
    public boolean isE2eCrcSupported() {
        return isFeatureMatched(E2E_CRC_SUPPORT_MASK, E2E_CRC_SUPPORT_TRUE);
    }

    /**
     * @return {@code true}:User Data Service not supported, {@code false}:User Data Service supported
     */
    public boolean isUserDataServiceNotSupported() {
        return isFeatureMatched(USER_DATA_SERVICE_SUPPORT_MASK, USER_DATA_SERVICE_SUPPORT_FALSE);
    }

    /**
     * @return {@code true}:User Data Service supported, {@code false}:User Data Service not supported
     */
    public boolean isUserDataServiceSupported() {
        return isFeatureMatched(USER_DATA_SERVICE_SUPPORT_MASK, USER_DATA_SERVICE_SUPPORT_TRUE);
    }

    /**
     * @return {@code true}:User Facing Time not supported, {@code false}:User Facing Time supported
     */
    public boolean isUserFacingTimeNotSupported() {
        return isFeatureMatched(USER_FACING_TIME_SUPPORT_MASK, USER_FACING_TIME_SUPPORT_FALSE);
    }

    /**
     * @return {@code true}:User Facing Time supported, {@code false}:User Facing Time not supported
     */
    public boolean isUserFacingTimeSupported() {
        return isFeatureMatched(USER_FACING_TIME_SUPPORT_MASK, USER_FACING_TIME_SUPPORT_TRUE);
    }
    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put(mBloodPressureFeature);
        return data;
    }

    /**
     * check Blood Pressure Feature
     *
     * @param mask   bitmask for expect
     * @param expect one of {@link #BODY_MOVEMENT_DETECTION_SUPPORT_FALSE}
     *               , {@link #BODY_MOVEMENT_DETECTION_SUPPORT_TRUE}
     *               , {@link #CUFF_FIT_DETECTION_SUPPORT_FALSE}
     *               , {@link #CUFF_FIT_DETECTION_SUPPORT_TRUE}
     *               , {@link #IRREGULAR_PULSE_DETECTION_SUPPORT_FALSE}
     *               , {@link #IRREGULAR_PULSE_DETECTION_SUPPORT_TRUE}
     *               , {@link #PULSE_RATE_RANGE_DETECTION_SUPPORT_FALSE}
     *               , {@link #PULSE_RATE_RANGE_DETECTION_SUPPORT_TRUE}
     *               , {@link #MEASUREMENT_POSITION_DETECTION_SUPPORT_FALSE}
     *               , {@link #MEASUREMENT_POSITION_DETECTION_SUPPORT_TRUE}
     *               , {@link #MULTIPLE_BOND_SUPPORT_FALSE}
     *               , {@link #MULTIPLE_BOND_SUPPORT_TRUE}
     *               , {@link #E2E_CRC_SUPPORT_FALSE}
     *               , {@link #E2E_CRC_SUPPORT_TRUE}
     *               , {@link #USER_DATA_SERVICE_SUPPORT_FALSE}
     *               , {@link #USER_DATA_SERVICE_SUPPORT_TRUE}
     *               , {@link #USER_FACING_TIME_SUPPORT_FALSE}
     *               , {@link #USER_FACING_TIME_SUPPORT_TRUE}
     * @return {@code true}:same as expect, {@code false}:not match
     */
    private boolean isFeatureMatched(int mask, int expect) {
        return (mask & BLEUtils.createSInt16(mBloodPressureFeature, 0)) == expect;
    }
}
