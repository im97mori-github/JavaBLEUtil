package org.im97mori.ble.characteristic.u2a9b;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Body Composition Feature (Characteristics UUID: 0x2A9B)
 */
public class BodyCompositionFeature implements ByteArrayInterface {

    /**
     * @see #TIME_STAMP_SUPPORTED_FALSE
     * @see #TIME_STAMP_SUPPORTED_TRUE
     */
    public static final int TIME_STAMP_SUPPORTED_MASK = 0b00000000_00000000_00000000_00000001;

    /**
     * 0: Time Stamp Supported False
     */
    public static final int TIME_STAMP_SUPPORTED_FALSE = 0b00000000_00000000_00000000_00000000;

    /**
     * 1: Time Stamp Supported True
     */
    public static final int TIME_STAMP_SUPPORTED_TRUE = 0b00000000_00000000_00000000_00000001;

    /**
     * @see #MULTIPLE_USERS_SUPPORTED_FALSE
     * @see #MULTIPLE_USERS_SUPPORTED_TRUE
     */
    public static final int MULTIPLE_USERS_SUPPORTED_MASK = 0b00000000_00000000_00000000_00000010;

    /**
     * 0: Multiple Users Supported False
     */
    public static final int MULTIPLE_USERS_SUPPORTED_FALSE = 0b00000000_00000000_00000000_00000000;

    /**
     * 1: Multiple Users Supported True
     */
    public static final int MULTIPLE_USERS_SUPPORTED_TRUE = 0b00000000_00000000_00000000_00000010;

    /**
     * @see #BASAL_METABOLISM_SUPPORTED_FALSE
     * @see #BASAL_METABOLISM_SUPPORTED_TRUE
     */
    public static final int BASAL_METABOLISM_SUPPORTED_MASK = 0b00000000_00000000_00000000_00000100;

    /**
     * 0: Basal Metabolism Supported False
     */
    public static final int BASAL_METABOLISM_SUPPORTED_FALSE = 0b00000000_00000000_00000000_00000000;

    /**
     * 1: Basal Metabolism Supported True
     */
    public static final int BASAL_METABOLISM_SUPPORTED_TRUE = 0b00000000_00000000_00000000_00000100;

    /**
     * @see #MUSCLE_PERCENTAGE_SUPPORTED_FALSE
     * @see #MUSCLE_PERCENTAGE_SUPPORTED_TRUE
     */
    public static final int MUSCLE_PERCENTAGE_SUPPORTED_MASK = 0b00000000_00000000_00000000_00001000;

    /**
     * 0: Muscle Percentage Supported False
     */
    public static final int MUSCLE_PERCENTAGE_SUPPORTED_FALSE = 0b00000000_00000000_00000000_00000000;

    /**
     * 1: Muscle Percentage Supported True
     */
    public static final int MUSCLE_PERCENTAGE_SUPPORTED_TRUE = 0b00000000_00000000_00000000_00001000;

    /**
     * @see #MUSCLE_MASS_SUPPORTED_FALSE
     * @see #MUSCLE_MASS_SUPPORTED_TRUE
     */
    public static final int MUSCLE_MASS_SUPPORTED_MASK = 0b00000000_00000000_00000000_00010000;

    /**
     * 0: Muscle Mass Supported False
     */
    public static final int MUSCLE_MASS_SUPPORTED_FALSE = 0b00000000_00000000_00000000_00000000;

    /**
     * 1: Muscle Mass Supported True
     */
    public static final int MUSCLE_MASS_SUPPORTED_TRUE = 0b00000000_00000000_00000000_00010000;

    /**
     * @see #FAT_FREE_MASS_SUPPORTED_FALSE
     * @see #FAT_FREE_MASS_SUPPORTED_TRUE
     */
    public static final int FAT_FREE_MASS_SUPPORTED_MASK = 0b00000000_00000000_00000000_00100000;

    /**
     * 0: Fat Free Mass Supported False
     */
    public static final int FAT_FREE_MASS_SUPPORTED_FALSE = 0b00000000_00000000_00000000_00000000;

