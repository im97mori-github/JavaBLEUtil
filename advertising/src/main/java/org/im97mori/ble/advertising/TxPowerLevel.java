package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.TX_POWER_LEVEL_DATA_TYPE;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import androidx.annotation.NonNull;

/**
 * <p>
 * Tx Power Level
 * <p>
 * https://www.bluetooth.com/specifications/assigned-numbers/generic-access-profile/
 * </p>
 */
public class TxPowerLevel extends AbstractAdvertisingData {

    /**
     * Tx Power Level
     */
    private final byte mTxPowerLevel;

	/**
     * @param data   byte array from <a href="https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
     * @param offset data offset
	 * @see #TxPowerLevel(byte[], int, int)
	 */
	public TxPowerLevel(@NonNull byte[] data, int offset) {
		this(data, offset, data[offset]);
	}

    /**
     * Constructor for Tx Power Level
     *
     * @param data   byte array from <a href="https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
     * @param offset data offset
     * @param length 1st octet of Advertising Data
     */
    public TxPowerLevel(@NonNull byte[] data, int offset, int length) {
        super(length);

        mTxPowerLevel = data[offset + 2];
    }

	/**
	 * Constructor from parameters
	 * 
	 * @param txPowerLevel Tx Power Level
	 */
	public TxPowerLevel(byte txPowerLevel) {
		super(2);

		mTxPowerLevel = txPowerLevel;
	}

    /**
     * {@inheritDoc}
     */
    @Override
    public int getDataType() {
        return TX_POWER_LEVEL_DATA_TYPE;
    }

    /**
     * @return Tx Power Level
     */
    public byte getTxPowerLevel() {
        return mTxPowerLevel;
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
        byteBuffer.put((byte) mTxPowerLevel);
        return data;
    }
}
