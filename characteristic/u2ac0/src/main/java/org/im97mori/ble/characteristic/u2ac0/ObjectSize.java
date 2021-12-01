package org.im97mori.ble.characteristic.u2ac0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * object size (Characteristics UUID: 0x2AC0)
 */
public class ObjectSize implements ByteArrayInterface {

	/**
	 * Current Size
	 */
	private final long mCurrentSize;

	/**
	 * Allocated Size
	 */
	private final long mAllocatedSize;

	/**
	 * Constructor from byte array
	 *
	 * @param values byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 */
	public ObjectSize(@NonNull byte[] values) {
		mCurrentSize = BLEUtils.createUInt32(values, 0);
		mAllocatedSize = BLEUtils.createUInt32(values, 4);
	}

	/**
	 * Constructor from parameters
	 * 
	 * @param currentSize   Current Size
	 * @param allocatedSize Allocated Size
	 */
	public ObjectSize(long currentSize, long allocatedSize) {
		mCurrentSize = currentSize;
		mAllocatedSize = allocatedSize;
	}

	/**
	 * @return Current Size
	 */
	public long getCurrentSize() {
		return mCurrentSize;
	}

	/**
	 * @return Allocated Size
	 */
	public long getAllocatedSize() {
		return mAllocatedSize;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@NonNull
	public byte[] getBytes() {
		byte[] data = new byte[8];
		ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
		byteBuffer.putInt((int) mCurrentSize);
		byteBuffer.putInt((int) mAllocatedSize);
		return data;
	}

}
