package org.im97mori.ble.characteristic.u2a8e;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Height (Characteristics UUID: 0x2A8E)
 */
public class Height implements ByteArrayInterface {

    /**
     * Height Unit 0.01 meters
     */
    public static final double HEIGHT_RESOLUTION = 0.01d;

    /**
     * Height
     */
    private final int mHeight;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A8E
     */
    public Height(@NonNull byte[] values) {
        mHeight = BLEUtils.createUInt16(values, 0);
    }

    /**
     * @return Height
     */
    public int getHeight() {
        return mHeight;
    }

    /**
     * @return Height(meters)
     */
    public double getHeightMeters() {
        return HEIGHT_RESOLUTION * mHeight;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mHeight);
        return data;
    }

}
