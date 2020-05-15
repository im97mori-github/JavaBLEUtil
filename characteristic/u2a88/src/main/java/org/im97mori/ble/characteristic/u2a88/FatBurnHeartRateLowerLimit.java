package org.im97mori.ble.characteristic.u2a88;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Fat Burn Heart Rate Lower Limit (Characteristics UUID: 0x2A88)
 */
public class FatBurnHeartRateLowerLimit implements ByteArrayInterface {

    /**
     * Fat Burn Heart Rate Lower Limit
     */
    private final int mFatBurnHeartRateLowerLimit;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A88
     */
    public FatBurnHeartRateLowerLimit(@NonNull byte[] values) {
        mFatBurnHeartRateLowerLimit = (values[0] & 0xff);
    }

    /**
     * Constructor from parameters
     * 
     * @param fatBurnHeartRateLowerLimit Fat Burn Heart Rate Lower Limit
     */
    public FatBurnHeartRateLowerLimit(int fatBurnHeartRateLowerLimit) {
        mFatBurnHeartRateLowerLimit = fatBurnHeartRateLowerLimit;
    }

    /**
     * @return Fat Burn Heart Rate Lower Limit
     */
    public int getFatBurnHeartRateLowerLimit() {
        return mFatBurnHeartRateLowerLimit;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mFatBurnHeartRateLowerLimit);
        return data;
    }

}
