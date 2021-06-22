package org.im97mori.ble.characteristic.u2a7d;

import static org.im97mori.ble.BLEUtils.BASE_UUID;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.UUID;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Descriptor Value Changed (Characteristics UUID: 0x2A7D)
 */
public class DescriptorValueChanged implements ByteArrayInterface {

    /**
     * @see #FLAGS_SOURCE_OF_CHANGE_SERVER
     * @see #FLAGS_SOURCE_OF_CHANGE_CLIENT
     */
    public static final int FLAGS_SOURCE_OF_CHANGE_MASK = 0b00000000_00000001;

    /**
     * 0: Source of Change Server
     */
    public static final int FLAGS_SOURCE_OF_CHANGE_SERVER = 0b00000000_00000000;

    /**
     * 1: Source of Change Client
     */
    public static final int FLAGS_SOURCE_OF_CHANGE_CLIENT = 0b00000000_00000001;

    /**
     * @see #FLAGS_CHANGE_TO_ONE_OR_MORE_ES_TRIGGER_SETTING_DESCRIPTORS_FALSE
     * @see #FLAGS_CHANGE_TO_ONE_OR_MORE_ES_TRIGGER_SETTING_DESCRIPTORS_TRUE
     */
    public static final int FLAGS_CHANGE_TO_ONE_OR_MORE_ES_TRIGGER_SETTING_DESCRIPTORS_MASK = 0b00000000_00000010;

    /**
     * 0: Change to one or more ES Trigger Setting Descriptors False
     */
    public static final int FLAGS_CHANGE_TO_ONE_OR_MORE_ES_TRIGGER_SETTING_DESCRIPTORS_FALSE = 0b00000000_00000000;

    /**
     * 1: Change to one or more ES Trigger Setting Descriptors True
     */
    public static final int FLAGS_CHANGE_TO_ONE_OR_MORE_ES_TRIGGER_SETTING_DESCRIPTORS_TRUE = 0b00000000_00000010;

    /**
     * @see #FLAGS_CHANGE_TO_ES_CONFIGURATION_DESCRIPTORS_FALSE
     * @see #FLAGS_CHANGE_TO_ES_CONFIGURATION_DESCRIPTORS_TRUE
     */
    public static final int FLAGS_CHANGE_TO_ES_CONFIGURATION_DESCRIPTORS_MASK = 0b00000000_00000100;

    /**
     * 0: Change to ES Configuration Descriptor False
     */
    public static final int FLAGS_CHANGE_TO_ES_CONFIGURATION_DESCRIPTORS_FALSE = 0b00000000_00000000;

    /**
     * 1: Change to ES Configuration Descriptor True
     */
    public static final int FLAGS_CHANGE_TO_ES_CONFIGURATION_DESCRIPTORS_TRUE = 0b00000000_00000100;

    /**
     * @see #FLAGS_CHANGE_TO_ES_MEASUREMENT_DESCRIPTORS_FALSE
     * @see #FLAGS_CHANGE_TO_ES_MEASUREMENT_DESCRIPTORS_TRUE
     */
    public static final int FLAGS_CHANGE_TO_ES_MEASUREMENT_DESCRIPTORS_MASK = 0b00000000_00001000;

    /**
     * 0: Change to ES Measurement Descriptor False
     */
    public static final int FLAGS_CHANGE_TO_ES_MEASUREMENT_DESCRIPTORS_FALSE = 0b00000000_00000000;

    /**
     * 1: Change to ES Measurement Descriptor True
     */
    public static final int FLAGS_CHANGE_TO_ES_MEASUREMENT_DESCRIPTORS_TRUE = 0b00000000_00001000;

    /**
     * @see #FLAGS_CHANGE_TO_CHARACTERISTIC_USER_DESCRIPTION_DESCRIPTORS_FALSE
     * @see #FLAGS_CHANGE_TO_CHARACTERISTIC_USER_DESCRIPTION_DESCRIPTORS_TRUE
     */
    public static final int FLAGS_CHANGE_TO_CHARACTERISTIC_USER_DESCRIPTION_DESCRIPTORS_MASK = 0b00000000_00010000;

    /**
     * 0: Change to Characteristic User Description Descriptor False
     */
    public static final int FLAGS_CHANGE_TO_CHARACTERISTIC_USER_DESCRIPTION_DESCRIPTORS_FALSE = 0b00000000_00000000;

