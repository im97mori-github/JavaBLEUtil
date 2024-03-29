package org.im97mori.ble.characteristic.u2a50;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * PnP ID (Characteristics UUID: 0x2A50)
 */
public class PnpId implements ByteArrayInterface {

    /**
     * 1: Bluetooth SIG assigned Company Identifier value from the Assigned Numbers document
     */
    public static final int VENDOR_ID_SURCE_BLUETOOTH_SIG = 1;

    /**
     * 2: USB Implementer’s Forum assigned Vendor ID value
     */
    public static final int VENDOR_ID_SURCE_USB = 2;

    /**
     * Vendor ID Source
     */
    private final int mVendorIdSource;

    /**
     * Vendor ID
     */
    private final int mVendorId;

    /**
     * Product ID
     */
    private final int mProductId;

    /**
     * Product Version
     */
    private final int mProductVersion;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattCharacteristic#getValue()">BluetoothGattCharacteristic#getValue()</a>
     */
    public PnpId(@NonNull byte[] values) {
        mVendorIdSource = (values[0] & 0xff);
        mVendorId = BLEUtils.createUInt16(values, 1);
        mProductId = BLEUtils.createUInt16(values, 3);
        mProductVersion = BLEUtils.createUInt16(values, 5);
    }

    /**
     * Constructor from parameters
     * 
     * @param vendorIdSource Vendor ID Source
     * @param vendorId       Vendor ID
     * @param productId      Product ID
     * @param productVersion Product Version
     */
    public PnpId(int vendorIdSource, int vendorId, int productId, int productVersion) {
        mVendorIdSource = vendorIdSource;
        mVendorId = vendorId;
        mProductId = productId;
        mProductVersion = productVersion;
    }

    /**
     * @return Vendor ID Source
     */
    public int getVendorIdSource() {
        return mVendorIdSource;
    }

    /**
     * @return {@code true}:Bluetooth SIG assigned Company Identifier value from the Assigned Numbers document
     */
    public boolean isVendorIsSourceBluetoothSig() {
        return VENDOR_ID_SURCE_BLUETOOTH_SIG == mVendorIdSource;
    }

    /**
     * @return {@code true}:USB Implementer’s Forum assigned Vendor ID value
     */
    public boolean isVendorIsSourceBluetoothUsb() {
        return VENDOR_ID_SURCE_USB == mVendorIdSource;
    }

    /**
     * @return Vendor ID
     */
    public int getVendorId() {
        return mVendorId;
    }

    /**
     * @return Product ID
     */
    public int getProductId() {
        return mProductId;
    }

    /**
     * @return Product Version
     */
    public int getProductVersion() {
        return mProductVersion;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @NonNull
    public byte[] getBytes() {
        byte[] data = new byte[7];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put((byte) mVendorIdSource);
        byteBuffer.putShort((short) mVendorId);
        byteBuffer.putShort((short) mProductId);
        byteBuffer.putShort((short) mProductVersion);
        return data;
    }

}
