package org.im97mori.ble.characteristic.u2a56;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Digital (Characteristics UUID: 0x2A56)
 */
public class Digital implements ByteArrayInterface {

    /**
     * Digital
     */
    private final byte[] mDigital;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public Digital(@NonNull byte[] values) {
        mDigital = values;
    }

    /**
     * @return Digital
     */
    @NonNull
    public byte[] getDigital() {
        return mDigital;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[mDigital.length];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put(mDigital);
        return data;
    }

}
