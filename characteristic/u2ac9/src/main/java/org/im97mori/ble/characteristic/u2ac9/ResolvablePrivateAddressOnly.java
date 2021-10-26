package org.im97mori.ble.characteristic.u2ac9;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Resolvable Private Address Only (Characteristics UUID: 0x2AC9)
 */
public class ResolvablePrivateAddressOnly implements ByteArrayInterface {

    /**
     * 0: Only Resolvable Private Addresses will be used as local addresses after bonding
     */
    public static final int RESOLVABLE_PRIVATE_ADDRESS_0 = 0;

    /**
     * Resolvable Private Address
     */
    private final int mResolvablePrivateAddress;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public ResolvablePrivateAddressOnly(@NonNull byte[] values) {
        mResolvablePrivateAddress = (values[0] & 0xff);
    }

    /**
     * Constructor from parameters
     * 
     * @param resolvablePrivateAddress Resolvable Private Address
     */
    public ResolvablePrivateAddressOnly(int resolvablePrivateAddress) {
        mResolvablePrivateAddress = resolvablePrivateAddress;
    }

    /**
     * @return Resolvable Private Address
     */
    public int getResolvablePrivateAddress() {
        return mResolvablePrivateAddress;
    }

    /**
     * @return {@code true}:Only Resolvable Private Addresses will be used as local addresses after bonding
     */
    public boolean isResolvablePrivateAddress0() {
        return RESOLVABLE_PRIVATE_ADDRESS_0 == mResolvablePrivateAddress;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mResolvablePrivateAddress);
        return data;
    }

}
