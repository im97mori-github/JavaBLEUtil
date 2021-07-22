package org.im97mori.ble.characteristic.u2b04;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Percentage 8 (Characteristics UUID: 0x2B04)
 */
public class Percentage8 implements ByteArrayInterface {

    /**
     * Percentage 8
     */
    private final int mPercentage8;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2B04
     */
    public Percentage8(@NonNull byte[] values) {
        mPercentage8 = BLEUtils.createUInt8(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param percentage8 Percentage 8
     */
    public Percentage8(int percentage8) {
        mPercentage8 = percentage8;
    }

    /**
     * @return Percentage 8
     */
    public int getPercentage8() {
        return mPercentage8;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mPercentage8);
        return data;
    }

}
