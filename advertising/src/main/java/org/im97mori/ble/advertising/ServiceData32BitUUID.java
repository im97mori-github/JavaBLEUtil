package org.im97mori.ble.advertising;

import static org.im97mori.ble.BLEUtils.BASE_UUID;
import static org.im97mori.ble.constants.DataType.SERVICE_DATA_32_BIT_UUID_DATA_TYPE;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;

import androidx.annotation.NonNull;

/**
 * <p>
 * Service Data - 32-bit UUID
 * <p>
 * https://www.bluetooth.com/specifications/assigned-numbers/generic-access-profile/
 * </p>
 */
public class ServiceData32BitUUID extends AbstractAdvertisingData {

    /**
     * UUID
     */
    private final UUID mUuid;

    /**
     * byte array of Additional service data
     */
    private final byte[] mAdditionalServiceData;

	/**
     * @param data   byte array from <a href="https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
     * @param offset data offset
	 * @see #ServiceData32BitUUID(byte[], int, int)
	 */
	public ServiceData32BitUUID(@NonNull byte[] data, int offset) {
		this(data, offset, data[offset]);
	}

    /**
     * Constructor for Service Data - 32-bit UUID
     *
     * @param data   byte array from <a href="https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
     * @param offset data offset
     * @param length 1st octet of Advertising Data
     */
    public ServiceData32BitUUID(@NonNull byte[] data, int offset, int length) {
        super(length);

        long target = data[offset + 2] & 0xff;
        target |= (data[offset + 3] & 0xff) << 8;
        target |= (data[offset + 4] & 0xff) << 16;
        target |= (data[offset + 5] & 0xff) << 24;
        target = target << 32;
        mUuid = new UUID(BASE_UUID.getMostSignificantBits() | target, BASE_UUID.getLeastSignificantBits());

        // Additional service data
        mAdditionalServiceData = new byte[length - 5];
        if (mAdditionalServiceData.length > 0) {
            System.arraycopy(data, offset + 6, mAdditionalServiceData, 0, length - 5);
        }
    }

	/**
	 * Constructor from parameters
	 * 
	 * @param uuid                  UUID
	 * @param additionalServiceData byte array of Additional service data
	 */
	public ServiceData32BitUUID(@NonNull UUID uuid, @NonNull byte[] additionalServiceData) {
		super(additionalServiceData.length + 5);

		mUuid = uuid;
		mAdditionalServiceData = additionalServiceData;
	}

    /**
     * {@inheritDoc}
     */
    @Override
    public int getDataType() {
        return SERVICE_DATA_32_BIT_UUID_DATA_TYPE;
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
        byteBuffer.putInt((int) (mUuid.getMostSignificantBits() >> 32));
        byteBuffer.put(mAdditionalServiceData);
        return data;
    }

}
