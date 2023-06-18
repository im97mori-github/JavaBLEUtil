package org.im97mori.ble.characteristic.u2b88;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Encrypted Data Key Material (Characteristics UUID: 0x2B88)
 */
public class EncryptedDataKeyMaterial implements ByteArrayInterface {

	/**
	 * Session Key
	 */
	private final byte[] mSessionKey;

	/**
	 * IV
	 */
	private final byte[] mIv;

	/**
	 * Constructor from byte array
	 *
	 * @param values
	 *            byte array from <a href=
	 *            "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 */
	public EncryptedDataKeyMaterial(@NonNull byte[] values) {
		mSessionKey = Arrays.copyOfRange(values, 0, 16);
		mIv = Arrays.copyOfRange(values, 16, 24);
	}

	/**
	 * Constructor from parameters
	 * 
	 * @param sessionKey
	 *            Session Key
	 * @param iv
	 *            IV
	 */
	public EncryptedDataKeyMaterial(byte[] sessionKey, byte[] iv) {
		mSessionKey = sessionKey;
		mIv = iv;
	}

	/**
	 * @return Session Key
	 */
	public byte[] getSessionKey() {
		return mSessionKey;
	}

	/**
	 * @return Session Key
	 */
	public byte[] getIv() {
		return mIv;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@NonNull
	public byte[] getBytes() {
		byte[] data = new byte[24];
		ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
		byteBuffer.put(mSessionKey);
		byteBuffer.put(mIv);
		return data;
	}

}
