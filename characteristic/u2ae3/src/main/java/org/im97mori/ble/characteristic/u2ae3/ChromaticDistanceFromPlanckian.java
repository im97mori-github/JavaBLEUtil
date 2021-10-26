package org.im97mori.ble.characteristic.u2ae3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Chromatic Distance From Planckian (Characteristics UUID: 0x2AE3)
 */
public class ChromaticDistanceFromPlanckian implements ByteArrayInterface {

    /**
     * Distance From Planckian
     */
    private final int mDistanceFromPlanckian;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public ChromaticDistanceFromPlanckian(@NonNull byte[] values) {
        mDistanceFromPlanckian = BLEUtils.createSInt16(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param distanceFromPlanckian Distance From Planckian
     */
    public ChromaticDistanceFromPlanckian(int distanceFromPlanckian) {
        mDistanceFromPlanckian = distanceFromPlanckian;
    }

    /**
     * @return Distance From Planckian
     */
    public int getDistanceFromPlanckian() {
        return mDistanceFromPlanckian;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mDistanceFromPlanckian);
        return data;
    }

}
