package org.im97mori.ble.characteristic.u2a5d;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Sensor Location (Characteristics UUID: 0x2A5D)
 */
public class SensorLocation implements ByteArrayInterface {

    /**
     * Sensor Location
     */
    private final int mSensorLocation;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public SensorLocation(@NonNull byte[] values) {
        mSensorLocation = (values[0] & 0xff);
    }

    /**
     * Constructor from parameters
     * 
     * @param sensorLocation Sensor Location
     */
    public SensorLocation(int sensorLocation) {
        mSensorLocation = sensorLocation;
    }

    /**
     * @return Sensor Location
     */
    public int getSensorLocation() {
        return mSensorLocation;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mSensorLocation);
        return data;
    }

}
