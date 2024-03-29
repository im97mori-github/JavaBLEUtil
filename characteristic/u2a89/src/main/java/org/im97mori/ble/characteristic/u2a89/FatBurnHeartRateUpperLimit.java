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
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public FatBurnHeartRateUpperLimit(@NonNull byte[] values) {
        mFatBurnHeartRateUpperLimit = (values[0] & 0xff);
    }

    /**
     * Constructor from parameters
     * 
     * @param fatBurnHeartRateUpperLimit Fat Burn Heart Rate Upper Limit
     */
    public FatBurnHeartRateUpperLimit(int fatBurnHeartRateUpperLimit) {
        mFatBurnHeartRateUpperLimit = fatBurnHeartRateUpperLimit;
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
