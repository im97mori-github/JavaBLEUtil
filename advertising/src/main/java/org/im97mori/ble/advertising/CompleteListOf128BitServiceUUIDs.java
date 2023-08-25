package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.COMPLETE_LIST_OF_128_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

import androidx.annotation.NonNull;

/**
 * <p>
 * Complete List of 128-bit Service Class UUIDs
 * <p>
 * https://www.bluetooth.com/specifications/assigned-numbers/generic-access-profile/
 * </p>
 */
public class CompleteListOf128BitServiceUUIDs extends AbstractAdvertisingData {

    /**
     * UUID list
     */
    private final List<UUID> mUuidList;

    /**
     * @param data
     *            byte array from <a href=
     *            "https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
     * @param offset
     *            data offset
     * @see #CompleteListOf128BitServiceUUIDs(byte[], int, int)
     */
    public CompleteListOf128BitServiceUUIDs(@NonNull byte[] data, int offset) {
        this(data, offset, data[offset]);
    }

    /**
     * Constructor for Complete List of 128-bit Service Class UUIDs
     *
     * @param data
     *            byte array from <a href=
     *            "https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
     * @param offset
     *            data offset
     * @param length
     *            1st octet of Advertising Data
     */
    public CompleteListOf128BitServiceUUIDs(@NonNull byte[] data, int offset, int length) {
        super(length);

        ByteBuffer bb;
        List<UUID> uuidList = new ArrayList<>();
        for (int i = offset + 2; i < offset + length + 1; i += 16) {
            bb = ByteBuffer.wrap(data, i, 16).order(ByteOrder.LITTLE_ENDIAN);

            long msb = 0;
            long lsb = 0;

            msb |= ((long) bb.getInt()) << 32;
            msb |= ((long) bb.getShort()) << 16;
            msb |= (long) bb.getShort();

            lsb |= ((long) bb.get()) << 56;
            lsb |= ((long) bb.get()) << 48;
            lsb |= ((long) bb.getShort());
            lsb |= ((long) bb.getInt()) << 16;

            uuidList.add(new UUID(msb, lsb));
        }
        mUuidList = Collections.synchronizedList(Collections.unmodifiableList(uuidList));
    }

    /**
     * Constructor for Complete List of 128-bit Service Class UUIDs
     * 
     * @param uuids
     *            UUID array
     * @see CompleteListOf128BitServiceUUIDs#CompleteListOf128BitServiceUUIDs(List)
     */
    public CompleteListOf128BitServiceUUIDs(@NonNull UUID... uuids) {
        this(Arrays.asList(uuids));
    }

    /**
     * Constructor for Complete List of 128-bit Service Class UUIDs
     * 
     * @param uuidList
     *            UUID list
     */
    public CompleteListOf128BitServiceUUIDs(@NonNull List<UUID> uuidList) {
        super(uuidList.size() * 16 + 1);
        this.mUuidList = Collections.synchronizedList(Collections.unmodifiableList(uuidList));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getDataType() {
        return COMPLETE_LIST_OF_128_BIT_SERVICE_CLASS_UUIDS_DATA_TYPE;
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
            long msb = uuid.getMostSignificantBits();
            byteBuffer.putInt((int) (msb >> 32));
            byteBuffer.putShort((short) (msb >> 16));
            byteBuffer.putShort((short) msb);

            long lsb = uuid.getLeastSignificantBits();
            byteBuffer.put((byte) (lsb >> 56));
            byteBuffer.put((byte) (lsb >> 48));
            byteBuffer.putInt((int) lsb);
            byteBuffer.putShort((short) (lsb >> 32));
        }
        return data;
    }

}
