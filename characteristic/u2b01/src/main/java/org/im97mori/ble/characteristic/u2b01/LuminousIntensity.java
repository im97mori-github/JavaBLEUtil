package org.im97mori.ble.characteristic.u2b01;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Luminous Intensity (Characteristics UUID: 0x2B01)
 */
public class LuminousIntensity implements ByteArrayInterface {

    /**
     * 0xFFFF : A value of 0xFFFF represents ‘value is not known’
     */
    public static final int LUMINOUS_INTENSITY_VALUE_IS_NOT_KNOWN = 0xFFFF;

    /**
     * Luminous Intensity Minimum value
     */
    public static final int LUMINOUS_INTENSITY_VALUE_MINIMUM = 0;

    /**
     * Luminous Intensity Maximum value
     */
    public static final int LUMINOUS_INTENSITY_VALUE_MAXIMUM = 65534;

    /**
     * Luminous Intensity
     */
    private final int mLuminousIntensity;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public LuminousIntensity(@NonNull byte[] values) {
        mLuminousIntensity = BLEUtils.createUInt16(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param luminousIntensity Luminous Intensity
     */
    public LuminousIntensity(int luminousIntensity) {
        mLuminousIntensity = luminousIntensity;
    }

    /**
     * @return Luminous Intensity
     */
    public int getLuminousIntensity() {
        return mLuminousIntensity;
    }

    /**
     * @return {@code true}:Luminous Intensity value is not known, {@code false}:has Luminous Intensity value information
     * @see #LUMINOUS_INTENSITY_VALUE_IS_NOT_KNOWN
     */
    public boolean isLuminousFluxValueIsNotKnown() {
        return LUMINOUS_INTENSITY_VALUE_IS_NOT_KNOWN == mLuminousIntensity;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mLuminousIntensity);
        byteBuffer.put((byte) (mLuminousIntensity >> 8));
        return data;
    }

}
