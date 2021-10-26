package org.im97mori.ble.characteristic.u2b1a;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Voltage Statistics (Characteristics UUID: 0x2B1A)
 */
public class VoltageStatistics implements ByteArrayInterface {

    /**
     * Average Voltage Value
     */
    private final int mAverageVoltageValue;

    /**
     * Standard Deviation Voltage Value
     */
    private final int mStandardDeviationVoltageValue;

    /**
     * Minimum Voltage Value
     */
    private final int mMinimumVoltageValue;

    /**
     * Maximum Voltage Value
     */
    private final int mMaximumVoltageValue;

    /**
     * Sensing Duration
     */
    private final int mSensingDuration;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public VoltageStatistics(@NonNull byte[] values) {
        mAverageVoltageValue = BLEUtils.createUInt16(values, 0);
        mStandardDeviationVoltageValue = BLEUtils.createUInt16(values, 2);
        mMinimumVoltageValue = BLEUtils.createUInt16(values, 4);
        mMaximumVoltageValue = BLEUtils.createUInt16(values, 6);
        mSensingDuration = BLEUtils.createUInt8(values, 8);
    }

    /**
     * Constructor from parameters
     * 
     * @param averageVoltageValue Average Voltage Value
     * @param standardDeviationVoltageValue Standard Deviation Voltage Value
     * @param minimumVoltageValue Minimum Voltage Value
     * @param maximumVoltageValue Maximum Voltage Value
     * @param sensingDuration Sensing Duration
     */
    public VoltageStatistics(int averageVoltageValue, int standardDeviationVoltageValue, int minimumVoltageValue, int maximumVoltageValue, int sensingDuration) {
        mAverageVoltageValue = averageVoltageValue;
        mStandardDeviationVoltageValue = standardDeviationVoltageValue;
        mMinimumVoltageValue = minimumVoltageValue;
        mMaximumVoltageValue = maximumVoltageValue;
        mSensingDuration = sensingDuration;
    }

    /**
     * @return Average Voltage Value
     */
    public int getAverageVoltageValue() {
        return mAverageVoltageValue;
    }

    /**
     * @return Standard Deviation Voltage Value
     */
    public int getStandardDeviationVoltageValue() {
        return mStandardDeviationVoltageValue;
    }

    /**
     * @return Minimum Voltage Value
     */
    public int getMinimumVoltageValue() {
        return mMinimumVoltageValue;
    }

    /**
     * @return Maximum Voltage Value
     */
    public int getMaximumVoltageValue() {
        return mMaximumVoltageValue;
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
        byteBuffer.putShort((short) mAverageVoltageValue);
        byteBuffer.putShort((short) mStandardDeviationVoltageValue);
        byteBuffer.putShort((short) mMinimumVoltageValue);
        byteBuffer.putShort((short) mMaximumVoltageValue);
        byteBuffer.put((byte) mSensingDuration);
        return data;
    }

}
