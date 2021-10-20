package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.DATA_TYPE_UNIFORM_RESOURCE_IDENTIFIER;

import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.constants.SchemeUUID;

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
     * @param data   byte array from {@link ScanRecord#getBytes()}
     * @param offset data offset
     * @param length 1st octed of Advertising Data
     */
    public UniformResourceIdentifier(@NonNull byte[] data, int offset, int length) {
        super(length);

        mUriString = new String(data, offset + 2, length - 1);
        int scheme = mUriString.charAt(0) & 0xff;
        UUID schemeUUID = BLEUtils.convert16to128(scheme);
        if (SchemeUUID.SCHEME_MAPPING_128.containsKey(schemeUUID)) {
            mUri = URI.create(SchemeUUID.SCHEME_MAPPING_128.get(schemeUUID) + mUriString.substring(1));
        } else {
            mUri = null;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getDataType() {
        return DATA_TYPE_UNIFORM_RESOURCE_IDENTIFIER;
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
        byteBuffer.put(mUriString.getBytes());
        return data;
    }

}
