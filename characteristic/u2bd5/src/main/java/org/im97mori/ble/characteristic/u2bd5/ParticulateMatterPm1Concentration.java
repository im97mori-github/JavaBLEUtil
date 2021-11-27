package org.im97mori.ble.characteristic.u2bd5;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;
import org.im97mori.ble.characteristic.core.IEEE_11073_20601_SFLOAT;

import androidx.annotation.NonNull;

/**
 * Particulate Matter - PM1 Concentration (Characteristics UUID: 0x2BD5)
 */
public class ParticulateMatterPm1Concentration implements ByteArrayInterface {

	/**
	 * Particulate Matter - PM1 Concentration
	 */
	private final IEEE_11073_20601_SFLOAT mParticulateMatterPm1Concentration;

	/**
	 * Constructor from byte array
	 *
	 * @param values byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 */
	public ParticulateMatterPm1Concentration(@NonNull byte[] values) {
		mParticulateMatterPm1Concentration = new IEEE_11073_20601_SFLOAT(values, 0);
	}

	/**
	 * Constructor from parameters
	 * 
	 * @param particulateMatterPm1Concentration Particulate Matter - PM1
	 *                                          Concentration
	 */
	public ParticulateMatterPm1Concentration(@NonNull IEEE_11073_20601_SFLOAT particulateMatterPm1Concentration) {
		mParticulateMatterPm1Concentration = particulateMatterPm1Concentration;
	}

	/**
	 * @return Particulate Matter - PM1 Concentration
	 */
	public IEEE_11073_20601_SFLOAT getParticulateMatterPm1Concentration() {
		return mParticulateMatterPm1Concentration;
	}

	/**
	 * @return {@code true}:The special value NRes is used to report a value that
	 *         cannot be represented with the available range and resolution,
	 *         possibly resulting from an overflow or underflow situation.
	 */
	public boolean isNres() {
		return BLEUtils.isSfloatNres(mParticulateMatterPm1Concentration.getData(), 0);
	}

	/**
	 * @return {@code true}:The special value NaN is used to report an invalid
	 *         result from a computation step or to indicate missing data due to the
	 *         hardware’s inability to provide a valid measurement, perhaps from
	 *         sensor perturbation.
	 */
	public boolean isNan() {
		return BLEUtils.isSfloatNan(mParticulateMatterPm1Concentration.getData(), 0);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@NonNull
	public byte[] getBytes() {
		byte[] data = new byte[2];
		ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
		byteBuffer.put(mParticulateMatterPm1Concentration.getData());
		return data;
	}

}
