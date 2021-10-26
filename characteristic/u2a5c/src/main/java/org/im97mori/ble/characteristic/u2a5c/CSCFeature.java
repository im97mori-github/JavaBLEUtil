package org.im97mori.ble.characteristic.u2a5c;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * CSC Feature (Characteristics UUID: 0x2A5C)
 */
public class CSCFeature implements ByteArrayInterface {

    /**
     * @see #CSC_FEATURE_WHEEL_REVOLUTION_DATA_SUPPORTED_FALSE
     * @see #CSC_FEATURE_WHEEL_REVOLUTION_DATA_SUPPORTED_TRUE
     */
    public static final int CSC_FEATURE_WHEEL_REVOLUTION_DATA_SUPPORTED_MASK = 0b00000000_00000001;

    /**
     * 0: Wheel Revolution Data Supported False
     */
    public static final int CSC_FEATURE_WHEEL_REVOLUTION_DATA_SUPPORTED_FALSE = 0b00000000_00000000;

    /**
     * 1: Wheel Revolution Data Supported True
     */
    public static final int CSC_FEATURE_WHEEL_REVOLUTION_DATA_SUPPORTED_TRUE = 0b00000000_00000001;

    /**
     * @see #CSC_FEATURE_CRANK_REVOLUTION_DATA_SUPPORTED_FALSE
     * @see #CSC_FEATURE_CRANK_REVOLUTION_DATA_SUPPORTED_TRUE
     */
    public static final int CSC_FEATURE_CRANK_REVOLUTION_DATA_SUPPORTED_MASK = 0b00000000_00000010;

    /**
     * 0: Crank Revolution Data Supported False
     */
    public static final int CSC_FEATURE_CRANK_REVOLUTION_DATA_SUPPORTED_FALSE = 0b00000000_00000000;

    /**
     * 1: Crank Revolution Data Supported True
     */
    public static final int CSC_FEATURE_CRANK_REVOLUTION_DATA_SUPPORTED_TRUE = 0b00000000_00000010;

    /**
     * @see #CSC_FEATURE_MULTIPLE_SENSOR_LOCATIONS_SUPPORTED_FALSE
     * @see #CSC_FEATURE_MULTIPLE_SENSOR_LOCATIONS_SUPPORTED_TRUE
     */
    public static final int CSC_FEATURE_MULTIPLE_SENSOR_LOCATIONS_SUPPORTED_MASK = 0b00000000_00000100;

    /**
     * 0: Multiple Sensor Locations Supported False
     */
    public static final int CSC_FEATURE_MULTIPLE_SENSOR_LOCATIONS_SUPPORTED_FALSE = 0b00000000_00000000;

    /**
     * 1: Multiple Sensor Locations Supported True
     */
    public static final int CSC_FEATURE_MULTIPLE_SENSOR_LOCATIONS_SUPPORTED_TRUE = 0b00000000_00000100;

    /**
     * CSC Feature
     */
    private final byte[] mCscFeature;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public CSCFeature(@NonNull byte[] values) {
        mCscFeature = Arrays.copyOfRange(values, 0, 2);
    }

    /**
     * @return CSC Feature
     */
    public byte[] getCscFeature() {
        return mCscFeature;
    }

    /**
     * @return {@code true}:Wheel Revolution Data not Supported, {@code false}:Wheel Revolution Data Supported
     */
    public boolean isCscFeatureWheelRevolutionDataNotSupported() {
        return isFeatureMatched(CSC_FEATURE_WHEEL_REVOLUTION_DATA_SUPPORTED_MASK, CSC_FEATURE_WHEEL_REVOLUTION_DATA_SUPPORTED_FALSE);
    }

    /**
     * @return {@code true}:Wheel Revolution Data Supported, {@code false}:Wheel Revolution Data not Supported
     */
    public boolean isCscFeatureWheelRevolutionDataSupported() {
        return isFeatureMatched(CSC_FEATURE_WHEEL_REVOLUTION_DATA_SUPPORTED_MASK, CSC_FEATURE_WHEEL_REVOLUTION_DATA_SUPPORTED_TRUE);
    }

    /**
     * @return {@code true}:Crank Revolution Data not Supported, {@code false}:Crank Revolution Data Supported
     */
    public boolean isCscFeatureCrankRevolutionDataSupportedNotSupported() {
        return isFeatureMatched(CSC_FEATURE_CRANK_REVOLUTION_DATA_SUPPORTED_MASK, CSC_FEATURE_CRANK_REVOLUTION_DATA_SUPPORTED_FALSE);
    }

    /**
     * @return {@code true}:Crank Revolution Data Supported, {@code false}:Crank Revolution Data not Supported
     */
    public boolean isCscFeatureCrankRevolutionDataSupportedSupported() {
        return isFeatureMatched(CSC_FEATURE_CRANK_REVOLUTION_DATA_SUPPORTED_MASK, CSC_FEATURE_CRANK_REVOLUTION_DATA_SUPPORTED_TRUE);
    }

    /**
     * @return {@code true}:Multiple Sensor Locations not Supported, {@code false}:Multiple Sensor Locations Supported
     */
    public boolean isCscFeatureMultipleSensorLocationsSupportedNotSupported() {
        return isFeatureMatched(CSC_FEATURE_MULTIPLE_SENSOR_LOCATIONS_SUPPORTED_MASK, CSC_FEATURE_MULTIPLE_SENSOR_LOCATIONS_SUPPORTED_FALSE);
    }

    /**
     * @return {@code true}:Multiple Sensor Locations Supported, {@code false}:Multiple Sensor Locations not Supported
     */
    public boolean isCscFeatureMultipleSensorLocationsSupportedSupported() {
        return isFeatureMatched(CSC_FEATURE_MULTIPLE_SENSOR_LOCATIONS_SUPPORTED_MASK, CSC_FEATURE_MULTIPLE_SENSOR_LOCATIONS_SUPPORTED_TRUE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put(mCscFeature);
        return data;
    }

    /**
     * check CSC Feature
     *
     * @param mask   bitmask for expect
     * @param expect one of {@link #CSC_FEATURE_WHEEL_REVOLUTION_DATA_SUPPORTED_FALSE}
     *               , {@link #CSC_FEATURE_WHEEL_REVOLUTION_DATA_SUPPORTED_TRUE}
     *               , {@link #CSC_FEATURE_CRANK_REVOLUTION_DATA_SUPPORTED_FALSE}
     *               , {@link #CSC_FEATURE_CRANK_REVOLUTION_DATA_SUPPORTED_TRUE}
     *               , {@link #CSC_FEATURE_MULTIPLE_SENSOR_LOCATIONS_SUPPORTED_FALSE}
     *               , {@link #CSC_FEATURE_MULTIPLE_SENSOR_LOCATIONS_SUPPORTED_TRUE}
     * @return {@code true}:same as expect, {@code false}:not match
     */
    private boolean isFeatureMatched(int mask, int expect) {
        return (mask & BLEUtils.createSInt16(mCscFeature, 0)) == expect;
    }

}
