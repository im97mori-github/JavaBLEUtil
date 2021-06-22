package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.DATA_TYPE_SHORTENED_LOCAL_NAME;

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
     * Constructor for Shortened Local Name
     *
     * @param data   byte array from {@link ScanRecord#getBytes()}
     * @param offset data offset
     * @param length 1st octed of Advertising Data
     */
    public ShortenedLocalName(@NonNull byte[] data, int offset, int length) {
        super(length);
        mShortenedLocalName = new String(data, offset + 2, length - 1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getDataType() {
        return DATA_TYPE_SHORTENED_LOCAL_NAME;
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
