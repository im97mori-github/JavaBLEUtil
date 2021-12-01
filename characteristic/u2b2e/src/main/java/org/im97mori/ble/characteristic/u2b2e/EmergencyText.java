package org.im97mori.ble.characteristic.u2b2e;

import java.util.Arrays;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Emergency Text (Characteristics UUID: 0x2B2E)
 */
public class EmergencyText implements ByteArrayInterface {

	/**
	 * Max Octets
	 */
	public static final int MAX_OCTETS = 20;
	
	/**
	 * Emergency Text
	 */
	private final String mEmergencyText;

	/**
	 * Constructor from byte array
	 *
	 * @param values byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 */
	public EmergencyText(@NonNull byte[] values) {
		int length = values.length > MAX_OCTETS ? MAX_OCTETS : values.length;
		mEmergencyText = new String(Arrays.copyOfRange(values, 0, length));
	}

	/**
	 * Constructor from parameters
	 * 
	 * @param emergencyText Emergency Text
	 */
	public EmergencyText(@NonNull String emergencyText) {
		byte[] values = emergencyText.getBytes();
		int length = values.length > MAX_OCTETS ? MAX_OCTETS : values.length;
		mEmergencyText = new String(Arrays.copyOfRange(values, 0, length));
	}

	/**
	 * @return Emergency Text
	 */
	public String getEmergencyText() {
		return mEmergencyText;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@NonNull
	public byte[] getBytes() {
		return mEmergencyText.getBytes();
	}

}
