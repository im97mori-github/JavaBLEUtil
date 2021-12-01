package org.im97mori.ble.characteristic.u2ac6;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * object list control point (Characteristics UUID: 0x2AC6)
 */
public class ObjectListControlPoint implements ByteArrayInterface {

	/**
	 * First
	 */
	public static final int OP_CODE_FIRST = 0x01;

	/**
	 * Last
	 */
	public static final int OP_CODE_LAST = 0x02;

	/**
	 * Previous
	 */
	public static final int OP_CODE_PREVIOUS = 0x03;

	/**
	 * Next
	 */
	public static final int OP_CODE_NEXT = 0x04;

	/**
	 * Go To
	 */
	public static final int OP_CODE_GO_TO = 0x05;

	/**
	 * Order
	 */
	public static final int OP_CODE_ORDER = 0x06;

	/**
	 * Request Number of Objects
	 */
	public static final int OP_CODE_REQUEST_NUMBER_OF_OBJECTS = 0x07;

	/**
	 * Clear Marking
	 */
	public static final int OP_CODE_CLEAR_MARKING = 0x08;

	/**
	 * Response Code
	 */
	public static final int OP_CODE_RESPONSE_CODE = 0x70;

	/**
	 * Order the list by object name, ascending
	 */
	public static final int LIST_SORT_ORDER_OBJECT_NAME_ASCENDING = 0x01;

	/**
	 * Order the list by object type, ascending
	 */
	public static final int LIST_SORT_ORDER_OBJECT_TYPE_ASCENDING = 0x02;

	/**
	 * Order the list by object current size, ascending
	 */
	public static final int LIST_SORT_ORDER_OBJECT_CURRENT_SIZE_ASCENDING = 0x03;

	/**
	 * Order the list by object first-created timestamp, ascending
	 */
	public static final int LIST_SORT_ORDER_OBJECT_FIRST_CREATED_TIMESTAMP_ASCENDING = 0x04;

	/**
	 * Order the list by object last-modified timestamp, ascending
	 */
	public static final int LIST_SORT_ORDER_OBJECT_LAST_MODIFIED_TIMESTAMP_ASCENDING = 0x05;

	/**
	 * Order the list by object name, descending
	 */
	public static final int LIST_SORT_ORDER_OBJECT_NAME_DESCENDING = 0x11;

	/**
	 * Order the list by object type, descending
	 */
	public static final int LIST_SORT_ORDER_OBJECT_TYPE_DESCENDING = 0x12;

	/**
	 * Order the list by object current size, descending
	 */
	public static final int LIST_SORT_ORDER_OBJECT_CURRENT_SIZE_DESCENDING = 0x13;

	/**
	 * Order the list by object first-created timestamp, descending
	 */
	public static final int LIST_SORT_ORDER_OBJECT_FIRST_CREATED_TIMESTAMP_DESCENDING = 0x14;

	/**
	 * Order the list by object last-modified timestamp, descending
	 */
	public static final int LIST_SORT_ORDER_OBJECT_LAST_MODIFIED_TIMESTAMP_DESCENDING = 0x15;

	/**
	 * Success
	 */
	public static final int RESULT_CODE_SUCCESS = 0x01;

	/**
	 * Op Code Not Supported
	 */
	public static final int RESULT_CODE_OP_CODE_NOT_SUPPORTED = 0x02;

	/**
	 * Invalid Parameter
	 */
	public static final int RESULT_CODE_INVALID_PARAMETER = 0x03;

	/**
	 * Operation Failed
	 */
	public static final int RESULT_CODE_OPERATION_FAILED = 0x04;

	/**
	 * Out Of Bounds
	 */
	public static final int RESULT_CODE_OUT_OF_BOUNDS = 0x05;

	/**
	 * Too Many Objects
	 */
	public static final int RESULT_CODE_TOO_MANY_OBJECTS = 0x06;

	/**
	 * No Object
	 */
	public static final int RESULT_CODE_NO_OBJECT = 0x07;

	/**
	 * Object ID Not Found
	 */
	public static final int RESULT_CODE_OBJECT_ID_NOT_FOUND = 0x08;

	/**
	 * Op Code
	 */
	private final int mOpCode;

