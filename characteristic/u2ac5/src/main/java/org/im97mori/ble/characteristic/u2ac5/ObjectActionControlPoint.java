package org.im97mori.ble.characteristic.u2ac5;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * object actioncontrol point (Characteristics UUID: 0x2AC5)
 */
public class ObjectActionControlPoint implements ByteArrayInterface {

	/**
	 * Create
	 */
	public static final int OP_CODE_CREATE = 0x01;

	/**
	 * Delete
	 */
	public static final int OP_CODE_DELETE = 0x02;

	/**
	 * Calculate Checksum
	 */
	public static final int OP_CODE_CALCULATE_CHECKSUM = 0x03;

	/**
	 * Execute
	 */
	public static final int OP_CODE_EXECUTE = 0x04;

	/**
	 * Read
	 */
	public static final int OP_CODE_READ = 0x05;

	/**
	 * Write
	 */
	public static final int OP_CODE_WRITE = 0x06;

	/**
	 * Abort
	 */
	public static final int OP_CODE_ABORT = 0x07;

	/**
	 * Response Code
	 */
	public static final int OP_CODE_RESPONSE_CODE = 0x60;

	/**
	 * @see #MODE_TRUNCATE_FALSE
	 * @see #MODE_TRUNCATE_TRUE
	 */
	public static final int MODE_TRUNCATE_MASK = 0b00000010;

	/**
	 * 0: Truncate False
	 */
	public static final int MODE_TRUNCATE_FALSE = 0b00000000;

	/**
	 * 1: Truncate True
	 */
	public static final int MODE_TRUNCATE_TRUE = 0b00000010;

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
	 * Insufficient Resources
	 */
	public static final int RESULT_CODE_INSUFFICIENT_RESOUCES = 0x04;

	/**
	 * Invalid Object
	 */
	public static final int RESULT_CODE_INVALID_OBJECT = 0x05;

	/**
	 * Channel Unavailable
	 */
	public static final int RESULT_CODE_CHANNEL_UNAVAILABLE = 0x06;

	/**
	 * Unsupported Type
	 */
	public static final int RESULT_CODE_UNSUPPORTED_TYPE = 0x07;

	/**
	 * Procedure Not Permitted
	 */
	public static final int RESULT_CODE_PROCEDURE_NOT_PERMITTED = 0x08;

	/**
	 * Object Locked
	 */
	public static final int RESULT_CODE_OBJECT_LOCKED = 0x09;

	/**
	 * Operation Failed
	 */
	public static final int RESULT_CODE_OPERATION_FAILED = 0x0A;

	/**
	 * Op Code
	 */
	private final int mOpCode;

	/**
	 * Size
	 */
	private final long mSize;

	/**
	 * Type
	 */
	private final byte[] mType;

	/**
	 * Offset
	 */
	private final long mOffset;

	/**
	 * Length
	 */
	private final long mLength;

	/**
	 * Parameter
	 */
	private final byte[] mParameter;

	/**
	 * Mode
	 */
	private final int mMode;

	/**
	 * Request Op Code
	 */
	private final int mRequestOpCode;

	/**
	 * Result Code
	 */
	private final int mResultCode;

	/**
	 * Checksum
	 */
	private final long mChecksum;

	/**
	 * Response Parameter
	 */
	private final byte[] mResponseParameter;

