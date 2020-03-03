package org.im97mori.ble.advertising;

import static org.im97mori.ble.advertising.AdvertisingDataConstants.AdvertisingDataTypes.DATA_TYPE_TX_POWER_LEVEL;

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
     * Constructor for Tx Power Level
     *
     * @param data   byte array from {@link ScanRecord#getBytes()}
     * @param offset data offset
     * @param length 1st octed of Advertising Data
     */
    public TxPowerLevel(@NonNull byte[] data, int offset, int length) {
        super(length);

        mTxPowerLevel = data[offset + 2];
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getDataType() {
        return DATA_TYPE_TX_POWER_LEVEL;
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
