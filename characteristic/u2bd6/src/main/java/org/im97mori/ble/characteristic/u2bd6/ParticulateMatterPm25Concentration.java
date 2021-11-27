package org.im97mori.ble.characteristic.u2bd6;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;
import org.im97mori.ble.characteristic.core.IEEE_11073_20601_SFLOAT;

import androidx.annotation.NonNull;

/**
 * Particulate Matter - PM2.5 Concentration (Characteristics UUID: 0x2BD6)
 */
public class ParticulateMatterPm25Concentration implements ByteArrayInterface {

	/**
	 * Particulate Matter - PM2.5 Concentration
	 */
	private final IEEE_11073_20601_SFLOAT mParticulateMatterPm25Concentration;

	/**
	 * Constructor from byte array
	 *
	 * @param values byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 */
	public ParticulateMatterPm25Concentration(@NonNull byte[] values) {
		mParticulateMatterPm25Concentration = new IEEE_11073_20601_SFLOAT(values, 0);
	}

	/**
	 * Constructor from parameters
	 * 
	 * @param particulateMatterPm25Concentration Particulate Matter - PM2.5
	 *                                           Concentration
	 */
	public ParticulateMatterPm25Concentration(@NonNull IEEE_11073_20601_SFLOAT particulateMatterPm25Concentration) {
		mParticulateMatterPm25Concentration = particulateMatterPm25Concentration;
	}

	/**
	 * @return Particulate Matter - PM2.5 Concentration
	 */
	public IEEE_11073_20601_SFLOAT getParticulateMatterPm25Concentration() {
		return mParticulateMatterPm25Concentration;
	}

	/**
	 * @return {@code true}:The special value NRes is used to report a value that
	 *         cannot be represented with the available range and resolution,
	 *         possibly resulting from an overflow or underflow situation.
	 */
	public boolean isNres() {
		return BLEUtils.isSfloatNres(mParticulateMatterPm25Concentration.getData(), 0);
	}

	/**
	 * @return {@code true}:The special value NaN is used to report an invalid
	 *         result from a computation step or to indicate missing data due to the
	 *         hardware’s inability to provide a valid measurement, perhaps from
	 *         sensor perturbation.
	 */
	public boolean isNan() {
		return BLEUtils.isSfloatNan(mParticulateMatterPm25Concentration.getData(), 0);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@NonNull
	public byte[] getBytes() {
		byte[] data = new byte[2];
		ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
		byteBuffer.put(mParticulateMatterPm25Concentration.getData());
		return data;
	}

}
