package org.im97mori.ble.characteristic.u2b0d;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Temperature 8 (Characteristics UUID: 0x2B0D)
 */
public class Temperature8 implements ByteArrayInterface {

    /**
     * Temperature 8
     */
    private final int mTemperature8;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2B0D
     */
    public Temperature8(@NonNull byte[] values) {
        mTemperature8 = BLEUtils.createSInt8(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param temperature8 Temperature 8
     */
    public Temperature8(int temperature8) {
        mTemperature8 = temperature8;
    }

    /**
     * @return Temperature 8
     */
    public int getTemperature8() {
        return mTemperature8;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mTemperature8);
        return data;
    }

}