    /**
     * 1: Fat Free Mass Supported True
     */
    public static final int FAT_FREE_MASS_SUPPORTED_TRUE = 0b00000000_00000000_00000000_00100000;

    /**
     * @see #SOTT_LEAN_MASS_SUPPORTED_FALSE
     * @see #SOTT_LEAN_MASS_SUPPORTED_TRUE
     */
    public static final int SOTT_LEAN_MASS_SUPPORTED_MASK = 0b00000000_00000000_00000000_01000000;

    /**
     * 0: Soft Lean Mass Supported False
     */
    public static final int SOTT_LEAN_MASS_SUPPORTED_FALSE = 0b00000000_00000000_00000000_00000000;

    /**
     * 1: Soft Lean Mass Supported True
     */
    public static final int SOTT_LEAN_MASS_SUPPORTED_TRUE = 0b00000000_00000000_00000000_01000000;

    /**
     * @see #BODY_WATER_MASS_SUPPORTED_FALSE
     * @see #BODY_WATER_MASS_SUPPORTED_TRUE
     */
    public static final int BODY_WATER_MASS_SUPPORTED_MASK = 0b00000000_00000000_00000000_10000000;

    /**
     * 0: Body Water Mass Supported False
     */
    public static final int BODY_WATER_MASS_SUPPORTED_FALSE = 0b00000000_00000000_00000000_00000000;

    /**
     * 1: Body Water Mass Supported True
     */
    public static final int BODY_WATER_MASS_SUPPORTED_TRUE = 0b00000000_00000000_00000000_10000000;

    /**
     * @see #IMPEDANCE_SUPPORTED_FALSE
     * @see #IMPEDANCE_SUPPORTED_TRUE
     */
    public static final int IMPEDANCE_SUPPORTED_MASK = 0b00000000_00000000_00000001_00000000;

    /**
     * 0: Impedance Supported False
     */
    public static final int IMPEDANCE_SUPPORTED_FALSE = 0b00000000_00000000_00000000_00000000;

    /**
     * 1: Impedance Supported True
     */
    public static final int IMPEDANCE_SUPPORTED_TRUE = 0b00000000_00000000_00000001_00000000;

    /**
     * @see #WEIGHT_SUPPORTED_FALSE
     * @see #WEIGHT_SUPPORTED_TRUE
     */
    public static final int WEIGHT_SUPPORTED_MASK = 0b00000000_00000000_00000010_00000000;

    /**
     * 0: Weight Supported False
     */
    public static final int WEIGHT_SUPPORTED_FALSE = 0b00000000_00000000_00000000_00000000;

    /**
     * 1: Weight Supported True
     */
    public static final int WEIGHT_SUPPORTED_TRUE = 0b00000000_00000000_00000010_00000000;

    /**
     * @see #HEIGHT_SUPPORTED_FALSE
     * @see #HEIGHT_SUPPORTED_TRUE
     */
    public static final int HEIGHT_SUPPORTED_MASK = 0b00000000_00000000_00000100_00000000;

    /**
     * 0: Height Supported False
     */
    public static final int HEIGHT_SUPPORTED_FALSE = 0b00000000_00000000_00000000_00000000;

    /**
     * 1: Height Supported True
     */
    public static final int HEIGHT_SUPPORTED_TRUE = 0b00000000_00000000_00000100_00000000;

    /**
     * @see #MASS_MEASUREMENT_RESOLUTION_NOT_SPECIFIED
     * @see #MASS_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_5KG_OR_1LB
     * @see #MASS_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_2KG_OR_0_5LB
     * @see #MASS_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_1KG_OR_0_2LB
     * @see #MASS_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_05KG_OR_0_1B
     * @see #MASS_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_02KG_OR_0_05B
     * @see #MASS_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_01KG_OR_0_02B
     * @see #MASS_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_005KG_OR_0_01B
     */
    public static final int MASS_MEASUREMENT_RESOLUTION_MASK = 0b00000000_00000000_01111000_00000000;

