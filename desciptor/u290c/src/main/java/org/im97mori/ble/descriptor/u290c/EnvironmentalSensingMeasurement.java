package org.im97mori.ble.descriptor.u290c;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Environmental Sensing Measurement (Descriptor UUID: 0x290C)
 */
public class EnvironmentalSensingMeasurement implements ByteArrayInterface {

    /**
     * Sampling Function:Unspecified
     */
    public static final int SAMPLING_FUNCTION_UNSPECIFIED = 0x00;

    /**
     * Sampling Function:Instantaneous
     */
    public static final int SAMPLING_FUNCTION_INSTANTANEOUS = 0x01;

    /**
     * Sampling Function:Arithmetic Mean
     */
    public static final int SAMPLING_FUNCTION_ARITHMETIC_MEAN = 0x02;

    /**
     * Sampling Function:RMS
     */
    public static final int SAMPLING_FUNCTION_RMS = 0x03;

    /**
     * Sampling Function:Maximum
     */
    public static final int SAMPLING_FUNCTION_MAXIMUM = 0x04;

    /**
     * Sampling Function:Minimum
     */
    public static final int SAMPLING_FUNCTION_MINIMUM = 0x05;

    /**
     * Sampling Function:Accumulated
     */
    public static final int SAMPLING_FUNCTION_ACCUMULATED = 0x06;

    /**
     * Sampling Function:Count
     */
    public static final int SAMPLING_FUNCTION_COUNT = 0x07;

    /**
     * Measurement Period:Not in use
     */
    public static final int MEASUREMENT_PERIOD_NOT_IN_USE = 0x00;

    /**
     * Internal Update Interval:Not in use
     */
    public static final int INTERNAL_UPDATE_INTERVAL_NOT_IN_USE = 0x00;

    /**
     * Application:Unspecified
     */
    public static final int APPLICATION_UNSPECIFIED = 0x00;

    /**
     * Application:Air
     */
    public static final int APPLICATION_AIR = 0x01;

    /**
     * Application:Water
     */
    public static final int APPLICATION_WATER = 0x02;

    /**
     * Application:Barometric
     */
    public static final int APPLICATION_BAROMETRIC = 0x03;

    /**
     * Application:Soil
     */
    public static final int APPLICATION_SOIL = 0x04;

    /**
     * Application:Infrared
     */
    public static final int APPLICATION_INFRARED = 0x05;

    /**
     * Application:Map Database
     */
    public static final int APPLICATION_MAP_DATABASE = 0x06;

    /**
     * Application:Barometric Elevation Source
     */
    public static final int APPLICATION_BAROMETRIC_ELEVATION_SOURCE = 0x07;

    /**
     * Application:GPS only Elevation Source
     */
    public static final int APPLICATION_GPS_ONLY_ELEVATION_SOURCE = 0x08;

    /**
     * Application:GPS and Map database Elevation Source
     */
    public static final int APPLICATION_GPS_AND_MAP_DATABASE_ELEVATION_SOURCE = 0x09;

    /**
     * Application:Vertical datum Elevation Source
     */
    public static final int APPLICATION_VERTICAL_DATUM_ELEVATION_SOURCE = 0x0a;

    /**
     * Application:Onshore
     */
    public static final int APPLICATION_ONSHORE = 0x0b;

    /**
     * Application:Onboard vessel or vehicle
     */
    public static final int APPLICATION_ONBOARD_VESSEL_OR_VEHICLE = 0x0c;

    /**
     * Application:Front
     */
    public static final int APPLICATION_FRONT = 0x0d;

    /**
     * Application:Back/Rear
     */
    public static final int APPLICATION_BACK_REAR = 0x0e;

    /**
     * Application:Upper
     */
    public static final int APPLICATION_UPPER = 0x0f;

    /**
     * Application:Lower
     */
    public static final int APPLICATION_LOWER = 0x10;

    /**
     * Application:Primary
     */
    public static final int APPLICATION_PRIMARY = 0x11;

    /**
     * Application:Secondary
     */
    public static final int APPLICATION_SECONDARY = 0x12;

    /**
     * Application:Outdoor
     */
    public static final int APPLICATION_OUTDOOR = 0x13;

    /**
     * Application:Indoor
     */
    public static final int APPLICATION_INDOOR = 0x14;

    /**
     * Application:Top
     */
    public static final int APPLICATION_TOP = 0x15;

    /**
     * Application:Bottom
     */
    public static final int APPLICATION_BOTTOM = 0x16;

