package org.im97mori.ble.characteristic.u2a8c;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Gender (Characteristics UUID: 0x2A8C)
 */
public class Gender implements ByteArrayInterface {

    /**
     * 0: Male
     */
    public static final int GENDER_MALE = 0;

    /**
     * 1: Female
     */
    public static final int GENDER_FEMALE = 1;

    /**
     * 2: Unspecified
     */
    public static final int GENDER_UNSPECIFIED = 2;

    /**
     * Gender
     */
    private final int mGender;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A8C
     */
    public Gender(@NonNull byte[] values) {
        mGender = (values[0] & 0xff);
    }

    /**
     * Constructor from parameters
     * 
     * @param gender Gender
     */
    public Gender(int gender) {
        mGender = gender;
    }

    /**
     * @return Gender
     */
    public int getGender() {
        return mGender;
    }

    /**
     * @return {@code true}:Male, {@code false}:not Male
     */
    public boolean isGenderMale() {
        return GENDER_MALE == mGender;
    }

    /**
     * @return {@code true}:Female, {@code false}:not Female
     */
    public boolean isGenderFemale() {
        return GENDER_FEMALE == mGender;
    }

    /**
     * @return {@code true}:Unspecified, {@code false}:not Unspecified
     */
    public boolean isGenderUnspecified() {
        return GENDER_UNSPECIFIED == mGender;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mGender);
        return data;
    }

}
