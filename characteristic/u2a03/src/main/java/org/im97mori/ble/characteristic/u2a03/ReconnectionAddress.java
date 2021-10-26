package org.im97mori.ble.characteristic.u2a03;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Reconnection Address (Characteristics UUID: 0x2A03)
 */
public class ReconnectionAddress implements ByteArrayInterface {

    /**
     * Address
     */
    private final long mAddress;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public ReconnectionAddress(@NonNull byte[] values) {
        mAddress = BLEUtils.createUInt48(values, 0);
    }

    /***
     * Constructor from parameters
     * 
     * @param address Address
     */
    public ReconnectionAddress(long address) {
        mAddress = address;
    }

    /**
     * @return Address
     */
    public long getAddress() {
        return mAddress;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[6];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mAddress);
        byteBuffer.put((byte) (mAddress >> 8));
        byteBuffer.put((byte) (mAddress >> 16));
        byteBuffer.put((byte) (mAddress >> 24));
        byteBuffer.put((byte) (mAddress >> 32));
        byteBuffer.put((byte) (mAddress >> 40));
        return data;
    }

}
