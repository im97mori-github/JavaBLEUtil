package org.im97mori.ble.characteristic.u2a58;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Analog (Characteristics UUID: 0x2A58)
 */
public class Analog implements ByteArrayInterface {

    /**
     * Analog
     */
    private final byte[] mAnalog;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A58
     */
    public Analog(@NonNull byte[] values) {
        mAnalog = values;
    }

    /**
     * @return Analog
     */
    public byte[] getAnalog() {
        return mAnalog;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put(mAnalog);
        return data;
    }

}
