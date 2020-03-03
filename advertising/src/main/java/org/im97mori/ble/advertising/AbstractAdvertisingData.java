package org.im97mori.ble.advertising;

/**
 * Advertising Data(Extended Inquiry Response Data)
 */
public abstract class AbstractAdvertisingData implements AdvertisingDataInterface {

    /**
     * <p>
     * data length
     * <p>
     * 1st octed of Advertising Data(Extended Inquiry Response Data)
     * </p>
     */
    protected final int mLength;

    /**
     * Constructor
     *
     * @param length data length
     */
    protected AbstractAdvertisingData(int length) {
        mLength = length;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getLength() {
        return mLength;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public abstract int getDataType();

}
