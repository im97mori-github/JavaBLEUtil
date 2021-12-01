package org.im97mori.ble.characteristic.u2ac4;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * object properties (Characteristics UUID: 0x2AC4)
 */
public class ObjectProperties implements ByteArrayInterface {

	/**
	 * @see #OBJECT_PROPERTIES_DELETE_FALSE
	 * @see #OBJECT_PROPERTIES_DELETE_TRUE
	 */
	public static final int OBJECT_PROPERTIES_DELETE_MASK = 0b00000000_00000000_00000000_00000001;

	/**
	 * 0: Deletion of this object is permitted: False
	 */
	public static final int OBJECT_PROPERTIES_DELETE_FALSE = 0b00000000_00000000_00000000_00000000;

	/**
	 * 1: Deletion of this object is permitted: True
	 */
	public static final int OBJECT_PROPERTIES_DELETE_TRUE = 0b00000000_00000000_00000000_00000001;

	/**
	 * @see #OBJECT_PROPERTIES_EXECUTE_FALSE
	 * @see #OBJECT_PROPERTIES_EXECUTE_TRUE
	 */
	public static final int OBJECT_PROPERTIES_EXECUTE_MASK = 0b00000000_00000000_00000000_00000010;

	/**
	 * 0: Execution of this object is permitted: False
	 */
	public static final int OBJECT_PROPERTIES_EXECUTE_FALSE = 0b00000000_00000000_00000000_00000000;

	/**
	 * 1: Execution of this object is permitted: True
	 */
	public static final int OBJECT_PROPERTIES_EXECUTE_TRUE = 0b00000000_00000000_00000000_00000010;

	/**
	 * @see #OBJECT_PROPERTIES_READ_FALSE
	 * @see #OBJECT_PROPERTIES_READ_TRUE
	 */
	public static final int OBJECT_PROPERTIES_READ_MASK = 0b00000000_00000000_00000000_00000100;

	/**
	 * 0: Read of this object is permitted: False
	 */
	public static final int OBJECT_PROPERTIES_READ_FALSE = 0b00000000_00000000_00000000_00000000;

	/**
	 * 1: Read of this object is permitted: True
	 */
	public static final int OBJECT_PROPERTIES_READ_TRUE = 0b00000000_00000000_00000000_00000100;

	/**
	 * @see #OBJECT_PROPERTIES_WRITE_FALSE
	 * @see #OBJECT_PROPERTIES_WRITE_TRUE
	 */
	public static final int OBJECT_PROPERTIES_WRITE_MASK = 0b00000000_00000000_00000000_00001000;

	/**
	 * 0: Writing data to this object is permitted:: False
	 */
	public static final int OBJECT_PROPERTIES_WRITE_FALSE = 0b00000000_00000000_00000000_00000000;

	/**
	 * 1: Writing data to this object is permitted:: True
	 */
	public static final int OBJECT_PROPERTIES_WRITE_TRUE = 0b00000000_00000000_00000000_00001000;

	/**
	 * @see #OBJECT_PROPERTIES_APPEND_FALSE
	 * @see #OBJECT_PROPERTIES_APPEND_TRUE
	 */
	public static final int OBJECT_PROPERTIES_APPEND_MASK = 0b00000000_00000000_00000000_00010000;

	/**
	 * 0: Appending data to this object that increases its Allocated Size is
	 * permitted: False
	 */
	public static final int OBJECT_PROPERTIES_APPEND_FALSE = 0b00000000_00000000_00000000_00000000;

	/**
	 * 1: Appending data to this object that increases its Allocated Size is
	 * permitted: True
	 */
	public static final int OBJECT_PROPERTIES_APPEND_TRUE = 0b00000000_00000000_00000000_00010000;

	/**
	 * @see #OBJECT_PROPERTIES_TRUNCATE_FALSE
	 * @see #OBJECT_PROPERTIES_TRUNCATE_TRUE
	 */
	public static final int OBJECT_PROPERTIES_TRUNCATE_MASK = 0b00000000_00000000_00000000_00100000;

	/**
	 * 0: Truncation of this object is permitted: False
	 */
	public static final int OBJECT_PROPERTIES_TRUNCATE_FALSE = 0b00000000_00000000_00000000_00000000;

	/**
	 * 1: Truncation of this object is permitted: True
	 */
	public static final int OBJECT_PROPERTIES_TRUNCATE_TRUE = 0b00000000_00000000_00000000_00100000;

