package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.SECURITY_MANAGER_OUTOF_BAND_FLAGS_DATA_TYPE;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import androidx.annotation.NonNull;

/**
 * <p>
 * Security Manager Out of Band
 * <p>
 * https://www.bluetooth.com/specifications/assigned-numbers/generic-access-profile/
 * </p>
 */
public class SecurityManagerOutOfBand extends AbstractAdvertisingData {

    /**
     * OOB Flags Field
     * (0 = OOB data not present, 1 = OOB data present)
     */
    public static final byte SECURITY_MANAGER_OUT_OF_BAND_FLAG_OOB_FLAGS = 0b00000001;

    /**
     * LE supported (Host)
     * (i.e. bit 65 of LMP Extended Feature bits Page 1)
     */
    public static final byte SECURITY_MANAGER_LE_SUPPORTED = 0b00000010;

    /**
     * Address type
     * (0 = Public Address, 1 = Random Address)
     */
    public static final byte SECURITY_MANAGER_ADDRESS_TYPE = 0b00001000;

    /**
     * Security Manager Out of Band Flag
     */
    private final byte mSecurityManagerOutOfBandFlag;

    /**
     * @param data
     *            byte array from <a href=
     *            "https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
     * @param offset
     *            data offset
     * @see #TxPowerLevel(byte[], int, int)
     */
    public SecurityManagerOutOfBand(@NonNull byte[] data, int offset) {
        this(data, offset, data[offset]);
    }

    /**
     * Constructor for Security Manager Out of Band
     *
     * @param data
     *            byte array from <a href=
     *            "https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
     * @param offset
     *            data offset
     * @param length
     *            1st octet of Advertising Data
     */
    public SecurityManagerOutOfBand(@NonNull byte[] data, int offset, int length) {
        super(length);

        mSecurityManagerOutOfBandFlag = data[offset + 2];
    }

    /**
     * Constructor from parameters
     * 
     * @param securityManagerOutOfBandFlag
     *            Security Manager Out of Band Flag
     */
    public SecurityManagerOutOfBand(byte securityManagerOutOfBandFlag) {
        super(2);

        mSecurityManagerOutOfBandFlag = securityManagerOutOfBandFlag;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getDataType() {
        return SECURITY_MANAGER_OUTOF_BAND_FLAGS_DATA_TYPE;
    }

    /**
     * @return Security Manager Out of Band Flag
     */
    public byte getSecurityManagerOutOfBandFlag() {
        return mSecurityManagerOutOfBandFlag;
    }

    /**
     * check OOB Flags Field
     *
     * @return {@code true}: OOB data present, {@code false}: OOB data not present
     */
    public boolean isOobFlagsField() {
        return SECURITY_MANAGER_OUT_OF_BAND_FLAG_OOB_FLAGS == mSecurityManagerOutOfBandFlag;
    }

    /**
     * check LE supported (Host)
     *
     * @return {@code true}: LE supported (Host) supported, {@code false}: not supported
     */
    public boolean isLeSupported() {
        return SECURITY_MANAGER_LE_SUPPORTED == mSecurityManagerOutOfBandFlag;
    }

    /**
     * check Address type
     *
     * @return {@code true}: Random Address, {@code false}: Public Address
     */
    public boolean isAddressType() {
        return SECURITY_MANAGER_ADDRESS_TYPE == mSecurityManagerOutOfBandFlag;
    }

    /**
     * {@inheritDoc}
     */
    @NonNull
    @Override
    public byte[] getBytes() {
        byte[] data = new byte[1 + getLength()];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) getLength());
        byteBuffer.put((byte) getDataType());
        byteBuffer.put((byte) mSecurityManagerOutOfBandFlag);
        return data;
    }
}
