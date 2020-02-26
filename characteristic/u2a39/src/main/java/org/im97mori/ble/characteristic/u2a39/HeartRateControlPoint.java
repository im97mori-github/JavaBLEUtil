package org.im97mori.ble.characteristic.u2a39;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Heart Rate Control Point (Characteristics UUID: 0x2A39)
 */
public class HeartRateControlPoint implements ByteArrayInterface {

    /**
     * 1: Reset Energy Expended: resets the value of the Energy Expended field in the Heart Rate Measurement characteristic to 0
     */
    public static final int HEART_RATE_CONTROL_POINT_RESET_ENERGY_EXPENDED = 1;

    /**
     * Heart Rate Control Point
     */
    private final int mHeartRateControlPoint;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A39
     */
    public HeartRateControlPoint(@NonNull byte[] values) {
        mHeartRateControlPoint = values[0];
    }

    /**
     * @return Heart Rate Control Point
     */
    public int getHeartRateControlPoint() {
        return mHeartRateControlPoint;
    }

    /**
     * @return {@code true}:Reset Energy Expended, {@code false}:not Reset Energy Expended
     */
    public boolean isHeartRateControlPointResetEnergyExpended() {
        return HEART_RATE_CONTROL_POINT_RESET_ENERGY_EXPENDED == mHeartRateControlPoint;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mHeartRateControlPoint);
        return data;
    }

}