    /**
     * Application:Main
     */
    public static final int APPLICATION_MAIN = 0x17;

    /**
     * Application:Backup
     */
    public static final int APPLICATION_BACKUP = 0x18;

    /**
     * Application:Auxiliary
     */
    public static final int APPLICATION_AUXILIARY = 0x19;

    /**
     * Application:Supplementary
     */
    public static final int APPLICATION_SUPPLEMENTARY = 0x1a;

    /**
     * Application:Inside
     */
    public static final int APPLICATION_INSIDE = 0x1b;

    /**
     * Application:Outside
     */
    public static final int APPLICATION_OUTSIDE = 0x1c;

    /**
     * Application:Left
     */
    public static final int APPLICATION_LEFT = 0x1d;

    /**
     * Application:Right
     */
    public static final int APPLICATION_RIGHT = 0x1e;

    /**
     * Application:Internal
     */
    public static final int APPLICATION_INTERNAL = 0x1f;

    /**
     * Application:External
     */
    public static final int APPLICATION_EXTERNAL = 0x20;

    /**
     * Application:Solar
     */
    public static final int APPLICATION_SOLAR = 0x21;

    /**
     * Measurement Uncertainty:nformation not available
     */
    public static final int MEASUREMENT_UNCERTAINTY_INFORMATION_NOT_AVAILABLE = 0xff;

    /**
     * Flags
     */
    private final byte[] mFlags;

    /**
     * Sampling Function
     */
    private final int mSamplingFunction;

    /**
     * Measurement Period
     */
    private final int mMeasurementPeriod;

    /**
     * Internal Update Interval
     */
    private final int mInternalUpdateInterval;

    /**
     * Application
     */
    private final int mApplication;

    /**
     * Measurement Uncertainty
     */
    private final int mMeasurementUncertainty;

    /**
     * Constructor from {@link BluetoothGattDescriptor}
     *
     * @param bluetoothGattDescriptor Characteristics UUID: 0x290C
     */
    public EnvironmentalSensingMeasurement(@NonNull byte[] values) {
        mFlags = Arrays.copyOfRange(values, 0, 2);
        mSamplingFunction = (values[2] & 0xff);
        mMeasurementPeriod = (values[3] & 0xff) | ((values[4] & 0xff) << 8) | ((values[5] & 0xff) << 16);
        mInternalUpdateInterval = (values[6] & 0xff) | ((values[7] & 0xff) << 8) | ((values[8] & 0xff) << 16);
        mApplication = (values[9] & 0xff);
        mMeasurementUncertainty = (values[10] & 0xff);
    }

    /**
     * @return Flags
     */
    @NonNull
    public byte[] getFlags() {
        return mFlags;
    }

    /**
     * @return Sampling Function
     */
    public int getSamplingFunction() {
        return mSamplingFunction;
    }

    /**
     * @return {@code true}:sampling function is {@link #SAMPLING_FUNCTION_UNSPECIFIED}, {@code false}:not {@link #SAMPLING_FUNCTION_UNSPECIFIED}
     */
    public boolean isSamplingFunctionUnspecified() {
        return SAMPLING_FUNCTION_UNSPECIFIED == mSamplingFunction;
    }

    /**
     * @return {@code true}:sampling function is {@link #SAMPLING_FUNCTION_INSTANTANEOUS}, {@code false}:not {@link #SAMPLING_FUNCTION_INSTANTANEOUS}
     */
    public boolean isSamplingFunctionInstantaneous() {
        return SAMPLING_FUNCTION_INSTANTANEOUS == mSamplingFunction;
    }

    /**
     * @return {@code true}:sampling function is {@link #SAMPLING_FUNCTION_ARITHMETIC_MEAN}, {@code false}:not {@link #SAMPLING_FUNCTION_ARITHMETIC_MEAN}
     */
    public boolean isSamplingFunctionArithmeticMean() {
        return SAMPLING_FUNCTION_ARITHMETIC_MEAN == mSamplingFunction;
    }

    /**
     * @return {@code true}:sampling function is {@link #SAMPLING_FUNCTION_RMS}, {@code false}:not {@link #SAMPLING_FUNCTION_RMS}
     */
    public boolean isSamplingFunctionRms() {
        return SAMPLING_FUNCTION_RMS == mSamplingFunction;
    }

    /**
     * @return {@code true}:sampling function is {@link #SAMPLING_FUNCTION_MAXIMUM}, {@code false}:not {@link #SAMPLING_FUNCTION_MAXIMUM}
     */
    public boolean isSamplingFunctionMaximum() {
        return SAMPLING_FUNCTION_MAXIMUM == mSamplingFunction;
    }

