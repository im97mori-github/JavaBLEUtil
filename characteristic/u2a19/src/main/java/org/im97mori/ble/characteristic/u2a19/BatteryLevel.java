package org.im97mori.ble.characteristic.u2a19;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Battery Level (Characteristics UUID: 0x2A19)
 */
public class BatteryLevel implements ByteArrayInterface {

    /**
     * Level
     */
    private final int mLevel;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public BatteryLevel(byte[] values) {
        mLevel = (values[0] & 0xff);
    }

    /**
     * Constructor from parameters
     * 
     * @param level Level
     */
    public BatteryLevel(int level) {
        mLevel = level;
    }

    /**
     * @return Level
     */
    public int getLevel() {
        return mLevel;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mLevel);
        return data;
    }

}
