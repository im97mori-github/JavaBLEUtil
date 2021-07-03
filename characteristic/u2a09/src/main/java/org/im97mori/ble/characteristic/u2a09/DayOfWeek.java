package org.im97mori.ble.characteristic.u2a09;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Day of Week (Characteristics UUID: 0x2A09)
 */
public class DayOfWeek implements ByteArrayInterface {

    /**
     * Day of Week
     */
    private final int mDayOfWeek;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A09
     */
    public DayOfWeek(@NonNull byte[] values) {
        mDayOfWeek = BLEUtils.createUInt8(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param dayOfWeek   Day of Week
     */
    public DayOfWeek(int dayOfWeek) {
        mDayOfWeek = dayOfWeek;
    }

    /**
     * @return Day of Week
     * @see org.im97mori.ble.characteristic.core.DayOfWeekUtils
     */
    public int getDayOfWeek() {
        return mDayOfWeek;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        data[0] = (byte) mDayOfWeek;
        return data;
    }

}
