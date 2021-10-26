package org.im97mori.ble.characteristic.u2a01;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;
import org.im97mori.ble.constants.AppearanceValues;

import androidx.annotation.NonNull;

/**
 * Appearance (Characteristics UUID: 0x2A01)
 */
public class Appearance implements ByteArrayInterface {

	/**
	 * Appearance Value
	 */
	private final int mAppearanceValue;

	/**
	 * Constructor from byte array
	 *
	 * @param values byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 */
	public Appearance(@NonNull byte[] values) {
		mAppearanceValue = BLEUtils.createUInt16(values, 0);
	}

	/**
	 * Constructor from parameters
	 * 
	 * @param appearanceValue Appearance Value
	 */
	public Appearance(int appearanceValue) {
		mAppearanceValue = appearanceValue;
	}

	/**
	 * @return Appearance Value
	 */
	public int getAppearanceValue() {
		return mAppearanceValue;
	}

	/**
	 * @return Appearance Category(bits 15 to 6)
	 */
	public int getAppearanceCategory() {
		return (mAppearanceValue >> 6) & 0b00000011_11111111;
	}

	/**
	 * @return Appearance Category
	 */
	public int getAppearanceCategoryWithOffset() {
		return mAppearanceValue & 0b11111111_11000000;
	}

	/**
	 * @return Appearance Category Name
	 * @see AppearanceValues#APPEARANCE_CATEGORY_MAPPING
	 */
	public String getAppearanceCategoryName() {
		return AppearanceValues.APPEARANCE_CATEGORY_MAPPING.get(getAppearanceCategoryWithOffset());
	}

	/**
	 * @return Appearance Sub Category(bits 5 to 0)
	 */
	public int getAppearanceSubCategory() {
		return mAppearanceValue & 0b00111111;
	}

	/**
	 * @return Appearance Sub Category Name
	 * @see AppearanceValues#APPEARANCE_SUB_CATEGORY_MAPPING
	 */
	public String getAppearanceSubCategoryName() {
		return AppearanceValues.APPEARANCE_SUB_CATEGORY_MAPPING.get(mAppearanceValue);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@NonNull
	public byte[] getBytes() {
		byte[] data = new byte[2];
		ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
		byteBuffer.putShort((short) mAppearanceValue);
		return data;
	}

}
