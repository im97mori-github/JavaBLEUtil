package org.im97mori.ble.characteristic.u2b05;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Power (Characteristics UUID: 0x2B05)
 */
public class Power implements ByteArrayInterface {

    /**
     * Power
     */
    private final int mPower;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2B05
     */
    public Power(@NonNull byte[] values) {
        mPower = BLEUtils.createUInt24(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param power Power
     */
    public Power(int power) {
        mPower = power;
    }

    /**
     * @return Power
     */
    public int getPower() {
        return mPower;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[3];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mPower);
        byteBuffer.put((byte) (mPower >> 8));
        byteBuffer.put((byte) (mPower >> 16));
        return data;
    }

}
