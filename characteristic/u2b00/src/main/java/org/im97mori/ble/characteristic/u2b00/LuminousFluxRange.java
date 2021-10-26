package org.im97mori.ble.characteristic.u2b00;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Luminous Flux Range (Characteristics UUID: 0x2B00)
 */
public class LuminousFluxRange implements ByteArrayInterface {

    /**
     * Minimum Luminous Flux
     */
    private final int mMinimumLuminousFlux;

    /**
     * Maximum Luminous Flux
     */
    private final int mMaximumLuminousFlux;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public LuminousFluxRange(@NonNull byte[] values) {
        mMinimumLuminousFlux = BLEUtils.createUInt16(values, 0);
        mMaximumLuminousFlux = BLEUtils.createUInt16(values, 2);
    }

    /**
     * Constructor from parameters
     * 
     * @param minimumLuminousFlux Minimum Luminous Flux
     * @param maximumLuminousFlux Maximum Luminous Flux
     */
    public LuminousFluxRange(int minimumLuminousFlux, int maximumLuminousFlux) {
        mMinimumLuminousFlux = minimumLuminousFlux;
        mMaximumLuminousFlux = maximumLuminousFlux;
    }

    /**
     * @return Minimum Luminous Flux
     */
    public int getMinimumLuminousFlux() {
        return mMinimumLuminousFlux;
    }

    /**
     * @return Maximum Luminous Flux
     */
    public int getMaximumLuminousFlux() {
        return mMaximumLuminousFlux;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[4];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mMinimumLuminousFlux);
        byteBuffer.put((byte) (mMinimumLuminousFlux >> 8));
        byteBuffer.put((byte) mMaximumLuminousFlux);
        byteBuffer.put((byte) (mMaximumLuminousFlux >> 8));
        return data;
    }

}
