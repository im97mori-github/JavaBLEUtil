package org.im97mori.ble.characteristic.u2a92;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Resting Heart Rate (Characteristics UUID: 0x2A92)
 */
public class RestingHeartRate implements ByteArrayInterface {

    /**
     * Resting Heart Rate
     */
    private final int mRestingHeartRate;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A92
     */
    public RestingHeartRate(@NonNull byte[] values) {
        mRestingHeartRate = (values[0] & 0xff);
    }

    /**
     * @return Resting Heart Rate
     */
    public int getRestingHeartRate() {
        return mRestingHeartRate;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mRestingHeartRate);
        return data;
    }

}
