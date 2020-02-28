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
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A84
     */
    public AerobicHeartRateUpperLimit(@NonNull byte[] values) {
        mAerobicHeartRateUpperLimit = (values[0] & 0xff);
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
