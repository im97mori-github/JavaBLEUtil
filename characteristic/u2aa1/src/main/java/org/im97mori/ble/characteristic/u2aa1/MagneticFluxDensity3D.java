package org.im97mori.ble.characteristic.u2aa1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Magnetic Flux Density - 3D (Characteristics UUID: 0x2AA1)
 */
public class MagneticFluxDensity3D implements ByteArrayInterface {

    /**
     * Magnetic Flux Density: X-Axis Unit 10^-7 Tesla
     */
    public static final double MAGNETIC_FLUX_DENSITY_X_AXIS_RESOLUTION = 0.000001d;

    /**
     * Magnetic Flux Density: Y-Axis Unit 10^-7 Tesla
     */
    public static final double MAGNETIC_FLUX_DENSITY_Y_AXIS_RESOLUTION = 0.000001d;

    /**
     * Magnetic Flux Density: Z-Axis Unit 10^-7 Tesla
     */
    public static final double MAGNETIC_FLUX_DENSITY_Z_AXIS_RESOLUTION = 0.000001d;

    /**
     * Magnetic Flux Density: X-Axis
     */
    private final int mMagneticFluxDensityXAxis;

    /**
     * Magnetic Flux Density: Y-Axis
     */
    private final int mMagneticFluxDensityYAxis;

    /**
     * Magnetic Flux Density: Z-Axis
     */
    private final int mMagneticFluxDensityZAxis;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public MagneticFluxDensity3D(@NonNull byte[] values) {
        mMagneticFluxDensityXAxis = BLEUtils.createSInt16(values, 0);
        mMagneticFluxDensityYAxis = BLEUtils.createSInt16(values, 2);
        mMagneticFluxDensityZAxis = BLEUtils.createSInt16(values, 4);
    }

    /**
     * Constructor from parameters
     * 
     * @param magneticFluxDensityXAxis Magnetic Flux Density: X-Axis
     * @param magneticFluxDensityYAxis Magnetic Flux Density: Y-Axis
     * @param magneticFluxDensityZAxis Magnetic Flux Density: Z-Axis
     */
    public MagneticFluxDensity3D(int magneticFluxDensityXAxis, int magneticFluxDensityYAxis, int magneticFluxDensityZAxis) {
        mMagneticFluxDensityXAxis = magneticFluxDensityXAxis;
        mMagneticFluxDensityYAxis = magneticFluxDensityYAxis;
        mMagneticFluxDensityZAxis = magneticFluxDensityZAxis;
    }

    /**
     * @return Magnetic Flux Density: X-Axis
     */
    public int getMagneticFluxDensityXAxis() {
        return mMagneticFluxDensityXAxis;
    }

    /**
     * @return Magnetic Flux Density: X-Axis(Tesla)
     */
    public double getMagneticFluxDensityXAxisTesla() {
        return MAGNETIC_FLUX_DENSITY_X_AXIS_RESOLUTION * mMagneticFluxDensityXAxis;
    }

    /**
     * @return Magnetic Flux Density: Y-Axis
     */
    public int getMagneticFluxDensityYAxis() {
        return mMagneticFluxDensityYAxis;
    }

    /**
     * @return Magnetic Flux Density: Y-Axis(Tesla)
     */
    public double getMagneticFluxDensityYAxisTesla() {
        return MAGNETIC_FLUX_DENSITY_Y_AXIS_RESOLUTION * mMagneticFluxDensityYAxis;
    }

    /**
     * @return Magnetic Flux Density: Z-Axis
     */
    public int getMagneticFluxDensityZAxis() {
        return mMagneticFluxDensityZAxis;
    }

    /**
     * @return Magnetic Flux Density: Z-Axis(Tesla)
     */
    public double getMagneticFluxDensityZAxisTesla() {
        return MAGNETIC_FLUX_DENSITY_Z_AXIS_RESOLUTION * mMagneticFluxDensityZAxis;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[6];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mMagneticFluxDensityXAxis);
        byteBuffer.putShort((short) mMagneticFluxDensityYAxis);
        byteBuffer.putShort((short) mMagneticFluxDensityZAxis);
        return data;
    }

}
