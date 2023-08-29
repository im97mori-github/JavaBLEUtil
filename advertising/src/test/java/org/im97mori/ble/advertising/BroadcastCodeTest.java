package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.BROADCAST_CODE_DATA_TYPE;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.constants.CompanyUUID;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings("unused")
public class BroadcastCodeTest extends TestBase {

	//@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[6];
        data[0] = 5;
        data[1] = (byte) BROADCAST_CODE_DATA_TYPE;
        data[2] = 0x00;
        data[3] = 0x00;
		data[4] = 0x00;
		data[5] = 0x00;
        data_00001 = data;
    }

    private static final byte[] data_00002;
    static {
        byte[] data = new byte[6];
        data[0] = 5;
        data[1] = (byte) BROADCAST_CODE_DATA_TYPE;
        data[2] = 0x3f;
        data[3] = 0x42;
		data[4] = 0x0f;
		data[5] = 0x00;
        data_00002 = data;
    }

    private static final byte[] data_00003;
    static {
        byte[] data = new byte[18];
        data[0] = 17;
        data[1] = (byte) BROADCAST_CODE_DATA_TYPE;
        data[2] = 0x00;
        data[3] = 0x01;
		data[4] = 0x02;
		data[5] = 0x03;
		data[6] = 0x04;
		data[7] = 0x05;
		data[8] = 0x06;
		data[9] = 0x07;
		data[10] = 0x08;
		data[11] = 0x09;
		data[12] = 0x0a;
		data[13] = 0x0b;
		data[14] = 0x0c;
		data[15] = 0x0d;
		data[16] = 0x0e;
		data[17] = 0x10;
        data_00003 = data;
    }
    //@formatter:on

	@Test
	public void test_constructor_1_00001() {
		byte[] data = getData();

		BroadcastCode result1 = new BroadcastCode(data, 0, data[0]);
		assertEquals(5, result1.getLength());
		assertEquals(BROADCAST_CODE_DATA_TYPE, result1.getDataType());
		assertArrayEquals(Arrays.copyOfRange(data, 2, 6), result1.getBroadcastCode());
	}

	@Test
	public void test_constructor_1_00002() {
		byte[] data = getData();

		BroadcastCode result1 = new BroadcastCode(data, 0, data[0]);
		assertEquals(5, result1.getLength());
		assertEquals(BROADCAST_CODE_DATA_TYPE, result1.getDataType());
		assertArrayEquals(Arrays.copyOfRange(data, 2, 6), result1.getBroadcastCode());
	}

	@Test
	public void test_constructor_1_00003() {
		byte[] data = getData();

		BroadcastCode result1 = new BroadcastCode(data, 0, data[0]);
		assertEquals(17, result1.getLength());
		assertEquals(BROADCAST_CODE_DATA_TYPE, result1.getDataType());
		assertArrayEquals(Arrays.copyOfRange(data, 2, 18), result1.getBroadcastCode());
	}

	@Test
	public void test_constructor_2_00001() {
		byte[] data = getData();

		BroadcastCode result1 = new BroadcastCode(data, 0);
		assertEquals(5, result1.getLength());
		assertEquals(BROADCAST_CODE_DATA_TYPE, result1.getDataType());
		assertArrayEquals(Arrays.copyOfRange(data, 2, 6), result1.getBroadcastCode());
	}

	@Test
	public void test_constructor_2_00002() {
		byte[] data = getData();

		BroadcastCode result1 = new BroadcastCode(data, 0);
		assertEquals(5, result1.getLength());
		assertEquals(BROADCAST_CODE_DATA_TYPE, result1.getDataType());
		assertArrayEquals(Arrays.copyOfRange(data, 2, 6), result1.getBroadcastCode());
	}

	@Test
	public void test_constructor_2_00003() {
		byte[] data = getData();

		BroadcastCode result1 = new BroadcastCode(data, 0);
		assertEquals(17, result1.getLength());
		assertEquals(BROADCAST_CODE_DATA_TYPE, result1.getDataType());
		assertArrayEquals(Arrays.copyOfRange(data, 2, 18), result1.getBroadcastCode());
	}

	@Test
	public void test_constructor_3_00001() {
		byte[] data = getData();

		byte[] broadcastCode = Arrays.copyOfRange(data, 2, 6);
		BroadcastCode result1 = new BroadcastCode(broadcastCode);
		assertEquals(5, result1.getLength());
		assertEquals(BROADCAST_CODE_DATA_TYPE, result1.getDataType());
		assertArrayEquals(broadcastCode, result1.getBroadcastCode());
	}

	@Test
	public void test_constructor_3_00002() {
		byte[] data = getData();

		byte[] broadcastCode = Arrays.copyOfRange(data, 2, 6);
		BroadcastCode result1 = new BroadcastCode(broadcastCode);
		assertEquals(5, result1.getLength());
		assertEquals(BROADCAST_CODE_DATA_TYPE, result1.getDataType());
		assertArrayEquals(broadcastCode, result1.getBroadcastCode());
	}

	@Test
	public void test_constructor_3_00003() {
		byte[] data = getData();

		byte[] broadcastCode = Arrays.copyOfRange(data, 2, 18);
		BroadcastCode result1 = new BroadcastCode(broadcastCode);
		assertEquals(17, result1.getLength());
		assertEquals(BROADCAST_CODE_DATA_TYPE, result1.getDataType());
		assertArrayEquals(broadcastCode, result1.getBroadcastCode());
	}

	@Test
	public void test_parcelable_2_00001() {
		byte[] data = getData();

		BroadcastCode result1 = new BroadcastCode(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00002() {
		byte[] data = getData();

		BroadcastCode result1 = new BroadcastCode(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00003() {
		byte[] data = getData();

		BroadcastCode result1 = new BroadcastCode(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}
}
