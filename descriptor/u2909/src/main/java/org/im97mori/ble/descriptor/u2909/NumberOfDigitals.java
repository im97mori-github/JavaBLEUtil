package org.im97mori.ble.descriptor.u2909;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Number of Digitals (Descriptor UUID: 0x2909)
 */
public class NumberOfDigitals implements ByteArrayInterface {

    /**
     * No of Digitals
     */
    private final int mNoOfDigitals;

    /**
     * Constructor from {@link BluetoothGattDescriptor}
     *
     * @param bluetoothGattDescriptor Characteristics UUID: 0x2909
     */
    public NumberOfDigitals(@NonNull byte[] values) {
        mNoOfDigitals = (values[0] & 0xff);
    }

    /**
     * @return No of Digitals
     */
    public int getNoOfDigitals() {
        return mNoOfDigitals;
    }

    /**
     * {@inheritDoc}
     */
    @NonNull
    @Override
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mNoOfDigitals);
        return data;
    }

}
