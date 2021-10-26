package org.im97mori.ble.characteristic.u2b1b;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Volume Flow (Characteristics UUID: 0x2B1B)
 */
public class VolumeFlow implements ByteArrayInterface {

    /**
     * 0xFFFF : A raw value of 0xFFFF represents ‘value is not known’
     */
    public static final int VOLUME_FLOW_VALUE_IS_NOT_KNOWN = 0xFFFF;

    /**
     * Unit is liter/second with a resolution of .001 (1 milliliter)
     */
    public static final double VOLUME_FLOW_VALUE_UNIT = 0.001d;

    /**
     * Volume Flow Minimum value
     */
    public static final double VOLUME_FLOW_VALUE_MINIMUM = 0.0d;

    /**
     * Volume Flow Maximum value
     */
    public static final double VOLUME_FLOW_VALUE_MAXIMUM = 65.534d;

    /**
     * Volume Flow
     */
    private final int mVolumeFlow;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public VolumeFlow(@NonNull byte[] values) {
        mVolumeFlow = BLEUtils.createUInt16(values, 0);
    }

    /**
     * Constructor from parameters
     * 
     * @param volumeFlow Volume Flow
     */
    public VolumeFlow(int volumeFlow) {
        mVolumeFlow = volumeFlow;
    }

    /**
     * @return Volume Flow
     */
    public int getVolumeFlow() {
        return mVolumeFlow;
    }

    /**
     * @return {@code true}:Volume Flow value is not known, {@code false}:has Volume Flow value information
     * @see #VOLUME_FLOW_VALUE_IS_NOT_KNOWN
     */
    public boolean isVolumeFlowValueIsNotKnown() {
        return VOLUME_FLOW_VALUE_IS_NOT_KNOWN == mVolumeFlow;
    }

    /**
     * @return Volume Flow
     */
    public double getVolumeFlowLitterPerSecond() {
        double volumeFlowLitterPerSecond = mVolumeFlow * VOLUME_FLOW_VALUE_UNIT;
        if (volumeFlowLitterPerSecond < VOLUME_FLOW_VALUE_MINIMUM) {
            volumeFlowLitterPerSecond = VOLUME_FLOW_VALUE_MINIMUM;
        } else if (volumeFlowLitterPerSecond > VOLUME_FLOW_VALUE_MAXIMUM) {
            volumeFlowLitterPerSecond = VOLUME_FLOW_VALUE_MAXIMUM;
        }
        return volumeFlowLitterPerSecond;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mVolumeFlow);
        return data;
    }

}
