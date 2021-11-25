package org.im97mori.ble.characteristic.u2a52;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Record Access Control Point (Characteristics UUID: 0x2A52)
 */
public class RecordAccessControlPoint implements ByteArrayInterface {

	/**
	 * 0x01: Report stored records
	 */
	public static final int OP_CODE_REPORT_STORED_RECORDS = 0x01;

	/**
	 * 0x02: Delete stored records
	 */
	public static final int OP_CODE_DELETE_STORED_RECORDS = 0x02;

	/**
	 * 0x03: Abort operation
	 */
	public static final int OP_CODE_ABORT_OPERATION = 0x03;

	/**
	 * 0x04: Report number of stored records
	 */
	public static final int OP_CODE_REPORT_NUMBER_OF_STORED_RECORDS = 0x04;

	/**
	 * 0x05: Number of stored records response
	 */
	public static final int OP_CODE_NUMBER_OF_STORED_RECORDS_RESPONSE = 0x05;

	/**
	 * 0x06: Response Code
	 */
	public static final int OP_CODE_RESPONSE_CODE = 0x06;

	/**
	 * 0x07: Combined Report
	 */
	public static final int OP_CODE_COMBINED_REPORT = 0x07;

	/**
	 * 0x08: Combined Report Response
	 */
	public static final int OP_CODE_COMBINED_REPORT_RESPONSE = 0x08;

	/**
	 * 0x00: Null
	 */
	public static final int OPERATOR_NULL = 0x00;

	/**
	 * 0x01: All records
	 */
	public static final int OPERATOR_ALL_RECORDS = 0x01;

	/**
	 * 0x02: Less than or equal to
	 */
	public static final int OPERATOR_LESS_THAN_OR_EQUAL_TO = 0x02;

	/**
	 * 0x03: Greater than or equal to
	 */
	public static final int OPERATOR_GREATER_THAN_OR_EQUAL_TO = 0x03;

	/**
	 * 0x04: Within range of (inclusive)
	 */
	public static final int OPERATOR_GREATER_WITHIN_RANGE_OF = 0x04;

	/**
	 * 0x05: First record (i.e., oldest record)
	 */
	public static final int OPERATOR_FIRST_RECORD = 0x05;

	/**
	 * 0x06: Last record (i.e., most recent record)
	 */
	public static final int OPERATOR_LAST_RECORD = 0x06;

	/**
	 * 0x00: N/A
	 */
	public static final int KEY_00 = 0x00;

	/**
	 * 0x01: Filter parameters (as appropriate to Operator and Service)
	 */
	public static final int KEY_01 = 0x01;

	/**
	 * 0x02: Filter parameters (as appropriate to Operator and Service)
	 */
	public static final int KEY_02 = 0x02;

	/**
	 * 0x03: Not included
	 */
	public static final int KEY_03 = 0x03;

	/**
	 * 0x04: Filter parameters (as appropriate to Operator and Service)
	 */
	public static final int KEY_04 = 0x04;

	/**
	 * 0x05: Number of Records (Field size defined per service)
	 */
	public static final int KEY_05 = 0x05;

	/**
	 * 0x06: Request Op Code, Response Code Value
	 */
	public static final int KEY_06 = 0x06;

	/**
	 * 0x07: Filter parameters (as appropriate to Operator and Service)
	 */
	public static final int KEY_07 = 0x07;

	/**
	 * 0x08: Number of Records (Field size defined by Service)
	 */
	public static final int KEY_08 = 0x08;

	/**
	 * 0x01: Success
	 */
	public static final int RESPONSE_CODE_SUCCESS = 0x01;

	/**
	 * 0x02: Op Code not supported
	 */
	public static final int RESPONSE_CODE_OP_CODE_NOT_SUPPORTED = 0x02;

	/**
	 * 0x03: Invalid Operator
	 */
	public static final int RESPONSE_CODE_INVALID_OPERATOR = 0x03;

	/**
	 * 0x04: Operator not supported
	 */
	public static final int RESPONSE_CODE_OPERATOR_NOT_SUPPORTED = 0x04;

	/**
	 * 0x05: Invalid Operand
	 */
	public static final int RESPONSE_CODE_INVALID_OPERAND = 0x05;

	/**
	 * 0x06: No records found
	 */
	public static final int RESPONSE_CODE_NO_RECORDS_FOUND = 0x06;

