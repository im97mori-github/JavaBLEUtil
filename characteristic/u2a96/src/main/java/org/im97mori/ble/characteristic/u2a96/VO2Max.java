package org.im97mori.ble.characteristic.u2a96;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * VO2 Max (Characteristics UUID: 0x2A96)
 */
public class VO2Max implements ByteArrayInterface {

    /**
     * VO2 Max
     */
    private final int mVo2Max;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A96
     */
    public VO2Max(@NonNull byte[] values) {
        mVo2Max = (values[0] & 0xff);
    }

    /**
     * @return VO2 Max
     */
    public int getVo2Max() {
        return mVo2Max;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mVo2Max);
        return data;
    }

}
