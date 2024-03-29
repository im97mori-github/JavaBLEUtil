package org.im97mori.ble.characteristic.u2a07;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Tx Power Level (Characteristics UUID: 0x2A07)
 */
public class TxPowerLevel implements ByteArrayInterface {

    /**
     * Tx Power
     */
    private final int mTxPower;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public TxPowerLevel(@NonNull byte[] values) {
        mTxPower = BLEUtils.createSInt8(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param txPower Tx Power
     */
    public TxPowerLevel(int txPower) {
        mTxPower = txPower;
    }

    /**
     * @return Tx Power
     */
    public int getTxPower() {
        return mTxPower;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mTxPower);
        return data;
    }

}
