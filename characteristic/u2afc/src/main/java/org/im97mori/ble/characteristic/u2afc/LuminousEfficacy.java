package org.im97mori.ble.characteristic.u2afc;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Luminous Efficacy (Characteristics UUID: 0x2AFC)
 */
public class LuminousEfficacy implements ByteArrayInterface {

    /**
     * 0xFFFF : A raw value of 0xFFFF represents ‘value is not known’
     */
    public static final int LUMINOUS_EFFICACY_VALUE_IS_NOT_KNOWN = 0xFFFF;

    /**
     * Unit is lumen per watt with a resolution of 0.01
     */
    public static final double LUMINOUS_EFFICACY_VALUE_UNIT = 0.1d;

    /**
     * Illuminance Minimum value
     */
    public static final double LUMINOUS_EFFICACY_VALUE_MINIMUM = 0d;

    /**
     * Illuminance Maximum value
     */
    public static final double LUMINOUS_EFFICACY_VALUE_MAXIMUM = 1800d;

    /**
     * Luminous Efficacy
     */
    private final int mLuminousEfficacy;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2AFC
     */
    public LuminousEfficacy(@NonNull byte[] values) {
        mLuminousEfficacy = BLEUtils.createUInt16(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param luminousEfficacy Luminous Efficacy
     */
    public LuminousEfficacy(int luminousEfficacy) {
        mLuminousEfficacy = luminousEfficacy;
    }

    /**
     * @return Luminous Efficacy
     */
    public int getLuminousEfficacy() {
        return mLuminousEfficacy;
    }

    /**
     * @return {@code true}:Luminous Efficacy value is not known, {@code false}:has Luminous Efficacy value information
     * @see #LUMINOUS_EFFICACY_VALUE_IS_NOT_KNOWN
     */
    public boolean isLuminousEfficacyValueIsNotKnown() {
        return LUMINOUS_EFFICACY_VALUE_IS_NOT_KNOWN == mLuminousEfficacy;
    }

    /**
     * @return Luminous Efficacy(lumen per watt)
     */
    public double getLuminousEfficacyLumenPerWatt() {
        double luminousEfficacyLumenPerWatt = mLuminousEfficacy * LUMINOUS_EFFICACY_VALUE_UNIT;
        if (luminousEfficacyLumenPerWatt < LUMINOUS_EFFICACY_VALUE_MINIMUM) {
            luminousEfficacyLumenPerWatt = LUMINOUS_EFFICACY_VALUE_MINIMUM;
        } else if (luminousEfficacyLumenPerWatt > LUMINOUS_EFFICACY_VALUE_MAXIMUM) {
            luminousEfficacyLumenPerWatt = LUMINOUS_EFFICACY_VALUE_MAXIMUM;
        }
        return luminousEfficacyLumenPerWatt;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mLuminousEfficacy);
        byteBuffer.put((byte) (mLuminousEfficacy >> 8));
        return data;
    }

}
