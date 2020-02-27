package org.im97mori.ble.characteristic.u2a54;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * RSC Feature (Characteristics UUID: 0x2A54)
 */
public class RSCFeature implements ByteArrayInterface {

    /**
     * @see #RSC_FEATURE_INSTANTANEOUS_STRIDE_LENGTH_MEASUREMENT_SUPPORTED_FALSE
     * @see #RSC_FEATURE_INSTANTANEOUS_STRIDE_LENGTH_MEASUREMENT_SUPPORTED_TRUE
     */
    public static final int RSC_FEATURE_INSTANTANEOUS_STRIDE_LENGTH_MEASUREMENT_SUPPORTED_MASK = 0b00000000_00000001;

    /**
     * 0: Instantaneous Stride Length Measurement Supported False
     */
    public static final int RSC_FEATURE_INSTANTANEOUS_STRIDE_LENGTH_MEASUREMENT_SUPPORTED_FALSE = 0b00000000_00000000;

    /**
     * 1: Instantaneous Stride Length Measurement Supported True
     */
    public static final int RSC_FEATURE_INSTANTANEOUS_STRIDE_LENGTH_MEASUREMENT_SUPPORTED_TRUE = 0b00000000_00000001;

    /**
     * @see #RSC_FEATURE_TOTAL_DISTANCE_MEASUREMENT_SUPPORTED_FALSE
     * @see #RSC_FEATURE_TOTAL_DISTANCE_MEASUREMENT_SUPPORTED_TRUE
     */
    public static final int RSC_FEATURE_TOTAL_DISTANCE_MEASUREMENT_SUPPORTED_MASK = 0b00000000_00000010;

    /**
     * 0: Total Distance Measurement Supported False
     */
    public static final int RSC_FEATURE_TOTAL_DISTANCE_MEASUREMENT_SUPPORTED_FALSE = 0b00000000_00000000;

    /**
     * 1: Total Distance Measurement Supported True
     */
    public static final int RSC_FEATURE_TOTAL_DISTANCE_MEASUREMENT_SUPPORTED_TRUE = 0b00000000_00000010;

    /**
     * @see #RSC_FEATURE_WALKING_OR_RUNNING_STATUS_SUPPORTED_FALSE
     * @see #RSC_FEATURE_WALKING_OR_RUNNING_STATUS_SUPPORTED_TRUE
     */
    public static final int RSC_FEATURE_WALKING_OR_RUNNING_STATUS_SUPPORTED_MASK = 0b00000000_00000100;

    /**
     * 0: Walking or Running Status Supported False
     */
    public static final int RSC_FEATURE_WALKING_OR_RUNNING_STATUS_SUPPORTED_FALSE = 0b00000000_00000000;

    /**
     * 1: Walking or Running Status Supported True
     */
    public static final int RSC_FEATURE_WALKING_OR_RUNNING_STATUS_SUPPORTED_TRUE = 0b00000000_00000100;

    /**
     * @see #RSC_FEATURE_CALIBRATION_PROCEDURE_SUPPORTED_FALSE
     * @see #RSC_FEATURE_CALIBRATION_PROCEDURE_SUPPORTED_TRUE
     */
    public static final int RSC_FEATURE_CALIBRATION_PROCEDURE_SUPPORTED_MASK = 0b00000000_00001000;

    /**
     * 0: Calibration Procedure Supported False
     */
    public static final int RSC_FEATURE_CALIBRATION_PROCEDURE_SUPPORTED_FALSE = 0b00000000_00000000;

    /**
     * 1: Calibration Procedure Supported True
     */
    public static final int RSC_FEATURE_CALIBRATION_PROCEDURE_SUPPORTED_TRUE = 0b00000000_00001000;

    /**
     * @see #RSC_FEATURE_MULTIPLE_SENSOR_LOCATIONS_SUPPORTED_FALSE
     * @see #RSC_FEATURE_MULTIPLE_SENSOR_LOCATIONS_SUPPORTED_TRUE
     */
    public static final int RSC_FEATURE_MULTIPLE_SENSOR_LOCATIONS_SUPPORTED_MASK = 0b00000000_00010000;

    /**
     * 0: Multiple Sensor Locations Supported False
     */
    public static final int RSC_FEATURE_MULTIPLE_SENSOR_LOCATIONS_SUPPORTED_FALSE = 0b00000000_00000000;

    /**
     * 1: Multiple Sensor Locations Supported True
     */
    public static final int RSC_FEATURE_MULTIPLE_SENSOR_LOCATIONS_SUPPORTED_TRUE = 0b00000000_00010000;

    /**
     * RSC Feature
     */
    private final byte[] mRscFeature;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A54
     */
    public RSCFeature(@NonNull byte[] values) {
        mRscFeature = Arrays.copyOfRange(values, 0, 2);
    }

    /**
     * @return RSC Feature
     */
    public byte[] getRscFeature() {
        return mRscFeature;
    }

    /**
     * @return {@code true}:Instantaneous Stride Length Measurement not Supported, {@code false}:Instantaneous Stride Length Measurement Supported
     */
    public boolean isRscFeatureInstantaneousStrideLengthMeasurementNotSupported() {
        return isFeatureMatched(RSC_FEATURE_INSTANTANEOUS_STRIDE_LENGTH_MEASUREMENT_SUPPORTED_MASK, RSC_FEATURE_INSTANTANEOUS_STRIDE_LENGTH_MEASUREMENT_SUPPORTED_FALSE);
    }

