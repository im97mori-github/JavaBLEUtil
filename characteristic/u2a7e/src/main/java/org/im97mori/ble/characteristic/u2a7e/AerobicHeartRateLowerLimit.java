package org.im97mori.ble.characteristic.u2a7e;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Aerobic Heart Rate Lower Limit (Characteristics UUID: 0x2A7E)
 */
public class AerobicHeartRateLowerLimit implements ByteArrayInterface {

    /**
     * Aerobic Heart Rate Lower Limit
     */
    private final int mAerobicHeartRateLowerLimit;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public AerobicHeartRateLowerLimit(@NonNull byte[] values) {
        mAerobicHeartRateLowerLimit = (values[0] & 0xff);
    }

    /**
     * Constructor from parameters
     * 
     * @param aerobicHeartRateLowerLimit Aerobic Heart Rate Lower Limit
     */
    public AerobicHeartRateLowerLimit(int aerobicHeartRateLowerLimit) {
        mAerobicHeartRateLowerLimit = aerobicHeartRateLowerLimit;
    }

    /**
     * @return Aerobic Heart Rate Lower Limit
     */
    public int getAerobicHeartRateLowerLimit() {
        return mAerobicHeartRateLowerLimit;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mAerobicHeartRateLowerLimit);
        return data;
    }

}
