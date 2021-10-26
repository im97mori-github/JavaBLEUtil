package org.im97mori.ble.characteristic.u2ae1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Average Voltage (Characteristics UUID: 0x2AE1)
 */
public class AverageVoltage implements ByteArrayInterface {

    /**
     * Voltage Value
     */
    private int mVoltageValue;

    /**
     * Sensing Duration
     */
    private final int mSensingDuration;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public AverageVoltage(@NonNull byte[] values) {
        mVoltageValue = BLEUtils.createUInt16(values, 0);
        mSensingDuration = BLEUtils.createUInt8(values, 2);
    }

    /**
     * Constructor from parameters
     * 
     * @param voltageValue Voltage Value
     * @param sensingDuration Sensing Duration
     */
    public AverageVoltage(int voltageValue, int sensingDuration) {
        mVoltageValue = voltageValue;
        mSensingDuration = sensingDuration;
    }

    /**
     * @return Voltage Value
     */
    public int getVoltageValue() {
        return mVoltageValue;
    }

    /**
     * @return Sensing Duration
     */
    public int getSensingDuration() {
        return mSensingDuration;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[3];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mVoltageValue);
        byteBuffer.put((byte) mSensingDuration);
        return data;
    }

}