    /**
     * @return {@code true}:Instantaneous Stride Length Measurement Supported, {@code false}:Instantaneous Stride Length Measurement not Supported
     */
    public boolean isRscFeatureInstantaneousStrideLengthMeasurementSupported() {
        return isFeatureMatched(RSC_FEATURE_INSTANTANEOUS_STRIDE_LENGTH_MEASUREMENT_SUPPORTED_MASK, RSC_FEATURE_INSTANTANEOUS_STRIDE_LENGTH_MEASUREMENT_SUPPORTED_TRUE);
    }

    /**
     * @return {@code true}:Total Distance Measurement not Supported, {@code false}:Total Distance Measurement Supported
     */
    public boolean isRscFeatureTotalDistanceMeasurementNotSupported() {
        return isFeatureMatched(RSC_FEATURE_TOTAL_DISTANCE_MEASUREMENT_SUPPORTED_MASK, RSC_FEATURE_TOTAL_DISTANCE_MEASUREMENT_SUPPORTED_FALSE);
    }

    /**
     * @return {@code true}:Total Distance Measurement Supported, {@code false}:Total Distance Measurement not Supported
     */
    public boolean isRscFeatureTotalDistanceMeasurementSupported() {
        return isFeatureMatched(RSC_FEATURE_TOTAL_DISTANCE_MEASUREMENT_SUPPORTED_MASK, RSC_FEATURE_TOTAL_DISTANCE_MEASUREMENT_SUPPORTED_TRUE);
    }

    /**
     * @return {@code true}:Walking or Running Status not Supported, {@code false}:Walking or Running Status Supported
     */
    public boolean isRscFeatureWalkingOrRunningStatusNotSupported() {
        return isFeatureMatched(RSC_FEATURE_WALKING_OR_RUNNING_STATUS_SUPPORTED_MASK, RSC_FEATURE_WALKING_OR_RUNNING_STATUS_SUPPORTED_FALSE);
    }

    /**
     * @return {@code true}:Walking or Running Status Supported, {@code false}:Walking or Running Status not Supported
     */
    public boolean isRscFeatureWalkingOrRunningStatusSupported() {
        return isFeatureMatched(RSC_FEATURE_WALKING_OR_RUNNING_STATUS_SUPPORTED_MASK, RSC_FEATURE_WALKING_OR_RUNNING_STATUS_SUPPORTED_TRUE);
    }

    /**
     * @return {@code true}:Calibration Procedure not Supported, {@code false}:Calibration Procedure Supported
     */
    public boolean isRscFeatureCalibrationProcedureNotSupported() {
        return isFeatureMatched(RSC_FEATURE_CALIBRATION_PROCEDURE_SUPPORTED_MASK, RSC_FEATURE_CALIBRATION_PROCEDURE_SUPPORTED_FALSE);
    }

    /**
     * @return {@code true}:Calibration Procedure Supported, {@code false}:Calibration Procedure not Supported
     */
    public boolean isRscFeatureCalibrationProcedureSupported() {
        return isFeatureMatched(RSC_FEATURE_CALIBRATION_PROCEDURE_SUPPORTED_MASK, RSC_FEATURE_CALIBRATION_PROCEDURE_SUPPORTED_TRUE);
    }

    /**
     * @return {@code true}:Multiple Sensor Locations not Supported, {@code false}:Multiple Sensor Locations Supported
     */
    public boolean isRscFeatureMultipleSensorLocationsNotSupported() {
        return isFeatureMatched(RSC_FEATURE_MULTIPLE_SENSOR_LOCATIONS_SUPPORTED_MASK, RSC_FEATURE_MULTIPLE_SENSOR_LOCATIONS_SUPPORTED_FALSE);
    }

    /**
     * @return {@code true}:Multiple Sensor Locations Supported, {@code false}:Multiple Sensor Locations not Supported
     */
    public boolean isRscFeatureMultipleSensorLocationsSupported() {
        return isFeatureMatched(RSC_FEATURE_MULTIPLE_SENSOR_LOCATIONS_SUPPORTED_MASK, RSC_FEATURE_MULTIPLE_SENSOR_LOCATIONS_SUPPORTED_TRUE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put(mRscFeature);
        return data;
    }

    /**
     * check RSC Feature
     *
     * @param mask   bitmask for expect
     * @param expect one of {@link #RSC_FEATURE_INSTANTANEOUS_STRIDE_LENGTH_MEASUREMENT_SUPPORTED_FALSE}
     *               , {@link #RSC_FEATURE_INSTANTANEOUS_STRIDE_LENGTH_MEASUREMENT_SUPPORTED_TRUE}
     *               , {@link #RSC_FEATURE_TOTAL_DISTANCE_MEASUREMENT_SUPPORTED_FALSE}
     *               , {@link #RSC_FEATURE_TOTAL_DISTANCE_MEASUREMENT_SUPPORTED_TRUE}
     *               , {@link #RSC_FEATURE_WALKING_OR_RUNNING_STATUS_SUPPORTED_FALSE}
     *               , {@link #RSC_FEATURE_WALKING_OR_RUNNING_STATUS_SUPPORTED_TRUE}
     *               , {@link #RSC_FEATURE_CALIBRATION_PROCEDURE_SUPPORTED_FALSE}
     *               , {@link #RSC_FEATURE_CALIBRATION_PROCEDURE_SUPPORTED_TRUE}
     *               , {@link #RSC_FEATURE_MULTIPLE_SENSOR_LOCATIONS_SUPPORTED_FALSE}
     *               , {@link #RSC_FEATURE_MULTIPLE_SENSOR_LOCATIONS_SUPPORTED_TRUE}
     * @return {@code true}:same as expect, {@code false}:not match
     */
    private boolean isFeatureMatched(int mask, int expect) {
        return (mask & BLEUtils.createSInt16(mRscFeature, 0)) == expect;
    }

}
