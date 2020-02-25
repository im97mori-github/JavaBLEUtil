package org.im97mori.ble.characteristic.u2a78;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Rainfall (Characteristics UUID: 0x2A78)
 */
public class Rainfall implements ByteArrayInterface {

    /**
     * Rainfall Unit 1 mm (0.001meters)
     */
    public static final double RAINFALL_RESOLUTION = 0.001d;

    /**
     * Rainfall
     */
    private final int mRainfall;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A78
     */
    public Rainfall(@NonNull byte[] values) {
        mRainfall = BLEUtils.createUInt16(values, 0);
    }

    /**
     * @return Rainfall
     */
    public int getRainfall() {
        return mRainfall;
    }

    /**
     * @return Rainfall(mm)
     */
    public double getRainfallMilliMeters() {
        return RAINFALL_RESOLUTION * mRainfall;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mRainfall);
        return data;
    }

}
