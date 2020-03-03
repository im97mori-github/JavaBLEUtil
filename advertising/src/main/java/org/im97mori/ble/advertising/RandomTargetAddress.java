package org.im97mori.ble.advertising;

import static org.im97mori.ble.advertising.AdvertisingDataConstants.AdvertisingDataTypes.DATA_TYPE_RANDOM_TARGET_ADDRESS;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import androidx.annotation.NonNull;

/**
 * <p>
 * Random Target Address
 * <p>
 * https://www.bluetooth.com/specifications/assigned-numbers/generic-access-profile/
 * </p>
 */
public class RandomTargetAddress extends AbstractAdvertisingData {

    /**
     * Random Target Address list
     */
    private final List<byte[]> mAddressList;

    /**
     * Constructor for Random Target Address
     *
     * @param data   byte array from {@link ScanRecord#getBytes()}
     * @param offset data offset
     * @param length 1st octed of Advertising Data
     */
    public RandomTargetAddress(@NonNull byte[] data, int offset, int length) {
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
     * {@inheritDoc}
     */
    @Override
    public int getDataType() {
        return DATA_TYPE_RANDOM_TARGET_ADDRESS;
    }

    /**
     * @return Random Target Address list
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
