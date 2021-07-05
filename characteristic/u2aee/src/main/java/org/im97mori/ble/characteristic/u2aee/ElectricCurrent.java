package org.im97mori.ble.characteristic.u2aee;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Electric Current (Characteristics UUID: 0x2AEE)
 */
public class ElectricCurrent implements ByteArrayInterface {

    /**
     * Current
     */
    private final int mCurrent;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2AEE
     */
    public ElectricCurrent(@NonNull byte[] values) {
        mCurrent = BLEUtils.createUInt16(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param current Current
     */
    public ElectricCurrent(int current) {
        mCurrent = current;
    }

    /**
     * @return Current
     */
    public int getCurrent() {
        return mCurrent;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mCurrent);
        return data;
    }

}
