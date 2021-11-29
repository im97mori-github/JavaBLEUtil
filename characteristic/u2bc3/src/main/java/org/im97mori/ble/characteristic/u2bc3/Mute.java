package org.im97mori.ble.characteristic.u2bc3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Mute (Characteristics UUID: 0x2BC3)
 */
public class Mute implements ByteArrayInterface {

	/**
	 * Not Muted
	 */
	public static final int NOT_MUTED = 0x00;

	/**
	 * Muted
	 */
	public static final int MUTED = 0x01;

	/**
	 * Disabled
	 */
	public static final int DISABLED = 0x02;

	/**
	 * Mute
	 */
	private final int mMute;

	/**
	 * Constructor from byte array
	 *
	 * @param values byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 */
	public Mute(@NonNull byte[] values) {
		mMute = BLEUtils.createUInt8(values, 0);
	}

	/**
	 * Constructor from parameters
	 * 
	 * @param mute Appearance Value
	 */
	public Mute(int mute) {
		mMute = mute;
	}

	/**
	 * @return Mute
	 */
	public int getMute() {
		return mMute;
	}

	/**
	 * @return {@code true}:Not Muted, {@code false}:not Not Muted
	 */
	public boolean isNotMuted() {
		return mMute == NOT_MUTED;
	}

	/**
	 * @return {@code true}:Muted, {@code false}:not Muted
	 */
	public boolean isMuted() {
		return mMute == MUTED;
	}

	/**
	 * @return {@code true}:Not Disabled, {@code false}:not Disabled
	 */
	public boolean isDisabled() {
		return mMute == DISABLED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@NonNull
	public byte[] getBytes() {
		byte[] data = new byte[1];
		ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
		byteBuffer.put((byte) mMute);
		return data;
	}

}
