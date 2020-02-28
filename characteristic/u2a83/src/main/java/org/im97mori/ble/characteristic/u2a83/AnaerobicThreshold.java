package org.im97mori.ble.characteristic.u2a83;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Anaerobic Threshold (Characteristics UUID: 0x2A83)
 */
public class AnaerobicThreshold implements ByteArrayInterface {

    /**
     * Anaerobic Threshold
     */
    private final int mAnaerobicThreshold;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A83
     */
    public AnaerobicThreshold(@NonNull byte[] values) {
        mAnaerobicThreshold = (values[0] & 0xff);
    }

    /**
     * @return Anaerobic Threshold
     */
    public int getAnaerobicThreshold() {
        return mAnaerobicThreshold;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mAnaerobicThreshold);
        return data;
    }

}
