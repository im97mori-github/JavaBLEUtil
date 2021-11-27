package org.im97mori.ble.characteristic.u2bd3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;
import org.im97mori.ble.characteristic.core.IEEE_11073_20601_SFLOAT;

import androidx.annotation.NonNull;

/**
 * Non-Methane Volatile Organic Compounds Concentration (Characteristics UUID: 0x2BD3)
 */
public class NonMethaneVolatileOrganicCompoundsConcentration implements ByteArrayInterface {

	/**
	 * Non-Methane Volatile Organic Compounds Concentration
	 */
	private final IEEE_11073_20601_SFLOAT mNonMethaneVolatileOrganicCompoundsConcentration;

	/**
	 * Constructor from byte array
	 *
	 * @param values byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 */
	public NonMethaneVolatileOrganicCompoundsConcentration(@NonNull byte[] values) {
		mNonMethaneVolatileOrganicCompoundsConcentration = new IEEE_11073_20601_SFLOAT(values, 0);
	}

	/**
	 * Constructor from parameters
	 * 
	 * @param nonMethaneVolatileOrganicCompoundsConcentration Non-Methane Volatile Organic Compounds Concentration
	 */
	public NonMethaneVolatileOrganicCompoundsConcentration(@NonNull IEEE_11073_20601_SFLOAT nonMethaneVolatileOrganicCompoundsConcentration) {
		mNonMethaneVolatileOrganicCompoundsConcentration = nonMethaneVolatileOrganicCompoundsConcentration;
	}

	/**
	 * @return Non-Methane Volatile Organic Compounds Concentration
	 */
	public IEEE_11073_20601_SFLOAT getNonMethaneVolatileOrganicCompoundsConcentration() {
		return mNonMethaneVolatileOrganicCompoundsConcentration;
	}

	/**
	 * @return {@code true}:The special value NRes is used to report a value that
	 *         cannot be represented with the available range and resolution,
	 *         possibly resulting from an overflow or underflow situation.
	 */
	public boolean isNres() {
		return BLEUtils.isSfloatNres(mNonMethaneVolatileOrganicCompoundsConcentration.getData(), 0);
	}

	/**
	 * @return {@code true}:The special value NaN is used to report an invalid
	 *         result from a computation step or to indicate missing data due to the
	 *         hardware’s inability to provide a valid measurement, perhaps from
	 *         sensor perturbation.
	 */
	public boolean isNan() {
		return BLEUtils.isSfloatNan(mNonMethaneVolatileOrganicCompoundsConcentration.getData(), 0);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@NonNull
	public byte[] getBytes() {
		byte[] data = new byte[2];
		ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
		byteBuffer.put(mNonMethaneVolatileOrganicCompoundsConcentration.getData());
		return data;
	}

}
