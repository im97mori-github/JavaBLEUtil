package org.im97mori.ble.characteristic.u2b87;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Rank Characteristic (Characteristics UUID: 0x2B87)
 */
public class RankCharacteristic implements ByteArrayInterface {

	/**
	 * Set Member Rank
	 */
	private final int mSetMemberRank;

	/**
	 * Constructor from byte array
	 *
	 * @param values byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 */
	public RankCharacteristic(@NonNull byte[] values) {
		mSetMemberRank = BLEUtils.createUInt8(values, 0);
	}

	/**
	 * Constructor from parameters
	 * 
	 * @param setMemberRank Set Member Rank
	 */
	public RankCharacteristic(int setMemberRank) {
		mSetMemberRank = setMemberRank;
	}

	/**
	 * @return Set Member Rank
	 */
	public int getSetMemberRank() {
		return mSetMemberRank;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@NonNull
	public byte[] getBytes() {
		byte[] data = new byte[1];
		ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
		byteBuffer.put((byte) mSetMemberRank);
		return data;
	}

}
