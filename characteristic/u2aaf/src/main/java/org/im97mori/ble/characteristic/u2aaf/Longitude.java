package org.im97mori.ble.characteristic.u2aaf;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Longitude (Characteristics UUID: 0x2AAF)
 */
public class Longitude implements ByteArrayInterface {

    /**
     * Longitude
     */
    private final int mLongitude;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2AAF
     */
    public Longitude(@NonNull byte[] values) {
        mLongitude = BLEUtils.createSInt32(values, 0);
    }

    /**
     * @return Longitude
     */
    public int getLongitude() {
        return mLongitude;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[4];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putInt(mLongitude);
        return data;
    }

}
