package org.im97mori.ble.characteristic.u2bc3;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.characteristic.core.IEEE_11073_20601_SFLOAT;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class MuteTest extends TestBase {

	//@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[1];
        data[ 0] = Mute.NOT_MUTED;
        data_00001 = data;
    }

    private static final byte[] data_00002;
    static {
        byte[] data = new byte[1];
        data[ 0] = Mute.MUTED;
        data_00002 = data;
    }

    private static final byte[] data_00003;
    static {
        byte[] data = new byte[1];
        data[ 0] = Mute.DISABLED;
        data_00003 = data;
    }
    //@formatter:on

	@Test
	public void test_constructor_00001() {
		byte[] data = getData();

		Mute result1 = new Mute(data);
		assertEquals(BLEUtils.createUInt8(data, 0), result1.getMute());
		assertTrue(result1.isNotMuted());
		assertFalse(result1.isMuted());
		assertFalse(result1.isDisabled());
	}

	@Test
	public void test_constructor_00002() {
		byte[] data = getData();

		Mute result1 = new Mute(data);
		assertEquals(BLEUtils.createUInt8(data, 0), result1.getMute());
		assertFalse(result1.isNotMuted());
		assertTrue(result1.isMuted());
		assertFalse(result1.isDisabled());
	}

	@Test
	public void test_constructor_00003() {
		byte[] data = getData();

		Mute result1 = new Mute(data);
		assertEquals(BLEUtils.createUInt8(data, 0), result1.getMute());
		assertFalse(result1.isNotMuted());
		assertFalse(result1.isMuted());
		assertTrue(result1.isDisabled());
	}

	@Test
	public void test_constructor_00101() {
		int mute = Mute.NOT_MUTED;

		Mute result1 = new Mute(mute);
		assertEquals(mute, result1.getMute());
		assertTrue(result1.isNotMuted());
		assertFalse(result1.isMuted());
		assertFalse(result1.isDisabled());
	}

	@Test
	public void test_constructor_00102() {
		int mute = Mute.MUTED;

		Mute result1 = new Mute(mute);
		assertEquals(mute, result1.getMute());
		assertFalse(result1.isNotMuted());
		assertTrue(result1.isMuted());
		assertFalse(result1.isDisabled());
	}

	@Test
	public void test_constructor_00103() {
		int mute = Mute.DISABLED;

		Mute result1 = new Mute(mute);
		assertEquals(mute, result1.getMute());
		assertFalse(result1.isNotMuted());
		assertFalse(result1.isMuted());
		assertTrue(result1.isDisabled());
	}

	@Test
	public void test_parcelable_2_00001() {
		byte[] data = getData();

		Mute result1 = new Mute(data);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00002() {
		byte[] data = getData();

		Mute result1 = new Mute(data);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00003() {
		byte[] data = getData();

		Mute result1 = new Mute(data);
		assertArrayEquals(data, result1.getBytes());
	}

}
