package org.im97mori.ble.characteristic.u2a6e;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Temperature (Characteristics UUID: 0x2A6E)
 */
public class Temperature implements ByteArrayInterface {

    /**
     * Temperature
     */
    private final int mTemperature;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A6E
     */
    public Temperature(@NonNull byte[] values) {
        mTemperature = BLEUtils.createSInt16(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param temperature Temperature
     */
    public Temperature(int temperature) {
        mTemperature = temperature;
    }

    /**
     * @return Temperature
     */
    public int getTemperature() {
        return mTemperature;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mTemperature);
        return data;
    }

}
