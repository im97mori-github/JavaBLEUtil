package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.CLASSOF_DEVICE_DATA_TYPE;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.constants.AppearanceValues;
import org.im97mori.ble.constants.MajorDeviceClass;
import org.im97mori.ble.constants.MajorServiceClasses;
import org.im97mori.ble.constants.MinorDeviceClass;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings("unused")
public class ClassOfDeviceTest extends TestBase {

	//@formatter:off
    private static final byte[] data_00001;
    static {
		int classOfDevice = MajorServiceClasses.INFORMATION_MAJOR_SERVICE_CLASSES 
		| MajorDeviceClass.COMPUTER_MAJOR_DEVICE_CLASS 
		| MinorDeviceClass.COMPUTER_DESKTOP_WORKSTATION_MINOR_DEVICE_CLASS;
        byte[] data = new byte[5];
        data[0] = 4;
        data[1] = CLASSOF_DEVICE_DATA_TYPE;
        data[2] = (byte) classOfDevice;
        data[3] = (byte) (classOfDevice >> 8);
		data[4] = (byte) (classOfDevice >> 16);
        data_00001 = data;
    }
    //@formatter:on

	@Test
	public void test_constructor_1_00001() {
		byte[] data = getData();

		ClassOfDevice result1 = new ClassOfDevice(data, 0, data[0]);
		assertEquals(4, result1.getLength());
		assertEquals(CLASSOF_DEVICE_DATA_TYPE, result1.getDataType());
		long classOfDevice = (data[2] & 0xff) | ((data[3] & 0xff) << 8) | ((data[4] & 0xff) << 16);
		assertEquals(MajorServiceClasses.INFORMATION_MAJOR_SERVICE_CLASSES,
				result1.getMajorServiceClasses());
		assertEquals("Information (WEB-server, WAP-server, ...)",
				result1.getMajorServiceClassesName());
		assertEquals(
				MajorDeviceClass.COMPUTER_MAJOR_DEVICE_CLASS,
				result1.getMajorDeviceClass());
		assertEquals("Computer (desktop, notebook, PDA, organizer, ...)",
				result1.getMajorDeviceClassName());
		assertEquals(ClassOfDevice.CLASS_OF_DEVICE_MINOR_DEVICE_CLASS_MASK &
				MinorDeviceClass.COMPUTER_DESKTOP_WORKSTATION_MINOR_DEVICE_CLASS,
				result1.getMinorDeviceClass());
		assertEquals("Desktop workstation",
				result1.getMinorDeviceClassName());
	}

	@Test
	public void test_constructor_2_00001() {
		byte[] data = getData();

		ClassOfDevice result1 = new ClassOfDevice(data, 0);
		assertEquals(4, result1.getLength());
		assertEquals(CLASSOF_DEVICE_DATA_TYPE, result1.getDataType());
		long classOfDevice = (data[2] & 0xff) | ((data[3] & 0xff) << 8) | ((data[4] & 0xff) << 16);
		assertEquals(MajorServiceClasses.INFORMATION_MAJOR_SERVICE_CLASSES,
				result1.getMajorServiceClasses());
		assertEquals("Information (WEB-server, WAP-server, ...)",
				result1.getMajorServiceClassesName());
		assertEquals(
				MajorDeviceClass.COMPUTER_MAJOR_DEVICE_CLASS,
				result1.getMajorDeviceClass());
		assertEquals("Computer (desktop, notebook, PDA, organizer, ...)",
				result1.getMajorDeviceClassName());
		assertEquals(ClassOfDevice.CLASS_OF_DEVICE_MINOR_DEVICE_CLASS_MASK &
				MinorDeviceClass.COMPUTER_DESKTOP_WORKSTATION_MINOR_DEVICE_CLASS,
				result1.getMinorDeviceClass());
		assertEquals("Desktop workstation",
				result1.getMinorDeviceClassName());
	}

	@Test
	public void test_constructor_3_00001() {
		byte[] data = getData();

		ClassOfDevice result1 = new ClassOfDevice(BLEUtils.createUInt24(data, 2));
		assertEquals(4, result1.getLength());
		assertEquals(CLASSOF_DEVICE_DATA_TYPE, result1.getDataType());
		long classOfDevice = (data[2] & 0xff) | ((data[3] & 0xff) << 8) | ((data[4] & 0xff) << 16);
		assertEquals(MajorServiceClasses.INFORMATION_MAJOR_SERVICE_CLASSES,
				result1.getMajorServiceClasses());
		assertEquals("Information (WEB-server, WAP-server, ...)",
				result1.getMajorServiceClassesName());
		assertEquals(
				MajorDeviceClass.COMPUTER_MAJOR_DEVICE_CLASS,
				result1.getMajorDeviceClass());
		assertEquals("Computer (desktop, notebook, PDA, organizer, ...)",
				result1.getMajorDeviceClassName());
		assertEquals(ClassOfDevice.CLASS_OF_DEVICE_MINOR_DEVICE_CLASS_MASK &
				MinorDeviceClass.COMPUTER_DESKTOP_WORKSTATION_MINOR_DEVICE_CLASS,
				result1.getMinorDeviceClass());
		assertEquals("Desktop workstation",
				result1.getMinorDeviceClassName());
	}

	@Test
	public void test_parcelable_2_00001() {
		byte[] data = getData();

		ClassOfDevice result1 = new ClassOfDevice(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

}
