package org.im97mori.ble.characteristic.u2a82;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Anaerobic Heart Rate Upper Limit (Characteristics UUID: 0x2A82)
 */
public class AnaerobicHeartRateUpperLimit implements ByteArrayInterface {

    /**
     * Anaerobic Heart Rate Upper Limit
     */
    private final int mAnaerobicHeartRateUpperLimit;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public AnaerobicHeartRateUpperLimit(@NonNull byte[] values) {
        mAnaerobicHeartRateUpperLimit = (values[0] & 0xff);
    }

    /**
     * Constructor from parameters
     * 
     * @param anaerobicHeartRateUpperLimit Anaerobic Heart Rate Upper Limit
     */
    public AnaerobicHeartRateUpperLimit(int anaerobicHeartRateUpperLimit) {
        mAnaerobicHeartRateUpperLimit = anaerobicHeartRateUpperLimit;
    }

    /**
     * @return Anaerobic Heart Rate Upper Limit
     */
    public int getAnaerobicHeartRateUpperLimit() {
        return mAnaerobicHeartRateUpperLimit;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mAnaerobicHeartRateUpperLimit);
        return data;
    }

}
