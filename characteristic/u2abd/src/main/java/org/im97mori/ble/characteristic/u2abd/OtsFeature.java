package org.im97mori.ble.characteristic.u2abd;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * OTS Feature (Characteristics UUID: 0x2ABD)
 */
public class OtsFeature implements ByteArrayInterface {

	/**
	 * @see #OACP_CREATE_OP_CODE_SUPPORTED_FALSE
	 * @see #OACP_CREATE_OP_CODE_SUPPORTED_TRUE
	 */
	public static final int OACP_CREATE_OP_CODE_SUPPORTED_MASK = 0b00000000_00000000_00000000_00000001;

	/**
	 * 0: OACP Create Op Code not Supported
	 */
	public static final int OACP_CREATE_OP_CODE_SUPPORTED_FALSE = 0b00000000_00000000_00000000_00000000;

	/**
	 * 1: OACP Create Op Code Supported
	 */
	public static final int OACP_CREATE_OP_CODE_SUPPORTED_TRUE = 0b00000000_00000000_00000000_00000001;

	/**
	 * @see #OACP_DELETE_OP_CODE_SUPPORTED_FALSE
	 * @see #OACP_DELETE_OP_CODE_SUPPORTED_TRUE
	 */
	public static final int OACP_DELETE_OP_CODE_SUPPORTED_MASK = 0b00000000_00000000_00000000_00000010;

	/**
	 * 0: OACP Delete Op Code not Supported
	 */
	public static final int OACP_DELETE_OP_CODE_SUPPORTED_FALSE = 0b00000000_00000000_00000000_00000000;

	/**
	 * 1: OACP Delete Op Code Supported
	 */
	public static final int OACP_DELETE_OP_CODE_SUPPORTED_TRUE = 0b00000000_00000000_00000000_00000010;

	/**
	 * @see #OACP_CALCULATE_OP_CODE_SUPPORTED_FALSE
	 * @see #OACP_CALCULATE_OP_CODE_SUPPORTED_TRUE
	 */
	public static final int OACP_CALCULATE_OP_CODE_SUPPORTED_MASK = 0b00000000_00000000_00000000_00000100;

	/**
	 * 0: OACP Calculate Op Code not Supported
	 */
	public static final int OACP_CALCULATE_OP_CODE_SUPPORTED_FALSE = 0b00000000_00000000_00000000_00000000;

	/**
	 * 1: OACP Calculate Op Code Supported
	 */
	public static final int OACP_CALCULATE_OP_CODE_SUPPORTED_TRUE = 0b00000000_00000000_00000000_00000100;

	/**
	 * @see #OACP_EXECUTE_OP_CODE_SUPPORTED_FALSE
	 * @see #OACP_EXECUTE_OP_CODE_SUPPORTED_TRUE
	 */
	public static final int OACP_EXECUTE_OP_CODE_SUPPORTED_MASK = 0b00000000_00000000_00000000_00001000;

	/**
	 * 0: OACP Execute Op Code not Supported
	 */
	public static final int OACP_EXECUTE_OP_CODE_SUPPORTED_FALSE = 0b00000000_00000000_00000000_00000000;

	/**
	 * 1: OACP Execute Op Code Supported
	 */
	public static final int OACP_EXECUTE_OP_CODE_SUPPORTED_TRUE = 0b00000000_00000000_00000000_00001000;

	/**
	 * @see #OACP_READ_OP_CODE_SUPPORTED_FALSE
	 * @see #OACP_READ_OP_CODE_SUPPORTED_TRUE
	 */
	public static final int OACP_READ_OP_CODE_SUPPORTED_MASK = 0b00000000_00000000_00000000_00010000;

	/**
	 * 0: OACP Read Op Code not Supported
	 */
	public static final int OACP_READ_OP_CODE_SUPPORTED_FALSE = 0b00000000_00000000_00000000_00000000;

	/**
	 * 1: OACP Read Op Code Supported
	 */
	public static final int OACP_READ_OP_CODE_SUPPORTED_TRUE = 0b00000000_00000000_00000000_00010000;

	/**
	 * @see #OACP_WRITE_OP_CODE_SUPPORTED_FALSE
	 * @see #OACP_WRITE_OP_CODE_SUPPORTED_TRUE
	 */
	public static final int OACP_WRITE_OP_CODE_SUPPORTED_MASK = 0b00000000_00000000_00000000_00100000;

	/**
	 * 0: OACP Write Op Code not Supported
	 */
	public static final int OACP_WRITE_OP_CODE_SUPPORTED_FALSE = 0b00000000_00000000_00000000_00000000;

