package org.im97mori.ble.characteristic.u2a37;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Heart Rate Measurement (Characteristics UUID: 0x2A37)
 */
public class HeartRateMeasurement implements ByteArrayInterface {

    /**
     * @see #FLAGS_HEART_RATE_VALUE_FORMAT_UINT8
     * @see #FLAGS_HEART_RATE_VALUE_FORMAT_UINT16
     */
    public static final int FLAGS_HEART_RATE_VALUE_FORMAT_MASK = 0b00000001;

    /**
     * 0: Heart Rate Value Format is set to UINT8. Units: beats per minute (bpm)
     */
    public static final int FLAGS_HEART_RATE_VALUE_FORMAT_UINT8 = 0b00000000;

    /**
     * 1: Heart Rate Value Format is set to UINT16. Units: beats per minute (bpm)
     */
    public static final int FLAGS_HEART_RATE_VALUE_FORMAT_UINT16 = 0b00000001;

    /**
     * @see #FLAGS_SENSOR_CONTACT_STATUS_NOT_SUPPORTED_0
     * @see #FLAGS_SENSOR_CONTACT_STATUS_NOT_SUPPORTED_1
     * @see #FLAGS_SENSOR_CONTACT_STATUS_SUPPORTED_BUT_NOT_DETECTED
     * @see #FLAGS_SENSOR_CONTACT_STATUS_SUPPORTED_AND_DETECTED
     */
    public static final int FLAGS_SENSOR_CONTACT_STATUS_MASK = 0b00000110;

    /**
     * 0: Sensor Contact feature is not supported in the current connection
     */
    public static final int FLAGS_SENSOR_CONTACT_STATUS_NOT_SUPPORTED_0 = 0b00000000;

    /**
     * 1: Sensor Contact feature is not supported in the current connection
     */
    public static final int FLAGS_SENSOR_CONTACT_STATUS_NOT_SUPPORTED_1 = 0b00000010;

    /**
     * 2: Sensor Contact feature is supported, but contact is not detected
     */
    public static final int FLAGS_SENSOR_CONTACT_STATUS_SUPPORTED_BUT_NOT_DETECTED = 0b00000100;

    /**
     * 3: Sensor Contact feature is supported and contact is detected
     */
    public static final int FLAGS_SENSOR_CONTACT_STATUS_SUPPORTED_AND_DETECTED = 0b00000110;

    /**
     * @see #FLAGS_ENERGY_EXPENDED_STATUS_NOT_PRESENT
     * @see #FLAGS_ENERGY_EXPENDED_STATUS_PRESENT
     */
    public static final int FLAGS_ENERGY_EXPENDED_STATUS_MASK = 0b00001000;

    /**
     * 0: Energy Expended field is not present
     */
    public static final int FLAGS_ENERGY_EXPENDED_STATUS_NOT_PRESENT = 0b00000000;

    /**
     * 1: Energy Expended field is present. Units: kilo Joules
     */
    public static final int FLAGS_ENERGY_EXPENDED_STATUS_PRESENT = 0b00001000;

    /**
     * @see #FLAGS_RR_INTERVAL_NOT_PRESENT
     * @see #FLAGS_RR_INTERVAL_PRESENT
     */
    public static final int FLAGS_RR_INTERVAL_MASK = 0b00010000;

    /**
     * 0: RR-Interval values are not present.
     */
    public static final int FLAGS_RR_INTERVAL_NOT_PRESENT = 0b00000000;

    /**
     * 1: One or more RR-Interval values are present.
     */
    public static final int FLAGS_RR_INTERVAL_PRESENT = 0b00010000;

    /**
     * Flags
     */
    private final int mFlags;

    /**
     * Heart Rate Measurement Value (uint8)
     */
    private final int mHeartRateMeasurementValueUint8;

    /**
     * Heart Rate Measurement Value (uint16)
     */
    private final int mHeartRateMeasurementValueUint16;

    /**
     * Energy Expended
     */
    private final int mEnergyExpended;

