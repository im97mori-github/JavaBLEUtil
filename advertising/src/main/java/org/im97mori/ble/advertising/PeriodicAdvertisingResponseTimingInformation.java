package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.PERIODIC_ADVERTISING_RESPONSE_TIMING_INFORMATION_DATA_TYPE;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.im97mori.ble.BLEUtils;

import androidx.annotation.NonNull;

/**
 * <p>
 * Periodic Advertising Response Timing Information
 * <p>
 * https://www.bluetooth.com/specifications/assigned-numbers/generic-access-profile/
 * </p>
 */
public class PeriodicAdvertisingResponseTimingInformation extends AbstractAdvertisingData {

    /**
     * Core Specification Supplement v11 Part A 1.24.2 Unit of subeventInterval
     * Interval(millis)
     */
    public static final double SUBEVENT_INTERVAL_UNIT_MILLIS = 1.25d;

    /**
     * Core Specification Supplement v11 Part A 1.24.2 Unit of responseSlotDelay
     * Interval(millis)
     */
    public static final double RESPONSE_SLOT_DELAY_UNIT_MILLIS = 1.25d;

    /**
     * Core Specification Supplement v11 Part A 1.24.2 Unit of responseSlotSpacing
     * Interval(millis)
     */
    public static final double RESPONSE_SLOT_SPACING_UNIT_MILLIS = 0.125d;

    /**
     * RspAA
     */
    private final byte[] mRspAa;

    /**
     * numSubevents
     */
    private final int mNumSubevents;

    /**
     * subeventInterval
     */
    private final int mSubeventInterval;

    /**
     * responseSlotDelay
     */
    private final int mResponseSlotDelay;

    /**
     * responseSlotSpacing
     */
    private final int mResponseSlotSpacing;

    /**
     * @param data
     *            byte array from <a href=
     *            "https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
     * @param offset
     *            data offset
     * @see #PeriodicAdvertisingResponseTimingInformation(byte[], int, int)
     */
    public PeriodicAdvertisingResponseTimingInformation(@NonNull byte[] data, int offset) {
        this(data, offset, data[offset]);
    }

    /**
     * Constructor for EncryptedData
     *
     * @param data
     *            byte array from <a href=
     *            "https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
     * @param offset
     *            data offset
     * @param length
     *            1st octet of Advertising Data
     */
    public PeriodicAdvertisingResponseTimingInformation(@NonNull byte[] data, int offset, int length) {
        super(length);

        mRspAa = Arrays.copyOfRange(data, 2, 6);
        mNumSubevents = BLEUtils.createUInt8(data, 6);
        mSubeventInterval = BLEUtils.createUInt8(data, 7);
        mResponseSlotDelay = BLEUtils.createUInt8(data, 8);
        mResponseSlotSpacing = BLEUtils.createUInt8(data, 9);
    }

    /**
     * Constructor from parameters
     * 
     * @param rspAa
     *            RspAA
     * @param numSubevents
     *            numSubevents
     * @param subeventInterval
     *            subeventInterval
     * @param responseSlotDelay
     *            responseSlotDelay
     * @param responseSlotSpacing
     *            responseSlotSpacing
     */
    public PeriodicAdvertisingResponseTimingInformation(byte[] rspAa, int numSubevents, int subeventInterval,
            int responseSlotDelay, int responseSlotSpacing) {
        super(9);

        // 7 octets are defined, but in reality 8 octets
        mRspAa = rspAa;
        mNumSubevents = numSubevents;
        mSubeventInterval = subeventInterval;
        mResponseSlotDelay = responseSlotDelay;
        mResponseSlotSpacing = responseSlotSpacing;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getDataType() {
        return PERIODIC_ADVERTISING_RESPONSE_TIMING_INFORMATION_DATA_TYPE;
    }

    /**
     * @return RspAA
     */
    public byte[] getRspAa() {
        return mRspAa;
    }

    /**
     * @return numSubevents
     */
    public int getNumSubevents() {
        return mNumSubevents;
    }

    /**
     * @return subeventInterval
     */
    public int getSubeventInterval() {
        return mSubeventInterval;
    }

    /**
     * @return subeventInterval
     */
    public double getSubeventIntervalMillis() {
        return mSubeventInterval * SUBEVENT_INTERVAL_UNIT_MILLIS;
    }

    /**
     * @return responseSlotDelay
     */
    public int getResponseSlotDelay() {
        return mResponseSlotDelay;
    }

    /**
     * @return subeventInterval
     */
    public double getResponseSlotDelayMillis() {
        return mResponseSlotDelay * RESPONSE_SLOT_DELAY_UNIT_MILLIS;
    }

    /**
     * @return responseSlotSpacing
     */
    public int getResponseSlotSpacing() {
        return mResponseSlotSpacing;
    }

    /**
     * @return responseSlotSpacing
     */
    public double getResponseSlotSpacingMillis() {
        return mResponseSlotSpacing * RESPONSE_SLOT_SPACING_UNIT_MILLIS;
    }

    /**
     * {@inheritDoc}
     */
    @NonNull
    @Override
    public byte[] getBytes() {
        byte[] data = new byte[1 + getLength()];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) getLength());
        byteBuffer.put((byte) getDataType());
        byteBuffer.put(mRspAa);
        byteBuffer.put((byte) mNumSubevents);
        byteBuffer.put((byte) mSubeventInterval);
        byteBuffer.put((byte) mResponseSlotDelay);
        byteBuffer.put((byte) mResponseSlotSpacing);
        return data;
    }
}