	/**
	 * 1: OACP Write Op Code Supported
	 */
	public static final int OACP_WRITE_OP_CODE_SUPPORTED_TRUE = 0b00000000_00000000_00000000_00100000;

	/**
	 * @see #APPENDING_ADDITIONAL_DATA_TO_OBJECTS_SUPPORTED_FALSE
	 * @see #APPENDING_ADDITIONAL_DATA_TO_OBJECTS_SUPPORTED_TRUE
	 */
	public static final int APPENDING_ADDITIONAL_DATA_TO_OBJECTS_SUPPORTED_MASK = 0b00000000_00000000_00000000_01000000;

	/**
	 * 0: Appending Additional Data to Objects not Supported
	 */
	public static final int APPENDING_ADDITIONAL_DATA_TO_OBJECTS_SUPPORTED_FALSE = 0b00000000_00000000_00000000_00000000;

	/**
	 * 1: Appending Additional Data to Objects Supported
	 */
	public static final int APPENDING_ADDITIONAL_DATA_TO_OBJECTS_SUPPORTED_TRUE = 0b00000000_00000000_00000000_01000000;

	/**
	 * @see #TRUNCATION_OF_OBJECTS_SUPPORTED_FALSE
	 * @see #TRUNCATION_OF_OBJECTS_SUPPORTED_TRUE
	 */
	public static final int TRUNCATION_OF_OBJECTS_SUPPORTED_MASK = 0b00000000_00000000_00000000_10000000;

	/**
	 * 0: Truncation of Objects not Supported
	 */
	public static final int TRUNCATION_OF_OBJECTS_SUPPORTED_FALSE = 0b00000000_00000000_00000000_00000000;

	/**
	 * 1: Truncation of Objects Supported
	 */
	public static final int TRUNCATION_OF_OBJECTS_SUPPORTED_TRUE = 0b00000000_00000000_00000000_10000000;

	/**
	 * @see #PATCHING_OF_OBJECTS_SUPPORTED_FALSE
	 * @see #PATCHING_OF_OBJECTS_SUPPORTED_TRUE
	 */
	public static final int PATCHING_OF_OBJECTS_SUPPORTED_MASK = 0b00000000_00000000_00000001_00000000;

	/**
	 * 0: Patching of Objects not Supported
	 */
	public static final int PATCHING_OF_OBJECTS_SUPPORTED_FALSE = 0b00000000_00000000_00000000_00000000;

	/**
	 * 1: Patching of Objects Supported
	 */
	public static final int PATCHING_OF_OBJECTS_SUPPORTED_TRUE = 0b00000000_00000000_00000001_00000000;

	/**
	 * @see #OACP_ABORT_OP_CODE_SUPPORTED_FALSE
	 * @see #OACP_ABORT_OP_CODE_SUPPORTED_TRUE
	 */
	public static final int OACP_ABORT_OP_CODE_SUPPORTED_MASK = 0b00000000_00000000_00000010_00000000;

	/**
	 * 0: OACP Abort Op Code not Supported
	 */
	public static final int OACP_ABORT_OP_CODE_SUPPORTED_FALSE = 0b00000000_00000000_00000000_00000000;

	/**
	 * 1: OACP Abort Op Code Supported
	 */
	public static final int OACP_ABORT_OP_CODE_SUPPORTED_TRUE = 0b00000000_00000000_00000010_00000000;

	/**
	 * @see #OLCP_GO_TO_OP_CODE_SUPPORTED_FALSE
	 * @see #OLCP_GO_TO_OP_CODE_SUPPORTED_TRUE
	 */
	public static final int OLCP_GO_TO_OP_CODE_SUPPORTED_MASK = 0b00000000_00000000_00000000_00000001;

	/**
	 * 0: OLCP Go To Op Code not Supported
	 */
	public static final int OLCP_GO_TO_OP_CODE_SUPPORTED_FALSE = 0b00000000_00000000_00000000_00000000;

	/**
	 * 1: OLCP Go To Op Code Supported
	 */
	public static final int OLCP_GO_TO_OP_CODE_SUPPORTED_TRUE = 0b00000000_00000000_00000000_00000001;

	/**
	 * @see #OLCP_ORDER_OP_CODE_SUPPORTED_FALSE
	 * @see #OLCP_ORDER_OP_CODE_SUPPORTED_TRUE
	 */
	public static final int OLCP_ORDER_OP_CODE_SUPPORTED_MASK = 0b00000000_00000000_00000000_00000010;

