package org.im97mori.ble.characteristic.u2b09;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Relative Value In A Voltage Range (Characteristics UUID: 0x2B09)
 */
public class RelativeValueInAVoltageRange implements ByteArrayInterface {

    /**
     * Relative Value
     */
    private final int mRelativeValue;

    /**
     * Minimum Voltage
     */
    private final int mMinimumVoltage;

    /**
     * Maximum Voltage
     */
    private final int mMaximumVoltage;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2B09
     */
    public RelativeValueInAVoltageRange(@NonNull byte[] values) {
        mRelativeValue = BLEUtils.createUInt8(values, 0);
        mMinimumVoltage = BLEUtils.createUInt16(values, 1);
        mMaximumVoltage = BLEUtils.createUInt16(values, 3);
    }

    /**
     * Constructor from parameters
     * 
     * @param relativeValue Relative Value
     * @param minimumVoltage Minimum Voltage
     * @param maximumVoltage Maximum Voltage
     */
    public RelativeValueInAVoltageRange(int relativeValue, int minimumVoltage, int maximumVoltage) {
        mRelativeValue = relativeValue;
        mMinimumVoltage = minimumVoltage;
        mMaximumVoltage = maximumVoltage;
    }

    /**
     * @return Relative Value
     */
    public int getRelativeValue() {
        return mRelativeValue;
    }

    /**
     * @return Minimum Voltage
     */
    public int getMinimumVoltage() {
        return mMinimumVoltage;
    }

    /**
     * @return Maximum Voltage
     */
    public int getMaximumVoltage() {
        return mMaximumVoltage;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[5];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mRelativeValue);
        byteBuffer.put((byte) mMinimumVoltage);
        byteBuffer.put((byte) (mMinimumVoltage >> 8));
        byteBuffer.put((byte) mMaximumVoltage);
        byteBuffer.put((byte) (mMaximumVoltage >> 8));
        return data;
    }

}
