package org.im97mori.ble.characteristic.u2ab4;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Uncertainty (Characteristics UUID: 0x2AB4)
 */
public class Uncertainty implements ByteArrayInterface {

    /**
     * Uncertainty
     */
    private final int mUncertainty;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2AB4
     */
    public Uncertainty(@NonNull byte[] values) {
        mUncertainty = (values[0] & 0xff);
    }

    /**
     * Constructor from parameters
     * 
     * @param uncertainty Uncertainty
     */
    public Uncertainty(int uncertainty) {
        mUncertainty = uncertainty;
    }

    /**
     * @return Uncertainty
     */
    public int getUncertainty() {
        return mUncertainty;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mUncertainty);
        return data;
    }

}