	/**
	 * 0: OLCP Order Op Code not Supported
	 */
	public static final int OLCP_ORDER_OP_CODE_SUPPORTED_FALSE = 0b00000000_00000000_00000000_00000000;

	/**
	 * 1: OLCP Order Op Code Supported
	 */
	public static final int OLCP_ORDER_OP_CODE_SUPPORTED_TRUE = 0b00000000_00000000_00000000_00000010;

	/**
	 * @see #OLCP_REQUEST_NUMBER_OF_OBJECTS_CODE_SUPPORTED_FALSE
	 * @see #OLCP_REQUEST_NUMBER_OF_OBJECTS_CODE_SUPPORTED_TRUE
	 */
	public static final int OLCP_REQUEST_NUMBER_OF_OBJECTS_CODE_SUPPORTED_MASK = 0b00000000_00000000_00000000_00000100;

	/**
	 * 0: OLCP Request Number of Objects Op Code not Supported
	 */
	public static final int OLCP_REQUEST_NUMBER_OF_OBJECTS_CODE_SUPPORTED_FALSE = 0b00000000_00000000_00000000_00000000;

	/**
	 * 1: OLCP Request Number of Objects Op Code Supported
	 */
	public static final int OLCP_REQUEST_NUMBER_OF_OBJECTS_CODE_SUPPORTED_TRUE = 0b00000000_00000000_00000000_00000100;

	/**
	 * @see #OLCP_CLEAR_MARKING_CODE_SUPPORTED_FALSE
	 * @see #OLCP_CLEAR_MARKING_CODE_SUPPORTED_TRUE
	 */
	public static final int OLCP_CLEAR_MARKING_CODE_SUPPORTED_MASK = 0b00000000_00000000_00000000_00001000;

	/**
	 * 0: OLCP Clear Marking Op Code not Supported
	 */
	public static final int OLCP_CLEAR_MARKING_CODE_SUPPORTED_FALSE = 0b00000000_00000000_00000000_00000000;

	/**
	 * 1: OLCP Clear Marking Op Code Supported
	 */
	public static final int OLCP_CLEAR_MARKING_CODE_SUPPORTED_TRUE = 0b00000000_00000000_00000000_00001000;

	/**
	 * OACP Features
	 */
	private final byte[] mOacpFeatures;

	/**
	 * OLCP Features
	 */
	private final byte[] mOlcpFeatures;

	/**
	 * Constructor from byte array
	 *
	 * @param values byte array from <a href=
	 *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
	 */
	public OtsFeature(@NonNull byte[] values) {
		mOacpFeatures = Arrays.copyOfRange(values, 0, 4);
		mOlcpFeatures = Arrays.copyOfRange(values, 4, 8);
	}

