package org.im97mori.ble.characteristic.u2a87;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.LinkedList;
import java.util.List;

import org.im97mori.ble.ByteArrayInterface;
import org.im97mori.ble.characteristic.u2b37.RegisteredUser;

import androidx.annotation.NonNull;

/**
 * Email Address (Characteristics UUID: 0x2A87)
 */
public class EmailAddress implements ByteArrayInterface {

    /**
     * Email Address
     */
    private final String mEmailAddress;

    /**
     * Constructor from RegisteredUser array
     *
     * @param registeredUsers first to last Registered User Data array
     */
    public EmailAddress(@NonNull RegisteredUser... registeredUsers) {
        List<byte[]> dataList = new LinkedList<>();
        int length = 0;
        for (RegisteredUser registeredUser : registeredUsers) {
            dataList.add(registeredUser.getRegisteredUserData());
            length += dataList.get(dataList.size() - 1).length;
        }
        byte[] values = new byte[length];
        ByteBuffer byteBuffer = ByteBuffer.wrap(values).order(ByteOrder.LITTLE_ENDIAN);
        for (byte[] data : dataList) {
            byteBuffer.put(data);
        }

        mEmailAddress = new String(values);
    }

    /**
     * Constructor from parameters
     * 
     * @param emailAddress Email Address
     */
    public EmailAddress(@NonNull String emailAddress) {
        mEmailAddress = emailAddress;
    }

    /**
     * @return Email Address
     */
    public String getEmailAddress() {
        return mEmailAddress;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[3 + mEmailAddress.getBytes().length];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) (RegisteredUser.SEGMENTATION_HEADER_FIRST_SEGMENT_TRUE | RegisteredUser.SEGMENTATION_HEADER_LAST_SEGMENT_TRUE));
        byteBuffer.put((byte) (RegisteredUser.FLAGS_REGISTERED_USER_NAME_PRESENT_TRUE | RegisteredUser.FLAGS_USER_NAME_TRUNCATED_FALSE));
        byteBuffer.put((byte) 0);
        byteBuffer.put(mEmailAddress.getBytes());
        return data;
    }

}
