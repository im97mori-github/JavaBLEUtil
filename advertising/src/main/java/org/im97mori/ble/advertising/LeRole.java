package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.LE_ROLE_DATA_TYPE;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;

import androidx.annotation.NonNull;

/**
 * <p>
 * LE Role
 * <p>
 * https://www.bluetooth.com/specifications/assigned-numbers/generic-access-profile/
 * </p>
 */
public class LeRole extends AbstractAdvertisingData {

    /**
     * Only Peripheral Role supported
     */
    public static final int LE_ROLE_ONLY_PERIPHERAL_ROLE_SUPPORTED = 0x00;

    /**
     * Only Central Role supported
     */
    public static final int LE_ROLE_ONLY_CENTRAL_ROLE_SUPPORTED = 0x01;

    /**
     * Peripheral and Central Role supported, Peripheral Role preferred for
     * connection establishment
     */
    public static final int LE_ROLE_PERIPHERAL_ROLE_PREFERRED_FOR_CONNECTION_STABLISHMENT = 0x02;

    /**
     * Peripheral and Central Role supported, Central Role preferred for connection
     * establishment
     */
    public static final int LE_ROLE_CENTRAL_ROLE_PREFERRED_FOR_CONNECTION_STABLISHMENT = 0x03;

    /**
     * LE Role
     */
    private final int mLeRole;

    /**
     * @param data
     *            byte array from <a href=
     *            "https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
     * @param offset
     *            data offset
     * @see #AdvertisingInterval(byte[], int, int)
     */
    public LeRole(@NonNull byte[] data, int offset) {
        this(data, offset, data[offset]);
    }

    /**
     * Constructor for LE Role
     *
     * @param data
     *            byte array from <a href=
     *            "https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
     * @param offset
     *            data offset
     * @param length
     *            1st octet of Advertising Data
     */
    public LeRole(@NonNull byte[] data, int offset, int length) {
        super(length);

        mLeRole = BLEUtils.createUInt8(data, 2);
    }

    /**
     * Constructor from parameters
     * 
     * @param leRole
     *            LE Role
     */
    public LeRole(int leRole) {
        super(2);

        mLeRole = leRole;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getDataType() {
        return LE_ROLE_DATA_TYPE;
    }

    /**
     * @return LE Role
     */
    public int getLeRole() {
        return mLeRole;
    }

    /**
     * check Only Peripheral Role supported
     *
     * @return {@code true}:Only Peripheral Role supported, {@code false}:not
     *         supported
     */
    public boolean isOnlyPeripheralRoleSupported() {
        return mLeRole == LE_ROLE_ONLY_PERIPHERAL_ROLE_SUPPORTED;
    }

    /**
     * check Only Central Role supported
     *
     * @return {@code true}:Only Central Role supported, {@code false}:not
     *         supported
     */
    public boolean isOnlyCentralRoleSupported() {
        return mLeRole == LE_ROLE_ONLY_CENTRAL_ROLE_SUPPORTED;
    }

    /**
     * check Peripheral Role preferred for connection
     * establishment
     *
     * @return {@code true}:Peripheral Role preferred for connection
     *         establishment
     */
    public boolean isPeripheralRolePreferredForConnectionEstablishment() {
        return mLeRole == LE_ROLE_PERIPHERAL_ROLE_PREFERRED_FOR_CONNECTION_STABLISHMENT;
    }

    /**
     * check Central Role preferred for connection
     * establishment
     *
     * @return {@code true}:Central Role preferred for connection
     *         establishment
     */
    public boolean isCentralRolePreferredForConnectionEstablishment() {
        return mLeRole == LE_ROLE_CENTRAL_ROLE_PREFERRED_FOR_CONNECTION_STABLISHMENT;
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
        byteBuffer.put((byte) mLeRole);
        return data;
    }

}
