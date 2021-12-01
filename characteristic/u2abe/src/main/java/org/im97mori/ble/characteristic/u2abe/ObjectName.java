package org.im97mori.ble.characteristic.u2abe;

import java.util.Arrays;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Object Name (Characteristics UUID: 0x2ABE)
 */
public class ObjectName implements ByteArrayInterface {

	/**
	 * Max Octets
	 */
	public static final int MAX_OCTETS = 120;

	/**
	 * Object Name
	 */
	private final String mObjectName;

	/**
	 * Constructor from byte array
	 *
	 * @param values byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 */
	public ObjectName(@NonNull byte[] values) {
		int length = values.length > MAX_OCTETS ? MAX_OCTETS : values.length;
		mObjectName = new String(Arrays.copyOfRange(values, 0, length));
	}

	/**
	 * Constructor from parameters
	 * 
	 * @param objectName Object Name
	 */
	public ObjectName(@NonNull String objectName) {
		byte[] values = objectName.getBytes();
		int length = values.length > MAX_OCTETS ? MAX_OCTETS : values.length;
		mObjectName = new String(Arrays.copyOfRange(values, 0, length));
	}

	/**
	 * @return Object Name
	 */
	public String getObjectName() {
		return mObjectName;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@NonNull
	public byte[] getBytes() {
		return mObjectName.getBytes();
	}

}
