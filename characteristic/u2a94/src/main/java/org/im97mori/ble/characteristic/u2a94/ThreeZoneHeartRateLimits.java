package org.im97mori.ble.characteristic.u2a94;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Three Zone Heart Rate Limits (Characteristics UUID: 0x2A94)
 */
public class ThreeZoneHeartRateLimits implements ByteArrayInterface {

    /**
     * Three zone Heart Rate Limits - Light (Fat burn) / Moderate (Aerobic) Limit
     */
    private final int mThreeZoneHeartRateLimitsLightFatBurnModerateAerobicLimit;

    /**
     * Three zone Heart Rate Limits - Moderate (Aerobic) / Hard (Anaerobic) Limit
     */
    private final int mThreeZoneHeartRateLimitsModerateAerobicHardAnaerobicLimit;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public ThreeZoneHeartRateLimits(@NonNull byte[] values) {
        mThreeZoneHeartRateLimitsLightFatBurnModerateAerobicLimit = (values[0] & 0xff);
        mThreeZoneHeartRateLimitsModerateAerobicHardAnaerobicLimit = (values[1] & 0xff);
    }

    /**
     * Constructor from parameters
     * 
     * @param threeZoneHeartRateLimitsLightFatBurnModerateAerobicLimit  Three zone Heart Rate Limits - Light (Fat burn) / Moderate (Aerobic) Limit
     * @param threeZoneHeartRateLimitsModerateAerobicHardAnaerobicLimit Three zone Heart Rate Limits - Moderate (Aerobic) / Hard (Anaerobic) Limit
     */
    public ThreeZoneHeartRateLimits(int threeZoneHeartRateLimitsLightFatBurnModerateAerobicLimit, int threeZoneHeartRateLimitsModerateAerobicHardAnaerobicLimit) {
        mThreeZoneHeartRateLimitsLightFatBurnModerateAerobicLimit = threeZoneHeartRateLimitsLightFatBurnModerateAerobicLimit;
        mThreeZoneHeartRateLimitsModerateAerobicHardAnaerobicLimit = threeZoneHeartRateLimitsModerateAerobicHardAnaerobicLimit;
    }

    /**
     * @return Three zone Heart Rate Limits - Light (Fat burn) / Moderate (Aerobic) Limit
     */
    public int getThreeZoneHeartRateLimitsLightFatBurnModerateAerobicLimit() {
        return mThreeZoneHeartRateLimitsLightFatBurnModerateAerobicLimit;
    }

    /**
     * @return Three zone Heart Rate Limits - Moderate (Aerobic) / Hard (Anaerobic) Limit
     */
    public int getThreeZoneHeartRateLimitsModerateAerobicHardAnaerobicLimit() {
        return mThreeZoneHeartRateLimitsModerateAerobicHardAnaerobicLimit;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mThreeZoneHeartRateLimitsLightFatBurnModerateAerobicLimit);
        byteBuffer.put((byte) mThreeZoneHeartRateLimitsModerateAerobicHardAnaerobicLimit);
        return data;
    }

}