	/**
	 * Object ID
	 */
	private final long mObjectId;

	/**
	 * List Sort Order
	 */
	private final int mListSortOrder;

	/**
	 * Request Op Code
	 */
	private final int mRequestOpCode;

	/**
	 * Result Code
	 */
	private final int mResultCode;

	/**
	 * Total Number of Objects
	 */
	private final long mTotalNumberOfObjects;

	/**
	 * Constructor from byte array
	 *
	 * @param values byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 */
	public ObjectListControlPoint(@NonNull byte[] values) {
		mOpCode = BLEUtils.createUInt8(values, 0);
		if (isOpCodeGoTo(mOpCode)) {
			mObjectId = BLEUtils.createUInt48(values, 1);
			mListSortOrder = 0;
			mRequestOpCode = 0;
			mResultCode = 0;
			mTotalNumberOfObjects = 0;
		} else if (isOpCodeOrder(mOpCode)) {
			mObjectId = 0;
			mListSortOrder = BLEUtils.createUInt8(values, 1);
			mRequestOpCode = 0;
			mResultCode = 0;
			mTotalNumberOfObjects = 0;
		} else if (isOpCodeResponseCode(mOpCode)) {
			mObjectId = 0;
			mListSortOrder = 0;
			mRequestOpCode = BLEUtils.createUInt8(values, 1);
			mResultCode = BLEUtils.createUInt8(values, 2);
			if (isOpCodeRequestNumberOfObjects(mRequestOpCode) && isResultCodeSuccess()) {
				mTotalNumberOfObjects = BLEUtils.createUInt32(values, 3);
			} else {
				mTotalNumberOfObjects = 0;
			}
		} else {
			mObjectId = 0;
			mListSortOrder = 0;
			mRequestOpCode = 0;
			mResultCode = 0;
			mTotalNumberOfObjects = 0;
		}
	}

	/**
	 * Constructor from parameters
	 * 
	 * @param opCode               Op Code
	 * @param objectId             Object ID
	 * @param listSortOrder        List Sort Order
	 * @param requestOpCode        Request Op Code
	 * @param resultCode           Result Code
	 * @param totalNumberOfObjects Total Number of Objects
	 */
	public ObjectListControlPoint(int opCode, long objectId, int listSortOrder, int requestOpCode, int resultCode,
			int totalNumberOfObjects) {
		mOpCode = opCode;
		mObjectId = objectId;
		mListSortOrder = listSortOrder;
		mRequestOpCode = requestOpCode;
		mResultCode = resultCode;
		mTotalNumberOfObjects = totalNumberOfObjects;
	}

	/**
	 * @return Op Code
	 */
	public int getOpCode() {
		return mOpCode;
	}

	/**
	 * @param opCode Op Code
	 * @return {@code true}:Op Code is First, {@code false}:Op Code is not First
	 */
	public boolean isOpCodeFirst(int opCode) {
		return opCode == OP_CODE_FIRST;
	}

	/**
	 * @param opCode Op Code
	 * @return {@code true}:Op Code is Last, {@code false}:Op Code is not Last
	 */
	public boolean isOpCodeLast(int opCode) {
		return opCode == OP_CODE_LAST;
	}

	/**
	 * @param opCode Op Code
	 * @return {@code true}:Op Code is Previous, {@code false}:Op Code is not
	 *         Previous
	 */
	public boolean isOpCodePrevious(int opCode) {
		return opCode == OP_CODE_PREVIOUS;
	}

	/**
	 * @param opCode Op Code
	 * @return {@code true}:Op Code is Next, {@code false}:Op Code is not Next
	 */
	public boolean isOpCodeNext(int opCode) {
		return opCode == OP_CODE_NEXT;
	}

	/**
	 * @param opCode Op Code
	 * @return {@code true}:Op Code is Go To, {@code false}:Op Code is not Go To
	 */
	public boolean isOpCodeGoTo(int opCode) {
		return opCode == OP_CODE_GO_TO;
	}

	/**
	 * @param opCode Op Code
	 * @return {@code true}:Op Code is Order, {@code false}:Op Code is not Order
	 */
	public boolean isOpCodeOrder(int opCode) {
		return opCode == OP_CODE_ORDER;
	}

