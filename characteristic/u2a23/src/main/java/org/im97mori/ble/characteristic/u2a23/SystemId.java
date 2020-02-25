package org.im97mori.ble.characteristic.u2a23;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * System ID (Characteristics UUID: 0x2A23)
 */
public class SystemId implements ByteArrayInterface {

    /**
     * Manufacturer Identifier
     */
    private final long mManufacturerIdentifier;

    /**
     * Organizationally Unique Identifier
     */
    private final int mOrganizationallyUniqueIdentifier;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2A23
     */
    public SystemId(@NonNull byte[] values) {
        mManufacturerIdentifier = BLEUtils.createUInt40(values, 0);
        mOrganizationallyUniqueIdentifier = BLEUtils.createUInt24(values, 5);
    }

    /**
     * @return Manufacturer Identifier
     */
    public long getManufacturerIdentifier() {
        return mManufacturerIdentifier;
    }

    /**
     * @return Organizationally Unique Identifier
     */
    public int getOrganizationallyUniqueIdentifier() {
        return mOrganizationallyUniqueIdentifier;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[8];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mManufacturerIdentifier);
        byteBuffer.put((byte) (mManufacturerIdentifier >> 8));
        byteBuffer.put((byte) (mManufacturerIdentifier >> 16));
        byteBuffer.put((byte) (mManufacturerIdentifier >> 24));
        byteBuffer.put((byte) (mManufacturerIdentifier >> 32));
        byteBuffer.put((byte) mOrganizationallyUniqueIdentifier);
        byteBuffer.put((byte) (mOrganizationallyUniqueIdentifier >> 8));
        byteBuffer.put((byte) (mOrganizationallyUniqueIdentifier >> 16));
        return data;
    }

}
