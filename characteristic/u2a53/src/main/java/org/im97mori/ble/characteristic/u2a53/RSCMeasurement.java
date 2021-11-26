package org.im97mori.ble.characteristic.u2a53;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * RSC Measurement (Characteristics UUID: 0x2A53)
 */
public class RSCMeasurement implements ByteArrayInterface {

	/**
	 * @see #FLAGS_INSTANTANEOUS_STRIDE_LENGTH_PRESENT_FALSE
	 * @see #FLAGS_INSTANTANEOUS_STRIDE_LENGTH_PRESENT_TRUE
	 */
	public static final int FLAGS_INSTANTANEOUS_STRIDE_LENGTH_PRESENT_MASK = 0b00000001;

	/**
	 * 0: Instantaneous Stride Length Present False
	 */
	public static final int FLAGS_INSTANTANEOUS_STRIDE_LENGTH_PRESENT_FALSE = 0b00000000;

	/**
	 * 0: Instantaneous Stride Length Present True
	 */
	public static final int FLAGS_INSTANTANEOUS_STRIDE_LENGTH_PRESENT_TRUE = 0b00000001;

	/**
	 * @see #FLAGS_TOTAL_DISTANCE_PRESENT_FALSE
	 * @see #FLAGS_TOTAL_DISTANCE_PRESENT_TRUE
	 */
	public static final int FLAGS_TOTAL_DISTANCE_PRESENT_MASK = 0b00000010;

	/**
	 * 0: Total Distance Present False
	 */
	public static final int FLAGS_TOTAL_DISTANCE_PRESENT_FALSE = 0b00000000;

	/**
	 * 1: Total Distance Present True
	 */
	public static final int FLAGS_TOTAL_DISTANCE_PRESENT_TRUE = 0b00000010;

	/**
	 * @see #FLAGS_WALKING_OR_RUNNING_STATUS_BITS_WALKING
	 * @see #FLAGS_WALKING_OR_RUNNING_STATUS_BITS_RUNNING
	 */
	public static final int FLAGS_WALKING_OR_RUNNING_STATUS_BITS_MASK = 0b00000100;

	/**
	 * 0: Walking or Running Status bits Walking
	 */
	public static final int FLAGS_WALKING_OR_RUNNING_STATUS_BITS_WALKING = 0b00000000;

	/**
	 * 1: Walking or Running Status bits Running
	 */
	public static final int FLAGS_WALKING_OR_RUNNING_STATUS_BITS_RUNNING = 0b00000100;

	/**
	 * Instantaneous Speed Unit 1/256 meters per second
	 */
	public static final double INSTANTANEOUS_SPEED_RESOLUTION = 1d / 256d;

	/**
	 * Instantaneous Stride Length Unit meter
	 */
	public static final double INSTANTANEOUS_STRIDE_RESOLUTION = 0.01d;

	/**
	 * Total Distance Unit meter
	 */
	public static final double TOTAL_DISTANCE_RESOLUTION = 0.1d;

	/**
	 * Flags
	 */
	private final int mFlags;

	/**
	 * Instantaneous Speed
	 */
	private final int mInstantaneousSpeed;

	/**
	 * Instantaneous Cadence
	 */
	private final int mInstantaneousCadence;

	/**
	 * Instantaneous Stride Length
	 */
	private final int mInstantaneousStrideLength;

	/**
	 * Total Distance
	 */
	private final long mTotalDistance;

	/**
	 * Constructor from byte array
	 *
	 * @param values byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 */
	public RSCMeasurement(@NonNull byte[] values) {
		int index = 0;
		mFlags = values[index++];
		mInstantaneousSpeed = BLEUtils.createUInt16(values, index);
		index += 2;
		mInstantaneousCadence = (values[index++] & 0xff);
		if (isFlagsInstantaneousStrideLengthPresent()) {
			mInstantaneousStrideLength = BLEUtils.createUInt16(values, index);
			index += 2;
		} else {
			mInstantaneousStrideLength = 0;
		}
		if (isFlagsTotalDistancePresent()) {
			mTotalDistance = BLEUtils.createUInt32(values, index);
		} else {
			mTotalDistance = 0;
		}
	}

	/**
	 * Constructor from parameters
	 * 
	 * @param flags                     Flags
	 * @param instantaneousSpeed        Instantaneous Speed
	 * @param instantaneousCadence      Instantaneous Cadence
	 * @param instantaneousStrideLength Instantaneous Stride Length
	 * @param totalDistance             Total Distance
	 */
	public RSCMeasurement(int flags, int instantaneousSpeed, int instantaneousCadence, int instantaneousStrideLength,
			long totalDistance) {
		mFlags = flags;
		mInstantaneousSpeed = instantaneousSpeed;
		mInstantaneousCadence = instantaneousCadence;
		mInstantaneousStrideLength = instantaneousStrideLength;
		mTotalDistance = totalDistance;
	}

	/**
	 * @return Flags
	 */
	public int getFlags() {
		return mFlags;
	}

