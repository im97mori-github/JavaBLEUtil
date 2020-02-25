package org.im97mori.ble.characteristic.u2a77;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Irradiance (Characteristics UUID: 0x2A77)
 */
public class Irradiance implements ByteArrayInterface {

    /**
     * Irradiance Unit 0.1 watt per square meter
     */
    public static final double IRRADIANCE_RESOLUTION = 0.1d;

    /**
     * Irradiance
     */
    private final int mIrradiance;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A77
     */
    public Irradiance(@NonNull byte[] values) {
        mIrradiance = BLEUtils.createUInt16(values, 0);
    }

    /**
     * @return Irradiance
     */
    public int getIrradiance() {
        return mIrradiance;
    }

    /**
     * @return Irradiance(watt per square meter)
     */
    public double getIrradianceWattPerSquareMeter() {
        return IRRADIANCE_RESOLUTION * mIrradiance;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mIrradiance);
        return data;
    }

}
