package org.im97mori.ble.characteristic.u2b4a;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.im97mori.ble.BLEUtils;
import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class HandednessTest extends TestBase {

	//@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = new byte[1];
        data[ 0] = Handedness.HANDEDNESS_LEFT_HANDED;
        data_00001 = data;
    }

    private static final byte[] data_00002;
    static {
        byte[] data = new byte[1];
        data[ 0] = Handedness.HANDEDNESS_RIGHT_HANDED;
        data_00002 = data;
    }

    private static final byte[] data_00003;
    static {
        byte[] data = new byte[1];
        data[ 0] = Handedness.HANDEDNESS_AMBIDEXTROUS;
        data_00003 = data;
    }

    private static final byte[] data_00004;
    static {
        byte[] data = new byte[1];
        data[ 0] = Handedness.HANDEDNESS_UNSPECIFIED;
        data_00004 = data;
    }
    //@formatter:on

	@Test
	public void test_constructor_00001() {
		byte[] data = getData();

		Handedness result1 = new Handedness(data);
		assertEquals(Handedness.HANDEDNESS_LEFT_HANDED, result1.getHandedness());
		assertTrue(result1.isHandednessLeftHanded());
		assertFalse(result1.isHandednessRightHanded());
		assertFalse(result1.isHandednessAmbidextrous());
		assertFalse(result1.isHandednessUnspecified());
	}

	@Test
	public void test_constructor_00002() {
		byte[] data = getData();

		Handedness result1 = new Handedness(data);
		assertEquals(Handedness.HANDEDNESS_RIGHT_HANDED, result1.getHandedness());
		assertFalse(result1.isHandednessLeftHanded());
		assertTrue(result1.isHandednessRightHanded());
		assertFalse(result1.isHandednessAmbidextrous());
		assertFalse(result1.isHandednessUnspecified());
	}

	@Test
	public void test_constructor_00003() {
		byte[] data = getData();

		Handedness result1 = new Handedness(data);
		assertEquals(Handedness.HANDEDNESS_AMBIDEXTROUS, result1.getHandedness());
		assertFalse(result1.isHandednessLeftHanded());
		assertFalse(result1.isHandednessRightHanded());
		assertTrue(result1.isHandednessAmbidextrous());
		assertFalse(result1.isHandednessUnspecified());
	}

	@Test
	public void test_constructor_00004() {
		byte[] data = getData();

		Handedness result1 = new Handedness(data);
		assertEquals(Handedness.HANDEDNESS_UNSPECIFIED, result1.getHandedness());
		assertFalse(result1.isHandednessLeftHanded());
		assertFalse(result1.isHandednessRightHanded());
		assertFalse(result1.isHandednessAmbidextrous());
		assertTrue(result1.isHandednessUnspecified());
	}

	@Test
	public void test_constructor_00101() {
		int strideLength = Handedness.HANDEDNESS_LEFT_HANDED;

		Handedness result1 = new Handedness(strideLength);
		assertEquals(Handedness.HANDEDNESS_LEFT_HANDED, result1.getHandedness());
		assertTrue(result1.isHandednessLeftHanded());
		assertFalse(result1.isHandednessRightHanded());
		assertFalse(result1.isHandednessAmbidextrous());
		assertFalse(result1.isHandednessUnspecified());
	}

	@Test
	public void test_constructor_00102() {
		int strideLength = Handedness.HANDEDNESS_RIGHT_HANDED;

		Handedness result1 = new Handedness(strideLength);
		assertEquals(Handedness.HANDEDNESS_RIGHT_HANDED, result1.getHandedness());
		assertFalse(result1.isHandednessLeftHanded());
		assertTrue(result1.isHandednessRightHanded());
		assertFalse(result1.isHandednessAmbidextrous());
		assertFalse(result1.isHandednessUnspecified());
	}

	@Test
	public void test_constructor_00103() {
		int strideLength = Handedness.HANDEDNESS_AMBIDEXTROUS;

		Handedness result1 = new Handedness(strideLength);
		assertEquals(Handedness.HANDEDNESS_AMBIDEXTROUS, result1.getHandedness());
		assertFalse(result1.isHandednessLeftHanded());
		assertFalse(result1.isHandednessRightHanded());
		assertTrue(result1.isHandednessAmbidextrous());
		assertFalse(result1.isHandednessUnspecified());
	}

	@Test
	public void test_constructor_00104() {
		int strideLength = Handedness.HANDEDNESS_UNSPECIFIED;

		Handedness result1 = new Handedness(strideLength);
		assertEquals(Handedness.HANDEDNESS_UNSPECIFIED, result1.getHandedness());
		assertFalse(result1.isHandednessLeftHanded());
		assertFalse(result1.isHandednessRightHanded());
		assertFalse(result1.isHandednessAmbidextrous());
		assertTrue(result1.isHandednessUnspecified());
	}

	@Test
	public void test_parcelable_2_00001() {
		byte[] data = getData();

		Handedness result1 = new Handedness(data);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00002() {
		byte[] data = getData();

		Handedness result1 = new Handedness(data);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00003() {
		byte[] data = getData();

		Handedness result1 = new Handedness(data);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00004() {
		byte[] data = getData();

		Handedness result1 = new Handedness(data);
		assertArrayEquals(data, result1.getBytes());
	}

}
