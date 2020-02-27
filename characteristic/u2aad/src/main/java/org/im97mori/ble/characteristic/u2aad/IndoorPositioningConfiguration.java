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
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2AAD
     */
    public IndoorPositioningConfiguration(@NonNull byte[] values) {
        mIndoorPositioningConfiguration = (values[0] & 0xff);
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
