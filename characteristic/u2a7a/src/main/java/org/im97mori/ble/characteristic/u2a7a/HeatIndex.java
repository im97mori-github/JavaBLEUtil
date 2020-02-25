package org.im97mori.ble.characteristic.u2a7a;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Heat Index (Characteristics UUID: 0x2A7A)
 */
public class HeatIndex implements ByteArrayInterface {

    /**
     * Heat Index
     */
    private final int mHeatIndex;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A7A
     */
    public HeatIndex(@NonNull byte[] values) {
        mHeatIndex = BLEUtils.createSInt8(values, 0);
    }

    /**
     * @return Heat Index
     */
    public int getHeatIndex() {
        return mHeatIndex;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mHeatIndex);
        return data;
    }

}
