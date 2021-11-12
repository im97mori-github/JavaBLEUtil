package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.ADVERTISING_INTERVAL_DATA_TYPE;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;

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
     * @param data   byte array from <a href="https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
     * @param offset data offset
	 * @see #AdvertisingInterval(byte[], int, int)
	 */
	public AdvertisingInterval(@NonNull byte[] data, int offset) {
		this(data, offset, data[offset]);
	}
    
    /**
     * Constructor for Advertising Interval
     *
     * @param data   byte array from <a href="https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
     * @param offset data offset
     * @param length 1st octet of Advertising Data
     */
    public AdvertisingInterval(@NonNull byte[] data, int offset, int length) {
        super(length);

        mAdvertisingInterval = BLEUtils.createUInt16(data, 2);
    }
    
	/**
	 * Constructor from parameters
	 * 
	 * @param advertisingInterval Advertising Interval
	 */
	public AdvertisingInterval(int advertisingInterval) {
		super(3);

		mAdvertisingInterval = advertisingInterval;
	}

    /**
     * {@inheritDoc}
     */
    @Override
    public int getDataType() {
        return ADVERTISING_INTERVAL_DATA_TYPE;
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
