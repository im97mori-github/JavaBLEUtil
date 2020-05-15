package org.im97mori.ble.characteristic.u2a6f;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Humidity (Characteristics UUID: 0x2A6F)
 */
public class Humidity implements ByteArrayInterface {

    /**
     * Humidity Unit 0.01 percent
     */
    public static final double HUMIDITY_RESOLUTION = 0.01d;

    /**
     * Humidity
     */
    private final int mHumidity;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A6F
     */
    public Humidity(@NonNull byte[] values) {
        mHumidity = BLEUtils.createUInt16(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param humidity Humidity
     */
    public Humidity(int humidity) {
        mHumidity = humidity;
    }

    /**
     * @return Humidity
     */
    public int getHumidity() {
        return mHumidity;
    }

    /**
     * @return Humidity(percent)
     */
    public double getHumidityPercent() {
        return HUMIDITY_RESOLUTION * mHumidity;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mHumidity);
        return data;
    }

}
