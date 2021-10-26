package org.im97mori.ble.characteristic.u2b10;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Temperature Range (Characteristics UUID: 0x2B10)
 */
public class TemperatureRange implements ByteArrayInterface {

    /**
     * Minimum Temperature
     */
    private final int mMinimumTemperature;

    /**
     * Maximum Temperature
     */
    private final int mMaximumTemperature;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public TemperatureRange(@NonNull byte[] values) {
        mMinimumTemperature = BLEUtils.createSInt16(values, 0);
        mMaximumTemperature = BLEUtils.createSInt16(values, 2);
    }

    /**
     * Constructor from parameters
     * 
     * @param minimumTemperature Minimum Temperature
     * @param maximumTemperature Maximum Temperature
     */
    public TemperatureRange(int minimumTemperature, int maximumTemperature) {
        mMinimumTemperature = minimumTemperature;
        mMaximumTemperature = maximumTemperature;
    }

    /**
     * @return Minimum Temperature
     */
    public int getMinimumTemperature() {
        return mMinimumTemperature;
    }

    /**
     * @return Maximum Temperature
     */
    public int getMaximumTemperature() {
        return mMaximumTemperature;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[4];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mMinimumTemperature);
        byteBuffer.putShort((short) mMaximumTemperature);
        return data;
    }

}
