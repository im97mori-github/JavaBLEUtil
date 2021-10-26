package org.im97mori.ble.descriptor.u290b;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Environmental Sensing Configuration (Descriptor UUID: 0x290B)
 */
public class EnvironmentalSensingConfiguration implements ByteArrayInterface {

    /**
     * Trigger Logic Value:Boolean AND
     */
    public static final int TRIGGER_LOGIC_VALUE_BOOLAEN_AND = 0x00;

    /**
     * Trigger Logic Value:Boolean OR
     */
    public static final int TRIGGER_LOGIC_VALUE_BOOLAEN_OR = 0x01;

    /**
     * Trigger Logic Value
     */
    private final int mTriggerLogicValue;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
     */
    public EnvironmentalSensingConfiguration(@NonNull byte[] values) {
        mTriggerLogicValue = (values[0] & 0xff);
    }

    /**
     * Constructor from parameters
     * 
     * @param triggerLogicValue Trigger Logic Value
     */
    public EnvironmentalSensingConfiguration(int triggerLogicValue) {
        mTriggerLogicValue = triggerLogicValue;
    }

    /**
     * @return Trigger Logic Value
     */
    public int getTriggerLogicValue() {
        return mTriggerLogicValue;
    }

    /**
     * @return {@code true}:triger logic value is {@link #TRIGGER_LOGIC_VALUE_BOOLAEN_AND}, {@code false}:not {@link #TRIGGER_LOGIC_VALUE_BOOLAEN_AND}
     */
    public boolean isTriggerLogicValueBooleanAnd() {
        return TRIGGER_LOGIC_VALUE_BOOLAEN_AND == mTriggerLogicValue;
    }

    /**
     * @return {@code true}:triger logic value is {@link #TRIGGER_LOGIC_VALUE_BOOLAEN_OR}, {@code false}:not {@link #TRIGGER_LOGIC_VALUE_BOOLAEN_OR}
     */
    public boolean isTriggerLogicValueBooleanOr() {
        return TRIGGER_LOGIC_VALUE_BOOLAEN_OR == mTriggerLogicValue;
    }

    /**
     * {@inheritDoc}
     */
    @NonNull
    @Override
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mTriggerLogicValue);
        return data;
    }

}
