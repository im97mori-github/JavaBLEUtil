package org.im97mori.ble.characteristic.u2bdf;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * High Temperature (Characteristics UUID: 0x2BDF)
 */
// @TODO 0xFDDE(-546, -273 degree celsius) is Minimum value, but Values 0x8002
// to 0xFDDE are prohibited.Is 0xFDDE prohibited or not?
public class HighTemperature implements ByteArrayInterface {

	/**
	 * High Temperature Unit 0.5
	 */
	public static final double HIGH_TEMPERATURE_RESOLUTION = 0.5d;

	/**
	 * Value is not valid
	 */
	public static final int HIGH_TEMPERATURE_VALUE_IS_NOT_VALID = 0x8001;

	/**
	 * Value is not known
	 */
	public static final int HIGH_TEMPERATURE_VALUE_IS_NOT_KNOWN = 0x8000;

	/**
	 * High Temperatur
	 */
	private final int mHighTemperature;

	/**
	 * Constructor from byte array
	 *
	 * @param values
	 *            byte array from <a href=
	 *            "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 */
	public HighTemperature(@NonNull byte[] values) {
		mHighTemperature = BLEUtils.createSInt16(values, 0);
	}

	/**
	 * Constructor from parameters
	 * 
	 * @param highTemperature
	 *            High Temperature
	 */
	public HighTemperature(int highTemperature) {
		mHighTemperature = highTemperature;
	}

	/**
	 * @return High Temperature
	 */
	public int geHighTemperature() {
		return mHighTemperature;
	}

	/**
	 * @return High Temperature(degree Celsius)
	 */
	public double geHighTemperatureDegreeCelsius() {
		return mHighTemperature * HIGH_TEMPERATURE_RESOLUTION;
	}

	/**
	 * @return {@code true}:Value is not valid
	 */
	public boolean isValueIsNotValid() {
		return (0xffff & mHighTemperature) == (0xffff & HIGH_TEMPERATURE_VALUE_IS_NOT_VALID);
	}

	/**
	 * @return {@code true}:Value is not known
	 */
	public boolean isValueIsNotKnown() {
		return (0xffff & mHighTemperature) == (0xffff & HIGH_TEMPERATURE_VALUE_IS_NOT_KNOWN);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@NonNull
	public byte[] getBytes() {
		byte[] data = new byte[2];
		ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
		byteBuffer.putShort((short) mHighTemperature);
		return data;
	}

}
