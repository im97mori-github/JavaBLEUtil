package org.im97mori.ble.descriptor.u2906;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.ByteArrayInterface;

import androidx.annotation.NonNull;

/**
 * Valid Range (Descriptor UUID: 0x2906)
 */
public class ValidRange implements ByteArrayInterface {

    /**
     * Lower inclusive value
     */
    private final byte[] mLowerInclusiveValue;

    /**
     * Upper inclusive value
     */
    private final byte[] mUpperInclusiveValue;

    /**
     * Constructor from byte array
     *
     * @param values byte array from <a href="https://developer.android.com/reference/android/bluetooth/BluetoothGattDescriptor#getValue()">BluetoothGattDescriptor#getValue()</a>
     */
    public ValidRange(@NonNull byte[] values) {
        mLowerInclusiveValue = Arrays.copyOfRange(values, 0, values.length / 2);
        mUpperInclusiveValue = Arrays.copyOfRange(values, values.length / 2, values.length);
    }

    /**
     * Constructor from parameters
     * 
     * @param lowerInclusiveValue Lower inclusive value
     * @param upperInclusiveValue Upper inclusive value
     */
    public ValidRange(@NonNull byte[] lowerInclusiveValue, @NonNull byte[] upperInclusiveValue) {
        mLowerInclusiveValue = lowerInclusiveValue;
        mUpperInclusiveValue = upperInclusiveValue;
    }

    /**
     * @return Lower inclusive value
     */
    @NonNull
    public byte[] getLowerInclusiveValue() {
        return mLowerInclusiveValue;
    }

    /**
     * <p>
     * Gust Factor (Characteristic UUID: 0x2A74) UV Index (Characteristic UUID: 0x2A76) Barometric Pressure Trend (Characteristic UUID: 0x2AA3)
     * </p>
     *
     * @return Lower inclusive value(UINT8)
     */
    public int getLowerInclusiveValueUint8() {
        return BLEUtils.createUInt8(mLowerInclusiveValue, 0);
    }

    /**
     * <p>
     * Analog (Characteristic UUID: 0x2A58) Apparent Wind Direction (Characteristic UUID: 0x2A73) Apparent Wind Speed (Characteristic UUID: 0x2A72) Humidity (Characteristic UUID: 0x2A6F) Irradiance (Characteristic UUID: 0x2A77) Rainfall (Characteristic UUID: 0x2A78) True Wind Direction (Characteristic UUID: 0x2A71) True Wind Speed (Characteristic UUID: 0x2A70) Magnetic Declination (Characteristic UUID: 0x2A2C)
     * </p>
     *
     * @return Lower inclusive value(UINT16)
     */
    public int getLowerInclusiveValueUint16() {
        return BLEUtils.createUInt16(mLowerInclusiveValue, 0);
    }

    /**
     * <p>
     * Pollen Concentration (Characteristic UUID: 0x2A75)
     * </p>
     *
     * @return Lower inclusive value(UINT24)
     */
    public int getLowerInclusiveValueUint24() {
        return BLEUtils.createUInt24(mLowerInclusiveValue, 0);
    }

    /**
     * <p>
     * Pressure (Characteristic UUID: 0x2A6D)
     * </p>
     *
     * @return Lower inclusive value(UINT32)
     */
    public long getLowerInclusiveValueUint32() {
        return BLEUtils.createUInt32(mLowerInclusiveValue, 0);
    }

    /**
     * <p>
     * Dew Point (Characteristic UUID: 0x2A7B) Heat Index (Characteristic UUID: 0x2A7A) Wind Chill (Characteristic UUID: 0x2A79)
     * </p>
     *
     * @return Lower inclusive value(SINT8)
     */
    public int getLowerInclusiveValueSint8() {
        return BLEUtils.createSInt8(mLowerInclusiveValue, 0);
    }

    /**
     * <p>
     * Temperature (Characteristic UUID: 0x2A6E) Magnetic Flux Density - 2D (Characteristic UUID: 0x2AA0) Magnetic Flux Density - 3D (Characteristic UUID: 0x2AA1)
     * </p>
     *
     * @return Lower inclusive value(SINT16)
     */
    public int getLowerInclusiveValueSint16() {
        return BLEUtils.createSInt16(mLowerInclusiveValue, 0);
    }

