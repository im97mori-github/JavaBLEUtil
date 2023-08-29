package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.LE_SECURE_CONNECTIONS_CONFIRMATION_VALUE_DATA_TYPE;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;

import androidx.annotation.NonNull;

/**
 * <p>
 * LE Secure Connections Confirmation Value
 * <p>
 * https://www.bluetooth.com/specifications/assigned-numbers/generic-access-profile/
 * </p>
 */
public class LeSecureConnectionsConfirmationValue extends AbstractAdvertisingData {

    /**
     * LE Secure Connections Confirmation Value
     */
    private final byte[] mLeSecureConnectionsConfirmationValue = new byte[16];

    /**
     * @param data
     *            byte array from <a href=
     *            "https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
     * @param offset
     *            data offset
     * @see #LeSecureConnectionsConfirmationValue(byte[], int, int)
     */
    public LeSecureConnectionsConfirmationValue(@NonNull byte[] data, int offset) {
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
    public LeSecureConnectionsConfirmationValue(@NonNull byte[] data, int offset, int length) {
        super(length);

        System.arraycopy(data, 2, mLeSecureConnectionsConfirmationValue, 0, 16);
    }

    /**
     * Constructor from parameters
     * 
     * @param leSecureConnectionsConfirmationValue
     *            LE Secure Connections Confirmation Value
     */
    public LeSecureConnectionsConfirmationValue(@NonNull byte[] leSecureConnectionsConfirmationValue) {
        super(17);
        System.arraycopy(leSecureConnectionsConfirmationValue, 0, mLeSecureConnectionsConfirmationValue, 0, 16);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getDataType() {
        return LE_SECURE_CONNECTIONS_CONFIRMATION_VALUE_DATA_TYPE;
    }

    /**
     * @return LE Secure Connections Confirmation Value
     */
    @NonNull
    public BigInteger getLeSecureConnectionsConfirmationValue() {
        return BLEUtils.createUInt128(mLeSecureConnectionsConfirmationValue, 0);
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
        byteBuffer.put(mLeSecureConnectionsConfirmationValue);
        return data;
    }
}
