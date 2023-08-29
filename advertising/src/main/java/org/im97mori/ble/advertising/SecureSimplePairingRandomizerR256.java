package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.SIMPLE_PAIRING_RANDOMIZER_R256_DATA_TYPE;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;

import androidx.annotation.NonNull;

/**
 * <p>
 * Secure Simple Pairing Randomizer R-256
 * <p>
 * https://www.bluetooth.com/specifications/assigned-numbers/generic-access-profile/
 * </p>
 */
public class SecureSimplePairingRandomizerR256 extends AbstractAdvertisingData {

    /**
     * Secure Simple Pairing Randomizer R-256
     */
    private final byte[] mSecureSimplePairingRandomizerR256 = new byte[16];

    /**
     * @param data
     *            byte array from <a href=
     *            "https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
     * @param offset
     *            data offset
     * @see #SecureSimplePairingRandomizerR256(byte[], int, int)
     */
    public SecureSimplePairingRandomizerR256(@NonNull byte[] data, int offset) {
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
    public SecureSimplePairingRandomizerR256(@NonNull byte[] data, int offset, int length) {
        super(length);

        System.arraycopy(data, 2, mSecureSimplePairingRandomizerR256, 0, 16);
    }

    /**
     * Constructor from parameters
     * 
     * @param secureSimplePairingRandomizerR256
     *            Secure Simple Pairing Randomizer R-256
     */
    public SecureSimplePairingRandomizerR256(@NonNull byte[] secureSimplePairingRandomizerR256) {
        super(17);
        System.arraycopy(secureSimplePairingRandomizerR256, 0, mSecureSimplePairingRandomizerR256, 0, 16);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getDataType() {
        return SIMPLE_PAIRING_RANDOMIZER_R256_DATA_TYPE;
    }

    /**
     * @return Secure Simple Pairing Randomizer R-
     *         256
     */
    @NonNull
    public BigInteger getSecureSimplePairingRandomizerR256() {
        return BLEUtils.createUInt128(mSecureSimplePairingRandomizerR256, 0);
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
        byteBuffer.put(mSecureSimplePairingRandomizerR256);
        return data;
    }
}
