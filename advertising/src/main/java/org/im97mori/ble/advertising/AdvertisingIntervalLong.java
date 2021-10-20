package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.DATA_TYPE_ADVERTISING_INTERVAL_LONG;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;

import androidx.annotation.NonNull;

/**
 * <p>
 * Advertising Interval - long
 * <p>
 * https://www.bluetooth.com/specifications/assigned-numbers/generic-access-profile/
 * </p>
 */
public class AdvertisingIntervalLong extends AbstractAdvertisingData {

    /**
     * Core Specification Supplement v10 Part A 1.15.2 Unit of Advertising Interval
     * - long(millis)
     */
    public static final double ADVERTISING_INTERVAL_LONG_UNIT_MILLIS = 0.625d;

    /**
     * Advertising Interval - long
     */
    private final long mAdvertisingIntervalLong;

    /**
     * Constructor for Advertising Interval - long
     *
     * @param data   byte array from {@link ScanRecord#getBytes()}
     * @param offset data offset
     * @param length 1st octed of Advertising Data
     */
    public AdvertisingIntervalLong(@NonNull byte[] data, int offset, int length) {
        super(length);

        if (length == 5) {
            mAdvertisingIntervalLong = BLEUtils.createUInt32(data, offset + 2);
        } else {
            mAdvertisingIntervalLong = BLEUtils.createUInt24(data, offset + 2);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getDataType() {
        return DATA_TYPE_ADVERTISING_INTERVAL_LONG;
    }

    /**
     * @return Advertising Interval - long
     */
    public long getAdvertisingIntervalLong() {
        return mAdvertisingIntervalLong;
    }

    /**
     * @return Advertising Interval - long(millis)
     */
    public double getAdvertisingIntervalLongMillis() {
        return mAdvertisingIntervalLong * ADVERTISING_INTERVAL_LONG_UNIT_MILLIS;
    }

    /**
     * {@inheritDoc}
     */
    @NonNull
    @Override
    public byte[] getBytes() {
        byte[] data = new byte[1 + getLength()];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) getLength());
        byteBuffer.put((byte) getDataType());
        byteBuffer.put((byte) mAdvertisingIntervalLong);
        byteBuffer.put((byte) (mAdvertisingIntervalLong >> 8));
        byteBuffer.put((byte) (mAdvertisingIntervalLong >> 16));
        if (getLength() == 5) {
            byteBuffer.put((byte) (mAdvertisingIntervalLong >> 24));
        }
        return data;
    }

}