	/**
	 * Constructor from byte array
	 *
	 * @param values byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 */
	public ObjectActionControlPoint(@NonNull byte[] values) {
		mOpCode = BLEUtils.createUInt8(values, 0);
		if (isOpCodeCreate(mOpCode)) {
			mSize = BLEUtils.createUInt32(values, 1);
			mType = Arrays.copyOfRange(values, 5, values.length);
			mOffset = 0;
			mLength = 0;
			mParameter = new byte[0];
			mMode = 0;
			mRequestOpCode = 0;
			mResultCode = 0;
			mChecksum = 0;
			mResponseParameter = new byte[0];
		} else if (isOpCodeDelete(mOpCode)) {
			mSize = 0;
			mType = new byte[0];
			mOffset = 0;
			mLength = 0;
			mParameter = new byte[0];
			mMode = 0;
			mRequestOpCode = 0;
			mResultCode = 0;
			mChecksum = 0;
			mResponseParameter = new byte[0];
		} else if (isOpCodeCalculateChecksum(mOpCode)) {
			mSize = 0;
			mType = new byte[0];
			mOffset = BLEUtils.createUInt32(values, 1);
			mLength = BLEUtils.createUInt32(values, 5);
			mParameter = new byte[0];
			mMode = 0;
			mRequestOpCode = 0;
			mResultCode = 0;
			mChecksum = 0;
			mResponseParameter = new byte[0];
		} else if (isOpCodeExecute(mOpCode)) {
			mSize = 0;
			mType = new byte[0];
			mOffset = 0;
			mLength = 0;
			mParameter = Arrays.copyOfRange(values, 1, values.length);
			mMode = 0;
			mRequestOpCode = 0;
			mResultCode = 0;
			mChecksum = 0;
			mResponseParameter = new byte[0];
		} else if (isOpCodeRead(mOpCode)) {
			mSize = 0;
			mType = new byte[0];
			mOffset = BLEUtils.createUInt32(values, 1);
			mLength = BLEUtils.createUInt32(values, 5);
			mParameter = new byte[0];
			mMode = 0;
			mRequestOpCode = 0;
			mResultCode = 0;
			mChecksum = 0;
			mResponseParameter = new byte[0];
		} else if (isOpCodeWrite(mOpCode)) {
			mSize = 0;
			mType = new byte[0];
			mOffset = BLEUtils.createUInt32(values, 1);
			mLength = BLEUtils.createUInt32(values, 5);
			mParameter = new byte[0];
			mMode = BLEUtils.createUInt8(values, 9);
			mRequestOpCode = 0;
			mResultCode = 0;
			mChecksum = 0;
			mResponseParameter = new byte[0];
		} else if (isOpCodeAbort(mOpCode)) {
			mSize = 0;
			mType = new byte[0];
			mOffset = 0;
			mLength = 0;
			mParameter = new byte[0];
			mMode = 0;
			mRequestOpCode = 0;
			mResultCode = 0;
			mChecksum = 0;
			mResponseParameter = new byte[0];
		} else if (isOpCodeResponseCode(mOpCode)) {
			mSize = 0;
			mType = new byte[0];
			mOffset = 0;
			mLength = 0;
			mParameter = new byte[0];
			mMode = 0;
			mRequestOpCode = BLEUtils.createUInt8(values, 1);
			mResultCode = BLEUtils.createUInt8(values, 2);
			if (isOpCodeCalculateChecksum(mRequestOpCode)) {
				if (isResultCodeSuccess()) {
					mChecksum = BLEUtils.createUInt32(values, 3);
				} else {
					mChecksum = 0;
				}
				mResponseParameter = new byte[0];
			} else if (isOpCodeExecute(mRequestOpCode)) {
				mChecksum = 0;
				mResponseParameter = Arrays.copyOfRange(values, 3, values.length);
			} else {
				mChecksum = 0;
				mResponseParameter = new byte[0];
			}
		} else {
			mSize = 0;
			mType = new byte[0];
			mOffset = 0;
			mLength = 0;
			mParameter = new byte[0];
			mMode = 0;
			mRequestOpCode = 0;
			mResultCode = 0;
			mChecksum = 0;
			mResponseParameter = new byte[0];
		}
	}