	/**
	 * @param opCode Op Code
	 * @return {@code true}:Op Code is Request Number of Objects, {@code false}:Op
	 *         Code is not Request Number of Objects
	 */
	public boolean isOpCodeRequestNumberOfObjects(int opCode) {
		return opCode == OP_CODE_REQUEST_NUMBER_OF_OBJECTS;
	}

	/**
	 * @param opCode Op Code
	 * @return {@code true}:Op Code is Clear Marking, {@code false}:Op Code is not
	 *         Clear Marking
	 */
	public boolean isOpCodeClearMarking(int opCode) {
		return opCode == OP_CODE_CLEAR_MARKING;
	}

	/**
	 * @param opCode Op Code
	 * @return {@code true}:Op Code is Response Code, {@code false}:Op Code is not
	 *         Response Code
	 */
	public boolean isOpCodeResponseCode(int opCode) {
		return opCode == OP_CODE_RESPONSE_CODE;
	}

	/**
	 * @return Object ID
	 */
	public long getObjectId() {
		return mObjectId;
	}

	/**
	 * @return List Sort Order
	 */
	public int getListSortOrder() {
		return mListSortOrder;
	}

	/**
	 * @return {@code true}:List Sort Order is name ascending, {@code false}:List
	 *         Sort Order is not name ascending
	 */
	public boolean isListSortOrderObjectNameAscending() {
		return mListSortOrder == LIST_SORT_ORDER_OBJECT_NAME_ASCENDING;
	}

	/**
	 * @return {@code true}:List Sort Order is name ascending, {@code false}:List
	 *         Sort Order is not name ascending
	 */
	public boolean isListSortOrderObjectTypeAscending() {
		return mListSortOrder == LIST_SORT_ORDER_OBJECT_TYPE_ASCENDING;
	}

	/**
	 * @return {@code true}:List Sort Order is name ascending, {@code false}:List
	 *         Sort Order is not name ascending
	 */
	public boolean isListSortOrderObjectCurrentSizeAscending() {
		return mListSortOrder == LIST_SORT_ORDER_OBJECT_CURRENT_SIZE_ASCENDING;
	}

	/**
	 * @return {@code true}:List Sort Order is name ascending, {@code false}:List
	 *         Sort Order is not name ascending
	 */
	public boolean isListSortOrderObjectCreatedTimestampAscending() {
		return mListSortOrder == LIST_SORT_ORDER_OBJECT_FIRST_CREATED_TIMESTAMP_ASCENDING;
	}

	/**
	 * @return {@code true}:List Sort Order is name ascending, {@code false}:List
	 *         Sort Order is not name ascending
	 */
	public boolean isListSortOrderObjectModifiedTimestampAscending() {
		return mListSortOrder == LIST_SORT_ORDER_OBJECT_LAST_MODIFIED_TIMESTAMP_ASCENDING;
	}

	/**
	 * @return {@code true}:List Sort Order is name descending, {@code false}:List
	 *         Sort Order is not name descending
	 */
	public boolean isListSortOrderObjectNameDescending() {
		return mListSortOrder == LIST_SORT_ORDER_OBJECT_NAME_DESCENDING;
	}

	/**
	 * @return {@code true}:List Sort Order is name descending, {@code false}:List
	 *         Sort Order is not name descending
	 */
	public boolean isListSortOrderObjectTypeDescending() {
		return mListSortOrder == LIST_SORT_ORDER_OBJECT_TYPE_DESCENDING;
	}

	/**
	 * @return {@code true}:List Sort Order is name descending, {@code false}:List
	 *         Sort Order is not name descending
	 */
	public boolean isListSortOrderObjectCurrentSizeDescending() {
		return mListSortOrder == LIST_SORT_ORDER_OBJECT_CURRENT_SIZE_DESCENDING;
	}

	/**
	 * @return {@code true}:List Sort Order is name descending, {@code false}:List
	 *         Sort Order is not name descending
	 */
	public boolean isListSortOrderObjectCreatedTimestampDescending() {
		return mListSortOrder == LIST_SORT_ORDER_OBJECT_FIRST_CREATED_TIMESTAMP_DESCENDING;
	}

