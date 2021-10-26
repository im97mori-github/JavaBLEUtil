package org.im97mori.ble.characteristic.u2a47;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Supported New Alert Category (Characteristics UUID: 0x2A47)
 */
public class SupportedNewAlertCategory implements ByteArrayInterface {

    /**
     * Category ID Bit Mask 0
     */
    private final int mCategoryIdBitMask0;

    /**
     * {@code true}:has Category ID Bit Mask 1, {@code false}:no Category ID Bit Mask 1
     */
    private final boolean mHasCategoryIdBitMask1;

    /**
     * Category ID Bit Mask 1
     */
    private final int mCategoryIdBitMask1;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public SupportedNewAlertCategory(@NonNull byte[] values) {
        mCategoryIdBitMask0 = (values[0] & 0xff);
        if (values.length > 1) {
            mHasCategoryIdBitMask1 = true;
            mCategoryIdBitMask1 = (values[1] & 0xff);
        } else {
            mHasCategoryIdBitMask1 = false;
            mCategoryIdBitMask1 = 0;
        }
    }

    /**
     * Constructor from parameters
     * 
     * @param categoryIdBitMask0 Category ID Bit Mask 0
     */
    public SupportedNewAlertCategory(int categoryIdBitMask0) {
        this(categoryIdBitMask0, false, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param categoryIdBitMask0 Category ID Bit Mask 0
     * @param categoryIdBitMask1 Category ID Bit Mask 1
     */
    public SupportedNewAlertCategory(int categoryIdBitMask0, int categoryIdBitMask1) {
        this(categoryIdBitMask0, true, categoryIdBitMask1);
    }

    /**
     * Constructor from parameters
     * 
     * @param categoryIdBitMask0    Category ID Bit Mask 0
     * @param hasCategoryIdBitMask1 {@code true}:has Category ID Bit Mask 1, {@code false}:no Category ID Bit Mask 1
     * @param categoryIdBitMask1    Category ID Bit Mask 1
     */
    public SupportedNewAlertCategory(int categoryIdBitMask0, boolean hasCategoryIdBitMask1, int categoryIdBitMask1) {
        mCategoryIdBitMask0 = categoryIdBitMask0;
        mHasCategoryIdBitMask1 = hasCategoryIdBitMask1;
        mCategoryIdBitMask1 = mHasCategoryIdBitMask1 ? categoryIdBitMask1 : 0;
    }

    /**
     * @return Category ID Bit Mask 0
     */
    public int getCategoryIdBitMask0() {
        return mCategoryIdBitMask0;
    }

    /**
     * 
     * @return {@code true}:has Category ID Bit Mask 1, {@code false}:no Category ID Bit Mask 1
     */
    public boolean hasCategoryIdBitMask1() {
        return mHasCategoryIdBitMask1;
    }

    /**
     * @return Category ID Bit Mask 1
     */
    public int getCategoryIdBitMask1() {
        return mCategoryIdBitMask1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1 + (mHasCategoryIdBitMask1 ? 1 : 0)];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mCategoryIdBitMask0);
        if (mHasCategoryIdBitMask1) {
            byteBuffer.put((byte) mCategoryIdBitMask1);
        }
        return data;
    }

}
