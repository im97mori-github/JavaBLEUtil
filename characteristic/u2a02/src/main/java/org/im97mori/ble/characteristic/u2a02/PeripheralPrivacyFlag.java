package org.im97mori.ble.characteristic.u2a02;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Peripheral Privacy Flag (Characteristics UUID: 0x2A02)
 */
public class PeripheralPrivacyFlag implements ByteArrayInterface {

    /**
     * 0: privacy is disabled in this device
     */
    public static final int FLAGS_PRIVACY_IS_DISABLED_IN_THIS_DEVICE = 0;

    /**
     * 1: privacy is enabled in this device
     */
    public static final int FLAGS_PRIVACY_IS_ENABLED_IN_THIS_DEVICE = 1;

    /**
     * Flag
     */
    private final int mFlag;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public PeripheralPrivacyFlag(@NonNull byte[] values) {
        mFlag = BLEUtils.createBoolean(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param flag Flag
     */
    public PeripheralPrivacyFlag(int flag) {
        mFlag = flag;
    }

    /**
     * @return Flag
     */
    public int getFlag() {
        return mFlag;
    }

    /**
     * @return {@code true}:privacy is disabled in this device
     */
    public boolean isPrivacyDisabled() {
        return FLAGS_PRIVACY_IS_DISABLED_IN_THIS_DEVICE == mFlag;
    }

    /**
     * @return {@code true}:privacy is enabled in this device
     */
    public boolean isPrivacyEnabled() {
        return FLAGS_PRIVACY_IS_ENABLED_IN_THIS_DEVICE == mFlag;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mFlag);
        return data;
    }

}
