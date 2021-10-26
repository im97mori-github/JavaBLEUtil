package org.im97mori.ble.characteristic.u2abb;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * HTTPS Security (Characteristics UUID: 0x2ABB)
 */
public class HTTPSSecurity implements ByteArrayInterface {

    /**
     * 0: HTTP Server certificate for the URI is not valid
     */
    public static final int HTTPS_SECURITY_FALSE = 0;

    /**
     * 1: HTTP Server certificate for the URI is valid
     */
    public static final int HTTPS_SECURITY_TRUE = 1;

    /**
     * HTTPS Security
     */
    private final int mHttpsSecurity;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public HTTPSSecurity(@NonNull byte[] values) {
        mHttpsSecurity = BLEUtils.createBoolean(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param httpsSecurity HTTPS Security
     */
    public HTTPSSecurity(int httpsSecurity) {
        mHttpsSecurity = httpsSecurity;
    }

    /**
     * @return HTTPS Security
     */
    public int getHttpsSecurity() {
        return mHttpsSecurity;
    }

    /**
     * @return {@code true}:HTTP Server certificate for the URI is not valid, {@code false}:HTTP Server certificate for the URI is valid
     */
    public boolean isHttpsSecurityFalse() {
        return HTTPS_SECURITY_FALSE == mHttpsSecurity;
    }

    /**
     * @return {@code true}:HTTP Server certificate for the URI is valid, {@code false}:HTTP Server certificate for the URI is not valid
     */
    public boolean isHttpsSecurityTrue() {
        return HTTPS_SECURITY_TRUE == mHttpsSecurity;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mHttpsSecurity);
        return data;
    }

}
