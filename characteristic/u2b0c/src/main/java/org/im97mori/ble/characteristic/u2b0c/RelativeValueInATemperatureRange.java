package org.im97mori.ble.characteristic.u2b0c;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Relative Value In A Temperature Range (Characteristics UUID: 0x2B0C)
 */
public class RelativeValueInATemperatureRange implements ByteArrayInterface {

    /**
     * Relative Value
     */
    private final int mRelativeValue;

    /**
     * Minimum Temperature Value
     */
    private final int mMinimumTemperatureValue;

    /**
     * Maximum Temperature Value
     */
    private final int mMaximumTemperatureValue;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2B0C
     */
    public RelativeValueInATemperatureRange(@NonNull byte[] values) {
        mRelativeValue = BLEUtils.createUInt8(values, 0);
        mMinimumTemperatureValue = BLEUtils.createUInt8(values, 1);
        mMaximumTemperatureValue = BLEUtils.createUInt8(values, 2);
    }

    /**
     * Constructor from parameters
     * 
     * @param relativeValue Relative Value
     * @param minimumTemperatureValue Minimum Temperature Value
     * @param maximumTemperatureValue Maximum Temperature Value
     */
    public RelativeValueInATemperatureRange(int relativeValue, int minimumTemperatureValue, int maximumTemperatureValue) {
        mRelativeValue = relativeValue;
        mMinimumTemperatureValue = minimumTemperatureValue;
        mMaximumTemperatureValue = maximumTemperatureValue;
    }

    /**
     * @return Relative Value
     */
    public int getRelativeValue() {
        return mRelativeValue;
    }

    /**
     * @return Minimum Temperature Value
     */
    public int getMinimumTemperatureValue() {
        return mMinimumTemperatureValue;
    }

    /**
     * @return Maximum Temperature Value
     */
    public int getMaximumTemperatureValue() {
        return mMaximumTemperatureValue;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[3];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mRelativeValue);
        byteBuffer.put((byte) mMinimumTemperatureValue);
        byteBuffer.put((byte) mMaximumTemperatureValue);
        return data;
    }

}
