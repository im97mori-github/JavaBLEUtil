package org.im97mori.ble.characteristic.u2b84;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Set Identity Resolving Key Characteristic (Characteristics UUID: 0x2B84)
 */
public class SetIdentityResolvingKeyCharacteristic implements ByteArrayInterface {

	/**
	 * Encrypted SIRK
	 */
	public static final int TYPE_ENCRYPTED_SIRK = 0x00;

	/**
	 * Plain text SIRK
	 */
	public static final int TYPE_PLAIN_TEXT_SIRK = 0x01;

	/**
	 * Type
	 */
	private final int mType;

	/**
	 * Value
	 */
	private final byte[] mValue;

	/**
	 * Constructor from byte array
	 *
	 * @param values byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 */
	public SetIdentityResolvingKeyCharacteristic(@NonNull byte[] values) {
		mType = BLEUtils.createUInt8(values, 0);
		mValue = Arrays.copyOfRange(values, 1, 17);
	}

	/**
	 * Constructor from parameters
	 * 
	 * @param type  Type
	 * @param value Value
	 */
	public SetIdentityResolvingKeyCharacteristic(int type, @NonNull byte[] value) {
		mType = type;
		mValue = value;
	}

	/**
	 * @return Type
	 */
	public int getType() {
		return mType;
	}

	/**
	 * @return {@code true}:Encrypted SIRK, {@code false}:not Encrypted SIRK
	 */
	public boolean isTypeEncryptedSirk() {
		return mType == TYPE_ENCRYPTED_SIRK;
	}

	/**
	 * @return {@code true}:Plain text SIRK, {@code false}:not Plain text SIRK
	 */
	public boolean isTypePlainTextSirk() {
		return mType == TYPE_PLAIN_TEXT_SIRK;
	}

	/**
	 * @return Value
	 */
	@NonNull
	public byte[] getValue() {
		return mValue;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@NonNull
	public byte[] getBytes() {
		byte[] data = new byte[17];
		ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
		byteBuffer.put((byte) mType);
		byteBuffer.put(mValue);
		return data;
	}

}
