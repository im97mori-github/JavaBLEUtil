package org.im97mori.ble.characteristic.u2b11;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Temperature Statistics (Characteristics UUID: 0x2B11)
 */
public class TemperatureStatistics implements ByteArrayInterface {

    /**
     * Average Temperature
     */
    private final int mAverageTemperature;

    /**
     * Standard Deviation Temperature
     */
    private final int mStandardDeviationTemperature;

    /**
     * Minimum Temperature
     */
    private final int mMinimumTemperature;

    /**
     * Maximum Temperature
     */
    private final int mMaximumTemperature;

    /**
     * Sensing Duration
     */
    private final int mSensingDuration;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public TemperatureStatistics(@NonNull byte[] values) {
        mAverageTemperature = BLEUtils.createSInt16(values, 0);
        mStandardDeviationTemperature = BLEUtils.createSInt16(values, 2);
        mMinimumTemperature = BLEUtils.createSInt16(values, 4);
        mMaximumTemperature = BLEUtils.createSInt16(values, 6);
        mSensingDuration = BLEUtils.createUInt8(values, 8);
    }

    /**
     * Constructor from parameters
     * 
     * @param averageTemperature Average Temperature
     * @param standardDeviationTemperature Standard Deviation Temperature
     * @param minimumTemperature Minimum Temperature
     * @param maximumTemperature Maximum Temperature
     * @param sensingDuration Sensing Duration
     */
    public TemperatureStatistics(int averageTemperature, int standardDeviationTemperature, int minimumTemperature, int maximumTemperature, int sensingDuration) {
        mAverageTemperature = averageTemperature;
        mStandardDeviationTemperature = standardDeviationTemperature;
        mMinimumTemperature = minimumTemperature;
        mMaximumTemperature = maximumTemperature;
        mSensingDuration = sensingDuration;
    }

    /**
     * @return Average Temperature
     */
    public int getAverageTemperature() {
        return mAverageTemperature;
    }

    /**
     * @return Standard Deviation Temperature
     */
    public int getStandardDeviationTemperature() {
        return mStandardDeviationTemperature;
    }

    /**
     * @return Maximum Temperature
     */
    public int getMinimumTemperature() {
        return mMinimumTemperature;
    }

    /**
     * @return Minimum Temperature
     */
    public int getMaximumTemperature() {
        return mMaximumTemperature;
    }

    /**
     * @return Sensing Duration
     */
    public int getSensingDuration() {
        return mSensingDuration;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[9];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mAverageTemperature);
        byteBuffer.putShort((short) mStandardDeviationTemperature);
        byteBuffer.putShort((short) mMinimumTemperature);
        byteBuffer.putShort((short) mMaximumTemperature);
        byteBuffer.put((byte) mSensingDuration);
        return data;
    }

}