	/**
	 * Constructor from flags
	 * 
	 * @param isOacpCreateOpCodeSupported                 {@code true}:{@link #OACP_CREATE_OP_CODE_SUPPORTED_TRUE},
	 *                                                    {@code false}:{@link #OACP_CREATE_OP_CODE_SUPPORTED_FALSE}
	 * @param isOacpDeleteOpCodeSupported                 {@code true}:{@link #OACP_DELETE_OP_CODE_SUPPORTED_TRUE},
	 *                                                    {@code false}:{@link #OACP_DELETE_OP_CODE_SUPPORTED_FALSE}
	 * @param isOacpCalculateOpCodeSupported              {@code true}:{@link #OACP_CALCULATE_OP_CODE_SUPPORTED_TRUE},
	 *                                                    {@code false}:{@link #OACP_CALCULATE_OP_CODE_SUPPORTED_FALSE}
	 * @param isOacpExecuteOpCodeSupported                {@code true}:{@link #OACP_EXECUTE_OP_CODE_SUPPORTED_TRUE},
	 *                                                    {@code false}:{@link #OACP_EXECUTE_OP_CODE_SUPPORTED_FALSE}
	 * @param isOacpReadOpCodeSupported                   {@code true}:{@link #OACP_READ_OP_CODE_SUPPORTED_TRUE},
	 *                                                    {@code false}:{@link #OACP_READ_OP_CODE_SUPPORTED_FALSE}
	 * @param isOacpWriteOpCodeSupported                  {@code true}:{@link #OACP_WRITE_OP_CODE_SUPPORTED_TRUE},
	 *                                                    {@code false}:{@link #OACP_WRITE_OP_CODE_SUPPORTED_FALSE}
	 * @param isAppendingAdditionalDataToObjectsSupported {@code true}:{@link #APPENDING_ADDITIONAL_DATA_TO_OBJECTS_SUPPORTED_TRUE},
	 *                                                    {@code false}:{@link #APPENDING_ADDITIONAL_DATA_TO_OBJECTS_SUPPORTED_FALSE}
	 * @param isTruncationOfObjectsSupported              {@code true}:{@link #TRUNCATION_OF_OBJECTS_SUPPORTED_TRUE},
	 *                                                    {@code false}:{@link #TRUNCATION_OF_OBJECTS_SUPPORTED_FALSE}
	 * @param isPatchingOfObjectsSupported                {@code true}:{@link #PATCHING_OF_OBJECTS_SUPPORTED_TRUE},
	 *                                                    {@code false}:{@link #PATCHING_OF_OBJECTS_SUPPORTED_FALSE}
	 * @param isOacpAbortOpCodeSupported                  {@code true}:{@link #OACP_ABORT_OP_CODE_SUPPORTED_TRUE},
	 *                                                    {@code false}:{@link #OACP_ABORT_OP_CODE_SUPPORTED_FALSE}
	 * @param isOlcpGoToOpCodeSupported                   {@code true}:{@link #OLCP_GO_TO_OP_CODE_SUPPORTED_TRUE},
	 *                                                    {@code false}:{@link #OLCP_GO_TO_OP_CODE_SUPPORTED_FALSE}
	 * @param isOlcpOrderOpCodeSupported                  {@code true}:{@link #OLCP_ORDER_OP_CODE_SUPPORTED_TRUE},
	 *                                                    {@code false}:{@link #OLCP_ORDER_OP_CODE_SUPPORTED_FALSE}
	 * @param isOlcpRequestNumberOfObjectsOpCodeSupported {@code true}:{@link #OLCP_REQUEST_NUMBER_OF_OBJECTS_CODE_SUPPORTED_TRUE},
	 *                                                    {@code false}:{@link #OLCP_REQUEST_NUMBER_OF_OBJECTS_CODE_SUPPORTED_FALSE}
	 * @param isOlcpClearMarkingOpCodeSupported           {@code true}:{@link #OLCP_CLEAR_MARKING_CODE_SUPPORTED_TRUE},
	 *                                                    {@code false}:{@link #OLCP_CLEAR_MARKING_CODE_SUPPORTED_FALSE}
	 */
	// @formatter:off
    public OtsFeature(boolean isOacpCreateOpCodeSupported
    		, boolean isOacpDeleteOpCodeSupported
    		, boolean isOacpCalculateOpCodeSupported
    		, boolean isOacpExecuteOpCodeSupported
    		, boolean isOacpReadOpCodeSupported
    		, boolean isOacpWriteOpCodeSupported
    		, boolean isAppendingAdditionalDataToObjectsSupported
    		, boolean isTruncationOfObjectsSupported
    		, boolean isPatchingOfObjectsSupported
    		, boolean isOacpAbortOpCodeSupported
    		, boolean isOlcpGoToOpCodeSupported
    		, boolean isOlcpOrderOpCodeSupported
    		, boolean isOlcpRequestNumberOfObjectsOpCodeSupported
    		, boolean isOlcpClearMarkingOpCodeSupported) {
        int flags = (isOacpCreateOpCodeSupported ? OACP_CREATE_OP_CODE_SUPPORTED_TRUE : OACP_CREATE_OP_CODE_SUPPORTED_FALSE)
        		| (isOacpDeleteOpCodeSupported ? OACP_DELETE_OP_CODE_SUPPORTED_TRUE : OACP_DELETE_OP_CODE_SUPPORTED_FALSE)
                | (isOacpCalculateOpCodeSupported ? OACP_CALCULATE_OP_CODE_SUPPORTED_TRUE : OACP_CALCULATE_OP_CODE_SUPPORTED_FALSE)
                | (isOacpExecuteOpCodeSupported ? OACP_EXECUTE_OP_CODE_SUPPORTED_TRUE : OACP_EXECUTE_OP_CODE_SUPPORTED_FALSE)
                | (isOacpReadOpCodeSupported ? OACP_READ_OP_CODE_SUPPORTED_TRUE : OACP_READ_OP_CODE_SUPPORTED_FALSE)
                | (isOacpWriteOpCodeSupported ? OACP_WRITE_OP_CODE_SUPPORTED_TRUE : OACP_WRITE_OP_CODE_SUPPORTED_FALSE)
                | (isAppendingAdditionalDataToObjectsSupported ? APPENDING_ADDITIONAL_DATA_TO_OBJECTS_SUPPORTED_TRUE : APPENDING_ADDITIONAL_DATA_TO_OBJECTS_SUPPORTED_FALSE)
        		| (isTruncationOfObjectsSupported ? TRUNCATION_OF_OBJECTS_SUPPORTED_TRUE : TRUNCATION_OF_OBJECTS_SUPPORTED_FALSE)
				| (isPatchingOfObjectsSupported ? PATCHING_OF_OBJECTS_SUPPORTED_TRUE : PATCHING_OF_OBJECTS_SUPPORTED_FALSE)
				| (isOacpAbortOpCodeSupported ? OACP_ABORT_OP_CODE_SUPPORTED_TRUE : OACP_ABORT_OP_CODE_SUPPORTED_FALSE);
        mOacpFeatures = new byte[] { (byte) flags, (byte) (flags >> 8), (byte) (flags >> 16), (byte) (flags >> 24) };

        flags = (isOlcpGoToOpCodeSupported ? OLCP_GO_TO_OP_CODE_SUPPORTED_TRUE : OLCP_GO_TO_OP_CODE_SUPPORTED_FALSE)
        		| (isOlcpOrderOpCodeSupported ? OLCP_ORDER_OP_CODE_SUPPORTED_TRUE : OLCP_ORDER_OP_CODE_SUPPORTED_FALSE)
                | (isOlcpRequestNumberOfObjectsOpCodeSupported ? OLCP_REQUEST_NUMBER_OF_OBJECTS_CODE_SUPPORTED_TRUE : OLCP_REQUEST_NUMBER_OF_OBJECTS_CODE_SUPPORTED_FALSE)
                | (isOlcpClearMarkingOpCodeSupported ? OLCP_CLEAR_MARKING_CODE_SUPPORTED_TRUE : OLCP_CLEAR_MARKING_CODE_SUPPORTED_FALSE);
        mOlcpFeatures = new byte[] { (byte) flags, (byte) (flags >> 8), (byte) (flags >> 16), (byte) (flags >> 24) };
        // @formatter:on
	}

