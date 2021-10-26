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
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public TemperatureType(@NonNull byte[] values) {
        mTemperatureTextDescription = values[0];
    }

    /**
     * Constructor from parameters
     * 
     * @param temperatureTextDescription Temperature Text Description
     */
    public TemperatureType(int temperatureTextDescription) {
        mTemperatureTextDescription = temperatureTextDescription;
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
