package org.im97mori.ble.characteristic.u2b1c;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Chromaticity Coordinate (Characteristics UUID: 0x2B1C)
 */
public class ChromaticityCoordinate implements ByteArrayInterface {

    /**
     * Chromaticity Coordinate
     */
    private final int mChromaticityCoordinate;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2B1C
     */
    public ChromaticityCoordinate(@NonNull byte[] values) {
        mChromaticityCoordinate = BLEUtils.createUInt16(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param chromaticityCoordinate Chromaticity Coordinate
     */
    public ChromaticityCoordinate(int chromaticityCoordinate) {
        mChromaticityCoordinate = chromaticityCoordinate;
    }

    /**
     * @return Chromaticity Coordinate
     */
    public int getChromaticityCoordinate() {
        return mChromaticityCoordinate;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mChromaticityCoordinate);
        return data;
    }

}