	/**
	 * @return OACP Features
	 */
	public byte[] getOacpFeatures() {
		return mOacpFeatures;
	}

	/**
	 * @return {@code true}:OACP Create Op Code not Supported, {@code false}:OACP
	 *         Create Op Code Supported
	 */
	public boolean isOacpCreateOpCodeNotSupported() {
		return isOacpFeaturesMatched(OACP_CREATE_OP_CODE_SUPPORTED_MASK, OACP_CREATE_OP_CODE_SUPPORTED_FALSE);
	}

	/**
	 * @return {@code true}:OACP Create Op Code Supported, {@code false}:OACP Create
	 *         Op Code not Supported
	 */
	public boolean isOacpCreateOpCodeSupported() {
		return isOacpFeaturesMatched(OACP_CREATE_OP_CODE_SUPPORTED_MASK, OACP_CREATE_OP_CODE_SUPPORTED_TRUE);
	}

	/**
	 * @return {@code true}:OACP Delete Op Code not Supported, {@code false}:OACP
	 *         Delete Op Code Supported
	 */
	public boolean isOacpDeleteOpCodeNotSupported() {
		return isOacpFeaturesMatched(OACP_DELETE_OP_CODE_SUPPORTED_MASK, OACP_DELETE_OP_CODE_SUPPORTED_FALSE);
	}

	/**
	 * @return {@code true}:OACP Delete Op Code Supported, {@code false}:OACP Delete
	 *         Op Code not Supported
	 */
	public boolean isOacpDeleteOpCodeSupported() {
		return isOacpFeaturesMatched(OACP_DELETE_OP_CODE_SUPPORTED_MASK, OACP_DELETE_OP_CODE_SUPPORTED_TRUE);
	}

	/**
	 * @return {@code true}:OACP Calculate Op Code not Supported, {@code false}:OACP
	 *         Calculate Op Code Supported
	 */
	public boolean isOacpCalculateOpCodeNotSupported() {
		return isOacpFeaturesMatched(OACP_CALCULATE_OP_CODE_SUPPORTED_MASK, OACP_CALCULATE_OP_CODE_SUPPORTED_FALSE);
	}

