package org.im97mori.ble.characteristic.u2bd0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;
import org.im97mori.ble.characteristic.core.IEEE_11073_20601_SFLOAT;

import androidx.annotation.NonNull;

/**
 * Carbon Monoxide Concentration (Characteristics UUID: 0x2BD0)
 */
public class CarbonMonoxideConcentration implements ByteArrayInterface {

	/**
	 * Carbon Monoxide Concentration
	 */
	private final IEEE_11073_20601_SFLOAT mCarbonMonoxideConcentration;

	/**
	 * Constructor from byte array
	 *
	 * @param values byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 */
	public CarbonMonoxideConcentration(@NonNull byte[] values) {
		mCarbonMonoxideConcentration = new IEEE_11073_20601_SFLOAT(values, 0);
	}

	/**
	 * Constructor from parameters
	 * 
	 * @param carbonMonoxideConcentration Carbon Monoxide Concentration
	 */
	public CarbonMonoxideConcentration(@NonNull IEEE_11073_20601_SFLOAT carbonMonoxideConcentration) {
		mCarbonMonoxideConcentration = carbonMonoxideConcentration;
	}

	/**
	 * @return Carbon Monoxide Concentration
	 */
	public IEEE_11073_20601_SFLOAT getCarbonMonoxideConcentration() {
		return mCarbonMonoxideConcentration;
	}

	/**
	 * @return {@code true}:The special value NRes is used to report a value that
	 *         cannot be represented with the available range and resolution,
	 *         possibly resulting from an overflow or underflow situation.
	 */
	public boolean isNres() {
		return BLEUtils.isSfloatNres(mCarbonMonoxideConcentration.getData(), 0);
	}

	/**
	 * @return {@code true}:The special value NaN is used to report an invalid
	 *         result from a computation step or to indicate missing data due to the
	 *         hardware’s inability to provide a valid measurement, perhaps from
	 *         sensor perturbation.
	 */
	public boolean isNan() {
		return BLEUtils.isSfloatNan(mCarbonMonoxideConcentration.getData(), 0);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@NonNull
	public byte[] getBytes() {
		byte[] data = new byte[2];
		ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
		byteBuffer.put(mCarbonMonoxideConcentration.getData());
		return data;
	}

}
