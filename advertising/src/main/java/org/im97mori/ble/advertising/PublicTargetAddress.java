package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.PUBLIC_TARGET_ADDRESS_DATA_TYPE;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import androidx.annotation.NonNull;

/**
 * <p>
 * Public Target Address
 * <p>
 * https://www.bluetooth.com/specifications/assigned-numbers/generic-access-profile/
 * </p>
 */
public class PublicTargetAddress extends AbstractAdvertisingData {

    /**
     * Public Target Address list
     */
    private final List<byte[]> mAddressList;

	/**
     * @param data   byte array from <a href="https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
     * @param offset data offset
	 * @see #PublicTargetAddress(byte[], int, int)
	 */
	public PublicTargetAddress(@NonNull byte[] data, int offset) {
		this(data, offset, data[offset]);
	}

    /**
     * Constructor for Public Target Address
     *
     * @param data   byte array from <a href="https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
     * @param offset data offset
     * @param length 1st octet of Advertising Data
     */
    public PublicTargetAddress(@NonNull byte[] data, int offset, int length) {
        super(length);

        List<byte[]> addressList = new ArrayList<>();
        byte[] address;
        for (int i = offset + 2; i < offset + length - 1; i += 6) {
            address = new byte[6];
            System.arraycopy(data, i, address, 0, 6);
            addressList.add(address);
        }
        mAddressList = Collections.synchronizedList(Collections.unmodifiableList(addressList));
    }

	/**
	 * Constructor from parameters
	 * 
	 * @param addressList Public Target Address list
	 */
	public PublicTargetAddress(@NonNull List<byte[]> addressList) {
		super(addressList.size() * 6 + 1);

		mAddressList = Collections.synchronizedList(Collections.unmodifiableList(addressList));
	}

    /**
     * {@inheritDoc}
     */
    @Override
    public int getDataType() {
        return PUBLIC_TARGET_ADDRESS_DATA_TYPE;
    }

    /**
     * @return Public Target Address list
     */
    @NonNull
    public List<byte[]> getAddressList() {
        return mAddressList;
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
        for (byte[] address : mAddressList) {
            byteBuffer.put(address);
        }
        return data;
    }

}
