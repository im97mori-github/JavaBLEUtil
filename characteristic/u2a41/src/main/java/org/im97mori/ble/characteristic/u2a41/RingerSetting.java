package org.im97mori.ble.characteristic.u2a41;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Ringer Setting (Characteristics UUID: 0x2A41)
 */
public class RingerSetting implements ByteArrayInterface {

    /**
     * 0: Ringer Silent
     */
    public static final int RINGER_SETTING_SILENT = 0;

    /**
     * 1: Ringer Normal
     */
    public static final int RINGER_SETTING_NORMAL = 1;

    /**
     * Ringer Setting
     */
    private final int mRingerSetting;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A41
     */
    public RingerSetting(@NonNull byte[] values) {
        mRingerSetting = values[0];
    }

    /**
     * Constructor from parameters
     * 
     * @param ringerSetting Ringer SettingRinger Setting
     */
    public RingerSetting(int ringerSetting) {
        mRingerSetting = ringerSetting;
    }

    /**
     * @return Ringer Setting
     */
    public int getRingerSetting() {
        return mRingerSetting;
    }

    /**
     * @return {@code true}:Ringer Silent, {@code false}:Ringer Normal
     */
    public boolean isRingerSettingSilent() {
        return RINGER_SETTING_SILENT == mRingerSetting;
    }

    /**
     * @return {@code true}:Ringer Normal, {@code false}:Ringer Silent
     */
    public boolean isRingerSettingNormal() {
        return RINGER_SETTING_NORMAL == mRingerSetting;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mRingerSetting);
        return data;
    }

}
