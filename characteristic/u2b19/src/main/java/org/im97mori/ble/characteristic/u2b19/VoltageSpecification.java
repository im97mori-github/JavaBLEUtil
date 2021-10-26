package org.im97mori.ble.characteristic.u2b19;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Voltage Specification (Characteristics UUID: 0x2B19)
 */
public class VoltageSpecification implements ByteArrayInterface {

    /**
     * Minimum Voltage Value
     */
    private final int mMinimumVoltageValue;

    /**
     * Typical Voltage Value
     */
    private final int mTypicalVoltageValue;

    /**
     * Maximum Voltage Value
     */
    private final int mMaximumVoltageValue;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public VoltageSpecification(@NonNull byte[] values) {
        mMinimumVoltageValue = BLEUtils.createUInt16(values, 0);
        mTypicalVoltageValue = BLEUtils.createUInt16(values, 2);
        mMaximumVoltageValue = BLEUtils.createUInt16(values, 4);
    }

    /**
     * Constructor from parameters
     * 
     * @param minimumVoltageValue Minimum Voltage Value
     * @param typicalVoltageValue Typical Voltage Value
     * @param maximumVoltageValue Maximum Voltage Value
     */
    public VoltageSpecification(int minimumVoltageValue, int typicalVoltageValue, int maximumVoltageValue) {
        mMinimumVoltageValue = minimumVoltageValue;
        mTypicalVoltageValue = typicalVoltageValue;
        mMaximumVoltageValue = maximumVoltageValue;
    }

    /**
     * @return Minimum Voltage Value
     */
    public int getMinimumVoltageValue() {
        return mMinimumVoltageValue;
    }

    /**
     * @return Typical Voltage Value
     */
    public int getTypicalVoltageValue() {
        return mTypicalVoltageValue;
    }

    /**
     * @return Maximum Voltage Value
     */
    public int getMaximumVoltageValue() {
        return mMaximumVoltageValue;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[6];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mMinimumVoltageValue);
        byteBuffer.putShort((short) mTypicalVoltageValue);
        byteBuffer.putShort((short) mMaximumVoltageValue);
        return data;
    }

}