	/**
	 * 0x07: Abort unsuccessful
	 */
	public static final int RESPONSE_CODE_ABORT_UNSUCCESSFUL = 0x07;

	/**
	 * 0x08: Procedure not completed
	 */
	public static final int RESPONSE_CODE_PROCEDURE_NOT_COMPLETED = 0x08;

	/**
	 * 0x09: Operand not supported
	 */
	public static final int RESPONSE_CODE_OPERAND_NOT_SUPPORTED = 0x09;

	/**
	 * Op Code
	 */
	private final int mOpCode;

	/**
	 * Operator
	 */
	private final int mOperator;

	/**
	 * Operand
	 */
	private final byte[] mOperand;

	/**
	 * Constructor from byte array
	 *
	 * @param values byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 */
	public RecordAccessControlPoint(@NonNull byte[] values) {
		mOpCode = BLEUtils.createUInt8(values, 0);
		if (isOpCodeReportStoredRecords(mOpCode)) {
			mOperator = BLEUtils.createUInt8(values, 1);
			if (isOperatorLessThanOrEqualTo()) {
				mOperand = Arrays.copyOfRange(values, 2, values.length);
			} else if (isOperatorGreaterThanOrEqualTo()) {
				mOperand = Arrays.copyOfRange(values, 2, values.length);
			} else if (isOperatorWithinRangeOf()) {
				mOperand = Arrays.copyOfRange(values, 2, values.length);
			} else {
				mOperand = new byte[0];
			}
		} else if (isOpCodeDeleteStoredRecords(mOpCode)) {
			mOperator = BLEUtils.createUInt8(values, 1);
			if (isOperatorLessThanOrEqualTo()) {
				mOperand = Arrays.copyOfRange(values, 2, values.length);
			} else if (isOperatorGreaterThanOrEqualTo()) {
				mOperand = Arrays.copyOfRange(values, 2, values.length);
			} else if (isOperatorWithinRangeOf()) {
				mOperand = Arrays.copyOfRange(values, 2, values.length);
			} else {
				mOperand = new byte[0];
			}
		} else if (isOpCodeAbortOperation(mOpCode)) {
			mOperator = 0;
			mOperand = Arrays.copyOfRange(values, 2, values.length);
		} else if (isOpCodeReportNumberOfStoredRecords(mOpCode)) {
			mOperator = BLEUtils.createUInt8(values, 1);
			if (isOperatorLessThanOrEqualTo()) {
				mOperand = Arrays.copyOfRange(values, 2, values.length);
			} else if (isOperatorGreaterThanOrEqualTo()) {
				mOperand = Arrays.copyOfRange(values, 2, values.length);
			} else if (isOperatorWithinRangeOf()) {
				mOperand = Arrays.copyOfRange(values, 2, values.length);
			} else {
				mOperand = new byte[0];
			}
		} else if (isOpCodeNumberOfStoredRecordsResponse(mOpCode)) {
			mOperator = 0;
			mOperand = Arrays.copyOfRange(values, 2, values.length);
		} else if (isOpCodeResponseCode(mOpCode)) {
			mOperator = 0;
			mOperand = Arrays.copyOfRange(values, 2, values.length);
		} else if (isOpCodeCombinedReport(mOpCode)) {
			mOperator = BLEUtils.createUInt8(values, 1);
			if (isOperatorLessThanOrEqualTo()) {
				mOperand = Arrays.copyOfRange(values, 2, values.length);
			} else if (isOperatorGreaterThanOrEqualTo()) {
				mOperand = Arrays.copyOfRange(values, 2, values.length);
			} else if (isOperatorWithinRangeOf()) {
				mOperand = Arrays.copyOfRange(values, 2, values.length);
			} else {
				mOperand = new byte[0];
			}
		} else if (isOpCodeCombinedReportResponse(mOpCode)) {
			mOperator = 0;
			mOperand = Arrays.copyOfRange(values, 2, values.length);
		} else {
			mOperator = 0;
			mOperand = new byte[0];
		}
	}

	/**
	 * Constructor from parameters
	 * 
	 * @param opCode   Op Code
	 * @param operator Operator
	 * @param operand  Operand
	 */
	public RecordAccessControlPoint(int opCode, int operator, @NonNull byte[] operand) {
		mOpCode = opCode;
		mOperator = operator;
		mOperand = operand;
	}

