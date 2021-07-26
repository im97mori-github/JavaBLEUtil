package org.im97mori.ble.characteristic.u2b0e;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Temperature 8 In A Period Of Day (Characteristics UUID: 0x2B0E)
 */
public class Temperature8InAPeriodOfDay implements ByteArrayInterface {

    /**
     * Temperature
     */
    private final int mTemperature;

    /**
     * Start Time
     */
    private final int mStartTime;

    /**
     * End Time
     */
    private final int mEndTime;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2B0E
     */
    public Temperature8InAPeriodOfDay(@NonNull byte[] values) {
        mTemperature = BLEUtils.createSInt8(values, 0);
        mStartTime = BLEUtils.createUInt8(values, 1);
        mEndTime = BLEUtils.createUInt8(values, 2);
    }

    /**
     * Constructor from parameters
     * 
     * @param temperature Temperature
     * @param startTime Start Time
     * @param endTime End Time
     */
    public Temperature8InAPeriodOfDay(int temperature, int startTime, int endTime) {
        mTemperature = temperature;
        mStartTime = startTime;
        mEndTime = endTime;
    }

    /**
     * @return Temperature
     */
    public int getTemperature() {
        return mTemperature;
    }

    /**
     * @return Start Time
     */
    public int getStartTime() {
        return mStartTime;
    }

    /**
     * @return End Time
     */
    public int getEndTime() {
        return mEndTime;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[3];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mTemperature);
        byteBuffer.put((byte) mStartTime);
        byteBuffer.put((byte) mEndTime);
        return data;
    }

}
