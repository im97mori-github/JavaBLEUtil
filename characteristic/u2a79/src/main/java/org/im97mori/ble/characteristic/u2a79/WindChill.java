package org.im97mori.ble.characteristic.u2a79;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Wind Chill (Characteristics UUID: 0x2A79)
 */
public class WindChill implements ByteArrayInterface {

    /**
     * Wind Chill
     */
    private final int mWindChill;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A79
     */
    public WindChill(@NonNull byte[] values) {
        mWindChill = BLEUtils.createSInt8(values, 0);
    }

    /**
     * @return Wind Chill
     */
    public int getWindChill() {
        return mWindChill;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mWindChill);
        return data;
    }

}
