package org.im97mori.ble.characteristic.u2a06;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Alert Level (Characteristics UUID: 0x2A06)
 */
public class AlertLevel implements ByteArrayInterface {

    /**
     * 0: No Alert
     */
    public static final int ALERT_LEVEL_NO_ALERT = 0;

    /**
     * 1: Mild Alert
     */
    public static final int ALERT_LEVEL_MILD_ALERT = 1;

    /**
     * 2: High Alert
     */
    public static final int ALERT_LEVEL_HIGH_ALERT = 2;

    /**
     * Alert Level
     */
    private final int mAlertLevel;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public AlertLevel(@NonNull byte[] values) {
        mAlertLevel = (values[0] & 0xff);
    }

    /**
     * Constructor from parameters
     * 
     * @param alertLevel Alert Level
     */
    public AlertLevel(int alertLevel) {
        mAlertLevel = alertLevel;
    }

    /**
     * @return Alert Level
     */
    public int getAlertLevel() {
        return mAlertLevel;
    }

    /**
     * @return {@code true}:No Alert, {@code false}:not No Alert
     */
    public boolean isAlertLevelNoAlert() {
        return ALERT_LEVEL_NO_ALERT == mAlertLevel;
    }

    /**
     * @return {@code true}:Mild Alert, {@code false}:not Mild Alert
     */
    public boolean isAlertLevelMildAlert() {
        return ALERT_LEVEL_MILD_ALERT == mAlertLevel;
    }

    /**
     * @return {@code true}:High Alert, {@code false}:not High Alert
     */
    public boolean isAlertLevelHighAlert() {
        return ALERT_LEVEL_HIGH_ALERT == mAlertLevel;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mAlertLevel);
        return data;
    }

}
