package org.im97mori.ble.characteristic.u2a12;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Time Accuracy (Characteristics UUID: 0x2A12)
 */
public class TimeAccuracy implements ByteArrayInterface {

    /**
     * 254(0xfe): Accuracy out of range
     */
    public static final int ACCURACY_OUT_OF_RANGE = 254;

    /**
     * 255(0xff): Accuracy Unknown
     */
    public static final int ACCURACY_UNKNOWN = 255;

    /**
     * Accuracy unit(millis)
     */
    public static final int ACCURACY_UNIT = 125;

    /**
     * Accuracy
     */
    private final int mAccuracy;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public TimeAccuracy(@NonNull byte[] values) {
        mAccuracy = BLEUtils.createUInt8(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param accuracy Accuracy
     */
    public TimeAccuracy(int accuracy) {
        mAccuracy = accuracy;
    }

    /**
     * @return Accuracy
     */
    public int getAccuracy() {
        return mAccuracy;
    }

    /**
     * @return {@code true}:Accuracy is out of range, {@code false}:Accuracy is not out of range
     * @see #ACCURACY_OUT_OF_RANGE
     */
    public boolean isAccuracyOutOfRange() {
        return ACCURACY_OUT_OF_RANGE == mAccuracy;
    }

    /**
     * @return {@code true}:Accuracy is unknown, {@code false}:Accuracy is not unknown
     * @see #ACCURACY_UNKNOWN
     */
    public boolean isAccuracyUnknown() {
        return ACCURACY_UNKNOWN == mAccuracy;
    }

    /**
     * @return Accuracy(millis)
     */
    public int getAccuracyMillis() {
        return mAccuracy * ACCURACY_UNIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mAccuracy);
        return data;
    }

}
