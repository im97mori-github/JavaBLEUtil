package org.im97mori.ble.characteristic.u2ac8;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * object changed (Characteristics UUID: 0x2AC8)
 */
public class ObjectChanged implements ByteArrayInterface {

	/**
	 * @see #FLAGS_SOURCE_OF_CHANGE_SERVER
	 * @see #FLAGS_SOURCE_OF_CHANGE_CLIENT
	 */
	public static final int FLAGS_SOURCE_OF_CHANGE_MASK = 0b00000001;

	/**
	 * 0: Source of Change Server
	 */
	public static final int FLAGS_SOURCE_OF_CHANGE_SERVER = 0b00000000;

	/**
	 * 1: Source of Change Client
	 */
	public static final int FLAGS_SOURCE_OF_CHANGE_CLIENT = 0b00000001;

	/**
	 * @see #FLAGS_CHANGE_OCCURRED_TO_THE_OBJECT_CONTENTS_FALSE
	 * @see #FLAGS_CHANGE_OCCURRED_TO_THE_OBJECT_CONTENTS_TRUE
	 */
	public static final int FLAGS_CHANGE_OCCURRED_TO_THE_OBJECT_CONTENTS_MASK = 0b00000010;

	/**
	 * 0: Change occurred to the object contents False
	 */
	public static final int FLAGS_CHANGE_OCCURRED_TO_THE_OBJECT_CONTENTS_FALSE = 0b00000000;

	/**
	 * 1: Change occurred to the object contents True
	 */
	public static final int FLAGS_CHANGE_OCCURRED_TO_THE_OBJECT_CONTENTS_TRUE = 0b00000010;

	/**
	 * @see #FLAGS_CHANGE_OCCURRED_TO_THE_OBJECT_METADATA_FALSE
	 * @see #FLAGS_CHANGE_OCCURRED_TO_THE_OBJECT_METADATA_TRUE
	 */
	public static final int FLAGS_CHANGE_OCCURRED_TO_THE_OBJECT_METADATA_MASK = 0b00000100;

	/**
	 * 0: Change occurred to the object metadata False
	 */
	public static final int FLAGS_CHANGE_OCCURRED_TO_THE_OBJECT_METADATA_FALSE = 0b00000000;

	/**
	 * 1: Change occurred to the object metadata True
	 */
	public static final int FLAGS_CHANGE_OCCURRED_TO_THE_OBJECT_METADATA_TRUE = 0b00000100;

	/**
	 * @see #FLAGS_OBJECT_CREATION_FALSE
	 * @see #FLAGS_OBJECT_CREATION_TRUE
	 */
	public static final int FLAGS_OBJECT_CREATION_MASK = 0b00001000;

	/**
	 * 0: Object Creation False
	 */
	public static final int FLAGS_OBJECT_CREATION_FALSE = 0b00000000;

	/**
	 * 1: Object Creation True
	 */
	public static final int FLAGS_OBJECT_CREATION_TRUE = 0b00001000;

	/**
	 * @see #FLAGS_OBJECT_DELETION_FALSE
	 * @see #FLAGS_OBJECT_DELETION_TRUE
	 */
	public static final int FLAGS_OBJECT_DELETION_MASK = 0b00010000;

	/**
	 * 0: Object Deletion False
	 */
	public static final int FLAGS_OBJECT_DELETION_FALSE = 0b00000000;

	/**
	 * 0: Object Deletion True
	 */
	public static final int FLAGS_OBJECT_DELETION_TRUE = 0b00010000;

	/**
	 * Flags
	 */
	private final int mFlags;

	/**
	 * Object ID
	 */
	private final long mObjectId;

	/**
	 * Constructor from byte array
	 *
	 * @param values byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 */
	public ObjectChanged(@NonNull byte[] values) {
		mFlags = values[0];
		mObjectId = BLEUtils.createUInt48(values, 1);
	}

	/**
	 * Constructor from parameters
	 * 
	 * @param flags    Flags
	 * @param objectId Object ID
	 */
	public ObjectChanged(int flags, long objectId) {
		mFlags = flags;
		mObjectId = objectId;
	}

	/**
	 * @return Flags
	 */
	public long getFlags() {
		return mFlags;
	}

	/**
	 * @return {@code true}:Source of Change Server, {@code false}:Source of Change
	 *         Client
	 */
	public boolean isFlagsSourceOfChangeServer() {
		return isFlagsMatched(FLAGS_SOURCE_OF_CHANGE_MASK, FLAGS_SOURCE_OF_CHANGE_SERVER);
	}

	/**
	 * @return {@code true}:Source of Change Client, {@code false}:Source of Change
	 *         Server
	 */
	public boolean isFlagsSourceOfChangeClient() {
		return isFlagsMatched(FLAGS_SOURCE_OF_CHANGE_MASK, FLAGS_SOURCE_OF_CHANGE_CLIENT);
	}

