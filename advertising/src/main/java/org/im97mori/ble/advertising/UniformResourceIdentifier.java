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
	 * @param data
	 *            byte array from <a href=
	 *            "https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
	 * @param offset
	 *            data offset
	 * @see #UniformResourceIdentifier(byte[], int, int)
	 */
	public UniformResourceIdentifier(@NonNull byte[] data, int offset) {
		this(data, offset, data[offset]);
	}

	/**
	 * Constructor for URI
	 *
	 * @param data
	 *            byte array from <a href=
	 *            "https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
	 * @param offset
	 *            data offset
	 * @param length
	 *            1st octet of Advertising Data
	 */
	public UniformResourceIdentifier(@NonNull byte[] data, int offset, int length) {
		super(length);

		String allString = new String(data, offset + 2, length - 1);

		mScheme = allString.charAt(0);
		if (Scheme.EMPTY_SCHEME_NAME_SCHEME.equals(mScheme)) {
			mUriString = allString.substring(allString.indexOf(":") + 1);
			mUri = URI.create(allString.substring(1));
		} else if (Scheme.SCHEME_MAPPING.containsKey(mScheme)) {
			mUriString = allString.substring(1);
			mUri = URI.create(Scheme.SCHEME_MAPPING.get(mScheme) + allString.substring(1));
		} else {
			mUriString = null;
			mUri = null;
		}
	}

	/**
	 * Constructor from parameters
	 * 
	 * @param scheme
	 *            Scheme
	 * @param uriString
	 *            URI text
	 */
	public UniformResourceIdentifier(char scheme, @NonNull String uriString) {
		super(Character.toString(scheme).getBytes().length + uriString.getBytes().length + 1);

		mScheme = scheme;
		if (Scheme.EMPTY_SCHEME_NAME_SCHEME.equals(mScheme)) {
			mUriString = uriString.substring(uriString.indexOf(":") + 1);
			mUri = URI.create(uriString);
		} else if (Scheme.SCHEME_MAPPING.containsKey(mScheme)) {
			mUriString = uriString;
			mUri = URI.create(Scheme.SCHEME_MAPPING.get(mScheme) + uriString);
		} else {
			mUriString = null;
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
		String uriString = mUri.toString();
		if (Scheme.EMPTY_SCHEME_NAME_SCHEME.equals(mScheme)) {
			byteBuffer.put(uriString.getBytes());
		} else {
			byteBuffer.put(uriString.substring(uriString.indexOf(":") + 1).getBytes());
		}
		return data;
	}

}
