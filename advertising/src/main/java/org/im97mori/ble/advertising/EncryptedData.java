package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.ENCRYPTED_ADVERTISING_DATA_DATA_TYPE;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import androidx.annotation.NonNull;

/**
 * <p>
 * Encrypted Data
 * <p>
 * https://www.bluetooth.com/specifications/assigned-numbers/generic-access-profile/
 * </p>
 */
public class EncryptedData extends AbstractAdvertisingData {

    /**
     * Randomizer
     */
    private final byte[] mRandomizer;

    /**
     * Payload
     */
    private final byte[] mPayload;

    /**
     * MIC
     */
    private final byte[] mMic;

    /**
     * @param data
     *            byte array from <a href=
     *            "https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
     * @param offset
     *            data offset
     * @see #EncryptedData(byte[], int, int)
     */
    public EncryptedData(@NonNull byte[] data, int offset) {
        this(data, offset, data[offset]);
    }

    /**
     * Constructor for EncryptedData
     *
     * @param data
     *            byte array from <a href=
     *            "https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
     * @param offset
     *            data offset
     * @param length
     *            1st octet of Advertising Data
     */
    public EncryptedData(@NonNull byte[] data, int offset, int length) {
        super(length);

        mRandomizer = Arrays.copyOfRange(data, 2, 7);
        int payloadLength = length - 1 - 5 - 4;
        mPayload = Arrays.copyOfRange(data, 7, 7 + payloadLength);
        mMic = Arrays.copyOfRange(data, data.length - 4, data.length);
    }

    /**
     * Constructor from parameters
     * 
     * @param randomizer
     *            Randomizer
     * @param payload
     *            Payload
     * @param mic
     *            MIC
     */
    public EncryptedData(byte[] randomizer, byte[] payload, byte[] mic) {
        super(10 + payload.length);

        mRandomizer = randomizer;
        mPayload = payload;
        mMic = mic;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getDataType() {
        return ENCRYPTED_ADVERTISING_DATA_DATA_TYPE;
    }

    /**
     * @return Randomizer
     */
    public byte[] getRandomizer() {
        return mRandomizer;
    }

    /**
     * @return Payload
     */
    public byte[] getPayload() {
        return mPayload;
    }

    /**
     * @return MIC
     */
    public byte[] getMic() {
        return mMic;
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
        byteBuffer.put(mRandomizer);
        byteBuffer.put(mPayload);
        byteBuffer.put(mMic);
        return data;
    }
}
