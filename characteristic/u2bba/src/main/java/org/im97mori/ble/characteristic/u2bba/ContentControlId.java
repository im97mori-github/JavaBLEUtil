package org.im97mori.ble.characteristic.u2bba;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Content Control ID (Characteristics UUID: 0x2BBA)
 */
public class ContentControlId implements ByteArrayInterface {

	/**
	 * Content Control ID
	 */
	private final int mContentControlId;

	/**
	 * Constructor from byte array
	 *
	 * @param values byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 */
	public ContentControlId(@NonNull byte[] values) {
		mContentControlId = BLEUtils.createUInt8(values, 0);
	}

	/**
	 * Constructor from parameters
	 * 
	 * @param contentControlId Content Control ID
	 */
	public ContentControlId(int contentControlId) {
		mContentControlId = contentControlId;
	}

	/**
	 * @return Content Control ID
	 */
	public int getContentControlId() {
		return mContentControlId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@NonNull
	public byte[] getBytes() {
		byte[] data = new byte[1];
		ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
		byteBuffer.put((byte) mContentControlId);
		return data;
	}

}
