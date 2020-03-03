package org.im97mori.ble.advertising;

import static org.im97mori.ble.advertising.AdvertisingDataConstants.AdvertisingDataTypes.DATA_TYPE_FLAGS;
import static org.im97mori.ble.advertising.AdvertisingDataConstants.FlagsDataType.FLAG_BR_EDR_NOT_SUPPORTED;
import static org.im97mori.ble.advertising.AdvertisingDataConstants.FlagsDataType.FLAG_LE_GENERAL_DISCOVERABLE_MODE;
import static org.im97mori.ble.advertising.AdvertisingDataConstants.FlagsDataType.FLAG_LE_LIMITED_DISCOVERABLE_MODE;
import static org.im97mori.ble.advertising.AdvertisingDataConstants.FlagsDataType.FLAG_SIMULTANEOUS_LE_AND_BR_EDR_TO_SAME_DEVICE_CAPABLE_CONTROLLER;
import static org.im97mori.ble.advertising.AdvertisingDataConstants.FlagsDataType.FLAG_SIMULTANEOUS_LE_AND_BR_EDR_TO_SAME_DEVICE_CAPABLE_HOST;

import java.util.AbstractMap.SimpleImmutableEntry;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.im97mori.ble.advertising.AdvertisingDataConstants.FlagsDataType;

import androidx.annotation.NonNull;

/**
 * <p>
 * Flags
 * <p>
 * https://www.bluetooth.com/specifications/assigned-numbers/generic-access-profile/
 * </p>
 */
public class Flags extends AbstractAdvertisingData {

    /**
     * Flags list
     */
    private final List<Integer> mFlagsList;

    /**
     * Constructor for Flags
     *
     * @param data   byte array from {@link ScanRecord#getBytes()}
     * @param offset data offset
     * @param length 1st octed of Advertising Data
     */
    public Flags(@NonNull byte[] data, int offset, int length) {
        super(length);

        List<Integer> flagsList = new ArrayList<>();
        for (int i = offset + 2; i < offset + length + 1; i++) {
            flagsList.add(data[i] & 0xff);
        }
        mFlagsList = Collections.synchronizedList(Collections.unmodifiableList(flagsList));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getDataType() {
        return DATA_TYPE_FLAGS;
    }

    /**
     * @return Flags list
     */
    @NonNull
    public List<Integer> getFlagsList() {
        return mFlagsList;
    }

    /**
     * check LE Limited Discoverable Mode
     *
     * @return {@code true}:LE Limited Discoverable Mode bit is 1, {@code false}:bit is 0;
     */
    public boolean isLeLimitedDiscoverableMode() {
        return check(FLAG_LE_LIMITED_DISCOVERABLE_MODE);
    }

    /**
     * check LE General Discoverable Mode
     *
     * @return {@code true}:LE General Discoverable Mode bit is 1, {@code false}:bit is 0;
     */
    public boolean isLeGeneralDiscoverableMode() {
        return check(FLAG_LE_GENERAL_DISCOVERABLE_MODE);
    }

    /**
     * check LE BR/EDR Not Supported
     *
     * @return {@code true}:BR/EDR Not Supported bit is 1, {@code false}:bit is 0;
     */
    public boolean isBrEdrNotSupported() {
        return check(FLAG_BR_EDR_NOT_SUPPORTED);
    }

    /**
     * check Simultaneous LE and BR/EDR to Same Device Capable (Controller)
     *
     * @return {@code true}:Simultaneous LE and BR/EDR to Same Device Capable (Controller) bit is 1, {@code false}:bit is 0;
     */
    public boolean isSimultaneousController() {
        return check(FLAG_SIMULTANEOUS_LE_AND_BR_EDR_TO_SAME_DEVICE_CAPABLE_CONTROLLER);
    }

    /**
     * check Simultaneous LE and BR/EDR to Same Device Capable (Host)
     *
     * @return {@code true}:Simultaneous LE and BR/EDR to Same Device Capable (Host) bit is 1, {@code false}:bit is 0;
     */
    public boolean isSimultaneousHost() {
        return check(FLAG_SIMULTANEOUS_LE_AND_BR_EDR_TO_SAME_DEVICE_CAPABLE_HOST);
    }

    /**
     * {@inheritDoc}
     */
    @NonNull
    @Override
    public byte[] getBytes() {
        byte[] data = new byte[1 + getLength()];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) getLength());
        byteBuffer.put((byte) getDataType());
        for (int flags : mFlagsList) {
            byteBuffer.put((byte) flags);
        }
        return data;
    }

    /**
     * check flag
     *
     * @param target one of {@link FlagsDataType}
     * @return {@code true}:target bit is 1, {@code false}:target bit is 0
     */
    private boolean check(@NonNull SimpleImmutableEntry<Integer, Integer> target) {
        boolean result;
        int index = target.getKey();
        if (mFlagsList.size() > index) {
            result = (mFlagsList.get(index) & target.getValue()) != 0;
        } else {
            result = false;
        }
        return result;
    }
}
