package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.LE_SECURE_CONNECTIONS_RANDOM_VALUE_DATA_TYPE;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;

import androidx.annotation.NonNull;

/**
 * <p>
 * LE Secure Connections Random Value
 * <p>
 * https://www.bluetooth.com/specifications/assigned-numbers/generic-access-profile/
 * </p>
 */
public class LeSecureConnectionsRandomValue extends AbstractAdvertisingData {

    /**
     * LE Secure Connections Random Value
     */
    private final byte[] mLeSecureConnectionsRandomValue = new byte[16];

    /**
     * @param data
     *            byte array from <a href=
     *            "https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
     * @param offset
     *            data offset
     * @see #LeSecureConnectionsRandomValue(byte[], int, int)
     */
    public LeSecureConnectionsRandomValue(@NonNull byte[] data, int offset) {
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
    public LeSecureConnectionsRandomValue(@NonNull byte[] data, int offset, int length) {
        super(length);

        System.arraycopy(data, 2, mLeSecureConnectionsRandomValue, 0, 16);
    }

    /**
     * Constructor from parameters
     * 
     * @param leSecureConnectionsRandomValue
     *            LE Secure Connections Random Value
     */
    public LeSecureConnectionsRandomValue(@NonNull byte[] leSecureConnectionsRandomValue) {
        super(17);
        System.arraycopy(leSecureConnectionsRandomValue, 0, mLeSecureConnectionsRandomValue, 0, 16);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getDataType() {
        return LE_SECURE_CONNECTIONS_RANDOM_VALUE_DATA_TYPE;
    }

    /**
     * @return LE Secure Connections Random Value
     */
    @NonNull
    public BigInteger getLeSecureConnectionsRandomValue() {
        return BLEUtils.createUInt128(mLeSecureConnectionsRandomValue, 0);
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
        byteBuffer.put(mLeSecureConnectionsRandomValue);
        return data;
    }
}
