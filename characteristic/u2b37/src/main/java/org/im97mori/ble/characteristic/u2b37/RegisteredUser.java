package org.im97mori.ble.characteristic.u2b37;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * User data for multiple packet characteristic (Characteristics UUID: 0x2B37)
 */
public class RegisteredUser implements ByteArrayInterface {

    /**
     * @see #SEGMENTATION_HEADER_FIRST_SEGMENT_FALSE
     * @see #SEGMENTATION_HEADER_FIRST_SEGMENT_TRUE
     */
    public static final int SEGMENTATION_HEADER_FIRST_SEGMENT_MASK = 0b00000001;

    /**
     * 0: not First Segment
     */
    public static final int SEGMENTATION_HEADER_FIRST_SEGMENT_FALSE = 0b00000000;

    /**
     * 1: First Segment
     */
    public static final int SEGMENTATION_HEADER_FIRST_SEGMENT_TRUE = 0b00000001;

    /**
     * @see #SEGMENTATION_HEADER_LAST_SEGMENT_FALSE
     * @see #SEGMENTATION_HEADER_LAST_SEGMENT_TRUE
     */
    public static final int SEGMENTATION_HEADER_LAST_SEGMENT_MASK = 0b00000010;

    /**
     * 0: not Last Segment
     */
    public static final int SEGMENTATION_HEADER_LAST_SEGMENT_FALSE = 0b00000000;

    /**
     * 1: Last Segment
     */
    public static final int SEGMENTATION_HEADER_LAST_SEGMENT_TRUE = 0b00000010;

    /**
     * @see #FLAGS_REGISTERED_USER_NAME_PRESENT_FALSE
     * @see #FLAGS_REGISTERED_USER_NAME_PRESENT_TRUE
     */
    public static final int FLAGS_REGISTERED_USER_NAME_PRESENT_MASK = 0b00000001;

    /**
     * 0: Registered User Name present False
     */
    public static final int FLAGS_REGISTERED_USER_NAME_PRESENT_FALSE = 0b00000000;

    /**
     * 1: Registered User Name present True
     */
    public static final int FLAGS_REGISTERED_USER_NAME_PRESENT_TRUE = 0b00000001;

    /**
     * @see #FLAGS_USER_NAME_TRUNCATED_FALSE
     * @see #FLAGS_USER_NAME_TRUNCATED_TRUE
     */
    public static final int FLAGS_USER_NAME_TRUNCATED_MASK = 0b00000010;

    /**
     * 0: User Name is truncated False
     */
    public static final int FLAGS_USER_NAME_TRUNCATED_FALSE = 0b00000000;

    /**
     * 1: User Name is truncated True
     */
    public static final int FLAGS_USER_NAME_TRUNCATED_TRUE = 0b00000010;

    /**
     * Segmentation Header
     */
    private final int mSegmentationHeader;

    /**
     * Flags
     */
    private final int mFlags;

    /**
     * Registered User Index
     */
    private final int mRegisteredUserIndex;

    /**
     * Registered User Data
     */
    private final byte[] mRegisteredUserData;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>, 0x2A8A, 0x2A90
     */
    public RegisteredUser(@NonNull byte[] values) {
        mSegmentationHeader = BLEUtils.createUInt8(values, 0);
        if (isSegmentationHeaderFirstSegment()) {
            mFlags = BLEUtils.createUInt8(values, 1);
            mRegisteredUserIndex = BLEUtils.createUInt8(values, 2);
            mRegisteredUserData = Arrays.copyOfRange(values, 3, values.length);
        } else {
            mFlags = 0;
            mRegisteredUserIndex = 0;
            mRegisteredUserData = Arrays.copyOfRange(values, 1, values.length);
        }
    }

    /**
     * Constructor from parameters
     * 
     * @param segmentationHeader  Segmentation Header
     * @param flags               Flags
     * @param registeredUserIndex Registered User Index
     * @param registeredUserData  Registered User Data
     */
    public RegisteredUser(int segmentationHeader, int flags, int registeredUserIndex, @NonNull byte[] registeredUserData) {
        mSegmentationHeader = segmentationHeader;
        mFlags = flags;
        mRegisteredUserIndex = registeredUserIndex;
        mRegisteredUserData = registeredUserData;
    }

    /**
     * @return Segmentation Header
     */
    public int getSegmentationHeader() {
        return mSegmentationHeader;
    }

    /**
     * @return {@code true}:not First Segment, {@code false}:First Segment
     */
    public boolean isSegmentationHeaderNotFirstSegment() {
        return isSegmentationHeaderMatched(SEGMENTATION_HEADER_FIRST_SEGMENT_MASK, SEGMENTATION_HEADER_FIRST_SEGMENT_FALSE);
    }

