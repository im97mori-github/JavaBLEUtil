package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.APPEARANCE_DATA_TYPE;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.constants.AppearanceValues;

import androidx.annotation.NonNull;

/**
 * <p>
 * Appearance
 * <p>
 * https://www.bluetooth.com/specifications/assigned-numbers/generic-access-profile/
 * </p>
 */
public class Appearance extends AbstractAdvertisingData {

	/**
	 * Appearance
	 */
	private final int mAppearance;

	/**
     * @param data   byte array from <a href="https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
     * @param offset data offset
	 * @see #Appearance(byte[], int, int)
	 */
	public Appearance(@NonNull byte[] data, int offset) {
		this(data, offset, data[offset]);
	}

	/**
	 * Constructor for Appearance
	 *
	 * @param data   byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
	 * @param offset data offset
	 * @param length 1st octet of Advertising Data
	 */
	public Appearance(@NonNull byte[] data, int offset, int length) {
		super(length);

		mAppearance = BLEUtils.createUInt16(data, offset + 2);
	}

	/**
	 * Constructor from parameters
	 * 
	 * @param appearance Appearance
	 */
	public Appearance(int appearance) {
		super(3);

		mAppearance = appearance;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getDataType() {
		return APPEARANCE_DATA_TYPE;
	}

	/**
	 * @return Appearance
	 */
	public int getAppearance() {
		return mAppearance;
	}

	/**
	 * @return Appearance Category(bits 15 to 6)
	 */
	public int getAppearanceCategory() {
		return (mAppearance >> 6) & 0b00000011_11111111;
	}

	/**
	 * @return Appearance Category
	 */
	public int getAppearanceCategoryWithOffset() {
		return mAppearance & 0b11111111_11000000;
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
		return mAppearance & 0b00111111;
	}

	/**
	 * @return Appearance Sub Category Name
	 * @see AppearanceValues#APPEARANCE_SUB_CATEGORY_MAPPING
	 */
	public String getAppearanceSubCategoryName() {
		return AppearanceValues.APPEARANCE_SUB_CATEGORY_MAPPING.get(mAppearance);
	}

	/**
	 * {@inheritDoc}
	 */
	@NonNull
	@Override
	public byte[] getBytes() {
		byte[] data = new byte[1 + getLength()];
		ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
		byteBuffer.put((byte) getLength());
		byteBuffer.put((byte) getDataType());
		byteBuffer.putShort((short) mAppearance);
		return data;
	}

}