	/**
	 * @return {@code true}:Change occurred to the object contents False,
	 *         {@code false}:Change occurred to the object contents True
	 */
	public boolean isFlagsChangeOccurredToTheObjectContentsFalse() {
		return isFlagsMatched(FLAGS_CHANGE_OCCURRED_TO_THE_OBJECT_CONTENTS_MASK,
				FLAGS_CHANGE_OCCURRED_TO_THE_OBJECT_CONTENTS_FALSE);
	}

	/**
	 * @return {@code true}:Change occurred to the object contents True,
	 *         {@code false}:Change occurred to the object contents False
	 */
	public boolean isFlagsChangeOccurredToTheObjectContentsTrue() {
		return isFlagsMatched(FLAGS_CHANGE_OCCURRED_TO_THE_OBJECT_CONTENTS_MASK,
				FLAGS_CHANGE_OCCURRED_TO_THE_OBJECT_CONTENTS_TRUE);
	}

	/**
	 * @return {@code true}:Change occurred to the object metadata False,
	 *         {@code false}:Change occurred to the object metadata True
	 */
	public boolean isFlagsChangeOccurredToTheObjectMetadataFalse() {
		return isFlagsMatched(FLAGS_CHANGE_OCCURRED_TO_THE_OBJECT_METADATA_MASK,
				FLAGS_CHANGE_OCCURRED_TO_THE_OBJECT_METADATA_FALSE);
	}

	/**
	 * @return {@code true}:Change occurred to the object metadata True,
	 *         {@code false}:Change occurred to the object metadata False
	 */
	public boolean isFlagsChangeOccurredToTheObjectMetadataTrue() {
		return isFlagsMatched(FLAGS_CHANGE_OCCURRED_TO_THE_OBJECT_METADATA_MASK,
				FLAGS_CHANGE_OCCURRED_TO_THE_OBJECT_METADATA_TRUE);
	}

	/**
	 * @return {@code true}:Object Creation False, {@code false}:Object Creation
	 *         True
	 */
	public boolean isFlagsObjectCreationFalse() {
		return isFlagsMatched(FLAGS_OBJECT_CREATION_MASK, FLAGS_OBJECT_CREATION_FALSE);
	}

	/**
	 * @return {@code true}:Object Creation True, {@code false}:Object Creation
	 *         False
	 */
	public boolean isFlagsObjectCreationTrue() {
		return isFlagsMatched(FLAGS_OBJECT_CREATION_MASK, FLAGS_OBJECT_CREATION_TRUE);
	}

	/**
	 * @return {@code true}:Object Deletion False, {@code false}:Object Deletion
	 *         True
	 */
	public boolean isFlagsObjectDeletionFalse() {
		return isFlagsMatched(FLAGS_OBJECT_DELETION_MASK, FLAGS_OBJECT_DELETION_FALSE);
	}

	/**
	 * @return {@code true}:Object Deletion True, {@code false}:Object Deletion
	 *         False
	 */
	public boolean isFlagsObjectDeletionTrue() {
		return isFlagsMatched(FLAGS_OBJECT_DELETION_MASK, FLAGS_OBJECT_DELETION_TRUE);
	}

	/**
	 * @return Object ID
	 */
	public long getObjectId() {
		return mObjectId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@NonNull
	public byte[] getBytes() {
		byte[] data = new byte[7];
		ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
		byteBuffer.put((byte) mFlags);
		byteBuffer.put((byte) mObjectId);
		byteBuffer.put((byte) (mObjectId >> 8));
		byteBuffer.put((byte) (mObjectId >> 16));
		byteBuffer.put((byte) (mObjectId >> 24));
		byteBuffer.put((byte) (mObjectId >> 32));
		byteBuffer.put((byte) (mObjectId >> 40));
		return data;
	}

	/**
	 * check Flags
	 *
	 * @param mask   bitmask for expect
	 * @param expect one of {@link #FLAGS_SOURCE_OF_CHANGE_SERVER}
	 *               {@link #FLAGS_SOURCE_OF_CHANGE_CLIENT}
	 *               {@link #FLAGS_CHANGE_OCCURRED_TO_THE_OBJECT_CONTENTS_FALSE}
	 *               {@link #FLAGS_CHANGE_OCCURRED_TO_THE_OBJECT_CONTENTS_TRUE}
	 *               {@link #FLAGS_CHANGE_OCCURRED_TO_THE_OBJECT_METADATA_FALSE}
	 *               {@link #FLAGS_CHANGE_OCCURRED_TO_THE_OBJECT_METADATA_TRUE}
	 *               {@link #FLAGS_OBJECT_CREATION_FALSE}
	 *               {@link #FLAGS_OBJECT_CREATION_TRUE}
	 *               {@link #FLAGS_OBJECT_DELETION_FALSE}
	 *               {@link #FLAGS_OBJECT_DELETION_TRUE}
	 * @return {@code true}:same as expect, {@code false}:not match
	 */
	private boolean isFlagsMatched(int mask, int expect) {
		return (mask & mFlags) == expect;
	}

}
