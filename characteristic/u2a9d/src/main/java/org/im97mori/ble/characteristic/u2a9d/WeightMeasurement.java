package org.im97mori.ble.characteristic.u2a9d;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Weight Measurement (Characteristics UUID: 0x2A9D)
 */
public class WeightMeasurement implements ByteArrayInterface {

    /**
     * @see #FLAG_MEASUREMENT_UNITS_SI
     * @see #FLAG_MEASUREMENT_UNITS_IMPERIAL
     */
    public static final int FLAG_MEASUREMENT_UNITS_MASK = 0b00000001;

    /**
     * 0: SI (Weight and Mass in units of kilogram (kg) and Height in units of meter)
     */
    public static final int FLAG_MEASUREMENT_UNITS_SI = 0b00000000;

    /**
     * 1: Imperial (Weight and Mass in units of pound (lb) and Height in units of inch (in))
     */
    public static final int FLAG_MEASUREMENT_UNITS_IMPERIAL = 0b00000001;

    /**
     * @see #FLAG_TIME_STAMP_PRESENT_FALSE
     * @see #FLAG_TIME_STAMP_PRESENT_TRUE
     */
    public static final int FLAG_TIME_STAMP_PRESENT_MASK = 0b00000010;

    /**
     * 0: Time stamp present False
     */
    public static final int FLAG_TIME_STAMP_PRESENT_FALSE = 0b00000000;

    /**
     * 1: Time stamp present True
     */
    public static final int FLAG_TIME_STAMP_PRESENT_TRUE = 0b00000010;

    /**
     * @see #FLAG_USER_ID_PRESENT_FALSE
     * @see #FLAG_USER_ID_PRESENT_TRUE
     */
    public static final int FLAG_USER_ID_PRESENT_MASK = 0b00000100;

    /**
     * 0: User ID present False
     */
    public static final int FLAG_USER_ID_PRESENT_FALSE = 0b00000000;

    /**
     * 1: User ID present True
     */
    public static final int FLAG_USER_ID_PRESENT_TRUE = 0b00000100;

    /**
     * @see #FLAG_BMI_AND_HEIGHT_PRESENT_FALSE
     * @see #FLAG_BMI_AND_HEIGHT_PRESENT_TRUE
     */
    public static final int FLAG_BMI_AND_HEIGHT_PRESENT_MASK = 0b00001000;

    /**
     * 0: BMI and Height present False
     */
    public static final int FLAG_BMI_AND_HEIGHT_PRESENT_FALSE = 0b00000000;

    /**
     * 1: BMI and Height present True
     */
    public static final int FLAG_BMI_AND_HEIGHT_PRESENT_TRUE = 0b00001000;

    /**
     * Weight - SI Unit 0.005 kilogram
     */
    public static final double WEIGHT_SI_RESOLUTION = 0.005d;

    /**
     * Weight - Imperial Unit 0.01 pounds
     */
    public static final double WEIGHT_IMPERIAL_RESOLUTION = 0.01d;

    /**
     * BMI Resolution Unit 0.1
     */
    public static final double BMI_RESOLUTION = 0.1d;

    /**
     * Height - SI Unit 0.001 meters
     */
    public static final double HEIGHT_SI_RESOLUTION = 0.001d;

    /**
     * Height - Imerial Unit 0.1 inches
     */
    public static final double HEIGHT_IMPERIAL_RESOLUTION = 0.1d;

    /**
     * Flags
     */
    private final int mFlags;

    /**
     * Weight - SI
     */
    private final int mWeightSi;

    /**
     * Weight - Imperial
     */
    private final int mWeightImperial;

    /**
     * Year
     */
    private final int mYear;

    /**
     * Month
     */
    private final int mMonth;

    /**
     * Day
     */
    private final int mDay;

    /**
     * Hours
     */
    private final int mHours;

    /**
     * Minutes
     */
    private final int mMinutes;

    /**
     * Seconds
     */
    private final int mSeconds;

    /**
     * User ID
     */
    private final int mUserId;

    /**
     * BMI
     */
    private final int mBmi;

    /**
     * Height - SI
     */
    private final int mHeightSi;

