package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.DATA_TYPE_CHANNEL_MAP_UPDATE_INDICATION;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import androidx.annotation.NonNull;

/**
 * <p>
 * Channel Map Update Indication
 * <p>
 * https://www.bluetooth.com/specifications/assigned-numbers/generic-access-profile/
 * </p>
 */
public class ChannelMapUpdateIndication extends AbstractAdvertisingData {

    /**
     * <p>
     * Physical channel indices
     * <p>
     * Core Specification v5.3 Vol 6 Part B 1.4.1
     * <p>
     * key:PHY Channel, value:Channel Index
     * </p>
     */
    public static final Map<Integer, Integer> PHYSICAL_CHANNEL_INDICES_MAP;

    static {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 37);
        map.put(1, 0);
        map.put(2, 1);
        map.put(3, 2);
        map.put(4, 3);
        map.put(5, 4);
        map.put(6, 5);
        map.put(7, 6);
        map.put(8, 7);
        map.put(9, 8);
        map.put(10, 9);
        map.put(11, 10);
        map.put(12, 38);
        map.put(13, 11);
        map.put(14, 12);
        map.put(15, 13);
        map.put(16, 14);
        map.put(17, 15);
        map.put(18, 16);
        map.put(19, 17);
        map.put(20, 18);
        map.put(21, 19);
        map.put(22, 20);
        map.put(23, 21);
        map.put(24, 22);
        map.put(25, 23);
        map.put(26, 24);
        map.put(27, 25);
        map.put(28, 26);
        map.put(29, 27);
        map.put(30, 28);
        map.put(31, 29);
        map.put(32, 30);
        map.put(33, 31);
        map.put(34, 32);
        map.put(35, 33);
        map.put(36, 34);
        map.put(37, 35);
        map.put(38, 36);
        map.put(39, 39);

        PHYSICAL_CHANNEL_INDICES_MAP = Collections.synchronizedMap(Collections.unmodifiableMap(map));
    }
    
    /**
     * ChM list
     */
    private final List<Integer> mChmList;

    /**
     * unused PHY Channel list
     */
    private final List<Integer> mUnusedChannelList;

    /**
     * unused RF Center Frequency(MHz)
     */
    private final List<Integer> mUnusedChannelListRfCenterFrequencyList;

    /**
     * Instant
     */
    private final int mInstant;

    /**
     * Constructor for Channel Map Update Indication
     *
     * @param data   byte array from {@link ScanRecord#getBytes()}
     * @param offset data offset
     * @param length 1st octed of Advertising Data
     */
    public ChannelMapUpdateIndication(@NonNull byte[] data, int offset, int length) {
        super(length);

        List<Integer> chmList = new ArrayList<>();
        chmList.add(data[offset + 2] & 0xff);
        chmList.add(data[offset + 3] & 0xff);
        chmList.add(data[offset + 4] & 0xff);
        chmList.add(data[offset + 5] & 0xff);
        chmList.add(data[offset + 6] & 0xff);
        mChmList = Collections.synchronizedList(Collections.unmodifiableList(chmList));

        // create index
        List<Integer> channelList = new ArrayList<>();
        List<Integer> frequencyList = new ArrayList<>();
        int phyChannel, channelIndex, listIndex, bitmask;
        for (Map.Entry<Integer, Integer> entry : PHYSICAL_CHANNEL_INDICES_MAP.entrySet()) {
            phyChannel = entry.getKey();
            channelIndex = entry.getValue();
            listIndex = channelIndex / 8;
            bitmask = 1 << (channelIndex % 8);
            if ((mChmList.get(listIndex) & bitmask) == 0) {
                channelList.add(phyChannel);
                frequencyList.add(2400 + (phyChannel + 1) * 2);
            }
        }
        Collections.sort(channelList);
        Collections.sort(frequencyList);
        mUnusedChannelList = Collections.synchronizedList(Collections.unmodifiableList(channelList));
        mUnusedChannelListRfCenterFrequencyList = Collections.synchronizedList(Collections.unmodifiableList(frequencyList));

        int instant = data[offset + 7] & 0xff;
        instant |= (data[offset + 8] & 0xff) << 8;
        mInstant = instant;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getDataType() {
        return DATA_TYPE_CHANNEL_MAP_UPDATE_INDICATION;
    }

    /**
     * @return ChM list
     */
    @NonNull
    public List<Integer> getChmList() {
        return mChmList;
    }

    /**
     * @return unused PHY Channel list
     */
    @NonNull
    public List<Integer> getUnusedPhyChannelList() {
        return mUnusedChannelList;
    }

    /**
     * @return unused RF Center Frequency(MHz)
     */
    @NonNull
    public List<Integer> getUnusedPhyChannelRfCenterFrequencyList() {
        return mUnusedChannelListRfCenterFrequencyList;
    }

    /**
     * @return Instant
     */
    public int getInstant() {
        return mInstant;
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
        for (int chm : mChmList) {
            byteBuffer.put((byte) chm);
        }
        byteBuffer.put((byte) mInstant);
        byteBuffer.put((byte) (mInstant >> 8));
        return data;
    }

}
