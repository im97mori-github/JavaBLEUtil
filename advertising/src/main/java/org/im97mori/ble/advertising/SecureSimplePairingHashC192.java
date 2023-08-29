package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.SIMPLE_PAIRING_HASH_C192_DATA_TYPE;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;

import androidx.annotation.NonNull;

/**
 * <p>
 * Secure Simple Pairing Hash C-192
 * <p>
 * https://www.bluetooth.com/specifications/assigned-numbers/generic-access-profile/
 * </p>
 */
public class SecureSimplePairingHashC192 extends AbstractAdvertisingData {

    /**
     * Secure Simple Pairing Hash C-192
     */
    private final byte[] mSecureSimplePairingHashC192 = new byte[16];

    /**
     * @param data
     *            byte array from <a href=
     *            "https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
     * @param offset
     *            data offset
     * @see #SecureSimplePairingHashC192(byte[], int, int)
     */
    public SecureSimplePairingHashC192(@NonNull byte[] data, int offset) {
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
    public SecureSimplePairingHashC192(@NonNull byte[] data, int offset, int length) {
        super(length);

        System.arraycopy(data, 2, mSecureSimplePairingHashC192, 0, 16);
    }

    /**
     * Constructor from parameters
     * 
     * @param secureSimplePairingHashC192
     *            Secure Simple Pairing Hash C-192
     */
    public SecureSimplePairingHashC192(@NonNull byte[] secureSimplePairingHashC192) {
        super(17);
        System.arraycopy(secureSimplePairingHashC192, 0, mSecureSimplePairingHashC192, 0, 16);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getDataType() {
        return SIMPLE_PAIRING_HASH_C192_DATA_TYPE;
    }

    /**
     * @return Secure Simple Pairing Hash C-192
     */
    @NonNull
    public BigInteger getSecureSimplePairingHashC192() {
        return BLEUtils.createUInt128(mSecureSimplePairingHashC192, 0);
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
        byteBuffer.put(mSecureSimplePairingHashC192);
        return data;
    }
}
