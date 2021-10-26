package org.im97mori.ble.characteristic.u2aad;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Indoor Positioning Configuration (Characteristics UUID: 0x2AAD)
 */
public class IndoorPositioningConfiguration implements ByteArrayInterface {

    /**
     * Indoor Positioning Configuration
     */
    private final int mIndoorPositioningConfiguration;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public IndoorPositioningConfiguration(@NonNull byte[] values) {
        mIndoorPositioningConfiguration = (values[0] & 0xff);
    }

    /**
     * Constructor from parameters
     * 
     * @param indoorPositioningConfiguration Indoor Positioning Configuration
     */
    public IndoorPositioningConfiguration(int indoorPositioningConfiguration) {
        mIndoorPositioningConfiguration = indoorPositioningConfiguration;
    }

    /**
     * @return Indoor Positioning Configuration
     */
    public int getIndoorPositioningConfiguration() {
        return mIndoorPositioningConfiguration;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mIndoorPositioningConfiguration);
        return data;
    }

}
