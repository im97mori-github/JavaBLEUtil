package org.im97mori.ble.characteristic.u2b03;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Perceived Lightness (Characteristics UUID: 0x2B03)
 */
public class PerceivedLightness implements ByteArrayInterface {

    /**
     * Perceived Lightness Minimum value
     */
    public static final int PERCEIVED_LIGHTNESS_VALUE_MINIMUM = 0;

    /**
     * Perceived Lightness Maximum value
     */
    public static final int PERCEIVED_LIGHTNESS_VALUE_MAXIMUM = 65535;

    /**
     * Perceived Lightness
     */
    private final int mPerceivedLightness;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public PerceivedLightness(@NonNull byte[] values) {
        mPerceivedLightness = BLEUtils.createUInt16(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param perceivedLightness Perceived Lightness
     */
    public PerceivedLightness(int perceivedLightness) {
        mPerceivedLightness = perceivedLightness;
    }

    /**
     * @return Perceived Lightness
     */
    public int getPerceivedLightness() {
        return mPerceivedLightness;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mPerceivedLightness);
        byteBuffer.put((byte) (mPerceivedLightness >> 8));
        return data;
    }

}