    /**
     * Height - Imperial
     */
    private final int mHeightImperial;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A9D
     */
    public WeightMeasurement(@NonNull byte[] values) {
        int index = 0;
        mFlags = values[index++];
        if (isFlagsMeasurementUnitSI()) {
            mWeightSi = BLEUtils.createUInt16(values, index);
            mWeightImperial = 0;
        } else {
            mWeightSi = 0;
            mWeightImperial = BLEUtils.createUInt16(values, index);
        }
        index += 2;
        if (isFlagsTimeStampPresent()) {
            mYear = BLEUtils.createUInt16(values, index);
            index += 2;
            mMonth = (values[index++] & 0xff);
            mDay = (values[index++] & 0xff);
            mHours = (values[index++] & 0xff);
            mMinutes = (values[index++] & 0xff);
            mSeconds = (values[index++] & 0xff);
        } else {
            mYear = 0;
            mMonth = 0;
            mDay = 0;
            mHours = 0;
            mMinutes = 0;
            mSeconds = 0;
        }
        if (isFlagsUserIdPresent()) {
            mUserId = (values[index++] & 0xff);
        } else {
            mUserId = 0;
        }
        if (isFlagsBmiAndHeightPresent()) {
            mBmi = BLEUtils.createUInt16(values, index);
            index += 2;
            if (isFlagsMeasurementUnitSI()) {
                mHeightSi = BLEUtils.createUInt16(values, index);
                mHeightImperial = 0;
            } else {
                mHeightSi = 0;
                mHeightImperial = BLEUtils.createUInt16(values, index);
            }
        } else {
            mBmi = 0;
            mHeightSi = 0;
            mHeightImperial = 0;
        }
    }

    /**
     * @return Flags
     */
    public int getFlags() {
        return mFlags;
    }

    /**
     * @return {@code true}:Weight Measurement Unit is SI, {@code false}:Weight Measurement Unit is not SI
     */
    public boolean isFlagsMeasurementUnitSI() {
        return isFlagsMatched(FLAG_MEASUREMENT_UNITS_MASK, FLAG_MEASUREMENT_UNITS_SI);
    }

    /**
     * @return {@code true}:Weight Measurement Unit is Imperial, {@code false}:Weight Measurement Unit is not Imperial
     */
    public boolean isFlagsMeasurementUnitImperial() {
        return isFlagsMatched(FLAG_MEASUREMENT_UNITS_MASK, FLAG_MEASUREMENT_UNITS_IMPERIAL);
    }

    /**
     * @return {@code true}:Time stamp not present, {@code false}:Time stamp present
     */
    public boolean isFlagsTimeStampNotPresent() {
        return isFlagsMatched(FLAG_TIME_STAMP_PRESENT_MASK, FLAG_TIME_STAMP_PRESENT_FALSE);
    }

    /**
     * @return {@code true}:Time stamp present, {@code false}:Time stamp not present
     */
    public boolean isFlagsTimeStampPresent() {
        return isFlagsMatched(FLAG_TIME_STAMP_PRESENT_MASK, FLAG_TIME_STAMP_PRESENT_TRUE);
    }

    /**
     * @return {@code true}:User ID not present, {@code false}:User ID present
     */
    public boolean isFlagsUserIdNotPresent() {
        return isFlagsMatched(FLAG_USER_ID_PRESENT_MASK, FLAG_USER_ID_PRESENT_FALSE);
    }

    /**
     * @return {@code true}:User ID present, {@code false}:User ID not present
     */
    public boolean isFlagsUserIdPresent() {
        return isFlagsMatched(FLAG_USER_ID_PRESENT_MASK, FLAG_USER_ID_PRESENT_TRUE);
    }

    /**
     * @return {@code true}:BMI and Height not present, {@code false}:BMI and Height present
     */
    public boolean isFlagsBmiAndHeightNotPresent() {
        return isFlagsMatched(FLAG_BMI_AND_HEIGHT_PRESENT_MASK, FLAG_BMI_AND_HEIGHT_PRESENT_FALSE);
    }

    /**
     * @return {@code true}:BMI and Height present, {@code false}:BMI and Height not present
     */
    public boolean isFlagsBmiAndHeightPresent() {
        return isFlagsMatched(FLAG_BMI_AND_HEIGHT_PRESENT_MASK, FLAG_BMI_AND_HEIGHT_PRESENT_TRUE);
    }

