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
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2AB2
     */
    public FloorNumber(@NonNull byte[] values) {
        mFloorNumber = (values[0] & 0xff);
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
