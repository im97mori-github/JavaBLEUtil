package org.im97mori.ble.characteristic.u2a9f;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * User Control Point (Characteristics UUID: 0x2A9F)
 */
public class UserControlPoint implements ByteArrayInterface {

    /**
     * 0x01: Register New User
     */
    public static final int OP_CODE_REGISTER_NEW_USER = 0x01;

    /**
     * 0x02: Consent
     */
    public static final int OP_CODE_CONSENT = 0x02;

    /**
     * 0x03: Delete User Data
     */
    public static final int OP_CODE_DELETE_USER_DATA = 0x03;

    /**
     * 0x04: List All Users
     */
    public static final int OP_CODE_LIST_ALL_USERS = 0x04;

    /**
     * 0x05: Delete User(s)
     */
    public static final int OP_CODE_DELETE_USERS = 0x05;

    /**
     * 0x20: Response Code
     */
    public static final int OP_CODE_RESPONSE_CODE = 0x20;

    /**
     * 0x01: Success
     */
    public static final int RESPONSE_VALUE_SUCCESS = 0x01;

    /**
     * 0x02: Op Code not supported
     */
    public static final int RESPONSE_VALUE_OP_CODE_NOT_SUPPORTED = 0x02;

    /**
     * 0x03: Invalid Parameter
     */
    public static final int RESPONSE_VALUE_INVALID_PARAMETER = 0x03;

    /**
     * 0x04: Operation Failed
     */
    public static final int RESPONSE_VALUE_OPERATION_FAILED = 0x04;

    /**
     * 0x05: User Not Authorized
     */
    public static final int RESPONSE_VALUE_USER_NOT_AUTHORIZED = 0x05;

    /**
     * Op Code
     */
    private final int mOpCode;

    /**
     * User Index
     */
    private final int mUserIndex;

    /**
     * Consent Code
     */
    private final int mConsentCode;

    /**
     * Request Op Code
     */
    private final int mRequestOpCode;

    /**
     * Response Value
     */
    private final int mResponseValue;

    /**
     * Number of users
     */
    private final int mNumberOfUsers;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public UserControlPoint(@NonNull byte[] values) {
        mOpCode = (values[0] & 0xff);
        if (isOpCodeRegisterNewUser(mOpCode)) {
            mUserIndex = 0;
            mConsentCode = BLEUtils.createUInt16(values, 1);
            mRequestOpCode = 0;
            mResponseValue = 0;
            mNumberOfUsers = 0;
        } else if (isOpCodeConsent(mOpCode)) {
            mUserIndex = BLEUtils.createUInt8(values, 1);
            mConsentCode = BLEUtils.createUInt16(values, 2);
            mRequestOpCode = 0;
            mResponseValue = 0;
            mNumberOfUsers = 0;
        } else if (isOpCodeDeleteUsers(mOpCode)) {
            mUserIndex = BLEUtils.createUInt8(values, 1);
            mConsentCode = 0;
            mRequestOpCode = 0;
            mResponseValue = 0;
            mNumberOfUsers = 0;
        } else if (isOpCodeResponseCode(mOpCode)) {
            mConsentCode = 0;
            mRequestOpCode = BLEUtils.createUInt8(values, 1);
            mResponseValue = BLEUtils.createUInt8(values, 2);
            if (isResponseValueSuccess(mResponseValue)) {
                if (isOpCodeRegisterNewUser(mRequestOpCode)) {
                    mUserIndex = BLEUtils.createUInt8(values, 3);
                    mNumberOfUsers = 0;
                } else if (isOpCodeListAllUsers(mRequestOpCode)) {
                    mUserIndex = 0;
                    mNumberOfUsers = BLEUtils.createUInt8(values, 3);
                } else if (isOpCodeDeleteUsers(mRequestOpCode)) {
                    mUserIndex = BLEUtils.createUInt8(values, 3);
                    mNumberOfUsers = 0;
                } else {
                    mUserIndex = 0;
                    mNumberOfUsers = 0;
                }
            } else {
                mUserIndex = 0;
                mNumberOfUsers = 0;
            }
        } else {
            mUserIndex = 0;
            mConsentCode = 0;
            mRequestOpCode = 0;
            mResponseValue = 0;
            mNumberOfUsers = 0;
        }
    }

    /**
     * Constructor from parameters
     * 
     * @param opCode        Op Code
     * @param userIndex     User Index
     * @param consentCode   Consent Code
     * @param requestOpCode Request Op Code
     * @param responseValue Response Value
     * @param numberOfUsers Number of users
     */
    public UserControlPoint(int opCode, int userIndex, int consentCode, int requestOpCode, int responseValue, int numberOfUsers) {
        mOpCode = opCode;
        mUserIndex = userIndex;
        mConsentCode = consentCode;
        mRequestOpCode = requestOpCode;
        mResponseValue = responseValue;
        mNumberOfUsers = numberOfUsers;
    }

