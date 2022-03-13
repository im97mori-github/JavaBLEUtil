package org.im97mori.ble.characteristic.u2b3a;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Server Supported Features (Characteristics UUID: 0x2B3A)
 */
public class ServerSupportedFeatures implements ByteArrayInterface {

    /**
     * Enhanced ATT bearer supported
     */
    public static final SimpleImmutableEntry<Integer, Integer> FLAG_EATT_SUPPORTED = new SimpleImmutableEntry<>(0,
            0b00000001);

    /**
     * Server Supported Features List
     */
    private final List<Integer> mServerSupportedFeaturesList;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href=
     *               "https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public ServerSupportedFeatures(@NonNull byte[] values) {
        List<Integer> serverSupportedFeaturesList = new ArrayList<>();
        for (int i = 0; i < values.length; i++) {
            serverSupportedFeaturesList.add(values[i] & 0xff);
        }
        mServerSupportedFeaturesList = Collections
                .synchronizedList(Collections.unmodifiableList(serverSupportedFeaturesList));
    }

    /**
     * Constructor from parameters
     * 
     * @param serverSupportedFeaturesList Server Supported Features List
     */
    public ServerSupportedFeatures(@NonNull List<Integer> serverSupportedFeaturesList) {
        mServerSupportedFeaturesList = Collections
                .synchronizedList(Collections.unmodifiableList(serverSupportedFeaturesList));
    }

    /**
     * @return Server Supported Features List
     */
    @NonNull
    public List<Integer> getServerSupportedFeaturesList() {
        return mServerSupportedFeaturesList;
    }

    /**
     * check Enhanced ATT bearer supported
     *
     * @return {@code true}:Enhanced ATT bearer supported bit is 1,
     *         {@code false}:bit is 0;
     */
    public boolean isEattSupported() {
        return check(FLAG_EATT_SUPPORTED);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[mServerSupportedFeaturesList.size()];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        for (Integer features : mServerSupportedFeaturesList) {
            byteBuffer.put(features.byteValue());
        }
        return data;
    }

    /**
     * check flag
     *
     * @param target one of {@link #FLAG_EATT_SUPPORTED}
     * @return {@code true}:target bit is 1, {@code false}:target bit is 0
     */
    private boolean check(@NonNull SimpleImmutableEntry<Integer, Integer> target) {
        boolean result;
        int index = target.getKey();
        if (mServerSupportedFeaturesList.size() > index) {
            result = (mServerSupportedFeaturesList.get(index) & target.getValue()) != 0;
        } else {
            result = false;
        }
        return result;
    }

}
