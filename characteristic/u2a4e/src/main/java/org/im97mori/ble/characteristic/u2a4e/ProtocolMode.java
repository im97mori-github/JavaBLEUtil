package org.im97mori.ble.characteristic.u2a4e;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Protocol Mode (Characteristics UUID: 0x2A4E)
 */
public class ProtocolMode implements ByteArrayInterface {

    /**
     * 0: Boot Protocol Mode
     */
    public static final int PROTOCOL_MODE_VALUE_BOOT_PROTOCOL_MODE = 0;

    /**
     * 1: Report Protocol Mode
     */
    public static final int PROTOCOL_MODE_VALUE_REPORT_PROTOCOL_MODE = 1;

    /**
     * Protocol Mode Value
     */
    private final int mProtocolModeValue;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public ProtocolMode(@NonNull byte[] values) {
        mProtocolModeValue = (values[0] & 0xff);
    }

    /**
     * Constructor from parameters
     * 
     * @param protocolModeValues Protocol Mode Value
     */
    public ProtocolMode(int protocolModeValues) {
        mProtocolModeValue = protocolModeValues;
    }

    /**
     * @return Protocol Mode Value
     */
    public int getProtocolModeValue() {
        return mProtocolModeValue;
    }

    /**
     * @return {@code true}:Boot Protocol Mode, {@code false}:not Boot Protocol Mode
     */
    public boolean isProtocolModeValueBootProtocolMode() {
        return PROTOCOL_MODE_VALUE_BOOT_PROTOCOL_MODE == mProtocolModeValue;
    }

    /**
     * @return {@code true}:Report Protocol Mode, {@code false}:not Report Protocol Mode
     */
    public boolean isProtocolModeValueReportProtocolMode() {
        return PROTOCOL_MODE_VALUE_REPORT_PROTOCOL_MODE == mProtocolModeValue;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mProtocolModeValue);
        return data;
    }

}
