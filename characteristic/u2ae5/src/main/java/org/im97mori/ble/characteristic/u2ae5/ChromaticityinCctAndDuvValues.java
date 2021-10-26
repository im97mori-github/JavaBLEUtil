package org.im97mori.ble.characteristic.u2ae5;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Chromaticity in CCT And Duv Values (Characteristics UUID: 0x2AE5)
 */
public class ChromaticityinCctAndDuvValues implements ByteArrayInterface {

    /**
     * Correlated Color Temperature
     */
    private final int mCorrelatedColorTemperature;

    /**
     * Chromaticity Distance from Planckian
     */
    private final int mChromaticityDistanceFromPlanckian;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public ChromaticityinCctAndDuvValues(@NonNull byte[] values) {
        mCorrelatedColorTemperature = BLEUtils.createUInt16(values, 0);
        mChromaticityDistanceFromPlanckian = BLEUtils.createSInt16(values, 2);
    }

    /**
     * Constructor from parameters
     * 
     * @param correlatedColorTemperature Correlated Color Temperature
     * @param chromaticityDistanceFromPlanckian Chromaticity Distance from Planckian
     */
    public ChromaticityinCctAndDuvValues(int correlatedColorTemperature, int chromaticityDistanceFromPlanckian) {
        mCorrelatedColorTemperature = correlatedColorTemperature;
        mChromaticityDistanceFromPlanckian = chromaticityDistanceFromPlanckian;
    }

    /**
     * @return Correlated Color Temperature
     */
    public int getCorrelatedColorTemperature() {
        return mCorrelatedColorTemperature;
    }

    /**
     * @return Chromaticity Distance from Planckian
     */
    public int getChromaticityDistanceFromPlanckian() {
        return mChromaticityDistanceFromPlanckian;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[4];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mCorrelatedColorTemperature);
        byteBuffer.putShort((short) mChromaticityDistanceFromPlanckian);
        return data;
    }

}
