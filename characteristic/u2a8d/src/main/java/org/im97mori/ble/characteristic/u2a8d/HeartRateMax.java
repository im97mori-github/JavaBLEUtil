package org.im97mori.ble.characteristic.u2a8d;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Heart Rate Max (Characteristics UUID: 0x2A8D)
 */
public class HeartRateMax implements ByteArrayInterface {

    /**
     * Heart Rate Max
     */
    private final int mHeartRateMax;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public HeartRateMax(@NonNull byte[] values) {
        mHeartRateMax = (values[0] & 0xff);
    }

    /**
     * Constructor from parameters
     * 
     * @param heartRateMax Heart Rate Max
     */
    public HeartRateMax(int heartRateMax) {
        mHeartRateMax = heartRateMax;
    }

    /**
     * @return Heart Rate Max
     */
    public int getHeartRateMax() {
        return mHeartRateMax;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mHeartRateMax);
        return data;
    }

}
