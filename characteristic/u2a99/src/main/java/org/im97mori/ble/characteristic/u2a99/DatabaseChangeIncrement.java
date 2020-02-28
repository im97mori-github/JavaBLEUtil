package org.im97mori.ble.characteristic.u2a99;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Database Change Increment (Characteristics UUID: 0x2A99)
 */
public class DatabaseChangeIncrement implements ByteArrayInterface {

    /**
     * Database Change Increment
     */
    private final long mDatabaseChangeIncrement;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A99
     */
    public DatabaseChangeIncrement(@NonNull byte[] values) {
        mDatabaseChangeIncrement = BLEUtils.createUInt32(values, 0);
    }

    /**
     * @return Database Change Increment
     */
    public long getDatabaseChangeIncrement() {
        return mDatabaseChangeIncrement;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[4];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putInt((int) mDatabaseChangeIncrement);
        return data;
    }

}
