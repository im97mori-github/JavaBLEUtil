package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.LE_BLUETOOTH_DEVICE_ADDRESS_DATA_TYPE;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings("unused")
public class LeBluetoothDeviceAddressTest extends TestBase {

	//@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[9];
        data[0] = 8;
        data[1] = LE_BLUETOOTH_DEVICE_ADDRESS_DATA_TYPE;
        data[2] = 0x01;
		data[3] = 0x02;
		data[4] = 0x03;
		data[5] = 0x04;
		data[6] = 0x05;
		data[7] = 0x06;
		data[8] = 0b00000000;
        data_00001 = data;
    }

    private static final byte[] data_00002;
    static {
        byte[] data = new byte[9];
        data[0] = 8;
        data[1] = LE_BLUETOOTH_DEVICE_ADDRESS_DATA_TYPE;
        data[2] = 0x01;
		data[3] = 0x02;
		data[4] = 0x03;
		data[5] = 0x04;
		data[6] = 0x05;
		data[7] = 0x06;
		data[8] = 0b00000001;
        data_00002 = data;
    }
    //@formatter:on

	@Test
	public void test_constructor_1_00001() {
		byte[] data = getData();

		LeBluetoothDeviceAddress result1 = new LeBluetoothDeviceAddress(data, 0, data[0]);
		assertEquals(8, result1.getLength());
		assertEquals(LE_BLUETOOTH_DEVICE_ADDRESS_DATA_TYPE, result1.getDataType());
		assertArrayEquals(Arrays.copyOfRange(data, 2, 8), result1.getLeBluetoothDeviceAddress());
		assertFalse(result1.isRandomAddress());
	}

	@Test
	public void test_constructor_1_00002() {
		byte[] data = getData();

		LeBluetoothDeviceAddress result1 = new LeBluetoothDeviceAddress(data, 0, data[0]);
		assertEquals(8, result1.getLength());
		assertEquals(LE_BLUETOOTH_DEVICE_ADDRESS_DATA_TYPE, result1.getDataType());
		assertArrayEquals(Arrays.copyOfRange(data, 2, 8), result1.getLeBluetoothDeviceAddress());
		assertTrue(result1.isRandomAddress());
	}

	@Test
	public void test_constructor_2_00001() {
		byte[] data = getData();

		LeBluetoothDeviceAddress result1 = new LeBluetoothDeviceAddress(data, 0);
		assertEquals(8, result1.getLength());
		assertEquals(LE_BLUETOOTH_DEVICE_ADDRESS_DATA_TYPE, result1.getDataType());
		assertArrayEquals(Arrays.copyOfRange(data, 2, 8), result1.getLeBluetoothDeviceAddress());
		assertFalse(result1.isRandomAddress());
	}

	@Test
	public void test_constructor_2_00002() {
		byte[] data = getData();

		LeBluetoothDeviceAddress result1 = new LeBluetoothDeviceAddress(data, 0);
		assertEquals(8, result1.getLength());
		assertEquals(LE_BLUETOOTH_DEVICE_ADDRESS_DATA_TYPE, result1.getDataType());
		assertArrayEquals(Arrays.copyOfRange(data, 2, 8), result1.getLeBluetoothDeviceAddress());
		assertTrue(result1.isRandomAddress());
	}

	@Test
	public void test_constructor_3_00001() {
		byte[] data = getData();

		LeBluetoothDeviceAddress result1 = new LeBluetoothDeviceAddress(Arrays.copyOfRange(data, 2, 8), data[8] != 0);
		assertEquals(8, result1.getLength());
		assertEquals(LE_BLUETOOTH_DEVICE_ADDRESS_DATA_TYPE, result1.getDataType());
		assertArrayEquals(Arrays.copyOfRange(data, 2, 8), result1.getLeBluetoothDeviceAddress());
		assertFalse(result1.isRandomAddress());
	}

	@Test
	public void test_constructor_3_00002() {
		byte[] data = getData();

		LeBluetoothDeviceAddress result1 = new LeBluetoothDeviceAddress(Arrays.copyOfRange(data, 2, 8), data[8] != 0);
		assertEquals(8, result1.getLength());
		assertEquals(LE_BLUETOOTH_DEVICE_ADDRESS_DATA_TYPE, result1.getDataType());
		assertArrayEquals(Arrays.copyOfRange(data, 2, 8), result1.getLeBluetoothDeviceAddress());
		assertTrue(result1.isRandomAddress());
	}

	@Test
	public void test_parcelable_2_00001() {
		byte[] data = getData();

		LeBluetoothDeviceAddress result1 = new LeBluetoothDeviceAddress(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00002() {
		byte[] data = getData();

		LeBluetoothDeviceAddress result1 = new LeBluetoothDeviceAddress(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}
}