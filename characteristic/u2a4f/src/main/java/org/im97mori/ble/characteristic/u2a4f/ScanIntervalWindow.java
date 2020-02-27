package org.im97mori.ble.characteristic.u2a4f;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Scan Interval Window (Characteristics UUID: 0x2A4F)
 */
public class ScanIntervalWindow implements ByteArrayInterface {

    /**
     * LE_Scan_Interval Unit 0.625 ms
     */
    public static final double LE_SCAN_INTERVAL_RESOLUTION = 0.625d;

    /**
     * LE_Scan_Window Unit 0.625 ms
     */
    public static final double LE_SCAN_WINDOW_RESOLUTION = 0.625d;

    /**
     * LE_Scan_Interval
     */
    private final int mLeScanInterval;

    /**
     * LE_Scan_Window
     */
    private final int mLeScanWindow;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A4F
     */
    public ScanIntervalWindow(@NonNull byte[] values) {
        mLeScanInterval = BLEUtils.createUInt16(values, 0);
        mLeScanWindow = BLEUtils.createUInt16(values, 2);
    }

    /**
     * @return LE_Scan_Interval
     */
    public int getLeScanInterval() {
        return mLeScanInterval;
    }

    /**
     * @return LE_Scan_Interval(ms)
     */
    public double getLeScanIntervalMs() {
        return LE_SCAN_INTERVAL_RESOLUTION * mLeScanInterval;
    }

    /**
     * @return LE_Scan_Window
     */
    public int getLeScanWindow() {
        return mLeScanWindow;
    }

    /**
     * @return LE_Scan_Window(ms)
     */
    public double getLeScanWindowMs() {
        return LE_SCAN_WINDOW_RESOLUTION * mLeScanWindow;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[4];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mLeScanInterval);
        byteBuffer.putShort((short) mLeScanWindow);
        return data;
    }

}
