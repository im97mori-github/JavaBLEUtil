package org.im97mori.ble.characteristic.u2b2d;

import java.util.Arrays;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Emergency ID (Characteristics UUID: 0x2B2D)
 */
public class EmergencyId implements ByteArrayInterface {

	/**
	 * Emergency ID
	 */
	private final byte[] mEmergencyId;

	/**
	 * Constructor from byte array
	 *
	 * @param values byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 */
	public EmergencyId(@NonNull byte[] values) {
		mEmergencyId = Arrays.copyOfRange(values, 0, 6);
	}

	/**
	 * @return Emergency ID
	 */
	public byte[] getEmergencyId() {
		return mEmergencyId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@NonNull
	public byte[] getBytes() {
		return mEmergencyId;
	}

}