    /**
     * 0: Not Specified
     */
    public static final int MASS_MEASUREMENT_RESOLUTION_NOT_SPECIFIED = 0b00000000_00000000_00000000_00000000;

    /**
     * 1: Resolution of 0.5 kg or 1 lb
     */
    public static final int MASS_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_5KG_OR_1LB = 0b00000000_00000000_00001000_00000000;

    /**
     * 2: Resolution of 0.2 kg or 0.5 lb
     */
    public static final int MASS_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_2KG_OR_0_5LB = 0b00000000_00000000_00010000_00000000;

    /**
     * 3: Resolution of 0.1 kg or 0.2 lb
     */
    public static final int MASS_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_1KG_OR_0_2LB = 0b00000000_00000000_00011000_00000000;

    /**
     * 4: Resolution of 0.05 kg or 0.1 lb
     */
    public static final int MASS_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_05KG_OR_0_1B = 0b00000000_00000000_00100000_00000000;

    /**
     * 5: Resolution of 0.02 kg or 0.05 lb
     */
    public static final int MASS_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_02KG_OR_0_05B = 0b00000000_00000000_00101000_00000000;

    /**
     * 6: Resolution of 0.01 kg or 0.02 lb
     */
    public static final int MASS_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_01KG_OR_0_02B = 0b00000000_00000000_00110000_00000000;

    /**
     * 7: Resolution of 0.005 kg or 0.01 lb
     */
    public static final int MASS_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_005KG_OR_0_01B = 0b00000000_00000000_00111000_00000000;

    /**
     * @see #HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED
     * @see #HEIGHT_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_01_METER_OR_1INCH
     * @see #HEIGHT_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_005METER_OR_0_5INCH
     * @see #HEIGHT_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_001METER_OR_0_1INCH
     */
    public static final int HEIGHT_MEASUREMENT_RESOLUTION_MASK = 0b00000000_00000011_10000000_00000000;

    /**
     * 0: Not Specified
     */
    public static final int HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED = 0b00000000_00000000_00000000_00000000;

    /**
     * 1: Resolution of 0.01 meter or 1 inch
     */
    public static final int HEIGHT_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_01_METER_OR_1INCH = 0b00000000_00000000_10000000_00000000;

    /**
     * 2: Resolution of 0.005 meter or 0.5 inch
     */
    public static final int HEIGHT_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_005METER_OR_0_5INCH = 0b00000000_00000001_00000000_00000000;

    /**
     * 3: Resolution of 0.001 meter or 0.1 inch
     */
    public static final int HEIGHT_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_001METER_OR_0_1INCH = 0b00000000_00000001_10000000_00000000;

    /**
     * Body Composition Feature
     */
    private final byte[] mBodyCompositionFeature;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public BodyCompositionFeature(@NonNull byte[] values) {
        mBodyCompositionFeature = Arrays.copyOfRange(values, 0, 4);
    }

