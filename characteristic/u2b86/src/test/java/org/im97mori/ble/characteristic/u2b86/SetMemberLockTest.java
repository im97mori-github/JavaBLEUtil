package org.im97mori.ble.characteristic.u2b86;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.characteristic.core.IEEE_11073_20601_SFLOAT;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class SetMemberLockTest extends TestBase {

	//@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[1];
        data[ 0] = SetMemberLock.UNLOCKED;
        data_00001 = data;
    }

    private static final byte[] data_00002;
    static {
        byte[] data = new byte[1];
        data[ 0] = SetMemberLock.LOCKED;
        data_00002 = data;
    }
    //@formatter:on

	@Test
	public void test_constructor_00001() {
		byte[] data = getData();

		SetMemberLock result1 = new SetMemberLock(data);
		assertEquals(BLEUtils.createUInt8(data, 0), result1.getSetMemberLock());
		assertTrue(result1.isSetMemberLockUnlocked());
		assertFalse(result1.isSetMemberLockLocked());
	}

	@Test
	public void test_constructor_00002() {
		byte[] data = getData();

		SetMemberLock result1 = new SetMemberLock(data);
		assertEquals(BLEUtils.createUInt8(data, 0), result1.getSetMemberLock());
		assertFalse(result1.isSetMemberLockUnlocked());
		assertTrue(result1.isSetMemberLockLocked());
	}

	@Test
	public void test_constructor_00101() {
		int setMemberLock = SetMemberLock.UNLOCKED;

		SetMemberLock result1 = new SetMemberLock(setMemberLock);
		assertEquals(setMemberLock, result1.getSetMemberLock());
		assertTrue(result1.isSetMemberLockUnlocked());
		assertFalse(result1.isSetMemberLockLocked());
	}

	@Test
	public void test_constructor_00102() {
		int setMemberLock = SetMemberLock.LOCKED;

		SetMemberLock result1 = new SetMemberLock(setMemberLock);
		assertEquals(setMemberLock, result1.getSetMemberLock());
		assertFalse(result1.isSetMemberLockUnlocked());
		assertTrue(result1.isSetMemberLockLocked());
	}

	@Test
	public void test_parcelable_2_00001() {
		byte[] data = getData();

		SetMemberLock result1 = new SetMemberLock(data);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00002() {
		byte[] data = getData();

		SetMemberLock result1 = new SetMemberLock(data);
		assertArrayEquals(data, result1.getBytes());
	}

}
