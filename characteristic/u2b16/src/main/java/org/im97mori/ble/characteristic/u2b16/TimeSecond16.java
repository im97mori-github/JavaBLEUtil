package org.im97mori.ble.characteristic.u2b16;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Time Second 16 (Characteristics UUID: 0x2B16)
 */
public class TimeSecond16 implements ByteArrayInterface {

    /**
     * Time Second 16
     */
    private final int mTimeSecond16;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public TimeSecond16(@NonNull byte[] values) {
        mTimeSecond16 = BLEUtils.createUInt16(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param timeSecond16 Time Second 16
     */
    public TimeSecond16(int timeSecond16) {
        mTimeSecond16 = timeSecond16;
    }

    /**
     * @return Time Second 16
     */
    public int getTimeSecond16() {
        return mTimeSecond16;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mTimeSecond16);
        byteBuffer.put((byte) (mTimeSecond16 >> 8));
        return data;
    }

}