    /**
     * Constructor from flags
     * 
     * @param isTimeStampSupported           {@code true}:{@link #TIME_STAMP_SUPPORTED_TRUE}, {@code false}:{@link #TIME_STAMP_SUPPORTED_FALSE}
     * @param isMultipleUsersSupported       {@code true}:{@link #MULTIPLE_USERS_SUPPORTED_TRUE}, {@code false}:{@link #MULTIPLE_USERS_SUPPORTED_FALSE}
     * @param isBasalMetabolismSupported     {@code true}:{@link #BASAL_METABOLISM_SUPPORTED_TRUE}, {@code false}:{@link #BASAL_METABOLISM_SUPPORTED_FALSE}
     * @param isMusclePercentageSupported    {@code true}:{@link #MUSCLE_PERCENTAGE_SUPPORTED_TRUE}, {@code false}:{@link #MUSCLE_PERCENTAGE_SUPPORTED_FALSE}
     * @param isMuscleMassSupported          {@code true}:{@link #MUSCLE_MASS_SUPPORTED_TRUE}, {@code false}:{@link #MUSCLE_MASS_SUPPORTED_FALSE}
     * @param isFatFreeMassSupported         {@code true}:{@link #FAT_FREE_MASS_SUPPORTED_TRUE}, {@code false}:{@link #FAT_FREE_MASS_SUPPORTED_FALSE}
     * @param isSoftLeanMassSupported        {@code true}:{@link #SOTT_LEAN_MASS_SUPPORTED_TRUE}, {@code false}:{@link #SOTT_LEAN_MASS_SUPPORTED_FALSE}
     * @param isBodyWaterMassSupported       {@code true}:{@link #BODY_WATER_MASS_SUPPORTED_TRUE}, {@code false}:{@link #BODY_WATER_MASS_SUPPORTED_FALSE}
     * @param isImpedanceSupported           {@code true}:{@link #IMPEDANCE_SUPPORTED_TRUE}, {@code false}:{@link #IMPEDANCE_SUPPORTED_FALSE}
     * @param isWeightSupported              {@code true}:{@link #WEIGHT_SUPPORTED_TRUE}, {@code false}:{@link #WEIGHT_SUPPORTED_FALSE}
     * @param isHeightSupported              {@code true}:{@link #HEIGHT_SUPPORTED_TRUE}, {@code false}:{@link #HEIGHT_SUPPORTED_FALSE}
     * @param massScaleMeasurementResolution one of {@link #MASS_MEASUREMENT_RESOLUTION_NOT_SPECIFIED}
     *                                        {@link #MASS_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_5KG_OR_1LB}
     *                                        {@link #MASS_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_2KG_OR_0_5LB}
     *                                        {@link #MASS_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_1KG_OR_0_2LB}
     *                                        {@link #MASS_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_05KG_OR_0_1B}
     *                                        {@link #MASS_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_02KG_OR_0_05B}
     *                                        {@link #MASS_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_01KG_OR_0_02B}
     *                                        {@link #MASS_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_005KG_OR_0_01B}
     * @param heightMeasurementResolution    one of {@link #HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED}
     *                                        {@link #HEIGHT_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_01_METER_OR_1INCH}
     *                                        {@link #HEIGHT_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_005METER_OR_0_5INCH}
     *                                        {@link #HEIGHT_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_001METER_OR_0_1INCH}
     */
    public BodyCompositionFeature(boolean isTimeStampSupported, boolean isMultipleUsersSupported, boolean isBasalMetabolismSupported, boolean isMusclePercentageSupported, boolean isMuscleMassSupported, boolean isFatFreeMassSupported, boolean isSoftLeanMassSupported, boolean isBodyWaterMassSupported, boolean isImpedanceSupported, boolean isWeightSupported, boolean isHeightSupported, int massScaleMeasurementResolution, int heightMeasurementResolution) {
        // @formatter:off
        int flags = (isTimeStampSupported ? TIME_STAMP_SUPPORTED_TRUE : TIME_STAMP_SUPPORTED_FALSE)
                | (isMultipleUsersSupported ? MULTIPLE_USERS_SUPPORTED_TRUE : MULTIPLE_USERS_SUPPORTED_FALSE)
                | (isBasalMetabolismSupported ? BASAL_METABOLISM_SUPPORTED_TRUE : BASAL_METABOLISM_SUPPORTED_FALSE)
                | (isMusclePercentageSupported ? MUSCLE_PERCENTAGE_SUPPORTED_TRUE : MUSCLE_PERCENTAGE_SUPPORTED_FALSE)
                | (isMuscleMassSupported ? MUSCLE_MASS_SUPPORTED_TRUE : MUSCLE_MASS_SUPPORTED_FALSE)
                | (isFatFreeMassSupported ? FAT_FREE_MASS_SUPPORTED_TRUE : FAT_FREE_MASS_SUPPORTED_FALSE)
                | (isSoftLeanMassSupported ? SOTT_LEAN_MASS_SUPPORTED_TRUE : SOTT_LEAN_MASS_SUPPORTED_FALSE)
                | (isBodyWaterMassSupported ? BODY_WATER_MASS_SUPPORTED_TRUE : BODY_WATER_MASS_SUPPORTED_FALSE)
                | (isImpedanceSupported ? IMPEDANCE_SUPPORTED_TRUE : IMPEDANCE_SUPPORTED_FALSE)
                | (isWeightSupported ? WEIGHT_SUPPORTED_TRUE : WEIGHT_SUPPORTED_FALSE)
                | (isHeightSupported ? HEIGHT_SUPPORTED_TRUE : HEIGHT_SUPPORTED_FALSE)
                | massScaleMeasurementResolution
                | heightMeasurementResolution;
        // @formatter:on
        mBodyCompositionFeature = new byte[] { (byte) flags, (byte) (flags >> 8), (byte) (flags >> 16), (byte) (flags >> 24) };
    }

