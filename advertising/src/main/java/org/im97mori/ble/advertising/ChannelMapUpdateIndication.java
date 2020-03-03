package org.im97mori.ble.advertising;

import static org.im97mori.ble.advertising.AdvertisingDataConstants.PHYSICAL_CHANNEL_INDICES_MAP;
import static org.im97mori.ble.advertising.AdvertisingDataConstants.AdvertisingDataTypes.DATA_TYPE_CHANNEL_MAP_UPDATE_INDICATION;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
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
