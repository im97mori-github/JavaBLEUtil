package org.im97mori.ble.characteristic.u2af1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Electric Current Statistics (Characteristics UUID: 0x2AF1)
 */
public class ElectricCurrentStatistics implements ByteArrayInterface {

    /**
     * Average Electric Current Value
     */
    private final int mAverageElectricCurrentValue;

    /**
     * Standard Deviation Electric Current Value
     */
    private final int mStandardDeviationElectricCurrentValue;

    /**
     * Minimum Electric Current Value
     */
    private final int mMinimumElectricCurrentValue;

    /**
     * Maximum Electric Current Value
     */
    private final int mMaximumElectricCurrentValue;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2AF1
     */
    public ElectricCurrentStatistics(@NonNull byte[] values) {
        mAverageElectricCurrentValue = BLEUtils.createUInt16(values, 0);
        mStandardDeviationElectricCurrentValue = BLEUtils.createUInt16(values, 2);
        mMinimumElectricCurrentValue = BLEUtils.createUInt16(values, 4);
        mMaximumElectricCurrentValue = BLEUtils.createUInt16(values, 6);
    }

    /**
     * Constructor from parameters
     * 
     * @param averageElectricCurrentValue Average Electric Current Value
     * @param standardDeviationElectricCurrentValue Standard Deviation Electric Current Value
     * @param minimumElectricCurrentValue Minimum Electric Current Value
     * @param maximumElectricCurrentValue Maximum Electric Current Value
     */
    public ElectricCurrentStatistics(int averageElectricCurrentValue, int standardDeviationElectricCurrentValue, int minimumElectricCurrentValue, int maximumElectricCurrentValue) {
        mAverageElectricCurrentValue = averageElectricCurrentValue;
        mStandardDeviationElectricCurrentValue = standardDeviationElectricCurrentValue;
        mMinimumElectricCurrentValue = minimumElectricCurrentValue;
        mMaximumElectricCurrentValue = maximumElectricCurrentValue;
    }

    /**
     * @return Average Electric Current Value
     */
    public int getAverageElectricCurrentValue() {
        return mAverageElectricCurrentValue;
    }

    /**
     * @return Standard Deviation Electric Current Value
     */
    public int getStandardDeviationElectricCurrentValue() {
        return mStandardDeviationElectricCurrentValue;
    }

    /**
     * @return Minimum Electric Current Value
     */
    public int getMinimumElectricCurrentValue() {
        return mMinimumElectricCurrentValue;
    }

    /**
     * @return Maximum Electric Current Value
     */
    public int getMaximumElectricCurrentValue() {
        return mMaximumElectricCurrentValue;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[8];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mAverageElectricCurrentValue);
        byteBuffer.putShort((short) mStandardDeviationElectricCurrentValue);
        byteBuffer.putShort((short) mMinimumElectricCurrentValue);
        byteBuffer.putShort((short) mMaximumElectricCurrentValue);
        return data;
    }

}
