package org.im97mori.ble.advertising;

import static org.im97mori.ble.constants.DataType.TX_POWER_LEVEL_DATA_TYPE;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings("unused")
public class TxPowerLevelTest extends TestBase {

	//@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[3];
        data[0] = 2;
        data[1] = TX_POWER_LEVEL_DATA_TYPE;
        data[2] = -127;
        data_00001 = data;
    }

    private static final byte[] data_00002;
    static {
        byte[] data = new byte[3];
        data[0] = 2;
        data[1] = TX_POWER_LEVEL_DATA_TYPE;
        data[2] = 127;
        data_00002 = data;
    }
    //@formatter:on


	@Test
	public void test_constructor_1_00001() {
		byte[] data = getData();

		TxPowerLevel result1 = new TxPowerLevel(data, 0, data[0]);
		assertEquals(2, result1.getLength());
		assertEquals(TX_POWER_LEVEL_DATA_TYPE, result1.getDataType());
		assertEquals(-127, result1.getTxPowerLevel());
	}

	@Test
	public void test_constructor_1_00002() {
		byte[] data = getData();

		TxPowerLevel result1 = new TxPowerLevel(data, 0, data[0]);
		assertEquals(2, result1.getLength());
		assertEquals(TX_POWER_LEVEL_DATA_TYPE, result1.getDataType());
		assertEquals(127, result1.getTxPowerLevel());
	}

	@Test
	public void test_constructor_2_00001() {
		byte[] data = getData();

		TxPowerLevel result1 = new TxPowerLevel(data, 0);
		assertEquals(2, result1.getLength());
		assertEquals(TX_POWER_LEVEL_DATA_TYPE, result1.getDataType());
		assertEquals(-127, result1.getTxPowerLevel());
	}

	@Test
	public void test_constructor_2_00002() {
		byte[] data = getData();

		TxPowerLevel result1 = new TxPowerLevel(data, 0);
		assertEquals(2, result1.getLength());
		assertEquals(TX_POWER_LEVEL_DATA_TYPE, result1.getDataType());
		assertEquals(127, result1.getTxPowerLevel());
	}

	@Test
	public void test_constructor_3_00001() {
		byte[] data = getData();

		TxPowerLevel result1 = new TxPowerLevel(data[2]);
		assertEquals(2, result1.getLength());
		assertEquals(TX_POWER_LEVEL_DATA_TYPE, result1.getDataType());
		assertEquals(-127, result1.getTxPowerLevel());
	}

	@Test
	public void test_constructor_3_00002() {
		byte[] data = getData();

		TxPowerLevel result1 = new TxPowerLevel(data[2]);
		assertEquals(2, result1.getLength());
		assertEquals(TX_POWER_LEVEL_DATA_TYPE, result1.getDataType());
		assertEquals(127, result1.getTxPowerLevel());
	}

	@Test
	public void test_parcelable_2_00001() {
		byte[] data = getData();

		TxPowerLevel result1 = new TxPowerLevel(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00002() {
		byte[] data = getData();

		TxPowerLevel result1 = new TxPowerLevel(data, 0, data[0]);
		assertArrayEquals(data, result1.getBytes());
	}

}
