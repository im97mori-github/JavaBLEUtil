package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.FLAGS_DATA_TYPE;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
     * LE Limited Discoverable Mode
     */
    public static final SimpleImmutableEntry<Integer, Integer> FLAG_LE_LIMITED_DISCOVERABLE_MODE = new SimpleImmutableEntry<>(0, 0b00000001);

    /**
     * LE General Discoverable Mode
     */
    public static final SimpleImmutableEntry<Integer, Integer> FLAG_LE_GENERAL_DISCOVERABLE_MODE = new SimpleImmutableEntry<>(0, 0b00000010);

    /**
     * BR/EDR Not Supported
     */
    public static final SimpleImmutableEntry<Integer, Integer> FLAG_BR_EDR_NOT_SUPPORTED = new SimpleImmutableEntry<>(0, 0b00000100);

    /**
     * Simultaneous LE and BR/EDR to Same Device Capable (Controller)
     */
    public static final SimpleImmutableEntry<Integer, Integer> FLAG_SIMULTANEOUS_LE_AND_BR_EDR_TO_SAME_DEVICE_CAPABLE_CONTROLLER = new SimpleImmutableEntry<>(0, 0b00001000);

    /**
     * Previously Used
     */
    public static final SimpleImmutableEntry<Integer, Integer> FLAG_PREVIOUSLY_USED = new SimpleImmutableEntry<>(0, 0b00010000);

    /**
     * Flags list
     */
    private final List<Integer> mFlagsList;

    /**
     * Constructor for Flags
     *
     * @param data   byte array from <a href="https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
     * @param offset data offset
     * @param length 1st octet of Advertising Data
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
        return FLAGS_DATA_TYPE;
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
    @Deprecated
    public boolean isSimultaneousHost() {
        return check(FLAG_PREVIOUSLY_USED);
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
