package org.im97mori.ble.characteristic.u2a55;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * SC Control Point (Characteristics UUID: 0x2A55)
 */
public class SCControlPoint implements ByteArrayInterface {

    /**
     * 1: Set Cumulative Value
     */
    public static final int OP_CODE_SET_CUMULATIVE_VALUE = 1;

    /**
     * 2: Start Sensor Calibration
     */
    public static final int OP_CODE_START_SENSOR_CALIBRATION = 2;

    /**
     * 3: Update Sensor Location
     */
    public static final int OP_CODE_UPDATE_SENSOR_LOCATION = 3;

    /**
     * 4: Request Supported Sensor Locations
     */
    public static final int OP_CODE_REQUEST_SUPPORTED_SENSOR_LOCATIONS = 4;

    /**
     * 5: Response Code
     */
    public static final int OP_CODE_RESPONSE_CODE = 16;

    /**
     * 1: Success (Response Parameter: None, except for Op Code 0x04, see Note below)
     */
    public static final int RESPONSE_VALUE_SUCCESS = 1;

    /**
     * 2: Op Code not supported (Response Parameter: N/A)
     */
    public static final int RESPONSE_VALUE_OP_CODE_NOT_SUPPORTED = 2;

    /**
     * 3: Invalid Parameter (Response Parameter: None)
     */
    public static final int RESPONSE_VALUE_INVALID_PARAMETER = 3;

    /**
     * 4: Operation Failed (Response Parameter: None)
     */
    public static final int RESPONSE_VALUE_OPERATION_FAILED = 4;

    /**
     * Op Code
     */
    private final int mOpCode;

    /**
     * Cumulative Value
     */
    private final long mCumulativeValue;

    /**
     * Sensor Location Value
     */
    private final int mSensorLocationValue;

    /**
     * Request Op Code
     */
    private final int mRequestOpCode;

    /**
     * Response Value
     */
    private final int mResponseValue;

    /**
     * Response Parameter
     */
    private final byte[] mResponseParameter;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A55
     */
    public SCControlPoint(@NonNull byte[] values) {
        mOpCode = (values[0] & 0xff);
        if (isOpCodeSetCumulativeValue(mOpCode)) {
            mCumulativeValue = BLEUtils.createUInt32(values, 1);
            mSensorLocationValue = 0;
            mRequestOpCode = 0;
            mResponseValue = 0;
            mResponseParameter = new byte[0];
        } else if (isOpCodeStartSensorCalibration(mOpCode)) {
            mCumulativeValue = 0;
            mSensorLocationValue = 0;
            mRequestOpCode = 0;
            mResponseValue = 0;
            mResponseParameter = new byte[0];
        } else if (isOpCodeUpdateSensorLocation(mOpCode)) {
            mCumulativeValue = 0;
            mSensorLocationValue = (values[1] & 0xff);
            mRequestOpCode = 0;
            mResponseValue = 0;
            mResponseParameter = new byte[0];
        } else if (isOpCodeRequestSupportedSensorLocations(mOpCode)) {
            mCumulativeValue = 0;
            mSensorLocationValue = 0;
            mRequestOpCode = 0;
            mResponseValue = 0;
            mResponseParameter = new byte[0];
        } else if (isOpCodeResponseCode(mOpCode)) {
            mCumulativeValue = 0;
            mSensorLocationValue = 0;
            mRequestOpCode = (values[1] & 0xff);
            mResponseValue = (values[2] & 0xff);
            if (isOpCodeSetCumulativeValue(mRequestOpCode)) {
                mResponseParameter = new byte[0];
            } else if (isOpCodeStartSensorCalibration(mRequestOpCode)) {
                mResponseParameter = new byte[0];
            } else if (isOpCodeUpdateSensorLocation(mRequestOpCode)) {
                mResponseParameter = new byte[0];
            } else if (isOpCodeRequestSupportedSensorLocations(mRequestOpCode)) {
                if (isResponseValueSuccess()) {
                    mResponseParameter = Arrays.copyOfRange(values, 3, values.length);
                } else {
                    mResponseParameter = new byte[0];
                }
            } else {
                mResponseParameter = new byte[0];
            }
        } else {
            mCumulativeValue = 0;
            mSensorLocationValue = 0;
            mRequestOpCode = 0;
            mResponseValue = 0;
            mResponseParameter = new byte[0];
        }
    }

