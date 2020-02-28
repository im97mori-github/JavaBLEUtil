package org.im97mori.ble.characteristic.u2a89;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Fat Burn Heart Rate Upper Limit (Characteristics UUID: 0x2A89)
 */
public class FatBurnHeartRateUpperLimit implements ByteArrayInterface {

    /**
     * Fat Burn Heart Rate Upper Limit
     */
    private final int mFatBurnHeartRateUpperLimit;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A89
     */
    public FatBurnHeartRateUpperLimit(@NonNull byte[] values) {
        mFatBurnHeartRateUpperLimit = (values[0] & 0xff);
    }

    /**
     * @return Fat Burn Heart Rate Upper Limit
     */
    public int getFatBurnHeartRateUpperLimit() {
        return mFatBurnHeartRateUpperLimit;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mFatBurnHeartRateUpperLimit);
        return data;
    }

}