    /**
     * <p>
     * Elevation (Characteristic UUID: 0x2A6C)
     * </p>
     *
     * @return Lower inclusive value(SINT24)
     */
    public int getLowerInclusiveValueSint24() {
        return BLEUtils.createSInt24(mLowerInclusiveValue, 0);
    }

    /**
     * @return Upper inclusive value
     */
    @NonNull
    public byte[] getUpperInclusiveValue() {
        return mUpperInclusiveValue;
    }

    /**
     * <p>
     * Gust Factor (Characteristic UUID: 0x2A74) UV Index (Characteristic UUID: 0x2A76) Barometric Pressure Trend (Characteristic UUID: 0x2AA3)
     * </p>
     *
     * @return Upper inclusive value(UINT8)
     */
    public int getUpperInclusiveValueUint8() {
        return BLEUtils.createUInt8(mUpperInclusiveValue, 0);
    }

    /**
     * <p>
     * Analog (Characteristic UUID: 0x2A58) Apparent Wind Direction (Characteristic UUID: 0x2A73) Apparent Wind Speed (Characteristic UUID: 0x2A72) Humidity (Characteristic UUID: 0x2A6F) Irradiance (Characteristic UUID: 0x2A77) Rainfall (Characteristic UUID: 0x2A78) True Wind Direction (Characteristic UUID: 0x2A71) True Wind Speed (Characteristic UUID: 0x2A70) Magnetic Declination (Characteristic UUID: 0x2A2C)
     * </p>
     *
     * @return Upper inclusive value(UINT16)
     */
    public int getUpperInclusiveValueUint16() {
        return BLEUtils.createUInt16(mUpperInclusiveValue, 0);
    }

    /**
     * <p>
     * Pollen Concentration (Characteristic UUID: 0x2A75)
     * </p>
     *
     * @return Upper inclusive value(UINT24)
     */
    public int getUpperInclusiveValueUint24() {
        return BLEUtils.createUInt24(mUpperInclusiveValue, 0);
    }

    /**
     * <p>
     * Pressure (Characteristic UUID: 0x2A6D)
     * </p>
     *
     * @return Upper inclusive value(UINT32)
     */
    public long getUpperInclusiveValueUint32() {
        return BLEUtils.createUInt32(mUpperInclusiveValue, 0);
    }

    /**
     * <p>
     * Dew Point (Characteristic UUID: 0x2A7B) Heat Index (Characteristic UUID: 0x2A7A) Wind Chill (Characteristic UUID: 0x2A79)
     * </p>
     *
     * @return Upper inclusive value(SINT8)
     */
    public int getUpperInclusiveValueSint8() {
        return BLEUtils.createSInt8(mUpperInclusiveValue, 0);
    }

    /**
     * <p>
     * Temperature (Characteristic UUID: 0x2A6E) Magnetic Flux Density - 2D (Characteristic UUID: 0x2AA0) Magnetic Flux Density - 3D (Characteristic UUID: 0x2AA1)
     * </p>
     *
     * @return Upper inclusive value(SINT16)
     */
    public int getUpperInclusiveValueSint16() {
        return BLEUtils.createSInt16(mUpperInclusiveValue, 0);
    }

    /**
     * <p>
     * Elevation (Characteristic UUID: 0x2A6C)
     * </p>
     *
     * @return Upper inclusive value(SINT24)
     */
    public int getUpperInclusiveValueSint24() {
        return BLEUtils.createSInt24(mUpperInclusiveValue, 0);
    }

    /**
     * {@inheritDoc}
     */
    @NonNull
    @Override
    public byte[] getBytes() {
        byte[] data = new byte[mLowerInclusiveValue.length + mUpperInclusiveValue.length];
        ByteBuffer byteBuffer = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.put(mLowerInclusiveValue);
        byteBuffer.put(mUpperInclusiveValue);
        return data;
    }

}
