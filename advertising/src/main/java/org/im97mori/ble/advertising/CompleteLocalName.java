package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.COMPLETE_LOCAL_NAME_DATA_TYPE;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import androidx.annotation.NonNull;

/**
 * <p>
 * Complete Local Name
 * <p>
 * https://www.bluetooth.com/specifications/assigned-numbers/generic-access-profile/
 * </p>
 */
public class CompleteLocalName extends AbstractAdvertisingData {

	/**
	 * Complete Local Name
	 */
	private final String mCompleteLocalName;

	/**
	 * Constructor for Complete Local Name
	 *
	 * @param data   byte array from <a href="https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
	 * @param offset data offset
	 * @param length 1st octet of Advertising Data
	 */
	public CompleteLocalName(@NonNull byte[] data, int offset, int length) {
		super(length);
		mCompleteLocalName = new String(data, offset + 2, length - 1);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getDataType() {
		return COMPLETE_LOCAL_NAME_DATA_TYPE;
	}

	/**
	 * @return Complete Local Name
	 */
	@NonNull
	public String getCompleteLocalName() {
		return mCompleteLocalName;
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
		byteBuffer.put(mCompleteLocalName.getBytes());
		return data;
	}

}
