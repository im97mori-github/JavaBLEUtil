package org.im97mori.ble.characteristic.u2b4c;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Four Zone Heart Rate Limits (Characteristics UUID: 0x2B4C)
 */
public class FourZoneHeartRateLimits implements ByteArrayInterface {

    /**
     * Four Zone Heart Rate Limits - Light / Moderate Limit
     */
    private final int mFourZoneHeartRateLimitsLightModerateLimit;

    /**
     * Four Zone Heart Rate Limits - Moderate / Hard Limit
     */
    private final int mFourZoneHeartRateLimitsModerateHardLimit;

    /**
     * Four Zone Heart Rate Limits - Hard / Maximum Limit
     */
    private final int mFourZoneHeartRateLimitsHardMaximumLimit;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href=
     *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public FourZoneHeartRateLimits(@NonNull byte[] values) {
        mFourZoneHeartRateLimitsLightModerateLimit = BLEUtils.createUInt8(values, 0);
        mFourZoneHeartRateLimitsModerateHardLimit = BLEUtils.createUInt8(values, 1);
        mFourZoneHeartRateLimitsHardMaximumLimit = BLEUtils.createUInt8(values, 2);
    }

    /**
     * Constructor from parameters
     * 
     * @param fourZoneHeartRateLimitsLightModerateLimit Five Zone Heart Rate Limits - Very light / Light Limit
     * @param fourZoneHeartRateLimitsModerateHardLimit  Five Zone Heart Rate Limits - Light / Moderate Limit
     * @param fourZoneHeartRateLimitsHardMaximumLimit   Five Zone Heart Rate Limits - Moderate / Hard Limit
     */
    public FourZoneHeartRateLimits(int fourZoneHeartRateLimitsLightModerateLimit,
            int fourZoneHeartRateLimitsModerateHardLimit, int fourZoneHeartRateLimitsHardMaximumLimit) {
        mFourZoneHeartRateLimitsLightModerateLimit = fourZoneHeartRateLimitsLightModerateLimit;
        mFourZoneHeartRateLimitsModerateHardLimit = fourZoneHeartRateLimitsModerateHardLimit;
        mFourZoneHeartRateLimitsHardMaximumLimit = fourZoneHeartRateLimitsHardMaximumLimit;
    }

    /**
     * @return Four Zone Heart Rate Limits - Light / Moderate Limit
     */
    public int getFourZoneHeartRateLimitsLightModerateLimit() {
        return mFourZoneHeartRateLimitsLightModerateLimit;
    }

    /**
     * @return Four Zone Heart Rate Limits - Moderate / Hard Limit
     */
    public int getFourZoneHeartRateLimitsModerateHardLimit() {
        return mFourZoneHeartRateLimitsModerateHardLimit;
    }

    /**
     * @return Four Zone Heart Rate Limits - Hard / Maximum Limit
     */
    public int getFourZoneHeartRateLimitsHardMaximumLimit() {
        return mFourZoneHeartRateLimitsHardMaximumLimit;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[3];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mFourZoneHeartRateLimitsLightModerateLimit);
        byteBuffer.put((byte) mFourZoneHeartRateLimitsModerateHardLimit);
        byteBuffer.put((byte) mFourZoneHeartRateLimitsHardMaximumLimit);
        return data;
    }

}
