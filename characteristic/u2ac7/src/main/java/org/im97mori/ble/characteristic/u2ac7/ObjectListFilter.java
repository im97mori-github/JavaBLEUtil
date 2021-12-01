package org.im97mori.ble.characteristic.u2ac7;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * object list filter (Characteristics UUID: 0x2AC7)
 */
public class ObjectListFilter implements ByteArrayInterface {

	/**
	 * No Filter (everything passes)
	 */
	public static final int FILTER_NO_FILTER = 0x00;

	/**
	 * Name Starts With
	 */
	public static final int FILTER_NAME_STARTS_WITH = 0x01;

	/**
	 * Name Ends With
	 */
	public static final int FILTER_NAME_ENDS_WITH = 0x02;

	/**
	 * Name Contains
	 */
	public static final int FILTER_NAME_CONTAINS = 0x03;

	/**
	 * Name is Exactly
	 */
	public static final int FILTER_NAME_IS_EXACTLY = 0x04;

	/**
	 * Object Type (UUID)
	 */
	public static final int FILTER_OBJECT_TYPE = 0x05;

	/**
	 * Created between (inclusive): timestamp1 &lt;= t &lt;= timestamp2
	 */
	public static final int FILTER_CREATED_BETWEEN = 0x06;

	/**
	 * Modified between (inclusive): timestamp1 &lt;= t &lt;= timestamp2
	 */
	public static final int FILTER_MODIFIED_BETWEEN = 0x07;

	/**
	 * Current Size between (inclusive): size1 &lt;= s &lt;= size2
	 */
	public static final int FILTER_CURRENT_SIZE_BETWEEN = 0x08;

	/**
	 * Allocated Size between (inclusive): size1 &lt;= s &lt;= size2
	 */
	public static final int FILTER_ALLOCATED_SIZE_BETWEEN = 0x09;

	/**
	 * Marked Objects
	 */
	public static final int FILTER_MARKED_OBJECTS = 0x0a;

	/**
	 * Filter
	 */
	private final int mFilter;

	/**
	 * Name
	 */
	private final String mName;

	/**
	 * Object Type
	 */
	private final byte[] mObjectType;

	/**
	 * timestamp1 Year
	 */
	private final int mYear1;

	/**
	 * timestamp1 Month
	 */
	private final int mMonth1;

	/**
	 * timestamp1 Day
	 */
	private final int mDay1;

	/**
	 * timestamp1 Hours
	 */
	private final int mHours1;

	/**
	 * timestamp1 Minutes
	 */
	private final int mMinutes1;

	/**
	 * timestamp1 Seconds
	 */
	private final int mSeconds1;

	/**
	 * timestamp2 Year
	 */
	private final int mYear2;

	/**
	 * timestamp2 Month
	 */
	private final int mMonth2;

	/**
	 * timestamp2 Day
	 */
	private final int mDay2;

	/**
	 * timestamp2 Hours
	 */
	private final int mHours2;

	/**
	 * timestamp2 Minutes
	 */
	private final int mMinutes2;

	/**
	 * timestamp2 Seconds
	 */
	private final int mSeconds2;

	/*
	 * size1
	 */
	private final long mSize1;

	/**
	 * size2
	 */
	private final long mSize2;

