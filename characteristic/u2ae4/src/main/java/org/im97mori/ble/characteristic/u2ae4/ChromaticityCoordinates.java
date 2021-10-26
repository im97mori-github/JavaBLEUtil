package org.im97mori.ble.characteristic.u2ae4;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Chromaticity Coordinates (Characteristics UUID: 0x2AE4)
 */
public class ChromaticityCoordinates implements ByteArrayInterface {

    /**
     * Chromaticity x-coordinate
     */
    private final int mChromaticityXCoordinate;

    /**
     * Chromaticity y-coordinate
     */
    private final int mChromaticityYCoordinate;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public ChromaticityCoordinates(@NonNull byte[] values) {
        mChromaticityXCoordinate = BLEUtils.createUInt16(values, 0);
        mChromaticityYCoordinate = BLEUtils.createUInt16(values, 2);
    }

    /**
     * Constructor from parameters
     * 
     * @param chromaticityXCoordinate Chromaticity x-coordinate
     * @param chromaticityYCoordinate Chromaticity y-coordinate
     */
    public ChromaticityCoordinates(int chromaticityXCoordinate, int chromaticityYCoordinate) {
        mChromaticityXCoordinate = chromaticityXCoordinate;
        mChromaticityYCoordinate = chromaticityYCoordinate;
    }

    /**
     * @return Chromaticity x-coordinate
     */
    public int getChromaticityXCoordinate() {
        return mChromaticityXCoordinate;
    }

    /**
     * @return Chromaticity y-coordinate
     */
    public int getChromaticityYCoordinate() {
        return mChromaticityYCoordinate;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[4];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mChromaticityXCoordinate);
        byteBuffer.putShort((short) mChromaticityYCoordinate);
        return data;
    }

}
