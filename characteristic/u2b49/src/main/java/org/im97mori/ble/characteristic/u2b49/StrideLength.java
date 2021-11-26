package org.im97mori.ble.characteristic.u2b49;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Stride Length (Characteristics UUID: 0x2B49)
 */
public class StrideLength implements ByteArrayInterface {

	/**
	 * Stride Length Unit meter
	 */
	public static final double STRIDE_COUNT_RESOLUTION = 0.001d;

	/**
	 * Stride Length
	 */
	private final int mStrideLength;

	/**
	 * Constructor from byte array
	 *
	 * @param values byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 */
	public StrideLength(@NonNull byte[] values) {
		mStrideLength = BLEUtils.createUInt16(values, 0);
	}

	/**
	 * Constructor from parameters
	 * 
	 * @param strideLength Stride Length
	 */
	public StrideLength(int strideLength) {
		mStrideLength = strideLength;
	}

	/**
	 * @return Stride Length
	 */
	public int getStrideLength() {
		return mStrideLength;
	}

	/**
	 * @return Stride Length(meter)
	 */
	public double getStrideLengthMeter() {
		return mStrideLength * STRIDE_COUNT_RESOLUTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@NonNull
	public byte[] getBytes() {
		byte[] data = new byte[2];
		ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
		byteBuffer.putShort((short) mStrideLength);
		return data;
	}

}
