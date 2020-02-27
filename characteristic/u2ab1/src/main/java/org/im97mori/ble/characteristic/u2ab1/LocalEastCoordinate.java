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
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2AB1
     */
    public LocalEastCoordinate(@NonNull byte[] values) {
        mLocalEastCoordinate = BLEUtils.createSInt16(values, 0);
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