    /**
     * @return Op Code
     */
    public int getOpCode() {
        return mOpCode;
    }

    /**
     * @param opCode Op Code
     * @return {@code true}:Register New User, {@code false}:not Register New User
     */
    public boolean isOpCodeRegisterNewUser(int opCode) {
        return OP_CODE_REGISTER_NEW_USER == opCode;
    }

    /**
     * @param opCode Op Code
     * @return {@code true}:Consent, {@code false}:not Consent
     */
    public boolean isOpCodeConsent(int opCode) {
        return OP_CODE_CONSENT == opCode;
    }

    /**
     * @param opCode Op Code
     * @return {@code true}:Delete User Data, {@code false}:not Delete User Data
     */
    public boolean isOpCodeDeleteUserData(int opCode) {
        return OP_CODE_DELETE_USER_DATA == opCode;
    }

    /**
     * @param opCode Op Code
     * @return {@code true}:List All Users, {@code false}:not List All Users
     */
    public boolean isOpCodeListAllUsers(int opCode) {
        return OP_CODE_LIST_ALL_USERS == opCode;
    }

    /**
     * @param opCode Op Code
     * @return {@code true}:Delete User(s), {@code false}:not Delete User(s)
     */
    public boolean isOpCodeDeleteUsers(int opCode) {
        return OP_CODE_DELETE_USERS == opCode;
    }

    /**
     * @param opCode Op Code
     * @return {@code true}:Response Code, {@code false}:not Response Code
     */
    public boolean isOpCodeResponseCode(int opCode) {
        return OP_CODE_RESPONSE_CODE == opCode;
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
     * @return Number of users
     */
    public int getNumberOfUsers() {
        return mNumberOfUsers;
    }

    /**
     * @param responseValue Response Value
     * @return {@code true}:Success, {@code false}:not Success
     */
    public boolean isResponseValueSuccess(int responseValue) {
        return RESPONSE_VALUE_SUCCESS == responseValue;
    }

    /**
     * @param responseValue Response Value
     * @return {@code true}:Op Code not supported, {@code false}:not Op Code not supported
     */
    public boolean isResponseValueOpCodeNotSupported(int responseValue) {
        return RESPONSE_VALUE_OP_CODE_NOT_SUPPORTED == responseValue;
    }

    /**
     * @param responseValue Response Value
     * @return {@code true}:Invalid Parameter, {@code false}:not Invalid Parameter
     */
    public boolean isResponseValueInvalidParameter(int responseValue) {
        return RESPONSE_VALUE_INVALID_PARAMETER == responseValue;
    }

    /**
     * @param responseValue Response Value
     * @return {@code true}:Operation Failed, {@code false}:not Operation Failed
     */
    public boolean isResponseValueOperationFailed(int responseValue) {
        return RESPONSE_VALUE_OPERATION_FAILED == responseValue;
    }

    /**
     * @param responseValue Response Value
     * @return {@code true}:User Not Authorized, {@code false}:not User Not Authorized
     */
    public boolean isResponseValueUserNotAuthorized(int responseValue) {
        return RESPONSE_VALUE_USER_NOT_AUTHORIZED == responseValue;
    }

    /**
     * @return User Index
     */
    public int getUserIndex() {
        return mUserIndex;
    }

    /**
     * @return Consent Code
     */
    public int getConsentCode() {
        return mConsentCode;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        int length = 1;
        byte[] data = new byte[8];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mOpCode);
        if (isOpCodeRegisterNewUser(mOpCode)) {
            byteBuffer.putShort((short) mConsentCode);
            length += 2;
        } else if (isOpCodeConsent(mOpCode)) {
            byteBuffer.put((byte) mUserIndex);
            byteBuffer.putShort((short) mConsentCode);
            length += 3;
        } else if (isOpCodeDeleteUsers(mOpCode)) {
            byteBuffer.put((byte) mUserIndex);
            length++;
        } else if (isOpCodeResponseCode(mOpCode)) {
            byteBuffer.put((byte) mRequestOpCode);
            byteBuffer.put((byte) mResponseValue);
            length += 2;
            if (isResponseValueSuccess(mResponseValue)) {
                if (isOpCodeRegisterNewUser(mRequestOpCode)) {
                    byteBuffer.put((byte) mUserIndex);
                    length++;
                } else if (isOpCodeListAllUsers(mRequestOpCode)) {
                    byteBuffer.put((byte) mNumberOfUsers);
                    length++;
                } else if (isOpCodeDeleteUsers(mRequestOpCode)) {
                    byteBuffer.put((byte) mUserIndex);
                    length++;
                }
            }
        }
        return Arrays.copyOfRange(data, 0, length);
    }

}
