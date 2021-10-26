package org.im97mori.ble.characteristic.u2b18;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Voltage (Characteristics UUID: 0x2B18)
 */
public class Voltage implements ByteArrayInterface {

    /**
     * Voltage Value
     */
    private int mVoltageValue;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public Voltage(@NonNull byte[] values) {
        mVoltageValue = BLEUtils.createUInt16(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param voltageValue Voltage Value
     */
    public Voltage(int voltageValue) {
        mVoltageValue = voltageValue;
    }

    /**
     * @return Voltage Value
     */
    public int getVoltageValue() {
        return mVoltageValue;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mVoltageValue);
        return data;
    }

}