	/**
	 * @return Op Code
	 */
	public int getOpCode() {
		return mOpCode;
	}

	/**
	 * @param opCode Op Code
	 * @return {@code true}:Report stored records, {@code false}:not Report stored
	 *         records
	 * @see #getOpCode()
	 * @see #getRequestOpCode()
	 */
	public boolean isOpCodeReportStoredRecords(int opCode) {
		return OP_CODE_REPORT_STORED_RECORDS == opCode;
	}

	/**
	 * @param opCode Op Code
	 * @return {@code true}:Delete stored records, {@code false}:not Delete stored
	 *         records
	 * @see #getOpCode()
	 * @see #getRequestOpCode()
	 */
	public boolean isOpCodeDeleteStoredRecords(int opCode) {
		return OP_CODE_DELETE_STORED_RECORDS == opCode;
	}

	/**
	 * @param opCode Op Code
	 * @return {@code true}:Abort operation, {@code false}:not Abort operation
	 * @see #getOpCode()
	 * @see #getRequestOpCode()
	 */
	public boolean isOpCodeAbortOperation(int opCode) {
		return OP_CODE_ABORT_OPERATION == opCode;
	}

	/**
	 * @param opCode Op Code
	 * @return {@code true}:Report number of stored records, {@code false}:not
	 *         Report number of stored records
	 * @see #getOpCode()
	 * @see #getRequestOpCode()
	 */
	public boolean isOpCodeReportNumberOfStoredRecords(int opCode) {
		return OP_CODE_REPORT_NUMBER_OF_STORED_RECORDS == opCode;
	}

	/**
	 * @param opCode Op Code
	 * @return {@code true}:Number of stored records response, {@code false}:not
	 *         Number of stored records response
	 * @see #getOpCode()
	 * @see #getRequestOpCode()
	 */
	public boolean isOpCodeNumberOfStoredRecordsResponse(int opCode) {
		return OP_CODE_NUMBER_OF_STORED_RECORDS_RESPONSE == opCode;
	}

	/**
	 * @param opCode Op Code
	 * @return {@code true}:Response Code, {@code false}:not Response Code
	 * @see #getOpCode()
	 * @see #getRequestOpCode()
	 */
	public boolean isOpCodeResponseCode(int opCode) {
		return OP_CODE_RESPONSE_CODE == opCode;
	}

	/**
	 * @param opCode Op Code
	 * @return {@code true}:Combined Report, {@code false}:not Combined Report
	 * @see #getOpCode()
	 * @see #getRequestOpCode()
	 */
	public boolean isOpCodeCombinedReport(int opCode) {
		return OP_CODE_COMBINED_REPORT == opCode;
	}

	/**
	 * @param opCode Op Code
	 * @return {@code true}:Combined Report Response, {@code false}:not Combined
	 *         Report Response
	 * @see #getOpCode()
	 * @see #getRequestOpCode()
	 */
	public boolean isOpCodeCombinedReportResponse(int opCode) {
		return OP_CODE_COMBINED_REPORT_RESPONSE == opCode;
	}

	/**
	 * @return Operator
	 */
	public int getOperator() {
		return mOperator;
	}

	/**
	 * @return {@code true}:Null, {@code false}:not Null
	 */
	public boolean isOperatorNull() {
		return OPERATOR_NULL == mOperator;
	}

	/**
	 * @return {@code true}:All records, {@code false}:not All records
	 */
	public boolean isOperatorAllRecords() {
		return OPERATOR_ALL_RECORDS == mOperator;
	}

	/**
	 * @return {@code true}:Less than or equal to, {@code false}:not Less than or
	 *         equal to
	 */
	public boolean isOperatorLessThanOrEqualTo() {
		return OPERATOR_LESS_THAN_OR_EQUAL_TO == mOperator;
	}

	/**
	 * @return {@code true}:Greater than or equal to, {@code false}:not Greater than
	 *         or equal to
	 */
	public boolean isOperatorGreaterThanOrEqualTo() {
		return OPERATOR_GREATER_THAN_OR_EQUAL_TO == mOperator;
	}

	/**
	 * @return {@code true}:Within range of (inclusive), {@code false}:not Within
	 *         range of (inclusive)
	 */
	public boolean isOperatorWithinRangeOf() {
		return OPERATOR_GREATER_WITHIN_RANGE_OF == mOperator;
	}

