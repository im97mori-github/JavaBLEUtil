package org.im97mori.ble.characteristic.u2ab5;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Location Name (Characteristics UUID: 0x2AB5)
 */
public class LocationName implements ByteArrayInterface {

    /**
     * Location Name
     */
    private final String mLocationName;

    /**
     * Constructor from {@link BluetoothGattCharacteristic}
     *
     * @param bluetoothGattCharacteristic Characteristics UUID: 0x2AB5
     */
    public LocationName(@NonNull byte[] values) {
        mLocationName = new String(values);
    }

    /**
     * @return Location Name
     */
    public String getLocationName() {
        return mLocationName;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[mLocationName.getBytes().length];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put(mLocationName.getBytes());
        return data;
    }

}
