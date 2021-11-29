package org.im97mori.ble.characteristic.u2b2e;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.im97mori.ble.test.TestBase;
import org.junit.Test;

@SuppressWarnings({ "unused" })
public class EmergencyTextTest extends TestBase {

	//@formatter:off
    private static final byte[] data_00001;
    static {
        byte[] data = "0".getBytes();
        data_00001 = data;
    }

    private static final byte[] data_00002;
    static {
        byte[] data = "01234567890123456789".getBytes();
        data_00002 = data;
    }

    private static final byte[] data_00003;
    static {
        byte[] data = "012345678901234567890".getBytes();
        data_00003 = data;
    }
    //@formatter:on

	@Test
	public void test_constructor_00001() {
		byte[] data = getData();

		EmergencyText result1 = new EmergencyText(data);
		assertEquals("0", result1.getEmergencyText());
	}

	@Test
	public void test_constructor_00002() {
		byte[] data = getData();

		EmergencyText result1 = new EmergencyText(data);
		assertEquals("01234567890123456789", result1.getEmergencyText());
	}

	@Test
	public void test_constructor_00003() {
		byte[] data = getData();

		EmergencyText result1 = new EmergencyText(data);
		assertEquals("01234567890123456789", result1.getEmergencyText());
	}

	@Test
	public void test_parcelable_2_00001() {
		byte[] data = getData();

		EmergencyText result1 = new EmergencyText(data);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00002() {
		byte[] data = getData();

		EmergencyText result1 = new EmergencyText(data);
		assertArrayEquals(data, result1.getBytes());
	}

	@Test
	public void test_parcelable_2_00003() {
		byte[] data = getData();

		EmergencyText result1 = new EmergencyText(data);
		assertArrayEquals(Arrays.copyOfRange(data, 0, 20), result1.getBytes());
	}

}
