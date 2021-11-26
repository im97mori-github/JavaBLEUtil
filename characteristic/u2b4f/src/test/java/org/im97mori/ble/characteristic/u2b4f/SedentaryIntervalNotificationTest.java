package org.im97mori.ble.characteristic.u2b4f;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class SedentaryIntervalNotificationTest extends TestBase {

	//@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[2];
        data[ 0] = 0x01;
        data[ 1] = 0x02;
        data_00001 = data;
    }

    private static final byte[] data_00002;
    static {
        byte[] data = new byte[2];
        data[ 0] = 0x00;
        data[ 1] = 0x00;
        data_00002 = data;
    }
    //@formatter:on

	@Test
	public void test_constructor_00001() {
		byte[] data = getData();

		SedentaryIntervalNotification result1 = new SedentaryIntervalNotification(data);
		assertEquals(BLEUtils.createUInt16(data, 0), result1.getSedentaryIntervalNotification());
		assertFalse(result1.isSedentaryIntervalNotification());
	}

	@Test
	public void test_constructor_00002() {
		byte[] data = getData();

		SedentaryIntervalNotification result1 = new SedentaryIntervalNotification(data);
		assertEquals(BLEUtils.createUInt16(data, 0), result1.getSedentaryIntervalNotification());
		assertTrue(result1.isSedentaryIntervalNotification());
	}

	@Test
	public void test_constructor_00101() {
		int sedentaryIntervalNotification = 1;

		SedentaryIntervalNotification result1 = new SedentaryIntervalNotification(sedentaryIntervalNotification);
		assertEquals(sedentaryIntervalNotification, result1.getSedentaryIntervalNotification());
		assertFalse(result1.isSedentaryIntervalNotification());
	}

	@Test
	public void test_constructor_00102() {
		int sedentaryIntervalNotification = 0;

		SedentaryIntervalNotification result1 = new SedentaryIntervalNotification(sedentaryIntervalNotification);
		assertEquals(sedentaryIntervalNotification, result1.getSedentaryIntervalNotification());
		assertTrue(result1.isSedentaryIntervalNotification());
	}

	@Test
	public void test_parcelable_2_00001() {
		byte[] data = getData();

		SedentaryIntervalNotification result1 = new SedentaryIntervalNotification(data);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00002() {
		byte[] data = getData();

		SedentaryIntervalNotification result1 = new SedentaryIntervalNotification(data);
		assertArrayEquals(data, result1.getBytes());
	}

}
