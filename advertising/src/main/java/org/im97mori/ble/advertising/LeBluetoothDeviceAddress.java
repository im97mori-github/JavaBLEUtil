package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.LE_BLUETOOTH_DEVICE_ADDRESS_DATA_TYPE;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import androidx.annotation.NonNull;

/**
 * <p>
 * LE Bluetooth Device Address
 * <p>
 * https://www.bluetooth.com/specifications/assigned-numbers/generic-access-profile/
 * </p>
 */
public class LeBluetoothDeviceAddress extends AbstractAdvertisingData {

    /**
     * LE Bluetooth Device Address
     */
    private final byte[] mLeBluetoothDeviceAddress = new byte[6];

    /**
     * Address type
     * (0 = Public Device Address, 1 = Random Device Address)
     */
    private final boolean mIsRandomAddress;

    /**
     * @param data
     *            byte array from <a href=
     *            "https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
     * @param offset
     *            data offset
     * @see #PublicTargetAddress(byte[], int, int)
     */
    public LeBluetoothDeviceAddress(@NonNull byte[] data, int offset) {
        this(data, offset, data[offset]);
    }

    /**
     * Constructor for LE Bluetooth Device Address
     *
     * @param data
     *            byte array from <a href=
     *            "https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
     * @param offset
     *            data offset
     * @param length
     *            1st octet of Advertising Data
     */
    public LeBluetoothDeviceAddress(@NonNull byte[] data, int offset, int length) {
        super(length);

        System.arraycopy(data, 2 + offset, mLeBluetoothDeviceAddress, 0, 6);

        mIsRandomAddress = (data[8 + offset] & 0b00000001) != 0;
    }

    /**
     * Constructor from parameters
     * 
     * @param leBluetoothDeviceAddress
     *            LE Bluetooth Device Address
     * @param isRandomAddress
     */
    public LeBluetoothDeviceAddress(@NonNull byte[] leBluetoothDeviceAddress, boolean isRandomAddress) {
        super(8);

        System.arraycopy(leBluetoothDeviceAddress, 0, mLeBluetoothDeviceAddress, 0, 6);
        mIsRandomAddress = isRandomAddress;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getDataType() {
        return LE_BLUETOOTH_DEVICE_ADDRESS_DATA_TYPE;
    }

    /**
     * @return LE Bluetooth Device Address
     */
    @NonNull
    public byte[] getLeBluetoothDeviceAddress() {
        return mLeBluetoothDeviceAddress;
    }

    /**
     * check Address type
     *
     * @return {@code true}: Random Device Address, {@code false}: Public Device
     *         Address
     */
    public boolean isRandomAddress() {
        return mIsRandomAddress;
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
        byteBuffer.put(mLeBluetoothDeviceAddress);
        byteBuffer.put((byte) (mIsRandomAddress ? 1 : 0));
        return data;
    }

}