    /**
     * @return Body Composition Feature
     */
    public byte[] getBodyCompositionFeature() {
        return mBodyCompositionFeature;
    }

    /**
     * @return {@code true}:Time Stamp Supported, {@code false}:Time Stamp not Supported
     */
    public boolean isTimeStampSupported() {
        return isFeatureMatched(TIME_STAMP_SUPPORTED_MASK, TIME_STAMP_SUPPORTED_TRUE);
    }

    /**
     * @return {@code true}:Time Stamp not Supported, {@code false}:Time Stamp Supported
     */
    public boolean isTimeStampNotSupported() {
        return isFeatureMatched(TIME_STAMP_SUPPORTED_MASK, TIME_STAMP_SUPPORTED_FALSE);
    }

    /**
     * @return {@code true}:Multiple Users Supported, {@code false}:Multiple Users not Supported
     */
    public boolean isMultipleUsersSupported() {
        return isFeatureMatched(MULTIPLE_USERS_SUPPORTED_MASK, MULTIPLE_USERS_SUPPORTED_TRUE);
    }

    /**
     * @return {@code true}:Multiple Users not Supported, {@code false}:Multiple Users Supported
     */
    public boolean isMultipleUsersNotSupported() {
        return isFeatureMatched(MULTIPLE_USERS_SUPPORTED_MASK, MULTIPLE_USERS_SUPPORTED_FALSE);
    }

    /**
     * @return {@code true}:Basal Metabolism Supported, {@code false}:Basal Metabolism not Supported
     */
    public boolean isBasalMetabolismSupported() {
        return isFeatureMatched(BASAL_METABOLISM_SUPPORTED_MASK, BASAL_METABOLISM_SUPPORTED_TRUE);
    }

    /**
     * @return {@code true}:Basal Metabolism not Supported, {@code false}:Basal Metabolism Supported
     */
    public boolean isBasalMetabolismNotSupported() {
        return isFeatureMatched(BASAL_METABOLISM_SUPPORTED_MASK, BASAL_METABOLISM_SUPPORTED_FALSE);
    }

    /**
     * @return {@code true}:Muscle Percentage Supported, {@code false}:Muscle Percentage not Supported
     */
    public boolean isMusclePercentageSupported() {
        return isFeatureMatched(MUSCLE_PERCENTAGE_SUPPORTED_MASK, MUSCLE_PERCENTAGE_SUPPORTED_TRUE);
    }

    /**
     * @return {@code true}:Muscle Percentage not Supported, {@code false}:Muscle Percentage Supported
     */
    public boolean isMusclePercentageNotSupported() {
        return isFeatureMatched(MUSCLE_PERCENTAGE_SUPPORTED_MASK, MUSCLE_PERCENTAGE_SUPPORTED_FALSE);
    }

    /**
     * @return {@code true}:Muscle Mass Supported, {@code false}:Muscle Mass not Supported
     */
    public boolean isMuscleMassSupported() {
        return isFeatureMatched(MUSCLE_MASS_SUPPORTED_MASK, MUSCLE_MASS_SUPPORTED_TRUE);
    }