	/**
	 * Constructor from byte array
	 *
	 * @param values byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 */
	public ObjectListFilter(@NonNull byte[] values) {
		mFilter = BLEUtils.createUInt8(values, 0);
		if (isFilterNameStartsWith()) {
			mName = new String(values, 1, values.length - 1);
			mObjectType = new byte[0];
			mYear1 = 0;
			mMonth1 = 0;
			mDay1 = 0;
			mHours1 = 0;
			mMinutes1 = 0;
			mSeconds1 = 0;
			mYear2 = 0;
			mMonth2 = 0;
			mDay2 = 0;
			mHours2 = 0;
			mMinutes2 = 0;
			mSeconds2 = 0;
			mSize1 = 0;
			mSize2 = 0;
		} else if (isFilterNameEndsWith()) {
			mName = new String(values, 1, values.length - 1);
			mObjectType = new byte[0];
			mYear1 = 0;
			mMonth1 = 0;
			mDay1 = 0;
			mHours1 = 0;
			mMinutes1 = 0;
			mSeconds1 = 0;
			mYear2 = 0;
			mMonth2 = 0;
			mDay2 = 0;
			mHours2 = 0;
			mMinutes2 = 0;
			mSeconds2 = 0;
			mSize1 = 0;
			mSize2 = 0;
		} else if (isFilterNameContains()) {
			mName = new String(values, 1, values.length - 1);
			mObjectType = new byte[0];
			mYear1 = 0;
			mMonth1 = 0;
			mDay1 = 0;
			mHours1 = 0;
			mMinutes1 = 0;
			mSeconds1 = 0;
			mYear2 = 0;
			mMonth2 = 0;
			mDay2 = 0;
			mHours2 = 0;
			mMinutes2 = 0;
			mSeconds2 = 0;
			mSize1 = 0;
			mSize2 = 0;
		} else if (isFilterNameIsExactly()) {
			mName = new String(values, 1, values.length - 1);
			mObjectType = new byte[0];
			mYear1 = 0;
			mMonth1 = 0;
			mDay1 = 0;
			mHours1 = 0;
			mMinutes1 = 0;
			mSeconds1 = 0;
			mYear2 = 0;
			mMonth2 = 0;
			mDay2 = 0;
			mHours2 = 0;
			mMinutes2 = 0;
			mSeconds2 = 0;
			mSize1 = 0;
			mSize2 = 0;
		} else if (isFilterObjectType()) {
			mName = "";
			mObjectType = Arrays.copyOfRange(values, 1, values.length);
			mYear1 = 0;
			mMonth1 = 0;
			mDay1 = 0;
			mHours1 = 0;
			mMinutes1 = 0;
			mSeconds1 = 0;
			mYear2 = 0;
			mMonth2 = 0;
			mDay2 = 0;
			mHours2 = 0;
			mMinutes2 = 0;
			mSeconds2 = 0;
			mSize1 = 0;
			mSize2 = 0;
		} else if (isFilterCreatedBetween()) {
			mName = "";
			mObjectType = new byte[0];
			mYear1 = BLEUtils.createUInt16(values, 1);
			mMonth1 = BLEUtils.createUInt8(values, 3);
			mDay1 = BLEUtils.createUInt8(values, 4);
			mHours1 = BLEUtils.createUInt8(values, 5);
			mMinutes1 = BLEUtils.createUInt8(values, 6);
			mSeconds1 = BLEUtils.createUInt8(values, 7);
			mYear2 = BLEUtils.createUInt16(values, 8);
			mMonth2 = BLEUtils.createUInt8(values, 10);
			mDay2 = BLEUtils.createUInt8(values, 11);
			mHours2 = BLEUtils.createUInt8(values, 12);
			mMinutes2 = BLEUtils.createUInt8(values, 13);
			mSeconds2 = BLEUtils.createUInt8(values, 14);
			mSize1 = 0;
			mSize2 = 0;
		} else if (isFilterModifiedBetween()) {
			mName = "";
			mObjectType = new byte[0];
			mYear1 = BLEUtils.createUInt16(values, 1);
			mMonth1 = BLEUtils.createUInt8(values, 3);
			mDay1 = BLEUtils.createUInt8(values, 4);
			mHours1 = BLEUtils.createUInt8(values, 5);
			mMinutes1 = BLEUtils.createUInt8(values, 6);
			mSeconds1 = BLEUtils.createUInt8(values, 7);
			mYear2 = BLEUtils.createUInt16(values, 8);
			mMonth2 = BLEUtils.createUInt8(values, 10);
			mDay2 = BLEUtils.createUInt8(values, 11);
			mHours2 = BLEUtils.createUInt8(values, 12);
			mMinutes2 = BLEUtils.createUInt8(values, 13);
			mSeconds2 = BLEUtils.createUInt8(values, 14);
			mSize1 = 0;
			mSize2 = 0;
		} else if (isFilterCurrentSizeBetween()) {
			mName = "";
			mObjectType = new byte[0];
			mYear1 = 0;
			mMonth1 = 0;
			mDay1 = 0;
			mHours1 = 0;
			mMinutes1 = 0;
			mSeconds1 = 0;
			mYear2 = 0;
			mMonth2 = 0;
			mDay2 = 0;
			mHours2 = 0;
			mMinutes2 = 0;
			mSeconds2 = 0;
			mSize1 = BLEUtils.createUInt32(values, 1);
			mSize2 = BLEUtils.createUInt32(values, 5);
		} else if (isFilterAllocatedSizeBetween()) {
			mName = "";
			mObjectType = new byte[0];
			mYear1 = 0;
			mMonth1 = 0;
			mDay1 = 0;
			mHours1 = 0;
			mMinutes1 = 0;
			mSeconds1 = 0;
			mYear2 = 0;
			mMonth2 = 0;
			mDay2 = 0;
			mHours2 = 0;
			mMinutes2 = 0;
			mSeconds2 = 0;
			mSize1 = BLEUtils.createUInt32(values, 1);
			mSize2 = BLEUtils.createUInt32(values, 5);
		} else {
			mName = "";
			mObjectType = new byte[0];
			mYear1 = 0;
			mMonth1 = 0;
			mDay1 = 0;
			mHours1 = 0;
			mMinutes1 = 0;
			mSeconds1 = 0;
			mYear2 = 0;
			mMonth2 = 0;
			mDay2 = 0;
			mHours2 = 0;
			mMinutes2 = 0;
			mSeconds2 = 0;
			mSize1 = 0;
			mSize2 = 0;
		}
	}