    /**
     * @return {@code true}:sampling function is {@link #SAMPLING_FUNCTION_MINIMUM}, {@code false}:not {@link #SAMPLING_FUNCTION_MINIMUM}
     */
    public boolean isSamplingFunctionMinimum() {
        return SAMPLING_FUNCTION_MINIMUM == mSamplingFunction;
    }

    /**
     * @return {@code true}:sampling function is {@link #SAMPLING_FUNCTION_ACCUMULATED}, {@code false}:not {@link #SAMPLING_FUNCTION_ACCUMULATED}
     */
    public boolean isSamplingFunctionAccumulated() {
        return SAMPLING_FUNCTION_ACCUMULATED == mSamplingFunction;
    }

    /**
     * @return {@code true}:sampling function is {@link #SAMPLING_FUNCTION_COUNT}, {@code false}:not {@link #SAMPLING_FUNCTION_COUNT}
     */
    public boolean isSamplingFunctionCount() {
        return SAMPLING_FUNCTION_COUNT == mSamplingFunction;
    }

    /**
     * @return Measurement Period
     */
    public int getMeasurementPeriod() {
        return mMeasurementPeriod;
    }

    /**
     * @return {@code true}:measurement period is {@link #SAMPLING_FUNCTION_COUNT}, {@code false}:not {@link #SAMPLING_FUNCTION_COUNT}
     */
    public boolean isMeasurementPeriodNotInUse() {
        return MEASUREMENT_PERIOD_NOT_IN_USE == mMeasurementPeriod;
    }

    /**
     * @return Internal Update Interval
     */
    public int getInternalUpdateInterval() {
        return mInternalUpdateInterval;
    }

    /**
     * @return {@code true}:internal update interval is {@link #INTERNAL_UPDATE_INTERVAL_NOT_IN_USE}, {@code false}:not {@link #INTERNAL_UPDATE_INTERVAL_NOT_IN_USE}
     */
    public boolean isInternalUpdateIntervalNotInUse() {
        return INTERNAL_UPDATE_INTERVAL_NOT_IN_USE == mInternalUpdateInterval;
    }

    /**
     * @return Application
     */
    public int getApplication() {
        return mApplication;
    }

    /**
     * @return {@code true}:application is {@link #APPLICATION_UNSPECIFIED}, {@code false}:not {@link #APPLICATION_UNSPECIFIED}
     */
    public boolean isApplicationUnspecified() {
        return APPLICATION_UNSPECIFIED == mApplication;
    }

    /**
     * @return {@code true}:application is {@link #APPLICATION_AIR}, {@code false}:not {@link #APPLICATION_AIR}
     */
    public boolean isApplicationAir() {
        return APPLICATION_AIR == mApplication;
    }

    /**
     * @return {@code true}:application is {@link #APPLICATION_WATER}, {@code false}:not {@link #APPLICATION_WATER}
     */
    public boolean isApplicationWater() {
        return APPLICATION_WATER == mApplication;
    }

    /**
     * @return {@code true}:application is {@link #APPLICATION_BAROMETRIC}, {@code false}:not {@link #APPLICATION_BAROMETRIC}
     */
    public boolean isApplicationBarometric() {
        return APPLICATION_BAROMETRIC == mApplication;
    }

    /**
     * @return {@code true}:application is {@link #APPLICATION_SOIL}, {@code false}:not {@link #APPLICATION_SOIL}
     */
    public boolean isApplicationSoil() {
        return APPLICATION_SOIL == mApplication;
    }

    /**
     * @return {@code true}:application is {@link #APPLICATION_INFRARED}, {@code false}:not {@link #APPLICATION_INFRARED}
     */
    public boolean isApplicationInfrared() {
        return APPLICATION_INFRARED == mApplication;
    }

    /**
     * @return {@code true}:application is {@link #APPLICATION_MAP_DATABASE}, {@code false}:not {@link #APPLICATION_MAP_DATABASE}
     */
    public boolean isApplicationMapDatabase() {
        return APPLICATION_MAP_DATABASE == mApplication;
    }

    /**
     * @return {@code true}:application is {@link #APPLICATION_BAROMETRIC_ELEVATION_SOURCE}, {@code false}:not {@link #APPLICATION_BAROMETRIC_ELEVATION_SOURCE}
     */
    public boolean isApplicationBarometricElevationSource() {
        return APPLICATION_BAROMETRIC_ELEVATION_SOURCE == mApplication;
    }

