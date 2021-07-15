package org.im97mori.ble.characteristic.u2af2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Energy (Characteristics UUID: 0x2AF2)
 */
public class Energy implements ByteArrayInterface {

    /**
     * Energy
     */
    private final int mEnergy;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2AF2
     */
    public Energy(@NonNull byte[] values) {
        mEnergy = BLEUtils.createUInt24(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param energy Energy
     */
    public Energy(int energy) {
        mEnergy = energy;
    }

    /**
     * @return Energy
     */
    public int getEnergy() {
        return mEnergy;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[3];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mEnergy);
        byteBuffer.put((byte) (mEnergy >> 8));
        byteBuffer.put((byte) (mEnergy >> 16));
        return data;
    }

}
