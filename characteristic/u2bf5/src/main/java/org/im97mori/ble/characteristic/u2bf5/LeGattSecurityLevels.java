package org.im97mori.ble.characteristic.u2bf5;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * LE GATT Security Levels (Characteristics UUID: 0x2BF5)
 */
public class LeGattSecurityLevels implements ByteArrayInterface {

	/**
	 * LE security mode 1
	 */
	public static final int LE_SECURITY_MODE_1 = 0x01;

	/**
	 * LE security mode 2
	 */
	public static final int LE_SECURITY_MODE_2 = 0x02;

	/**
	 * LE security mode 3
	 */
	public static final int LE_SECURITY_MODE_3 = 0x03;

	/**
	 * LE security mode 1
	 * No security (No authentication and no encryption)
	 */
	public static final int LE_SECURITY_MODE_1_LEVEL_1 = 0x01;

	/**
	 * LE security mode 1
	 * Unauthenticated pairing with encryption
	 */
	public static final int LE_SECURITY_MODE_1_LEVEL_2 = 0x02;

	/**
	 * LE security mode 1
	 * Authenticated pairing with encryption
	 */
	public static final int LE_SECURITY_MODE_1_LEVEL_3 = 0x03;

	/**
	 * LE security mode 1
	 * Authenticated LE Secure Connections pairing with encryption using a 128-bit
	 * strength encryption key
	 */
	public static final int LE_SECURITY_MODE_1_LEVEL_4 = 0x04;

	/**
	 * LE security mode 2
	 * Unauthenticated pairing with data signing
	 */
	public static final int LE_SECURITY_MODE_2_LEVEL_1 = 0x01;

	/**
	 * LE security mode 2
	 * Authenticated pairing with data signing
	 */
	public static final int LE_SECURITY_MODE_2_LEVEL_2 = 0x02;

	/**
	 * LE security mode 3
	 * No security (no authentication and no encryption)
	 */
	public static final int LE_SECURITY_MODE_3_LEVEL_1 = 0x01;

	/**
	 * LE security mode 3
	 * Use of unauthenticated Broadcast_Code
	 */
	public static final int LE_SECURITY_MODE_3_LEVEL_2 = 0x02;

	/**
	 * LE security mode 3
	 * Use of authenticated Broadcast_Code
	 */
	public static final int LE_SECURITY_MODE_3_LEVEL_3 = 0x03;

	/**
	 * Security Level Requirements
	 */
	private final byte[] mSecurityLevelRequirements;

	/**
	 * Constructor from byte array
	 *
	 * @param values
	 *            byte array from <a href=
	 *            "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 */
	public LeGattSecurityLevels(@NonNull byte[] values) {
		mSecurityLevelRequirements = values;
	}

	/**
	 * Constructor from parameters
	 * 
	 * @param isMode1Level1Supported
	 *            {@code true}:LE security mode 1, Level 1 is supported,
	 *            {@code false}:LE security mode 1, Level 1 is not supported
	 * @param isMode1Level2Supported
	 *            {@code true}:LE security mode 1, Level 2 is supported,
	 *            {@code false}:LE security mode 1, Level 2 is not supported
	 * @param isMode1Level3Supported
	 *            {@code true}:LE security mode 1, Level 3 is supported,
	 *            {@code false}:LE security mode 1, Level 3 is not supported
	 * @param isMode1Level4Supported
	 *            {@code true}:LE security mode 1, Level 4 is supported,
	 *            {@code false}:LE security mode 1, Level 5 is not supported
	 * @param isMode2Level1Supported
	 *            {@code true}:LE security mode 2, Level 1 is supported,
	 *            {@code false}:LE security mode 2, Level 1 is not supported
	 * @param isMode2Level2Supported
	 *            {@code true}:LE security mode 2, Level 2 is supported,
	 *            {@code false}:LE security mode 2, Level 2 is not supported
	 * @param isMode3Level1Supported
	 *            {@code true}:LE security mode 3, Level 1 is supported,
	 *            {@code false}:LE security mode 3, Level 1 is not supported
	 * @param isMode3Level2Supported
	 *            {@code true}:LE security mode 3, Level 2 is supported,
	 *            {@code false}:LE security mode 3, Level 2 is not supported
	 * @param isMode3Level3Supported
	 *            {@code true}:LE security mode 3, Level 3 is supported,
	 *            {@code false}:LE security mode 3, Level 3 is not supported
	 */
	public LeGattSecurityLevels(boolean isMode1Level1Supported, boolean isMode1Level2Supported,
			boolean isMode1Level3Supported, boolean isMode1Level4Supported,
			boolean isMode2Level1Supported, boolean isMode2Level2Supported,
			boolean isMode3Level1Supported, boolean isMode3Level2Supported,
			boolean isMode3Level3Supported) {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		if (isMode1Level1Supported) {
			baos.write(LE_SECURITY_MODE_1);
			baos.write(LE_SECURITY_MODE_1_LEVEL_1);
		}
		if (isMode1Level2Supported) {
			baos.write(LE_SECURITY_MODE_1);
			baos.write(LE_SECURITY_MODE_1_LEVEL_2);
		}
		if (isMode1Level3Supported) {
			baos.write(LE_SECURITY_MODE_1);
			baos.write(LE_SECURITY_MODE_1_LEVEL_3);
		}
		if (isMode1Level4Supported) {
			baos.write(LE_SECURITY_MODE_1);
			baos.write(LE_SECURITY_MODE_1_LEVEL_4);
		}
		if (isMode2Level1Supported) {
			baos.write(LE_SECURITY_MODE_2);
			baos.write(LE_SECURITY_MODE_2_LEVEL_1);
		}
		if (isMode2Level2Supported) {
			baos.write(LE_SECURITY_MODE_2);
			baos.write(LE_SECURITY_MODE_2_LEVEL_2);
		}
		if (isMode3Level1Supported) {
			baos.write(LE_SECURITY_MODE_3);
			baos.write(LE_SECURITY_MODE_3_LEVEL_1);
		}
		if (isMode3Level2Supported) {
			baos.write(LE_SECURITY_MODE_3);
			baos.write(LE_SECURITY_MODE_3_LEVEL_2);
		}
		if (isMode3Level3Supported) {
			baos.write(LE_SECURITY_MODE_3);
			baos.write(LE_SECURITY_MODE_3_LEVEL_3);
		}
		mSecurityLevelRequirements = baos.toByteArray();
	}