	/**
	 * @see #OBJECT_PROPERTIES_PATCH_FALSE
	 * @see #OBJECT_PROPERTIES_PATCH_TRUE
	 */
	public static final int OBJECT_PROPERTIES_PATCH_MASK = 0b00000000_00000000_00000000_01000000;

	/**
	 * 0: Patching this object by overwriting some of the object’s existing contents
	 * is permitted: False
	 */
	public static final int OBJECT_PROPERTIES_PATCH_FALSE = 0b00000000_00000000_00000000_00000000;

	/**
	 * 1: Patching this object by overwriting some of the object’s existing contents
	 * is permitted: True
	 */
	public static final int OBJECT_PROPERTIES_PATCH_TRUE = 0b00000000_00000000_00000000_01000000;

	/**
	 * @see #OBJECT_PROPERTIES_MARK_FALSE
	 * @see #OBJECT_PROPERTIES_MARK_TRUE
	 */
	public static final int OBJECT_PROPERTIES_MARK_MASK = 0b00000000_00000000_00000000_10000000;

	/**
	 * 0: This object is a marked object: False
	 */
	public static final int OBJECT_PROPERTIES_MARK_FALSE = 0b00000000_00000000_00000000_00000000;

	/**
	 * 1: This object is a marked object: True
	 */
	public static final int OBJECT_PROPERTIES_MARK_TRUE = 0b00000000_00000000_00000000_10000000;

	/**
	 * Object Properties
	 */
	private final byte[] mObjectProperties;

	/**
	 * Constructor from byte array
	 *
	 * @param values byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 */
	public ObjectProperties(@NonNull byte[] values) {
		mObjectProperties = Arrays.copyOfRange(values, 0, 4);
	}

	/**
	 * Constructor from flags
	 * 
	 * @param isObjectPropertiesDeletePermitted   {@code true}:{@link #OBJECT_PROPERTIES_DELETE_TRUE},
	 *                                            {@code false}:{@link #OBJECT_PROPERTIES_DELETE_FALSE}
	 * @param isObjectPropertiesExecutePermitted  {@code true}:{@link #OBJECT_PROPERTIES_EXECUTE_TRUE},
	 *                                            {@code false}:{@link #OBJECT_PROPERTIES_EXECUTE_FALSE}
	 * @param isObjectPropertiesReadPermitted     {@code true}:{@link #OBJECT_PROPERTIES_READ_TRUE},
	 *                                            {@code false}:{@link #OBJECT_PROPERTIES_READ_FALSE}
	 * @param isObjectPropertiesWritePermitted    {@code true}:{@link #OBJECT_PROPERTIES_WRITE_TRUE},
	 *                                            {@code false}:{@link #OBJECT_PROPERTIES_WRITE_FALSE}
	 * @param isObjectPropertiesAppendPermitted   {@code true}:{@link #OBJECT_PROPERTIES_APPEND_TRUE},
	 *                                            {@code false}:{@link #OBJECT_PROPERTIES_APPEND_FALSE}
	 * @param isObjectPropertiesTruncatePermitted {@code true}:{@link #OBJECT_PROPERTIES_TRUNCATE_TRUE},
	 *                                            {@code false}:{@link #OBJECT_PROPERTIES_TRUNCATE_FALSE}
	 * @param isObjectPropertiesPatchPermitted    {@code true}:{@link #OBJECT_PROPERTIES_PATCH_TRUE},
	 *                                            {@code false}:{@link #OBJECT_PROPERTIES_PATCH_FALSE}
	 * @param isObjectPropertiesMarked            {@code true}:{@link #OBJECT_PROPERTIES_MARK_TRUE},
	 *                                            {@code false}:{@link #OBJECT_PROPERTIES_MARK_FALSE}
	 */
	// @formatter:off
    public ObjectProperties(boolean isObjectPropertiesDeletePermitted
    		, boolean isObjectPropertiesExecutePermitted
    		, boolean isObjectPropertiesReadPermitted
    		, boolean isObjectPropertiesWritePermitted
    		, boolean isObjectPropertiesAppendPermitted
    		, boolean isObjectPropertiesTruncatePermitted
    		, boolean isObjectPropertiesPatchPermitted
    		, boolean isObjectPropertiesMarked) {
        int flags = (isObjectPropertiesDeletePermitted ? OBJECT_PROPERTIES_DELETE_TRUE : OBJECT_PROPERTIES_DELETE_FALSE)
        		| (isObjectPropertiesExecutePermitted ? OBJECT_PROPERTIES_EXECUTE_TRUE : OBJECT_PROPERTIES_EXECUTE_FALSE)
                | (isObjectPropertiesReadPermitted ? OBJECT_PROPERTIES_READ_TRUE : OBJECT_PROPERTIES_READ_FALSE)
                | (isObjectPropertiesWritePermitted ? OBJECT_PROPERTIES_WRITE_TRUE : OBJECT_PROPERTIES_WRITE_FALSE)
                | (isObjectPropertiesAppendPermitted ? OBJECT_PROPERTIES_APPEND_TRUE : OBJECT_PROPERTIES_APPEND_FALSE)
                | (isObjectPropertiesTruncatePermitted ? OBJECT_PROPERTIES_TRUNCATE_TRUE : OBJECT_PROPERTIES_TRUNCATE_FALSE)
                | (isObjectPropertiesPatchPermitted ? OBJECT_PROPERTIES_PATCH_TRUE : OBJECT_PROPERTIES_PATCH_FALSE)
        		| (isObjectPropertiesMarked ? OBJECT_PROPERTIES_MARK_TRUE : OBJECT_PROPERTIES_MARK_FALSE);
        mObjectProperties = new byte[] { (byte) flags, (byte) (flags >> 8), (byte) (flags >> 16), (byte) (flags >> 24) };
        // @formatter:on
	}

