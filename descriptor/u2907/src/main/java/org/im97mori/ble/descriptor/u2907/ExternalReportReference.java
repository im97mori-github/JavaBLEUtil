package org.im97mori.ble.descriptor.u2907;

import static org.im97mori.ble.BLEUtils.BASE_UUID;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.UUID;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * External Report Reference (Descriptor UUID: 0x2907)
 */
public class ExternalReportReference implements ByteArrayInterface {

    /**
     * External Report Reference
     */
    private final byte[] mExternalReportReference;

    /**
     * External Report Reference UUID
     */
    private final UUID mUuid;

    /**
     * Constructor from {@link BluetoothGattDescriptor}
     *
     * @param bluetoothGattDescriptor Characteristics UUID: 0x2907
     */
    public ExternalReportReference(@NonNull byte[] values) {
        mExternalReportReference = Arrays.copyOfRange(values, 0, 2);

        // combine with BASE UUID
        long target = mExternalReportReference[0] & 0xff;
        target |= (mExternalReportReference[1] & 0xff) << 8;
        target = target << 32;
        mUuid = new UUID(BASE_UUID.getMostSignificantBits() | target, BASE_UUID.getLeastSignificantBits());
    }

    /**
     * Constructor from parameters
     * 
     * @param externalReportReference External Report Reference
     * @param uuid                    External Report Reference UUID
     */
    public ExternalReportReference(@NonNull byte[] externalReportReference, @NonNull UUID uuid) {
        mExternalReportReference = externalReportReference;
        mUuid = uuid;
    }

    /**
     * @return External Report Reference
     */
    @NonNull
    public byte[] getExternalReportReference() {
        return mExternalReportReference;
    }

    /**
     * @return External Report Reference UUID
     */
    @NonNull
    public UUID getExternalReportReferenceUuid() {
        return mUuid;
    }

    /**
     * {@inheritDoc}
     */
    @NonNull
    @Override
    public byte[] getBytes() {
        byte[] data = new byte[2];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put(mExternalReportReference);
        return data;
    }

}
