package org.im97mori.ble.characteristic.u2a2c;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Magnetic Declination (Characteristics UUID: 0x2A2C)
 */
public class MagneticDeclination implements ByteArrayInterface {

    /**
     * Magnetic Declination Unit 0.01 degrees
     */
    public static final double MAGNETIC_DECLINATION_RESOLUTION = 0.01d;

    /**
     * Magnetic Declination
     */
    private final int mMagneticDeclination;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A2C
     */
    public MagneticDeclination(@NonNull byte[] values) {
        mMagneticDeclination = BLEUtils.createUInt16(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param magneticDeclination Magnetic Declination
     */
    public MagneticDeclination(int magneticDeclination) {
        mMagneticDeclination = magneticDeclination;
    }

    /**
     * @return Magnetic Declination
     */
    public int getMagneticDeclination() {
        return mMagneticDeclination;
    }

    /**
     * @return Magnetic Declination(degrees)
     */
    public double getMagneticDeclinationDegrees() {
        return MAGNETIC_DECLINATION_RESOLUTION * mMagneticDeclination;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mMagneticDeclination);
        return data;
    }

}
