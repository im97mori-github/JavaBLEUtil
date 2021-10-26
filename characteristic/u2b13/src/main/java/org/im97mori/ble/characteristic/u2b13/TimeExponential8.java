package org.im97mori.ble.characteristic.u2b13;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Time Exponential 8 (Characteristics UUID: 0x2B13)
 */
public class TimeExponential8 implements ByteArrayInterface {

    /**
     * Time Exponential 8
     */
    private final int mTimeExponential8;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public TimeExponential8(@NonNull byte[] values) {
        mTimeExponential8 = BLEUtils.createUInt8(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param timeExponential8 Time Exponential 8
     */
    public TimeExponential8(int timeExponential8) {
        mTimeExponential8 = timeExponential8;
    }

    /**
     * @return Time Exponential 8
     */
    public int getTimeExponential8() {
        return mTimeExponential8;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mTimeExponential8);
        return data;
    }

}