	/**
	 * Constructor from parameters
	 * 
	 * @param filter     Filter
	 * @param name       Name
	 * @param objectType Object Type
	 * @param year1      timestamp1 Year
	 * @param month1     timestamp1 Month
	 * @param day1       timestamp1 Day
	 * @param hours1     timestamp1 Hours
	 * @param minutes1   timestamp1 Minutes
	 * @param seconds1   timestamp1 Seconds
	 * @param year2      timestamp2 Year
	 * @param month2     timestamp2 Month
	 * @param day2       timestamp2 Day
	 * @param hours2     timestamp2 Hours
	 * @param minutes2   timestamp2 Minutes
	 * @param seconds2   timestamp2 Seconds
	 * @param size1      size1
	 * @param size2      size2
	 */
	public ObjectListFilter(int filter, @NonNull String name, @NonNull byte[] objectType, int year1, int month1,
			int day1, int hours1, int minutes1, int seconds1, int year2, int month2, int day2, int hours2, int minutes2,
			int seconds2, long size1, long size2) {
		mFilter = filter;
		mName = name;
		mObjectType = objectType;
		mYear1 = year1;
		mMonth1 = month1;
		mDay1 = day1;
		mHours1 = hours1;
		mMinutes1 = minutes1;
		mSeconds1 = seconds1;
		mYear2 = year2;
		mMonth2 = month2;
		mDay2 = day2;
		mHours2 = hours2;
		mMinutes2 = minutes2;
		mSeconds2 = seconds2;
		mSize1 = size1;
		mSize2 = size2;
	}

	/**
	 * @return Filter
	 */
	public int getFilter() {
		return mFilter;
	}

	/**
	 * @return {@code true}:No Filter, {@code false}:not No Filter
	 */
	public boolean isFilterNoFilter() {
		return mFilter == FILTER_NO_FILTER;
	}

	/**
	 * @return {@code true}:Name Starts With, {@code false}:not Name Starts With
	 */
	public boolean isFilterNameStartsWith() {
		return mFilter == FILTER_NAME_STARTS_WITH;
	}

	/**
	 * @return {@code true}:Name Ends With, {@code false}:not Name Ends With
	 */
	public boolean isFilterNameEndsWith() {
		return mFilter == FILTER_NAME_ENDS_WITH;
	}

	/**
	 * @return {@code true}:Name Contains, {@code false}:not Name Contains
	 */
	public boolean isFilterNameContains() {
		return mFilter == FILTER_NAME_CONTAINS;
	}

	/**
	 * @return {@code true}:Name is Exactly, {@code false}:not Name is Exactly
	 */
	public boolean isFilterNameIsExactly() {
		return mFilter == FILTER_NAME_IS_EXACTLY;
	}

	/**
	 * @return {@code true}:Object Type, {@code false}:not Object Type
	 */
	public boolean isFilterObjectType() {
		return mFilter == FILTER_OBJECT_TYPE;
	}

	/**
	 * @return {@code true}:Created between, {@code false}:not Created between
	 */
	public boolean isFilterCreatedBetween() {
		return mFilter == FILTER_CREATED_BETWEEN;
	}

	/**
	 * @return {@code true}:Modified between, {@code false}:not Modified between
	 */
	public boolean isFilterModifiedBetween() {
		return mFilter == FILTER_MODIFIED_BETWEEN;
	}

	/**
	 * @return {@code true}:Current Size between, {@code false}:not Current Size
	 *         between
	 */
	public boolean isFilterCurrentSizeBetween() {
		return mFilter == FILTER_CURRENT_SIZE_BETWEEN;
	}

	/**
	 * @return {@code true}:Allocated Size between, {@code false}:not Allocated Size
	 *         between
	 */
	public boolean isFilterAllocatedSizeBetween() {
		return mFilter == FILTER_ALLOCATED_SIZE_BETWEEN;
	}