	/**
	 * @return Security Level Requirements
	 */
	@NonNull
	public byte[] getSecurityLevelRequirements() {
		return mSecurityLevelRequirements;
	}

	/**
	 * @return {@code true}:LE security mode 1, Level 1 is supported,
	 *         {@code false}:LE security mode 1, Level 1 is not supported
	 */
	public boolean isMode1Level1Supported() {
		return isSupported(LE_SECURITY_MODE_1, LE_SECURITY_MODE_1_LEVEL_1);
	}

	/**
	 * @return {@code true}:LE security mode 1, Level 2 is supported,
	 *         {@code false}:LE security mode 1, Level 2 is not supported
	 */
	public boolean isMode1Level2Supported() {
		return isSupported(LE_SECURITY_MODE_1, LE_SECURITY_MODE_1_LEVEL_2);
	}

	/**
	 * @return {@code true}:LE security mode 1, Level 3 is supported,
	 *         {@code false}:LE security mode 1, Level 3 is not supported
	 */
	public boolean isMode1Level3Supported() {
		return isSupported(LE_SECURITY_MODE_1, LE_SECURITY_MODE_1_LEVEL_3);
	}

	/**
	 * @return {@code true}:LE security mode 1, Level 4 is supported,
	 *         {@code false}:LE security mode 1, Level 4 is not supported
	 */
	public boolean isMode1Level4Supported() {
		return isSupported(LE_SECURITY_MODE_1, LE_SECURITY_MODE_1_LEVEL_4);
	}

	/**
	 * @return {@code true}:LE security mode 2, Level 1 is supported,
	 *         {@code false}:LE security mode 2, Level 1 is not supported
	 */
	public boolean isMode2Level1Supported() {
		return isSupported(LE_SECURITY_MODE_2, LE_SECURITY_MODE_2_LEVEL_1);
	}

	/**
	 * @return {@code true}:LE security mode 2, Level 2 is supported,
	 *         {@code false}:LE security mode 2, Level 2 is not supported
	 */
	public boolean isMode2Level2Supported() {
		return isSupported(LE_SECURITY_MODE_2, LE_SECURITY_MODE_2_LEVEL_2);
	}

	/**
	 * @return {@code true}:LE security mode 3, Level 1 is supported,
	 *         {@code false}:LE security mode 3, Level 1 is not supported
	 */
	public boolean isMode3Level1Supported() {
		return isSupported(LE_SECURITY_MODE_3, LE_SECURITY_MODE_3_LEVEL_1);
	}

	/**
	 * @return {@code true}:LE security mode 3, Level 2 is supported,
	 *         {@code false}:LE security mode 3, Level 2 is not supported
	 */
	public boolean isMode3Level2Supported() {
		return isSupported(LE_SECURITY_MODE_3, LE_SECURITY_MODE_3_LEVEL_2);
	}

	/**
	 * @return {@code true}:LE security mode 3, Level 3 is supported,
	 *         {@code false}:LE security mode 3, Level 3 is not supported
	 */
	public boolean isMode3Level3Supported() {
		return isSupported(LE_SECURITY_MODE_3, LE_SECURITY_MODE_3_LEVEL_3);
	}

	/**
	 * 
	 * @param mode
	 *            LE security mode
	 * @param level
	 *            LE security Level
	 * @return {@code true}:supporeted, {@code false}:not supported
	 * @see #LE_SECURITY_MODE_1
	 * @see #LE_SECURITY_MODE_2
	 * @see #LE_SECURITY_MODE_3
	 * @see #LE_SECURITY_MODE_1_LEVEL_1
	 * @see #LE_SECURITY_MODE_1_LEVEL_2
	 * @see #LE_SECURITY_MODE_1_LEVEL_3
	 * @see #LE_SECURITY_MODE_1_LEVEL_4
	 * @see #LE_SECURITY_MODE_2_LEVEL_1
	 * @see #LE_SECURITY_MODE_2_LEVEL_2
	 * @see #LE_SECURITY_MODE_1_LEVEL_1
	 * @see #LE_SECURITY_MODE_2_LEVEL_2
	 * @see #LE_SECURITY_MODE_3_LEVEL_3
	 */
	private boolean isSupported(int mode, int level) {
		boolean result = false;
		for (int i = 0; i < mSecurityLevelRequirements.length / 2; i += 2) {
			if (mode == BLEUtils.createUInt8(mSecurityLevelRequirements, i)) {
				if (level == BLEUtils.createUInt8(mSecurityLevelRequirements, i + 1)) {
					result = true;
					break;
				}
			}
		}
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@NonNull
	public byte[] getBytes() {
		byte[] data = new byte[mSecurityLevelRequirements.length];
		ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
		byteBuffer.put(mSecurityLevelRequirements);
		return data;
	}

}
