package org.im97mori.ble.characteristic.u2a70;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * True Wind Speed (Characteristics UUID: 0x2A70)
 */
public class TrueWindSpeed implements ByteArrayInterface {

    /**
     * True Wind Speed Unit 0.01 meters per second
     */
    public static final double TRUE_WIND_SPEED_RESOLUTION = 0.01d;

    /**
     * True Wind Speed
     */
    private final int mTrueWindSpeed;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A70
     */
    public TrueWindSpeed(@NonNull byte[] values) {
        mTrueWindSpeed = BLEUtils.createUInt16(values, 0);
    }

    /**
     * @return True Wind Speed
     */
    public int getTrueWindSpeed() {
        return mTrueWindSpeed;
    }

    /**
     * @return True Wind Speed(meters per second)
     */
    public double getTrueWindSpeedMetersPerSecond() {
        return TRUE_WIND_SPEED_RESOLUTION * mTrueWindSpeed;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mTrueWindSpeed);
        return data;
    }

}
