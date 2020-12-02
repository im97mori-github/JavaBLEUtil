package org.im97mori.ble.characteristic.u2a46;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * New Alert (Characteristics UUID: 0x2A46)
 */
public class NewAlert implements ByteArrayInterface {

    /**
     * Category ID
     */
    private final int mCategoryId;

    /**
     * Number of New Alert
     */
    private final int mNumberOfNewAlert;

    /**
     * Text String Information
     */
    private final String mTextStringInformation;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A46
     */
    public NewAlert(@NonNull byte[] values) {
        mCategoryId = (values[0] & 0xff);
        mNumberOfNewAlert = (values[1] & 0xff);
        if (values.length > 2) {
            mTextStringInformation = new String(values, 2, values.length - 2);
        } else {
            mTextStringInformation = null;
        }
    }

    /**
     * Constructor from parameters
     * 
     * @param categoryId            Category ID
     * @param numberOfNewAlert      Number of New Alert
     * @param textStringInformation Text String Information
     */
    public NewAlert(int categoryId, int numberOfNewAlert, @Nullable String textStringInformation) {
        mCategoryId = categoryId;
        mNumberOfNewAlert = numberOfNewAlert;
        mTextStringInformation = textStringInformation;
    }

    /**
     * @return Category ID
     */
    public int getCategoryId() {
        return mCategoryId;
    }

    /**
     * @return Number of New Alert
     */
    public int getNumberOfNewAlert() {
        return mNumberOfNewAlert;
    }

    /**
     * @return Text String Information
     */
    @Nullable
    public String getTextStringInformation() {
        return mTextStringInformation;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[2 + (mTextStringInformation == null ? 0 : mTextStringInformation.getBytes().length)];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mCategoryId);
        byteBuffer.put((byte) mNumberOfNewAlert);
        if (mTextStringInformation != null) {
            byteBuffer.put(mTextStringInformation.getBytes());
        }
        return data;
    }

}
