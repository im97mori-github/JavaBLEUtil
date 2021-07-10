package org.im97mori.ble.characteristic.u2ae6;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Chromaticity Tolerance (Characteristics UUID: 0x2AE6)
 */
public class ChromaticityTolerance implements ByteArrayInterface {

    /**
     * Unit is volt with a resolution of 1/64V
     */
    public static final double CHROMATICITY_VALUE_UNIT = 0.0001d;

    /**
     * Chromaticity Tolerance Minimum value
     */
    public static final double CHROMATICITY_VALUE_MINIMUM = 0.0d;

    /**
     * Chromaticity Tolerance Maximum value
     */
    public static final double CHROMATICITY_VALUE_MAXIMUM = 0.0255d;

    /**
     * Chromaticity Tolerance
     */
    private final int mChromaticityTolerance;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2AE6
     */
    public ChromaticityTolerance(@NonNull byte[] values) {
        mChromaticityTolerance = BLEUtils.createUInt8(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param chromaticityTolerance Chromaticity Tolerance
     */
    public ChromaticityTolerance(int chromaticityTolerance) {
        mChromaticityTolerance = chromaticityTolerance;
    }

    /**
     * @return Chromaticity Tolerance
     */
    public int getChromaticityTolerance() {
        return mChromaticityTolerance;
    }

    /**
     * @return Chromaticity Tolerance with Unit
     */
    public double getChromaticityToleranceWithUnit() {
        return CHROMATICITY_VALUE_UNIT * mChromaticityTolerance;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mChromaticityTolerance);
        return data;
    }

}