	/**
	 * @return {@code true}:OACP Calculate Op Code Supported, {@code false}:OACP
	 *         Calculate Op Code not Supported
	 */
	public boolean isOacpCalculateOpCodeSupported() {
		return isOacpFeaturesMatched(OACP_CALCULATE_OP_CODE_SUPPORTED_MASK, OACP_CALCULATE_OP_CODE_SUPPORTED_TRUE);
	}

	/**
	 * @return {@code true}:OACP Execute Op Code not Supported, {@code false}:OACP
	 *         Execute Op Code Supported
	 */
	public boolean isOacpExecuteOpCodeNotSupported() {
		return isOacpFeaturesMatched(OACP_EXECUTE_OP_CODE_SUPPORTED_MASK, OACP_EXECUTE_OP_CODE_SUPPORTED_FALSE);
	}

	/**
	 * @return {@code true}:OACP Execute Op Code Supported, {@code false}:OACP
	 *         Execute Op Code not Supported
	 */
	public boolean isOacpExecuteOpCodeSupported() {
		return isOacpFeaturesMatched(OACP_EXECUTE_OP_CODE_SUPPORTED_MASK, OACP_EXECUTE_OP_CODE_SUPPORTED_TRUE);
	}

	/**
	 * @return {@code true}:OACP Read Op Code not Supported, {@code false}:OACP Read
	 *         Op Code Supported
	 */
	public boolean isOacpReadOpCodeNotSupported() {
		return isOacpFeaturesMatched(OACP_READ_OP_CODE_SUPPORTED_MASK, OACP_READ_OP_CODE_SUPPORTED_FALSE);
	}

	/**
	 * @return {@code true}:OACP Read Op Code Supported, {@code false}:OACP Read Op
	 *         Code not Supported
	 */
	public boolean isOacpReadOpCodeSupported() {
		return isOacpFeaturesMatched(OACP_READ_OP_CODE_SUPPORTED_MASK, OACP_READ_OP_CODE_SUPPORTED_TRUE);
	}

	/**
	 * @return {@code true}:OACP Write Op Code not Supported, {@code false}:OACP
	 *         Write Op Code Supported
	 */
	public boolean isOacpWriteOpCodeNotSupported() {
		return isOacpFeaturesMatched(OACP_WRITE_OP_CODE_SUPPORTED_MASK, OACP_WRITE_OP_CODE_SUPPORTED_FALSE);
	}

	/**
	 * @return {@code true}:OACP Write Op Code Supported, {@code false}:OACP Write
	 *         Op Code not Supported
	 */
	public boolean isOacpWriteOpCodeSupported() {
		return isOacpFeaturesMatched(OACP_WRITE_OP_CODE_SUPPORTED_MASK, OACP_WRITE_OP_CODE_SUPPORTED_TRUE);
	}

	/**
	 * @return {@code true}:Appending Additional Data to Objects not Supported,
	 *         {@code false}:Appending Additional Data to Objects Supported
	 */
	public boolean isAppendingAdditionalDataToObjectsNotSupported() {
		return isOacpFeaturesMatched(APPENDING_ADDITIONAL_DATA_TO_OBJECTS_SUPPORTED_MASK,
				APPENDING_ADDITIONAL_DATA_TO_OBJECTS_SUPPORTED_FALSE);
	}

	/**
	 * @return {@code true}:Appending Additional Data to Objects Supported,
	 *         {@code false}:Appending Additional Data to Objects not Supported
	 */
	public boolean isAppendingAdditionalDataToObjectsSupported() {
		return isOacpFeaturesMatched(APPENDING_ADDITIONAL_DATA_TO_OBJECTS_SUPPORTED_MASK,
				APPENDING_ADDITIONAL_DATA_TO_OBJECTS_SUPPORTED_TRUE);
	}

	/**
	 * @return {@code true}:Truncation of Objects Supported,
	 *         {@code false}:Truncation of Objects Supported
	 */
	public boolean isTruncationOfObjectsNotSupported() {
		return isOacpFeaturesMatched(TRUNCATION_OF_OBJECTS_SUPPORTED_MASK, TRUNCATION_OF_OBJECTS_SUPPORTED_FALSE);
	}

	/**
	 * @return {@code true}:Truncation of Objects Supported,
	 *         {@code false}:Truncation of Objects Supported
	 */
	public boolean isTruncationOfObjectsSupported() {
		return isOacpFeaturesMatched(TRUNCATION_OF_OBJECTS_SUPPORTED_MASK, TRUNCATION_OF_OBJECTS_SUPPORTED_TRUE);
	}