    /**
     * @return Weight - SI
     */
    public int getWeightSi() {
        return mWeightSi;
    }

    /**
     * @return Weight(kg)
     */
    public double getWeightSiKg() {
        return WEIGHT_SI_RESOLUTION * mWeightSi;
    }

    /**
     * @return Weight - Imperial
     */
    public int getWeightImperial() {
        return mWeightImperial;
    }

    /**
     * @return Weight(pounds)
     */
    public double getWeightImperialLb() {
        return WEIGHT_IMPERIAL_RESOLUTION * mWeightImperial;
    }

    /**
     * @return Year
     * @see org.im97mori.ble.characteristic.core.DateTimeUtils
     */
    public int getYear() {
        return mYear;
    }

    /**
     * @return Month
     * @see org.im97mori.ble.characteristic.core.DateTimeUtils
     */
    public int getMonth() {
        return mMonth;
    }

    /**
     * @return Day
     * @see org.im97mori.ble.characteristic.core.DateTimeUtils
     */
    public int getDay() {
        return mDay;
    }

    /**
     * @return Hours
     */
    public int getHours() {
        return mHours;
    }

    /**
     * @return Minutes
     */
    public int getMinutes() {
        return mMinutes;
    }

    /**
     * @return Seconds
     */
    public int getSeconds() {
        return mSeconds;
    }

    /**
     * @return User ID
     */
    public int getUserId() {
        return mUserId;
    }

    /**
     * @return BMI
     */
    public int getBmi() {
        return mBmi;
    }

    /**
     * @return BMI(with unit)
     */
    public double getBmiWithUnit() {
        return BMI_RESOLUTION * mBmi;
    }

    /**
     * @return Height - SI
     */
    public int getHeightSi() {
        return mHeightSi;
    }

    /**
     * @return Height(meters)
     */
    public double getHeightSiMeters() {
        return HEIGHT_SI_RESOLUTION * mHeightSi;
    }

    /**
     * @return Height - Imperial
     */
    public int getHeightImperial() {
        return mHeightImperial;
    }

    /**
     * @return Height(inches)
     */
    public double getHeightImperialInch() {
        return HEIGHT_IMPERIAL_RESOLUTION * mHeightImperial;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        int length = 0;
        byte[] data = new byte[15];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mFlags);
        length++;
        if (isFlagsMeasurementUnitSI()) {
            byteBuffer.putShort((short) mWeightSi);
        } else {
            byteBuffer.putShort((short) mWeightImperial);
        }
        length += 2;
        if (isFlagsTimeStampPresent()) {
            byteBuffer.putShort((short) mYear);
            byteBuffer.put((byte) mMonth);
            byteBuffer.put((byte) mDay);
            byteBuffer.put((byte) mHours);
            byteBuffer.put((byte) mMinutes);
            byteBuffer.put((byte) mSeconds);
            length += 7;
        }
        if (isFlagsUserIdPresent()) {
            byteBuffer.put((byte) mUserId);
            length++;
        }
        if (isFlagsBmiAndHeightPresent()) {
            byteBuffer.putShort((short) mBmi);
            if (isFlagsMeasurementUnitSI()) {
                byteBuffer.putShort((short) mHeightSi);
            } else {
                byteBuffer.putShort((short) mHeightImperial);
            }
            length += 4;
        }
        return Arrays.copyOfRange(data, 0, length);
    }

    /**
     * check Flags
     *
     * @param mask   bitmask for expect
     * @param expect one of {@link #FLAG_MEASUREMENT_UNITS_SI}
     *               , {@link #FLAG_MEASUREMENT_UNITS_IMPERIAL}
     *               , {@link #FLAG_TIME_STAMP_PRESENT_FALSE}
     *               , {@link #FLAG_TIME_STAMP_PRESENT_TRUE}
     *               , {@link #FLAG_USER_ID_PRESENT_FALSE}
     *               , {@link #FLAG_USER_ID_PRESENT_TRUE}
     *               , {@link #FLAG_BMI_AND_HEIGHT_PRESENT_FALSE}
     *               , {@link #FLAG_BMI_AND_HEIGHT_PRESENT_TRUE}
     * @return {@code true}:same as expect, {@code false}:not match
     */
    private boolean isFlagsMatched(int mask, int expect) {
        return (mask & mFlags) == expect;
    }

}