	/**
	 * Constructor from parameters
	 * 
	 * @param opCode            Op Code
	 * @param size              Size
	 * @param type              Type
	 * @param offset            Offset
	 * @param length            Length
	 * @param parameter         Parameter
	 * @param mode              Mode
	 * @param requestOpCode     Request Op Code
	 * @param resultCode        Result Code
	 * @param checksum          Checksum
	 * @param responseParameter Response Parameter
	 */
	public ObjectActionControlPoint(int opCode, long size, @NonNull byte[] type, long offset, long length,
			@NonNull byte[] parameter, int mode, int requestOpCode, int resultCode, int checksum,
			@NonNull byte[] responseParameter) {
		mOpCode = opCode;
		mSize = size;
		mType = type;
		mOffset = offset;
		mLength = length;
		mParameter = parameter;
		mMode = mode;
		mRequestOpCode = requestOpCode;
		mResultCode = resultCode;
		mChecksum = checksum;
		mResponseParameter = responseParameter;
	}

	/**
	 * @return Op Code
	 */
	public int getOpCode() {
		return mOpCode;
	}

	/**
	 * @param opCode Op Code
	 * @return {@code true}:Op Code is Create, {@code false}:Op Code is not Create
	 */
	public boolean isOpCodeCreate(int opCode) {
		return opCode == OP_CODE_CREATE;
	}

	/**
	 * @param opCode Op Code
	 * @return {@code true}:Op Code is Delete, {@code false}:Op Code is not Delete
	 */
	public boolean isOpCodeDelete(int opCode) {
		return opCode == OP_CODE_DELETE;
	}

	/**
	 * @param opCode Op Code
	 * @return {@code true}:Op Code is Calculate Checksum, {@code false}:Op Code is
	 *         not Calculate Checksum
	 */
	public boolean isOpCodeCalculateChecksum(int opCode) {
		return opCode == OP_CODE_CALCULATE_CHECKSUM;
	}

	/**
	 * @param opCode Op Code
	 * @return {@code true}:Op Code is Execute, {@code false}:Op Code is not Execute
	 */
	public boolean isOpCodeExecute(int opCode) {
		return opCode == OP_CODE_EXECUTE;
	}

	/**
	 * @param opCode Op Code
	 * @return {@code true}:Op Code is Read, {@code false}:Op Code is not Read
	 */
	public boolean isOpCodeRead(int opCode) {
		return opCode == OP_CODE_READ;
	}

	/**
	 * @param opCode Op Code
	 * @return {@code true}:Op Code is Write, {@code false}:Op Code is not Write
	 */
	public boolean isOpCodeWrite(int opCode) {
		return opCode == OP_CODE_WRITE;
	}

