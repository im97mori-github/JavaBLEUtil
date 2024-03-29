package org.im97mori.ble.characteristic.u2a96;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * VO2 Max (Characteristics UUID: 0x2A96)
 */
public class VO2Max implements ByteArrayInterface {

    /**
     * VO2 Max
     */
    private final int mVo2Max;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public VO2Max(@NonNull byte[] values) {
        mVo2Max = (values[0] & 0xff);
    }

    /**
     * Constructor from parameters
     * 
     * @param vo2Max VO2 Max
     */
    public VO2Max(int vo2Max) {
        mVo2Max = vo2Max;
    }

    /**
     * @return VO2 Max
     */
    public int getVo2Max() {
        return mVo2Max;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mVo2Max);
        return data;
    }

}
