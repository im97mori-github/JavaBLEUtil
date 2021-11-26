package org.im97mori.ble.characteristic.u2b46;

import java.util.UUID;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Preferred Units (Characteristics UUID: 0x2B46)
 */
public class PreferredUnits implements ByteArrayInterface {

	/**
	 * Units
	 */
	private final byte[] mUnits;

	/**
	 * Constructor from byte array
	 *
	 * @param values byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 */
	public PreferredUnits(@NonNull byte[] values) {
		mUnits = values;
	}

	/**
	 * Constructor from parameters
	 * 
	 * @param units 128bit unit uuid
	 */
	public PreferredUnits(@NonNull UUID... units) {
		mUnits = new byte[units.length * 2];
		for (int i = 0; i < units.length; i++) {
			mUnits[i * 2] = (byte) BLEUtils.convert128to16(units[i]);
			mUnits[i * 2 + 1] = (byte) (BLEUtils.convert128to16(units[i]) >> 8);
		}
	}

	/**
	 * Constructor from parameters
	 * 
	 * @param units 16bit unit uuid
	 */
	public PreferredUnits(@NonNull int... units) {
		mUnits = new byte[units.length * 2];
		for (int i = 0; i < units.length; i++) {
			mUnits[i * 2] = (byte) units[i];
			mUnits[i * 2 + 1] = (byte) (units[i] >> 8);
		}
	}

	/**
	 * 
	 * @return Units
	 */
	public byte[] getUnits() {
		return mUnits;
	}

	/**
	 * 
	 * @return count of Unit
	 */
	public int getUnitCount() {
		return mUnits.length / 2;
	}

	/**
	 * 
	 * @param index 0 - count
	 * @return unit
	 * @see org.im97mori.ble.constants.UnitUUID
	 */
	public int getUnit(int index) {
		return BLEUtils.createUInt16(mUnits, index * 2);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@NonNull
	public byte[] getBytes() {
		return mUnits;
	}

}
