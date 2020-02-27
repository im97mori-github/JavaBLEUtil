package org.im97mori.ble.characteristic.u2ab0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Local North Coordinate (Characteristics UUID: 0x2AB0)
 */
public class LocalNorthCoordinate implements ByteArrayInterface {

    /**
     * Local North Coordinate
     */
    private final int mLocalNorthCoordinate;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2AB0
     */
    public LocalNorthCoordinate(@NonNull byte[] values) {
        mLocalNorthCoordinate = BLEUtils.createSInt16(values, 0);
    }

    /**
     * @return Local North Coordinate
     */
    public int getLocalNorthCoordinate() {
        return mLocalNorthCoordinate;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mLocalNorthCoordinate);
        return data;
    }

}
