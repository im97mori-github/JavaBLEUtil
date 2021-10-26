package org.im97mori.ble.characteristic.u2afb;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Illuminance (Characteristics UUID: 0x2AFB)
 */
public class Illuminance implements ByteArrayInterface {

    /**
     * Illuminance
     */
    private final int mIlluminance;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public Illuminance(@NonNull byte[] values) {
        mIlluminance = BLEUtils.createUInt24(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param illuminance Illuminance
     */
    public Illuminance(int illuminance) {
        mIlluminance = illuminance;
    }

    /**
     * @return Illuminance
     */
    public int getIlluminance() {
        return mIlluminance;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[3];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mIlluminance);
        byteBuffer.put((byte) (mIlluminance >> 8));
        byteBuffer.put((byte) (mIlluminance >> 16));
        return data;
    }

}
