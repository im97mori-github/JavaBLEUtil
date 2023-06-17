package org.im97mori.ble.characteristic.u2b85;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Coordinated Set Size (Characteristics UUID: 0x2B85)
 */
public class CoordinatedSetSize implements ByteArrayInterface {

	/**
	 * Coordinated Set Size
	 */
	private final int mCoordinatedSetSize;

	/**
	 * Constructor from byte array
	 *
	 * @param values byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 */
	public CoordinatedSetSize(@NonNull byte[] values) {
		mCoordinatedSetSize = BLEUtils.createUInt8(values, 0);
	}

	/**
	 * Constructor from parameters
	 * 
	 * @param coordinatedSetSize Coordinated Set Size
	 */
	public CoordinatedSetSize(int coordinatedSetSize) {
		mCoordinatedSetSize = coordinatedSetSize;
	}

	/**
	 * @return Coordinated Set Size
	 */
	public int getCoordinatedSetSize() {
		return mCoordinatedSetSize;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@NonNull
	public byte[] getBytes() {
		byte[] data = new byte[1];
		ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
		byteBuffer.put((byte) mCoordinatedSetSize);
		return data;
	}

}
