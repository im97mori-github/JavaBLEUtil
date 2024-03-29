package org.im97mori.ble.characteristic.u2ad8;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Supported Power Range (Characteristics UUID: 0x2AD8)
 */
public class SupportedPowerRange implements ByteArrayInterface {

    /**
     * Minimum Power
     */
    private final int mMinimumPower;

    /**
     * Maximum Power
     */
    private final int mMaximumPower;

    /**
     * Minimum Increment
     */
    private final int mMinimumIncrement;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public SupportedPowerRange(@NonNull byte[] values) {
        mMinimumPower = BLEUtils.createSInt16(values, 0);
        mMaximumPower = BLEUtils.createSInt16(values, 2);
        mMinimumIncrement = BLEUtils.createUInt16(values, 4);
    }

    /**
     * Constructor from parameters
     * 
     * @param minimumPower     Minimum Power
     * @param maximumPower     Maximum Power
     * @param minimumIncrement Minimum Increment
     */
    public SupportedPowerRange(int minimumPower, int maximumPower, int minimumIncrement) {
        mMinimumPower = minimumPower;
        mMaximumPower = maximumPower;
        mMinimumIncrement = minimumIncrement;
    }

    /**
     * @return Minimum Power
     */
    public int getMinimumPower() {
        return mMinimumPower;
    }

    /**
     * @return Maximum Power
     */
    public int getMaximumPower() {
        return mMaximumPower;
    }

    /**
     * @return Minimum Increment
     */
    public int getMinimumIncrement() {
        return mMinimumIncrement;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[6];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mMinimumPower);
        byteBuffer.putShort((short) mMaximumPower);
        byteBuffer.putShort((short) mMinimumIncrement);
        return data;
    }

}
