package org.im97mori.ble.characteristic.u2a75;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Pollen Concentration (Characteristics UUID: 0x2A75)
 */
public class PollenConcentration implements ByteArrayInterface {

    /**
     * Pollen Concentration
     */
    private final int mPollenConcentration;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A75
     */
    public PollenConcentration(@NonNull byte[] values) {
        mPollenConcentration = BLEUtils.createUInt24(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param pollenConcentration Pollen Concentration
     */
    public PollenConcentration(int pollenConcentration) {
        mPollenConcentration = pollenConcentration;
    }

    /**
     * @return Pollen Concentration
     */
    public int getPollenConcentration() {
        return mPollenConcentration;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[3];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mPollenConcentration);
        byteBuffer.put((byte) (mPollenConcentration >> 8));
        byteBuffer.put((byte) (mPollenConcentration >> 16));
        return data;
    }

}
