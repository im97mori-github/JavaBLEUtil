package org.im97mori.ble.characteristic.u2a17;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Time Update State (Characteristics UUID: 0x2A17)
 */
public class TimeUpdateState implements ByteArrayInterface {

    /**
     * 0: Idle
     */
    public static final int CURRENT_STATE_IDLE = 0;

    /**
     * 1: Update Pending
     */
    public static final int CURRENT_STATE_UPDATE_PENDING = 1;

    /**
     * 0: Successful
     */
    public static final int RESULT_SUCCESSFUL = 0;

    /**
     * 1: Canceled
     */
    public static final int RESULT_CANCELED = 1;

    /**
     * 2: No Connection To Reference
     */
    public static final int RESULT_NO_CONNECTION_TO_REFERENCE = 2;

    /**
     * 3: Reference responded with an error
     */
    public static final int RESULT_REFERENCE_RESPONDED_WITH_AN_ERROR = 3;

    /**
     * 4: Timeout
     */
    public static final int RESULT_TIMEOUT = 4;

    /**
     * 5: Update not attempted after reset
     */
    public static final int RESULT_UPDATE_NOT_ATTEMPTED_AFTER_RESET = 5;

    /**
     * Current State
     */
    private final int mCurrentState;

    /**
     * Result
     */
    private final int mResult;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A17
     */
    public TimeUpdateState(@NonNull byte[] values) {
        mCurrentState = (values[0] & 0xff);
        mResult = (values[1] & 0xff);
    }

    /**
     * Constructor from parameters
     * 
     * @param currentState Current State
     * @param result       Result
     */
    public TimeUpdateState(int currentState, int result) {
        mCurrentState = currentState;
        mResult = result;
    }

    /**
     * @return Current State
     */
    public int getCurrentState() {
        return mCurrentState;
    }

    /**
     * @return {@code true}:Idle, {@code false}:Update Pending
     */
    public boolean isCurrentStateIdle() {
        return CURRENT_STATE_IDLE == mCurrentState;
    }

    /**
     * @return {@code true}:Update Pending, {@code false}:Idle
     */
    public boolean isCurrentStateUpdatePending() {
        return CURRENT_STATE_UPDATE_PENDING == mCurrentState;
    }

    /**
     * @return Result
     */
    public int getResult() {
        return mResult;
    }

    /**
     * @return {@code true}:Successful, {@code false}:not Successful
     */
    public boolean isResultSuccessful() {
        return RESULT_SUCCESSFUL == mResult;
    }

    /**
     * @return {@code true}:Canceled, {@code false}:not Canceled
     */
    public boolean isResultCanceled() {
        return RESULT_CANCELED == mResult;
    }

    /**
     * @return {@code true}:No Connection To Reference, {@code false}:not No Connection To Reference
     */
    public boolean isResultNoConnectionToReference() {
        return RESULT_NO_CONNECTION_TO_REFERENCE == mResult;
    }

    /**
     * @return {@code true}:Reference responded with an error, {@code false}:not Reference responded with an error
     */
    public boolean isResultReferenceRespondedWithAnError() {
        return RESULT_REFERENCE_RESPONDED_WITH_AN_ERROR == mResult;
    }

    /**
     * @return {@code true}:Timeout, {@code false}:not Timeout
     */
    public boolean isResultTimeout() {
        return RESULT_TIMEOUT == mResult;
    }

    /**
     * @return {@code true}:Update not attempted after reset, {@code false}:not Update not attempted after reset
     */
    public boolean isResultUpdateNotAttemptedAfterReset() {
        return RESULT_UPDATE_NOT_ATTEMPTED_AFTER_RESET == mResult;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mCurrentState);
        byteBuffer.put((byte) mResult);
        return data;
    }

}
