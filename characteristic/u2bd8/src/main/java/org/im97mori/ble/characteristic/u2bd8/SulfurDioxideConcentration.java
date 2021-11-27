package org.im97mori.ble.characteristic.u2bd8;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;
import org.im97mori.ble.characteristic.core.IEEE_11073_20601_SFLOAT;

import androidx.annotation.NonNull;

/**
 * Sulfur Dioxide Concentration (Characteristics UUID: 0x2BD8)
 */
public class SulfurDioxideConcentration implements ByteArrayInterface {

	/**
	 * Sulfur Dioxide Concentration
	 */
	private final IEEE_11073_20601_SFLOAT mSulfurDioxideConcentration;

	/**
	 * Constructor from byte array
	 *
	 * @param values byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 */
	public SulfurDioxideConcentration(@NonNull byte[] values) {
		mSulfurDioxideConcentration = new IEEE_11073_20601_SFLOAT(values, 0);
	}

	/**
	 * Constructor from parameters
	 * 
	 * @param sulfurDioxideConcentration Sulfur Dioxide Concentration
	 */
	public SulfurDioxideConcentration(@NonNull IEEE_11073_20601_SFLOAT sulfurDioxideConcentration) {
		mSulfurDioxideConcentration = sulfurDioxideConcentration;
	}

	/**
	 * @return Sulfur Dioxide Concentration
	 */
	public IEEE_11073_20601_SFLOAT getSulfurDioxideConcentration() {
		return mSulfurDioxideConcentration;
	}

	/**
	 * @return {@code true}:The special value NRes is used to report a value that
	 *         cannot be represented with the available range and resolution,
	 *         possibly resulting from an overflow or underflow situation.
	 */
	public boolean isNres() {
		return BLEUtils.isSfloatNres(mSulfurDioxideConcentration.getData(), 0);
	}

	/**
	 * @return {@code true}:The special value NaN is used to report an invalid
	 *         result from a computation step or to indicate missing data due to the
	 *         hardware’s inability to provide a valid measurement, perhaps from
	 *         sensor perturbation.
	 */
	public boolean isNan() {
		return BLEUtils.isSfloatNan(mSulfurDioxideConcentration.getData(), 0);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@NonNull
	public byte[] getBytes() {
		byte[] data = new byte[2];
		ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
		byteBuffer.put(mSulfurDioxideConcentration.getData());
		return data;
	}

}
