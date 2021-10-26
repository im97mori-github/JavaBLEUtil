package org.im97mori.ble.characteristic.u2b0b;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Relative Value In A Period Of Day (Characteristics UUID: 0x2B0B)
 */
public class RelativeValueInAPeriodOfDay implements ByteArrayInterface {

    /**
     * Relative Value
     */
    private final int mRelativeValue;

    /**
     * Start Time
     */
    private final int mStartTime;

    /**
     * End Time
     */
    private final int mEndTime;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public RelativeValueInAPeriodOfDay(@NonNull byte[] values) {
        mRelativeValue = BLEUtils.createUInt8(values, 0);
        mStartTime = BLEUtils.createUInt8(values, 1);
        mEndTime = BLEUtils.createUInt8(values, 2);
    }

    /**
     * Constructor from parameters
     * 
     * @param relativeValue Relative Value
     * @param startTime Start Time
     * @param endTime End Time
     */
    public RelativeValueInAPeriodOfDay(int relativeValue, int startTime, int endTime) {
        mRelativeValue = relativeValue;
        mStartTime = startTime;
        mEndTime = endTime;
    }

    /**
     * @return Relative Value
     */
    public int getRelativeValue() {
        return mRelativeValue;
    }

    /**
     * @return Start Time
     */
    public int getStartTime() {
        return mStartTime;
    }

    /**
     * @return End Time
     */
    public int getEndTime() {
        return mEndTime;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[3];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mRelativeValue);
        byteBuffer.put((byte) mStartTime);
        byteBuffer.put((byte) mEndTime);
        return data;
    }

}
