package org.im97mori.ble.characteristic.u2a05;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Service Changed (Characteristics UUID: 0x2A05)
 */
public class ServiceChanged implements ByteArrayInterface {

    /**
     * Start of Affected Attribute Handle Range
     */
    private final int mStartOfAffectedAttributeHandleRange;

    /**
     * End of Affected Attribute Handle Range
     */
    private final int mEndOfAffectedAttributeHandleRange;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public ServiceChanged(@NonNull byte[] values) {
        mStartOfAffectedAttributeHandleRange = BLEUtils.createUInt16(values, 0);
        mEndOfAffectedAttributeHandleRange = BLEUtils.createUInt16(values, 2);
    }

    /**
     * Constructor from parameters
     * 
     * @param startOfAffectedAttributeHandleRange Start of Affected Attribute Handle Range
     * @param endOfAffectedAttributeHandleRange   End of Affected Attribute Handle Range
     */
    public ServiceChanged(int startOfAffectedAttributeHandleRange, int endOfAffectedAttributeHandleRange) {
        mStartOfAffectedAttributeHandleRange = startOfAffectedAttributeHandleRange;
        mEndOfAffectedAttributeHandleRange = endOfAffectedAttributeHandleRange;
    }

    /**
     * @return Start of Affected Attribute Handle Range
     */
    public int getStartOfAffectedAttributeHandleRange() {
        return mStartOfAffectedAttributeHandleRange;
    }

    /**
     * @return End of Affected Attribute Handle Range
     */
    public int getEndOfAffectedAttributeHandleRange() {
        return mEndOfAffectedAttributeHandleRange;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[4];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putShort((short) mStartOfAffectedAttributeHandleRange);
        byteBuffer.putShort((short) mEndOfAffectedAttributeHandleRange);
        return data;
    }

}
