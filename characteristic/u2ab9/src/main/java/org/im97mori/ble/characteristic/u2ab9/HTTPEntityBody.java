package org.im97mori.ble.characteristic.u2ab9;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * HTTP Entity Body (Characteristics UUID: 0x2AB9)
 */
public class HTTPEntityBody implements ByteArrayInterface {

    /**
     * HTTP Entity Body
     */
    private final String mHttpEntityBody;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2AB9
     */
    public HTTPEntityBody(@NonNull byte[] values) {
        mHttpEntityBody = new String(values);
    }

    /**
     * Constructor from parameters
     * 
     * @param httpEntityBody HTTP Entity Body
     */
    public HTTPEntityBody(@NonNull String httpEntityBody) {
        mHttpEntityBody = httpEntityBody;
    }

    /**
     * @return HTTP Entity Body
     */
    public String getHttpEntityBody() {
        return mHttpEntityBody;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        return mHttpEntityBody.getBytes();
    }

}