	/**
	 * @return {@code true}:Patching of Objects not Supported,
	 *         {@code false}:Patching of Objects Supported
	 */
	public boolean isPatchingOfObjectsNotSupported() {
		return isOacpFeaturesMatched(PATCHING_OF_OBJECTS_SUPPORTED_MASK, PATCHING_OF_OBJECTS_SUPPORTED_FALSE);
	}

	/**
	 * @return {@code true}:Patching of Objects Supported, {@code false}:Patching of
	 *         Objects not Supported
	 */
	public boolean isPatchingOfObjectsSupported() {
		return isOacpFeaturesMatched(PATCHING_OF_OBJECTS_SUPPORTED_MASK, PATCHING_OF_OBJECTS_SUPPORTED_TRUE);
	}

	/**
	 * @return {@code true}:OACP Abort Op Code not Supported, {@code false}:OACP
	 *         Abort Op Code Supported
	 */
	public boolean isOacpAbortOpCodeNotSupported() {
		return isOacpFeaturesMatched(OACP_ABORT_OP_CODE_SUPPORTED_MASK, OACP_ABORT_OP_CODE_SUPPORTED_FALSE);
	}

	/**
	 * @return {@code true}:OACP Abort Op Code Supported, {@code false}:OACP Abort
	 *         Op Code not Supported
	 */
	public boolean isOacpAbortOpCodeSupported() {
		return isOacpFeaturesMatched(OACP_ABORT_OP_CODE_SUPPORTED_MASK, OACP_ABORT_OP_CODE_SUPPORTED_TRUE);
	}

	/**
	 * @return OLCP Features
	 */
	public byte[] getOlcpFeatures() {
		return mOlcpFeatures;
	}

	/**
	 * @return {@code true}:OLCP Go To Op Code not Supported, {@code false}:OLCP Go
	 *         To Op Code Supported
	 */
	public boolean isOlcpGoToOpCodeNotSupported() {
		return isOlcpFeaturesMatched(OLCP_GO_TO_OP_CODE_SUPPORTED_MASK, OLCP_GO_TO_OP_CODE_SUPPORTED_FALSE);
	}

	/**
	 * @return {@code true}:OLCP Go To Op Code Supported, {@code false}:OLCP Go To
	 *         Op Code not Supported
	 */
	public boolean isOlcpGoToOpCodeSupported() {
		return isOlcpFeaturesMatched(OLCP_GO_TO_OP_CODE_SUPPORTED_MASK, OLCP_GO_TO_OP_CODE_SUPPORTED_TRUE);
	}

	/**
	 * @return {@code true}:OLCP Order Op Code Supported, {@code false}:OLCP Order
	 *         Op Code Supported
	 */
	public boolean isOlcpOrderOpCodeNotSupported() {
		return isOlcpFeaturesMatched(OLCP_ORDER_OP_CODE_SUPPORTED_MASK, OLCP_ORDER_OP_CODE_SUPPORTED_FALSE);
	}

	/**
	 * @return {@code true}:OLCP Order Op Code Supported, {@code false}:OLCP Order
	 *         Op Code Supported
	 */
	public boolean isOlcpOrderOpCodeSupported() {
		return isOlcpFeaturesMatched(OLCP_ORDER_OP_CODE_SUPPORTED_MASK, OLCP_ORDER_OP_CODE_SUPPORTED_TRUE);
	}

	/**
	 * @return {@code true}:OLCP Request Number of Objects Op Code not Supported,
	 *         {@code false}:OLCP Request Number of Objects Op Code Supported
	 */
	public boolean isOlcpRequestNumberOfObjectsOpCodeNotSupported() {
		return isOlcpFeaturesMatched(OLCP_REQUEST_NUMBER_OF_OBJECTS_CODE_SUPPORTED_MASK,
				OLCP_REQUEST_NUMBER_OF_OBJECTS_CODE_SUPPORTED_FALSE);
	}

	/**
	 * @return {@code true}:OLCP Request Number of Objects Op Code Supported,
	 *         {@code false}:OLCP Request Number of Objects Op Code Supported
	 */
	public boolean isOlcpRequestNumberOfObjectsOpCodeSupported() {
		return isOlcpFeaturesMatched(OLCP_REQUEST_NUMBER_OF_OBJECTS_CODE_SUPPORTED_MASK,
				OLCP_REQUEST_NUMBER_OF_OBJECTS_CODE_SUPPORTED_TRUE);
	}

