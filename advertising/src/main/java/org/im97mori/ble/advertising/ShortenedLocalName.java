package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.SHORTENED_LOCAL_NAME_DATA_TYPE;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import androidx.annotation.NonNull;

/**
 * <p>
 * Shortened Local Name
 * <p>
 * https://www.bluetooth.com/specifications/assigned-numbers/generic-access-profile/
 * </p>
 */
public class ShortenedLocalName extends AbstractAdvertisingData {

    /**
     * Shortened Local Name
     */
    private final String mShortenedLocalName;

	/**
     * @param data   byte array from <a href="https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
     * @param offset data offset
	 * @see #ShortenedLocalName(byte[], int, int)
	 */
	public ShortenedLocalName(@NonNull byte[] data, int offset) {
		this(data, offset, data[offset]);
	}

    /**
     * Constructor for Shortened Local Name
     *
     * @param data   byte array from <a href="https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
     * @param offset data offset
     * @param length 1st octet of Advertising Data
     */
    public ShortenedLocalName(@NonNull byte[] data, int offset, int length) {
        super(length);
        mShortenedLocalName = new String(data, offset + 2, length - 1);
    }

	/**
	 * Constructor from parameters
	 * 
	 * @param shortenedLocalName Shortened Local Name
	 */
	public ShortenedLocalName(@NonNull String shortenedLocalName) {
		super(shortenedLocalName.getBytes().length + 1);

		mShortenedLocalName = shortenedLocalName;
	}

    /**
     * {@inheritDoc}
     */
    @Override
    public int getDataType() {
        return SHORTENED_LOCAL_NAME_DATA_TYPE;
    }

    /**
     * @return Shortened Local Name
     */
    @NonNull
    public String getShortenedLocalName() {
        return mShortenedLocalName;
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
        byteBuffer.put(mShortenedLocalName.getBytes());
        return data;
    }

}
