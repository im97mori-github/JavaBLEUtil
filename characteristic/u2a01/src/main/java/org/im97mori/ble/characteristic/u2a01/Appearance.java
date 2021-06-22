package org.im97mori.ble.characteristic.u2a01;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Appearance (Characteristics UUID: 0x2A01)
 */
public class Appearance implements ByteArrayInterface {

    /**
     * 0x00: Unknown
     *
     * @see BLEConstants#APPEARANCE_VALUE_MAP
     * @see BLEConstants#APPEARANCE_DESCRIPTION_MAP
     */
    public static final int CATEGORY_UNKNOWN = 0x00;

    /**
     * Category
     */
    private final byte[] mCategory;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A01
     */
    public Appearance(@NonNull byte[] values) {
        mCategory = Arrays.copyOfRange(values, 0, 2);
    }

    /**
     * @return Category
     */
    public byte[] getCategory() {
        return mCategory;
    }

    /**
     * @return Category
     */
    public int getCategoryUint16() {
        return BLEUtils.createUInt16(mCategory, 0);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put(mCategory);
        return data;
    }

}