    /**
     * @return {@code true}:application is {@link #APPLICATION_GPS_ONLY_ELEVATION_SOURCE}, {@code false}:not {@link #APPLICATION_GPS_ONLY_ELEVATION_SOURCE}
     */
    public boolean isApplicationGpsOnlyElevationSource() {
        return APPLICATION_GPS_ONLY_ELEVATION_SOURCE == mApplication;
    }

    /**
     * @return {@code true}:application is {@link #APPLICATION_GPS_AND_MAP_DATABASE_ELEVATION_SOURCE}, {@code false}:not {@link #APPLICATION_GPS_AND_MAP_DATABASE_ELEVATION_SOURCE}
     */
    public boolean isApplicationGpsAndMapDatabaseElevationSource() {
        return APPLICATION_GPS_AND_MAP_DATABASE_ELEVATION_SOURCE == mApplication;
    }

    /**
     * @return {@code true}:application is {@link #APPLICATION_VERTICAL_DATUM_ELEVATION_SOURCE}, {@code false}:not {@link #APPLICATION_VERTICAL_DATUM_ELEVATION_SOURCE}
     */
    public boolean isApplicationVerticalDatumElevationSource() {
        return APPLICATION_VERTICAL_DATUM_ELEVATION_SOURCE == mApplication;
    }

    /**
     * @return {@code true}:application is {@link #APPLICATION_ONSHORE}, {@code false}:not {@link #APPLICATION_ONSHORE}
     */
    public boolean isApplicationOnshore() {
        return APPLICATION_ONSHORE == mApplication;
    }

    /**
     * @return {@code true}:application is {@link #APPLICATION_ONBOARD_VESSEL_OR_VEHICLE}, {@code false}:not {@link #APPLICATION_ONBOARD_VESSEL_OR_VEHICLE}
     */
    public boolean isApplicationOnboardVesselOrVehicle() {
        return APPLICATION_ONBOARD_VESSEL_OR_VEHICLE == mApplication;
    }

    /**
     * @return {@code true}:application is {@link #APPLICATION_FRONT}, {@code false}:not {@link #APPLICATION_FRONT}
     */
    public boolean isApplicationFront() {
        return APPLICATION_FRONT == mApplication;
    }

    /**
     * @return {@code true}:application is {@link #APPLICATION_BACK_REAR}, {@code false}:not {@link #APPLICATION_BACK_REAR}
     */
    public boolean isApplicationBackRear() {
        return APPLICATION_BACK_REAR == mApplication;
    }

    /**
     * @return {@code true}:application is {@link #APPLICATION_UPPER}, {@code false}:not {@link #APPLICATION_UPPER}
     */
    public boolean isApplicationUpper() {
        return APPLICATION_UPPER == mApplication;
    }

    /**
     * @return {@code true}:application is {@link #APPLICATION_LOWER}, {@code false}:not {@link #APPLICATION_LOWER}
     */
    public boolean isApplicationLower() {
        return APPLICATION_LOWER == mApplication;
    }

    /**
     * @return {@code true}:application is {@link #APPLICATION_PRIMARY}, {@code false}:not {@link #APPLICATION_PRIMARY}
     */
    public boolean isApplicationPrimary() {
        return APPLICATION_PRIMARY == mApplication;
    }

    /**
     * @return {@code true}:application is {@link #APPLICATION_SECONDARY}, {@code false}:not {@link #APPLICATION_SECONDARY}
     */
    public boolean isApplicationSecondary() {
        return APPLICATION_SECONDARY == mApplication;
    }

    /**
     * @return {@code true}:application is {@link #APPLICATION_OUTDOOR}, {@code false}:not {@link #APPLICATION_OUTDOOR}
     */
    public boolean isApplicationOutdoor() {
        return APPLICATION_OUTDOOR == mApplication;
    }

    /**
     * @return {@code true}:application is {@link #APPLICATION_INDOOR}, {@code false}:not {@link #APPLICATION_INDOOR}
     */
    public boolean isApplicationIndoor() {
        return APPLICATION_INDOOR == mApplication;
    }

    /**
     * @return {@code true}:application is {@link #APPLICATION_TOP}, {@code false}:not {@link #APPLICATION_TOP}
     */
    public boolean isApplicationTop() {
        return APPLICATION_TOP == mApplication;
    }

    /**
     * @return {@code true}:application is {@link #APPLICATION_BOTTOM}, {@code false}:not {@link #APPLICATION_BOTTOM}
     */
    public boolean isApplicationBottom() {
        return APPLICATION_BOTTOM == mApplication;
    }

