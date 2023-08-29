package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.SIMPLE_PAIRING_RANDOMIZER_R192_DATA_TYPE;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;

import androidx.annotation.NonNull;

/**
 * <p>
 * Secure Simple Pairing Randomizer R-192
 * <p>
 * https://www.bluetooth.com/specifications/assigned-numbers/generic-access-profile/
 * </p>
 */
public class SecureSimplePairingRandomizerR192 extends AbstractAdvertisingData {

    /**
     * Secure Simple Pairing Randomizer R-192
     */
    private final byte[] mSecureSimplePairingRandomizerR192 = new byte[16];

    /**
     * @param data
     *            byte array from <a href=
     *            "https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
     * @param offset
     *            data offset
     * @see #SecureSimplePairingRandomizerR192(byte[], int, int)
     */
    public SecureSimplePairingRandomizerR192(@NonNull byte[] data, int offset) {
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
    public SecureSimplePairingRandomizerR192(@NonNull byte[] data, int offset, int length) {
        super(length);

        System.arraycopy(data, 2, mSecureSimplePairingRandomizerR192, 0, 16);
    }

    /**
     * Constructor from parameters
     * 
     * @param secureSimplePairingRandomizerR192
     *            Secure Simple Pairing Randomizer R-192
     */
    public SecureSimplePairingRandomizerR192(@NonNull byte[] secureSimplePairingRandomizerR192) {
        super(17);
        System.arraycopy(secureSimplePairingRandomizerR192, 0, mSecureSimplePairingRandomizerR192, 0, 16);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getDataType() {
        return SIMPLE_PAIRING_RANDOMIZER_R192_DATA_TYPE;
    }

    /**
     * @return Secure Simple Pairing Randomizer R-
     *         192
     */
    @NonNull
    public BigInteger getSecureSimplePairingRandomizerR192() {
        return BLEUtils.createUInt128(mSecureSimplePairingRandomizerR192, 0);
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
        byteBuffer.put(mSecureSimplePairingRandomizerR192);
        return data;
    }
}
