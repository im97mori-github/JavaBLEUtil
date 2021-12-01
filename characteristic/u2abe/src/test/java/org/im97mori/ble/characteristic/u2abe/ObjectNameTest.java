package org.im97mori.ble.characteristic.u2abe;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings("unused")
public class ObjectNameTest extends TestBase {

	//@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = "0".getBytes();
        data_00001 = data;
    }

    private static final byte[] data_00002;
    static {
        byte[] data = "012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789".getBytes();
        data_00002 = data;
    }

    private static final byte[] data_00003;
    static {
        byte[] data = "0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890".getBytes();
        data_00003 = data;
    }
    //@formatter:on

	@Test
	public void test_constructor_00001() {
		byte[] data = getData();

		ObjectName result1 = new ObjectName(data);
		assertEquals("0", result1.getObjectName());
	}

	@Test
	public void test_constructor_00002() {
		byte[] data = getData();

		ObjectName result1 = new ObjectName(data);
		assertEquals(
				"012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789",
				result1.getObjectName());
	}

	@Test
	public void test_constructor_00003() {
		byte[] data = getData();

		ObjectName result1 = new ObjectName(data);
		assertEquals(
				"012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789",
				result1.getObjectName());
	}

	@Test
	public void test_constructor_00101() {
		String objectName = "0";

		ObjectName result1 = new ObjectName(objectName);
		assertEquals(objectName, result1.getObjectName());
	}

	@Test
	public void test_constructor_00102() {
		String objectName = "012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789";

		ObjectName result1 = new ObjectName(objectName);
		assertEquals(objectName, result1.getObjectName());
	}

	@Test
	public void test_constructor_00103() {
		String objectName = "0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890";

		ObjectName result1 = new ObjectName(objectName);
		assertEquals(
				"012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789",
				result1.getObjectName());
	}

	@Test
	public void test_parcelable_2_00001() {
		byte[] data = getData();

		ObjectName result1 = new ObjectName(data);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00002() {
		byte[] data = getData();

		ObjectName result1 = new ObjectName(data);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00003() {
		byte[] data = getData();

		ObjectName result1 = new ObjectName(data);
		assertArrayEquals(Arrays.copyOfRange(data, 0, ObjectName.MAX_OCTETS), result1.getBytes());
	}

}