	/**
	 * @return {@code true}:OLCP Clear Marking Op Code not Supported,
	 *         {@code false}:OLCP Clear Marking Op Code Supported
	 */
	public boolean isOlcpClearMarkingOpCodeNotSupported() {
		return isOlcpFeaturesMatched(OLCP_CLEAR_MARKING_CODE_SUPPORTED_MASK, OLCP_CLEAR_MARKING_CODE_SUPPORTED_FALSE);
	}

	/**
	 * @return {@code true}:OLCP Clear Marking Op Code Supported, {@code false}:OLCP
	 *         Clear Marking Op Code not Supported
	 */
	public boolean isOlcpClearMarkingOpCodeSupported() {
		return isOlcpFeaturesMatched(OLCP_CLEAR_MARKING_CODE_SUPPORTED_MASK, OLCP_CLEAR_MARKING_CODE_SUPPORTED_TRUE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@NonNull
	public byte[] getBytes() {
		byte[] data = new byte[8];
		ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
		byteBuffer.put(mOacpFeatures);
		byteBuffer.put(mOlcpFeatures);
		return data;
	}

	/**
	 * check OACP Features
	 *
	 * @param mask   bitmask for expect
	 * @param expect one of {@link #OACP_CREATE_OP_CODE_SUPPORTED_FALSE}
	 *               {@link #OACP_CREATE_OP_CODE_SUPPORTED_TRUE}
	 *               {@link #OACP_DELETE_OP_CODE_SUPPORTED_FALSE}
	 *               {@link #OACP_DELETE_OP_CODE_SUPPORTED_TRUE}
	 *               {@link #OACP_CALCULATE_OP_CODE_SUPPORTED_FALSE}
	 *               {@link #OACP_CALCULATE_OP_CODE_SUPPORTED_TRUE}
	 *               {@link #OACP_EXECUTE_OP_CODE_SUPPORTED_FALSE}
	 *               {@link #OACP_EXECUTE_OP_CODE_SUPPORTED_TRUE}
	 *               {@link #OACP_READ_OP_CODE_SUPPORTED_FALSE}
	 *               {@link #OACP_READ_OP_CODE_SUPPORTED_TRUE}
	 *               {@link #OACP_WRITE_OP_CODE_SUPPORTED_FALSE}
	 *               {@link #OACP_WRITE_OP_CODE_SUPPORTED_TRUE}
	 *               {@link #APPENDING_ADDITIONAL_DATA_TO_OBJECTS_SUPPORTED_FALSE}
	 *               {@link #APPENDING_ADDITIONAL_DATA_TO_OBJECTS_SUPPORTED_TRUE}
	 *               {@link #TRUNCATION_OF_OBJECTS_SUPPORTED_FALSE}
	 *               {@link #TRUNCATION_OF_OBJECTS_SUPPORTED_TRUE}
	 *               {@link #PATCHING_OF_OBJECTS_SUPPORTED_FALSE}
	 *               {@link #PATCHING_OF_OBJECTS_SUPPORTED_TRUE}
	 *               {@link #OACP_ABORT_OP_CODE_SUPPORTED_FALSE}
	 *               {@link #OACP_ABORT_OP_CODE_SUPPORTED_TRUE}
	 * @return {@code true}:same as expect, {@code false}:not match
	 */
	private boolean isOacpFeaturesMatched(int mask, int expect) {
		return (mask & BLEUtils.createSInt32(mOacpFeatures, 0)) == expect;
	}

	/**
	 * check OLCP Features
	 *
	 * @param mask   bitmask for expect
	 * @param expect one of {@link #OLCP_GO_TO_OP_CODE_SUPPORTED_FALSE}
	 *               {@link #OLCP_GO_TO_OP_CODE_SUPPORTED_TRUE}
	 *               {@link #OLCP_ORDER_OP_CODE_SUPPORTED_FALSE}
	 *               {@link #OLCP_ORDER_OP_CODE_SUPPORTED_TRUE}
	 *               {@link #OLCP_REQUEST_NUMBER_OF_OBJECTS_CODE_SUPPORTED_FALSE}
	 *               {@link #OLCP_REQUEST_NUMBER_OF_OBJECTS_CODE_SUPPORTED_TRUE}
	 *               {@link #OLCP_CLEAR_MARKING_CODE_SUPPORTED_FALSE}
	 *               {@link #OLCP_CLEAR_MARKING_CODE_SUPPORTED_TRUE}
	 * @return {@code true}:same as expect, {@code false}:not match
	 */
	private boolean isOlcpFeaturesMatched(int mask, int expect) {
		return (mask & BLEUtils.createSInt32(mOlcpFeatures, 0)) == expect;
	}

}
