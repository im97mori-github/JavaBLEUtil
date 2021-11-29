package org.im97mori.ble.characteristic.u2b43;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Physical Activity Monitor Control Point (Characteristics UUID: 0x2B43)
 */
// TODO Physical Activity Monitor Service
public class PhysicalActivityMonitorControlPoint implements ByteArrayInterface {

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public PhysicalActivityMonitorControlPoint(@NonNull byte[] values) {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[0];
        return data;
    }

}
