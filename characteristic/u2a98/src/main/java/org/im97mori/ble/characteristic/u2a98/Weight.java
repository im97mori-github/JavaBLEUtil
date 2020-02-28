package org.im97mori.ble.characteristic.u2a98;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Weight (Characteristics UUID: 0x2A98)
 */
public class Weight implements ByteArrayInterface {

    /**
     * Weight Unit 0.005 (kilogram)
     */
    public static final double WEIGHT_RESOLUTION = 0.005;

    /**
     * Weight
     */
    private final int mWeight;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A98
     */
    public Weight(@NonNull byte[] values) {
        mWeight = BLEUtils.createUInt16(values, 0);
    }

    /**
     * @return Weight
     */
    public int getWeight() {
        return mWeight;
    }

    /**
     * @return Weight(kg)
     */
    public double getWeightKg() {
        return WEIGHT_RESOLUTION * mWeight;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mWeight);
        return data;
    }

}
