package org.im97mori.ble.characteristic.u2afa;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Global Trade Item Number (Characteristics UUID: 0x2AFA)
 */
public class GlobalTradeItemNumber implements ByteArrayInterface {

    /**
     * Global Trade Item Number
     */
    private final long mGlobalTradeItemNumber;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public GlobalTradeItemNumber(@NonNull byte[] values) {
        mGlobalTradeItemNumber = BLEUtils.createUInt48(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param globalTradeItemNumber Global Trade Item Number
     */
    public GlobalTradeItemNumber(long globalTradeItemNumber) {
        mGlobalTradeItemNumber = globalTradeItemNumber;
    }

    /**
     * @return Global Trade Item Number
     */
    public long getGlobalTradeItemNumber() {
        return mGlobalTradeItemNumber;
    }

    /**
     * check digit validation
     * @return {@code true}:valid, {@code false}:not valid
     */
    public boolean isValid() {
        char[] arrays = String.valueOf(mGlobalTradeItemNumber).toCharArray();
        int length = arrays.length;
        int total = 0;
        for (int i = 0; i < length - 1; i++) {
            total += Character.getNumericValue(arrays[length - 2 - i]) * (i % 2 == 0 ? 3 : 1);
        }
        return Character.getNumericValue(arrays[length - 1]) == 10 - total % 10;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[6];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mGlobalTradeItemNumber);
        byteBuffer.put((byte) (mGlobalTradeItemNumber >> 8));
        byteBuffer.put((byte) (mGlobalTradeItemNumber >> 16));
        byteBuffer.put((byte) (mGlobalTradeItemNumber >> 24));
        byteBuffer.put((byte) (mGlobalTradeItemNumber >> 32));
        byteBuffer.put((byte) (mGlobalTradeItemNumber >> 40));
        return data;
    }

}
