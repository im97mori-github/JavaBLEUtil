package org.im97mori.ble.characteristic.u2a40;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Ringer Control point (Characteristics UUID: 0x2A40)
 */
public class RingerControlPoint implements ByteArrayInterface {

    /**
     * 1: Silent Mode
     */
    public static final int RINGER_CONTROL_POINT_SILENT_MODE = 1;

    /**
     * 2: Mute Once
     */
    public static final int RINGER_CONTROL_POINT_MUTE_ONCE = 2;

    /**
     * 3: Cancel Silent Mode
     */
    public static final int RINGER_CONTROL_POINT_CANCEL_SILENT_MODE = 3;

    /**
     * Ringer Control Point
     */
    private final int mRingerControlPoint;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A40
     */
    public RingerControlPoint(@NonNull byte[] values) {
        mRingerControlPoint = (values[0] & 0xff);
    }

    /**
     * Constructor from parameters
     * 
     * @param ringerControlPoint Ringer Control Point
     */
    public RingerControlPoint(int ringerControlPoint) {
        mRingerControlPoint = ringerControlPoint;
    }

    /**
     * @return Ringer Control Point
     */
    public int getRingerControlPoint() {
        return mRingerControlPoint;
    }

    /**
     * @return {@code true}:Silent Mode, {@code false}:not Silent Mode
     */
    public boolean isRingerControlPointSilentMode() {
        return RINGER_CONTROL_POINT_SILENT_MODE == mRingerControlPoint;
    }

    /**
     * @return {@code true}:Mute Once, {@code false}:not Mute Once
     */
    public boolean isRingerControlPointMuteOnce() {
        return RINGER_CONTROL_POINT_MUTE_ONCE == mRingerControlPoint;
    }

    /**
     * @return {@code true}:Cancel Silent Mode, {@code false}:not Cancel Silent Mode
     */
    public boolean isRingerControlPointCancelSilentMode() {
        return RINGER_CONTROL_POINT_CANCEL_SILENT_MODE == mRingerControlPoint;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mRingerControlPoint);
        return data;
    }

}
