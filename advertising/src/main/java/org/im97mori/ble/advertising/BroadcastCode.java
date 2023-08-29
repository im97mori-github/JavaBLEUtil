package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.BROADCAST_CODE_DATA_TYPE;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import androidx.annotation.NonNull;

/**
 * <p>
 * Broadcast_Code
 * <p>
 * https://www.bluetooth.com/specifications/assigned-numbers/generic-access-profile/
 * </p>
 */
public class BroadcastCode extends AbstractAdvertisingData {

    /**
     * Broadcast_Code
     */
    private final byte[] mBroadcastCode;

    /**
     * @param data
     *            byte array from <a href=
     *            "https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
     * @param offset
     *            data offset
     * @see #BroadcastCode(byte[], int, int)
     */
    public BroadcastCode(@NonNull byte[] data, int offset) {
        this(data, offset, data[offset]);
    }

    /**
     * Constructor for Tx Power Level
     *
     * @param data
     *            byte array from <a href=
     *            "https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
     * @param offset
     *            data offset
     * @param length
     *            1st octet of Advertising Data
     */
    public BroadcastCode(@NonNull byte[] data, int offset, int length) {
        super(length);

        mBroadcastCode = Arrays.copyOfRange(data, 2, data.length);
    }

    /**
     * Constructor from parameters
     * 
     * @param broadcastCode
     *            Broadcast_Code
     */
    public BroadcastCode(@NonNull byte[] broadcastCode) {
        super(broadcastCode.length + 1);
        mBroadcastCode = new byte[broadcastCode.length];
        System.arraycopy(broadcastCode, 0, mBroadcastCode, 0, broadcastCode.length);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getDataType() {
        return BROADCAST_CODE_DATA_TYPE;
    }

    /**
     * @return Broadcast_Code
     */
    @NonNull
    public byte[] getBroadcastCode() {
        return mBroadcastCode;
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
        byteBuffer.put(mBroadcastCode);
        return data;
    }
}
