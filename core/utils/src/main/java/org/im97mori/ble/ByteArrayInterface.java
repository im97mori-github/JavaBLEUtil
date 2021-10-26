package org.im97mori.ble;

import androidx.annotation.NonNull;

/**
 * Interface for create byte array
 */
public interface ByteArrayInterface {

	/**
	 * Create byte array from <a href=
	 * "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 * or <a href=
	 * "https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
	 *
	 * @return byte array
	 */
	@NonNull
	byte[] getBytes();

}
