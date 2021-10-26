package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.MANUFACTURER_SPECIFIC_DATA_DATA_TYPE;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.constants.CompanyUUID;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * <p>
 * Manufacturer Specific Data
 * <p>
 * https://www.bluetooth.com/specifications/assigned-numbers/generic-access-profile/
 * </p>
 */
public class ManufacturerSpecificData extends AbstractAdvertisingData {

	/**
	 * <p>
	 * Company Identifier Code
	 * <p>
	 * https://www.bluetooth.com/specifications/assigned-numbers/company-identifiers/
	 * </p>
	 */
	private final int mCompanyIdentifier;

	/**
	 * byte array of Manufacturer Specific Data
	 */
	private final byte[] mManufacturerSpecificData;

	/**
	 * Constructor for Manufacturer Specific Data
	 *
	 * @param data   byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
	 * @param offset data offset
	 * @param length 1st octet of Advertising Data
	 */
	public ManufacturerSpecificData(@NonNull byte[] data, int offset, int length) {
		super(length);

		// Company Identifier Code
		mCompanyIdentifier = BLEUtils.createUInt16(data, offset + 2);

		// Manufacturer Specific Data
		mManufacturerSpecificData = new byte[length - 3];
		if (mManufacturerSpecificData.length > 0) {
			System.arraycopy(data, offset + 4, mManufacturerSpecificData, 0, mManufacturerSpecificData.length);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getDataType() {
		return MANUFACTURER_SPECIFIC_DATA_DATA_TYPE;
	}

	/**
	 * @return Company Identifier Code
	 */
	public int getCompanyIdentifier() {
		return mCompanyIdentifier;
	}

	/**
	 * @return Company Name
	 */
	@Nullable
	public String getCompanyName() {
		return CompanyUUID.COMPANY_MAPPING_128.get(BLEUtils.convert16to128(mCompanyIdentifier));
	}

	/**
	 * @return byte array of Manufacturer Specific Data
	 */
	@NonNull
	public byte[] getManufacturerSpecificData() {
		return mManufacturerSpecificData;
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
		byteBuffer.put((byte) mCompanyIdentifier);
		byteBuffer.put((byte) (mCompanyIdentifier >> 8));
		byteBuffer.put(mManufacturerSpecificData);
		return data;
	}

}
