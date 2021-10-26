package org.im97mori.ble.characteristic.u2ae7;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * CIE 13.3-1995 Color Rendering Index (Characteristics UUID: 0x2AE7)
 */
public class Cie13_3_1995ColorRenderingIndex implements ByteArrayInterface {

    /**
     * Color Rendering Index Minimum value
     */
    public static final int COLOR_RENDERING_INDEX_VALUE_MINIMUM = -128;

    /**
     * Color Rendering Index Maximum value
     */
    public static final int COLOR_RENDERING_INDEX_VALUE_MAXIMUM = 100;

    /**
     * Color Rendering Index
     */
    private final int mColorRenderingIndex;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public Cie13_3_1995ColorRenderingIndex(@NonNull byte[] values) {
        mColorRenderingIndex = BLEUtils.createSInt8(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param colorRenderingIndex Color Rendering Index
     */
    public Cie13_3_1995ColorRenderingIndex(int colorRenderingIndex) {
        mColorRenderingIndex = colorRenderingIndex;
    }

    /**
     * @return Color Rendering Index
     */
    public int getColorRenderingIndex() {
        return mColorRenderingIndex;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mColorRenderingIndex);
        return data;
    }

}
