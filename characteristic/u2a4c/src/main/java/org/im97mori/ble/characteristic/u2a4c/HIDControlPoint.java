package org.im97mori.ble.characteristic.u2a4c;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * HID Control Point (Characteristics UUID: 0x2A4C)
 */
public class HIDControlPoint implements ByteArrayInterface {

    /**
     * 0: Suspend
     */
    public static final int HID_CONTROL_POINT_COMMAND_SUSPEND = 0;

    /**
     * 1: Exit Suspend
     */
    public static final int HID_CONTROL_POINT_COMMAND_EXIT_SUSPEND = 1;

    /**
     * HID Control Point Command
     */
    private final int mHidControlPointCommand;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public HIDControlPoint(@NonNull byte[] values) {
        mHidControlPointCommand = (values[0] & 0xff);
    }

    /**
     * Constructor from parameters
     * 
     * @param hidControlPointCommand HID Control Point Command
     */
    public HIDControlPoint(int hidControlPointCommand) {
        mHidControlPointCommand = hidControlPointCommand;
    }

    /**
     * @return HID Control Point Command
     */
    public int getHidControlPointCommand() {
        return mHidControlPointCommand;
    }

    /**
     * @return {@code true}:Suspend, {@code false}:not Suspend
     */
    public boolean isHidControlPointCommandSuspend() {
        return HID_CONTROL_POINT_COMMAND_SUSPEND == mHidControlPointCommand;
    }

    /**
     * @return {@code true}:Exit Suspend, {@code false}:not Exit Suspend
     */
    public boolean isHidControlPointCommandExitSuspend() {
        return HID_CONTROL_POINT_COMMAND_EXIT_SUSPEND == mHidControlPointCommand;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mHidControlPointCommand);
        return data;
    }

}