	/**
	 * @return {@code true}:List Sort Order is name descending, {@code false}:List
	 *         Sort Order is not name descending
	 */
	public boolean isListSortOrderObjectModifiedTimestampDescending() {
		return mListSortOrder == LIST_SORT_ORDER_OBJECT_LAST_MODIFIED_TIMESTAMP_DESCENDING;
	}

	/**
	 * @return Request Op Code
	 */
	public int getRequestOpCode() {
		return mRequestOpCode;
	}

	/**
	 * @return Result Code
	 */
	public int getResultCode() {
		return mResultCode;
	}

	/**
	 * @return {@code true}:Result Code is Success, {@code false}:Result Code is not
	 *         Success
	 */
	public boolean isResultCodeSuccess() {
		return mResultCode == RESULT_CODE_SUCCESS;
	}

	/**
	 * @return {@code true}:Result Code is Op Code Not Supported,
	 *         {@code false}:Result Code is not Op Code Not Supported
	 */
	public boolean isResultCodeOpCodeNotSupported() {
		return mResultCode == RESULT_CODE_OP_CODE_NOT_SUPPORTED;
	}

	/**
	 * @return {@code true}:Result Code is Invalid Parameter, {@code false}:Result
	 *         Code is not Invalid Parameter
	 */
	public boolean isResultCodeInvalidParameter() {
		return mResultCode == RESULT_CODE_INVALID_PARAMETER;
	}

	/**
	 * @return {@code true}:Result Code is Operation Failed, {@code false}:Result
	 *         Code is not Operation Failed
	 */
	public boolean isResultCodeOperationFailed() {
		return mResultCode == RESULT_CODE_OPERATION_FAILED;
	}

	/**
	 * @return {@code true}:Result Code is Out Of Bounds, {@code false}:Result Code
	 *         is not Out Of Bounds
	 */
	public boolean isResultCodeOutOfBounds() {
		return mResultCode == RESULT_CODE_OUT_OF_BOUNDS;
	}

	/**
	 * @return {@code true}:Result Code is Too Many Objects, {@code false}:Result
	 *         Code is not Too Many Objects
	 */
	public boolean isResultCodeTooManyObjects() {
		return mResultCode == RESULT_CODE_TOO_MANY_OBJECTS;
	}

	/**
	 * @return {@code true}:Result Code is No Object, {@code false}:Result Code is
	 *         not No Object
	 */
	public boolean isResultCodeNoObject() {
		return mResultCode == RESULT_CODE_NO_OBJECT;
	}

	/**
	 * @return {@code true}:Result Code is Object ID Not Found, {@code false}:Result
	 *         Code is not Object ID Not Found
	 */
	public boolean isResultCodeObjectIdNotFound() {
		return mResultCode == RESULT_CODE_OBJECT_ID_NOT_FOUND;
	}

	/**
	 * @return Total Number of Objects
	 */
	public long getTotalNumberOfObjects() {
		return mTotalNumberOfObjects;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@NonNull
	public byte[] getBytes() {
		int length = 1;
		byte[] data = new byte[7];
		ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
		byteBuffer.put((byte) mOpCode);
		if (isOpCodeGoTo(mOpCode)) {
			byteBuffer.put((byte) mObjectId);
			byteBuffer.put((byte) (mObjectId >> 8));
			byteBuffer.put((byte) (mObjectId >> 16));
			byteBuffer.put((byte) (mObjectId >> 24));
			byteBuffer.put((byte) (mObjectId >> 32));
			byteBuffer.put((byte) (mObjectId >> 40));
			length += 6;
		} else if (isOpCodeOrder(mOpCode)) {
			byteBuffer.put((byte) mListSortOrder);
			length++;
		} else if (isOpCodeResponseCode(mOpCode)) {
			byteBuffer.put((byte) mRequestOpCode);
			byteBuffer.put((byte) mResultCode);
			length += 2;
			if (isOpCodeRequestNumberOfObjects(mRequestOpCode) && isResultCodeSuccess()) {
				byteBuffer.putInt((int) mTotalNumberOfObjects);
				length += 4;
			}
		}
		return Arrays.copyOfRange(data, 0, length);
	}

}
