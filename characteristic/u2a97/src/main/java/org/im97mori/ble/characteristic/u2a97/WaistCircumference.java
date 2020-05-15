package org.im97mori.ble.characteristic.u2a97;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Waist Circumference (Characteristics UUID: 0x2A97)
 */
public class WaistCircumference implements ByteArrayInterface {

    /**
     * Waist Circumference Unit 0.01 meters
     */
    public static final double WAIST_CIRCUMFERENCE_RESOLUTION = 0.01;

    /**
     * Waist Circumference
     */
    private final int mWaistCircumference;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A97
     */
    public WaistCircumference(@NonNull byte[] values) {
        mWaistCircumference = BLEUtils.createUInt16(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param waistCircumference Waist Circumference
     */
    public WaistCircumference(int waistCircumference) {
        mWaistCircumference = waistCircumference;
    }

    /**
     * @return Waist Circumference
     */
    public int getWaistCircumference() {
        return mWaistCircumference;
    }

    /**
     * @return Waist Circumference(meters)
     */
    public double getWaistCircumferenceMeters() {
        return WAIST_CIRCUMFERENCE_RESOLUTION * mWaistCircumference;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mWaistCircumference);
        return data;
    }

}
