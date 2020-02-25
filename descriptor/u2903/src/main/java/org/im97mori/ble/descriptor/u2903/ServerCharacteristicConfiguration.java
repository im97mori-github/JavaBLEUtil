package org.im97mori.ble.descriptor.u2903;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Server Characteristic Configuration (Descriptor UUID: 0x2903)
 */
public class ServerCharacteristicConfiguration implements ByteArrayInterface {

    /**
     * Properties:Broadcasts disabled
     */
    public static final int PROPERTIES_BROADCASTS_DISABLED = 0x00;

    /**
     * Properties:Broadcasts enabled
     */
    public static final int PROPERTIES_BROADCASTS_ENABLED = 0x01;

    /**
     * Properties
     */
    private final int mProperties;

    /**
     * Constructor from {@link BluetoothGattDescriptor}
     *
     * @param bluetoothGattDescriptor Characteristics UUID: 0x2903
     */
    public ServerCharacteristicConfiguration(@NonNull byte[] values) {
        mProperties = (values[0] & 0xff) | ((values[1] & 0xff) << 8);
    }

    /**
     * @return Properties
     */
    public int getProperties() {
        return mProperties;
    }

    /**
     * @return {@code true}:property is {@link #PROPERTIES_BROADCASTS_DISABLED}, {@code false}:not {@link #PROPERTIES_BROADCASTS_DISABLED}
     */
    public boolean isPropertiesBroadcastsDisabled() {
        return PROPERTIES_BROADCASTS_DISABLED == mProperties;
    }

    /**
     * @return {@code true}:property is {@link #PROPERTIES_BROADCASTS_ENABLED}, {@code false}:not {@link #PROPERTIES_BROADCASTS_ENABLED}
     */
    public boolean isPropertiesBroadcastsEnabled() {
        return PROPERTIES_BROADCASTS_ENABLED == mProperties;
    }

    /**
     * {@inheritDoc}
     */
    @NonNull
    @Override
    public byte[] getBytes() {
        byte[] data = new byte[2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mProperties);
        return data;
    }

}
