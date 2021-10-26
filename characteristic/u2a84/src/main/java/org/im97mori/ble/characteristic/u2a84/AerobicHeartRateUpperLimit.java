package org.im97mori.ble.characteristic.u2a84;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Aerobic Heart Rate Upper Limit (Characteristics UUID: 0x2A84)
 */
public class AerobicHeartRateUpperLimit implements ByteArrayInterface {

    /**
     * Aerobic Heart Rate Upper Limit
     */
    private final int mAerobicHeartRateUpperLimit;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public AerobicHeartRateUpperLimit(@NonNull byte[] values) {
        mAerobicHeartRateUpperLimit = (values[0] & 0xff);
    }

    /**
     * Constructor from parameters
     * 
     * @param aerobicHeartRateUpperLimit Aerobic Heart Rate Upper Limit
     */
    public AerobicHeartRateUpperLimit(int aerobicHeartRateUpperLimit) {
        mAerobicHeartRateUpperLimit = aerobicHeartRateUpperLimit;
    }

    /**
     * @return Aerobic Heart Rate Upper Limit
     */
    public int getAerobicHeartRateUpperLimit() {
        return mAerobicHeartRateUpperLimit;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mAerobicHeartRateUpperLimit);
        return data;
    }

}
