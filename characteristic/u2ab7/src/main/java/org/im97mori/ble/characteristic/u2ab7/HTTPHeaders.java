package org.im97mori.ble.characteristic.u2ab7;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * HTTP Headers (Characteristics UUID: 0x2AB7)
 */
public class HTTPHeaders implements ByteArrayInterface {

    /**
     * HTTP Headers
     */
    private final String mHttpHeaders;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2AB7
     */
    public HTTPHeaders(@NonNull byte[] values) {
        mHttpHeaders = new String(values);
    }

    /**
     * @return HTTP Headers
     */
    public String getHttpHeaders() {
        return mHttpHeaders;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        return mHttpHeaders.getBytes();
    }

}
