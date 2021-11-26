package org.im97mori.ble.characteristic.u2b4a;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Handedness (Characteristics UUID: 0x2B4A)
 */
public class Handedness implements ByteArrayInterface {

	/**
	 * Left handed
	 */
	public static final int HANDEDNESS_LEFT_HANDED = 0x00;

	/**
	 * Right handed
	 */
	public static final int HANDEDNESS_RIGHT_HANDED = 0x01;

	/**
	 * Ambidextrous
	 */
	public static final int HANDEDNESS_AMBIDEXTROUS = 0x02;

	/**
	 * Unspecified
	 */
	public static final int HANDEDNESS_UNSPECIFIED = 0x03;

	/**
	 * Handedness
	 */
	private final int mHandedness;

	/**
	 * Constructor from byte array
	 *
	 * @param values byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 */
	public Handedness(@NonNull byte[] values) {
		mHandedness = BLEUtils.createUInt8(values, 0);
	}

	/**
	 * Constructor from parameters
	 * 
	 * @param handedness Handedness
	 */
	public Handedness(int handedness) {
		mHandedness = handedness;
	}

	/**
	 * @return Handedness
	 */
	public int getHandedness() {
		return mHandedness;
	}

	/**
	 * @return {@code true}:Left handed, {@code false}:not Left handed
	 */
	public boolean isHandednessLeftHanded() {
		return mHandedness == HANDEDNESS_LEFT_HANDED;
	}

	/**
	 * @return {@code true}:Right handed, {@code false}:not Right handed
	 */
	public boolean isHandednessRightHanded() {
		return mHandedness == HANDEDNESS_RIGHT_HANDED;
	}

	/**
	 * @return {@code true}:Ambidextrous, {@code false}:not Ambidextrous
	 */
	public boolean isHandednessAmbidextrous() {
		return mHandedness == HANDEDNESS_AMBIDEXTROUS;
	}

	/**
	 * @return {@code true}:Unspecified, {@code false}:not Unspecified
	 */
	public boolean isHandednessUnspecified() {
		return mHandedness == HANDEDNESS_UNSPECIFIED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@NonNull
	public byte[] getBytes() {
		byte[] data = new byte[1];
		ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
		byteBuffer.put((byte) mHandedness);
		return data;
	}

}