	/**
	 * @return {@code true}:First record, {@code false}:not First record
	 */
	public boolean isOperatorFirstRecord() {
		return OPERATOR_FIRST_RECORD == mOperator;
	}

	/**
	 * @return {@code true}:Last record, {@code false}:not Last record
	 */
	public boolean isOperatorLastRecord() {
		return OPERATOR_LAST_RECORD == mOperator;
	}

	/**
	 * @return Operand
	 */
	public byte[] getOperand() {
		return mOperand;
	}

	/**
	 * @return Operand without key
	 */
	public byte[] getOperandParameter() {
		byte[] operandParameter;
		if (isKey01() || isKey02() || isKey04() || isKey05() || isKey07() || isKey08()) {
			operandParameter = Arrays.copyOfRange(mOperand, 1, mOperand.length);
		} else {
			operandParameter = new byte[0];
		}
		return operandParameter;
	}

	/**
	 * @return key
	 */
	public int getKey() {
		int key;
		if (isOpCodeReportStoredRecords(mOpCode)) {
			if (isOperatorLessThanOrEqualTo()) {
				key = BLEUtils.createUInt8(mOperand, 0);
			} else if (isOperatorGreaterThanOrEqualTo()) {
				key = BLEUtils.createUInt8(mOperand, 0);
			} else if (isOperatorWithinRangeOf()) {
				key = BLEUtils.createUInt8(mOperand, 0);
			} else {
				key = KEY_00;
			}
		} else if (isOpCodeDeleteStoredRecords(mOpCode)) {
			if (isOperatorLessThanOrEqualTo()) {
				key = BLEUtils.createUInt8(mOperand, 0);
			} else if (isOperatorGreaterThanOrEqualTo()) {
				key = BLEUtils.createUInt8(mOperand, 0);
			} else if (isOperatorWithinRangeOf()) {
				key = BLEUtils.createUInt8(mOperand, 0);
			} else {
				key = KEY_00;
			}
		} else if (isOpCodeAbortOperation(mOpCode)) {
			key = BLEUtils.createUInt8(mOperand, 0);
		} else if (isOpCodeReportNumberOfStoredRecords(mOpCode)) {
			if (isOperatorLessThanOrEqualTo()) {
				key = BLEUtils.createUInt8(mOperand, 0);
			} else if (isOperatorGreaterThanOrEqualTo()) {
				key = BLEUtils.createUInt8(mOperand, 0);
			} else if (isOperatorWithinRangeOf()) {
				key = BLEUtils.createUInt8(mOperand, 0);
			} else {
				key = KEY_00;
			}
		} else if (isOpCodeNumberOfStoredRecordsResponse(mOpCode)) {
			key = BLEUtils.createUInt8(mOperand, 0);
		} else if (isOpCodeCombinedReport(mOpCode)) {
			if (isOperatorLessThanOrEqualTo()) {
				key = BLEUtils.createUInt8(mOperand, 0);
			} else if (isOperatorGreaterThanOrEqualTo()) {
				key = BLEUtils.createUInt8(mOperand, 0);
			} else if (isOperatorWithinRangeOf()) {
				key = BLEUtils.createUInt8(mOperand, 0);
			} else {
				key = KEY_00;
			}
		} else if (isOpCodeCombinedReportResponse(mOpCode)) {
			key = BLEUtils.createUInt8(mOperand, 0);
		} else {
			key = KEY_00;
		}
		return key;
	}

	/**
	 * @return {@code true}:{@link #KEY_01}, {@code false}:not {@link #KEY_01}
	 */
	public boolean isKey00() {
		return KEY_00 == getKey();
	}

	/**
	 * @return {@code true}:{@link #KEY_01}, {@code false}:not {@link #KEY_01}
	 */
	public boolean isKey01() {
		return KEY_01 == getKey();
	}

	/**
	 * @return {@code true}:{@link #KEY_02}, {@code false}:not {@link #KEY_02}
	 */
	public boolean isKey02() {
		return KEY_02 == getKey();
	}

	/**
	 * @return {@code true}:{@link #KEY_03}, {@code false}:not {@link #KEY_03}
	 */
	public boolean isKey03() {
		return KEY_03 == getKey();
	}

