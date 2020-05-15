package org.im97mori.ble.characteristic.u2a8b;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Five Zone Heart Rate Limits (Characteristics UUID: 0x2A8B)
 */
public class FiveZoneHeartRateLimits implements ByteArrayInterface {

    /**
     * Five Zone Heart Rate Limits - Very light / Light Limit
     */
    private final int mFiveZoneHeartRateLimitsVeryLightLightLimit;

    /**
     * Five Zone Heart Rate Limits - Light / Moderate Limit
     */
    private final int mFiveZoneHeartRateLimitsLightModerateLimit;

    /**
     * Five Zone Heart Rate Limits - Moderate / Hard Limit
     */
    private final int mFiveZoneHeartRateLimitsModerateHardLimit;

    /**
     * Five Zone Heart Rate Limits - Hard / Maximum Limit
     */
    private final int mFiveZoneHeartRateLimitsHardMaximumLimit;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A8B
     */
    public FiveZoneHeartRateLimits(@NonNull byte[] values) {
        mFiveZoneHeartRateLimitsVeryLightLightLimit = (values[0] & 0xff);
        mFiveZoneHeartRateLimitsLightModerateLimit = (values[1] & 0xff);
        mFiveZoneHeartRateLimitsModerateHardLimit = (values[2] & 0xff);
        mFiveZoneHeartRateLimitsHardMaximumLimit = (values[3] & 0xff);
    }

    /**
     * Constructor from parameters
     * 
     * @param fiveZoneHeartRateLimitsVeryLightLightLimit Five Zone Heart Rate Limits - Very light / Light Limit
     * @param fiveZoneHeartRateLimitsLightModerateLimit  Five Zone Heart Rate Limits - Light / Moderate Limit
     * @param fiveZoneHeartRateLimitsModerateHardLimit   Five Zone Heart Rate Limits - Moderate / Hard Limit
     * @param fiveZoneHeartRateLimitsHardMaximumLimit    Five Zone Heart Rate Limits - Hard / Maximum Limit
     */
    public FiveZoneHeartRateLimits(int fiveZoneHeartRateLimitsVeryLightLightLimit, int fiveZoneHeartRateLimitsLightModerateLimit, int fiveZoneHeartRateLimitsModerateHardLimit, int fiveZoneHeartRateLimitsHardMaximumLimit) {
        mFiveZoneHeartRateLimitsVeryLightLightLimit = fiveZoneHeartRateLimitsVeryLightLightLimit;
        mFiveZoneHeartRateLimitsLightModerateLimit = fiveZoneHeartRateLimitsLightModerateLimit;
        mFiveZoneHeartRateLimitsModerateHardLimit = fiveZoneHeartRateLimitsModerateHardLimit;
        mFiveZoneHeartRateLimitsHardMaximumLimit = fiveZoneHeartRateLimitsHardMaximumLimit;
    }

    /**
     * @return Five Zone Heart Rate Limits - Very light / Light Limit
     */
    public int getFiveZoneHeartRateLimitsVeryLightLightLimit() {
        return mFiveZoneHeartRateLimitsVeryLightLightLimit;
    }

    /**
     * @return Five Zone Heart Rate Limits - Light / Moderate Limit
     */
    public int getFiveZoneHeartRateLimitsLightModerateLimit() {
        return mFiveZoneHeartRateLimitsLightModerateLimit;
    }

    /**
     * @return Five Zone Heart Rate Limits - Moderate / Hard Limit
     */
    public int getFiveZoneHeartRateLimitsModerateHardLimit() {
        return mFiveZoneHeartRateLimitsModerateHardLimit;
    }

    /**
     * @return Five Zone Heart Rate Limits - Hard / Maximum Limit
     */
    public int getFiveZoneHeartRateLimitsHardMaximumLimit() {
        return mFiveZoneHeartRateLimitsHardMaximumLimit;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[4];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mFiveZoneHeartRateLimitsVeryLightLightLimit);
        byteBuffer.put((byte) mFiveZoneHeartRateLimitsLightModerateLimit);
        byteBuffer.put((byte) mFiveZoneHeartRateLimitsModerateHardLimit);
        byteBuffer.put((byte) mFiveZoneHeartRateLimitsHardMaximumLimit);
        return data;
    }

}
