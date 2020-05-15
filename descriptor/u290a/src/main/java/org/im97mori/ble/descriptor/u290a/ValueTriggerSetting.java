package org.im97mori.ble.descriptor.u290a;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Value Trigger Setting (Descriptor UUID: 0x290A)
 */
public class ValueTriggerSetting implements ByteArrayInterface {

    /**
     * Condition:The state is changed if the characteristic value is changed
     */
    public static final int NONE_0 = 0x00;

    /**
     * Condition:Crossed a boundary
     */
    public static final int ANALOG_1 = 0x01;

    /**
     * Condition:On the boundary
     */
    public static final int ANALOG_2 = 0x02;

    /**
     * Condition:The state is changed if the value of the analog characteristic is changed more than a settable Analog value
     */
    public static final int ANALOG_3 = 0x03;

    /**
     * Condition:Mask then compare
     */
    public static final int BIT_MASK_4 = 0x04;

    /**
     * Condition:Inside or outside the boundaries
     */
    public static final int ANALOG_INTERVAL_5 = 0x05;

    /**
     * Condition:On the boundaries
     */
    public static final int ANALOG_INTERVAL_6 = 0x06;

    /**
     * Condition:No value trigger
     */
    public static final int NONE_7 = 0x07;

    /**
     * Condition
     */
    private final int mCondition;

    /**
     * Value (Analog)
     */
    private final int mValueAnalog;

    /**
     * Value (Bit Mask)
     */
    private final byte[] mValueBitMask;

    /**
     * Value (Analog Interval)
     */
    private final long mValueAnalogInterval;

    /**
     * Constructor from {@link BluetoothGattDescriptor}
     *
     * @param bluetoothGattDescriptor Characteristics UUID: 0x290A
     */
    public ValueTriggerSetting(@NonNull byte[] values) {
        mCondition = (values[0] & 0xff);
        mValueAnalog = (values[1] & 0xff) | ((values[2] & 0xff) << 8);
        mValueBitMask = Arrays.copyOfRange(values, 3, values.length - 4);
        mValueAnalogInterval = ((values[values.length - 4] & 0xff) | ((values[values.length - 3] & 0xff) << 8) | ((values[values.length - 2] & 0xff) << 16) | ((values[values.length - 1] & 0xff) << 24) & 0xffffffffL);
    }

    /**
     * Constructor from parameters
     * 
     * @param condition           Condition
     * @param valueAnalog         Value (Analog)
     * @param valueBitMask        Value (Bit Mask)
     * @param valueAnalogInterval Value (Analog Interval)
     */
    public ValueTriggerSetting(int condition, int valueAnalog, @NonNull byte[] valueBitMask, long valueAnalogInterval) {
        mCondition = condition;
        mValueAnalog = valueAnalog;
        mValueBitMask = valueBitMask;
        mValueAnalogInterval = valueAnalogInterval;
    }

    /**
     * @return Condition
     */
    public int getCondition() {
        return mCondition;
    }

    /**
     * @return {@code true}:condition is {@link #NONE_0}, {@code false}:not {@link #NONE_0}
     */
    public boolean isNone0() {
        return NONE_0 == mCondition;
    }

    /**
     * @return {@code true}:condition is {@link #ANALOG_1}, {@code false}:not {@link #ANALOG_1}
     */
    public boolean isAnalog1() {
        return ANALOG_1 == mCondition;
    }

    /**
     * @return {@code true}:condition is {@link #ANALOG_2}, {@code false}:not {@link #ANALOG_2}
     */
    public boolean isAnalog2() {
        return ANALOG_2 == mCondition;
    }

    /**
     * @return {@code true}:condition is {@link #ANALOG_3}, {@code false}:not {@link #ANALOG_3}
     */
    public boolean isAnalog3() {
        return ANALOG_3 == mCondition;
    }

    /**
     * @return {@code true}:condition is {@link #BIT_MASK_4}, {@code false}:not {@link #BIT_MASK_4}
     */
    public boolean isBitMask4() {
        return BIT_MASK_4 == mCondition;
    }

    /**
     * @return {@code true}:condition is {@link #ANALOG_INTERVAL_5}, {@code false}:not {@link #ANALOG_INTERVAL_5}
     */
    public boolean isAnalogInterval5() {
        return ANALOG_INTERVAL_5 == mCondition;
    }

    /**
     * @return {@code true}:condition is {@link #ANALOG_INTERVAL_6}, {@code false}:not {@link #ANALOG_INTERVAL_6}
     */
    public boolean isAnalogInterval6() {
        return ANALOG_INTERVAL_6 == mCondition;
    }

    /**
     * @return {@code true}:condition is {@link #NONE_7}, {@code false}:not {@link #NONE_7}
     */
    public boolean isNone7() {
        return NONE_7 == mCondition;
    }

    /**
     * @return Value (Analog)
     */
    public int getValueAnalog() {
        return mValueAnalog;
    }

    /**
     * @return Value (Bit Mask)
     */
    @NonNull
    public byte[] getValueBitMask() {
        return mValueBitMask;
    }

    /**
     * @return Value (Analog Interval)
     */
    public long getValueAnalogInterval() {
        return mValueAnalogInterval;
    }

    /**
     * {@inheritDoc}
     */
    @NonNull
    @Override
    public byte[] getBytes() {
        byte[] data = new byte[7 + mValueBitMask.length];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mCondition);
        byteBuffer.putShort((short) mValueAnalog);
        byteBuffer.put(mValueBitMask);
        byteBuffer.putInt((int) mValueAnalogInterval);
        return data;
    }

}
