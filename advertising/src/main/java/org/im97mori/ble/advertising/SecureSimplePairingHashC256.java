package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.SIMPLE_PAIRING_HASH_C256_DATA_TYPE;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;

import androidx.annotation.NonNull;

/**
 * <p>
 * Secure Simple Pairing Hash C-256
 * <p>
 * https://www.bluetooth.com/specifications/assigned-numbers/generic-access-profile/
 * </p>
 */
public class SecureSimplePairingHashC256 extends AbstractAdvertisingData {

    /**
     * Secure Simple Pairing Hash C-256
     */
    private final byte[] mSecureSimplePairingHashC256 = new byte[16];

    /**
     * @param data
     *            byte array from <a href=
     *            "https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
     * @param offset
     *            data offset
     * @see #SecureSimplePairingHashC256(byte[], int, int)
     */
    public SecureSimplePairingHashC256(@NonNull byte[] data, int offset) {
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
    public SecureSimplePairingHashC256(@NonNull byte[] data, int offset, int length) {
        super(length);

        System.arraycopy(data, 2, mSecureSimplePairingHashC256, 0, 16);
    }

    /**
     * Constructor from parameters
     * 
     * @param secureSimplePairingHashC256
     *            Secure Simple Pairing Hash C-256
     */
    public SecureSimplePairingHashC256(@NonNull byte[] secureSimplePairingHashC256) {
        super(17);
        System.arraycopy(secureSimplePairingHashC256, 0, mSecureSimplePairingHashC256, 0, 16);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getDataType() {
        return SIMPLE_PAIRING_HASH_C256_DATA_TYPE;
    }

    /**
     * @return Secure Simple Pairing Hash C-256
     */
    @NonNull
    public BigInteger getSecureSimplePairingHashC256() {
        return BLEUtils.createUInt128(mSecureSimplePairingHashC256, 0);
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
        byteBuffer.put(mSecureSimplePairingHashC256);
        return data;
    }
}
