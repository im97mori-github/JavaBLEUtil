package org.im97mori.ble.characteristic.u2b36;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * Blood Pressure Record packet (Characteristics UUID: 0x2B36)
 */
public class BloodPressureRecordPacket implements ByteArrayInterface {

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
	 * Segmentation Header
	 */
	private final int mSegmentationHeader;

	/**
	 * Sequence Number
	 */
	private final int mSequenceNumber;
	
	/**
	 * UUID
	 */
	private final int mUuid;
	
	/**
	 * Recorded Characteristic with E2E-CRC
	 */
	private final byte[] mRecordedCharacteristic;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
	public BloodPressureRecordPacket(@NonNull byte[] values) {
		mSegmentationHeader = BLEUtils.createUInt8(values, 0);
		int index = 1;
		if (isSegmentationHeaderFirstSegment()) {
			mSequenceNumber = BLEUtils.createUInt16(values, index);
			index += 2;
			mUuid = BLEUtils.createUInt16(values, 3);
			index += 2;
		} else {
			mSequenceNumber = 0;
			mUuid = 0;
		}
		mRecordedCharacteristic = new byte[values.length - index];
		System.arraycopy(values, index, mRecordedCharacteristic, 0, values.length - index);
    }

	/**
	 * Constructor from parameters
	 * 
	 * @param segmentationHeader     Segmentation Header
	 * @param sequenceNumber         Sequence Number
	 * @param uuid                   UUID
	 * @param recordedCharacteristic Recorded Characteristic
	 * @param crc                    E2E-CRC
	 */
	public BloodPressureRecordPacket(int segmentationHeader
			, int sequenceNumber
			, int uuid
			, @NonNull byte[] recordedCharacteristic
			, @Nullable byte[] crc) {
		mSegmentationHeader = segmentationHeader;
		mSequenceNumber = sequenceNumber;
		mUuid = uuid;
		if (crc == null || crc.length == 0) {
			mRecordedCharacteristic = recordedCharacteristic;
		} else {
			mRecordedCharacteristic = new byte[recordedCharacteristic.length + crc.length];
			System.arraycopy(recordedCharacteristic, 0, mRecordedCharacteristic, 0, recordedCharacteristic.length);
			System.arraycopy(crc, 0, mRecordedCharacteristic, recordedCharacteristic.length, crc.length);
		}
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
	 * @return Sequence Number
	 */
	public int getSequenceNumber() {
		return mSequenceNumber;
	}

	/**
	 * @return UUID
	 */
	public int getUuid() {
		return mUuid;
	}

	/**
	 * @return Recorded Characteristic with E2E-CRC
	 */
	public byte[] getRecordedCharacteristicWithCrc() {
		return mRecordedCharacteristic;
	}

	/**
	 * @return Recorded Characteristic with no E2E-CRC
	 */
	public byte[] getRecordedCharacteristicWithNoCrc() {
		return Arrays.copyOfRange(mRecordedCharacteristic, 0, mRecordedCharacteristic.length - 2);
	}

	/**
	 * @return E2E-CRC
	 */
	public byte[] getCrc() {
		return Arrays.copyOfRange(mRecordedCharacteristic, mRecordedCharacteristic.length - 2, mRecordedCharacteristic.length);
	}

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[1 + mRecordedCharacteristic.length + (isSegmentationHeaderFirstSegment() ? 4 : 0)];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mSegmentationHeader);
        if (isSegmentationHeaderFirstSegment()) {
            byteBuffer.putShort((short) mSequenceNumber);
            byteBuffer.putShort((short) mUuid);
        }
        byteBuffer.put(mRecordedCharacteristic);
        return data;
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

}
