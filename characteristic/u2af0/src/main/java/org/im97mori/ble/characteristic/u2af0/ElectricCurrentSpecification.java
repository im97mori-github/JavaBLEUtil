package org.im97mori.ble.characteristic.u2af0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Electric Current Specification (Characteristics UUID: 0x2AF0)
 */
public class ElectricCurrentSpecification implements ByteArrayInterface {

    /**
     * Minimum Electric Current Value
     */
    private final int mMinimumElectricCurrentValue;

    /**
     * Typical Electric Current Value
     */
    private final int mTypicalElectricCurrentValue;

    /**
     * Maximum Electric Current Value
     */
    private final int mMaximumElectricCurrentValue;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2AF0
     */
    public ElectricCurrentSpecification(@NonNull byte[] values) {
        mMinimumElectricCurrentValue = BLEUtils.createUInt16(values, 0);
        mTypicalElectricCurrentValue = BLEUtils.createUInt16(values, 2);
        mMaximumElectricCurrentValue = BLEUtils.createUInt16(values, 4);
    }

    /**
     * Constructor from parameters
     * 
     * @param minimumElectricCurrentValue Minimum Electric Current Value
     * @param typicalElectricCurrentValue Typical Electric Current Value
     * @param maximumElectricCurrentValue Maximum Electric Current Value
     */
    public ElectricCurrentSpecification(int minimumElectricCurrentValue, int typicalElectricCurrentValue, int maximumElectricCurrentValue) {
        mMinimumElectricCurrentValue = minimumElectricCurrentValue;
        mTypicalElectricCurrentValue = typicalElectricCurrentValue;
        mMaximumElectricCurrentValue = maximumElectricCurrentValue;
    }

    /**
     * @return Minimum Electric Current Value
     */
    public int getMinimumElectricCurrentValue() {
        return mMinimumElectricCurrentValue;
    }

    /**
     * @return Typical Electric Current Value
     */
    public int getTypicalElectricCurrentValue() {
        return mTypicalElectricCurrentValue;
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
        byte[] data = new byte[6];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mMinimumElectricCurrentValue);
        byteBuffer.putShort((short) mTypicalElectricCurrentValue);
        byteBuffer.putShort((short) mMaximumElectricCurrentValue);
        return data;
    }

}
