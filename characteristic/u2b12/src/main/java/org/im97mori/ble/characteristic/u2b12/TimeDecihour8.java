package org.im97mori.ble.characteristic.u2b12;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Time Decihour 8 (Characteristics UUID: 0x2B12)
 */
public class TimeDecihour8 implements ByteArrayInterface {

    /**
     * Time Decihour 8
     */
    private final int mTimeDecihour8;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2B12
     */
    public TimeDecihour8(@NonNull byte[] values) {
        mTimeDecihour8 = BLEUtils.createUInt8(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param timeDecihour8 Time Decihour 8
     */
    public TimeDecihour8(int timeDecihour8) {
        mTimeDecihour8 = timeDecihour8;
    }

    /**
     * @return Time Decihour 8
     */
    public int getTimeDecihour8() {
        return mTimeDecihour8;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mTimeDecihour8);
        return data;
    }

}