    /**
     * @return {@code true}:First Segment, {@code false}:not First Segment
     */
    public boolean isSegmentationHeaderFirstSegment() {
        return isSegmentationHeaderMatched(SEGMENTATION_HEADER_FIRST_SEGMENT_MASK, SEGMENTATION_HEADER_FIRST_SEGMENT_TRUE);
    }

    /**
     * @return {@code true}:not Last Segment, {@code false}:Last Segment
     */
    public boolean isSegmentationHeaderNotLastSegment() {
        return isSegmentationHeaderMatched(SEGMENTATION_HEADER_LAST_SEGMENT_MASK, SEGMENTATION_HEADER_LAST_SEGMENT_FALSE);
    }

    /**
     * @return {@code true}:Last Segment, {@code false}:not Last Segment
     */
    public boolean isSegmentationHeaderLastSegment() {
        return isSegmentationHeaderMatched(SEGMENTATION_HEADER_LAST_SEGMENT_MASK, SEGMENTATION_HEADER_LAST_SEGMENT_TRUE);
    }

    /**
     * @return Rolling Segment Number (0 to 63)
     */
    public int getSegmentationHeaderRollingSegmentNumber() {
        return (mSegmentationHeader >> 2) & 0b00111111;
    }

    /**
     * @return Flags
     */
    public int getFlags() {
        return mFlags;
    }

    /**
     * @return {@code true}:Registered User Name not present, {@code false}:Registered User Name present
     */
    public boolean isFlagsRegisteredUserNameNotPresent() {
        return isFlagsMatched(FLAGS_REGISTERED_USER_NAME_PRESENT_MASK, FLAGS_REGISTERED_USER_NAME_PRESENT_FALSE);
    }

    /**
     * @return {@code true}:Registered User Name present, {@code false}:Registered User Name not present
     */
    public boolean isFlagsRegisteredUserNamePresent() {
        return isFlagsMatched(FLAGS_REGISTERED_USER_NAME_PRESENT_MASK, FLAGS_REGISTERED_USER_NAME_PRESENT_TRUE);
    }

    /**
     * @return {@code true}:User Name is not truncated, {@code false}:User Name is truncated
     */
    public boolean isFlagsUserNameNotTruncated() {
        return isFlagsMatched(FLAGS_USER_NAME_TRUNCATED_MASK, FLAGS_USER_NAME_TRUNCATED_FALSE);
    }

    /**
     * @return {@code true}:User Name is truncated, {@code false}:User Name is not truncated
     */
    public boolean isFlagsUserNameTruncated() {
        return isFlagsMatched(FLAGS_USER_NAME_TRUNCATED_MASK, FLAGS_USER_NAME_TRUNCATED_TRUE);
    }

    /**
     * @return Registered User Index
     */
    public int getRegisteredUserIndex() {
        return mRegisteredUserIndex;
    }

    /**
     * @return Registered User Data
     */
    public byte[] getRegisteredUserData() {
        return mRegisteredUserData;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        int length = 0;
        byte[] data = new byte[3 + mRegisteredUserData.length];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mSegmentationHeader);
        length++;
        if (isSegmentationHeaderFirstSegment()) {
            byteBuffer.put((byte) mFlags);
            byteBuffer.put((byte) mRegisteredUserIndex);
            length += 2;
        }
        byteBuffer.put(mRegisteredUserData, 0, mRegisteredUserData.length);
        length += mRegisteredUserData.length;
        return Arrays.copyOfRange(data, 0, length);
    }

    /**
     * check Segmentation Header
     *
     * @param mask   bitmask for expect
     * @param expect one of {@link #SEGMENTATION_HEADER_FIRST_SEGMENT_FALSE} , {@link #SEGMENTATION_HEADER_FIRST_SEGMENT_TRUE} , {@link #SEGMENTATION_HEADER_LAST_SEGMENT_FALSE} , {@link #SEGMENTATION_HEADER_LAST_SEGMENT_TRUE}
     * @return {@code true}:same as expect, {@code false}:not match
     */
    private boolean isSegmentationHeaderMatched(int mask, int expect) {
        return (mask & mSegmentationHeader) == expect;
    }

    /**
     * check Flags
     *
     * @param mask   bitmask for expect
     * @param expect one of {@link #FLAGS_REGISTERED_USER_NAME_PRESENT_FALSE} , {@link #FLAGS_REGISTERED_USER_NAME_PRESENT_TRUE} , {@link #FLAGS_USER_NAME_TRUNCATED_FALSE} , {@link #FLAGS_USER_NAME_TRUNCATED_TRUE}
     * @return {@code true}:same as expect, {@code false}:not match
     */
    private boolean isFlagsMatched(int mask, int expect) {
        return (mask & mFlags) == expect;
    }

}