    /**
     * @return {@code true}:Muscle Mass not Supported, {@code false}:Muscle Mass Supported
     */
    public boolean isMuscleMassNotSupported() {
        return isFeatureMatched(MUSCLE_MASS_SUPPORTED_MASK, MUSCLE_MASS_SUPPORTED_FALSE);
    }

    /**
     * @return {@code true}:Fat Free Mass Supported, {@code false}:Fat Free Mass not Supported
     */
    public boolean isFatFreeMassSupported() {
        return isFeatureMatched(FAT_FREE_MASS_SUPPORTED_MASK, FAT_FREE_MASS_SUPPORTED_TRUE);
    }

    /**
     * @return {@code true}:Fat Free Mass not Supported, {@code false}:Fat Free Mass Supported
     */
    public boolean isFatFreeMassNotSupported() {
        return isFeatureMatched(FAT_FREE_MASS_SUPPORTED_MASK, FAT_FREE_MASS_SUPPORTED_FALSE);
    }

    /**
     * @return {@code true}:Soft Lean Mass Supported, {@code false}:Soft Lean Mass not Supported
     */
    public boolean isSoftLeanMassSupported() {
        return isFeatureMatched(SOTT_LEAN_MASS_SUPPORTED_MASK, SOTT_LEAN_MASS_SUPPORTED_TRUE);
    }

    /**
     * @return {@code true}:Soft Lean Mass not Supported, {@code false}:Soft Lean Mass Supported
     */
    public boolean isSoftLeanMassNotSupported() {
        return isFeatureMatched(SOTT_LEAN_MASS_SUPPORTED_MASK, SOTT_LEAN_MASS_SUPPORTED_FALSE);
    }

    /**
     * @return {@code true}:Body Water Mass Supported, {@code false}:Body Water Mass not Supported
     */
    public boolean isBodyWaterMassSupported() {
        return isFeatureMatched(BODY_WATER_MASS_SUPPORTED_MASK, BODY_WATER_MASS_SUPPORTED_TRUE);
    }

    /**
     * @return {@code true}:Body Water Mass not Supported, {@code false}:Body Water Mass Supported
     */
    public boolean isBodyWaterMassNotSupported() {
        return isFeatureMatched(BODY_WATER_MASS_SUPPORTED_MASK, BODY_WATER_MASS_SUPPORTED_FALSE);
    }

    /**
     * @return {@code true}:Impedance Supported, {@code false}:Impedance not Supported
     */
    public boolean isImpedanceSupported() {
        return isFeatureMatched(IMPEDANCE_SUPPORTED_MASK, IMPEDANCE_SUPPORTED_TRUE);
    }

    /**
     * @return {@code true}:Impedance not Supported, {@code false}:Impedance Supported
     */
    public boolean isImpedanceNotSupported() {
        return isFeatureMatched(IMPEDANCE_SUPPORTED_MASK, IMPEDANCE_SUPPORTED_FALSE);
    }

    /**
     * @return {@code true}:Weight Supported, {@code false}:Weight not Supported
     */
    public boolean isWeightSupported() {
        return isFeatureMatched(WEIGHT_SUPPORTED_MASK, WEIGHT_SUPPORTED_TRUE);
    }

    /**
     * @return {@code true}:Weight not Supported, {@code false}:Weight Supported
     */
    public boolean isWeightNotSupported() {
        return isFeatureMatched(WEIGHT_SUPPORTED_MASK, WEIGHT_SUPPORTED_FALSE);
    }

    /**
     * @return {@code true}:Height Supported, {@code false}:Height not Supported
     */
    public boolean isHeightSupported() {
        return isFeatureMatched(HEIGHT_SUPPORTED_MASK, HEIGHT_SUPPORTED_TRUE);
    }

    /**
     * @return {@code true}:Height not Supported, {@code false}:Height Supported
     */
    public boolean isHeightNotSupported() {
        return isFeatureMatched(HEIGHT_SUPPORTED_MASK, HEIGHT_SUPPORTED_FALSE);
    }

