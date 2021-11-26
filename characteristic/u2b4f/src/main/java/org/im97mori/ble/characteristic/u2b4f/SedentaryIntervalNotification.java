package org.im97mori.ble.characteristic.u2b4f;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Sedentary Interval Notification (Characteristics UUID: 0x2B4F)
 */
public class SedentaryIntervalNotification implements ByteArrayInterface {

	/**
	 * user does not desire to be notified about sedentary intervals
	 */
	public static final int NO_SEDENTARY_INTERVAL_NOTIFICATION = 0x0000;

	/**
	 * Sedentary Interval Notification
	 */
	private final int mSedentaryIntervalNotification;

	/**
	 * Constructor from byte array
	 *
	 * @param values byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 */
	public SedentaryIntervalNotification(@NonNull byte[] values) {
		mSedentaryIntervalNotification = BLEUtils.createUInt16(values, 0);
	}

	/**
	 * Constructor from parameters
	 * 
	 * @param sedentaryIntervalNotification Sedentary Interval Notification
	 */
	public SedentaryIntervalNotification(int sedentaryIntervalNotification) {
		mSedentaryIntervalNotification = sedentaryIntervalNotification;
	}

	/**
	 * @return Sedentary Interval Notification
	 */
	public int getSedentaryIntervalNotification() {
		return mSedentaryIntervalNotification;
	}

	/**
	 * @return {@code true}:Sedentary Interval Notification disabled,
	 *         {@code false}:Sedentary Interval Notification enabled
	 */
	public boolean isSedentaryIntervalNotification() {
		return mSedentaryIntervalNotification == NO_SEDENTARY_INTERVAL_NOTIFICATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@NonNull
	public byte[] getBytes() {
		byte[] data = new byte[2];
		ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
		byteBuffer.putShort((short) mSedentaryIntervalNotification);
		return data;
	}

}
