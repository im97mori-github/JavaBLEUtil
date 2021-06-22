package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.DATA_TYPE_BIG_INFO;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.im97mori.ble.BLEUtils;

import androidx.annotation.NonNull;

/**
 * <p>
 * BIGInfo
 * <p>
 * https://www.bluetooth.com/specifications/assigned-numbers/generic-access-profile/
 * </p>
 */
public class BigInfo extends AbstractAdvertisingData {

    /**
     * BIG_Offset_Units available lower limit
     */
    public static final int BIG_OFFSET_LOWER_LIMIT = 491460;

    /**
     * BIG_Offset_Units : 300ms
     */
    public static final int BIG_OFFSET_UNITS_300MS = 1;

    /**
     * BIG_Offset_Units : 30ms
     */
    public static final int BIG_OFFSET_UNITS_30MS = 0;

    /**
     * PHY : LE 1M PHY
     */
    public static final int LE_1M_PHY = 0;

    /**
     * PHY : LE 2M PHY
     */
    public static final int LE_2M_PHY = 1;

    /**
     * PHY : LE Coded PHY
     */
    public static final int LE_CODED_PHY = 2;

    /**
     * BLUETOOTH CORE SPECIFICATION Version 5.2 |Vol 6, Part B 4.4.6.3 Unit of ISO_Interval (millis)
     */
    public static final double ISO_INTERVAL_UNIT_MILLIS = 1.25d;

    /**
     * BIG_Offset
     */
    private final int mBigOffset;

    /**
     * BIG_Offset_Units
     */
    private final int mBigOffsetUnits;

    /**
     * ISO_Interval
     */
    private final int mIsoInterval;

    /**
     * Num_BIS
     */
    private final int mNumBis;

    /**
     * NSE
     */
    private final int mNse;

    /**
     * Bn
     */
    private final int mBn;

    /**
     * Sub_Interval
     */
    private final int mSubInterval;

    /**
     * PTO
     */
    private final int mPto;

    /**
     * BIS_Spacing
     */
    private final int mBisSpacing;

    /**
     * IRC
     */
    private final int mIrc;

    /**
     * Max_PDU
     */
    private final int mMaxPdu;

    /**
     * RFU
     */
    private final int mRfu;

    /**
     * SeedAccessAddress
     */
    private final long mSeedAccessAddress;

    /**
     * SDU_Interval
     */
    private final int mSduInterval;

    /**
     * Max_SDU
     */
    private final int mMaxSdu;

    /**
     * BaseCRCInit
     */
    private final int mBaseCrcInit;

    /**
     * ChM
     */
    private final long mChm;

    /**
     * PHY
     */
    private final int mPhy;

    /**
     * bisPayloadCount
     */
    private final long mBisPayloadCount;

    /**
     * Framing
     */
    private final int mFraming;

    /**
     * GIV
     */
    private final byte[] mGiv;

    /**
     * GSKD
     */
    private final byte[] mGskd;

