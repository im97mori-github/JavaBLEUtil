package org.im97mori.ble.characteristic.u2a95;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Two Zone Heart Rate Limit (Characteristics UUID: 0x2A95)
 */
public class TwoZoneHeartRateLimit implements ByteArrayInterface {

    /**
     * Two zone Heart Rate Limit - Fat burn / Fitness Limit
     */
    private final int mTwoZoneHeartRateLimitFatBurnFitnessLimit;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A95
     */
    public TwoZoneHeartRateLimit(@NonNull byte[] values) {
        mTwoZoneHeartRateLimitFatBurnFitnessLimit = (values[0] & 0xff);
    }

    /**
     * Constructor from parameters
     * 
     * @param twoZoneHeartRateLimitFatBurnFitnessLimit Two zone Heart Rate Limit - Fat burn / Fitness Limit
     */
    public TwoZoneHeartRateLimit(int twoZoneHeartRateLimitFatBurnFitnessLimit) {
        mTwoZoneHeartRateLimitFatBurnFitnessLimit = twoZoneHeartRateLimitFatBurnFitnessLimit;
    }

    /**
     * @return Two zone Heart Rate Limit - Fat burn / Fitness Limit
     */
    public int getTwoZoneHeartRateLimitFatBurnFitnessLimit() {
        return mTwoZoneHeartRateLimitFatBurnFitnessLimit;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mTwoZoneHeartRateLimitFatBurnFitnessLimit);
        return data;
    }

}
