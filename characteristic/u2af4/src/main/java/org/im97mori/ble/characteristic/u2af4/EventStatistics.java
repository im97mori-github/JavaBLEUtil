package org.im97mori.ble.characteristic.u2af4;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Event Statistics (Characteristics UUID: 0x2AF4)
 */
public class EventStatistics implements ByteArrayInterface {

    /**
     * Number of Events
     */
    private final int mNumberOfEvents;

    /**
     * Average Event Duration
     */
    private final int mAverageEventDuration;

    /**
     * Time Elapsed Since Last Event
     */
    private final int mTimeElapsedSinceLastEvent;

    /**
     * Sensing Duration
     */
    private final int mSensingDuration;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public EventStatistics(@NonNull byte[] values) {
        mNumberOfEvents = BLEUtils.createUInt16(values, 0);
        mAverageEventDuration = BLEUtils.createUInt16(values, 2);
        mTimeElapsedSinceLastEvent = BLEUtils.createUInt8(values, 4);
        mSensingDuration = BLEUtils.createUInt8(values, 5);
    }

    /**
     * Constructor from parameters
     * 
     * @param numberOfEvents Number of Events
     * @param averageEventDuration Average Event Duration
     * @param timeElapsedSinceLastEvent Time Elapsed Since Last Event
     * @param sensingDuration Sensing Duration
     */
    public EventStatistics(int numberOfEvents, int averageEventDuration, int timeElapsedSinceLastEvent, int sensingDuration) {
        mNumberOfEvents = numberOfEvents;
        mAverageEventDuration = averageEventDuration;
        mTimeElapsedSinceLastEvent = timeElapsedSinceLastEvent;
        mSensingDuration = sensingDuration;
    }

    /**
     * @return Number of Events
     */
    public int getNumberOfEvents() {
        return mNumberOfEvents;
    }

    /**
     * @return Average Event Duration
     */
    public int getAverageEventDuration() {
        return mAverageEventDuration;
    }

    /**
     * @return Sensing Duration
     */
    public int getTimeElapsedSinceLastEvent() {
        return mTimeElapsedSinceLastEvent;
    }

    /**
     * @return Time Elapsed Since Last Event
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
        byte[] data = new byte[6];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mNumberOfEvents);
        byteBuffer.putShort((short) mAverageEventDuration);
        byteBuffer.put((byte) mTimeElapsedSinceLastEvent);
        byteBuffer.put((byte) mSensingDuration);
        return data;
    }

}