    /**
     * Constructor for BIGInfo
     *
     * @param data   byte array from {@link ScanRecord#getBytes()}
     * @param offset data offset
     * @param length 1st octed of Advertising Data
     */
    public BigInfo(@NonNull byte[] data, int offset, int length) {
        super(length);

        int value1 = BLEUtils.createUInt16(data, offset + 2);
        mBigOffset = value1 & 0b0011111111111111;
        mBigOffsetUnits = (value1 & 0b0100000000000000) >>> 14;
        int value2 = BLEUtils.createUInt16(data, offset + 4);
        mIsoInterval = ((value1 & 0b1000000000000000) >>> 15) | ((value2 & 0b0000011111111111) << 1);
        mNumBis = (value2 & 0b1111100000000000) >>> 11;
        mNse = data[offset + 6] & 0b00011111;
        mBn = (data[offset + 6] & 0b11100000) >>> 5;
        value1 = BLEUtils.createUInt24(data, offset + 7);
        mSubInterval = value1 & 0b000011111111111111111111;
        mPto = (value1 & 0b111100000000000000000000) >>> 20;
        value1 = BLEUtils.createUInt24(data, offset + 10);
        mBisSpacing = value1 & 0b000011111111111111111111;
        mIrc = (value1 & 0b111100000000000000000000) >>> 20;
        mMaxPdu = data[offset + 13];
        mRfu = data[offset + 14];
        mSeedAccessAddress = BLEUtils.createUInt32(data, offset + 15);
        value1 = BLEUtils.createUInt24(data, offset + 19);
        mSduInterval = value1 & 0b000011111111111111111111;
        mMaxSdu = (value1 >>> 20) | (data[offset + 22] << 4);
        mBaseCrcInit = BLEUtils.createUInt16(data, offset + 23);
        long value3 = BLEUtils.createUInt40(data, offset + 25);
        mChm = value3 & 0b0001111111111111111111111111111111111111L;
        mPhy = (int) ((value3 & 0b1110000000000000000000000000000000000000L) >>> 37);
        value3 = BLEUtils.createUInt40(data, offset + 30);
        mBisPayloadCount = value3 & 0b0111111111111111111111111111111111111111L;
        mFraming = (int) ((value3 & 0b1000000000000000000000000000000000000000L) >>> 39);
        if (length == 58) {
            mGiv = Arrays.copyOfRange(data, offset + 35, 43);
            mGskd = Arrays.copyOfRange(data, offset + 43, 59);
        } else {
            mGiv = null;
            mGskd = null;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getDataType() {
        return DATA_TYPE_BIG_INFO;
    }

    /**
     * @return BIG_Offset
     */
    public int getBigOffset() {
        return mBigOffset;
    }

    /**
     * @return BIG_Offset(millis)
     */
    public double getBigOffsetMillis() {
        int bigOffset = mBigOffset;
        if (mBigOffsetUnits == BIG_OFFSET_UNITS_300MS) {
            bigOffset *= 300;
        } else if (mBigOffsetUnits == BIG_OFFSET_UNITS_30MS) {
            bigOffset *= 30;
        }
        return bigOffset;
    }

    /**
     * @return BIG_Offset_Units
     */
    public int getBigOffsetUnits() {
        return mBigOffsetUnits;
    }

    /**
     * @return ISO_Interval
     */
    public int getIsoInterval() {
        return mIsoInterval;
    }

    /**
     * @return Num_BIS
     */
    public int getNumBis() {
        return mNumBis;
    }

    /**
     * @return NSE
     */
    public int getNse() {
        return mNse;
    }

    /**
     * @return Bn
     */
    public int getBn() {
        return mBn;
    }

    /**
     * @return Sub_Interval
     */
    public int getSubInterval() {
        return mSubInterval;
    }

    /**
     * @return PTO
     */
    public int getPto() {
        return mPto;
    }

    /**
     * @return BIS_Spacing
     */
    public int getBisSpacing() {
        return mBisSpacing;
    }

    /**
     * @return IRC
     */
    public int getIrc() {
        return mIrc;
    }

    /**
     * @return Max_PDU
     */
    public int getMaxPdu() {
        return mMaxPdu;
    }

    /**
     * @return RFU
     */
    public int getRfu() {
        return mRfu;
    }

    /**
     * @return SeedAccessAddress
     */
    public long getSeedAccessAddress() {
        return mSeedAccessAddress;
    }

    /**
     * @return SDU_Interval
     */
    public int getSduInterval() {
        return mSduInterval;
    }

    /**
     * @return mMaxSdu
     */
    public int getMaxSdu() {
        return mMaxSdu;
    }

    /**
     * @return mBaseCrcInit
     */
    public int getBaseCrcInit() {
        return mBaseCrcInit;
    }

    /**
     * @return ChM
     */
    public long getChm() {
        return mChm;
    }

    /**
     * @return PHY
     */
    public int getPhy() {
        return mPhy;
    }

    /**
     * @return bisPayloadCount
     */
    public long getBisPayloadCount() {
        return mBisPayloadCount;
    }

    /**
     * @return Framing
     */
    public int getFraming() {
        return mFraming;
    }

    /**
     * @return GIV
     */
    public byte[] getGiv() {
        return mGiv;
    }

    /**
     * @return mGskd
     */
    public byte[] getGskd() {
        return mGskd;
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
        byteBuffer.put((byte) mBigOffset);
        byte value = (byte) (mBigOffset >>> 8);
        value |= mBigOffsetUnits << 6;
        value |= mIsoInterval << 7;
        byteBuffer.put((byte) value);
        byteBuffer.put((byte) (mIsoInterval >>> 1));
        value = (byte) (mIsoInterval >>> 9);
        value |= mNumBis << 3;
        byteBuffer.put((byte) value);
        value = (byte) mNse;
        value |= (byte) (mBn << 5);
        byteBuffer.put((byte) value);
        byteBuffer.put((byte) mSubInterval);
        byteBuffer.put((byte) (mSubInterval >>> 8));
        value = (byte) (mSubInterval >>> 16);
        value |= (byte) (mPto << 4);
        byteBuffer.put((byte) value);
        byteBuffer.put((byte) mBisSpacing);
        byteBuffer.put((byte) (mBisSpacing >> 8));
        value = (byte) (mBisSpacing >>> 16);
        value |= (byte) (mIrc << 4);
        byteBuffer.put((byte) value);
        byteBuffer.put((byte) mMaxPdu);
        byteBuffer.put((byte) mRfu);
        byteBuffer.putInt((int) mSeedAccessAddress);
        byteBuffer.put((byte) mSduInterval);
        byteBuffer.put((byte) (mSduInterval >>> 8));
        value = (byte) (mSduInterval >>> 16);
        value |= (byte) (mMaxSdu << 4);
        byteBuffer.put((byte) value);
        byteBuffer.put((byte) (mMaxSdu >>> 4));
        byteBuffer.put((byte) mBaseCrcInit);
        byteBuffer.put((byte) (mBaseCrcInit >>> 8));
        byteBuffer.put((byte) mChm);
        byteBuffer.put((byte) (mChm >>> 8));
        byteBuffer.put((byte) (mChm >>> 16));
        byteBuffer.put((byte) (mChm >>> 24));
        value = (byte) (mChm >>> 32);
        value |= (byte) (mPhy << 5);
        byteBuffer.put((byte) value);
        byteBuffer.put((byte) mBisPayloadCount);
        byteBuffer.put((byte) (mBisPayloadCount >>> 8));
        byteBuffer.put((byte) (mBisPayloadCount >>> 16));
        byteBuffer.put((byte) (mBisPayloadCount >>> 24));
        value = (byte) (mBisPayloadCount >>> 32);
        value |= (byte) (mFraming << 7);
        byteBuffer.put((byte) value);
        if (mGiv != null) {
            byteBuffer.put(mGiv);
        }
        if (mGskd != null) {
            byteBuffer.put(mGskd);
        }
        return data;
    }

}