	/**
	 * @return Object Properties
	 */
	public byte[] getObjectProperties() {
		return mObjectProperties;
	}

	/**
	 * @return {@code true}:Deletion of this object is not permitted,
	 *         {@code false}:Deletion of this object is permitted
	 */
	public boolean isObjectPropertiesDeleteNotPermitted() {
		return isPropertiesMatched(OBJECT_PROPERTIES_DELETE_MASK, OBJECT_PROPERTIES_DELETE_FALSE);
	}

	/**
	 * @return {@code true}:Deletion of this object is permitted,
	 *         {@code false}:Deletion of this object is not permitted
	 */
	public boolean isObjectPropertiesDeletePermitted() {
		return isPropertiesMatched(OBJECT_PROPERTIES_DELETE_MASK, OBJECT_PROPERTIES_DELETE_TRUE);
	}

	/**
	 * @return {@code true}:Execution of this object is not permitted,
	 *         {@code false}:Execution of this object is permitted
	 */
	public boolean isObjectPropertiesExecuteNotPermitted() {
		return isPropertiesMatched(OBJECT_PROPERTIES_EXECUTE_MASK, OBJECT_PROPERTIES_EXECUTE_FALSE);
	}

	/**
	 * @return {@code true}:Execution of this object is permitted,
	 *         {@code false}:Execution of this object is not permitted
	 */
	public boolean isObjectPropertiesExecutePermitted() {
		return isPropertiesMatched(OBJECT_PROPERTIES_EXECUTE_MASK, OBJECT_PROPERTIES_EXECUTE_TRUE);
	}

	/**
	 * @return {@code true}:Reading this object is not permitted,
	 *         {@code false}:Reading this object is permitted
	 */
	public boolean isObjectPropertiesReadNotPermitted() {
		return isPropertiesMatched(OBJECT_PROPERTIES_READ_MASK, OBJECT_PROPERTIES_READ_FALSE);
	}

	/**
	 * @return {@code true}:Reading this object is permitted, {@code false}:Reading
	 *         this object is not permitted
	 */
	public boolean isObjectPropertiesReadPermitted() {
		return isPropertiesMatched(OBJECT_PROPERTIES_READ_MASK, OBJECT_PROPERTIES_READ_TRUE);
	}

	/**
	 * @return {@code true}:Writing data to this object is not permitted,
	 *         {@code false}:Writing data to this object is permitted
	 */
	public boolean isObjectPropertiesWriteNotPermitted() {
		return isPropertiesMatched(OBJECT_PROPERTIES_WRITE_MASK, OBJECT_PROPERTIES_WRITE_FALSE);
	}

	/**
	 * @return {@code true}:Writing data to this object is permitted,
	 *         {@code false}:Writing data to this object is not permitted
	 */
	public boolean isObjectPropertiesWritePermitted() {
		return isPropertiesMatched(OBJECT_PROPERTIES_WRITE_MASK, OBJECT_PROPERTIES_WRITE_TRUE);
	}

	/**
	 * @return {@code true}:Appending data to this object that increases its
	 *         Allocated Size is not permitted, {@code false}:Appending data to this
	 *         object that increases its Allocated Size is permitted
	 */
	public boolean isObjectPropertiesAppendNotPermitted() {
		return isPropertiesMatched(OBJECT_PROPERTIES_APPEND_MASK, OBJECT_PROPERTIES_APPEND_FALSE);
	}

