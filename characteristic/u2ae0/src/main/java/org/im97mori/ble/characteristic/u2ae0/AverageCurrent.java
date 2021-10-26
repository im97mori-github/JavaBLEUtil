package org.im97mori.ble.characteristic.u2ae0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Average Current (Characteristics UUID: 0x2AE0)
 */
public class AverageCurrent implements ByteArrayInterface {

    /**
     * Electric Current Value
     */
    private final int mElectricCurrentValue;

    /**
     * Sensing Duration
     */
    private final int mSensingDuration;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public AverageCurrent(@NonNull byte[] values) {
        mElectricCurrentValue = BLEUtils.createUInt16(values, 0);
        mSensingDuration = BLEUtils.createUInt8(values, 2);
    }

    /**
     * Constructor from parameters
     * 
     * @param electricCurrentValue Electric Current Value
     * @param sensingDuration Sensing Duration
     */
    public AverageCurrent(int electricCurrentValue, int sensingDuration) {
        mElectricCurrentValue = electricCurrentValue;
        mSensingDuration = sensingDuration;
    }

    /**
     * @return Electric Current Value
     */
    public int getElectricCurrentValue() {
        return mElectricCurrentValue;
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
        byteBuffer.putShort((short) mElectricCurrentValue);
        byteBuffer.put((byte) mSensingDuration);
        return data;
    }

}