    /**
     * @return {@code true}:application is {@link #APPLICATION_MAIN}, {@code false}:not {@link #APPLICATION_MAIN}
     */
    public boolean isApplicationMain() {
        return APPLICATION_MAIN == mApplication;
    }

    /**
     * @return {@code true}:application is {@link #APPLICATION_BACKUP}, {@code false}:not {@link #APPLICATION_BACKUP}
     */
    public boolean isApplicationBackup() {
        return APPLICATION_BACKUP == mApplication;
    }

    /**
     * @return {@code true}:application is {@link #APPLICATION_AUXILIARY}, {@code false}:not {@link #APPLICATION_AUXILIARY}
     */
    public boolean isApplicationAuxiliary() {
        return APPLICATION_AUXILIARY == mApplication;
    }

    /**
     * @return {@code true}:application is {@link #APPLICATION_SUPPLEMENTARY}, {@code false}:not {@link #APPLICATION_SUPPLEMENTARY}
     */
    public boolean isApplicationSupplementary() {
        return APPLICATION_SUPPLEMENTARY == mApplication;
    }

    /**
     * @return {@code true}:application is {@link #APPLICATION_INSIDE}, {@code false}:not {@link #APPLICATION_INSIDE}
     */
    public boolean isApplicationInside() {
        return APPLICATION_INSIDE == mApplication;
    }

    /**
     * @return {@code true}:application is {@link #APPLICATION_OUTSIDE}, {@code false}:not {@link #APPLICATION_OUTSIDE}
     */
    public boolean isApplicationOutside() {
        return APPLICATION_OUTSIDE == mApplication;
    }

    /**
     * @return {@code true}:application is {@link #APPLICATION_LEFT}, {@code false}:not {@link #APPLICATION_LEFT}
     */
    public boolean isApplicationLeft() {
        return APPLICATION_LEFT == mApplication;
    }

    /**
     * @return {@code true}:application is {@link #APPLICATION_RIGHT}, {@code false}:not {@link #APPLICATION_RIGHT}
     */
    public boolean isApplicationRight() {
        return APPLICATION_RIGHT == mApplication;
    }

    /**
     * @return {@code true}:application is {@link #APPLICATION_INTERNAL}, {@code false}:not {@link #APPLICATION_INTERNAL}
     */
    public boolean isApplicationInternal() {
        return APPLICATION_INTERNAL == mApplication;
    }

    /**
     * @return {@code true}:application is {@link #APPLICATION_EXTERNAL}, {@code false}:not {@link #APPLICATION_EXTERNAL}
     */
    public boolean isApplicationExternal() {
        return APPLICATION_EXTERNAL == mApplication;
    }

    /**
     * @return {@code true}:application is {@link #APPLICATION_SOLAR}, {@code false}:not {@link #APPLICATION_SOLAR}
     */
    public boolean isApplicationSolar() {
        return APPLICATION_SOLAR == mApplication;
    }

    /**
     * @return Measurement Uncertainty
     */
    public int getMeasurementUncertainty() {
        return mMeasurementUncertainty;
    }

    /**
     * @return {@code true}:measurement uncertainty is {@link #MEASUREMENT_UNCERTAINTY_INFORMATION_NOT_AVAILABLE}, {@code false}:not {@link #MEASUREMENT_UNCERTAINTY_INFORMATION_NOT_AVAILABLE}
     */
    public boolean isMeasurementUncertaintyInformationNotAvailable() {
        return MEASUREMENT_UNCERTAINTY_INFORMATION_NOT_AVAILABLE == mMeasurementUncertainty;
    }

    /**
     * {@inheritDoc}
     */
    @NonNull
    @Override
    public byte[] getBytes() {
        byte[] data = new byte[11];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put(mFlags);
        byteBuffer.put((byte) mSamplingFunction);
        byteBuffer.put((byte) mMeasurementPeriod);
        byteBuffer.put((byte) (mMeasurementPeriod >> 8));
        byteBuffer.put((byte) (mMeasurementPeriod >> 16));
        byteBuffer.put((byte) mInternalUpdateInterval);
        byteBuffer.put((byte) (mInternalUpdateInterval >> 8));
        byteBuffer.put((byte) (mInternalUpdateInterval >> 16));
        byteBuffer.put((byte) mApplication);
        byteBuffer.put((byte) mMeasurementUncertainty);
        return data;
    }

}
