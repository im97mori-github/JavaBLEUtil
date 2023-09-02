package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.CLASSOF_DEVICE_DATA_TYPE;
import static org.im97mori.ble.constants.MajorServiceClasses.MAJOR_SERVICE_CLASSES_MAPPING;
import static org.im97mori.ble.constants.MajorDeviceClass.MAJOR_DEVICE_CLASS_MAPPING;
import static org.im97mori.ble.constants.MinorDeviceClass.MINOR_DEVICE_CLASS_MAPPING;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import org.im97mori.ble.BLEUtils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * <p>
 * Class of Device
 * <p>
 * https://www.bluetooth.com/specifications/assigned-numbers/generic-access-profile/
 * </p>
 */
public class ClassOfDevice extends AbstractAdvertisingData {

    /**
     * Major Service Classes mask
     */
    public static final int CLASS_OF_DEVICE_MAJOR_SERVICE_CLASSES_MASK = 0b11111111_11100000_00000000;

    /**
     * Major Device Class mask
     */
    public static final int CLASS_OF_DEVICE_MAJOR_DEVICE_CLASS_MASK = 0b00000000_00011111_00000000;

    /**
     * Minor Device Class mask
     */
    public static final int CLASS_OF_DEVICE_MINOR_DEVICE_CLASS_MASK = 0b00000000_00000000_11111100;

    /**
     * Class of Device
     */
    private final int mClassOfDevice;

    /**
     * @param data
     *            byte array from <a href=
     *            "https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
     * @param offset
     *            data offset
     * @see #ClassOfDevice(byte[], int, int)
     */
    public ClassOfDevice(@NonNull byte[] data, int offset) {
        this(data, offset, data[offset]);
    }

    /**
     * Constructor for Class of Device
     *
     * @param data
     *            byte array from <a href=
     *            "https://developer.android.com/reference/android/bluetooth/le/ScanRecord#getBytes()">ScanRecord#getBytes()</a>
     * @param offset
     *            data offset
     * @param length
     *            1st octet of Advertising Data
     */
    public ClassOfDevice(@NonNull byte[] data, int offset, int length) {
        super(length);

        mClassOfDevice = BLEUtils.createUInt24(data, 2);
    }

    /**
     * Constructor from parameters
     * 
     * @param classOfDevice
     *            Class of Device
     */
    public ClassOfDevice(int classOfDevice) {
        super(4);

        mClassOfDevice = classOfDevice;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getDataType() {
        return CLASSOF_DEVICE_DATA_TYPE;
    }

    /**
     * @return Class of Device
     */
    public int getClassOfDevice() {
        return mClassOfDevice;
    }

    /**
     * @return Major Service Classes
     */
    public int getMajorServiceClasses() {
        return CLASS_OF_DEVICE_MAJOR_SERVICE_CLASSES_MASK & mClassOfDevice;
    }

    /**
     * @return Major Service Classes Name
     */
    @Nullable
    public String getMajorServiceClassesName() {
        return MAJOR_SERVICE_CLASSES_MAPPING.get(CLASS_OF_DEVICE_MAJOR_SERVICE_CLASSES_MASK & mClassOfDevice);
    }

    /**
     * @return Major Device Class
     */
    public int getMajorDeviceClass() {
        return CLASS_OF_DEVICE_MAJOR_DEVICE_CLASS_MASK & mClassOfDevice;
    }

    /**
     * @return Major Device Class Name
     */
    @Nullable
    public String getMajorDeviceClassName() {
        return MAJOR_DEVICE_CLASS_MAPPING.get(CLASS_OF_DEVICE_MAJOR_DEVICE_CLASS_MASK & mClassOfDevice);
    }

    /**
     * @return Minor Device Class
     */
    public int getMinorDeviceClass() {
        return CLASS_OF_DEVICE_MINOR_DEVICE_CLASS_MASK & mClassOfDevice;
    }

    /**
     * @return Minor Device Class Name
     */
    @Nullable
    public String getMinorDeviceClassName() {
        return MINOR_DEVICE_CLASS_MAPPING.get(
                (CLASS_OF_DEVICE_MAJOR_DEVICE_CLASS_MASK | CLASS_OF_DEVICE_MINOR_DEVICE_CLASS_MASK) & mClassOfDevice);
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
        byteBuffer.put((byte) mClassOfDevice);
        byteBuffer.put((byte) (mClassOfDevice >> 8));
        byteBuffer.put((byte) (mClassOfDevice >> 16));
        return data;
    }

}