	/**
	 * @return {@code true}:Appending data to this object that increases its
	 *         Allocated Size is permitted, {@code false}:Appending data to this
	 *         object that increases its Allocated Size is not permitted
	 */
	public boolean isObjectPropertiesAppendPermitted() {
		return isPropertiesMatched(OBJECT_PROPERTIES_APPEND_MASK, OBJECT_PROPERTIES_APPEND_TRUE);
	}

	/**
	 * @return {@code true}:Truncation of this object is not permitted,
	 *         {@code false}:Truncation of this object is permitted
	 */
	public boolean isObjectPropertiesTruncateNotPermitted() {
		return isPropertiesMatched(OBJECT_PROPERTIES_TRUNCATE_MASK, OBJECT_PROPERTIES_TRUNCATE_FALSE);
	}

	/**
	 * @return {@code true}:Truncation of this object is permitted,
	 *         {@code false}:Truncation of this object is not permitted
	 */
	public boolean isObjectPropertiesTruncatePermitted() {
		return isPropertiesMatched(OBJECT_PROPERTIES_TRUNCATE_MASK, OBJECT_PROPERTIES_TRUNCATE_TRUE);
	}

	/**
	 * @return {@code true}:Patching this object by overwriting some of the object’s
	 *         existing contents is not permitted, {@code false}:Patching this
	 *         object by overwriting some of the object’s existing contents is
	 *         permitted
	 */
	public boolean isObjectPropertiesPatchNotPermitted() {
		return isPropertiesMatched(OBJECT_PROPERTIES_PATCH_MASK, OBJECT_PROPERTIES_PATCH_FALSE);
	}

	/**
	 * @return {@code true}:Patching this object by overwriting some of the object’s
	 *         existing contents is permitted, {@code false}:Patching this object by
	 *         overwriting some of the object’s existing contents is not permitted
	 */
	public boolean isObjectPropertiesPatchPermitted() {
		return isPropertiesMatched(OBJECT_PROPERTIES_PATCH_MASK, OBJECT_PROPERTIES_PATCH_TRUE);
	}

	/**
	 * @return {@code true}:This object is not a marked object, {@code false}:This
	 *         object is a marked object
	 */
	public boolean isObjectPropertiesNotMarked() {
		return isPropertiesMatched(OBJECT_PROPERTIES_MARK_MASK, OBJECT_PROPERTIES_MARK_FALSE);
	}

	/**
	 * @return {@code true}:This object is a marked object, {@code false}:This
	 *         object is not a marked object
	 */
	public boolean isObjectPropertiesMarked() {
		return isPropertiesMatched(OBJECT_PROPERTIES_MARK_MASK, OBJECT_PROPERTIES_MARK_TRUE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@NonNull
	public byte[] getBytes() {
		byte[] data = new byte[4];
		ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
		byteBuffer.put(mObjectProperties);
		return data;
	}

	/**
	 * check Object Properties
	 *
	 * @param mask   bitmask for expect
	 * @param expect one of {@link #OBJECT_PROPERTIES_DELETE_FALSE}
	 *               {@link #OBJECT_PROPERTIES_DELETE_TRUE}
	 *               {@link #OBJECT_PROPERTIES_EXECUTE_FALSE}
	 *               {@link #OBJECT_PROPERTIES_EXECUTE_TRUE}
	 *               {@link #OBJECT_PROPERTIES_READ_FALSE}
	 *               {@link #OBJECT_PROPERTIES_READ_TRUE}
	 *               {@link #OBJECT_PROPERTIES_WRITE_FALSE}
	 *               {@link #OBJECT_PROPERTIES_WRITE_TRUE}
	 *               {@link #OBJECT_PROPERTIES_APPEND_FALSE}
	 *               {@link #OBJECT_PROPERTIES_APPEND_TRUE}
	 *               {@link #OBJECT_PROPERTIES_TRUNCATE_FALSE}
	 *               {@link #OBJECT_PROPERTIES_TRUNCATE_TRUE}
	 *               {@link #OBJECT_PROPERTIES_PATCH_FALSE}
	 *               {@link #OBJECT_PROPERTIES_PATCH_TRUE}
	 *               {@link #OBJECT_PROPERTIES_MARK_FALSE}
	 *               {@link #OBJECT_PROPERTIES_MARK_TRUE}
	 * @return {@code true}:same as expect, {@code false}:not match
	 */
	private boolean isPropertiesMatched(int mask, int expect) {
		return (mask & BLEUtils.createSInt32(mObjectProperties, 0)) == expect;
	}

}
