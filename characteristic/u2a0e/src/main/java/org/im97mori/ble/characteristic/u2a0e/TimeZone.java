package org.im97mori.ble.characteristic.u2a0e;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Time Zone (Characteristics UUID: 0x2A0E)
 */
public class TimeZone implements ByteArrayInterface {

    /**
     * Time Zone
     */
    private final int mTimeZone;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A0E
     */
    public TimeZone(@NonNull byte[] values) {
        mTimeZone = BLEUtils.createSInt8(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param timeZone Time Zone
     */
    public TimeZone(int timeZone) {
        mTimeZone = timeZone;
    }

    /**
     * @return Time Zone
     */
    public int getTimeZone() {
        return mTimeZone;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mTimeZone);
        return data;
    }

}
