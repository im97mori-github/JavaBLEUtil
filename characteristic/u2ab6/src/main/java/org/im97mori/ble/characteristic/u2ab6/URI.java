package org.im97mori.ble.characteristic.u2ab6;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * URI (Characteristics UUID: 0x2AB6)
 */
public class URI implements ByteArrayInterface {

    /**
     * URI
     */
    private final String mUri;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2AB6
     */
    public URI(@NonNull byte[] values) {
        mUri = new String(values);
    }

    /**
     * @return URI
     */
    public String getUri() {
        return mUri;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        return mUri.getBytes();
    }

}