	/**
	 * @return {@code true}:Marked Objects, {@code false}:not Marked Objects
	 */
	public boolean isFilterMarkedObjects() {
		return mFilter == FILTER_MARKED_OBJECTS;
	}

	/**
	 * @return Name
	 */
	@NonNull
	public String getName() {
		return mName;
	}

	/**
	 * @return Object Type
	 */
	@NonNull
	public byte[] getObjectType() {
		return mObjectType;
	}

	/**
	 * @return timestamp1 Year
	 */
	public int getYear1() {
		return mYear1;
	}

	/**
	 * @return timestamp1 Month
	 */
	public int getMonth1() {
		return mMonth1;
	}

	/**
	 * @return timestamp1 Day
	 */
	public int getDay1() {
		return mDay1;
	}

	/**
	 * @return timestamp1 Hours
	 */
	public int getHours1() {
		return mHours1;
	}

	/**
	 * @return timestamp1 Minutes
	 */
	public int getMinutes1() {
		return mMinutes1;
	}

	/**
	 * @return timestamp1 Seconds
	 */
	public int getSeconds1() {
		return mSeconds1;
	}

	/**
	 * @return timestamp2 Year
	 */
	public int getYear2() {
		return mYear2;
	}

	/**
	 * @return timestamp2 Month
	 */
	public int getMonth2() {
		return mMonth2;
	}

	/**
	 * @return timestamp2 Day
	 */
	public int getDay2() {
		return mDay2;
	}

	/**
	 * @return timestamp2 Hours
	 */
	public int getHours2() {
		return mHours2;
	}

	/**
	 * @return timestamp2 Minutes
	 */
	public int getMinutes2() {
		return mMinutes2;
	}

	/**
	 * @return timestamp2 Seconds
	 */
	public int getSeconds2() {
		return mSeconds2;
	}

	/**
	 * @return size1
	 */
	public long getSize1() {
		return mSize1;
	}

	/**
	 * @return size2
	 */
	public long getSize2() {
		return mSize2;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@NonNull
	public byte[] getBytes() {
		int length = 1;
		byte[] nameBytes = mName.getBytes();
		byte[] data = new byte[1 + nameBytes.length + mObjectType.length + 14];
		ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
		byteBuffer.put((byte) mFilter);
		if (isFilterNameStartsWith()) {
			byteBuffer.put(mName.getBytes());
			length += nameBytes.length;
		} else if (isFilterNameEndsWith()) {
			byteBuffer.put(mName.getBytes());
			length += nameBytes.length;
		} else if (isFilterNameContains()) {
			byteBuffer.put(mName.getBytes());
			length += nameBytes.length;
		} else if (isFilterNameIsExactly()) {
			byteBuffer.put(mName.getBytes());
			length += nameBytes.length;
		} else if (isFilterObjectType()) {
			byteBuffer.put(mObjectType);
			length += mObjectType.length;
		} else if (isFilterCreatedBetween()) {
			byteBuffer.putShort((short) mYear1);
			byteBuffer.put((byte) mMonth1);
			byteBuffer.put((byte) mDay1);
			byteBuffer.put((byte) mHours1);
			byteBuffer.put((byte) mMinutes1);
			byteBuffer.put((byte) mSeconds1);
			byteBuffer.putShort((short) mYear2);
			byteBuffer.put((byte) mMonth2);
			byteBuffer.put((byte) mDay2);
			byteBuffer.put((byte) mHours2);
			byteBuffer.put((byte) mMinutes2);
			byteBuffer.put((byte) mSeconds2);
			length += 14;
		} else if (isFilterModifiedBetween()) {
			byteBuffer.putShort((short) mYear1);
			byteBuffer.put((byte) mMonth1);
			byteBuffer.put((byte) mDay1);
			byteBuffer.put((byte) mHours1);
			byteBuffer.put((byte) mMinutes1);
			byteBuffer.put((byte) mSeconds1);
			byteBuffer.putShort((short) mYear2);
			byteBuffer.put((byte) mMonth2);
			byteBuffer.put((byte) mDay2);
			byteBuffer.put((byte) mHours2);
			byteBuffer.put((byte) mMinutes2);
			byteBuffer.put((byte) mSeconds2);
			length += 14;
		} else if (isFilterCurrentSizeBetween()) {
			byteBuffer.putInt((int) mSize1);
			byteBuffer.putInt((int) mSize2);
			length += 8;
		} else if (isFilterAllocatedSizeBetween()) {
			byteBuffer.putInt((int) mSize1);
			byteBuffer.putInt((int) mSize2);
			length += 8;
		}
		return Arrays.copyOfRange(data, 0, length);
	}

}
