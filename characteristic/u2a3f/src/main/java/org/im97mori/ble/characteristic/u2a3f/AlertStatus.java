package org.im97mori.ble.characteristic.u2a3f;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Alert Status (Characteristics UUID: 0x2A3F)
 */
public class AlertStatus implements ByteArrayInterface {

    /**
     * @see #ALERT_STATUS_RINGER_STATE_NOT_ACTIVE
     * @see #ALERT_STATUS_RINGER_STATE_ACTIVE
     */
    public static final int ALERT_STATUS_RINGER_STATE_MASK = 0b00000001;

    /**
     * 0: Ringer State not active
     */
    public static final int ALERT_STATUS_RINGER_STATE_NOT_ACTIVE = 0b00000000;

    /**
     * 1: Ringer State active
     */
    public static final int ALERT_STATUS_RINGER_STATE_ACTIVE = 0b00000001;

    /**
     * @see #ALERT_STATUS_VIBRATE_STATE_NOT_ACTIVE
     * @see #ALERT_STATUS_VIBRATE_STATE_ACTIVE
     */
    public static final int ALERT_STATUS_VIBRATE_STATE_MASK = 0b00000010;

    /**
     * 0: Vibrate State not active
     */
    public static final int ALERT_STATUS_VIBRATE_STATE_NOT_ACTIVE = 0b00000000;

    /**
     * 1: Vibrate State active
     */
    public static final int ALERT_STATUS_VIBRATE_STATE_ACTIVE = 0b00000010;

    /**
     * @see #ALERT_STATUS_DISPLAY_ALERT_STATUS_NOT_ACTIVE
     * @see #ALERT_STATUS_DISPLAY_ALERT_STATUS_ACTIVE
     */
    public static final int ALERT_STATUS_DISPLAY_ALERT_STATUS_MASK = 0b00000100;

    /**
     * 0: Display Alert Status not active
     */
    public static final int ALERT_STATUS_DISPLAY_ALERT_STATUS_NOT_ACTIVE = 0b00000000;

    /**
     * 1: Display Alert Status State active
     */
    public static final int ALERT_STATUS_DISPLAY_ALERT_STATUS_ACTIVE = 0b00000100;

    /**
     * Alert Status
     */
    private final int mAlertStatus;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A3F
     */
    public AlertStatus(@NonNull byte[] values) {
        mAlertStatus = (values[0] & 0xff);
    }

    /**
     * @return Alert Status
     */
    public int getAlertStatus() {
        return mAlertStatus;
    }

    /**
     * @return {@code true}:Ringer State not active, {@code false}:Ringer State active
     */
    public boolean isAlertStatusRingerStateNotActive() {
        return isAlertStatusMatched(ALERT_STATUS_RINGER_STATE_MASK, ALERT_STATUS_RINGER_STATE_NOT_ACTIVE);
    }

    /**
     * @return {@code true}:Ringer State active, {@code false}:Ringer State not active
     */
    public boolean isAlertStatusRingerStateActive() {
        return isAlertStatusMatched(ALERT_STATUS_RINGER_STATE_MASK, ALERT_STATUS_RINGER_STATE_ACTIVE);
    }

    /**
     * @return {@code true}:Vibrate State not active, {@code false}:Vibrate State active
     */
    public boolean isAlertStatusVibrateStateNotActive() {
        return isAlertStatusMatched(ALERT_STATUS_VIBRATE_STATE_MASK, ALERT_STATUS_VIBRATE_STATE_NOT_ACTIVE);
    }

    /**
     * @return {@code true}:Vibrate State active, {@code false}:Vibrate State not active
     */
    public boolean isAlertStatusVibrateStateActive() {
        return isAlertStatusMatched(ALERT_STATUS_VIBRATE_STATE_MASK, ALERT_STATUS_VIBRATE_STATE_ACTIVE);
    }

    /**
     * @return {@code true}:Display Alert Status not active, {@code false}:Display Alert Status State active
     */
    public boolean isAlertStatusDisplayAlertStatusNotActive() {
        return isAlertStatusMatched(ALERT_STATUS_DISPLAY_ALERT_STATUS_MASK, ALERT_STATUS_DISPLAY_ALERT_STATUS_NOT_ACTIVE);
    }

    /**
     * @return {@code true}:Display Alert Status State active, {@code false}:Display Alert Status not active
     */
    public boolean isAlertStatusDisplayAlertStatusActive() {
        return isAlertStatusMatched(ALERT_STATUS_DISPLAY_ALERT_STATUS_MASK, ALERT_STATUS_DISPLAY_ALERT_STATUS_ACTIVE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mAlertStatus);
        return data;
    }

    /**
     * check Alert Status
     *
     * @param mask   bitmask for expect
     * @param expect one of {@link #ALERT_STATUS_RINGER_STATE_NOT_ACTIVE}
     *               , {@link #ALERT_STATUS_RINGER_STATE_ACTIVE}
     *               , {@link #ALERT_STATUS_VIBRATE_STATE_NOT_ACTIVE}
     *               , {@link #ALERT_STATUS_VIBRATE_STATE_ACTIVE}
     *               , {@link #ALERT_STATUS_DISPLAY_ALERT_STATUS_NOT_ACTIVE}
     *               , {@link #ALERT_STATUS_DISPLAY_ALERT_STATUS_ACTIVE}
     * @return {@code true}:same as expect, {@code false}:not match
     */
    private boolean isAlertStatusMatched(int mask, int expect) {
        return (mask & mAlertStatus) == expect;
    }

}
