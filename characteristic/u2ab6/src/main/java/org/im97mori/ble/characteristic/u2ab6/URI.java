package org.im97mori.ble.characteristic.u2ab6;


import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * URI (Characteristics UUID: 0x2AB6)
 */
public class URI implements ByteArrayInterface {

	/**
	 * URI
	 */
	private final String mUri;

	/**
	 * Constructor from byte array
	 *
	 * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 */
	public URI(@NonNull byte[] values) {
		mUri = new String(values);
	}

	/**
	 * Constructor from parameters
	 * 
	 * @param uri URI
	 */
	public URI(@NonNull String uri) {
		mUri = uri;
	}

	/**
	 * @return URI
	 */
	public String getUri() {
		return mUri;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@NonNull
	public byte[] getBytes() {
		return mUri.getBytes();
	}

}