    /**
     * RR-Interval
     */
    private final int[] mRrInterval;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public HeartRateMeasurement(@NonNull byte[] values) {
        int index = 0;
        mFlags = values[index++];
        if (isFlagsHeartRateValueFormatUint8()) {
            mHeartRateMeasurementValueUint8 = (values[index++] & 0xff);
            mHeartRateMeasurementValueUint16 = 0;
        } else {
            mHeartRateMeasurementValueUint8 = 0;
            mHeartRateMeasurementValueUint16 = BLEUtils.createUInt16(values, index);
            index += 2;
        }
        if (isFlagsEnergyExpendedStatusPresent()) {
            mEnergyExpended = BLEUtils.createUInt16(values, index);
            index += 2;
        } else {
            mEnergyExpended = 0;
        }
        if (isFlagsRrIntervalPresent()) {
            int count;
            if (isFlagsHeartRateValueFormatUint8()) {
                if (isFlagsEnergyExpendedStatusPresent()) {
                    count = 8;
                } else {
                    count = 9;
                }
            } else {
                if (isFlagsEnergyExpendedStatusPresent()) {
                    count = 7;
                } else {
                    count = 8;
                }
            }
            mRrInterval = new int[count];
            for (int i = 0; i < count; i++) {
                mRrInterval[i] = BLEUtils.createUInt16(values, index + i * 2);
            }
        } else {
            mRrInterval = new int[0];
        }
    }

    /**
     * Constructor from parameters
     * 
     * @param flags                           Flags
     * @param heartRateMeasurementValueUint8  Heart Rate Measurement Value (uint8)
     * @param heartRateMeasurementValueUint16 Heart Rate Measurement Value (uint16)
     * @param energyExpended                  Energy Expended
     * @param rrInterval                      RR-Interval
     */
    public HeartRateMeasurement(int flags, int heartRateMeasurementValueUint8, int heartRateMeasurementValueUint16, int energyExpended, @NonNull int[] rrInterval) {
        mFlags = flags;
        mHeartRateMeasurementValueUint8 = heartRateMeasurementValueUint8;
        mHeartRateMeasurementValueUint16 = heartRateMeasurementValueUint16;
        mEnergyExpended = energyExpended;
        mRrInterval = rrInterval;
    }

    /**
     * @return Flags
     */
    public int getFlags() {
        return mFlags;
    }

    /**
     * @return {@code true}:Heart Rate Value Format is set to UINT8. Units: beats per minute (bpm), {@code false}:Heart Rate Value Format is set to UINT16. Units: beats per minute (bpm)
     */
    public boolean isFlagsHeartRateValueFormatUint8() {
        return isFlagsMatched(FLAGS_HEART_RATE_VALUE_FORMAT_MASK, FLAGS_HEART_RATE_VALUE_FORMAT_UINT8);
    }

    /**
     * @return {@code true}:Heart Rate Value Format is set to UINT16. Units: beats per minute (bpm), {@code false}:Heart Rate Value Format is set to UINT8. Units: beats per minute (bpm)
     */
    public boolean isFlagsHeartRateValueFormatUint16() {
        return isFlagsMatched(FLAGS_HEART_RATE_VALUE_FORMAT_MASK, FLAGS_HEART_RATE_VALUE_FORMAT_UINT16);
    }

    /**
     * @return {@code true}:Sensor Contact feature is not supported in the current connection, {@code false}:noty Sensor Contact feature is not supported in the current connection
     */
    public boolean isFlagsSensorContactStatusNotSupported() {
        return isFlagsMatched(FLAGS_SENSOR_CONTACT_STATUS_MASK, FLAGS_SENSOR_CONTACT_STATUS_NOT_SUPPORTED_0)
                || isFlagsMatched(FLAGS_SENSOR_CONTACT_STATUS_MASK, FLAGS_SENSOR_CONTACT_STATUS_NOT_SUPPORTED_1);
    }

    /**
     * @return {@code true}:Sensor Contact feature is supported, but contact is not detected, {@code false}:Sensor Contact feature is supported and contact is detected
     */
    public boolean isFlagsSensorContactStatusSupportedButNotDetected() {
        return isFlagsMatched(FLAGS_SENSOR_CONTACT_STATUS_MASK, FLAGS_SENSOR_CONTACT_STATUS_SUPPORTED_BUT_NOT_DETECTED);
    }

