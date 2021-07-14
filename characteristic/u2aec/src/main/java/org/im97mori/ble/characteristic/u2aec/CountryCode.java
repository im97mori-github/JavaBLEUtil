package org.im97mori.ble.characteristic.u2aec;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Country Code (Characteristics UUID: 0x2AEC)
 */
public class CountryCode implements ByteArrayInterface {

    /**
     * 0xFFFF : A value of 0xFFFF represents ’value is not known’
     */
    public static final int COUNTRY_CODE_VALUE_IS_NOT_KNOWN = 0xFFFF;

    /**
     * Country Code Minimum value
     */
    public static final int COUNTRY_CODE_VALUE_MINIMUM = 0;

    /**
     * Country Code Maximum value
     */
    public static final int COUNTRY_CODE_VALUE_MAXIMUM = 4095;

    /**
     * Country Code
     */
    private final int mCountryCode;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2AEC
     */
    public CountryCode(@NonNull byte[] values) {
        mCountryCode = BLEUtils.createUInt16(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param countryCode Country Code
     */
    public CountryCode(int countryCode) {
        mCountryCode = countryCode;
    }

    /**
     * @return Country Code
     */
    public int getCountryCode() {
        return mCountryCode;
    }

    /**
     * @return {@code true}:Country Code value is not known, {@code false}:has Country Code value information
     * @see #COUNTRY_CODE_VALUE_IS_NOT_KNOWN
     */
    public boolean isCountryCodeValueIsNotKnown() {
        return COUNTRY_CODE_VALUE_IS_NOT_KNOWN == mCountryCode;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mCountryCode);
        return data;
    }

}
