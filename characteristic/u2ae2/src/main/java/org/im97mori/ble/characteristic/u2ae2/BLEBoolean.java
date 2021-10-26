package org.im97mori.ble.characteristic.u2ae2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Boolean (Characteristics UUID: 0x2AE2)
 */
public class BLEBoolean implements ByteArrayInterface {

    /**
     * Boolean:False
     */
    public static final int BOOLEAN_FALSE = 0;

    /**
     * Boolean:True
     */
    public static final int BOOLEAN_TRUE = 1;

    /**
     * Boolean
     */
    private final int mBoolean;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public BLEBoolean(@NonNull byte[] values) {
        mBoolean = BLEUtils.createUInt8(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param booleanValue Boolean value
     */
    public BLEBoolean(int booleanValue) {
        mBoolean = booleanValue;
    }

    /**
     * @return Boolean
     */
    public int getBoolean() {
        return mBoolean;
    }

    /**
     * @return {@code true}:Boolean is False, {@code false}:Boolean is not False
     */
    public boolean isBooleanFalse() {
        return BOOLEAN_FALSE == mBoolean;
    }

    /**
     * @return {@code true}:Boolean is True, {@code false}:Boolean is not True
     */
    public boolean isBooleanTrue() {
        return BOOLEAN_TRUE == mBoolean;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mBoolean);
        return data;
    }

}
