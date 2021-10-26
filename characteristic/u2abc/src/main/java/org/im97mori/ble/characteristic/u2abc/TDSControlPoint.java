package org.im97mori.ble.characteristic.u2abc;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * TDS Control Point (Characteristics UUID: 0x2ABC)
 */
public class TDSControlPoint implements ByteArrayInterface {

    /**
     * Op Code
     */
    private final int mOpCode;

    /**
     * Organization ID
     */
    private final int mOrganizationId;

    /**
     * Parameter
     */
    private final byte[] mParameter;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public TDSControlPoint(@NonNull byte[] values) {
        mOpCode = BLEUtils.createUInt8(values, 0);
        mOrganizationId = BLEUtils.createUInt8(values, 1);
        if (values.length > 2) {
            mParameter = Arrays.copyOfRange(values, 2, values.length);
        } else {
            mParameter = new byte[0];
        }
    }

    /**
     * Constructor from parameters
     * 
     * @param opCode         Op Code
     * @param organizationId Organization ID
     * @param parameter      Parameter
     */
    public TDSControlPoint(int opCode, int organizationId, @NonNull byte[] parameter) {
        mOpCode = opCode;
        mOrganizationId = organizationId;
        mParameter = parameter;
    }

    /**
     * @return Op Code
     */
    public int getOpCode() {
        return mOpCode;
    }

    /**
     * @return Organization ID
     */
    public int getOrganizationId() {
        return mOrganizationId;
    }

    /**
     * @return Parameter
     */
    @NonNull
    public byte[] getParameter() {
        return mParameter;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[2 + mParameter.length];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mOpCode);
        byteBuffer.put((byte) mOrganizationId);
        byteBuffer.put(mParameter);
        return data;
    }

}
