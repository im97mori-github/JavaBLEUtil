package org.im97mori.ble.characteristic.u2b02;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Mass Flow (Characteristics UUID: 0x2B02)
 */
public class MassFlow implements ByteArrayInterface {

    /**
     * 0xFFFF : A value of 0xFFFF represents ‘value is not known’
     */
    public static final int MASS_FLOW_VALUE_IS_NOT_KNOWN = 0xFFFF;

    /**
     * Mass Flow Minimum value
     */
    public static final int MASS_FLOW_VALUE_MINIMUM = 0;

    /**
     * Mass Flow Maximum value
     */
    public static final int MASS_FLOW_VALUE_MAXIMUM = 65534;

    /**
     * Mass Flow
     */
    private final int mMassFlow;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public MassFlow(@NonNull byte[] values) {
        mMassFlow = BLEUtils.createUInt16(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param massFlow Mass Flow
     */
    public MassFlow(int massFlow) {
        mMassFlow = massFlow;
    }

    /**
     * @return Mass Flow
     */
    public int getMassFlow() {
        return mMassFlow;
    }

    /**
     * @return {@code true}:Mass Flow value is not known, {@code false}:has Mass Flow value information
     * @see #MASS_FLOW_VALUE_IS_NOT_KNOWN
     */
    public boolean isMassFlowValueIsNotKnown() {
        return MASS_FLOW_VALUE_IS_NOT_KNOWN == mMassFlow;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mMassFlow);
        byteBuffer.put((byte) (mMassFlow >> 8));
        return data;
    }

}
