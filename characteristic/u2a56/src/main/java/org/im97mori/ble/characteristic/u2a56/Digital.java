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
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A56
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