	/**
	 * @return {@code true}:{@link #KEY_04}, {@code false}:not {@link #KEY_04}
	 */
	public boolean isKey04() {
		return KEY_04 == getKey();
	}

	/**
	 * @return {@code true}:{@link #KEY_05}, {@code false}:not {@link #KEY_05}
	 */
	public boolean isKey05() {
		return KEY_05 == getKey();
	}

	/**
	 * @return {@code true}:{@link #KEY_06}, {@code false}:not {@link #KEY_06}
	 */
	public boolean isKey06() {
		return KEY_06 == getKey();
	}

	/**
	 * @return {@code true}:{@link #KEY_07}, {@code false}:not {@link #KEY_07}
	 */
	public boolean isKey07() {
		return KEY_07 == getKey();
	}

	/**
	 * @return {@code true}:{@link #KEY_08}, {@code false}:not {@link #KEY_08}
	 */
	public boolean isKey08() {
		return KEY_08 == getKey();
	}

	/**
	 * @return Request Op Code or 0
	 * @see #isOpCodeResponseCode(int)
	 */
	public int getRequestOpCode() {
		int responseCode = 0;
		if (isOpCodeResponseCode(mOpCode)) {
			responseCode = BLEUtils.createUInt8(mOperand, 0);
		}
		return responseCode;
	}

	/**
	 * @return Response Code or 0
	 * @see #isOpCodeResponseCode(int)
	 */
	public int getResponseCode() {
		int responseCode = 0;
		if (isOpCodeResponseCode(mOpCode)) {
			responseCode = BLEUtils.createUInt8(mOperand, 1);
		}
		return responseCode;
	}

	/**
	 * @return {@code true}:Success, {@code false}:not Success
	 */
	public boolean isResponseCodeSuccess() {
		return RESPONSE_CODE_SUCCESS == getResponseCode();
	}

	/**
	 * @return {@code true}:Op Code not supported, {@code false}:not Op Code not
	 *         supported
	 */
	public boolean isResponseCodeOpCodeNotSupported() {
		return RESPONSE_CODE_OP_CODE_NOT_SUPPORTED == getResponseCode();
	}

	/**
	 * @return {@code true}:Invalid Operator, {@code false}:not Invalid Operator
	 */
	public boolean isResponseCodeInvalidOperator() {
		return RESPONSE_CODE_INVALID_OPERATOR == getResponseCode();
	}

	/**
	 * @return {@code true}:Operator not supported, {@code false}:not Operator not
	 *         supported
	 */
	public boolean isResponseCodeOperatorNotSupported() {
		return RESPONSE_CODE_OPERATOR_NOT_SUPPORTED == getResponseCode();
	}

	/**
	 * @return {@code true}:Invalid Operand, {@code false}:not Operator Invalid
	 *         Operand
	 */
	public boolean isResponseCodeInvalidOperand() {
		return RESPONSE_CODE_INVALID_OPERAND == getResponseCode();
	}

	/**
	 * @return {@code true}:No records found, {@code false}:not No records found
	 */
	public boolean isResponseCodeNoRecordsFound() {
		return RESPONSE_CODE_NO_RECORDS_FOUND == getResponseCode();
	}

	/**
	 * @return {@code true}:Abort unsuccessful, {@code false}:not Abort unsuccessful
	 */
	public boolean isResponseCodeAbortUnsuccessful() {
		return RESPONSE_CODE_ABORT_UNSUCCESSFUL == getResponseCode();
	}

	/**
	 * @return {@code true}:Procedure not completed, {@code false}:not Procedure not
	 *         completed
	 */
	public boolean isResponseCodeProcedureNotCompleted() {
		return RESPONSE_CODE_PROCEDURE_NOT_COMPLETED == getResponseCode();
	}

	/**
	 * @return {@code true}:Operand not supported, {@code false}:not Operand not
	 *         supported
	 */
	public boolean isResponseCodeOperandNotSupported() {
		return RESPONSE_CODE_OPERAND_NOT_SUPPORTED == getResponseCode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@NonNull
	public byte[] getBytes() {
		int length = 2 + mOperand.length;
		byte[] data = new byte[length];
		ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
		byteBuffer.put((byte) mOpCode);
		byteBuffer.put((byte) mOperator);
		byteBuffer.put(mOperand);
		return Arrays.copyOfRange(data, 0, length);
	}

}
