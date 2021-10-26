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
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public DatabaseChangeIncrement(@NonNull byte[] values) {
        mDatabaseChangeIncrement = BLEUtils.createUInt32(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param databaseChangeIncrement Database Change Increment
     */
    public DatabaseChangeIncrement(long databaseChangeIncrement) {
        mDatabaseChangeIncrement = databaseChangeIncrement;
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
