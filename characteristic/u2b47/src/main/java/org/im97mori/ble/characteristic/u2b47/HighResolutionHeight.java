package org.im97mori.ble.characteristic.u2b47;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * High Resolution Height (Characteristics UUID: 0x2B47)
 */
public class HighResolutionHeight implements ByteArrayInterface {

	/**
	 * Unit: 0.0001m
	 */
	public static final double HEIGHT_RESOLUTION = 0.0001d;

	/**
	 * Height
	 */
	private final int mHeight;

	/**
	 * Constructor from byte array
	 *
	 * @param values byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 */
	public HighResolutionHeight(@NonNull byte[] values) {
		mHeight = BLEUtils.createUInt16(values, 0);
	}

	/**
	 * Constructor from parameters
	 * 
	 * @param height Height
	 */
	public HighResolutionHeight(int height) {
		mHeight = height;
	}

	/**
	 * Height
	 */
	public int getHeight() {
		return mHeight;
	}

	/**
	 * 
	 * @return Height(meter)
	 */
	public double getHeightMeter() {
		return mHeight * HEIGHT_RESOLUTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@NonNull
	public byte[] getBytes() {
		byte[] data = new byte[2];
		ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
		byteBuffer.putShort((short) mHeight);
		return data;
	}

}
