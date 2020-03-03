package org.im97mori.ble.advertising;

import static org.im97mori.ble.advertising.AdvertisingDataConstants.AdvertisingDataTypes.DATA_TYPE_APPEARANCE;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEConstants;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * <p>
 * Appearance
 * <p>
 * https://www.bluetooth.com/specifications/assigned-numbers/generic-access-profile/
 * </p>
 */
public class Appearance extends AbstractAdvertisingData {

    /**
     * Appearance key
     */
    private final int mAppearanceKey;

    /**
     * Constructor for Appearance
     *
     * @param data   byte array from {@link ScanRecord#getBytes()}
     * @param offset data offset
     * @param length 1st octed of Advertising Data
     */
    public Appearance(@NonNull byte[] data, int offset, int length) {
        super(length);

        ByteBuffer bb = ByteBuffer.wrap(data, offset + 2, length - 1).order(ByteOrder.LITTLE_ENDIAN);
        mAppearanceKey = bb.getShort() & 0xffff;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getDataType() {
        return DATA_TYPE_APPEARANCE;
    }

    /**
     * @return Appearance key
     */
    public int getAppearanceKey() {
        return mAppearanceKey;
    }

    /**
     * @return Appearance value
     */
    @Nullable
    public String getAppearanceValue() {
        return BLEConstants.APPEARANCE_VALUE_MAP.get(mAppearanceKey);
    }

    /**
     * @return Appearance description
     */
    @Nullable
    public String getAppearanceDescription() {
        return BLEConstants.APPEARANCE_DESCRIPTION_MAP.get(mAppearanceKey);
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
        byteBuffer.putShort((short) mAppearanceKey);
        return data;
    }

}
