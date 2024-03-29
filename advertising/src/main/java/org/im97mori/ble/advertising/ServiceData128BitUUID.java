package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.SERVICE_DATA_128_BIT_UUID_DATA_TYPE;

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
     * @param data
     *            byte array from <a href=
     *            "https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
     * @param offset
     *            data offset
     * @see #ServiceData128BitUUID(byte[], int, int)
     */
    public ServiceData128BitUUID(@NonNull byte[] data, int offset) {
        this(data, offset, data[offset]);
    }

    /**
     * Constructor for Service Data - 128-bit UUID
     *
     * @param data
     *            byte array from <a href=
     *            "https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
     * @param offset
     *            data offset
     * @param length
     *            1st octet of Advertising Data
     */
    public ServiceData128BitUUID(@NonNull byte[] data, int offset, int length) {
        super(length);

        ByteBuffer bb = ByteBuffer.wrap(data, offset + 2, 16).order(ByteOrder.LITTLE_ENDIAN);

        long msb = 0;
        long lsb = 0;

        msb |= ((long) bb.getInt()) << 32;
        msb |= ((long) bb.getShort()) << 16;
        msb |= (long) bb.getShort();

        lsb |= ((long) bb.get()) << 56;
        lsb |= ((long) bb.get()) << 48;
        lsb |= ((long) bb.getShort());
        lsb |= ((long) bb.getInt()) << 16;

        mUuid = new UUID(msb, lsb);

        // Additional service data
        mAdditionalServiceData = new byte[length - 17];
        if (mAdditionalServiceData.length > 0) {
            System.arraycopy(data, offset + 18, mAdditionalServiceData, 0, length - 17);
        }
    }

    /**
     * Constructor from parameters
     * 
     * @param uuid
     *            UUID
     * @param additionalServiceData
     *            byte array of Additional service data
     */
    public ServiceData128BitUUID(@NonNull UUID uuid, @NonNull byte[] additionalServiceData) {
        super(additionalServiceData.length + 17);

        mUuid = uuid;
        mAdditionalServiceData = additionalServiceData;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getDataType() {
        return SERVICE_DATA_128_BIT_UUID_DATA_TYPE;
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

        long msb = mUuid.getMostSignificantBits();
        byteBuffer.putInt((int) (msb >> 32));
        byteBuffer.putShort((short) (msb >> 16));
        byteBuffer.putShort((short) msb);

        long lsb = mUuid.getLeastSignificantBits();
        byteBuffer.put((byte) (lsb >> 56));
        byteBuffer.put((byte) (lsb >> 48));
        byteBuffer.putInt((int) lsb);
        byteBuffer.putShort((short) (lsb >> 32));

        byteBuffer.put(mAdditionalServiceData);
        return data;
    }

}
