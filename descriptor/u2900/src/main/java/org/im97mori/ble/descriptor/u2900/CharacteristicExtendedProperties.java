package org.im97mori.ble.descriptor.u2900;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Characteristic Extended Properties (Descriptor UUID: 0x2900)
 */
public class CharacteristicExtendedProperties implements ByteArrayInterface {

    /**
     * @see #PROPERTIES_RELIABLE_WRITE_DISABLED
     * @see #PROPERTIES_RELIABLE_WRITE_ENABLED
     */
    public static final int PROPERTIES_RELIABLE_WRITE_MASK = 0b00000000_00000001;

    /**
     * 0: Reliable Write disabled
     */
    public static final int PROPERTIES_RELIABLE_WRITE_DISABLED = 0b00000000_00000000;

    /**
     * 1: Reliable Write enabled
     */
    public static final int PROPERTIES_RELIABLE_WRITE_ENABLED = 0b00000000_00000001;

    /**
     * @see #PROPERTIES_WRITABLE_AUXILIARIES_DISABLED
     * @see #PROPERTIES_WRITABLE_AUXILIARIES_ENABLED
     */
    public static final int PROPERTIES_WRITABLE_AUXILIARIES_MASK = 0b00000000_00000010;

    /**
     * 0: Writable Auxiliaries disabled
     */
    public static final int PROPERTIES_WRITABLE_AUXILIARIES_DISABLED = 0b00000000_00000000;

    /**
     * 1: Writable Auxiliaries enabled
     */
    public static final int PROPERTIES_WRITABLE_AUXILIARIES_ENABLED = 0b00000000_00000010;

    /**
     * Properties
     */
    private final byte[] mProperties;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
     */
    public CharacteristicExtendedProperties(@NonNull byte[] values) {
        mProperties = Arrays.copyOfRange(values, 0, 2);
    }

    /**
     * Constructor from parameters
     * 
     * @param isReliableWriteEnabled       {@code true}:{@link #PROPERTIES_RELIABLE_WRITE_ENABLED}, {@code false}:{@link #PROPERTIES_RELIABLE_WRITE_DISABLED}
     * @param isWritableAuxiliariesEnabled {@code true}:{@link #PROPERTIES_WRITABLE_AUXILIARIES_ENABLED}, {@code false}:{@link #PROPERTIES_WRITABLE_AUXILIARIES_DISABLED}
     */
    public CharacteristicExtendedProperties(boolean isReliableWriteEnabled, boolean isWritableAuxiliariesEnabled) {
        int properties = isReliableWriteEnabled ? PROPERTIES_RELIABLE_WRITE_ENABLED : PROPERTIES_RELIABLE_WRITE_DISABLED;
        properties |= isWritableAuxiliariesEnabled ? PROPERTIES_WRITABLE_AUXILIARIES_ENABLED : PROPERTIES_WRITABLE_AUXILIARIES_DISABLED;
        mProperties = new byte[] { (byte) properties, (byte) (properties >> 8) };
    }

    /**
     * @return Properties
     */
    @NonNull
    public byte[] getProperties() {
        return mProperties;
    }

    /**
     * @return {@code true}:Reliable Write disabled, {@code false}:Reliable Write enabled
     */
    public boolean isPropertiesReliableWriteDisabled() {
        return isPropertiesMatched(PROPERTIES_RELIABLE_WRITE_MASK, PROPERTIES_RELIABLE_WRITE_DISABLED);
    }

    /**
     * @return {@code true}:Reliable Write enabled, {@code false}:Reliable Write disabled
     */
    public boolean isPropertiesReliableWriteEnabled() {
        return isPropertiesMatched(PROPERTIES_RELIABLE_WRITE_MASK, PROPERTIES_RELIABLE_WRITE_ENABLED);
    }

    /**
     * @return {@code true}:Writable Auxiliaries disabled, {@code false}:Writable Auxiliaries enabled
     */
    public boolean isPropertiesWritableAuxiliariesDisabled() {
        return isPropertiesMatched(PROPERTIES_WRITABLE_AUXILIARIES_MASK, PROPERTIES_WRITABLE_AUXILIARIES_DISABLED);
    }

    /**
     * @return {@code true}:Writable Auxiliaries enabled, {@code false}:Writable Auxiliaries disabled
     */
    public boolean isPropertiesWritableAuxiliariesEnabled() {
        return isPropertiesMatched(PROPERTIES_WRITABLE_AUXILIARIES_MASK, PROPERTIES_WRITABLE_AUXILIARIES_ENABLED);
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
     * @param expect one of {@link #PROPERTIES_RELIABLE_WRITE_DISABLED} , {@link #PROPERTIES_RELIABLE_WRITE_ENABLED} , {@link #PROPERTIES_WRITABLE_AUXILIARIES_DISABLED} , {@link #PROPERTIES_WRITABLE_AUXILIARIES_ENABLED}
     * @return {@code true}:same as expect, {@code false}:not match
     */
    private boolean isPropertiesMatched(int mask, int expect) {
        return (mask & BLEUtils.createSInt16(mProperties, 0)) == expect;
    }

}