	/**
	 * @param opCode Op Code
	 * @return {@code true}:Op Code is Abort, {@code false}:Op Code is not Abort
	 */
	public boolean isOpCodeAbort(int opCode) {
		return opCode == OP_CODE_ABORT;
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
	 * @return Size
	 */
	public long getSize() {
		return mSize;
	}

	/**
	 * @return Type
	 */
	@NonNull
	public byte[] getType() {
		return mType;
	}

	/**
	 * @return Offset
	 */
	public long getOffset() {
		return mOffset;
	}

	/**
	 * @return Length
	 */
	public long getLength() {
		return mLength;
	}

	/**
	 * @return Parameter
	 */
	@NonNull
	public byte[] getParameter() {
		return mParameter;
	}

	/**
	 * @return Mode
	 */
	public int getMode() {
		return mMode;
	}

	/**
	 * @return {@code true}:Mode Truncate False, {@code false}:Mode Truncate True
	 */
	public boolean isModeTruncateFalse() {
		return (MODE_TRUNCATE_MASK & mMode) == MODE_TRUNCATE_FALSE;
	}

	/**
	 * @return {@code true}:Mode Truncate True, {@code false}:Mode Truncate False
	 */
	public boolean isModeTruncateTrue() {
		return (MODE_TRUNCATE_MASK & mMode) == MODE_TRUNCATE_TRUE;
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
	 * @return {@code true}:Result Code is Insufficient Resources,
	 *         {@code false}:Result Code is not Insufficient Resources
	 */
	public boolean isResultCodeInsufficientResources() {
		return mResultCode == RESULT_CODE_INSUFFICIENT_RESOUCES;
	}

	/**
	 * @return {@code true}:Result Code is Invalid Object, {@code false}:Result Code
	 *         is not Invalid Object
	 */
	public boolean isResultCodeInvalidObject() {
		return mResultCode == RESULT_CODE_INVALID_OBJECT;
	}

	/**
	 * @return {@code true}:Result Code is Channel Unavailable, {@code false}:Result
	 *         Code is not Channel Unavailable
	 */
	public boolean isResultCodeChannelUnavailable() {
		return mResultCode == RESULT_CODE_CHANNEL_UNAVAILABLE;
	}

	/**
	 * @return {@code true}:Result Code is Unsupported Type, {@code false}:Result
	 *         Code is not Unsupported Type
	 */
	public boolean isResultCodeUnsupportedType() {
		return mResultCode == RESULT_CODE_UNSUPPORTED_TYPE;
	}

	/**
	 * @return {@code true}:Result Code is Procedure Not Permitted,
	 *         {@code false}:Result Code is not Procedure Not Permitted
	 */
	public boolean isResultCodeProcedureNotPermitted() {
		return mResultCode == RESULT_CODE_PROCEDURE_NOT_PERMITTED;
	}

	/**
	 * @return {@code true}:Result Code is Object Locked, {@code false}:Result Code
	 *         is not Object Locked
	 */
	public boolean isResultCodeObjectLocked() {
		return mResultCode == RESULT_CODE_OBJECT_LOCKED;
	}

	/**
	 * @return {@code true}:Result Code is Operation Failed, {@code false}:Result
	 *         Code is not Operation Failed
	 */
	public boolean isResultCodeOperationFailedd() {
		return mResultCode == RESULT_CODE_OPERATION_FAILED;
	}

	/**
	 * @return Checksum
	 */
	public long getChecksum() {
		return mChecksum;
	}

	/**
	 * @return Response Parameter
	 */
	@NonNull
	public byte[] getResponseParameter() {
		return mResponseParameter;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@NonNull
	public byte[] getBytes() {
		int length = 1;
		byte[] data = new byte[10 + mParameter.length + mResponseParameter.length];
		ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
		byteBuffer.put((byte) mOpCode);
		if (isOpCodeCreate(mOpCode)) {
			byteBuffer.putInt((int) mSize);
			length += 4;
			byteBuffer.put(mType);
			length += mType.length;
		} else if (isOpCodeCalculateChecksum(mOpCode)) {
			byteBuffer.putInt((int) mOffset);
			byteBuffer.putInt((int) mLength);
			length += 8;
		} else if (isOpCodeExecute(mOpCode)) {
			byteBuffer.put(mParameter);
			length += mParameter.length;
		} else if (isOpCodeRead(mOpCode)) {
			byteBuffer.putInt((int) mOffset);
			byteBuffer.putInt((int) mLength);
			length += 8;
		} else if (isOpCodeWrite(mOpCode)) {
			byteBuffer.putInt((int) mOffset);
			byteBuffer.putInt((int) mLength);
			byteBuffer.put((byte) mMode);
			length += 9;
		} else if (isOpCodeResponseCode(mOpCode)) {
			byteBuffer.put((byte) mRequestOpCode);
			byteBuffer.put((byte) mResultCode);
			length += 2;
			if (isOpCodeCalculateChecksum(mRequestOpCode)) {
				if (isResultCodeSuccess()) {
					byteBuffer.putInt((int) mChecksum);
					length += 4;
				}
			} else if (isOpCodeExecute(mRequestOpCode)) {
				byteBuffer.put(mResponseParameter);
				length += mResponseParameter.length;
			}
		}
		return Arrays.copyOfRange(data, 0, length);
	}

}
