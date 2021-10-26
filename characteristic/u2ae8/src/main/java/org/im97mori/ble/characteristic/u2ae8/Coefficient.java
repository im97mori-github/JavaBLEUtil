package org.im97mori.ble.characteristic.u2ae8;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Coefficient (Characteristics UUID: 0x2AE8)
 */
public class Coefficient implements ByteArrayInterface {

    /**
     * Coefficient
     */
    private final Double mCoefficient;

    /**
     * {@code true}:ISO/IEEE Std. 11073-20601™-2008 FLOAT NRes (Not at this Resolution), {@code false}:ISO/IEEE Std. 11073-20601™-2008 FLOAT Reserved for future use
     */
    private final boolean mIsNres;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public Coefficient(@NonNull byte[] values) {
        if (BLEUtils.isFloatNan(values, 0)) {
            mCoefficient = Double.NaN;
            mIsNres = false;
        } else if (BLEUtils.isFloatNres(values, 0)) {
            mCoefficient = null;
            mIsNres = true;
        } else if (BLEUtils.isFloatPositiveInfinity(values, 0)) {
            mCoefficient = Double.POSITIVE_INFINITY;
            mIsNres = false;
        } else if (BLEUtils.isFloatNegativeInfinity(values, 0)) {
            mCoefficient = Double.NEGATIVE_INFINITY;
            mIsNres = false;
        } else if (BLEUtils.isFloatRfu(values, 0)) {
            mCoefficient = null;
            mIsNres = false;
        } else {
            mCoefficient = BLEUtils.createFloat(values, 0);
            mIsNres = false;
        }
    }

    /**
     * Constructor from parameters
     * 
     * @param coefficient coefficient
     */
    public Coefficient(@NonNull Double coefficient) {
        mCoefficient = coefficient;
        mIsNres = false;
    }

    /**
     * Constructor from parameters
     * 
     * @param isNres {@code true}:ISO/IEEE Std. 11073-20601™-2008 FLOAT NRes (Not at this Resolution), {@code false}:ISO/IEEE Std. 11073-20601™-2008 FLOAT Reserved for future use
     */
    public Coefficient(boolean isNres) {
        mCoefficient = null;
        mIsNres = isNres;
    }

    /**
     * @return {@code true}:ISO/IEEE Std. 11073-20601™-2008 FLOAT NRes (Not at this Resolution), {@code false}:ISO/IEEE Std. 11073-20601™-2008 FLOAT Reserved for future use
     */
    public Double getCoefficient() {
        return mCoefficient;
    }

    /**
     * @return isNres
     */
    public boolean isNres() {
        return mIsNres;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[4];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        if (mCoefficient == null) {
            if (mIsNres) {
                byteBuffer.putInt(BLEUtils.FLOAT_NRES);
            } else {
                byteBuffer.putInt(BLEUtils.FLOAT_RFU);
            }
        } else {
            byteBuffer.put(BLEUtils.floatToByteArray(mCoefficient));
        }
        return data;
    }

}
