package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.PERIPHERAL_CONNECTION_INTERVAL_RANGE_DATA_TYPE;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;

import androidx.annotation.NonNull;

/**
 * <p>
 * Peripheral Connection Interval Range(Slave Connection Interval Range)
 * <p>
 * https://www.bluetooth.com/specifications/assigned-numbers/generic-access-profile/
 * </p>
 */
public class PeripheralConnectionIntervalRange extends AbstractAdvertisingData {

	/**
	 * Core Specification Supplement v10 Part A 1.9.2 Unit of Connection Interval
	 * Range(millis)
	 */
	public static final double PERIPHERAL_CONNECTION_INTERVAL_RANGE_UNIT_MILLIS = 1.25d;

	/**
	 * Core Specification Supplement v10 Part A 1.9.2 no specific minimum / maximum
	 * values
	 */
	public static final int PERIPHERAL_CONNECTION_INTERVAL_NO_SPECIFIC_VALUE = 0xffff;

	/**
	 * <p>
	 * Minimum connection interval
	 * <p>
	 * Core Specification Supplement v10 Part A 1.9.2
	 * </p>
	 */
	private final int mMinimumValue;

	/**
	 * <p>
	 * Maximum connection interval
	 * <p>
	 * Core Specification Supplement v10 Part A 1.9.2
	 * </p>
	 */
	private final int mMaximumValue;

	/**
     * @param data   byte array from <a href="https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
     * @param offset data offset
	 * @see #PeripheralConnectionIntervalRange(byte[], int, int)
	 */
	public PeripheralConnectionIntervalRange(@NonNull byte[] data, int offset) {
		this(data, offset, data[offset]);
	}

	/**
	 * Constructor for Peripheral Connection Interval Range
	 *
	 * @param data   byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
	 * @param offset data offset
	 * @param length 1st octet of Advertising Data
	 */
	public PeripheralConnectionIntervalRange(@NonNull byte[] data, int offset, int length) {
		super(length);

		mMinimumValue = BLEUtils.createUInt16(data, offset + 2);
		mMaximumValue = BLEUtils.createUInt16(data, offset + 4);
	}

	/**
	 * Constructor from parameters
	 * 
	 * @param minimumValue Minimum connection interval
	 * @param maximumValue Maximum connection interval
	 */
	public PeripheralConnectionIntervalRange(int minimumValue, int maximumValue) {
		super(5);

		mMinimumValue = minimumValue;
		mMaximumValue = maximumValue;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getDataType() {
		return PERIPHERAL_CONNECTION_INTERVAL_RANGE_DATA_TYPE;
	}

	/**
	 * check Minimum connection interval is presented
	 *
	 * @return {@code true}:presented, [@code false}:not presented
	 */
	public boolean hasMinimum() {
		return mMinimumValue != PERIPHERAL_CONNECTION_INTERVAL_NO_SPECIFIC_VALUE;
	}

	/**
	 * check Maximum connection interval is presented
	 *
	 * @return {@code true}:presented, [@code false}:not presented
	 */
	public boolean hasMaximum() {
		return mMaximumValue != PERIPHERAL_CONNECTION_INTERVAL_NO_SPECIFIC_VALUE;
	}

	/**
	 * if {@link #hasMinimum()} return true, return Minimum connection interval
	 *
	 * @return Minimum connection interval
	 */
	public int getMinimumValue() {
		return mMinimumValue;
	}

	/**
	 * if {@link #hasMinimum()} return true, return Minimum connection interval
	 *
	 * @return Minimum connection interval(millis)
	 */
	public double getMinimumValueMillis() {
		return mMinimumValue * PERIPHERAL_CONNECTION_INTERVAL_RANGE_UNIT_MILLIS;
	}

	/**
	 * if {@link #hasMaximum()} return true, return Maximum connection interval
	 *
	 * @return Maximum connection interval
	 */
	public int getMaximumValue() {
		return mMaximumValue;
	}

	/**
	 * if {@link #hasMaximum()} return true, return Maximum connection interval
	 *
	 * @return Maximum connection interval(millis)
	 */
	public double getMaximumValueMillis() {
		return mMaximumValue * PERIPHERAL_CONNECTION_INTERVAL_RANGE_UNIT_MILLIS;
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
		byteBuffer.putShort((short) mMinimumValue);
		byteBuffer.putShort((short) mMaximumValue);
		return data;
	}

}
