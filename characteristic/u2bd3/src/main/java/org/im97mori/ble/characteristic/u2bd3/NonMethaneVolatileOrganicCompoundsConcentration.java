package org.im97mori.ble.characteristic.u2bd3;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Non-Methane Volatile Organic Compounds Concentration (Characteristics UUID: 0x2BD3)
 */
//TODO GATT Specification Supplement v5 3.149
public class NonMethaneVolatileOrganicCompoundsConcentration implements ByteArrayInterface {

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public NonMethaneVolatileOrganicCompoundsConcentration(@NonNull byte[] values) {
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
