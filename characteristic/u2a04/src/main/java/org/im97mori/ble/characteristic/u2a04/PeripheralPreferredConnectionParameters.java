package org.im97mori.ble.characteristic.u2a04;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Peripheral Preferred Connection Parameters (Characteristics UUID: 0x2A04)
 */
public class PeripheralPreferredConnectionParameters implements ByteArrayInterface {

	/**
	 * Unit: 1.25ms
	 */
	public static final double MINIMUM_CONNECTION_INTERVAL_UNIT = 1.25d;

	/**
	 * Unit: 1.25ms
	 */
	public static final double MAXIMUM_CONNECTION_INTERVAL_UNIT = 1.25d;

	/**
	 * Unit: 10ms
	 */
	public static final double TIMEOUT_UNIT = 10d;

	/**
	 * Minimum Connection Interval
	 */
	private final int mMinimumConnectionInterval;

	/**
	 * Maximum Connection Interval
	 */
	private final int mMaximumConnectionInterval;

	/**
	 * Latency
	 */
	private final int mLatency;

	/**
	 * Timeout
	 */
	private final int mTimeout;

	/**
	 * Constructor from byte array
	 *
	 * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 */
	public PeripheralPreferredConnectionParameters(@NonNull byte[] values) {
		mMinimumConnectionInterval = BLEUtils.createUInt16(values, 0);
		mMaximumConnectionInterval = BLEUtils.createUInt16(values, 2);
		mLatency = BLEUtils.createUInt16(values, 4);
		mTimeout = BLEUtils.createUInt16(values, 6);
	}

	/**
	 * Constructor from parameters
	 * 
	 * @param minimumConnectionInterval Minimum Connection Interval
	 * @param maximumConnectionInterval Maximum Connection Interval
	 * @param latency                   Latency
	 * @param timeout                   Timeout
	 */
	public PeripheralPreferredConnectionParameters(int minimumConnectionInterval, int maximumConnectionInterval,
			int latency, int timeout) {
		mMinimumConnectionInterval = minimumConnectionInterval;
		mMaximumConnectionInterval = maximumConnectionInterval;
		mLatency = latency;
		mTimeout = timeout;
	}

	/**
	 * @return Minimum Connection Interval
	 */
	public int getMinimumConnectionInterval() {
		return mMinimumConnectionInterval;
	}

	/**
	 * @return Minimum connection interval(millis)
	 */
	public double getMinimumConnectionIntervalMillis() {
		return mMinimumConnectionInterval * MINIMUM_CONNECTION_INTERVAL_UNIT;
	}

	/**
	 * @return Maximum Connection Interval
	 */
	public int getMaximumConnectionInterval() {
		return mMaximumConnectionInterval;
	}

	/**
	 * @return Maximum connection interval(millis)
	 */
	public double getMaximumConnectionIntervalMillis() {
		return mMaximumConnectionInterval * MAXIMUM_CONNECTION_INTERVAL_UNIT;
	}

	/**
	 * @return Latency
	 */
	public int getLatency() {
		return mLatency;
	}

	/**
	 * @return Timeout
	 */
	public int getTimeout() {
		return mTimeout;
	}

	/**
	 * @return Timeout(millis)
	 */
	public double getTimeoutMillis() {
		return mTimeout * TIMEOUT_UNIT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@NonNull
	public byte[] getBytes() {
		byte[] data = new byte[8];
		ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
		byteBuffer.putShort((short) mMinimumConnectionInterval);
		byteBuffer.putShort((short) mMaximumConnectionInterval);
		byteBuffer.putShort((short) mLatency);
		byteBuffer.putShort((short) mTimeout);
		return data;
	}

}
