package org.im97mori.ble.characteristic.u2a6d;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Pressure (Characteristics UUID: 0x2A6D)
 */
public class Pressure implements ByteArrayInterface {

    /**
     * Pressure Unit 0.1 pascals
     */
    public static final double PRESSURE_RESOLUTION = 0.1d;

    /**
     * Pressure
     */
    private final long mPressure;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A6D
     */
    public Pressure(@NonNull byte[] values) {
        mPressure = BLEUtils.createUInt32(values, 0);
    }

    /**
     * @return Pressure
     */
    public long getPressure() {
        return mPressure;
    }

    /**
     * @return Pressure(pascals)
     */
    public double getPressurePascals() {
        return PRESSURE_RESOLUTION * mPressure;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[4];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putInt((int) mPressure);
        return data;
    }

}
