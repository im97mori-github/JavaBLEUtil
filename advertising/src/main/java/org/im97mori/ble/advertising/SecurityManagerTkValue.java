package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.SECURITY_MANAGER_TK_VALUE_DATA_TYPE;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;

import androidx.annotation.NonNull;

/**
 * <p>
 * Security Manager TK Value
 * <p>
 * https://www.bluetooth.com/specifications/assigned-numbers/generic-access-profile/
 * </p>
 */
public class SecurityManagerTkValue extends AbstractAdvertisingData {

    /**
     * Security Manager TK Value
     */
    private final byte[] mSecurityManagerTkValue = new byte[16];

    /**
     * @param data
     *            byte array from <a href=
     *            "https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
     * @param offset
     *            data offset
     * @see #TxPowerLevel(byte[], int, int)
     */
    public SecurityManagerTkValue(@NonNull byte[] data, int offset) {
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
    public SecurityManagerTkValue(@NonNull byte[] data, int offset, int length) {
        super(length);

        System.arraycopy(data, 2, mSecurityManagerTkValue, 0, 16);
    }

    /**
     * Constructor from parameters
     * 
     * @param securityManagerTkValue
     *            Security Manager TK Value
     */
    public SecurityManagerTkValue(@NonNull byte[] securityManagerTkValue) {
        super(17);
        System.arraycopy(securityManagerTkValue, 0, mSecurityManagerTkValue, 0, 16);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getDataType() {
        return SECURITY_MANAGER_TK_VALUE_DATA_TYPE;
    }

    /**
     * @return Security Manager TK Value
     */
    public BigInteger getSecurityManagerTkValue() {
        return BLEUtils.createUInt128(mSecurityManagerTkValue, 0);
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
        byteBuffer.put(mSecurityManagerTkValue);
        return data;
    }
}
