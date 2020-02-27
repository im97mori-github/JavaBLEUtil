package org.im97mori.ble.characteristic.u2a31;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Scan Refresh (Characteristics UUID: 0x2A31)
 */
public class ScanRefresh implements ByteArrayInterface {

    /**
     * 0x00: Server requires refresh
     */
    public static final int SCAN_REFRESH_VALUE_SERVER_REQUIRES_REFRESH = 0x00;

    /**
     * Scan Refresh Value
     */
    private final int mScanRefreshValue;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A31
     */
    public ScanRefresh(@NonNull byte[] values) {
        mScanRefreshValue = (values[0] & 0xff);
    }

    /**
     * @return Scan Refresh Value
     */
    public int getScanRefreshValue() {
        return mScanRefreshValue;
    }

    /**
     * @return {@code true}:Server requires refresh, {@code false}:not Server requires refresh
     */
    public boolean isScanRefreshValueServerRequiresRefresh() {
        return SCAN_REFRESH_VALUE_SERVER_REQUIRES_REFRESH == mScanRefreshValue;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mScanRefreshValue);
        return data;
    }

}
