package org.im97mori.ble.characteristic.u2b17;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Time Second 8 (Characteristics UUID: 0x2B17)
 */
public class TimeSecond8 implements ByteArrayInterface {

    /**
     * 0xFF : A value of 0xFF represents ‘value is not known’
     */
    public static final int TIME_SECOND_8_VALUE_IS_NOT_KNOWN = 0xFF;

    /**
     * Time Second 8 Minimum value
     */
    public static final int TIME_SECOND_8_VALUE_MINIMUM = 0;

    /**
     * Time Second 8 Maximum value
     */
    public static final int TIME_SECOND_8_VALUE_MAXIMUM = 254;

    /**
     * Time Second 8
     */
    private final int mTimeSecond8;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public TimeSecond8(@NonNull byte[] values) {
        mTimeSecond8 = BLEUtils.createUInt8(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param timeSecond8 Time Second 8
     */
    public TimeSecond8(int timeSecond8) {
        mTimeSecond8 = timeSecond8;
    }

    /**
     * @return Time Second 8
     */
    public int getTimeSecond8() {
        return mTimeSecond8;
    }

    /**
     * @return {@code true}:Time Second 8 value is not known, {@code false}:has Time Second 8 value information
     * @see #TIME_SECOND_8_VALUE_IS_NOT_KNOWN
     */
    public boolean isTimeSecond8ValueIsNotKnown() {
        return TIME_SECOND_8_VALUE_IS_NOT_KNOWN == mTimeSecond8;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mTimeSecond8);
        return data;
    }

}
