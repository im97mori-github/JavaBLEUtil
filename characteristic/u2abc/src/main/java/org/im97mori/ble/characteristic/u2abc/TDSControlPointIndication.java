package org.im97mori.ble.characteristic.u2abc;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * TDS Control Point Indication (Characteristics UUID: 0x2ABC)
 */
public class TDSControlPointIndication implements ByteArrayInterface {

    /**
     * Requested Op Code
     */
    private final int mRequestedOpCode;

    /**
     * Result Code
     */
    private final int mResultCode;

    /**
     * Response Parameter
     */
    private final byte[] mResponseParameter;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2ABC
     */
    public TDSControlPointIndication(@NonNull byte[] values) {
        mRequestedOpCode = BLEUtils.createUInt8(values, 0);
        mResultCode = BLEUtils.createUInt8(values, 1);
        if (values.length > 2) {
            mResponseParameter = Arrays.copyOfRange(values, 2, values.length);
        } else {
            mResponseParameter = new byte[0];
        }
    }

    /**
     * @return Requested Op Code
     */
    public int getRequestedOpCode() {
        return mRequestedOpCode;
    }

    /**
     * @return Result Code
     */
    public int getResultCode() {
        return mResultCode;
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
        byte[] data = new byte[2 + mResponseParameter.length];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mRequestedOpCode);
        byteBuffer.put((byte) mResultCode);
        byteBuffer.put(mResponseParameter);
        return data;
    }

}
