package org.im97mori.ble.descriptor.u2902;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Client Characteristic Configuration (Descriptor UUID: 0x2902)
 */
public class ClientCharacteristicConfiguration implements ByteArrayInterface {

    /**
     * @see #PROPERTIES_NOTIFICATIONS_DISABLED
     * @see #PROPERTIES_NOTIFICATIONS_ENABLED
     */
    public static final int PROPERTIES_NOTIFICATIONS_MASK = 0b00000000_00000001;

    /**
     * 0: Notifications disabled
     */
    public static final int PROPERTIES_NOTIFICATIONS_DISABLED = 0b00000000_00000000;

    /**
     * 1: Notifications enabled
     */
    public static final int PROPERTIES_NOTIFICATIONS_ENABLED = 0b00000000_00000001;

    /**
     * @see #PROPERTIES_INDICATIONS_DISABLED
     * @see #PROPERTIES_INDICATIONS_ENABLED
     */
    public static final int PROPERTIES_INDICATIONS_MASK = 0b00000000_00000010;

    /**
     * 0: Indications disabled
     */
    public static final int PROPERTIES_INDICATIONS_DISABLED = 0b00000000_00000000;

    /**
     * 1: Indications enabled
     */
    public static final int PROPERTIES_INDICATIONS_ENABLED = 0b00000000_00000010;

    /**
     * Properties
     */
    private final byte[] mProperties;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
     */
    public ClientCharacteristicConfiguration(@NonNull byte[] values) {
        mProperties = Arrays.copyOfRange(values, 0, 2);
    }

    /**
     * @return Properties
     */
    @NonNull
    public byte[] getProperties() {
        return mProperties;
    }

    /**
     * @return {@code true}:Notifications disabled, {@code false}:Notifications enabled
     */
    public boolean isPropertiesNotificationsDisabled() {
        return isPropertiesMatched(PROPERTIES_NOTIFICATIONS_MASK, PROPERTIES_NOTIFICATIONS_DISABLED);
    }

    /**
     * @return {@code true}:Notifications enabled, {@code false}:Notifications disabled
     */
    public boolean isPropertiesNotificationsEnabled() {
        return isPropertiesMatched(PROPERTIES_NOTIFICATIONS_MASK, PROPERTIES_NOTIFICATIONS_ENABLED);
    }

    /**
     * @return {@code true}:Indications disabled, {@code false}:Indications enabled
     */
    public boolean isPropertiesIndicationsDisabled() {
        return isPropertiesMatched(PROPERTIES_INDICATIONS_MASK, PROPERTIES_INDICATIONS_DISABLED);
    }

    /**
     * @return {@code true}:Indications enabled, {@code false}:Indications disabled
     */
    public boolean isPropertiesIndicationsEnabled() {
        return isPropertiesMatched(PROPERTIES_INDICATIONS_MASK, PROPERTIES_INDICATIONS_ENABLED);
    }

    /**
     * {@inheritDoc}
     */
    @NonNull
    @Override
    public byte[] getBytes() {
        byte[] data = new byte[2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put(mProperties);
        return data;
    }


    /**
     * check Properties
     *
     * @param mask   bitmask for expect
     * @param expect one of {@link #PROPERTIES_NOTIFICATIONS_DISABLED}
     *               , {@link #PROPERTIES_NOTIFICATIONS_ENABLED}
     *               , {@link #PROPERTIES_INDICATIONS_DISABLED}
     *               , {@link #PROPERTIES_INDICATIONS_ENABLED}
     * @return {@code true}:same as expect, {@code false}:not match
     */
    private boolean isPropertiesMatched(int mask, int expect) {
        return (mask & BLEUtils.createSInt16(mProperties, 0)) == expect;
    }

}
