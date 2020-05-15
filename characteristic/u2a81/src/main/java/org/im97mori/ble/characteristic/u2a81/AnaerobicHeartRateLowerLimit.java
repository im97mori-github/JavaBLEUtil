package org.im97mori.ble.characteristic.u2a81;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Anaerobic Heart Rate Lower Limit (Characteristics UUID: 0x2A81)
 */
public class AnaerobicHeartRateLowerLimit implements ByteArrayInterface {

    /**
     * Anaerobic Heart Rate Lower Limit
     */
    private final int mAnaerobicHeartRateLowerLimit;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A81
     */
    public AnaerobicHeartRateLowerLimit(@NonNull byte[] values) {
        mAnaerobicHeartRateLowerLimit = (values[0] & 0xff);
    }

    /**
     * Constructor from parameters
     * 
     * @param anaerobicHeartRateLowerLimit Anaerobic Heart Rate Lower Limit
     */
    public AnaerobicHeartRateLowerLimit(int anaerobicHeartRateLowerLimit) {
        mAnaerobicHeartRateLowerLimit = anaerobicHeartRateLowerLimit;
    }

    /**
     * @return Anaerobic Heart Rate Lower Limit
     */
    public int getAnaerobicHeartRateLowerLimit() {
        return mAnaerobicHeartRateLowerLimit;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mAnaerobicHeartRateLowerLimit);
        return data;
    }

}
