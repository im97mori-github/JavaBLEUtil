package org.im97mori.ble.descriptor.u2905;

import androidx.annotation.NonNull;

import org.im97mori.ble.ByteArrayInterface;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * Characteristic Aggregate Format (Descriptor UUID: 0x2905)
 */
public class CharacteristicAggregateFormat implements ByteArrayInterface {

    /**
     * List of Handles
     */
    private final byte[] mListOfHandles;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
     */
    public CharacteristicAggregateFormat(@NonNull byte[] values) {
        mListOfHandles = values;
    }

    /**
     * @return List of Handles
     */
    @NonNull
    public byte[] getListOfHandles() {
        return mListOfHandles;
    }

    /**
     * @return size of List of Handles
     */
    public int getSize() {
        return mListOfHandles.length / 2;
    }

    /**
     * @param index 0 to n (n = {@link #getSize()} - 1)
     * @return handle
     */
    public int getHandle(int index) {
        return (mListOfHandles[index * 2] & 0xff) | ((mListOfHandles[index * 2 + 1] & 0xff) << 8);
    }

    /**
     * {@inheritDoc}
     */
    @NonNull
    @Override
    public byte[] getBytes() {
        byte[] data = new byte[mListOfHandles.length];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put(mListOfHandles);
        return data;
    }

}
