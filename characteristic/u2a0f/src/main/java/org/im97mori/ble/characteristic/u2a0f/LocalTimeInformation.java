package org.im97mori.ble.characteristic.u2a0f;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Local Time Information (Characteristics UUID: 0x2A0F)
 */
public class LocalTimeInformation implements ByteArrayInterface {

    /**
     * Time Zone
     */
    private final int mTimeZone;

    /**
     * DST Offset
     */
    private final int mDstOffset;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public LocalTimeInformation(@NonNull byte[] values) {
        mTimeZone = BLEUtils.createSInt8(values, 0);
        mDstOffset = (values[1] & 0xff);
    }

    /**
     * Constructor from parameters
     * 
     * @param timeZone  Time Zone
     * @param dstOffset DST Offset
     */
    public LocalTimeInformation(int timeZone, int dstOffset) {
        mTimeZone = timeZone;
        mDstOffset = dstOffset;
    }

    /**
     * @return Time Zone
     */
    public int getTimeZone() {
        return mTimeZone;
    }

    /**
     * @return DST Offset
     */
    public int getDstOffset() {
        return mDstOffset;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mTimeZone);
        byteBuffer.put((byte) mDstOffset);
        return data;
    }

}