    /**
     * Constructor from parameters
     * 
     * @param opCode              Op Code
     * @param cumulativeValue     Cumulative Value
     * @param sensorLocationValue Sensor Location Value
     * @param requestOpCode       Request Op Code
     * @param responseValue       Response Value
     * @param responseParameter   Response Parameter
     */
    public SCControlPoint(int opCode, long cumulativeValue, int sensorLocationValue, int requestOpCode, int responseValue, byte[] responseParameter) {
        mOpCode = opCode;
        mCumulativeValue = cumulativeValue;
        mSensorLocationValue = sensorLocationValue;
        mRequestOpCode = requestOpCode;
        mResponseValue = responseValue;
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
     * @return {@code true}:Set Cumulative Value, {@code false}:not Set Cumulative Value
     */
    public boolean isOpCodeSetCumulativeValue(int opCode) {
        return OP_CODE_SET_CUMULATIVE_VALUE == opCode;
    }

    /**
     * @param opCode Op Code
     * @return {@code true}:Start Sensor Calibration, {@code false}:not Start Sensor Calibration
     */
    public boolean isOpCodeStartSensorCalibration(int opCode) {
        return OP_CODE_START_SENSOR_CALIBRATION == opCode;
    }

    /**
     * @param opCode Op Code
     * @return {@code true}:Update Sensor Location, {@code false}:not Update Sensor Location
     */
    public boolean isOpCodeUpdateSensorLocation(int opCode) {
        return OP_CODE_UPDATE_SENSOR_LOCATION == opCode;
    }

    /**
     * @param opCode Op Code
     * @return {@code true}:Request Supported Sensor Locations, {@code false}:not Request Supported Sensor Locations
     */
    public boolean isOpCodeRequestSupportedSensorLocations(int opCode) {
        return OP_CODE_REQUEST_SUPPORTED_SENSOR_LOCATIONS == opCode;
    }

    /**
     * @param opCode Op Code
     * @return {@code true}:Response Code, {@code false}:not Response Code
     */
    public boolean isOpCodeResponseCode(int opCode) {
        return OP_CODE_RESPONSE_CODE == opCode;
    }

    /**
     * @return Cumulative Value
     */
    public long getCumulativeValue() {
        return mCumulativeValue;
    }

    /**
     * @return Sensor Location Value
     */
    public int getSensorLocationValue() {
        return mSensorLocationValue;
    }

    /**
     * @return Request Op Code
     */
    public int getRequestOpCode() {
        return mRequestOpCode;
    }

    /**
     * @return Response Value
     */
    public int getResponseValue() {
        return mResponseValue;
    }

    /**
     * @return {@code true}:Success, {@code false}:not Success
     */
    public boolean isResponseValueSuccess() {
        return RESPONSE_VALUE_SUCCESS == mResponseValue;
    }

    /**
     * @return {@code true}:Op Code not supported, {@code false}:not Op Code not supported
     */
    public boolean isResponseValueOpCodeNotSupported() {
        return RESPONSE_VALUE_OP_CODE_NOT_SUPPORTED == mResponseValue;
    }

    /**
     * @return {@code true}:Invalid Parameter, {@code false}:not Invalid Parameter
     */
    public boolean isResponseValueInvalidParameter() {
        return RESPONSE_VALUE_INVALID_PARAMETER == mResponseValue;
    }

    /**
     * @return {@code true}:Operation Failed, {@code false}:not Operation Failed
     */
    public boolean isResponseValueOperationFailed() {
        return RESPONSE_VALUE_OPERATION_FAILED == mResponseValue;
    }

    /**
     * @return Response Parameter
     */
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
        byte[] data = new byte[8 + mResponseParameter.length];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mOpCode);
        if (isOpCodeSetCumulativeValue(mOpCode)) {
            byteBuffer.putInt((int) mCumulativeValue);
            length += 4;
        } else if (isOpCodeUpdateSensorLocation(mOpCode)) {
            byteBuffer.put((byte) mSensorLocationValue);
            length++;
        } else if (isOpCodeResponseCode(mOpCode)) {
            byteBuffer.put((byte) mRequestOpCode);
            length++;
            byteBuffer.put((byte) mResponseValue);
            length++;
            if (isOpCodeRequestSupportedSensorLocations(mRequestOpCode)) {
                if (isResponseValueSuccess()) {
                    byteBuffer.put(mResponseParameter);
                    length += mResponseParameter.length;
                }
            }
        }
        return Arrays.copyOfRange(data, 0, length);
    }

}
