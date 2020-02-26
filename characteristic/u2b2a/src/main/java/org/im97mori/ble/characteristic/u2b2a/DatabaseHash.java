package org.im97mori.ble.characteristic.u2b2a;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Database Hash (Characteristics UUID: 0x2B2A)
 */
public class DatabaseHash implements ByteArrayInterface {

    /**
     * Database Hash
     */
    private final byte[] mDatabaseHash;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2B2A
     */
    public DatabaseHash(@NonNull byte[] values) {
        mDatabaseHash = values;
    }

    /**
     * @return Database Hash
     */
    public byte[] getDatabaseHash() {
        return mDatabaseHash;
    }

    /**
     * @return Database Hash {@link BigInteger}
     */
    public BigInteger getDatabaseHashBigInteger() {
        return BLEUtils.createUInt128(mDatabaseHash, 0);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[mDatabaseHash.length];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put(mDatabaseHash);
        return data;
    }

}