    /**
     * @return {@code true}:Mass Measurement Resolution Not Specified, {@code false}:Mass Measurement Resolution Specified
     */
    public boolean isMassScaleMeasurementResolutionNotSpecified() {
        return isFeatureMatched(MASS_MEASUREMENT_RESOLUTION_MASK, MASS_MEASUREMENT_RESOLUTION_NOT_SPECIFIED);
    }

    /**
     * @return {@code true}:Mass Measurement Resolution is 0.5 kg or 1 lb, {@code false}:Mass Measurement Resolution is not 0.5 kg or 1 lb
     */
    public boolean isMassScaleMeasurementResolution1() {
        return isFeatureMatched(MASS_MEASUREMENT_RESOLUTION_MASK, MASS_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_5KG_OR_1LB);
    }

    /**
     * @return {@code true}:Mass Measurement Resolution is 0.2 kg or 0.5 lb, {@code false}:Mass Measurement Resolution is not 0.2 kg or 0.5 lb
     */
    public boolean isMassScaleMeasurementResolution2() {
        return isFeatureMatched(MASS_MEASUREMENT_RESOLUTION_MASK, MASS_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_2KG_OR_0_5LB);
    }

    /**
     * @return {@code true}:Mass Measurement Resolution is 0.1 kg or 0.2 lb, {@code false}:Mass Measurement Resolution is not 0.1 kg or 0.2 lb
     */
    public boolean isMassScaleMeasurementResolution3() {
        return isFeatureMatched(MASS_MEASUREMENT_RESOLUTION_MASK, MASS_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_1KG_OR_0_2LB);
    }

    /**
     * @return {@code true}:Mass Measurement Resolution is 0.05 kg or 0.1 lb, {@code false}:Mass Measurement Resolution is not 0.05 kg or 0.1 lb
     */
    public boolean isMassScaleMeasurementResolution4() {
        return isFeatureMatched(MASS_MEASUREMENT_RESOLUTION_MASK, MASS_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_05KG_OR_0_1B);
    }

    /**
     * @return {@code true}:Mass Measurement Resolution is 0.02 kg or 0.05 lb, {@code false}:Mass Measurement Resolution is not 0.02 kg or 0.05 lb
     */
    public boolean isMassScaleMeasurementResolution5() {
        return isFeatureMatched(MASS_MEASUREMENT_RESOLUTION_MASK, MASS_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_02KG_OR_0_05B);
    }

    /**
     * @return {@code true}:Mass Measurement Resolution is 0.01 kg or 0.02 lb, {@code false}:Mass Measurement Resolution is not 0.01 kg or 0.02 lb
     */
    public boolean isMassScaleMeasurementResolution6() {
        return isFeatureMatched(MASS_MEASUREMENT_RESOLUTION_MASK, MASS_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_01KG_OR_0_02B);
    }

    /**
     * @return {@code true}:Weight Measurement Resolution is 0.005 kg or 0.01 lb, {@code false}:Weight Measurement Resolution is not 0.005 kg or 0.01 lb
     */
    public boolean isMassScaleMeasurementResolution7() {
        return isFeatureMatched(MASS_MEASUREMENT_RESOLUTION_MASK, MASS_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_005KG_OR_0_01B);
    }

    /**
     * @return {@code true}:Height Resolution Not Specified, {@code false}:Height Resolution Specified
     */
    public boolean isHeightMeasurementResolutionNotSpecified() {
        return isFeatureMatched(HEIGHT_MEASUREMENT_RESOLUTION_MASK, HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED);
    }

    /**
     * @return {@code true}:Height Resolution is 0.01 meter or 1 inch, {@code false}:Height Resolution is not 0.01 meter or 1 inch
     */
    public boolean isHeightMeasurementResolution1() {
        return isFeatureMatched(HEIGHT_MEASUREMENT_RESOLUTION_MASK, HEIGHT_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_01_METER_OR_1INCH);
    }

