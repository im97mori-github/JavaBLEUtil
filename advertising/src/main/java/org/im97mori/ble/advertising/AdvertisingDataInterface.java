package org.im97mori.ble.advertising;

import org.im97mori.ble.ByteArrayInterface;

/**
 * Advertising Data(Extended Inquiry Response Data) interface
 */
public interface AdvertisingDataInterface extends ByteArrayInterface {

    /**
     * data length
     */
    public int getLength();

    /**
     * <p>
     * Advertising Data(Extended Inquiry Response Data) Type
     * <p>
     * https://www.bluetooth.com/specifications/assigned-numbers/generic-access-profile/
     * </p>
     */
    public int getDataType();

}
