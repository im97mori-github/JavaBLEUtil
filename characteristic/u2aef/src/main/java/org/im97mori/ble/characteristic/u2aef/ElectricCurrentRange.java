package org.im97mori.ble.characteristic.u2aef;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Electric Current Range (Characteristics UUID: 0x2AEF)
 */
public class ElectricCurrentRange implements ByteArrayInterface {

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
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2AEF
     */
    public ElectricCurrentRange(@NonNull byte[] values) {
        mMinimumElectricCurrentValue = BLEUtils.createUInt16(values, 0);
        mMaximumElectricCurrentValue = BLEUtils.createUInt16(values, 2);
    }

    /**
     * Constructor from parameters
     * 
     * @param minimumElectricCurrentValue Minimum Electric Current Value
     * @param maximumElectricCurrentValue Maximum Electric Current Value
     */
    public ElectricCurrentRange(int minimumElectricCurrentValue, int maximumElectricCurrentValue) {
        mMinimumElectricCurrentValue = minimumElectricCurrentValue;
        mMaximumElectricCurrentValue = maximumElectricCurrentValue;
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
        byte[] data = new byte[4];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mMinimumElectricCurrentValue);
        byteBuffer.putShort((short) mMaximumElectricCurrentValue);
        return data;
    }

}
