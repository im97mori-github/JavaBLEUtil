package org.im97mori.ble.characteristic.u2aa6;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Central Address Resolution (Characteristics UUID: 0x2AA6)
 */
public class CentralAddressResolution implements ByteArrayInterface {

    /**
     * 0: address resolution is not supported in this device
     */
    public static final int CENTRAL_ADDRESS_RESOLUTION_NOT_SUPPORTED = 0;

    /**
     * 1: address resolution is supported in this device
     */
    public static final int CENTRAL_ADDRESS_RESOLUTION_SUPPORTED = 1;

    /**
     * Central Address Resolution Support
     */
    private final int mCentralAddressResolutionSupport;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2AA6
     */
    public CentralAddressResolution(@NonNull byte[] values) {
        mCentralAddressResolutionSupport = (values[0] & 0xff);
    }

    /**
     * Constructor from parameters
     * 
     * @param centralAddressResolutionSupport Central Address Resolution Support
     */
    public CentralAddressResolution(int centralAddressResolutionSupport) {
        mCentralAddressResolutionSupport = centralAddressResolutionSupport;
    }

    /**
     * @return Central Address Resolution Support
     */
    public int getCentralAddressResolutionSupport() {
        return mCentralAddressResolutionSupport;
    }

    /**
     * @return {@code true}:address resolution is not supported in this device
     */
    public boolean isCentralAddressResolutionNotSupported() {
        return CENTRAL_ADDRESS_RESOLUTION_NOT_SUPPORTED == mCentralAddressResolutionSupport;
    }

    /**
     * @return {@code true}:address resolution is supported in this device
     */
    public boolean isCentralAddressResolutionSupported() {
        return CENTRAL_ADDRESS_RESOLUTION_SUPPORTED == mCentralAddressResolutionSupport;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mCentralAddressResolutionSupport);
        return data;
    }

}
