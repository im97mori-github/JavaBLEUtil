package org.im97mori.ble.characteristic.u2ab2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Floor Number (Characteristics UUID: 0x2AB2)
 */
public class FloorNumber implements ByteArrayInterface {

    /**
     * Floor Number
     */
    private final int mFloorNumber;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public FloorNumber(@NonNull byte[] values) {
        mFloorNumber = (values[0] & 0xff);
    }

    /**
     * Constructor from parameters
     * 
     * @param floorNumber Floor Number
     */
    public FloorNumber(int floorNumber) {
        mFloorNumber = floorNumber;
    }

    /**
     * @return Floor Number
     */
    public int getFloorNumber() {
        return mFloorNumber;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mFloorNumber);
        return data;
    }

}
