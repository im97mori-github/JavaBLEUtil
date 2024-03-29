package org.im97mori.ble.characteristic.u2ab3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Altitude (Characteristics UUID: 0x2AB3)
 */
public class Altitude implements ByteArrayInterface {

    /**
     * Altitude
     */
    private final int mAltitude;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public Altitude(@NonNull byte[] values) {
        mAltitude = BLEUtils.createUInt16(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param altitude Altitude
     */
    public Altitude(int altitude) {
        mAltitude = altitude;
    }

    /**
     * @return Altitude
     */
    public int getAltitude() {
        return mAltitude;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mAltitude);
        return data;
    }

}
