package org.im97mori.ble.characteristic.u2a1c;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;
import org.im97mori.ble.characteristic.core.IEEE_11073_20601_FLOAT;
import org.im97mori.ble.characteristic.core.TemperatureMeasurementUtils;

import androidx.annotation.NonNull;

/**
 * Temperature Measurement (Characteristics UUID: 0x2A1C)
 */
public class TemperatureMeasurement implements ByteArrayInterface {

    /**
     * Flags
     */
    private final int mFlags;

    /**
     * Temperature Measurement Value (Celsius)
     */
    private final IEEE_11073_20601_FLOAT mTemperatureMeasurementValueCelsius;

    /**
     * Temperature Measurement Value (Fahrenheit)
     */
    private final IEEE_11073_20601_FLOAT mTemperatureMeasurementValueFahrenheit;

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
     * Temperature Text Description
     */
    private final int mTemperatureTextDescription;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public TemperatureMeasurement(@NonNull byte[] values) {
        int index = 0;
        mFlags = values[index++];
        if (TemperatureMeasurementUtils.isFlagsTemperatureUnitsCelsius(mFlags)) {
            mTemperatureMeasurementValueCelsius = new IEEE_11073_20601_FLOAT(values, index);
            mTemperatureMeasurementValueFahrenheit = new IEEE_11073_20601_FLOAT(new byte[4], 0);
        } else {
            mTemperatureMeasurementValueCelsius = new IEEE_11073_20601_FLOAT(new byte[4], 0);
            mTemperatureMeasurementValueFahrenheit = new IEEE_11073_20601_FLOAT(values, index);
        }
        index += 4;
        if (TemperatureMeasurementUtils.isFlagsTimeStampPresent(mFlags)) {
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
        if (TemperatureMeasurementUtils.isFlagsTemperatureTypePresent(mFlags)) {
            mTemperatureTextDescription = values[index];
        } else {
            mTemperatureTextDescription = 0;
        }
    }

    /**
     * Constructor from parameters
     * 
     * @param flags                                 Flags
     * @param temperatureMeasurementValueCelsius    Temperature Measurement Value (Celsius)
     * @param temperatureMeasurementValueFahrenheit Temperature Measurement Value (Fahrenheit)
     * @param year                                  Year
     * @param month                                 Month
     * @param day                                   Day
     * @param hours                                 Hours
     * @param minutes                               Minutes
     * @param seconds                               Seconds
     * @param temperatureTextDescription            Temperature Text Description
     */
    public TemperatureMeasurement(int flags, double temperatureMeasurementValueCelsius, double temperatureMeasurementValueFahrenheit, int year, int month, int day, int hours, int minutes, int seconds, int temperatureTextDescription) {
        this(flags, new IEEE_11073_20601_FLOAT(temperatureMeasurementValueCelsius), new IEEE_11073_20601_FLOAT(temperatureMeasurementValueFahrenheit), year, month, day, hours, minutes, seconds, temperatureTextDescription);
    }

    /**
     * Constructor from parameters
     * 
     * @param flags                                 Flags
     * @param temperatureMeasurementValueCelsius    Temperature Measurement Value (Celsius)
     * @param temperatureMeasurementValueFahrenheit Temperature Measurement Value (Fahrenheit)
     * @param year                                  Year
     * @param month                                 Month
     * @param day                                   Day
     * @param hours                                 Hours
     * @param minutes                               Minutes
     * @param seconds                               Seconds
     * @param temperatureTextDescription            Temperature Text Description
     */
    public TemperatureMeasurement(int flags, @NonNull IEEE_11073_20601_FLOAT temperatureMeasurementValueCelsius, @NonNull IEEE_11073_20601_FLOAT temperatureMeasurementValueFahrenheit, int year, int month, int day, int hours, int minutes, int seconds, int temperatureTextDescription) {
        mFlags = flags;
        mTemperatureMeasurementValueCelsius = temperatureMeasurementValueCelsius;
        mTemperatureMeasurementValueFahrenheit = temperatureMeasurementValueFahrenheit;
        mYear = year;
        mMonth = month;
        mDay = day;
        mHours = hours;
        mMinutes = minutes;
        mSeconds = seconds;
        mTemperatureTextDescription = temperatureTextDescription;
    }

    /**
     * @return Flags
     */
    public int getFlags() {
        return mFlags;
    }

    /**
     * @return Temperature Measurement Value (Celsius)
     */
    public IEEE_11073_20601_FLOAT getTemperatureMeasurementValueCelsius() {
        return mTemperatureMeasurementValueCelsius;
    }

    /**
     * @return Temperature Measurement Value (Fahrenheit)
     */
    public IEEE_11073_20601_FLOAT getTemperatureMeasurementValueFahrenheit() {
        return mTemperatureMeasurementValueFahrenheit;
    }

    /**
     * @return Year
     */
    public int getYear() {
        return mYear;
    }

    /**
     * @return Month
     */
    public int getMonth() {
        return mMonth;
    }

    /**
     * @return Day
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
     * @return Temperature Text Description
     */
    public int getTemperatureTextDescription() {
        return mTemperatureTextDescription;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        int length = 0;
        byte[] data = new byte[13];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mFlags);
        length++;
        if (TemperatureMeasurementUtils.isFlagsTemperatureUnitsCelsius(mFlags)) {
            byteBuffer.put(mTemperatureMeasurementValueCelsius.getData());
        } else {
            byteBuffer.put(mTemperatureMeasurementValueFahrenheit.getData());
        }
        length += 4;
        if (TemperatureMeasurementUtils.isFlagsTimeStampPresent(mFlags)) {
            byteBuffer.putShort((short) mYear);
            byteBuffer.put((byte) mMonth);
            byteBuffer.put((byte) mDay);
            byteBuffer.put((byte) mHours);
            byteBuffer.put((byte) mMinutes);
            byteBuffer.put((byte) mSeconds);
            length += 7;
        }
        if (TemperatureMeasurementUtils.isFlagsTemperatureTypePresent(mFlags)) {
            byteBuffer.put((byte) mTemperatureTextDescription);
            length++;
        }
        return Arrays.copyOfRange(data, 0, length);
    }

}
