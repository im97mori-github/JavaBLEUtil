package org.im97mori.ble.characteristic.u2ab1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Local East Coordinate (Characteristics UUID: 0x2AB1)
 */
public class LocalEastCoordinate implements ByteArrayInterface {

    /**
     * Local East Coordinate
     */
    private final int mLocalEastCoordinate;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public LocalEastCoordinate(@NonNull byte[] values) {
        mLocalEastCoordinate = BLEUtils.createSInt16(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param localEastCoordinate Local East Coordinate
     */
    public LocalEastCoordinate(int localEastCoordinate) {
        mLocalEastCoordinate = localEastCoordinate;
    }

    /**
     * @return Local East Coordinate
     */
    public int getLocalEastCoordinate() {
        return mLocalEastCoordinate;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mLocalEastCoordinate);
        return data;
    }

}
