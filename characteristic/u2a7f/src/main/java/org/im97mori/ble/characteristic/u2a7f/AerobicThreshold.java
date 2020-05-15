package org.im97mori.ble.characteristic.u2a7f;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Aerobic Threshold (Characteristics UUID: 0x2A7F)
 */
public class AerobicThreshold implements ByteArrayInterface {

    /**
     * Aerobic Threshold
     */
    private final int mAerobicThreshold;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A7F
     */
    public AerobicThreshold(@NonNull byte[] values) {
        mAerobicThreshold = (values[0] & 0xff);
    }

    /**
     * Constructor from parameters
     * 
     * @param aerobicThreshold Aerobic Threshold
     */
    public AerobicThreshold(int aerobicThreshold) {
        mAerobicThreshold = aerobicThreshold;
    }

    /**
     * @return Aerobic Threshold
     */
    public int getAerobicThreshold() {
        return mAerobicThreshold;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mAerobicThreshold);
        return data;
    }

}
