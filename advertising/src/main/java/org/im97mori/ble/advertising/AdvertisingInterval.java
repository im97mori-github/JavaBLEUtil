package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.DATA_TYPE_ADVERTISING_INTERVAL;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import androidx.annotation.NonNull;

/**
 * <p>
 * Advertising Interval
 * <p>
 * https://www.bluetooth.com/specifications/assigned-numbers/generic-access-profile/
 * </p>
 */
public class AdvertisingInterval extends AbstractAdvertisingData {

    /**
     * Core Specification Supplement v10 Part A 1.15.2 Unit of Advertising Interval(millis)
     */
    public static final double ADVERTISING_INTERVAL_UNIT_MILLIS = 0.625d;

    /**
     * Advertising Interval
     */
    private final int mAdvertisingInterval;

    /**
     * Constructor for Advertising Interval
     *
     * @param data   byte array from {@link ScanRecord#getBytes()}
     * @param offset data offset
     * @param length 1st octed of Advertising Data
     */
    public AdvertisingInterval(@NonNull byte[] data, int offset, int length) {
        super(length);

        ByteBuffer bb = ByteBuffer.wrap(data, offset + 2, length - 1).order(ByteOrder.LITTLE_ENDIAN);
        mAdvertisingInterval = bb.getShort() & 0xffff;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getDataType() {
        return DATA_TYPE_ADVERTISING_INTERVAL;
    }

    /**
     * @return Advertising Interval
     */
    public int getAdvertisingInterval() {
        return mAdvertisingInterval;
    }

    /**
     * @return Advertising Interval(millis)
     */
    public double getAdvertisingIntervalMillis() {
        return mAdvertisingInterval * ADVERTISING_INTERVAL_UNIT_MILLIS;
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
        byteBuffer.putShort((short) mAdvertisingInterval);
        return data;
    }

}
