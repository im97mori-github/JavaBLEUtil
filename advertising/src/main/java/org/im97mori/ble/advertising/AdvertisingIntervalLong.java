package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.ADVERTISING_INTERVAL_LONG_DATA_TYPE;

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
     * @param data   byte array from <a href="https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
     * @param offset data offset
	 * @see #AdvertisingIntervalLong(byte[], int, int)
	 */
	public AdvertisingIntervalLong(@NonNull byte[] data, int offset) {
		this(data, offset, data[offset]);
	}
    
	
    /**
     * Constructor for Advertising Interval - long
     *
     * @param data   byte array from <a href="https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
     * @param offset data offset
     * @param length 1st octet of Advertising Data
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
	 * Constructor from parameters
	 * 
	 * @param isUInt32 {@code true}:4 octets, {@code false}:3 octets
	 * @param advertisingIntervalLong Advertising Interval - long
	 */
	public AdvertisingIntervalLong(boolean isUInt32, long advertisingIntervalLong) {
		super(isUInt32 ? 5 : 4);

		mAdvertisingIntervalLong = advertisingIntervalLong;
	}

    /**
     * {@inheritDoc}
     */
    @Override
    public int getDataType() {
        return ADVERTISING_INTERVAL_LONG_DATA_TYPE;
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
