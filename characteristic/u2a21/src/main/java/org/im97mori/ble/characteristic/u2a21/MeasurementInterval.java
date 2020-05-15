package org.im97mori.ble.characteristic.u2a21;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Measurement Interval (Characteristics UUID: 0x2A21)
 */
public class MeasurementInterval implements ByteArrayInterface {

    /**
     * 0: No periodic measurement
     */
    public static final int MEASUREMENT_INTERVAL_NO_PERIODIC_MEASUREMENT = 0;

    /**
     * Measurement Interval
     */
    private final int mMeasurementInterval;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A21
     */
    public MeasurementInterval(@NonNull byte[] values) {
        mMeasurementInterval = BLEUtils.createUInt16(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param measurementInterval Measurement Interval
     */
    public MeasurementInterval(int measurementInterval) {
        mMeasurementInterval = measurementInterval;
    }

    /**
     * @return Measurement Interval
     */
    public int getMeasurementInterval() {
        return mMeasurementInterval;
    }

    /**
     * @return {@code true}:No periodic measurement, {@code false}:periodic measurement
     */
    public boolean isMeasurementIntevalNoPeriodicMeasurement() {
        return MEASUREMENT_INTERVAL_NO_PERIODIC_MEASUREMENT == mMeasurementInterval;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mMeasurementInterval);
        return data;
    }

}
