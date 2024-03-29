package org.im97mori.ble.descriptor.u290e;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Time Trigger Setting (Descriptor UUID: 0x290E)
 */
public class TimeTriggerSetting implements ByteArrayInterface {

    /**
     * Condition:No time-based triggering used
     */
    public static final int CONDITION_NO_TIME_BASED_TRIGGERING_USED = 0x00;

    /**
     * Condition:Indicates or notifies unconditionally after a settable time
     */
    public static final int CONDITION_INDICATES_OR_NOTIFIED_UNCONDITIONALLY_AFTER_A_SETTABLE_TIME = 0x01;

    /**
     * Condition:Not indicated or notified more often than a settable time
     */
    public static final int CONDITION_NOT_INDICATED_OR_NOTIFIED_MORE_OFTEN_THAN_A_SETTABLE_TIME = 0x02;

    /**
     * Condition:Changed more often than
     */
    public static final int CONDITION_CHANGED_MORE_OFTEN_THAN = 0x03;

    /**
     * Condition
     */
    private final int mCondition;

    /**
     * Value (None)
     */
    private final int mValueNone;

    /**
     * Value (Time Interval)
     */
    private final int mValueTimeInterval;

    /**
     * Value (Count)
     */
    private final int mValueCount;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
     */
    public TimeTriggerSetting(@NonNull byte[] values) {
        mCondition = (values[0] & 0xff);
        if (isConditionIndicatesOrNotifiedIUnconditionallyAfterASettableTime() || isConditionNotIndicatedOrNotifiedMoreOftenThanASettableTime()) {
            mValueNone = 0;
            mValueTimeInterval = BLEUtils.createUInt24(values, 1);
            mValueCount = 0;
        } else if (isConditionChangedMoreOfthenThan()) {
            mValueNone = 0;
            mValueTimeInterval = 0;
            mValueCount = BLEUtils.createUInt16(values, 1);
        } else {
            mValueNone = (values[1] & 0xff);
            mValueTimeInterval = 0;
            mValueCount = 0;
        }
    }

    /**
     * Constructor from parameters
     * 
     * @param condition          Condition
     * @param valueNone          Value (None)
     * @param valueTimerInterval Value (Time Interval)
     * @param valueCount         Value (Count)
     */
    public TimeTriggerSetting(int condition, int valueNone, int valueTimerInterval, int valueCount) {
        mCondition = condition;
        mValueNone = valueNone;
        mValueTimeInterval = valueTimerInterval;
        mValueCount = valueCount;
    }

    /**
     * @return Condition
     */
    public int getCondition() {
        return mCondition;
    }

    /**
     * @return {@code true}:condition is {@link #CONDITION_NO_TIME_BASED_TRIGGERING_USED}, {@code false}:not {@link #CONDITION_NO_TIME_BASED_TRIGGERING_USED}
     */
    public boolean isConditionNoTimeBasedTriggeringUsed() {
        return CONDITION_NO_TIME_BASED_TRIGGERING_USED == mCondition;
    }

    /**
     * @return {@code true}:condition is {@link #CONDITION_INDICATES_OR_NOTIFIED_UNCONDITIONALLY_AFTER_A_SETTABLE_TIME}, {@code false}:not {@link #CONDITION_INDICATES_OR_NOTIFIED_UNCONDITIONALLY_AFTER_A_SETTABLE_TIME}
     */
    public boolean isConditionIndicatesOrNotifiedIUnconditionallyAfterASettableTime() {
        return CONDITION_INDICATES_OR_NOTIFIED_UNCONDITIONALLY_AFTER_A_SETTABLE_TIME == mCondition;
    }

    /**
     * @return {@code true}:condition is {@link #CONDITION_NOT_INDICATED_OR_NOTIFIED_MORE_OFTEN_THAN_A_SETTABLE_TIME}, {@code false}:not {@link #CONDITION_NOT_INDICATED_OR_NOTIFIED_MORE_OFTEN_THAN_A_SETTABLE_TIME}
     */
    public boolean isConditionNotIndicatedOrNotifiedMoreOftenThanASettableTime() {
        return CONDITION_NOT_INDICATED_OR_NOTIFIED_MORE_OFTEN_THAN_A_SETTABLE_TIME == mCondition;
    }

    /**
     * @return {@code true}:condition is {@link #CONDITION_CHANGED_MORE_OFTEN_THAN}, {@code false}:not {@link #CONDITION_CHANGED_MORE_OFTEN_THAN}
     */
    public boolean isConditionChangedMoreOfthenThan() {
        return CONDITION_CHANGED_MORE_OFTEN_THAN == mCondition;
    }

    /**
     * @return Value (None)
     */
    public int getValueNone() {
        return mValueNone;
    }

    /**
     * @return Value (Time Interval)
     */
    public int getValueTimeInterval() {
        return mValueTimeInterval;
    }

    /**
     * @return Value (Count)
     */
    public int getValueCount() {
        return mValueCount;
    }

    /**
     * {@inheritDoc}
     */
    @NonNull
    @Override
    public byte[] getBytes() {
        int length = 0;
        byte[] data = new byte[7];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mCondition);
        length++;
        if (isConditionIndicatesOrNotifiedIUnconditionallyAfterASettableTime() || isConditionNotIndicatedOrNotifiedMoreOftenThanASettableTime()) {
            byteBuffer.put((byte) mValueTimeInterval);
            byteBuffer.put((byte) (mValueTimeInterval >> 8));
            byteBuffer.put((byte) (mValueTimeInterval >> 16));
            length += 3;
        } else if (isConditionChangedMoreOfthenThan()) {
            byteBuffer.putShort((short) mValueCount);
            length += 2;
        } else {
            byteBuffer.put((byte) mValueNone);
            length++;
        }
        return Arrays.copyOfRange(data, 0, length);
    }

}
