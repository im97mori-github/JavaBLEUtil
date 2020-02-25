package org.im97mori.ble.characteristic.u2a71;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * True Wind Direction (Characteristics UUID: 0x2A71)
 */
public class TrueWindDirection implements ByteArrayInterface {

    /**
     * True Wind Direction Unit 0.01 degrees
     */
    public static final double TRUE_WIND_DIRECTION_RESOLUTION = 0.01d;

    /**
     * True Wind Direction
     */
    private final int mTrueWindDirection;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A71
     */
    public TrueWindDirection(@NonNull byte[] values) {
        mTrueWindDirection = BLEUtils.createUInt16(values, 0);
    }

    /**
     * @return True Wind Direction
     */
    public int getTrueWindDirection() {
        return mTrueWindDirection;
    }

    /**
     * @return True Wind Direction(degrees)
     */
    public double getTrueWindDirectionDegrees() {
        return TRUE_WIND_DIRECTION_RESOLUTION * mTrueWindDirection;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mTrueWindDirection);
        return data;
    }

}
