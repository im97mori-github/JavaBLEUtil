package org.im97mori.ble.characteristic.u2b48;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.LinkedList;
import java.util.List;

import org.im97mori.ble.ByteArrayInterface;
import org.im97mori.ble.characteristic.u2b37.RegisteredUser;

import androidx.annotation.NonNull;

/**
 * Middle Name (Characteristics UUID: 0x2B48)
 */
public class MiddleName implements ByteArrayInterface {

	/**
	 * Middle Name
	 */
	private final String mMiddleName;

	/**
	 * Constructor from RegisteredUser array
	 *
	 * @param registeredUsers first to last Registered User Data array
	 */
	public MiddleName(@NonNull RegisteredUser... registeredUsers) {
		List<byte[]> dataList = new LinkedList<>();
		int length = 0;
		for (RegisteredUser registeredUser : registeredUsers) {
			dataList.add(registeredUser.getRegisteredUserData());
			length += dataList.get(dataList.size() - 1).length;
		}
		byte[] values = new byte[length];
		ByteBuffer byteBuffer = ByteBuffer.wrap(values).order(ByteOrder.LITTLE_ENDIAN);
		for (byte[] data : dataList) {
			byteBuffer.put(data);
		}

		mMiddleName = new String(values);
	}

	/**
	 * Constructor from parameters
	 * 
	 * @param middleName Middle Name
	 */
	public MiddleName(@NonNull String middleName) {
		mMiddleName = middleName;
	}

	/**
	 * @return Middle Name
	 */
	public String getMiddleName() {
		return mMiddleName;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@NonNull
	public byte[] getBytes() {
		byte[] data = new byte[3 + mMiddleName.getBytes().length];
		ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
		byteBuffer.put((byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_TRUE
				| RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_TRUE));
		byteBuffer.put((byte) (RegisteredUser.FLAGS_REGISTERED_USER_NAME_PRESENT_TRUE
				| RegisteredUser.FLAGS_USER_NAME_TRUNCATED_FALSE));
		byteBuffer.put((byte) 0);
		byteBuffer.put(mMiddleName.getBytes());
		return data;
	}

}
