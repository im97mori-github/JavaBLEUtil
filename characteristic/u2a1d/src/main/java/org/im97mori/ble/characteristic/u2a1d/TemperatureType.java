package org.im97mori.ble.characteristic.u2a1d;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Temperature Type (Characteristics UUID: 0x2A1D)
 */
public class TemperatureType implements ByteArrayInterface {

    /**
     * Temperature Text Description
     */
    private final int mTemperatureTextDescription;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A1D
     */
    public TemperatureType(@NonNull byte[] values) {
        mTemperatureTextDescription = values[0];
    }

    /**
     * @return Temperature Text Description
     */
    public int getTemperatureTextDescription() {
        return mTemperatureTextDescription;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mTemperatureTextDescription);
        return data;
    }

}
