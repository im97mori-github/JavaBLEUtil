package org.im97mori.ble.characteristic.u2a4a;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * HID Information (Characteristics UUID: 0x2A4A)
 */
public class HIDInformation implements ByteArrayInterface {

    /**
     * @see #FLAGS_REMOTE_WAKE_FALSE
     * @see #FLAGS_REMOTE_WAKE_TRUE
     */
    public static final int FLAGS_REMOTE_WAKE_MASK = 0b00000001;

    /**
     * 0: RemoteWake False
     */
    public static final int FLAGS_REMOTE_WAKE_FALSE = 0b00000000;

    /**
     * 1: RemoteWake True
     */
    public static final int FLAGS_REMOTE_WAKE_TRUE = 0b00000001;

    /**
     * @see #FLAGS_NORMALLY_CONNECTABLE_FALSE
     * @see #FLAGS_NORMALLY_CONNECTABLE_TRUE
     */
    public static final int FLAGS_NORMALLY_CONNECTABLE_MASK = 0b00000010;

    /**
     * 0: NormallyConnectable False
     */
    public static final int FLAGS_NORMALLY_CONNECTABLE_FALSE = 0b00000000;

    /**
     * 1: NormallyConnectable True
     */
    public static final int FLAGS_NORMALLY_CONNECTABLE_TRUE = 0b00000010;

    /**
     * bcdHID
     */
    private final int mBcdhid;

    /**
     * bCountryCode
     */
    private final int mBcountrycode;

    /**
     * Flags
     */
    private final int mFlags;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A4A
     */
    public HIDInformation(@NonNull byte[] values) {
        mBcdhid = BLEUtils.createUInt16(values, 0);
        mBcountrycode = values[2];
        mFlags = values[3];
    }

    /**
     * Constructor from parameters
     * 
     * @param bcdhid       bcdHID
     * @param bcountrycode bCountryCode
     * @param flags        Flags
     */
    public HIDInformation(int bcdhid, int bcountrycode, int flags) {
        mBcdhid = bcdhid;
        mBcountrycode = bcountrycode;
        mFlags = flags;
    }

    /**
     * @return bcdHID
     */
    public int getBcdhid() {
        return mBcdhid;
    }

    /**
     * @return bCountryCode
     */
    public int getBcountrycode() {
        return mBcountrycode;
    }

    /**
     * @return Flags
     */
    public int getFlags() {
        return mFlags;
    }

    /**
     * @return {@code true}:RemoteWake False, {@code false}:RemoteWake True
     */
    public boolean isFlagsRemoteWakeFalse() {
        return isFlagsMatched(FLAGS_REMOTE_WAKE_MASK, FLAGS_REMOTE_WAKE_FALSE);
    }

    /**
     * @return {@code true}:RemoteWake True, {@code false}:RemoteWake False
     */
    public boolean isFlagsRemoteWakeTrue() {
        return isFlagsMatched(FLAGS_REMOTE_WAKE_MASK, FLAGS_REMOTE_WAKE_TRUE);
    }

    /**
     * @return {@code true}:NormallyConnectable False, {@code false}:NormallyConnectable True
     */
    public boolean isFlagsNormallyConnectableFalse() {
        return isFlagsMatched(FLAGS_NORMALLY_CONNECTABLE_MASK, FLAGS_NORMALLY_CONNECTABLE_FALSE);
    }

    /**
     * @return {@code true}:NormallyConnectable True, {@code false}:NormallyConnectable False
     */
    public boolean isFlagsNormallyConnectableTrue() {
        return isFlagsMatched(FLAGS_NORMALLY_CONNECTABLE_MASK, FLAGS_NORMALLY_CONNECTABLE_TRUE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[4];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mBcdhid);
        byteBuffer.put((byte) mBcountrycode);
        byteBuffer.put((byte) mFlags);
        return data;
    }

    /**
     * check Flags
     *
     * @param mask   bitmask for expect
     * @param expect one of {@link #FLAGS_REMOTE_WAKE_FALSE} , {@link #FLAGS_REMOTE_WAKE_TRUE} , {@link #FLAGS_NORMALLY_CONNECTABLE_FALSE} , {@link #FLAGS_NORMALLY_CONNECTABLE_TRUE}
     * @return {@code true}:same as expect, {@code false}:not match
     */
    private boolean isFlagsMatched(int mask, int expect) {
        return (mask & mFlags) == expect;
    }

}
