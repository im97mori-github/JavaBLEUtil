package org.im97mori.ble.advertising;

import static org.im97mori.ble.advertising.AdvertisingDataConstants.AdvertisingDataTypes.DATA_TYPE_SERVICE_DATA_128_BIT_UUID;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;

import androidx.annotation.NonNull;

/**
 * <p>
 * Service Data - 128-bit UUID
 * <p>
 * https://www.bluetooth.com/specifications/assigned-numbers/generic-access-profile/
 * </p>
 */
public class ServiceData128BitUUID extends AbstractAdvertisingData {

    /**
     * UUID
     */
    private final UUID mUuid;

    /**
     * byte array of Additional service data
     */
    private final byte[] mAdditionalServiceData;

    /**
     * Constructor for Service Data - 128-bit UUID
     *
     * @param data   byte array from {@link ScanRecord#getBytes()}
     * @param offset data offset
     * @param length 1st octed of Advertising Data
     */
    public ServiceData128BitUUID(@NonNull byte[] data, int offset, int length) {
        super(length);

        ByteBuffer bb = ByteBuffer.wrap(data, offset + 2, 16).order(ByteOrder.LITTLE_ENDIAN);
        long lsb = bb.getLong();
        long msb = bb.getLong();
        mUuid = new UUID(msb, lsb);

        // Additional service data
        mAdditionalServiceData = new byte[length - 17];
        if (mAdditionalServiceData.length > 0) {
            System.arraycopy(data, offset + 18, mAdditionalServiceData, 0, length - 17);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getDataType() {
        return DATA_TYPE_SERVICE_DATA_128_BIT_UUID;
    }

    /**
     * @return {@link UUID}
     */
    @NonNull
    public UUID getUuid() {
        return mUuid;
    }

    /**
     * @return byte array of Manufacturer Specific Data
     */
    @NonNull
    public byte[] getAdditionalServiceData() {
        return mAdditionalServiceData;
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
        byteBuffer.putLong(mUuid.getLeastSignificantBits());
        byteBuffer.putLong(mUuid.getMostSignificantBits());
        byteBuffer.put(mAdditionalServiceData);
        return data;
    }

}
