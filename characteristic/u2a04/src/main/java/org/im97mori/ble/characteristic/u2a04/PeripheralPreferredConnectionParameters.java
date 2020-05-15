package org.im97mori.ble.characteristic.u2a04;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Peripheral Preferred Connection Parameters (Characteristics UUID: 0x2A04)
 */
public class PeripheralPreferredConnectionParameters implements ByteArrayInterface {

    /**
     * Unit: 1.25ms
     */
    public static final double MINIMUM_CONNECTION_INTERVAL_UNIT = 1.25d;

    /**
     * Unit: 1.25ms
     */
    public static final double MAXIMUM_CONNECTION_INTERVAL_UNIT = 1.25d;

    /**
     * Unit: 10ms
     */
    public static final double CONNECTION_SUPERVISION_TIMEOUT_MULTIPLIER_UNIT = 10d;

    /**
     * Minimum Connection Interval
     */
    private final int mMinimumConnectionInterval;

    /**
     * Maximum Connection Interval
     */
    private final int mMaximumConnectionInterval;

    /**
     * Slave Latency
     */
    private final int mSlaveLatency;

    /**
     * Connection Supervision Timeout Multiplier
     */
    private final int mConnectionSupervisionTimeoutMultiplier;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A04
     */
    public PeripheralPreferredConnectionParameters(@NonNull byte[] values) {
        mMinimumConnectionInterval = BLEUtils.createUInt16(values, 0);
        mMaximumConnectionInterval = BLEUtils.createUInt16(values, 2);
        mSlaveLatency = BLEUtils.createUInt16(values, 4);
        mConnectionSupervisionTimeoutMultiplier = BLEUtils.createUInt16(values, 6);
    }

    /**
     * Constructor from parameters
     * 
     * @param minimumConnectionInterval              Minimum Connection Interval
     * @param maximumConnectionInterval              Maximum Connection Interval
     * @param slaveLatency                           Slave Latency
     * @param connectionSupervisionTimeoutMultiplier Connection Supervision Timeout Multiplier
     */
    public PeripheralPreferredConnectionParameters(int minimumConnectionInterval, int maximumConnectionInterval, int slaveLatency, int connectionSupervisionTimeoutMultiplier) {
        mMinimumConnectionInterval = minimumConnectionInterval;
        mMaximumConnectionInterval = maximumConnectionInterval;
        mSlaveLatency = slaveLatency;
        mConnectionSupervisionTimeoutMultiplier = connectionSupervisionTimeoutMultiplier;
    }

    /**
     * @return Minimum Connection Interval
     */
    public int getMinimumConnectionInterval() {
        return mMinimumConnectionInterval;
    }

    /**
     * @return Minimum connection interval(millis)
     */
    public double getMinimumConnectionIntervalMillis() {
        return mMinimumConnectionInterval * MINIMUM_CONNECTION_INTERVAL_UNIT;
    }

    /**
     * @return Maximum Connection Interval
     */
    public int getMaximumConnectionInterval() {
        return mMaximumConnectionInterval;
    }

    /**
     * @return Maximum connection interval(millis)
     */
    public double getMaximumConnectionIntervalMillis() {
        return mMaximumConnectionInterval * MAXIMUM_CONNECTION_INTERVAL_UNIT;
    }

    /**
     * @return Slave Latency
     */
    public int getSlaveLatency() {
        return mSlaveLatency;
    }

    /**
     * @return Connection Supervision Timeout Multiplier
     */
    public int getConnectionSupervisionTimeoutMultiplier() {
        return mConnectionSupervisionTimeoutMultiplier;
    }

    /**
     * @return Connection Supervision Timeout Multiplier(millis)
     */
    public double getConnectionSupervisionTimeoutMultiplierMillis() {
        return mConnectionSupervisionTimeoutMultiplier * CONNECTION_SUPERVISION_TIMEOUT_MULTIPLIER_UNIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[8];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mMinimumConnectionInterval);
        byteBuffer.putShort((short) mMaximumConnectionInterval);
        byteBuffer.putShort((short) mSlaveLatency);
        byteBuffer.putShort((short) mConnectionSupervisionTimeoutMultiplier);
        return data;
    }

}
