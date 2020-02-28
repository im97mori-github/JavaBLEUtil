package org.im97mori.ble.characteristic.u2a91;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Maximum Recommended Heart Rate (Characteristics UUID: 0x2A91)
 */
public class MaximumRecommendedHeartRate implements ByteArrayInterface {

    /**
     * Maximum Recommended Heart Rate
     */
    private final int mMaximumRecommendedHeartRate;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A91
     */
    public MaximumRecommendedHeartRate(@NonNull byte[] values) {
        mMaximumRecommendedHeartRate = (values[0] & 0xff);
    }

    /**
     * @return Maximum Recommended Heart Rate
     */
    public int getMaximumRecommendedHeartRate() {
        return mMaximumRecommendedHeartRate;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mMaximumRecommendedHeartRate);
        return data;
    }

}
