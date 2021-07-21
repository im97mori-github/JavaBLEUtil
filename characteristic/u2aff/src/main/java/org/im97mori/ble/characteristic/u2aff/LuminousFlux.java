package org.im97mori.ble.characteristic.u2aff;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Luminous Flux (Characteristics UUID: 0x2AFF)
 */
public class LuminousFlux implements ByteArrayInterface {

    /**
     * Luminous Flux
     */
    private final int mLuminousFlux;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2AFF
     */
    public LuminousFlux(@NonNull byte[] values) {
        mLuminousFlux = BLEUtils.createUInt16(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param luminousFlux Luminous Flux
     */
    public LuminousFlux(int luminousFlux) {
        mLuminousFlux = luminousFlux;
    }

    /**
     * @return Luminous Flux
     */
    public int getLuminousFlux() {
        return mLuminousFlux;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mLuminousFlux);
        byteBuffer.put((byte) (mLuminousFlux >> 8));
        return data;
    }

}
