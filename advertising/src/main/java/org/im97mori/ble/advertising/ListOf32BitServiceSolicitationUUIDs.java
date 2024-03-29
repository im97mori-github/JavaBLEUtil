package org.im97mori.ble.advertising;

import static org.im97mori.ble.BLEUtils.BASE_UUID;
import static org.im97mori.ble.constants.DataType.LIST_OF_32_BIT_SERVICE_SOLICITATION_UUIDS_DATA_TYPE;

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
 * List of 32-bit Service Solicitation UUIDs
 * <p>
 * https://www.bluetooth.com/specifications/assigned-numbers/generic-access-profile/
 * </p>
 */
public class ListOf32BitServiceSolicitationUUIDs extends AbstractAdvertisingData {

    /**
     * UUID list
     */
    private final List<UUID> mUuidList;

	/**
     * @param data   byte array from <a href="https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
     * @param offset data offset
	 * @see #ListOf32BitServiceSolicitationUUIDs(byte[], int, int)
	 */
	public ListOf32BitServiceSolicitationUUIDs(@NonNull byte[] data, int offset) {
		this(data, offset, data[offset]);
	}

    /**
     * Constructor for List of 32-bit Service Solicitation UUIDs
     *
     * @param data   byte array from <a href="https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
     * @param offset data offset
     * @param length 1st octet of Advertising Data
     */
    public ListOf32BitServiceSolicitationUUIDs(@NonNull byte[] data, int offset, int length) {
        super(length);

        // combine with BASE UUID
        long lsb = BASE_UUID.getLeastSignificantBits();
        long msb = BASE_UUID.getMostSignificantBits();
        List<UUID> uuidList = new ArrayList<>();
        for (int i = offset + 2; i < offset + length + 1; i += 4) {
            long target = data[i] & 0xff;
            target |= (data[i + 1] & 0xff) << 8;
            target |= (data[i + 2] & 0xff) << 16;
            target |= (data[i + 3] & 0xff) << 24;
            target = target << 32;
            uuidList.add(new UUID(msb | target, lsb));
        }
        mUuidList = Collections.synchronizedList(Collections.unmodifiableList(uuidList));
    }

    /**
     * Constructor for List of 32-bit Service Solicitation UUIDs
     * 
     * @param uuids UUID array
     * @see ListOf32BitServiceSolicitationUUIDs#ListOf32BitServiceSolicitationUUIDs(List)
     */
    public ListOf32BitServiceSolicitationUUIDs(@NonNull UUID... uuids) {
        this(Arrays.asList(uuids));
    }

	/**
	 * Constructor for List of 32-bit Service Solicitation UUIDs
	 * 
	 * @param uuidList UUID list
	 */
	public ListOf32BitServiceSolicitationUUIDs(@NonNull List<UUID> uuidList) {
		super(uuidList.size() * 4 + 1);

        mUuidList = Collections.synchronizedList(Collections.unmodifiableList(uuidList));
	}

    /**
     * {@inheritDoc}
     */
    @Override
    public int getDataType() {
        return LIST_OF_32_BIT_SERVICE_SOLICITATION_UUIDS_DATA_TYPE;
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
            byteBuffer.putInt((int) (uuid.getMostSignificantBits() >> 32));
        }
        return data;
    }

}
