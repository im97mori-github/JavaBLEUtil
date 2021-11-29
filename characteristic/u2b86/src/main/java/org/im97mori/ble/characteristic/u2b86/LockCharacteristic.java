package org.im97mori.ble.characteristic.u2b86;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Lock Characteristic (Characteristics UUID: 0x2B86)
 */
public class LockCharacteristic implements ByteArrayInterface {

	/**
	 * Unlocked
	 */
	public static final int UNLOCKED = 0x01;

	/**
	 * Locked
	 */
	public static final int LOCKED = 0x02;

	/**
	 * Set Member Lock
	 */
	private final int mSetMemberLock;

	/**
	 * Constructor from byte array
	 *
	 * @param values byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 */
	public LockCharacteristic(@NonNull byte[] values) {
		mSetMemberLock = BLEUtils.createUInt8(values, 0);
	}

	/**
	 * Constructor from parameters
	 * 
	 * @param setMemberLock Set Member Lock
	 */
	public LockCharacteristic(int setMemberLock) {
		mSetMemberLock = setMemberLock;
	}

	/**
	 * @return Set Member Lock
	 */
	public int getSetMemberLock() {
		return mSetMemberLock;
	}

	/**
	 * @return {@code true}:Unlocked, {@code false}:not Unlocked
	 */
	public boolean isSetMemberLockUnlocked() {
		return mSetMemberLock == UNLOCKED;
	}

	/**
	 * @return {@code true}:Locked, {@code false}:not Locked
	 */
	public boolean isSetMemberLockLocked() {
		return mSetMemberLock == LOCKED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@NonNull
	public byte[] getBytes() {
		byte[] data = new byte[1];
		ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
		byteBuffer.put((byte) mSetMemberLock);
		return data;
	}

}
