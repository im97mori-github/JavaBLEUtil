package org.im97mori.ble.characteristic.u2a13;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Time Source (Characteristics UUID: 0x2A13)
 */
public class TimeSource implements ByteArrayInterface {

    /**
     * 0: Time Source Unknown
     */
    public static final int TIME_SOURCE_UNKNOWN = 0;

    /**
     * 1: Time Source Network Time Protocol
     */
    public static final int TIME_SOURCE_NETWORK_TIME_PROTOCOL = 1;

    /**
     * 2: Time Source GPS
     */
    public static final int TIME_SOURCE_GPS = 2;

    /**
     * 3: Time Source Radio Time Signal
     */
    public static final int TIME_SOURCE_RADIO_TIME_SIGNAL = 3;

    /**
     * 4: Time Source Manual
     */
    public static final int TIME_SOURCE_MANUAL = 4;

    /**
     * 5: Time Source Atomic Clock
     */
    public static final int TIME_SOURCE_ATOMIC_CLOCK = 5;

    /**
     * 6: Time Source Cellular Network
     */
    public static final int TIME_SOURCE_CELLULAR_NETWORK = 6;

    /**
     * Time Source
     */
    private final int mTimeSource;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public TimeSource(@NonNull byte[] values) {
        mTimeSource = BLEUtils.createUInt8(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param timeSource Time Source
     */
    public TimeSource(int timeSource) {
        mTimeSource = timeSource;
    }

    /**
     * @return Time Source
     */
    public int getTimeSource() {
        return mTimeSource;
    }

    /**
     * @return {@code true}:Time Source is Unknown, {@code false}:Time Source is not Unknown
     * @see #TIME_SOURCE_UNKNOWN
     */
    public boolean isTimeSourceUnknown() {
        return TIME_SOURCE_UNKNOWN == mTimeSource;
    }

    /**
     * @return {@code true}:Time Source is Network Time Protocol, {@code false}:Time Source is not Network Time Protocol
     * @see #TIME_SOURCE_NETWORK_TIME_PROTOCOL
     */
    public boolean isTimeSourceNetworkTimeProtocol() {
        return TIME_SOURCE_NETWORK_TIME_PROTOCOL == mTimeSource;
    }

    /**
     * @return {@code true}:Time Source is GPS, {@code false}:Time Source is not GPS
     * @see #TIME_SOURCE_GPS
     */
    public boolean isTimeSourceNetworkGps() {
        return TIME_SOURCE_GPS == mTimeSource;
    }

    /**
     * @return {@code true}:Time Source is Radio Time Signal, {@code false}:Time Source is not Radio Time Signal
     * @see #TIME_SOURCE_RADIO_TIME_SIGNAL
     */
    public boolean isTimeSourceRadioTimeSignal() {
        return TIME_SOURCE_RADIO_TIME_SIGNAL == mTimeSource;
    }

    /**
     * @return {@code true}:Time Source is Manual, {@code false}:Time Source is not Manual
     * @see #TIME_SOURCE_MANUAL
     */
    public boolean isTimeSourceManual() {
        return TIME_SOURCE_MANUAL == mTimeSource;
    }

    /**
     * @return {@code true}:Time Source is Atomic Clock, {@code false}:Time Source is not Atomic Clock
     * @see #TIME_SOURCE_ATOMIC_CLOCK
     */
    public boolean isTimeSourceAtomicClock() {
        return TIME_SOURCE_ATOMIC_CLOCK == mTimeSource;
    }

    /**
     * @return {@code true}:Time Source is Cellular Network, {@code false}:Time Source is not Cellular Network
     * @see #TIME_SOURCE_CELLULAR_NETWORK
     */
    public boolean isTimeSourceCellularNetwork() {
        return TIME_SOURCE_CELLULAR_NETWORK == mTimeSource;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mTimeSource);
        return data;
    }

}
