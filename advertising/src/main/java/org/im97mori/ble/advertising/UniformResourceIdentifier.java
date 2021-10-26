package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.URI_DATA_TYPE;

import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.constants.Scheme;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * <p>
 * URI
 * <p>
 * https://www.bluetooth.com/specifications/assigned-numbers/generic-access-profile/
 * </p>
 */
public class UniformResourceIdentifier extends AbstractAdvertisingData {

	/**
	 * Scheme
	 */
	private final char mScheme;

	/**
	 * URI text
	 */
	private final String mUriString;

	/**
	 * URI
	 */
	private final URI mUri;

	/**
	 * Constructor for URI
	 *
	 * @param data   byte array from <a href="https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
	 * @param offset data offset
	 * @param length 1st octet of Advertising Data
	 */
	public UniformResourceIdentifier(@NonNull byte[] data, int offset, int length) {
		super(length);

		String allString = new String(data, offset + 2, length - 1);

		mScheme = allString.charAt(0);
		mUriString = allString.substring(1);
		if (Scheme.SCHEME_MAPPING.containsKey(mScheme)) {
			mUri = URI.create(Scheme.SCHEME_MAPPING.get(mScheme) + mUriString);
		} else {
			mUri = null;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getDataType() {
		return URI_DATA_TYPE;
	}

	/**
	 * @return Scheme
	 */
	@NonNull
	public char getScheme() {
		return mScheme;
	}

	/**
	 * @return URI text
	 */
	@NonNull
	public String getUriString() {
		return mUriString;
	}

	/**
	 * @return {@link URI}, or {@code null} when unknown scheme
	 */
	@Nullable
	public URI getUri() {
		return mUri;
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
		byteBuffer.put(Character.toString(mScheme).getBytes());
		byteBuffer.put(mUriString.getBytes());
		return data;
	}

}
