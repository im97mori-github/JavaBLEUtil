package org.im97mori.ble.characteristic.u2ae9;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Correlated Color Temperature (Characteristics UUID: 0x2AE9)
 */
public class CorrelatedColorTemperature implements ByteArrayInterface {

    /**
     * Correlated Color Temperature
     */
    private final int mCorrelatedColorTemperature;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public CorrelatedColorTemperature(@NonNull byte[] values) {
        mCorrelatedColorTemperature = BLEUtils.createUInt16(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param correlatedColorTemperature Correlated Color Temperature
     */
    public CorrelatedColorTemperature(int correlatedColorTemperature) {
        mCorrelatedColorTemperature = correlatedColorTemperature;
    }

    /**
     * @return Correlated Color Temperature
     */
    public int getCorrelatedColorTemperature() {
        return mCorrelatedColorTemperature;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mCorrelatedColorTemperature);
        return data;
    }

}
