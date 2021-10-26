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
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public HTTPHeaders(@NonNull byte[] values) {
        mHttpHeaders = new String(values);
    }

    /**
     * Constructor from parameters
     * 
     * @param httpHeaders HTTP Headers
     */
    public HTTPHeaders(@NonNull String httpHeaders) {
        mHttpHeaders = httpHeaders;
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
