package org.im97mori.ble.characteristic.u2aed;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Date UTC (Characteristics UUID: 0x2AED)
 */
public class DateUtc implements ByteArrayInterface {

    /**
     * 0x000000 : Date UTC value is not known
     */
    public static final int DATE_UTC_IS_NOT_KNOWN = 0x000000;

    /**
     * Date
     */
    private final int mDate;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public DateUtc(@NonNull byte[] values) {
        mDate = BLEUtils.createUInt24(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param date Date
     */
    public DateUtc(int date) {
        mDate = date;
    }

    /**
     * @return Date
     */
    public int getDate() {
        return mDate;
    }

    /**
     * @return {@code true}:Date UTC is not known, {@code false}:has Date UTC information
     * @see #DATE_UTC_IS_NOT_KNOWN
     */
    public boolean isDateUtcNotKnown() {
        return DATE_UTC_IS_NOT_KNOWN == mDate;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[3];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mDate);
        byteBuffer.put((byte) (mDate >> 8));
        byteBuffer.put((byte) (mDate >> 16));
        return data;
    }

}
