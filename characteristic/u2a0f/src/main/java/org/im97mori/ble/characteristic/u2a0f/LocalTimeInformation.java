package org.im97mori.ble.characteristic.u2a0f;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Local Time Information (Characteristics UUID: 0x2A0F)
 */
public class LocalTimeInformation implements ByteArrayInterface {

    /**
     * 255(0xff): time zone offset is not known
     */
    public static final int TIME_ZONE_IS_NOT_KNOWN = -128;

    /**
     * TimeZone unit(min)
     */
    public static final int TIME_ZONE_UNIT = 15;

    /**
     * Time Zone
     */
    private final int mTimeZone;

    /**
     * DST Offset
     */
    private final int mDstOffset;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A0F
     */
    public LocalTimeInformation(@NonNull byte[] values) {
        mTimeZone = BLEUtils.createSInt8(values, 0);
        mDstOffset = (values[1] & 0xff);
    }

    /**
     * @return Time Zone
     */
    public int getTimeZone() {
        return mTimeZone;
    }

    /**
     * @return {@code true}:time zone offset is not known, {@code false}:has time zone offset information
     * @see #TIME_ZONE_IS_NOT_KNOWN
     */
    public boolean isTimeZoneNotKnown() {
        return TIME_ZONE_IS_NOT_KNOWN == mTimeZone;
    }

    /**
     * @return Time Zone offset(mins)
     */
    public int getTimeZoneOffsetMin() {
        return TIME_ZONE_UNIT * mTimeZone;
    }

    /**
     * @return Time Zone offset(millis)
     */
    public long getTimeZoneOffsetMillis() {
        return getTimeZoneOffsetMin() * 1000L;
    }

    /**
     * @return DST Offset
     */
    public int getDstOffset() {
        return mDstOffset;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mTimeZone);
        byteBuffer.put((byte) mDstOffset);
        return data;
    }

}
