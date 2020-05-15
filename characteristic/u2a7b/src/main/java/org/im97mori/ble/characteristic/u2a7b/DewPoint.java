package org.im97mori.ble.characteristic.u2a7b;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Dew Point (Characteristics UUID: 0x2A7B)
 */
public class DewPoint implements ByteArrayInterface {

    /**
     * Dew Point
     */
    private final int mDewPoint;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A7B
     */
    public DewPoint(@NonNull byte[] values) {
        mDewPoint = BLEUtils.createSInt8(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param dewPoint Dew Point
     */
    public DewPoint(int dewPoint) {
        mDewPoint = dewPoint;
    }

    /**
     * @return Dew Point
     */
    public int getDewPoint() {
        return mDewPoint;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mDewPoint);
        return data;
    }

}
