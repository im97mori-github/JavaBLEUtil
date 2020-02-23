package org.im97mori.ble.characteristic.u2a5a;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Aggregate (Characteristics UUID: 0x2A5A)
 */
public class Aggregate implements ByteArrayInterface {

    /**
     * Input Bits and Analog Input
     */
    private final byte[] mInput;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A5A
     */
    public Aggregate(@NonNull byte[] values) {
        mInput = values;
    }

    /**
     * @param analogOffset start of analog data index
     * @return Input Bits
     */
    @NonNull
    public byte[] getInputBits(int analogOffset) {
        return Arrays.copyOfRange(mInput, 0, analogOffset);
    }

    /**
     * @param analogOffset start of analog data index
     * @return Analog Input
     */
    @NonNull
    public byte[] getAnalogInput(int analogOffset) {
        return Arrays.copyOfRange(mInput, analogOffset, mInput.length);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[mInput.length];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put(mInput);
        return data;
    }

}
