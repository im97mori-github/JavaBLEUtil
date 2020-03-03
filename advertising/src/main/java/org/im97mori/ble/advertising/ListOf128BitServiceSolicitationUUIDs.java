package org.im97mori.ble.advertising;

import static org.im97mori.ble.advertising.AdvertisingDataConstants.AdvertisingDataTypes.DATA_TYPE_LIST_OF_128_BIT_SERVICE_SOLICITATION_UUIDS;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

import androidx.annotation.NonNull;

/**
 * <p>
 * List of 128-bit Service Solicitation UUIDs
 * <p>
 * https://www.bluetooth.com/specifications/assigned-numbers/generic-access-profile/
 * </p>
 */
public class ListOf128BitServiceSolicitationUUIDs extends AbstractAdvertisingData {

    /**
     * UUID list
     */
    private final List<UUID> mUuidList;

    /**
     * Constructor for List of 128-bit Service Solicitation UUIDs
     *
     * @param data   byte array from {@link ScanRecord#getBytes()}
     * @param offset data offset
     * @param length 1st octed of Advertising Data
     */
    public ListOf128BitServiceSolicitationUUIDs(@NonNull byte[] data, int offset, int length) {
        super(length);

        ByteBuffer bb;
        List<UUID> uuidList = new ArrayList<>();
        for (int i = offset + 2; i < offset + length + 1; i += 16) {
            bb = ByteBuffer.wrap(data, i, 16).order(ByteOrder.LITTLE_ENDIAN);
            long lsb = bb.getLong();
            long msb = bb.getLong();
            uuidList.add(new UUID(msb, lsb));
        }
        mUuidList = Collections.synchronizedList(Collections.unmodifiableList(uuidList));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getDataType() {
        return DATA_TYPE_LIST_OF_128_BIT_SERVICE_SOLICITATION_UUIDS;
    }

    /**
     * @return UUID list
     */
    @NonNull
    public List<UUID> getUuidList() {
        return mUuidList;
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
        for (UUID uuid : mUuidList) {
            byteBuffer.putLong(uuid.getLeastSignificantBits());
            byteBuffer.putLong(uuid.getMostSignificantBits());
        }
        return data;
    }

}
