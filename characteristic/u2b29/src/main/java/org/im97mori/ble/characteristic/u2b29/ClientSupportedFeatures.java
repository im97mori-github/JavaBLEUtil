package org.im97mori.ble.characteristic.u2b29;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Client Supported Features (Characteristics UUID: 0x2B29)
 */
public class ClientSupportedFeatures implements ByteArrayInterface {

    /**
     * octet: The client supports robust caching
     */
    public static final int CLIENT_FEATYRES_ROBUST_CACHING_OCTET = 0;

    /**
     * bit: The client supports robust caching
     */
    public static final int CLIENT_FEATYRES_ROBUST_CACHING_BIT = 0b00000000_00000000_00000000_00000001;

    /**
     * Client Features
     */
    private final byte[] mClientFeatures;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2B29
     */
    public ClientSupportedFeatures(@NonNull byte[] values) {
        mClientFeatures = values;
    }

    /**
     * @return Client Features
     */
    public byte[] getClientFeatures() {
        return mClientFeatures;
    }

    /**
     * @return {@code true}:The client supports robust caching supported
     */
    public boolean isClientFeatresRobustCachingSuppreted() {
        boolean result = false;
        if (CLIENT_FEATYRES_ROBUST_CACHING_OCTET < mClientFeatures.length) {
            result = (mClientFeatures[CLIENT_FEATYRES_ROBUST_CACHING_OCTET] & CLIENT_FEATYRES_ROBUST_CACHING_BIT) != 0;
        }
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[mClientFeatures.length];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put(mClientFeatures);
        return data;
    }

}
