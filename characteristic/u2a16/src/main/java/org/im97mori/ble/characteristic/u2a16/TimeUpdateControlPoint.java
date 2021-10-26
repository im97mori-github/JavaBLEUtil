package org.im97mori.ble.characteristic.u2a16;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Time Update Control Point (Characteristics UUID: 0x2A16)
 */
public class TimeUpdateControlPoint implements ByteArrayInterface {

    /**
     * 1: Get Reference Update
     */
    public static final int TIME_UPDATE_CONTROL_POINT_GET_REFERENCE_UPDATE = 1;

    /**
     * 2: Cancel Reference Update
     */
    public static final int TIME_UPDATE_CONTROL_POINT_CANCEL_REFERENCE_UPDATE = 2;

    /**
     * Time Update Control Point
     */
    private final int mTimeUpdateControlPoint;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public TimeUpdateControlPoint(@NonNull byte[] values) {
        mTimeUpdateControlPoint = (values[0] & 0xff);
    }

    /**
     * Constructor from parameters
     * 
     * @param timeUpdateControlPoint Time Update Control Point
     */
    public TimeUpdateControlPoint(int timeUpdateControlPoint) {
        mTimeUpdateControlPoint = timeUpdateControlPoint;
    }

    /**
     * @return Time Update Control Point
     */
    public int getTimeUpdateControlPoint() {
        return mTimeUpdateControlPoint;
    }

    /**
     * @return {@code true}:Get Reference Update, {@code false}:Cancel Reference Update
     */
    public boolean isTimeUpdateControlPointGetReferenceUpdate() {
        return TIME_UPDATE_CONTROL_POINT_GET_REFERENCE_UPDATE == mTimeUpdateControlPoint;
    }

    /**
     * @return {@code true}:Cancel Reference Update, {@code false}:Get Reference Update
     */
    public boolean isTimeUpdateControlPointCancelReferenceUpdate() {
        return TIME_UPDATE_CONTROL_POINT_CANCEL_REFERENCE_UPDATE == mTimeUpdateControlPoint;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mTimeUpdateControlPoint);
        return data;
    }

}