    /**
     * 1: Change to Characteristic User Description Descriptor True
     */
    public static final int FLAGS_CHANGE_TO_CHARACTERISTIC_USER_DESCRIPTION_DESCRIPTORS_TRUE = 0b00000000_00010000;

    /**
     * Flags
     */
    private final int mFlags;

    /**
     * Characteristic UUID
     */
    private final byte[] mCharacteristicUUID;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A7D
     */
    public DescriptorValueChanged(@NonNull byte[] values) {
        mFlags = BLEUtils.createSInt16(values, 0);
        mCharacteristicUUID = Arrays.copyOfRange(values, 2, values.length);
    }

    /**
     * Constructor from parameters
     * 
     * @param flags              Flags
     * @param characteristicUUID Characteristic UUID
     */
    public DescriptorValueChanged(int flags, @NonNull byte[] characteristicUUID) {
        mFlags = flags;
        mCharacteristicUUID = characteristicUUID;
    }

    /**
     * @return Flags
     */
    public int getFlags() {
        return mFlags;
    }

    /**
     * @return {@code true}:Source of Change Server, {@code false}:Source of Change Client
     */
    public boolean isFlagsSourceOfChangeServer() {
        return isFlagsMatched(FLAGS_SOURCE_OF_CHANGE_MASK, FLAGS_SOURCE_OF_CHANGE_SERVER);
    }

    /**
     * @return {@code true}:Source of Change Client, {@code false}:Source of Change Server
     */
    public boolean isFlagsSourceOfChangeClient() {
        return isFlagsMatched(FLAGS_SOURCE_OF_CHANGE_MASK, FLAGS_SOURCE_OF_CHANGE_CLIENT);
    }

    /**
     * @return {@code true}:Change to one or more ES Trigger Setting Descriptors False, {@code false}:Change to one or more ES Trigger Setting Descriptors True
     */
    public boolean isFlagsChangeToOneOrMoreEsTriggerSettingDescriptorsFalse() {
        return isFlagsMatched(FLAGS_CHANGE_TO_ONE_OR_MORE_ES_TRIGGER_SETTING_DESCRIPTORS_MASK, FLAGS_CHANGE_TO_ONE_OR_MORE_ES_TRIGGER_SETTING_DESCRIPTORS_FALSE);
    }

    /**
     * @return {@code true}:Change to one or more ES Trigger Setting Descriptors True, {@code false}:Change to one or more ES Trigger Setting Descriptors False
     */
    public boolean isFlagsChangeToOneOrMoreEsTriggerSettingDescriptorsTrue() {
        return isFlagsMatched(FLAGS_CHANGE_TO_ONE_OR_MORE_ES_TRIGGER_SETTING_DESCRIPTORS_MASK, FLAGS_CHANGE_TO_ONE_OR_MORE_ES_TRIGGER_SETTING_DESCRIPTORS_TRUE);
    }

    /**
     * @return {@code true}:Change to ES Configuration Descriptor False, {@code false}:Change to ES Configuration Descriptor True
     */
    public boolean isFlagsChangeToEsConfigurationDescriptorFalse() {
        return isFlagsMatched(FLAGS_CHANGE_TO_ES_CONFIGURATION_DESCRIPTORS_MASK, FLAGS_CHANGE_TO_ES_CONFIGURATION_DESCRIPTORS_FALSE);
    }

    /**
     * @return {@code true}:Change to ES Configuration Descriptor True, {@code false}:Change to ES Configuration Descriptor False
     */
    public boolean isFlagsChangeToEsConfigurationDescriptorTrue() {
        return isFlagsMatched(FLAGS_CHANGE_TO_ES_CONFIGURATION_DESCRIPTORS_MASK, FLAGS_CHANGE_TO_ES_CONFIGURATION_DESCRIPTORS_TRUE);
    }

    /**
     * @return {@code true}:Change to ES Measurement Descriptor False, {@code false}:Change to ES Measurement Descriptor True
     */
    public boolean isFlagsChangeToEsMeasurementDescriptorFalse() {
        return isFlagsMatched(FLAGS_CHANGE_TO_ES_MEASUREMENT_DESCRIPTORS_MASK, FLAGS_CHANGE_TO_ES_MEASUREMENT_DESCRIPTORS_FALSE);
    }

