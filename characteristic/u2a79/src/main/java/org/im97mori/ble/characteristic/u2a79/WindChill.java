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
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public WindChill(@NonNull byte[] values) {
        mWindChill = BLEUtils.createSInt8(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param windChill Wind Chill
     */
    public WindChill(int windChill) {
        mWindChill = windChill;
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