	/**
	 * @return {@code true}:Instantaneous Stride Length not Present,
	 *         {@code false}:Instantaneous Stride Length Present
	 */
	public boolean isFlagsInstantaneousStrideLengthNotPresent() {
		return isFlagsMatched(FLAGS_INSTANTANEOUS_STRIDE_LENGTH_PRESENT_MASK,
				FLAGS_INSTANTANEOUS_STRIDE_LENGTH_PRESENT_FALSE);
	}

	/**
	 * @return {@code true}:Instantaneous Stride Length Present,
	 *         {@code false}:Instantaneous Stride Length not Present
	 */
	public boolean isFlagsInstantaneousStrideLengthPresent() {
		return isFlagsMatched(FLAGS_INSTANTANEOUS_STRIDE_LENGTH_PRESENT_MASK,
				FLAGS_INSTANTANEOUS_STRIDE_LENGTH_PRESENT_TRUE);
	}

	/**
	 * @return {@code true}:Total Distance not Present, {@code false}:Total Distance
	 *         Present
	 */
	public boolean isFlagsTotalDistanceNotPresent() {
		return isFlagsMatched(FLAGS_TOTAL_DISTANCE_PRESENT_MASK, FLAGS_TOTAL_DISTANCE_PRESENT_FALSE);
	}

	/**
	 * @return {@code true}:Total Distance Present, {@code false}:Total Distance not
	 *         Present
	 */
	public boolean isFlagsTotalDistancePresent() {
		return isFlagsMatched(FLAGS_TOTAL_DISTANCE_PRESENT_MASK, FLAGS_TOTAL_DISTANCE_PRESENT_TRUE);
	}

	/**
	 * @return {@code true}:Walking or Running Status bits Walking,
	 *         {@code false}:Walking or Running Status bits Running
	 */
	public boolean isFlagsWalkingOrRunningStatusBitsWalking() {
		return isFlagsMatched(FLAGS_WALKING_OR_RUNNING_STATUS_BITS_MASK, FLAGS_WALKING_OR_RUNNING_STATUS_BITS_WALKING);
	}

	/**
	 * @return {@code true}:Walking or Running Status bits Running,
	 *         {@code false}:Walking or Running Status bits Walking
	 */
	public boolean isFlagsWalkingOrRunningStatusBitsRunning() {
		return isFlagsMatched(FLAGS_WALKING_OR_RUNNING_STATUS_BITS_MASK, FLAGS_WALKING_OR_RUNNING_STATUS_BITS_RUNNING);
	}

	/**
	 * @return Instantaneous Speed
	 */
	public int getInstantaneousSpeed() {
		return mInstantaneousSpeed;
	}

	/**
	 * @return Instantaneous Speed(meter per second)
	 */
	public double getInstantaneousSpeedMeterPerSecond() {
		return mInstantaneousSpeed * INSTANTANEOUS_SPEED_RESOLUTION;
	}

	/**
	 * @return Instantaneous Cadence
	 */
	public int getInstantaneousCadence() {
		return mInstantaneousCadence;
	}

	/**
	 * @return Instantaneous Stride Length
	 */
	public int getInstantaneousStrideLength() {
		return mInstantaneousStrideLength;
	}

	/**
	 * @return Instantaneous Stride Length(meter)
	 */
	public double getInstantaneousStrideLengthMeter() {
		return mInstantaneousStrideLength * INSTANTANEOUS_STRIDE_RESOLUTION;
	}

	/**
	 * @return Total Distance
	 */
	public long getTotalDistance() {
		return mTotalDistance;
	}

	/**
	 * @return Total Distance(meter)
	 */
	public double getTotalDistanceMeter() {
		return mTotalDistance * TOTAL_DISTANCE_RESOLUTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@NonNull
	public byte[] getBytes() {
		int length = 4;
		byte[] data = new byte[10];
		ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
		byteBuffer.put((byte) mFlags);
		byteBuffer.putShort((short) mInstantaneousSpeed);
		byteBuffer.put((byte) mInstantaneousCadence);
		if (isFlagsInstantaneousStrideLengthPresent()) {
			byteBuffer.putShort((short) mInstantaneousStrideLength);
			length += 2;
		}
		if (isFlagsTotalDistancePresent()) {
			byteBuffer.putInt((int) mTotalDistance);
			length += 4;
		}
		return Arrays.copyOfRange(data, 0, length);
	}

	/**
	 * check Flags
	 *
	 * @param mask   bitmask for expect
	 * @param expect one of {@link #FLAGS_INSTANTANEOUS_STRIDE_LENGTH_PRESENT_FALSE}
	 *               , {@link #FLAGS_INSTANTANEOUS_STRIDE_LENGTH_PRESENT_TRUE} ,
	 *               {@link #FLAGS_TOTAL_DISTANCE_PRESENT_FALSE} ,
	 *               {@link #FLAGS_TOTAL_DISTANCE_PRESENT_TRUE} ,
	 *               {@link #FLAGS_WALKING_OR_RUNNING_STATUS_BITS_WALKING} ,
	 *               {@link #FLAGS_WALKING_OR_RUNNING_STATUS_BITS_RUNNING}
	 * @return {@code true}:same as expect, {@code false}:not match
	 */
	private boolean isFlagsMatched(int mask, int expect) {
		return (mask & mFlags) == expect;
	}

}