    /**
     * @return {@code true}:Change to ES Measurement Descriptor True, {@code false}:Change to ES Measurement Descriptor False
     */
    public boolean isFlagsChangeToEsMeasurementDescriptorTrue() {
        return isFlagsMatched(FLAGS_CHANGE_TO_ES_MEASUREMENT_DESCRIPTORS_MASK, FLAGS_CHANGE_TO_ES_MEASUREMENT_DESCRIPTORS_TRUE);
    }

    /**
     * @return {@code true}:Change to Characteristic User Description Descriptor False, {@code false}:Change to Characteristic User Description Descriptor True
     */
    public boolean isFlagsChangeToCharacteristicUserDescriptionDescriptorFalse() {
        return isFlagsMatched(FLAGS_CHANGE_TO_CHARACTERISTIC_USER_DESCRIPTION_DESCRIPTORS_MASK, FLAGS_CHANGE_TO_CHARACTERISTIC_USER_DESCRIPTION_DESCRIPTORS_FALSE);
    }

    /**
     * @return {@code true}:Change to Characteristic User Description Descriptor True, {@code false}:Change to Characteristic User Description Descriptor False
     */
    public boolean isFlagsChangeToCharacteristicUserDescriptionDescriptorTrue() {
        return isFlagsMatched(FLAGS_CHANGE_TO_CHARACTERISTIC_USER_DESCRIPTION_DESCRIPTORS_MASK, FLAGS_CHANGE_TO_CHARACTERISTIC_USER_DESCRIPTION_DESCRIPTORS_TRUE);
    }

    /**
     * @return Characteristic UUID
     */
    public byte[] getCharacteristicUUID() {
        return mCharacteristicUUID;
    }

    /**
     * @return Characteristic {@link UUID} instance
     */
    @NonNull
    public UUID createCharacteristicUUID() {

        UUID uuid;
        if (mCharacteristicUUID.length == 2) {
            // combine with BASE UUID
            long lsb = BASE_UUID.getLeastSignificantBits();
            long msb = BASE_UUID.getMostSignificantBits();
            long target = mCharacteristicUUID[0] & 0xff;
            target |= (mCharacteristicUUID[1] & 0xff) << 8;
            target = target << 32;
            uuid = new UUID(msb | target, lsb);
        } else {
            ByteBuffer bb = ByteBuffer.wrap(mCharacteristicUUID, 0, 16).order(ByteOrder.LITTLE_ENDIAN);
            long lsb = bb.getLong();
            long msb = bb.getLong();
            uuid = new UUID(msb, lsb);
        }
        return uuid;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[2 + mCharacteristicUUID.length];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mFlags);
        byteBuffer.put(mCharacteristicUUID);
        return data;
    }

    /**
     * check Flags
     *
     * @param mask   bitmask for expect
     * @param expect one of {@link #FLAGS_SOURCE_OF_CHANGE_SERVER} , {@link #FLAGS_SOURCE_OF_CHANGE_CLIENT} , {@link #FLAGS_CHANGE_TO_ONE_OR_MORE_ES_TRIGGER_SETTING_DESCRIPTORS_FALSE} , {@link #FLAGS_CHANGE_TO_ONE_OR_MORE_ES_TRIGGER_SETTING_DESCRIPTORS_TRUE} , {@link #FLAGS_CHANGE_TO_ES_CONFIGURATION_DESCRIPTORS_FALSE} , {@link #FLAGS_CHANGE_TO_ES_CONFIGURATION_DESCRIPTORS_TRUE} , {@link #FLAGS_CHANGE_TO_ES_MEASUREMENT_DESCRIPTORS_FALSE} , {@link #FLAGS_CHANGE_TO_ES_MEASUREMENT_DESCRIPTORS_TRUE} , {@link #FLAGS_CHANGE_TO_CHARACTERISTIC_USER_DESCRIPTION_DESCRIPTORS_FALSE} , {@link #FLAGS_CHANGE_TO_CHARACTERISTIC_USER_DESCRIPTION_DESCRIPTORS_TRUE}
     * @return {@code true}:same as expect, {@code false}:not match
     */
    private boolean isFlagsMatched(int mask, int expect) {
        return (mask & mFlags) == expect;
    }

}