    /**
     * @return {@code true}:Sensor Contact feature is supported and contact is detected, {@code false}:Sensor Contact feature is supported, but contact is not detected
     */
    public boolean isFlagsSensorContactStatusSupportedAndDetected() {
        return isFlagsMatched(FLAGS_SENSOR_CONTACT_STATUS_MASK, FLAGS_SENSOR_CONTACT_STATUS_SUPPORTED_AND_DETECTED);
    }

    /**
     * @return {@code true}:Energy Expended field is not present, {@code false}:Energy Expended field is present. Units: kilo Joules
     */
    public boolean isFlagsEnergyExpendedStatusNotPresent() {
        return isFlagsMatched(FLAGS_ENERGY_EXPENDED_STATUS_MASK, FLAGS_ENERGY_EXPENDED_STATUS_NOT_PRESENT);
    }

    /**
     * @return {@code true}:Energy Expended field is present. Units: kilo Joules, {@code false}:Energy Expended field is not present
     */
    public boolean isFlagsEnergyExpendedStatusPresent() {
        return isFlagsMatched(FLAGS_ENERGY_EXPENDED_STATUS_MASK, FLAGS_ENERGY_EXPENDED_STATUS_PRESENT);
    }

    /**
     * @return {@code true}:RR-Interval values are not present, {@code false}:One or more RR-Interval values are present
     */
    public boolean isFlagsRrIntervalNotPresent() {
        return isFlagsMatched(FLAGS_RR_INTERVAL_MASK, FLAGS_RR_INTERVAL_NOT_PRESENT);
    }

    /**
     * @return {@code true}:One or more RR-Interval values are present, {@code false}:RR-Interval values are not present
     */
    public boolean isFlagsRrIntervalPresent() {
        return isFlagsMatched(FLAGS_RR_INTERVAL_MASK, FLAGS_RR_INTERVAL_PRESENT);
    }

    /**
     * @return Heart Rate Measurement Value (uint8)
     */
    public int getHeartRateMeasurementValueUint8() {
        return mHeartRateMeasurementValueUint8;
    }

    /**
     * @return Heart Rate Measurement Value (uint16)
     */
    public int getHeartRateMeasurementValueUint16() {
        return mHeartRateMeasurementValueUint16;
    }

    /**
     * @return Energy Expended
     */
    public int getEnergyExpended() {
        return mEnergyExpended;
    }

    /**
     * @return RR-Interval
     */
    public int[] getRrInterval() {
        return mRrInterval;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        int length = 1;
        byte[] data = new byte[20];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mFlags);
        if (isFlagsHeartRateValueFormatUint8()) {
            byteBuffer.put((byte) mHeartRateMeasurementValueUint8);
            length++;
        } else {
            byteBuffer.putShort((short) mHeartRateMeasurementValueUint16);
            length += 2;
        }
        if (isFlagsEnergyExpendedStatusPresent()) {
            byteBuffer.putShort((short) mEnergyExpended);
            length += 2;
        }
        if (isFlagsRrIntervalPresent()) {
            for (int rrInterval : mRrInterval) {
                byteBuffer.putShort((short) rrInterval);
            }
            length += mRrInterval.length * 2;
        }
        return Arrays.copyOfRange(data, 0, length);
    }

    /**
     * check Flags
     *
     * @param mask   bitmask for expect
     * @param expect one of {@link #FLAGS_HEART_RATE_VALUE_FORMAT_UINT8} , {@link #FLAGS_HEART_RATE_VALUE_FORMAT_UINT16} , {@link #FLAGS_SENSOR_CONTACT_STATUS_NOT_SUPPORTED_0} , {@link #FLAGS_SENSOR_CONTACT_STATUS_NOT_SUPPORTED_1} , {@link #FLAGS_SENSOR_CONTACT_STATUS_SUPPORTED_BUT_NOT_DETECTED} , {@link #FLAGS_SENSOR_CONTACT_STATUS_SUPPORTED_AND_DETECTED} , {@link #FLAGS_ENERGY_EXPENDED_STATUS_NOT_PRESENT} , {@link #FLAGS_ENERGY_EXPENDED_STATUS_PRESENT} , {@link #FLAGS_RR_INTERVAL_NOT_PRESENT} , {@link #FLAGS_RR_INTERVAL_PRESENT}
     * @return {@code true}:same as expect, {@code false}:not match
     */
    private boolean isFlagsMatched(int mask, int expect) {
        return (mask & mFlags) == expect;
    }

}
