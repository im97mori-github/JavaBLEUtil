package org.im97mori.ble.characteristic.u2afd;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Luminous Energy (Characteristics UUID: 0x2AFD)
 */
public class LuminousEnergy implements ByteArrayInterface {

    /**
     * 0xFFFFFF : A raw value of 0xFFFFFF represents ‘value is not known’
     */
    public static final int LUMINOUS_ENERGY_VALUE_IS_NOT_KNOWN = 0xFFFFFF;

    /**
     * Unit is lumen hour with a resolution of 1000
     */
    public static final double LUMINOUS_ENERGY_VALUE_UNIT = 1000d;

    /**
     * Luminous Energy Minimum value
     */
    public static final double LUMINOUS_ENERGY_VALUE_MINIMUM = 0d;

    /**
     * Luminous Energy Maximum value
     */
    public static final double LUMINOUS_ENERGY_VALUE_MAXIMUM = 16777214000d;

    /**
     * Luminous Energy
     */
    private final int mLuminousEnergy;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2AFD
     */
    public LuminousEnergy(@NonNull byte[] values) {
        mLuminousEnergy = BLEUtils.createUInt24(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param luminousEnergy Luminous Energy
     */
    public LuminousEnergy(int luminousEnergy) {
        mLuminousEnergy = luminousEnergy;
    }

    /**
     * @return Luminous Energy
     */
    public int getLuminousEnergy() {
        return mLuminousEnergy;
    }

    /**
     * @return {@code true}:Luminous Energy value is not known, {@code false}:has Luminous Energy value information
     * @see #LUMINOUS_ENERGY_VALUE_IS_NOT_KNOWN
     */
    public boolean isLuminousEnergyValueIsNotKnown() {
        return LUMINOUS_ENERGY_VALUE_IS_NOT_KNOWN == mLuminousEnergy;
    }

    /**
     * @return Luminous Energy(lumen hour)
     */
    public double getLuminousEnergyLumenHour() {
        double luminousEfficacyLumenHour = mLuminousEnergy * LUMINOUS_ENERGY_VALUE_UNIT;
        if (luminousEfficacyLumenHour < LUMINOUS_ENERGY_VALUE_MINIMUM) {
            luminousEfficacyLumenHour = LUMINOUS_ENERGY_VALUE_MINIMUM;
        } else if (luminousEfficacyLumenHour > LUMINOUS_ENERGY_VALUE_MAXIMUM) {
            luminousEfficacyLumenHour = LUMINOUS_ENERGY_VALUE_MAXIMUM;
        }
        return luminousEfficacyLumenHour;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[3];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mLuminousEnergy);
        byteBuffer.put((byte) (mLuminousEnergy >> 8));
        byteBuffer.put((byte) (mLuminousEnergy >> 16));
        return data;
    }

}
