package org.im97mori.ble.characteristic.u2af3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Energy In A Period Of Day (Characteristics UUID: 0x2AF3)
 */
public class EnergyInAPeriodOfDay implements ByteArrayInterface {

    /**
     * Energy Value
     */
    private final int mEnergyValue;

    /**
     * Start Time
     */
    private final int mStartTime;

    /**
     * End Time
     */
    private final int mEndTime;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public EnergyInAPeriodOfDay(@NonNull byte[] values) {
        mEnergyValue = BLEUtils.createUInt24(values, 0);
        mStartTime = BLEUtils.createUInt8(values, 3);
        mEndTime = BLEUtils.createUInt8(values, 4);
    }

    /**
     * Constructor from parameters
     * 
     * @param energyValue mEnergyValue
     * @param startTime mStartTime
     * @param endTime mEndTime
     */
    public EnergyInAPeriodOfDay(int energyValue, int startTime, int endTime) {
        mEnergyValue = energyValue;
        mStartTime = startTime;
        mEndTime = endTime;
    }

    /**
     * @return Energy Value
     */
    public int getEnergyValue() {
        return mEnergyValue;
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
        byte[] data = new byte[5];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mEnergyValue);
        byteBuffer.put((byte) (mEnergyValue >> 8));
        byteBuffer.put((byte) (mEnergyValue >> 16));
        byteBuffer.put((byte) mStartTime);
        byteBuffer.put((byte) mEndTime);
        return data;
    }

}
