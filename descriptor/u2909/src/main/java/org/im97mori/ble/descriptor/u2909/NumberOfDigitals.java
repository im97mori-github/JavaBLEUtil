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
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
     */
    public NumberOfDigitals(@NonNull byte[] values) {
        mNoOfDigitals = (values[0] & 0xff);
    }

    /**
     * Constructor from parameters
     * 
     * @param noOfDigitals No of Digitals
     */
    public NumberOfDigitals(int noOfDigitals) {
        mNoOfDigitals = noOfDigitals;
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
