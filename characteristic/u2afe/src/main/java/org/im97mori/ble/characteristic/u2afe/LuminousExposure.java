package org.im97mori.ble.characteristic.u2afe;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Luminous Exposure (Characteristics UUID: 0x2AFE)
 */
public class LuminousExposure implements ByteArrayInterface {

    /**
     * 0xFFFFFF : A raw value of 0xFFFFFF represents ‘value is not known’
     */
    public static final int LUMINOUS_EXPOSURE_VALUE_IS_NOT_KNOWN = 0xFFFFFF;

    /**
     * Unit is lumen hour with a resolution of 1000
     */
    public static final double LUMINOUS_EXPOSURE_VALUE_UNIT = 1000d;

    /**
     * Illuminance Minimum value
     */
    public static final double LUMINOUS_EXPOSURE_VALUE_MINIMUM = 0d;

    /**
     * Illuminance Maximum value
     */
    public static final double LUMINOUS_EXPOSURE_VALUE_MAXIMUM = 16777214000d;

    /**
     * Luminous Exposure
     */
    private final int mLuminousExposure;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2AFE
     */
    public LuminousExposure(@NonNull byte[] values) {
        mLuminousExposure = BLEUtils.createUInt24(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param luminousExposure Luminous Exposure
     */
    public LuminousExposure(int luminousExposure) {
        mLuminousExposure = luminousExposure;
    }

    /**
     * @return Luminous Exposure
     */
    public int getLuminousExposure() {
        return mLuminousExposure;
    }

    /**
     * @return {@code true}:Luminous Exposure value is not known, {@code false}:has Luminous Exposure value information
     * @see #LUMINOUS_EXPOSURE_VALUE_IS_NOT_KNOWN
     */
    public boolean isLuminousExposureValueIsNotKnown() {
        return LUMINOUS_EXPOSURE_VALUE_IS_NOT_KNOWN == mLuminousExposure;
    }

    /**
     * @return Luminous Exposure(lux hour)
     */
    public double getLuminousExposureLumenHour() {
        double luminousExposureLuxHour = mLuminousExposure * LUMINOUS_EXPOSURE_VALUE_UNIT;
        if (luminousExposureLuxHour < LUMINOUS_EXPOSURE_VALUE_MINIMUM) {
            luminousExposureLuxHour = LUMINOUS_EXPOSURE_VALUE_MINIMUM;
        } else if (luminousExposureLuxHour > LUMINOUS_EXPOSURE_VALUE_MAXIMUM) {
            luminousExposureLuxHour = LUMINOUS_EXPOSURE_VALUE_MAXIMUM;
        }
        return luminousExposureLuxHour;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[3];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mLuminousExposure);
        byteBuffer.put((byte) (mLuminousExposure >> 8));
        byteBuffer.put((byte) (mLuminousExposure >> 16));
        return data;
    }

}
