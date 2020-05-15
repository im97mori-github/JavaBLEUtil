package org.im97mori.ble.characteristic.u2a8f;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Hip Circumference (Characteristics UUID: 0x2A8F)
 */
public class HipCircumference implements ByteArrayInterface {

    /**
     * Hip Circumference Unit 0.01 meters
     */
    public static final double HIP_CIRCUMFERENCE_RESOLUTION = 0.01d;

    /**
     * Hip Circumference
     */
    private final int mHipCircumference;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A8F
     */
    public HipCircumference(@NonNull byte[] values) {
        mHipCircumference = BLEUtils.createUInt16(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param hipCircumference Hip Circumference
     */
    public HipCircumference(int hipCircumference) {
        mHipCircumference = hipCircumference;
    }

    /**
     * @return Hip Circumference
     */
    public int getHipCircumference() {
        return mHipCircumference;
    }

    /**
     * @return Hip Circumference(meters)
     */
    public double getHipCircumferenceMeters() {
        return HIP_CIRCUMFERENCE_RESOLUTION * mHipCircumference;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mHipCircumference);
        return data;
    }

}