    /**
     * @return {@code true}:Height Resolution is 0.005 meter or 0.5 inch, {@code false}:Height Resolution is not 0.005 meter or 0.5 inch
     */
    public boolean isHeightMeasurementResolution2() {
        return isFeatureMatched(HEIGHT_MEASUREMENT_RESOLUTION_MASK, HEIGHT_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_005METER_OR_0_5INCH);
    }

    /**
     * @return {@code true}:Height Resolution is 0.001 meter or 0.1 inch, {@code false}:Height Resolution is not 0.001 meter or 0.1 inch
     */
    public boolean isHeightMeasurementResolution3() {
        return isFeatureMatched(HEIGHT_MEASUREMENT_RESOLUTION_MASK, HEIGHT_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_001METER_OR_0_1INCH);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[4];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put(mBodyCompositionFeature);
        return data;
    }

    /**
     * check Body Composition Feature
     *
     * @param mask   bitmask for expect
     * @param expect one of {@link #TIME_STAMP_SUPPORTED_FALSE}
     *               , {@link #TIME_STAMP_SUPPORTED_TRUE}
     *               , {@link #MULTIPLE_USERS_SUPPORTED_FALSE}
     *               , {@link #MULTIPLE_USERS_SUPPORTED_TRUE}
     *               , {@link #BASAL_METABOLISM_SUPPORTED_FALSE}
     *               , {@link #BASAL_METABOLISM_SUPPORTED_TRUE}
     *               , {@link #MUSCLE_PERCENTAGE_SUPPORTED_FALSE}
     *               , {@link #MUSCLE_PERCENTAGE_SUPPORTED_TRUE}
     *               , {@link #MUSCLE_MASS_SUPPORTED_FALSE}
     *               , {@link #MUSCLE_MASS_SUPPORTED_TRUE}
     *               , {@link #FAT_FREE_MASS_SUPPORTED_FALSE}
     *               , {@link #FAT_FREE_MASS_SUPPORTED_TRUE}
     *               , {@link #SOTT_LEAN_MASS_SUPPORTED_FALSE}
     *               , {@link #SOTT_LEAN_MASS_SUPPORTED_TRUE}
     *               , {@link #BODY_WATER_MASS_SUPPORTED_FALSE}
     *               , {@link #BODY_WATER_MASS_SUPPORTED_TRUE}
     *               , {@link #IMPEDANCE_SUPPORTED_FALSE}
     *               , {@link #IMPEDANCE_SUPPORTED_TRUE}
     *               , {@link #WEIGHT_SUPPORTED_FALSE}
     *               , {@link #WEIGHT_SUPPORTED_TRUE}
     *               , {@link #HEIGHT_SUPPORTED_FALSE}
     *               , {@link #HEIGHT_SUPPORTED_TRUE}
     *               , {@link #MASS_MEASUREMENT_RESOLUTION_NOT_SPECIFIED}
     *               , {@link #MASS_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_5KG_OR_1LB}
     *               , {@link #MASS_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_2KG_OR_0_5LB}
     *               , {@link #MASS_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_1KG_OR_0_2LB}
     *               , {@link #MASS_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_05KG_OR_0_1B}
     *               , {@link #MASS_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_02KG_OR_0_05B}
     *               , {@link #MASS_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_01KG_OR_0_02B}
     *               , {@link #MASS_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_005KG_OR_0_01B}
     *               , {@link #HEIGHT_MEASUREMENT_RESOLUTION_NOT_SPECIFIED}
     *               , {@link #HEIGHT_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_01_METER_OR_1INCH}
     *               , {@link #HEIGHT_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_005METER_OR_0_5INCH}
     *               , {@link #HEIGHT_MEASUREMENT_RESOLUTION_RESOLUTION_OF_0_001METER_OR_0_1INCH}
     * @return {@code true}:same as expect, {@code false}:not match
     */
    private boolean isFeatureMatched(int mask, int expect) {
        return (mask & BLEUtils.createSInt32(mBodyCompositionFeature, 0)) == expect;
    }

}
